package mf;

import e6.e;
import java.io.IOException;
import java.util.Objects;
import nf.f;
import p002if.a0;
import p002if.s;
import p002if.v;
import p002if.x;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8595a = new a();

    public final a0 a(s.a aVar) throws IOException {
        f fVar = (f) aVar;
        e eVar = fVar.f9012b;
        Objects.requireNonNull(eVar);
        synchronized (eVar) {
            if (!eVar.A) {
                throw new IllegalStateException("released".toString());
            } else if (!(!eVar.z)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!(!eVar.f8634y)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        d dVar = eVar.f8630u;
        e.B(dVar);
        v vVar = eVar.E;
        e.D(vVar, "client");
        try {
            c cVar = new c(eVar, eVar.f8626b, dVar, dVar.a(fVar.g, fVar.f9017h, fVar.i, vVar.f6602u, !e.r(fVar.f9016f.f6628c, "GET")).k(vVar, fVar));
            eVar.f8633x = cVar;
            eVar.C = cVar;
            synchronized (eVar) {
                eVar.f8634y = true;
                eVar.z = true;
            }
            if (!eVar.B) {
                return f.a(fVar, 0, cVar, (x) null, 61).b(fVar.f9016f);
            }
            throw new IOException("Canceled");
        } catch (k e10) {
            dVar.c(e10.f8664a);
            throw e10;
        } catch (IOException e11) {
            dVar.c(e11);
            throw new k(e11);
        }
    }
}
