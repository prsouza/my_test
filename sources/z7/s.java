package z7;

import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class s extends a0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    public final Double f14131a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14132b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14133c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14134d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14135e;

    /* renamed from: f  reason: collision with root package name */
    public final long f14136f;

    public static final class a extends a0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Double f14137a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f14138b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f14139c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f14140d;

        /* renamed from: e  reason: collision with root package name */
        public Long f14141e;

        /* renamed from: f  reason: collision with root package name */
        public Long f14142f;

        public final a0.e.d.c a() {
            String str = this.f14138b == null ? " batteryVelocity" : BuildConfig.FLAVOR;
            if (this.f14139c == null) {
                str = a8.a.c(str, " proximityOn");
            }
            if (this.f14140d == null) {
                str = a8.a.c(str, " orientation");
            }
            if (this.f14141e == null) {
                str = a8.a.c(str, " ramUsed");
            }
            if (this.f14142f == null) {
                str = a8.a.c(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new s(this.f14137a, this.f14138b.intValue(), this.f14139c.booleanValue(), this.f14140d.intValue(), this.f14141e.longValue(), this.f14142f.longValue());
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }
    }

    public s(Double d10, int i, boolean z, int i10, long j10, long j11) {
        this.f14131a = d10;
        this.f14132b = i;
        this.f14133c = z;
        this.f14134d = i10;
        this.f14135e = j10;
        this.f14136f = j11;
    }

    public final Double a() {
        return this.f14131a;
    }

    public final int b() {
        return this.f14132b;
    }

    public final long c() {
        return this.f14136f;
    }

    public final int d() {
        return this.f14134d;
    }

    public final long e() {
        return this.f14135e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.c)) {
            return false;
        }
        a0.e.d.c cVar = (a0.e.d.c) obj;
        Double d10 = this.f14131a;
        if (d10 != null ? d10.equals(cVar.a()) : cVar.a() == null) {
            if (this.f14132b == cVar.b() && this.f14133c == cVar.f() && this.f14134d == cVar.d() && this.f14135e == cVar.e() && this.f14136f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f14133c;
    }

    public final int hashCode() {
        Double d10 = this.f14131a;
        int hashCode = ((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f14132b) * 1000003;
        int i = this.f14133c ? 1231 : 1237;
        long j10 = this.f14135e;
        long j11 = this.f14136f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f14134d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Device{batteryLevel=");
        d10.append(this.f14131a);
        d10.append(", batteryVelocity=");
        d10.append(this.f14132b);
        d10.append(", proximityOn=");
        d10.append(this.f14133c);
        d10.append(", orientation=");
        d10.append(this.f14134d);
        d10.append(", ramUsed=");
        d10.append(this.f14135e);
        d10.append(", diskUsed=");
        d10.append(this.f14136f);
        d10.append("}");
        return d10.toString();
    }
}
