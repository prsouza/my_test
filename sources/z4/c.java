package z4;

import com.github.mikephil.charting.BuildConfig;
import java.util.Set;
import z4.f;

public final class c extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f13796a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13797b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<f.b> f13798c;

    public static final class b extends f.a.C0265a {

        /* renamed from: a  reason: collision with root package name */
        public Long f13799a;

        /* renamed from: b  reason: collision with root package name */
        public Long f13800b;

        /* renamed from: c  reason: collision with root package name */
        public Set<f.b> f13801c;

        public final f.a a() {
            String str = this.f13799a == null ? " delta" : BuildConfig.FLAVOR;
            if (this.f13800b == null) {
                str = a8.a.c(str, " maxAllowedDelay");
            }
            if (this.f13801c == null) {
                str = a8.a.c(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.f13799a.longValue(), this.f13800b.longValue(), this.f13801c, (a) null);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public final f.a.C0265a b(long j10) {
            this.f13799a = Long.valueOf(j10);
            return this;
        }

        public final f.a.C0265a c() {
            this.f13800b = 86400000L;
            return this;
        }
    }

    public c(long j10, long j11, Set set, a aVar) {
        this.f13796a = j10;
        this.f13797b = j11;
        this.f13798c = set;
    }

    public final long b() {
        return this.f13796a;
    }

    public final Set<f.b> c() {
        return this.f13798c;
    }

    public final long d() {
        return this.f13797b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.a)) {
            return false;
        }
        f.a aVar = (f.a) obj;
        if (this.f13796a == aVar.b() && this.f13797b == aVar.d() && this.f13798c.equals(aVar.c())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f13796a;
        long j11 = this.f13797b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13798c.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("ConfigValue{delta=");
        d10.append(this.f13796a);
        d10.append(", maxAllowedDelay=");
        d10.append(this.f13797b);
        d10.append(", flags=");
        d10.append(this.f13798c);
        d10.append("}");
        return d10.toString();
    }
}
