package w9;

import ad.c;
import c3.k;
import e6.e;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.Objects;
import md.m;
import wi.d;
import xd.p;
import yi.a;
import yi.b;

public final class h extends yd.h implements p<a, byte[], m> {

    /* renamed from: b  reason: collision with root package name */
    public static final h f12619b = new h();

    public h() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        e.D(aVar, "vm");
        e.D((byte[]) obj2, "$noName_1");
        d dVar = d.OP_HTTP_POST;
        b.a(aVar, dVar);
        long d10 = c.d(aVar, dVar);
        String str = new String(e.o(aVar), fe.a.f5086b);
        c.l(aVar, dVar, str);
        ByteBuffer x10 = e.x(aVar);
        if (((long) x10.capacity()) <= d10) {
            try {
                int i = -1;
                URLConnection openConnection = new URL(str).openConnection();
                Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                byte[] bArr = null;
                try {
                    httpURLConnection.setRequestMethod("POST");
                    boolean z = true;
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.connect();
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    byte[] o4 = e.o(aVar);
                    outputStream.write(o4);
                    b.b(aVar, (b.g * ((long) o4.length)) + ((long) 1000));
                    i = httpURLConnection.getResponseCode();
                    if (200 > i || i >= 207) {
                        z = false;
                    }
                    if (z) {
                        System.out.println(e.a0("GOOD ", Integer.valueOf(i)));
                        InputStream inputStream = httpURLConnection.getInputStream();
                        e.C(inputStream, "connection.inputStream");
                        bArr = y.c.Y(inputStream);
                    } else {
                        System.out.println(e.a0("NULL ", Integer.valueOf(i)));
                    }
                } catch (Exception e10) {
                    PrintStream printStream = System.out;
                    e10.printStackTrace();
                    printStream.println(m.f8555a);
                } catch (Throwable th2) {
                    httpURLConnection.disconnect();
                    throw th2;
                }
                httpURLConnection.disconnect();
                int min = Math.min(bArr == null ? 0 : bArr.length, x10.capacity());
                if (bArr == null) {
                    bArr = new byte[0];
                }
                x10.put(bArr, 0, min);
                long j10 = (long) min;
                k.m(aVar, j10);
                k.m(aVar, (long) i);
                long j11 = b.g;
                Long.signum(j11);
                b.b(aVar, (j11 * j10) + ((long) 1000));
                return m.f8555a;
            } catch (MalformedURLException unused) {
                throw new wi.c(wi.a.InvalidOperand, "string operand does not conform to an URL");
            }
        } else {
            wi.a aVar2 = wi.a.InvalidOperand;
            StringBuilder q10 = a.b.q("exceeding maximum permitted buffer for http get  requested=");
            q10.append(x10.capacity());
            q10.append(" max=");
            q10.append(d10);
            throw new wi.c(aVar2, q10.toString());
        }
    }
}
