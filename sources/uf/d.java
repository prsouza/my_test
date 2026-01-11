package uf;

import a.a;
import e6.e;
import java.io.IOException;

public final class d implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f11949a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f11950b;

    public d(b bVar, b0 b0Var) {
        this.f11949a = bVar;
        this.f11950b = b0Var;
    }

    public final long I(e eVar, long j10) {
        e.D(eVar, "sink");
        b bVar = this.f11949a;
        bVar.h();
        try {
            long I = this.f11950b.I(eVar, j10);
            if (!bVar.i()) {
                return I;
            }
            throw bVar.j((IOException) null);
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

    public final void close() {
        b bVar = this.f11949a;
        bVar.h();
        try {
            this.f11950b.close();
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
        return this.f11949a;
    }

    public final String toString() {
        StringBuilder d10 = a.d("AsyncTimeout.source(");
        d10.append(this.f11950b);
        d10.append(')');
        return d10.toString();
    }
}
