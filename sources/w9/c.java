package w9;

import c3.k;
import di.b;
import e6.e;
import ge.g;
import md.m;
import wi.d;
import xd.p;
import yd.h;
import yi.a;

public final class c extends h implements p<a, byte[], m> {

    /* renamed from: b  reason: collision with root package name */
    public static final c f12614b = new c();

    public c() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        e.D(aVar, "vm");
        e.D((byte[]) obj2, "$noName_1");
        b m10 = a.b.m(aVar);
        yi.b.a(aVar, d.OP_BLE_MTU);
        try {
            g.c(new z9.b(aVar, m10, (int) k.k(aVar), (pd.d<? super z9.b>) null));
            return m.f8555a;
        } catch (IllegalStateException e10) {
            throw new wi.c(wi.a.BleError, e.a0("wrong ble state: ", e10.getMessage()));
        }
    }
}
