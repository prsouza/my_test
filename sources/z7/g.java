package z7;

import androidx.activity.result.d;
import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class g extends a0.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f14028a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14029b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14030c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f14031d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14032e;

    /* renamed from: f  reason: collision with root package name */
    public final a0.e.a f14033f;
    public final a0.e.f g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e.C0282e f14034h;
    public final a0.e.c i;

    /* renamed from: j  reason: collision with root package name */
    public final b0<a0.e.d> f14035j;

    /* renamed from: k  reason: collision with root package name */
    public final int f14036k;

    public static final class b extends a0.e.b {

        /* renamed from: a  reason: collision with root package name */
        public String f14037a;

        /* renamed from: b  reason: collision with root package name */
        public String f14038b;

        /* renamed from: c  reason: collision with root package name */
        public Long f14039c;

        /* renamed from: d  reason: collision with root package name */
        public Long f14040d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f14041e;

        /* renamed from: f  reason: collision with root package name */
        public a0.e.a f14042f;
        public a0.e.f g;

        /* renamed from: h  reason: collision with root package name */
        public a0.e.C0282e f14043h;
        public a0.e.c i;

        /* renamed from: j  reason: collision with root package name */
        public b0<a0.e.d> f14044j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f14045k;

        public b() {
        }

        public final a0.e a() {
            String str = this.f14037a == null ? " generator" : BuildConfig.FLAVOR;
            if (this.f14038b == null) {
                str = a8.a.c(str, " identifier");
            }
            if (this.f14039c == null) {
                str = a8.a.c(str, " startedAt");
            }
            if (this.f14041e == null) {
                str = a8.a.c(str, " crashed");
            }
            if (this.f14042f == null) {
                str = a8.a.c(str, " app");
            }
            if (this.f14045k == null) {
                str = a8.a.c(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new g(this.f14037a, this.f14038b, this.f14039c.longValue(), this.f14040d, this.f14041e.booleanValue(), this.f14042f, this.g, this.f14043h, this.i, this.f14044j, this.f14045k.intValue(), (a) null);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public final a0.e.b b(boolean z) {
            this.f14041e = Boolean.valueOf(z);
            return this;
        }

        public b(a0.e eVar) {
            this.f14037a = eVar.e();
            this.f14038b = eVar.g();
            this.f14039c = Long.valueOf(eVar.i());
            this.f14040d = eVar.c();
            this.f14041e = Boolean.valueOf(eVar.k());
            this.f14042f = eVar.a();
            this.g = eVar.j();
            this.f14043h = eVar.h();
            this.i = eVar.b();
            this.f14044j = eVar.d();
            this.f14045k = Integer.valueOf(eVar.f());
        }
    }

    public g(String str, String str2, long j10, Long l10, boolean z, a0.e.a aVar, a0.e.f fVar, a0.e.C0282e eVar, a0.e.c cVar, b0 b0Var, int i10, a aVar2) {
        this.f14028a = str;
        this.f14029b = str2;
        this.f14030c = j10;
        this.f14031d = l10;
        this.f14032e = z;
        this.f14033f = aVar;
        this.g = fVar;
        this.f14034h = eVar;
        this.i = cVar;
        this.f14035j = b0Var;
        this.f14036k = i10;
    }

    public final a0.e.a a() {
        return this.f14033f;
    }

    public final a0.e.c b() {
        return this.i;
    }

    public final Long c() {
        return this.f14031d;
    }

    public final b0<a0.e.d> d() {
        return this.f14035j;
    }

    public final String e() {
        return this.f14028a;
    }

    public final boolean equals(Object obj) {
        Long l10;
        a0.e.f fVar;
        a0.e.C0282e eVar;
        a0.e.c cVar;
        b0<a0.e.d> b0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e)) {
            return false;
        }
        a0.e eVar2 = (a0.e) obj;
        if (!this.f14028a.equals(eVar2.e()) || !this.f14029b.equals(eVar2.g()) || this.f14030c != eVar2.i() || ((l10 = this.f14031d) != null ? !l10.equals(eVar2.c()) : eVar2.c() != null) || this.f14032e != eVar2.k() || !this.f14033f.equals(eVar2.a()) || ((fVar = this.g) != null ? !fVar.equals(eVar2.j()) : eVar2.j() != null) || ((eVar = this.f14034h) != null ? !eVar.equals(eVar2.h()) : eVar2.h() != null) || ((cVar = this.i) != null ? !cVar.equals(eVar2.b()) : eVar2.b() != null) || ((b0Var = this.f14035j) != null ? !b0Var.equals(eVar2.d()) : eVar2.d() != null) || this.f14036k != eVar2.f()) {
            return false;
        }
        return true;
    }

    public final int f() {
        return this.f14036k;
    }

    public final String g() {
        return this.f14029b;
    }

    public final a0.e.C0282e h() {
        return this.f14034h;
    }

    public final int hashCode() {
        long j10 = this.f14030c;
        int hashCode = (((((this.f14028a.hashCode() ^ 1000003) * 1000003) ^ this.f14029b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f14031d;
        int i10 = 0;
        int hashCode2 = (((((hashCode ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f14032e ? 1231 : 1237)) * 1000003) ^ this.f14033f.hashCode()) * 1000003;
        a0.e.f fVar = this.g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.C0282e eVar = this.f14034h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.e.c cVar = this.i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f14035j;
        if (b0Var != null) {
            i10 = b0Var.hashCode();
        }
        return ((hashCode5 ^ i10) * 1000003) ^ this.f14036k;
    }

    public final long i() {
        return this.f14030c;
    }

    public final a0.e.f j() {
        return this.g;
    }

    public final boolean k() {
        return this.f14032e;
    }

    public final a0.e.b l() {
        return new b(this);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Session{generator=");
        d10.append(this.f14028a);
        d10.append(", identifier=");
        d10.append(this.f14029b);
        d10.append(", startedAt=");
        d10.append(this.f14030c);
        d10.append(", endedAt=");
        d10.append(this.f14031d);
        d10.append(", crashed=");
        d10.append(this.f14032e);
        d10.append(", app=");
        d10.append(this.f14033f);
        d10.append(", user=");
        d10.append(this.g);
        d10.append(", os=");
        d10.append(this.f14034h);
        d10.append(", device=");
        d10.append(this.i);
        d10.append(", events=");
        d10.append(this.f14035j);
        d10.append(", generatorType=");
        return d.c(d10, this.f14036k, "}");
    }
}
