package gc;

import ca.c;
import e6.e;
import ed.h;
import fc.a;
import fc.b;
import java.io.ByteArrayOutputStream;

public abstract class d implements b<c> {

    /* renamed from: a  reason: collision with root package name */
    public final String f5352a;

    public d(String str) {
        this.f5352a = str;
    }

    public final a b(a aVar, ec.a aVar2) {
        c cVar = (c) aVar;
        e.D(cVar, "parent");
        e.D(aVar2, "junction");
        if (ec.b.HARD == null) {
            h hVar = h.f4808v;
            String str = this.f5352a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            hVar.b(new c(byteArrayOutputStream), str);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            e.C(byteArray, "stream.toByteArray()");
            byte[] a10 = jc.c.f7149h.a(nd.d.J(nd.d.J(byteArray, cVar.f5349a), (byte[]) null));
            e.C(a10, "newSeed");
            return (c) d(a10);
        }
        throw new b.a();
    }
}
