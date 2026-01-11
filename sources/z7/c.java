package z7;

import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class c extends a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f14006a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14007b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14008c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14009d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14010e;

    /* renamed from: f  reason: collision with root package name */
    public final long f14011f;
    public final long g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14012h;

    public static final class a extends a0.a.C0268a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f14013a;

        /* renamed from: b  reason: collision with root package name */
        public String f14014b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f14015c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f14016d;

        /* renamed from: e  reason: collision with root package name */
        public Long f14017e;

        /* renamed from: f  reason: collision with root package name */
        public Long f14018f;
        public Long g;

        /* renamed from: h  reason: collision with root package name */
        public String f14019h;

        public final a0.a a() {
            String str = this.f14013a == null ? " pid" : BuildConfig.FLAVOR;
            if (this.f14014b == null) {
                str = a8.a.c(str, " processName");
            }
            if (this.f14015c == null) {
                str = a8.a.c(str, " reasonCode");
            }
            if (this.f14016d == null) {
                str = a8.a.c(str, " importance");
            }
            if (this.f14017e == null) {
                str = a8.a.c(str, " pss");
            }
            if (this.f14018f == null) {
                str = a8.a.c(str, " rss");
            }
            if (this.g == null) {
                str = a8.a.c(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.f14013a.intValue(), this.f14014b, this.f14015c.intValue(), this.f14016d.intValue(), this.f14017e.longValue(), this.f14018f.longValue(), this.g.longValue(), this.f14019h);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }
    }

    public c(int i, String str, int i10, int i11, long j10, long j11, long j12, String str2) {
        this.f14006a = i;
        this.f14007b = str;
        this.f14008c = i10;
        this.f14009d = i11;
        this.f14010e = j10;
        this.f14011f = j11;
        this.g = j12;
        this.f14012h = str2;
    }

    public final int a() {
        return this.f14009d;
    }

    public final int b() {
        return this.f14006a;
    }

    public final String c() {
        return this.f14007b;
    }

    public final long d() {
        return this.f14010e;
    }

    public final int e() {
        return this.f14008c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.a)) {
            return false;
        }
        a0.a aVar = (a0.a) obj;
        if (this.f14006a == aVar.b() && this.f14007b.equals(aVar.c()) && this.f14008c == aVar.e() && this.f14009d == aVar.a() && this.f14010e == aVar.d() && this.f14011f == aVar.f() && this.g == aVar.g()) {
            String str = this.f14012h;
            if (str == null) {
                if (aVar.h() == null) {
                    return true;
                }
            } else if (str.equals(aVar.h())) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f14011f;
    }

    public final long g() {
        return this.g;
    }

    public final String h() {
        return this.f14012h;
    }

    public final int hashCode() {
        long j10 = this.f14010e;
        long j11 = this.f14011f;
        long j12 = this.g;
        int hashCode = (((((((((((((this.f14006a ^ 1000003) * 1000003) ^ this.f14007b.hashCode()) * 1000003) ^ this.f14008c) * 1000003) ^ this.f14009d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f14012h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("ApplicationExitInfo{pid=");
        d10.append(this.f14006a);
        d10.append(", processName=");
        d10.append(this.f14007b);
        d10.append(", reasonCode=");
        d10.append(this.f14008c);
        d10.append(", importance=");
        d10.append(this.f14009d);
        d10.append(", pss=");
        d10.append(this.f14010e);
        d10.append(", rss=");
        d10.append(this.f14011f);
        d10.append(", timestamp=");
        d10.append(this.g);
        d10.append(", traceFile=");
        return android.support.v4.media.a.e(d10, this.f14012h, "}");
    }
}
