package z7;

import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class q extends a0.e.d.a.b.C0277d {

    /* renamed from: a  reason: collision with root package name */
    public final String f14115a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14116b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.C0277d.C0279b> f14117c;

    public static final class b extends a0.e.d.a.b.C0277d.C0278a {

        /* renamed from: a  reason: collision with root package name */
        public String f14118a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f14119b;

        /* renamed from: c  reason: collision with root package name */
        public b0<a0.e.d.a.b.C0277d.C0279b> f14120c;

        public final a0.e.d.a.b.C0277d a() {
            String str = this.f14118a == null ? " name" : BuildConfig.FLAVOR;
            if (this.f14119b == null) {
                str = a8.a.c(str, " importance");
            }
            if (this.f14120c == null) {
                str = a8.a.c(str, " frames");
            }
            if (str.isEmpty()) {
                return new q(this.f14118a, this.f14119b.intValue(), this.f14120c, (a) null);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }
    }

    public q(String str, int i, b0 b0Var, a aVar) {
        this.f14115a = str;
        this.f14116b = i;
        this.f14117c = b0Var;
    }

    public final b0<a0.e.d.a.b.C0277d.C0279b> a() {
        return this.f14117c;
    }

    public final int b() {
        return this.f14116b;
    }

    public final String c() {
        return this.f14115a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.C0277d)) {
            return false;
        }
        a0.e.d.a.b.C0277d dVar = (a0.e.d.a.b.C0277d) obj;
        if (!this.f14115a.equals(dVar.c()) || this.f14116b != dVar.b() || !this.f14117c.equals(dVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f14115a.hashCode() ^ 1000003) * 1000003) ^ this.f14116b) * 1000003) ^ this.f14117c.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Thread{name=");
        d10.append(this.f14115a);
        d10.append(", importance=");
        d10.append(this.f14116b);
        d10.append(", frames=");
        d10.append(this.f14117c);
        d10.append("}");
        return d10.toString();
    }
}
