package w9;

import e6.e;
import md.m;
import wi.c;
import xd.p;
import yd.h;
import yi.a;

public final class b extends h implements p<a, byte[], m> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f12613b = new b();

    public b() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        e.D((a) obj, "vm");
        e.D((byte[]) obj2, "$noName_1");
        throw new c(wi.a.SelfDestruction, "tx has self-destruct");
    }
}
