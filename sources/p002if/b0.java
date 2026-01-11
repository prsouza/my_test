package p002if;

import e6.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import jf.c;
import uf.h;

/* renamed from: if.b0  reason: invalid package */
public abstract class b0 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public a f6473a;

    /* renamed from: if.b0$a */
    public static final class a extends Reader {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6474a;

        /* renamed from: b  reason: collision with root package name */
        public InputStreamReader f6475b;

        /* renamed from: c  reason: collision with root package name */
        public final h f6476c;

        /* renamed from: s  reason: collision with root package name */
        public final Charset f6477s;

        public a(h hVar, Charset charset) {
            e.D(hVar, "source");
            e.D(charset, "charset");
            this.f6476c = hVar;
            this.f6477s = charset;
        }

        public final void close() throws IOException {
            this.f6474a = true;
            InputStreamReader inputStreamReader = this.f6475b;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f6476c.close();
            }
        }

        public final int read(char[] cArr, int i, int i10) throws IOException {
            e.D(cArr, "cbuf");
            if (!this.f6474a) {
                InputStreamReader inputStreamReader = this.f6475b;
                if (inputStreamReader == null) {
                    inputStreamReader = new InputStreamReader(this.f6476c.s0(), c.s(this.f6476c, this.f6477s));
                    this.f6475b = inputStreamReader;
                }
                return inputStreamReader.read(cArr, i, i10);
            }
            throw new IOException("Stream closed");
        }
    }

    public abstract long a();

    public abstract t c();

    public void close() {
        c.d(e());
    }

    public abstract h e();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        ad.c.z(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f() throws java.io.IOException {
        /*
            r3 = this;
            uf.h r0 = r3.e()
            if.t r1 = r3.c()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0013
            java.nio.charset.Charset r2 = fe.a.f5086b     // Catch:{ all -> 0x0022 }
            java.nio.charset.Charset r1 = r1.a(r2)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            java.nio.charset.Charset r1 = fe.a.f5086b     // Catch:{ all -> 0x0022 }
        L_0x0015:
            java.nio.charset.Charset r1 = jf.c.s(r0, r1)     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = r0.r0(r1)     // Catch:{ all -> 0x0022 }
            r2 = 0
            ad.c.z(r0, r2)
            return r1
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            ad.c.z(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p002if.b0.f():java.lang.String");
    }
}
