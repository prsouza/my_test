package hc;

import c3.k;
import e6.e;
import fe.o;
import md.j;
import xd.l;
import yd.h;

public final class c extends h implements l<j, CharSequence> {

    /* renamed from: b  reason: collision with root package name */
    public static final c f5929b = new c();

    public c() {
        super(1);
    }

    public final Object k(Object obj) {
        k.T(2);
        String num = Integer.toString(((j) obj).f8550a & 255, 2);
        e.C(num, "toString(this, checkRadix(radix))");
        return o.q1(num, 8);
    }
}
