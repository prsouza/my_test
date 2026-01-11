package se;

import ah.v;
import md.m;
import oe.b;
import pe.c;
import pe.e;
import pe.f;
import xd.l;
import yd.h;

public final class k implements b<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f11114a = ((f) v.z("kotlinx.serialization.json.JsonElement", c.b.f9892a, new e[0], a.f11116b));

    /* renamed from: b  reason: collision with root package name */
    public static final k f11115b = new k();

    public static final class a extends h implements l<pe.a, m> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f11116b = new a();

        public a() {
            super(1);
        }

        public final Object k(Object obj) {
            pe.a aVar = (pe.a) obj;
            e6.e.D(aVar, "$receiver");
            pe.a.a(aVar, "JsonPrimitive", new l(f.f11109b));
            pe.a.a(aVar, "JsonNull", new l(g.f11110b));
            pe.a.a(aVar, "JsonLiteral", new l(h.f11111b));
            pe.a.a(aVar, "JsonObject", new l(i.f11112b));
            pe.a.a(aVar, "JsonArray", new l(j.f11113b));
            return m.f8555a;
        }
    }

    public final e a() {
        return f11114a;
    }

    public final Object b(qe.b bVar) {
        e6.e.D(bVar, "decoder");
        return jc.b.k(bVar).n();
    }
}
