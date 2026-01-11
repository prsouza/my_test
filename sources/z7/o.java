package z7;

import androidx.activity.result.d;
import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class o extends a0.e.d.a.b.C0274b {

    /* renamed from: a  reason: collision with root package name */
    public final String f14099a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14100b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.C0277d.C0279b> f14101c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.a.b.C0274b f14102d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14103e;

    public static final class b extends a0.e.d.a.b.C0274b.C0275a {

        /* renamed from: a  reason: collision with root package name */
        public String f14104a;

        /* renamed from: b  reason: collision with root package name */
        public String f14105b;

        /* renamed from: c  reason: collision with root package name */
        public b0<a0.e.d.a.b.C0277d.C0279b> f14106c;

        /* renamed from: d  reason: collision with root package name */
        public a0.e.d.a.b.C0274b f14107d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f14108e;

        public final a0.e.d.a.b.C0274b a() {
            String str = this.f14104a == null ? " type" : BuildConfig.FLAVOR;
            if (this.f14106c == null) {
                str = a8.a.c(str, " frames");
            }
            if (this.f14108e == null) {
                str = a8.a.c(str, " overflowCount");
            }
            if (str.isEmpty()) {
                return new o(this.f14104a, this.f14105b, this.f14106c, this.f14107d, this.f14108e.intValue(), (a) null);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }
    }

    public o(String str, String str2, b0 b0Var, a0.e.d.a.b.C0274b bVar, int i, a aVar) {
        this.f14099a = str;
        this.f14100b = str2;
        this.f14101c = b0Var;
        this.f14102d = bVar;
        this.f14103e = i;
    }

    public final a0.e.d.a.b.C0274b a() {
        return this.f14102d;
    }

    public final b0<a0.e.d.a.b.C0277d.C0279b> b() {
        return this.f14101c;
    }

    public final int c() {
        return this.f14103e;
    }

    public final String d() {
        return this.f14100b;
    }

    public final String e() {
        return this.f14099a;
    }

    public final boolean equals(Object obj) {
        String str;
        a0.e.d.a.b.C0274b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.C0274b)) {
            return false;
        }
        a0.e.d.a.b.C0274b bVar2 = (a0.e.d.a.b.C0274b) obj;
        if (!this.f14099a.equals(bVar2.e()) || ((str = this.f14100b) != null ? !str.equals(bVar2.d()) : bVar2.d() != null) || !this.f14101c.equals(bVar2.b()) || ((bVar = this.f14102d) != null ? !bVar.equals(bVar2.a()) : bVar2.a() != null) || this.f14103e != bVar2.c()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.f14099a.hashCode() ^ 1000003) * 1000003;
        String str = this.f14100b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f14101c.hashCode()) * 1000003;
        a0.e.d.a.b.C0274b bVar = this.f14102d;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f14103e;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Exception{type=");
        d10.append(this.f14099a);
        d10.append(", reason=");
        d10.append(this.f14100b);
        d10.append(", frames=");
        d10.append(this.f14101c);
        d10.append(", causedBy=");
        d10.append(this.f14102d);
        d10.append(", overflowCount=");
        return d.c(d10, this.f14103e, "}");
    }
}
