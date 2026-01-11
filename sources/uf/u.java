package uf;

import a.a;
import e6.e;
import java.nio.ByteBuffer;

public final class u implements g {

    /* renamed from: a  reason: collision with root package name */
    public final e f11986a = new e();

    /* renamed from: b  reason: collision with root package name */
    public boolean f11987b;

    /* renamed from: c  reason: collision with root package name */
    public final z f11988c;

    public u(z zVar) {
        e.D(zVar, "sink");
        this.f11988c = zVar;
    }

    public final g A(int i) {
        if (!this.f11987b) {
            this.f11986a.B0(i);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void H(e eVar, long j10) {
        e.D(eVar, "source");
        if (!this.f11987b) {
            this.f11986a.H(eVar, j10);
            a();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g K(int i) {
        if (!this.f11987b) {
            this.f11986a.y0(i);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g Q(byte[] bArr) {
        e.D(bArr, "source");
        if (!this.f11987b) {
            this.f11986a.v0(bArr);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g a() {
        if (!this.f11987b) {
            long c10 = this.f11986a.c();
            if (c10 > 0) {
                this.f11988c.H(this.f11986a, c10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final e b() {
        return this.f11986a;
    }

    public final void close() {
        if (!this.f11987b) {
            Throwable th2 = null;
            try {
                e eVar = this.f11986a;
                long j10 = eVar.f11952b;
                if (j10 > 0) {
                    this.f11988c.H(eVar, j10);
                }
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                this.f11988c.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                }
            }
            this.f11987b = true;
            if (th2 != null) {
                throw th2;
            }
        }
    }

    public final c0 d() {
        return this.f11988c.d();
    }

    public final g e0(i iVar) {
        e.D(iVar, "byteString");
        if (!this.f11987b) {
            this.f11986a.p0(iVar);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void flush() {
        if (!this.f11987b) {
            e eVar = this.f11986a;
            long j10 = eVar.f11952b;
            if (j10 > 0) {
                this.f11988c.H(eVar, j10);
            }
            this.f11988c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g g(byte[] bArr, int i, int i10) {
        e.D(bArr, "source");
        if (!this.f11987b) {
            this.f11986a.w0(bArr, i, i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean isOpen() {
        return !this.f11987b;
    }

    public final g j0(String str) {
        e.D(str, "string");
        if (!this.f11987b) {
            this.f11986a.D0(str);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g l0(long j10) {
        if (!this.f11987b) {
            this.f11986a.l0(j10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g n(long j10) {
        if (!this.f11987b) {
            this.f11986a.n(j10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        StringBuilder d10 = a.d("buffer(");
        d10.append(this.f11988c);
        d10.append(')');
        return d10.toString();
    }

    public final g u(int i) {
        if (!this.f11987b) {
            this.f11986a.C0(i);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final int write(ByteBuffer byteBuffer) {
        e.D(byteBuffer, "source");
        if (!this.f11987b) {
            int write = this.f11986a.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
