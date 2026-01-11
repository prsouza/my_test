package i7;

import i7.t;
import i7.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.logging.Logger;

public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f6262a;

    /* renamed from: b  reason: collision with root package name */
    public static final l1<?, ?> f6263b = z(false);

    /* renamed from: c  reason: collision with root package name */
    public static final l1<?, ?> f6264c = z(true);

    /* renamed from: d  reason: collision with root package name */
    public static final l1<?, ?> f6265d = new n1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f6262a = cls;
    }

    public static <T, FT extends t.b<FT>> void A(q<FT> qVar, T t10, T t11) {
        t<FT> c10 = qVar.c(t11);
        if (!c10.h()) {
            t<FT> d10 = qVar.d(t10);
            Objects.requireNonNull(d10);
            for (int i = 0; i < c10.f6356a.e(); i++) {
                d10.m(c10.f6356a.d(i));
            }
            for (Map.Entry<T, Object> m10 : c10.f6356a.f()) {
                d10.m(m10);
            }
        }
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB C(int i, int i10, UB ub2, l1<UT, UB> l1Var) {
        if (ub2 == null) {
            ub2 = l1Var.m();
        }
        l1Var.e(ub2, i, (long) i10);
        return ub2;
    }

    public static void D(int i, List<Boolean> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).booleanValue();
                    Logger logger = l.f6317b;
                    i11++;
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.C(list.get(i10).booleanValue() ? (byte) 1 : 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.D(i, list.get(i10).booleanValue());
                i10++;
            }
        }
    }

    public static void E(int i, List<i> list, u1 u1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            for (int i10 = 0; i10 < list.size(); i10++) {
                mVar.f6323a.E(i, list.get(i10));
            }
        }
    }

    public static void F(int i, List<Double> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).doubleValue();
                    Logger logger = l.f6317b;
                    i11 += 8;
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    l lVar = mVar.f6323a;
                    double doubleValue = list.get(i10).doubleValue();
                    Objects.requireNonNull(lVar);
                    lVar.I(Double.doubleToRawLongBits(doubleValue));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                l lVar2 = mVar.f6323a;
                double doubleValue2 = list.get(i10).doubleValue();
                Objects.requireNonNull(lVar2);
                lVar2.H(i, Double.doubleToRawLongBits(doubleValue2));
                i10++;
            }
        }
    }

    public static void G(int i, List<Integer> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += l.l(list.get(i12).intValue());
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.K(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.J(i, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void H(int i, List<Integer> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).intValue();
                    Logger logger = l.f6317b;
                    i11 += 4;
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.G(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.F(i, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void I(int i, List<Long> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).longValue();
                    Logger logger = l.f6317b;
                    i11 += 8;
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.I(list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.H(i, list.get(i10).longValue());
                i10++;
            }
        }
    }

    public static void J(int i, List<Float> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).floatValue();
                    Logger logger = l.f6317b;
                    i11 += 4;
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    l lVar = mVar.f6323a;
                    float floatValue = list.get(i10).floatValue();
                    Objects.requireNonNull(lVar);
                    lVar.G(Float.floatToRawIntBits(floatValue));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                l lVar2 = mVar.f6323a;
                float floatValue2 = list.get(i10).floatValue();
                Objects.requireNonNull(lVar2);
                lVar2.F(i, Float.floatToRawIntBits(floatValue2));
                i10++;
            }
        }
    }

    public static void K(int i, List<?> list, u1 u1Var, f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            for (int i10 = 0; i10 < list.size(); i10++) {
                mVar.h(i, list.get(i10), f1Var);
            }
        }
    }

    public static void L(int i, List<Integer> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += l.l(list.get(i12).intValue());
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.K(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.J(i, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void M(int i, List<Long> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += l.A(list.get(i12).longValue());
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.T(list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.S(i, list.get(i10).longValue());
                i10++;
            }
        }
    }

    public static void N(int i, List<?> list, u1 u1Var, f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            for (int i10 = 0; i10 < list.size(); i10++) {
                mVar.k(i, list.get(i10), f1Var);
            }
        }
    }

    public static void O(int i, List<Integer> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).intValue();
                    Logger logger = l.f6317b;
                    i11 += 4;
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.G(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.F(i, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void P(int i, List<Long> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).longValue();
                    Logger logger = l.f6317b;
                    i11 += 8;
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.I(list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.H(i, list.get(i10).longValue());
                i10++;
            }
        }
    }

    public static void Q(int i, List<Integer> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += l.r(list.get(i12).intValue());
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    l lVar = mVar.f6323a;
                    int intValue = list.get(i10).intValue();
                    lVar.R((intValue >> 31) ^ (intValue << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                l lVar2 = mVar.f6323a;
                int intValue2 = list.get(i10).intValue();
                lVar2.Q(i, (intValue2 >> 31) ^ (intValue2 << 1));
                i10++;
            }
        }
    }

    public static void R(int i, List<Long> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += l.t(list.get(i12).longValue());
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.T(l.B(list.get(i10).longValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.S(i, l.B(list.get(i10).longValue()));
                i10++;
            }
        }
    }

    public static void S(int i, List<String> list, u1 u1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (list instanceof f0) {
                f0 f0Var = (f0) list;
                while (i10 < list.size()) {
                    Object b0 = f0Var.b0(i10);
                    if (b0 instanceof String) {
                        mVar.f6323a.O(i, (String) b0);
                    } else {
                        mVar.f6323a.E(i, (i) b0);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.O(i, list.get(i10));
                i10++;
            }
        }
    }

    public static void T(int i, List<Integer> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += l.y(list.get(i12).intValue());
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.R(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.Q(i, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void U(int i, List<Long> list, u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            int i10 = 0;
            if (z) {
                mVar.f6323a.P(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += l.A(list.get(i12).longValue());
                }
                mVar.f6323a.R(i11);
                while (i10 < list.size()) {
                    mVar.f6323a.T(list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                mVar.f6323a.S(i, list.get(i10).longValue());
                i10++;
            }
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l.b(i) * size;
    }

    public static int b(int i, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w6 = l.w(i) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            w6 += l.d(list.get(i10));
        }
        return w6;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.w(i) * size) + d(list);
    }

    public static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i = 0;
            while (i10 < size) {
                i += l.l(yVar.g(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i + l.l(list.get(i10).intValue());
                i10++;
            }
        }
        return i;
    }

    public static int e(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l.g(i) * size;
    }

    public static int f(List<?> list) {
        return list.size() * 4;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l.h(i) * size;
    }

    public static int h(List<?> list) {
        return list.size() * 8;
    }

    public static int i(int i, List<q0> list, f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += l.j(i, list.get(i11), f1Var);
        }
        return i10;
    }

    public static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.w(i) * size) + k(list);
    }

    public static int k(List<Integer> list) {
        int i;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i = 0;
            while (i10 < size) {
                i += l.l(yVar.g(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i + l.l(list.get(i10).intValue());
                i10++;
            }
        }
        return i;
    }

    public static int l(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (l.w(i) * list.size()) + m(list);
    }

    public static int m(List<Long> list) {
        int i;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i = 0;
            while (i10 < size) {
                i += l.A(h0Var.g(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i + l.A(list.get(i10).longValue());
                i10++;
            }
        }
        return i;
    }

    public static int n(int i, Object obj, f1 f1Var) {
        if (obj instanceof d0) {
            return l.n((d0) obj) + l.w(i);
        }
        int w6 = l.w(i);
        int f10 = ((a) ((q0) obj)).f(f1Var);
        return l.y(f10) + f10 + w6;
    }

    public static int o(int i, List<?> list, f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w6 = l.w(i) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof d0) {
                w6 = l.n((d0) obj) + w6;
            } else {
                int f10 = ((a) ((q0) obj)).f(f1Var);
                w6 = l.y(f10) + f10 + w6;
            }
        }
        return w6;
    }

    public static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.w(i) * size) + q(list);
    }

    public static int q(List<Integer> list) {
        int i;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i = 0;
            while (i10 < size) {
                i += l.r(yVar.g(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i + l.r(list.get(i10).intValue());
                i10++;
            }
        }
        return i;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.w(i) * size) + s(list);
    }

    public static int s(List<Long> list) {
        int i;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i = 0;
            while (i10 < size) {
                i += l.t(h0Var.g(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i + l.t(list.get(i10).longValue());
                i10++;
            }
        }
        return i;
    }

    public static int t(int i, List<?> list) {
        int i10;
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int w6 = l.w(i) * size;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i12 < size) {
                Object b0 = f0Var.b0(i12);
                if (b0 instanceof i) {
                    i11 = l.d((i) b0);
                } else {
                    i11 = l.v((String) b0);
                }
                w6 = i11 + w6;
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj instanceof i) {
                    i10 = l.d((i) obj);
                } else {
                    i10 = l.v((String) obj);
                }
                w6 = i10 + w6;
                i12++;
            }
        }
        return w6;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.w(i) * size) + v(list);
    }

    public static int v(List<Integer> list) {
        int i;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i = 0;
            while (i10 < size) {
                i += l.y(yVar.g(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i + l.y(list.get(i10).intValue());
                i10++;
            }
        }
        return i;
    }

    public static int w(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.w(i) * size) + x(list);
    }

    public static int x(List<Long> list) {
        int i;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i = 0;
            while (i10 < size) {
                i += l.A(h0Var.g(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i + l.A(list.get(i10).longValue());
                i10++;
            }
        }
        return i;
    }

    public static <UT, UB> UB y(int i, List<Integer> list, z.c cVar, UB ub2, l1<UT, UB> l1Var) {
        if (cVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int intValue = list.get(i11).intValue();
                if (cVar.a(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, Integer.valueOf(intValue));
                    }
                    i10++;
                } else {
                    ub2 = C(i, intValue, ub2, l1Var);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!cVar.a(intValue2)) {
                    ub2 = C(i, intValue2, ub2, l1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static l1<?, ?> z(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (l1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
