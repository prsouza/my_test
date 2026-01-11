package io.sentry.transport;

import a.b;
import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

final class HttpConnection {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final SentryOptions options;
    private final Proxy proxy;
    private final RateLimiter rateLimiter;
    private final RequestDetails requestDetails;

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails2, AuthenticatorWrapper authenticatorWrapper, RateLimiter rateLimiter2) {
        this.requestDetails = requestDetails2;
        this.options = sentryOptions;
        this.rateLimiter = rateLimiter2;
        Proxy resolveProxy = resolveProxy(sentryOptions.getProxy());
        this.proxy = resolveProxy;
        if (resolveProxy != null && sentryOptions.getProxy() != null) {
            String user = sentryOptions.getProxy().getUser();
            String pass = sentryOptions.getProxy().getPass();
            if (user != null && pass != null) {
                authenticatorWrapper.setDefault(new ProxyAuthenticator(user, pass));
            }
        }
    }

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails2, RateLimiter rateLimiter2) {
        this(sentryOptions, requestDetails2, AuthenticatorWrapper.getInstance(), rateLimiter2);
    }

    private void closeAndDisconnect(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
        httpURLConnection.disconnect();
    }

    private HttpURLConnection createConnection() {
        HttpURLConnection open = open();
        for (Map.Entry next : this.requestDetails.getHeaders().entrySet()) {
            open.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        open.setRequestMethod("POST");
        open.setDoOutput(true);
        open.setRequestProperty("Content-Encoding", "gzip");
        open.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        open.setRequestProperty("Accept", "application/json");
        open.setRequestProperty("Connection", "close");
        open.setConnectTimeout(this.options.getConnectionTimeoutMillis());
        open.setReadTimeout(this.options.getReadTimeoutMillis());
        HostnameVerifier hostnameVerifier = this.options.getHostnameVerifier();
        boolean z = open instanceof HttpsURLConnection;
        if (z && hostnameVerifier != null) {
            ((HttpsURLConnection) open).setHostnameVerifier(hostnameVerifier);
        }
        SSLSocketFactory sslSocketFactory = this.options.getSslSocketFactory();
        if (z && sslSocketFactory != null) {
            ((HttpsURLConnection) open).setSSLSocketFactory(sslSocketFactory);
        }
        open.connect();
        return open;
    }

    private String getErrorMessageFromStream(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader;
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(errorStream, UTF_8));
                StringBuilder sb2 = new StringBuilder();
                boolean z = true;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (!z) {
                        sb2.append("\n");
                    }
                    sb2.append(readLine);
                    z = false;
                }
                String sb3 = sb2.toString();
                bufferedReader.close();
                if (errorStream != null) {
                    errorStream.close();
                }
                return sb3;
            } catch (Throwable th2) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th2;
            }
            throw th;
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    private boolean isSuccessfulResponseCode(int i) {
        return i == 200;
    }

    /* JADX INFO: finally extract failed */
    private TransportResult readAndLog(HttpURLConnection httpURLConnection) {
        try {
            int responseCode = httpURLConnection.getResponseCode();
            updateRetryAfterLimits(httpURLConnection, responseCode);
            if (!isSuccessfulResponseCode(responseCode)) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                logger.log(sentryLevel, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.options.isDebug()) {
                    this.options.getLogger().log(sentryLevel, getErrorMessageFromStream(httpURLConnection), new Object[0]);
                }
                TransportResult error = TransportResult.error(responseCode);
                closeAndDisconnect(httpURLConnection);
                return error;
            }
            this.options.getLogger().log(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
            TransportResult success = TransportResult.success();
            closeAndDisconnect(httpURLConnection);
            return success;
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, e10, "Error reading and logging the response stream", new Object[0]);
            closeAndDisconnect(httpURLConnection);
            return TransportResult.error();
        } catch (Throwable th2) {
            closeAndDisconnect(httpURLConnection);
            throw th2;
        }
    }

    private Proxy resolveProxy(SentryOptions.Proxy proxy2) {
        if (proxy2 != null) {
            String port = proxy2.getPort();
            String host = proxy2.getHost();
            if (!(port == null || host == null)) {
                try {
                    return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, Integer.parseInt(port)));
                } catch (NumberFormatException e10) {
                    ILogger logger = this.options.getLogger();
                    SentryLevel sentryLevel = SentryLevel.ERROR;
                    StringBuilder q10 = b.q("Failed to parse Sentry Proxy port: ");
                    q10.append(proxy2.getPort());
                    q10.append(". Proxy is ignored");
                    logger.log(sentryLevel, e10, q10.toString(), new Object[0]);
                }
            }
        }
        return null;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public HttpURLConnection open() {
        return (HttpURLConnection) (this.proxy == null ? this.requestDetails.getUrl().openConnection() : this.requestDetails.getUrl().openConnection(this.proxy));
    }

    public TransportResult send(SentryEnvelope sentryEnvelope) {
        GZIPOutputStream gZIPOutputStream;
        HttpURLConnection createConnection = createConnection();
        try {
            OutputStream outputStream = createConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.options.getSerializer().serialize(sentryEnvelope, (OutputStream) gZIPOutputStream);
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Throwable th2) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                this.options.getLogger().log(SentryLevel.ERROR, th3, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } catch (Throwable th4) {
                readAndLog(createConnection);
                throw th4;
            }
        }
        return readAndLog(createConnection);
        throw th;
    }

    public void updateRetryAfterLimits(HttpURLConnection httpURLConnection, int i) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.rateLimiter.updateRetryAfterLimits(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i);
    }
}
