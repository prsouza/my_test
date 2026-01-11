package z7;

import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class p extends a0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f14109a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14110b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14111c;

    public static final class a extends a0.e.d.a.b.c.C0276a {

        /* renamed from: a  reason: collision with root package name */
        public String f14112a;

        /* renamed from: b  reason: collision with root package name */
        public String f14113b;

        /* renamed from: c  reason: collision with root package name */
        public Long f14114c;

        public final a0.e.d.a.b.c a() {
            String str = this.f14112a == null ? " name" : BuildConfig.FLAVOR;
            if (this.f14113b == null) {
                str = a8.a.c(str, " code");
            }
            if (this.f14114c == null) {
                str = a8.a.c(str, " address");
            }
            if (str.isEmpty()) {
                return new p(this.f14112a, this.f14113b, this.f14114c.longValue());
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }
    }

    public p(String str, String str2, long j10) {
        this.f14109a = str;
        this.f14110b = str2;
        this.f14111c = j10;
    }

    public final long a() {
        return this.f14111c;
    }

    public final String b() {
        return this.f14110b;
    }

    public final String c() {
        return this.f14109a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.c)) {
            return false;
        }
        a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
        if (!this.f14109a.equals(cVar.c()) || !this.f14110b.equals(cVar.b()) || this.f14111c != cVar.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f14111c;
        return ((((this.f14109a.hashCode() ^ 1000003) * 1000003) ^ this.f14110b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Signal{name=");
        d10.append(this.f14109a);
        d10.append(", code=");
        d10.append(this.f14110b);
        d10.append(", address=");
        d10.append(this.f14111c);
        d10.append("}");
        return d10.toString();
    }
}
