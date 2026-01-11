package p002if;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import fe.k;
import fe.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jf.c;
import md.f;
import nd.d;

/* renamed from: if.q  reason: invalid package */
public final class q implements Iterable<f<? extends String, ? extends String>>, zd.a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f6559b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final String[] f6560a;

    /* renamed from: if.q$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f6561a = new ArrayList(20);

        public final a a(String str, String str2) {
            e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            e.D(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            b bVar = q.f6559b;
            bVar.a(str);
            bVar.b(str2, str);
            b(str, str2);
            return this;
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        public final a b(String str, String str2) {
            e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            e.D(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f6561a.add(str);
            this.f6561a.add(o.D1(str2).toString());
            return this;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        public final q c() {
            Object[] array = this.f6561a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new q((String[]) array);
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        public final a d(String str) {
            int i = 0;
            while (i < this.f6561a.size()) {
                if (k.Y0(str, (String) this.f6561a.get(i))) {
                    this.f6561a.remove(i);
                    this.f6561a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final a e(String str, String str2) {
            e.D(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            b bVar = q.f6559b;
            bVar.a(str);
            bVar.b(str2, str);
            d(str);
            b(str, str2);
            return this;
        }
    }

    /* renamed from: if.q$b */
    public static final class b {
        public final void a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(c.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        public final void b(String str, String str2) {
            String str3;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!(charAt == 9 || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    if (c.q(str2)) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        str3 = a8.a.c(": ", str);
                    }
                    sb2.append(str3);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public final q c(String... strArr) {
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i] = o.D1(str).toString();
                        i++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                ce.a y02 = ad.c.y0(new ce.c(0, strArr2.length - 1), 2);
                int i10 = y02.f3430a;
                int i11 = y02.f3431b;
                int i12 = y02.f3432c;
                if (i12 < 0 ? i10 >= i11 : i10 <= i11) {
                    while (true) {
                        String str2 = strArr2[i10];
                        String str3 = strArr2[i10 + 1];
                        a(str2);
                        b(str3, str2);
                        if (i10 == i11) {
                            break;
                        }
                        i10 += i12;
                    }
                }
                return new q(strArr2);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public q(String[] strArr) {
        this.f6560a = strArr;
    }

    public final String d(String str) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String[] strArr = this.f6560a;
        ce.a y02 = ad.c.y0(ad.c.D(strArr.length - 2, 0), 2);
        int i = y02.f3430a;
        int i10 = y02.f3431b;
        int i11 = y02.f3432c;
        if (i11 < 0 ? i >= i10 : i <= i10) {
            while (!k.Y0(str, strArr[i])) {
                if (i != i10) {
                    i += i11;
                }
            }
            return strArr[i + 1];
        }
        return null;
    }

    public final String e(int i) {
        return this.f6560a[i * 2];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && Arrays.equals(this.f6560a, ((q) obj).f6560a);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, java.util.List<java.lang.String>, java.util.ArrayList] */
    public final a g() {
        a aVar = new a();
        ? r12 = aVar.f6561a;
        String[] strArr = this.f6560a;
        e.D(r12, "<this>");
        e.D(strArr, "elements");
        r12.addAll(d.D(strArr));
        return aVar;
    }

    public final String h(int i) {
        return this.f6560a[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6560a);
    }

    public final Iterator<f<String, String>> iterator() {
        int length = this.f6560a.length / 2;
        f[] fVarArr = new f[length];
        for (int i = 0; i < length; i++) {
            fVarArr[i] = new f(e(i), h(i));
        }
        return e.Q(fVarArr);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f6560a.length / 2;
        for (int i = 0; i < length; i++) {
            String e10 = e(i);
            String h10 = h(i);
            sb2.append(e10);
            sb2.append(": ");
            if (c.q(e10)) {
                h10 = "██";
            }
            sb2.append(h10);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        e.C(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
