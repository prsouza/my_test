package ge;

import aa.b;
import ad.c;
import ah.v;
import e6.e;
import l6.b1;
import le.t;
import md.m;
import pd.d;
import pd.f;
import xd.l;
import xd.p;
import yd.x;

public enum e0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5384a = null;

        static {
            int[] iArr = new int[e0.values().length];
            iArr[e0.DEFAULT.ordinal()] = 1;
            iArr[e0.ATOMIC.ordinal()] = 2;
            iArr[e0.UNDISPATCHED.ordinal()] = 3;
            iArr[e0.LAZY.ordinal()] = 4;
            f5384a = iArr;
        }
    }

    public final <T> void invoke(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        f context;
        Object b10;
        int i = a.f5384a[ordinal()];
        if (i == 1) {
            try {
                b.e0(c.Y(c.B(lVar, dVar)), m.f8555a, (l) null);
            } catch (Throwable th2) {
                dVar.resumeWith(b1.k(th2));
                throw th2;
            }
        } else if (i == 2) {
            e.D(lVar, "<this>");
            e.D(dVar, "completion");
            c.Y(c.B(lVar, dVar)).resumeWith(m.f8555a);
        } else if (i == 3) {
            e.D(dVar, "completion");
            try {
                context = dVar.getContext();
                b10 = t.b(context, (Object) null);
                x.a(lVar, 1);
                Object k10 = lVar.k(dVar);
                t.a(context, b10);
                if (k10 != qd.a.COROUTINE_SUSPENDED) {
                    dVar.resumeWith(k10);
                }
            } catch (Throwable th3) {
                dVar.resumeWith(b1.k(th3));
            }
        } else if (i != 4) {
            throw new md.e();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        f context;
        Object b10;
        int i = a.f5384a[ordinal()];
        if (i == 1) {
            v.z0(pVar, r10, dVar);
        } else if (i == 2) {
            e.D(pVar, "<this>");
            e.D(dVar, "completion");
            c.Y(c.C(pVar, r10, dVar)).resumeWith(m.f8555a);
        } else if (i == 3) {
            e.D(dVar, "completion");
            try {
                context = dVar.getContext();
                b10 = t.b(context, (Object) null);
                x.a(pVar, 2);
                Object invoke = pVar.invoke(r10, dVar);
                t.a(context, b10);
                if (invoke != qd.a.COROUTINE_SUSPENDED) {
                    dVar.resumeWith(invoke);
                }
            } catch (Throwable th2) {
                dVar.resumeWith(b1.k(th2));
            }
        } else if (i != 4) {
            throw new md.e();
        }
    }
}
