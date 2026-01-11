package z7;

import com.github.mikephil.charting.BuildConfig;
import java.util.Objects;
import z7.a0;

public final class k extends a0.e.d {

    /* renamed from: a  reason: collision with root package name */
    public final long f14066a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14067b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.e.d.a f14068c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.c f14069d;

    /* renamed from: e  reason: collision with root package name */
    public final a0.e.d.C0281d f14070e;

    public static final class a extends a0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        public Long f14071a;

        /* renamed from: b  reason: collision with root package name */
        public String f14072b;

        /* renamed from: c  reason: collision with root package name */
        public a0.e.d.a f14073c;

        /* renamed from: d  reason: collision with root package name */
        public a0.e.d.c f14074d;

        /* renamed from: e  reason: collision with root package name */
        public a0.e.d.C0281d f14075e;

        public a() {
        }

        public final a0.e.d a() {
            String str = this.f14071a == null ? " timestamp" : BuildConfig.FLAVOR;
            if (this.f14072b == null) {
                str = a8.a.c(str, " type");
            }
            if (this.f14073c == null) {
                str = a8.a.c(str, " app");
            }
            if (this.f14074d == null) {
                str = a8.a.c(str, " device");
            }
            if (str.isEmpty()) {
                return new k(this.f14071a.longValue(), this.f14072b, this.f14073c, this.f14074d, this.f14075e);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public final a0.e.d.b b(long j10) {
            this.f14071a = Long.valueOf(j10);
            return this;
        }

        public final a0.e.d.b c(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f14072b = str;
            return this;
        }

        public a(a0.e.d dVar) {
            this.f14071a = Long.valueOf(dVar.d());
            this.f14072b = dVar.e();
            this.f14073c = dVar.a();
            this.f14074d = dVar.b();
            this.f14075e = dVar.c();
        }
    }

    public k(long j10, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.C0281d dVar) {
        this.f14066a = j10;
        this.f14067b = str;
        this.f14068c = aVar;
        this.f14069d = cVar;
        this.f14070e = dVar;
    }

    public final a0.e.d.a a() {
        return this.f14068c;
    }

    public final a0.e.d.c b() {
        return this.f14069d;
    }

    public final a0.e.d.C0281d c() {
        return this.f14070e;
    }

    public final long d() {
        return this.f14066a;
    }

    public final String e() {
        return this.f14067b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d)) {
            return false;
        }
        a0.e.d dVar = (a0.e.d) obj;
        if (this.f14066a == dVar.d() && this.f14067b.equals(dVar.e()) && this.f14068c.equals(dVar.a()) && this.f14069d.equals(dVar.b())) {
            a0.e.d.C0281d dVar2 = this.f14070e;
            if (dVar2 == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14066a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14067b.hashCode()) * 1000003) ^ this.f14068c.hashCode()) * 1000003) ^ this.f14069d.hashCode()) * 1000003;
        a0.e.d.C0281d dVar = this.f14070e;
        return hashCode ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Event{timestamp=");
        d10.append(this.f14066a);
        d10.append(", type=");
        d10.append(this.f14067b);
        d10.append(", app=");
        d10.append(this.f14068c);
        d10.append(", device=");
        d10.append(this.f14069d);
        d10.append(", log=");
        d10.append(this.f14070e);
        d10.append("}");
        return d10.toString();
    }
}
