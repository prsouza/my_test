package uf;

import android.support.v4.media.a;
import e6.e;
import java.io.IOException;
import java.io.InputStream;

public final class o implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f11972a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f11973b;

    public o(InputStream inputStream, c0 c0Var) {
        e.D(inputStream, "input");
        this.f11972a = inputStream;
        this.f11973b = c0Var;
    }

    public final long I(e eVar, long j10) {
        e.D(eVar, "sink");
        int i = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f11973b.f();
                w f02 = eVar.f0(1);
                int read = this.f11972a.read(f02.f11993a, f02.f11995c, (int) Math.min(j10, (long) (8192 - f02.f11995c)));
                if (read != -1) {
                    f02.f11995c += read;
                    long j11 = (long) read;
                    eVar.f11952b += j11;
                    return j11;
                } else if (f02.f11994b != f02.f11995c) {
                    return -1;
                } else {
                    eVar.f11951a = f02.a();
                    x.b(f02);
                    return -1;
                }
            } catch (AssertionError e10) {
                if (p.c(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        } else {
            throw new IllegalArgumentException(a.d("byteCount < 0: ", j10).toString());
        }
    }

    public final void close() {
        this.f11972a.close();
    }

    public final c0 d() {
        return this.f11973b;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("source(");
        d10.append(this.f11972a);
        d10.append(')');
        return d10.toString();
    }
}
