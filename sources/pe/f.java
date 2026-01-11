package pe;

import ce.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import ge.g0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import md.h;
import nd.m;
import nd.r;
import nd.s;
import nd.t;
import nd.x;
import pe.g;
import xd.l;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final List<Annotation> f9902a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f9903b;

    /* renamed from: c  reason: collision with root package name */
    public final e[] f9904c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Annotation>[] f9905d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Integer> f9906e;

    /* renamed from: f  reason: collision with root package name */
    public final e[] f9907f;
    public final h g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9908h;
    public final i i;

    /* renamed from: j  reason: collision with root package name */
    public final int f9909j;

    public static final class a extends yd.h implements xd.a<Integer> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f9910b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(0);
            this.f9910b = fVar;
        }

        public final Object c() {
            f fVar = this.f9910b;
            e[] eVarArr = fVar.f9907f;
            e.D(eVarArr, "typeParams");
            int hashCode = (fVar.b().hashCode() * 31) + Arrays.hashCode(eVarArr);
            g gVar = new g(fVar);
            Iterator<e> it = gVar.iterator();
            int i = 1;
            int i10 = 1;
            while (true) {
                g.a aVar = (g.a) it;
                int i11 = 0;
                if (!aVar.hasNext()) {
                    break;
                }
                int i12 = i10 * 31;
                String b10 = ((e) aVar.next()).b();
                if (b10 != null) {
                    i11 = b10.hashCode();
                }
                i10 = i12 + i11;
            }
            Iterator<e> it2 = gVar.iterator();
            while (true) {
                g.a aVar2 = (g.a) it2;
                if (!aVar2.hasNext()) {
                    return Integer.valueOf((((hashCode * 31) + i10) * 31) + i);
                }
                int i13 = i * 31;
                i c10 = ((e) aVar2.next()).c();
                i = i13 + (c10 != null ? c10.hashCode() : 0);
            }
        }
    }

    public static final class b extends yd.h implements l<Integer, CharSequence> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f9911b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(1);
            this.f9911b = fVar;
        }

        public final Object k(Object obj) {
            int intValue = ((Number) obj).intValue();
            return this.f9911b.f9903b[intValue] + ": " + this.f9911b.f9904c[intValue].b();
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List<java.util.List<java.lang.annotation.Annotation>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v10, types: [java.util.List<java.lang.Boolean>, java.lang.Object, java.util.ArrayList] */
    public f(String str, i iVar, int i10, List<? extends e> list, a aVar) {
        e.D(str, "serialName");
        this.f9908h = str;
        this.i = iVar;
        this.f9909j = i10;
        this.f9902a = aVar.f9882a;
        int i11 = 0;
        Object[] array = aVar.f9883b.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f9903b = (String[]) array;
        this.f9904c = g0.l(aVar.f9885d);
        Object[] array2 = aVar.f9886e.toArray(new List[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f9905d = (List[]) array2;
        ? r32 = aVar.f9887f;
        e.D(r32, "<this>");
        boolean[] zArr = new boolean[r32.size()];
        Iterator it = r32.iterator();
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        String[] strArr = this.f9903b;
        e.D(strArr, "<this>");
        s sVar = new s(new nd.e(strArr));
        ArrayList arrayList = new ArrayList(nd.g.S0(sVar));
        Iterator it2 = sVar.iterator();
        while (true) {
            t tVar = (t) it2;
            if (tVar.hasNext()) {
                r rVar = (r) tVar.next();
                arrayList.add(new md.f(rVar.f8970b, Integer.valueOf(rVar.f8969a)));
            } else {
                this.f9906e = x.v0(arrayList);
                this.f9907f = g0.l(list);
                this.g = new h(new a(this));
                return;
            }
        }
    }

    public final int a(String str) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Integer num = this.f9906e.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final String b() {
        return this.f9908h;
    }

    public final i c() {
        return this.i;
    }

    public final int d() {
        return this.f9909j;
    }

    public final String e(int i10) {
        return this.f9903b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (!(!e.r(this.f9908h, eVar.b())) && Arrays.equals(this.f9907f, ((f) obj).f9907f) && this.f9909j == eVar.d()) {
                int i10 = this.f9909j;
                int i11 = 0;
                while (i11 < i10) {
                    if (!(!e.r(this.f9904c[i11].b(), eVar.g(i11).b())) && !(!e.r(this.f9904c[i11].c(), eVar.g(i11).c()))) {
                        i11++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return false;
    }

    public final e g(int i10) {
        return this.f9904c[i10];
    }

    public final int hashCode() {
        return ((Number) this.g.a()).intValue();
    }

    public final String toString() {
        c C0 = ad.c.C0(0, this.f9909j);
        return m.b1(C0, ", ", this.f9908h + '(', ")", new b(this), 24);
    }
}
