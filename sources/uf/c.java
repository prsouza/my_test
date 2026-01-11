package uf;

import a.a;
import ah.v;
import e6.e;
import java.io.IOException;

public final class c implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f11943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f11944b;

    public c(b bVar, z zVar) {
        this.f11943a = bVar;
        this.f11944b = zVar;
    }

    public final void H(e eVar, long j10) {
        e.D(eVar, "source");
        v.B(eVar.f11952b, 0, j10);
        while (true) {
            long j11 = 0;
            if (j10 > 0) {
                w wVar = eVar.f11951a;
                e.B(wVar);
                while (true) {
                    if (j11 >= ((long) LZ4Constants.MAX_DISTANCE)) {
                        break;
                    }
                    j11 += (long) (wVar.f11995c - wVar.f11994b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        wVar = wVar.f11998f;
                        e.B(wVar);
                    }
                }
                b bVar = this.f11943a;
                bVar.h();
                try {
                    this.f11944b.H(eVar, j11);
                    if (!bVar.i()) {
                        j10 -= j11;
                    } else {
                        throw bVar.j((IOException) null);
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (bVar.i()) {
                        e = bVar.j(e);
                    }
                    throw e;
                } finally {
                    boolean i = bVar.i();
                }
            } else {
                return;
            }
        }
    }

    public final void close() {
        b bVar = this.f11943a;
        bVar.h();
        try {
            this.f11944b.close();
            if (bVar.i()) {
                throw bVar.j((IOException) null);
            }
        } catch (IOException e10) {
            e = e10;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.i();
        }
    }

    public final c0 d() {
        return this.f11943a;
    }

    public final void flush() {
        b bVar = this.f11943a;
        bVar.h();
        try {
            this.f11944b.flush();
            if (bVar.i()) {
                throw bVar.j((IOException) null);
            }
        } catch (IOException e10) {
            e = e10;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.i();
        }
    }

    public final String toString() {
        StringBuilder d10 = a.d("AsyncTimeout.sink(");
        d10.append(this.f11944b);
        d10.append(')');
        return d10.toString();
    }
}
