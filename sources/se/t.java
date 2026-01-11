package se;

import a.a;
import ah.v;
import oe.b;
import pe.d;
import pe.e;
import pe.f;
import pe.h;

public final class t implements b<s> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f11133a = ((f) v.z("kotlinx.serialization.json.JsonPrimitive", d.i.f9901a, new e[0], h.f9915b));

    /* renamed from: b  reason: collision with root package name */
    public static final t f11134b = new t();

    public final e a() {
        return f11133a;
    }

    public final Object b(qe.b bVar) {
        e6.e.D(bVar, "decoder");
        e n10 = jc.b.k(bVar).n();
        if (n10 instanceof s) {
            return (s) n10;
        }
        StringBuilder d10 = a.d("Unexpected JSON element, expected JsonPrimitive, had ");
        d10.append(yd.v.a(n10.getClass()));
        throw a.b.j(-1, d10.toString(), n10.toString());
    }
}
