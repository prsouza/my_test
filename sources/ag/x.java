package ag;

import a8.a;
import java.io.IOException;
import java.io.InputStream;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f460a;

    /* renamed from: b  reason: collision with root package name */
    public final int f461b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[][] f462c;

    public x(InputStream inputStream) {
        this(inputStream, v1.c(inputStream));
    }

    public x(InputStream inputStream, int i) {
        this.f460a = inputStream;
        this.f461b = i;
        this.f462c = new byte[11][];
    }

    public final d a() throws IOException {
        int read = this.f460a.read();
        if (read == -1) {
            return null;
        }
        InputStream inputStream = this.f460a;
        if (inputStream instanceof r1) {
            r1 r1Var = (r1) inputStream;
            r1Var.f441u = false;
            r1Var.c();
        }
        int t10 = j.t(this.f460a, read);
        boolean z = (read & 32) != 0;
        int f10 = j.f(this.f460a, this.f461b, t10 == 4 || t10 == 16 || t10 == 17 || t10 == 8);
        if (f10 >= 0) {
            p1 p1Var = new p1(this.f460a, f10, this.f461b);
            if ((read & 64) != 0) {
                return new a0(z, t10, p1Var.c());
            }
            if ((read & 128) != 0) {
                return new k0(z, t10, new x(p1Var));
            }
            if (z) {
                if (t10 == 4) {
                    return new e0(new x(p1Var));
                }
                if (t10 == 8) {
                    return new p0(new x(p1Var));
                }
                if (t10 == 16) {
                    return new g0(new x(p1Var), 1);
                }
                if (t10 == 17) {
                    return new i0(new x(p1Var), 1);
                }
                throw new IOException(a.b("unknown tag ", t10, " encountered"));
            } else if (t10 == 4) {
                return new x0(p1Var);
            } else {
                try {
                    return j.c(t10, p1Var, this.f462c);
                } catch (IllegalArgumentException e10) {
                    throw new g("corrupted stream detected", e10);
                }
            }
        } else if (z) {
            x xVar = new x(new r1(this.f460a, this.f461b), this.f461b);
            if ((read & 64) != 0) {
                return new b0(t10, xVar);
            }
            if ((read & 128) != 0) {
                return new k0(true, t10, xVar);
            }
            if (t10 == 4) {
                return new e0(xVar);
            }
            if (t10 == 8) {
                return new p0(xVar);
            }
            if (t10 == 16) {
                return new g0(xVar, 0);
            }
            if (t10 == 17) {
                return new i0(xVar, 0);
            }
            StringBuilder d10 = a.a.d("unknown BER object encountered: 0x");
            d10.append(Integer.toHexString(t10));
            throw new g(d10.toString());
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    public final s b(boolean z, int i) throws IOException {
        if (!z) {
            return new o1(false, i, new w0(((p1) this.f460a).c()));
        }
        e c10 = c();
        if (this.f460a instanceof r1) {
            int i10 = c10.f388b;
            if (i10 == 1) {
                return new j0(true, i, c10.b(0));
            }
            f0 f0Var = c0.f380a;
            return new j0(false, i, i10 < 1 ? c0.f380a : new f0(c10));
        }
        int i11 = c10.f388b;
        if (i11 == 1) {
            return new o1(true, i, c10.b(0));
        }
        m1 m1Var = k1.f417a;
        return new o1(false, i, i11 < 1 ? k1.f417a : new m1(c10));
    }

    public final e c() throws IOException {
        d a10 = a();
        if (a10 == null) {
            return new e(0);
        }
        e eVar = new e();
        do {
            eVar.a(a10 instanceof q1 ? ((q1) a10).e() : a10.d());
            a10 = a();
        } while (a10 != null);
        return eVar;
    }
}
