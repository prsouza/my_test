package yd;

import md.a;
import xd.b;
import xd.c;
import xd.d;
import xd.e;
import xd.f;
import xd.g;
import xd.h;
import xd.i;
import xd.j;
import xd.k;
import xd.l;
import xd.m;
import xd.n;
import xd.o;
import xd.p;
import xd.q;
import xd.r;
import xd.s;
import xd.t;
import xd.u;
import xd.v;
import xd.w;

public final class x {
    public static Object a(Object obj, int i) {
        if (obj == null || b(obj, i)) {
            return obj;
        }
        c(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean b(Object obj, int i) {
        int i10;
        if (obj instanceof a) {
            if (obj instanceof e) {
                i10 = ((e) obj).getArity();
            } else if (obj instanceof xd.a) {
                i10 = 0;
            } else if (obj instanceof l) {
                i10 = 1;
            } else if (obj instanceof p) {
                i10 = 2;
            } else if (obj instanceof q) {
                i10 = 3;
            } else if (obj instanceof r) {
                i10 = 4;
            } else if (obj instanceof s) {
                i10 = 5;
            } else if (obj instanceof t) {
                i10 = 6;
            } else if (obj instanceof u) {
                i10 = 7;
            } else if (obj instanceof v) {
                i10 = 8;
            } else if (obj instanceof w) {
                i10 = 9;
            } else if (obj instanceof b) {
                i10 = 10;
            } else if (obj instanceof c) {
                i10 = 11;
            } else if (obj instanceof d) {
                i10 = 12;
            } else if (obj instanceof e) {
                i10 = 13;
            } else if (obj instanceof f) {
                i10 = 14;
            } else if (obj instanceof g) {
                i10 = 15;
            } else if (obj instanceof h) {
                i10 = 16;
            } else if (obj instanceof i) {
                i10 = 17;
            } else if (obj instanceof j) {
                i10 = 18;
            } else if (obj instanceof k) {
                i10 = 19;
            } else if (obj instanceof m) {
                i10 = 20;
            } else if (obj instanceof n) {
                i10 = 21;
            } else {
                i10 = obj instanceof o ? 22 : -1;
            }
            if (i10 == i) {
                return true;
            }
        }
        return false;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(androidx.fragment.app.o.c(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        e6.e.W(classCastException, x.class.getName());
        throw classCastException;
    }
}
