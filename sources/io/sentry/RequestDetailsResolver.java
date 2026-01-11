package io.sentry;

import a.b;
import a8.a;
import com.github.mikephil.charting.BuildConfig;
import io.sentry.util.Objects;
import java.net.URI;
import java.util.HashMap;

final class RequestDetailsResolver {
    private static final String SENTRY_AUTH = "X-Sentry-Auth";
    private static final String USER_AGENT = "User-Agent";
    private final SentryOptions options;

    public RequestDetailsResolver(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options is required");
    }

    public RequestDetails resolve() {
        Dsn dsn = new Dsn(this.options.getDsn());
        URI sentryUri = dsn.getSentryUri();
        String uri = sentryUri.resolve(sentryUri.getPath() + "/envelope/").toString();
        String publicKey = dsn.getPublicKey();
        String secretKey = dsn.getSecretKey();
        StringBuilder q10 = b.q("Sentry sentry_version=7,sentry_client=");
        q10.append(this.options.getSentryClientName());
        q10.append(",sentry_key=");
        q10.append(publicKey);
        q10.append((secretKey == null || secretKey.length() <= 0) ? BuildConfig.FLAVOR : a.c(",sentry_secret=", secretKey));
        String sb2 = q10.toString();
        String sentryClientName = this.options.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put(USER_AGENT, sentryClientName);
        hashMap.put(SENTRY_AUTH, sb2);
        return new RequestDetails(uri, hashMap);
    }
}
