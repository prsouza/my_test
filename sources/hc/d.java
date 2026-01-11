package hc;

import c3.k;
import e6.e;
import fe.o;
import ic.a;
import xd.l;
import yd.h;

public final class d extends h implements l<String, CharSequence> {

    /* renamed from: b  reason: collision with root package name */
    public static final d f5930b = new d();

    public d() {
        super(1);
    }

    public final Object k(Object obj) {
        String str = (String) obj;
        e.D(str, "it");
        int index = a.INSTANCE.getIndex(str);
        if (index != -1) {
            k.T(2);
            String num = Integer.toString(index, 2);
            e.C(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            return o.q1(num, 11);
        }
        throw new a();
    }
}
