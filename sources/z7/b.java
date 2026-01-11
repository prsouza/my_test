package z7;

import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class b extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f13992b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13993c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13994d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13995e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13996f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e f13997h;
    public final a0.d i;

    public static final class a extends a0.b {

        /* renamed from: a  reason: collision with root package name */
        public String f13998a;

        /* renamed from: b  reason: collision with root package name */
        public String f13999b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f14000c;

        /* renamed from: d  reason: collision with root package name */
        public String f14001d;

        /* renamed from: e  reason: collision with root package name */
        public String f14002e;

        /* renamed from: f  reason: collision with root package name */
        public String f14003f;
        public a0.e g;

        /* renamed from: h  reason: collision with root package name */
        public a0.d f14004h;

        public a() {
        }

        public final a0 a() {
            String str = this.f13998a == null ? " sdkVersion" : BuildConfig.FLAVOR;
            if (this.f13999b == null) {
                str = a8.a.c(str, " gmpAppId");
            }
            if (this.f14000c == null) {
                str = a8.a.c(str, " platform");
            }
            if (this.f14001d == null) {
                str = a8.a.c(str, " installationUuid");
            }
            if (this.f14002e == null) {
                str = a8.a.c(str, " buildVersion");
            }
            if (this.f14003f == null) {
                str = a8.a.c(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.f13998a, this.f13999b, this.f14000c.intValue(), this.f14001d, this.f14002e, this.f14003f, this.g, this.f14004h);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public a(a0 a0Var) {
            this.f13998a = a0Var.g();
            this.f13999b = a0Var.c();
            this.f14000c = Integer.valueOf(a0Var.f());
            this.f14001d = a0Var.d();
            this.f14002e = a0Var.a();
            this.f14003f = a0Var.b();
            this.g = a0Var.h();
            this.f14004h = a0Var.e();
        }
    }

    public b(String str, String str2, int i10, String str3, String str4, String str5, a0.e eVar, a0.d dVar) {
        this.f13992b = str;
        this.f13993c = str2;
        this.f13994d = i10;
        this.f13995e = str3;
        this.f13996f = str4;
        this.g = str5;
        this.f13997h = eVar;
        this.i = dVar;
    }

    public final String a() {
        return this.f13996f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.f13993c;
    }

    public final String d() {
        return this.f13995e;
    }

    public final a0.d e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f13992b.equals(a0Var.g()) && this.f13993c.equals(a0Var.c()) && this.f13994d == a0Var.f() && this.f13995e.equals(a0Var.d()) && this.f13996f.equals(a0Var.a()) && this.g.equals(a0Var.b()) && ((eVar = this.f13997h) != null ? eVar.equals(a0Var.h()) : a0Var.h() == null)) {
            a0.d dVar = this.i;
            if (dVar == null) {
                if (a0Var.e() == null) {
                    return true;
                }
            } else if (dVar.equals(a0Var.e())) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f13994d;
    }

    public final String g() {
        return this.f13992b;
    }

    public final a0.e h() {
        return this.f13997h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.f13992b.hashCode() ^ 1000003) * 1000003) ^ this.f13993c.hashCode()) * 1000003) ^ this.f13994d) * 1000003) ^ this.f13995e.hashCode()) * 1000003) ^ this.f13996f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        a0.e eVar = this.f13997h;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.i;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("CrashlyticsReport{sdkVersion=");
        d10.append(this.f13992b);
        d10.append(", gmpAppId=");
        d10.append(this.f13993c);
        d10.append(", platform=");
        d10.append(this.f13994d);
        d10.append(", installationUuid=");
        d10.append(this.f13995e);
        d10.append(", buildVersion=");
        d10.append(this.f13996f);
        d10.append(", displayVersion=");
        d10.append(this.g);
        d10.append(", session=");
        d10.append(this.f13997h);
        d10.append(", ndkPayload=");
        d10.append(this.i);
        d10.append("}");
        return d10.toString();
    }
}
