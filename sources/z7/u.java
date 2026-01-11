package z7;

import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class u extends a0.e.C0282e {

    /* renamed from: a  reason: collision with root package name */
    public final int f14144a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14145b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14146c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14147d;

    public static final class a extends a0.e.C0282e.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f14148a;

        /* renamed from: b  reason: collision with root package name */
        public String f14149b;

        /* renamed from: c  reason: collision with root package name */
        public String f14150c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f14151d;

        public final a0.e.C0282e a() {
            String str = this.f14148a == null ? " platform" : BuildConfig.FLAVOR;
            if (this.f14149b == null) {
                str = a8.a.c(str, " version");
            }
            if (this.f14150c == null) {
                str = a8.a.c(str, " buildVersion");
            }
            if (this.f14151d == null) {
                str = a8.a.c(str, " jailbroken");
            }
            if (str.isEmpty()) {
                return new u(this.f14148a.intValue(), this.f14149b, this.f14150c, this.f14151d.booleanValue());
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }
    }

    public u(int i, String str, String str2, boolean z) {
        this.f14144a = i;
        this.f14145b = str;
        this.f14146c = str2;
        this.f14147d = z;
    }

    public final String a() {
        return this.f14146c;
    }

    public final int b() {
        return this.f14144a;
    }

    public final String c() {
        return this.f14145b;
    }

    public final boolean d() {
        return this.f14147d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.C0282e)) {
            return false;
        }
        a0.e.C0282e eVar = (a0.e.C0282e) obj;
        if (this.f14144a != eVar.b() || !this.f14145b.equals(eVar.c()) || !this.f14146c.equals(eVar.a()) || this.f14147d != eVar.d()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.f14144a ^ 1000003) * 1000003) ^ this.f14145b.hashCode()) * 1000003) ^ this.f14146c.hashCode()) * 1000003) ^ (this.f14147d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("OperatingSystem{platform=");
        d10.append(this.f14144a);
        d10.append(", version=");
        d10.append(this.f14145b);
        d10.append(", buildVersion=");
        d10.append(this.f14146c);
        d10.append(", jailbroken=");
        d10.append(this.f14147d);
        d10.append("}");
        return d10.toString();
    }
}
