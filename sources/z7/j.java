package z7;

import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class j extends a0.e.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f14052a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14053b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14054c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14055d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14056e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14057f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14058h;
    public final String i;

    public static final class a extends a0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f14059a;

        /* renamed from: b  reason: collision with root package name */
        public String f14060b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f14061c;

        /* renamed from: d  reason: collision with root package name */
        public Long f14062d;

        /* renamed from: e  reason: collision with root package name */
        public Long f14063e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f14064f;
        public Integer g;

        /* renamed from: h  reason: collision with root package name */
        public String f14065h;
        public String i;

        public final a0.e.c a() {
            String str = this.f14059a == null ? " arch" : BuildConfig.FLAVOR;
            if (this.f14060b == null) {
                str = a8.a.c(str, " model");
            }
            if (this.f14061c == null) {
                str = a8.a.c(str, " cores");
            }
            if (this.f14062d == null) {
                str = a8.a.c(str, " ram");
            }
            if (this.f14063e == null) {
                str = a8.a.c(str, " diskSpace");
            }
            if (this.f14064f == null) {
                str = a8.a.c(str, " simulator");
            }
            if (this.g == null) {
                str = a8.a.c(str, " state");
            }
            if (this.f14065h == null) {
                str = a8.a.c(str, " manufacturer");
            }
            if (this.i == null) {
                str = a8.a.c(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new j(this.f14059a.intValue(), this.f14060b, this.f14061c.intValue(), this.f14062d.longValue(), this.f14063e.longValue(), this.f14064f.booleanValue(), this.g.intValue(), this.f14065h, this.i);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }
    }

    public j(int i10, String str, int i11, long j10, long j11, boolean z, int i12, String str2, String str3) {
        this.f14052a = i10;
        this.f14053b = str;
        this.f14054c = i11;
        this.f14055d = j10;
        this.f14056e = j11;
        this.f14057f = z;
        this.g = i12;
        this.f14058h = str2;
        this.i = str3;
    }

    public final int a() {
        return this.f14052a;
    }

    public final int b() {
        return this.f14054c;
    }

    public final long c() {
        return this.f14056e;
    }

    public final String d() {
        return this.f14058h;
    }

    public final String e() {
        return this.f14053b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.c)) {
            return false;
        }
        a0.e.c cVar = (a0.e.c) obj;
        if (this.f14052a == cVar.a() && this.f14053b.equals(cVar.e()) && this.f14054c == cVar.b() && this.f14055d == cVar.g() && this.f14056e == cVar.c() && this.f14057f == cVar.i() && this.g == cVar.h() && this.f14058h.equals(cVar.d()) && this.i.equals(cVar.f())) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.i;
    }

    public final long g() {
        return this.f14055d;
    }

    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        long j10 = this.f14055d;
        long j11 = this.f14056e;
        return ((((((((((((((((this.f14052a ^ 1000003) * 1000003) ^ this.f14053b.hashCode()) * 1000003) ^ this.f14054c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f14057f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.f14058h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final boolean i() {
        return this.f14057f;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Device{arch=");
        d10.append(this.f14052a);
        d10.append(", model=");
        d10.append(this.f14053b);
        d10.append(", cores=");
        d10.append(this.f14054c);
        d10.append(", ram=");
        d10.append(this.f14055d);
        d10.append(", diskSpace=");
        d10.append(this.f14056e);
        d10.append(", simulator=");
        d10.append(this.f14057f);
        d10.append(", state=");
        d10.append(this.g);
        d10.append(", manufacturer=");
        d10.append(this.f14058h);
        d10.append(", modelClass=");
        return android.support.v4.media.a.e(d10, this.i, "}");
    }
}
