package z7;

import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class n extends a0.e.d.a.b.C0272a {

    /* renamed from: a  reason: collision with root package name */
    public final long f14091a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14092b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14093c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14094d;

    public static final class a extends a0.e.d.a.b.C0272a.C0273a {

        /* renamed from: a  reason: collision with root package name */
        public Long f14095a;

        /* renamed from: b  reason: collision with root package name */
        public Long f14096b;

        /* renamed from: c  reason: collision with root package name */
        public String f14097c;

        /* renamed from: d  reason: collision with root package name */
        public String f14098d;

        public final a0.e.d.a.b.C0272a a() {
            String str = this.f14095a == null ? " baseAddress" : BuildConfig.FLAVOR;
            if (this.f14096b == null) {
                str = a8.a.c(str, " size");
            }
            if (this.f14097c == null) {
                str = a8.a.c(str, " name");
            }
            if (str.isEmpty()) {
                return new n(this.f14095a.longValue(), this.f14096b.longValue(), this.f14097c, this.f14098d);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }
    }

    public n(long j10, long j11, String str, String str2) {
        this.f14091a = j10;
        this.f14092b = j11;
        this.f14093c = str;
        this.f14094d = str2;
    }

    public final long a() {
        return this.f14091a;
    }

    public final String b() {
        return this.f14093c;
    }

    public final long c() {
        return this.f14092b;
    }

    public final String d() {
        return this.f14094d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.C0272a)) {
            return false;
        }
        a0.e.d.a.b.C0272a aVar = (a0.e.d.a.b.C0272a) obj;
        if (this.f14091a == aVar.a() && this.f14092b == aVar.c() && this.f14093c.equals(aVar.b())) {
            String str = this.f14094d;
            if (str == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14091a;
        long j11 = this.f14092b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f14093c.hashCode()) * 1000003;
        String str = this.f14094d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("BinaryImage{baseAddress=");
        d10.append(this.f14091a);
        d10.append(", size=");
        d10.append(this.f14092b);
        d10.append(", name=");
        d10.append(this.f14093c);
        d10.append(", uuid=");
        return android.support.v4.media.a.e(d10, this.f14094d, "}");
    }
}
