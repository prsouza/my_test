package o6;

import java.io.IOException;
import java.io.InputStream;

public final class v extends u {

    /* renamed from: a  reason: collision with root package name */
    public final u f9346a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9347b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9348c;

    public v(u uVar, long j10, long j11) {
        this.f9346a = uVar;
        long e10 = e(j10);
        this.f9347b = e10;
        this.f9348c = e(e10 + j11);
    }

    public final long a() {
        return this.f9348c - this.f9347b;
    }

    public final InputStream c(long j10, long j11) throws IOException {
        long e10 = e(this.f9347b);
        return this.f9346a.c(e10, e(j11 + e10) - e10);
    }

    public final void close() throws IOException {
    }

    public final long e(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return j10 > this.f9346a.a() ? this.f9346a.a() : j10;
    }
}
