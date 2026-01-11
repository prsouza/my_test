package le;

import e6.e;
import ge.x1;
import java.util.Objects;
import pd.f;
import xd.p;
import yd.h;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final r f8267a = new r("NO_THREAD_ELEMENTS");

    public static final class a extends h implements p<Object, f.a, Object> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f8268b = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            f.a aVar = (f.a) obj2;
            if (!(aVar instanceof x1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            if (intValue == 0) {
                return aVar;
            }
            return Integer.valueOf(intValue + 1);
        }
    }

    public static final class b extends h implements p<x1<?>, f.a, x1<?>> {

        /* renamed from: b  reason: collision with root package name */
        public static final b f8269b = new b();

        public b() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            x1 x1Var = (x1) obj;
            f.a aVar = (f.a) obj2;
            if (x1Var != null) {
                return x1Var;
            }
            if (aVar instanceof x1) {
                return (x1) aVar;
            }
            return null;
        }
    }

    public static final class c extends h implements p<w, f.a, w> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f8270b = new c();

        public c() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            w wVar = (w) obj;
            f.a aVar = (f.a) obj2;
            if (aVar instanceof x1) {
                x1<Object> x1Var = (x1) aVar;
                Object a02 = x1Var.a0(wVar.f8272a);
                Object[] objArr = wVar.f8273b;
                int i = wVar.f8275d;
                objArr[i] = a02;
                x1<Object>[] x1VarArr = wVar.f8274c;
                wVar.f8275d = i + 1;
                x1VarArr[i] = x1Var;
            }
            return wVar;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != f8267a) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                int length = wVar.f8274c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        x1<Object> x1Var = wVar.f8274c[length];
                        e.B(x1Var);
                        x1Var.R(fVar, wVar.f8273b[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = fVar.fold(null, b.f8269b);
                Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((x1) fold).R(fVar, obj);
            }
        }
    }

    public static final Object b(f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, a.f8268b);
            e.B(obj);
        }
        if (obj == 0) {
            return f8267a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new w(fVar, ((Number) obj).intValue()), c.f8270b);
        }
        return ((x1) obj).a0(fVar);
    }
}
