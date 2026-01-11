package y2;

import a3.g;
import b3.a;
import java.io.IOException;
import java.util.List;
import o2.f;
import u2.b;
import z2.c;

public final class d {
    public static <T> List<a<T>> a(c cVar, f fVar, h0<T> h0Var) throws IOException {
        return r.a(cVar, fVar, 1.0f, h0Var);
    }

    public static u2.a b(c cVar, f fVar) throws IOException {
        return new u2.a(a(cVar, fVar, f.f13387a));
    }

    public static b c(c cVar, f fVar, boolean z) throws IOException {
        return new b(r.a(cVar, fVar, z ? g.c() : 1.0f, i.f13394a));
    }

    public static u2.d d(c cVar, f fVar) throws IOException {
        return new u2.d(a(cVar, fVar, o.f13404a));
    }

    public static u2.f e(c cVar, f fVar) throws IOException {
        return new u2.f(r.a(cVar, fVar, g.c(), w.f13421a));
    }
}
