package ge;

import pd.d;
import pd.e;
import pd.f;
import xd.p;
import yd.h;
import yd.u;

public final class y {

    public static final class a extends h implements p<f, f.a, f> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f5467b = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            f fVar = (f) obj;
            f.a aVar = (f.a) obj2;
            if (aVar instanceof x) {
                return fVar.plus(((x) aVar).w());
            }
            return fVar.plus(aVar);
        }
    }

    public static final class b extends h implements p<f, f.a, f> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u<f> f5468b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f5469c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(u<f> uVar, boolean z) {
            super(2);
            this.f5468b = uVar;
            this.f5469c = z;
        }

        public final Object invoke(Object obj, Object obj2) {
            f fVar = (f) obj;
            f.a aVar = (f.a) obj2;
            if (!(aVar instanceof x)) {
                return fVar.plus(aVar);
            }
            if (((f) this.f5468b.f13622a).get(aVar.getKey()) == null) {
                x xVar = (x) aVar;
                if (this.f5469c) {
                    xVar = xVar.w();
                }
                return fVar.plus(xVar);
            }
            u<f> uVar = this.f5468b;
            uVar.f13622a = ((f) uVar.f13622a).minusKey(aVar.getKey());
            return fVar.plus(((x) aVar).b0());
        }
    }

    public static final class c extends h implements p<Boolean, f.a, Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f5470b = new c();

        public c() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(((Boolean) obj).booleanValue() || (((f.a) obj2) instanceof x));
        }
    }

    public static final f a(f fVar, f fVar2, boolean z) {
        boolean b10 = b(fVar);
        boolean b11 = b(fVar2);
        if (!b10 && !b11) {
            return fVar.plus(fVar2);
        }
        u uVar = new u();
        uVar.f13622a = fVar2;
        pd.h hVar = pd.h.f9881a;
        f fVar3 = (f) fVar.fold(hVar, new b(uVar, z));
        if (b11) {
            uVar.f13622a = ((f) uVar.f13622a).fold(hVar, a.f5467b);
        }
        return fVar3.plus((f) uVar.f13622a);
    }

    public static final boolean b(f fVar) {
        return ((Boolean) fVar.fold(Boolean.FALSE, c.f5470b)).booleanValue();
    }

    public static final f c(d0 d0Var, f fVar) {
        f a10 = a(d0Var.f(), fVar, true);
        me.c cVar = o0.f5433a;
        return (a10 == cVar || a10.get(e.a.f9879a) != null) ? a10 : a10.plus(cVar);
    }

    public static final c2<?> d(d<?> dVar, f fVar, Object obj) {
        c2<?> c2Var = null;
        if (!(dVar instanceof rd.d)) {
            return null;
        }
        if (!(fVar.get(d2.f5381a) != null)) {
            return null;
        }
        rd.d dVar2 = (rd.d) dVar;
        while (true) {
            if (!(dVar2 instanceof l0) && (dVar2 = dVar2.getCallerFrame()) != null) {
                if (dVar2 instanceof c2) {
                    c2Var = (c2) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (c2Var != null) {
            c2Var.f5379s.set(new md.f(fVar, obj));
        }
        return c2Var;
    }
}
