package pf;

import a.a;
import b9.m;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import jf.c;
import pf.d;
import uf.e;
import uf.g;

public final class r implements Closeable {

    /* renamed from: v  reason: collision with root package name */
    public static final Logger f10037v = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final e f10038a;

    /* renamed from: b  reason: collision with root package name */
    public int f10039b = 16384;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10040c;

    /* renamed from: s  reason: collision with root package name */
    public final d.b f10041s;

    /* renamed from: t  reason: collision with root package name */
    public final g f10042t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f10043u;

    public r(g gVar, boolean z) {
        this.f10042t = gVar;
        this.f10043u = z;
        e eVar = new e();
        this.f10038a = eVar;
        this.f10041s = new d.b(eVar);
    }

    public final void B(int i, long j10) throws IOException {
        while (j10 > 0) {
            long min = Math.min((long) this.f10039b, j10);
            j10 -= min;
            e(i, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f10042t.H(this.f10038a, min);
        }
    }

    public final synchronized void a(u uVar) throws IOException {
        e6.e.D(uVar, "peerSettings");
        if (!this.f10040c) {
            int i = this.f10039b;
            int i10 = uVar.f10052a;
            if ((i10 & 32) != 0) {
                i = uVar.f10053b[5];
            }
            this.f10039b = i;
            int i11 = i10 & 2;
            int i12 = -1;
            if ((i11 != 0 ? uVar.f10053b[1] : -1) != -1) {
                d.b bVar = this.f10041s;
                if (i11 != 0) {
                    i12 = uVar.f10053b[1];
                }
                Objects.requireNonNull(bVar);
                int min = Math.min(i12, 16384);
                int i13 = bVar.f9941c;
                if (i13 != min) {
                    if (min < i13) {
                        bVar.f9939a = Math.min(bVar.f9939a, min);
                    }
                    bVar.f9940b = true;
                    bVar.f9941c = min;
                    int i14 = bVar.g;
                    if (min < i14) {
                        if (min == 0) {
                            bVar.a();
                        } else {
                            bVar.b(i14 - min);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.f10042t.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void c(boolean z, int i, e eVar, int i10) throws IOException {
        if (!this.f10040c) {
            e(i, i10, 0, z ? 1 : 0);
            if (i10 > 0) {
                g gVar = this.f10042t;
                e6.e.B(eVar);
                gVar.H(eVar, (long) i10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() throws IOException {
        this.f10040c = true;
        this.f10042t.close();
    }

    public final void e(int i, int i10, int i11, int i12) throws IOException {
        Logger logger = f10037v;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f9950e.b(false, i, i10, i11, i12));
        }
        boolean z = true;
        if (i10 <= this.f10039b) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                g gVar = this.f10042t;
                byte[] bArr = c.f7250a;
                e6.e.D(gVar, "$this$writeMedium");
                gVar.K((i10 >>> 16) & 255);
                gVar.K((i10 >>> 8) & 255);
                gVar.K(i10 & 255);
                this.f10042t.K(i11 & 255);
                this.f10042t.K(i12 & 255);
                this.f10042t.A(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException(m.b("reserved bit set: ", i).toString());
        }
        StringBuilder d10 = a.d("FRAME_SIZE_ERROR length > ");
        d10.append(this.f10039b);
        d10.append(": ");
        d10.append(i10);
        throw new IllegalArgumentException(d10.toString().toString());
    }

    public final synchronized void f(int i, b bVar, byte[] bArr) throws IOException {
        e6.e.D(bVar, "errorCode");
        if (!this.f10040c) {
            boolean z = false;
            if (bVar.getHttpCode() != -1) {
                e(0, bArr.length + 8, 7, 0);
                this.f10042t.A(i);
                this.f10042t.A(bVar.getHttpCode());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f10042t.Q(bArr);
                }
                this.f10042t.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.f10040c) {
            this.f10042t.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void s(boolean z, int i, List<c> list) throws IOException {
        if (!this.f10040c) {
            this.f10041s.e(list);
            long j10 = this.f10038a.f11952b;
            long min = Math.min((long) this.f10039b, j10);
            int i10 = (j10 > min ? 1 : (j10 == min ? 0 : -1));
            int i11 = i10 == 0 ? 4 : 0;
            if (z) {
                i11 |= 1;
            }
            e(i, (int) min, 1, i11);
            this.f10042t.H(this.f10038a, min);
            if (i10 > 0) {
                B(i, j10 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void t(boolean z, int i, int i10) throws IOException {
        if (!this.f10040c) {
            e(0, 8, 6, z ? 1 : 0);
            this.f10042t.A(i);
            this.f10042t.A(i10);
            this.f10042t.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void w(int i, b bVar) throws IOException {
        e6.e.D(bVar, "errorCode");
        if (!this.f10040c) {
            if (bVar.getHttpCode() != -1) {
                e(i, 4, 3, 0);
                this.f10042t.A(bVar.getHttpCode());
                this.f10042t.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void y(int i, long j10) throws IOException {
        if (!this.f10040c) {
            if (j10 != 0 && j10 <= 2147483647L) {
                e(i, 4, 8, 0);
                this.f10042t.A((int) j10);
                this.f10042t.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
