package x2;

import a3.c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f12757a;

    public a(HttpURLConnection httpURLConnection) {
        this.f12757a = httpURLConnection;
    }

    public final String a() {
        boolean z = false;
        try {
            if (this.f12757a.getResponseCode() / 100 == 2) {
                z = true;
            }
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        try {
            return "Unable to fetch " + this.f12757a.getURL() + ". Failed with " + this.f12757a.getResponseCode() + "\n" + c(this.f12757a);
        } catch (IOException e10) {
            c.c("get error failed ", e10);
            return e10.getMessage();
        }
    }

    public final String c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                throw e10;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    public final void close() {
        this.f12757a.disconnect();
    }
}
