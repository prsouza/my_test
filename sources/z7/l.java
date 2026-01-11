package z7;

import androidx.activity.result.d;
import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class l extends a0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.e.d.a.b f14076a;

    /* renamed from: b  reason: collision with root package name */
    public final b0<a0.c> f14077b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.c> f14078c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f14079d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14080e;

    public static final class b extends a0.e.d.a.C0271a {

        /* renamed from: a  reason: collision with root package name */
        public a0.e.d.a.b f14081a;

        /* renamed from: b  reason: collision with root package name */
        public b0<a0.c> f14082b;

        /* renamed from: c  reason: collision with root package name */
        public b0<a0.c> f14083c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f14084d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f14085e;

        public b() {
        }

        public final a0.e.d.a a() {
            String str = this.f14081a == null ? " execution" : BuildConfig.FLAVOR;
            if (this.f14085e == null) {
                str = a8.a.c(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new l(this.f14081a, this.f14082b, this.f14083c, this.f14084d, this.f14085e.intValue(), (a) null);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public final a0.e.d.a.C0271a b(int i) {
            this.f14085e = Integer.valueOf(i);
            return this;
        }

        public b(a0.e.d.a aVar) {
            this.f14081a = aVar.c();
            this.f14082b = aVar.b();
            this.f14083c = aVar.d();
            this.f14084d = aVar.a();
            this.f14085e = Integer.valueOf(aVar.e());
        }
    }

    public l(a0.e.d.a.b bVar, b0 b0Var, b0 b0Var2, Boolean bool, int i, a aVar) {
        this.f14076a = bVar;
        this.f14077b = b0Var;
        this.f14078c = b0Var2;
        this.f14079d = bool;
        this.f14080e = i;
    }

    public final Boolean a() {
        return this.f14079d;
    }

    public final b0<a0.c> b() {
        return this.f14077b;
    }

    public final a0.e.d.a.b c() {
        return this.f14076a;
    }

    public final b0<a0.c> d() {
        return this.f14078c;
    }

    public final int e() {
        return this.f14080e;
    }

    public final boolean equals(Object obj) {
        b0<a0.c> b0Var;
        b0<a0.c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a)) {
            return false;
        }
        a0.e.d.a aVar = (a0.e.d.a) obj;
        if (!this.f14076a.equals(aVar.c()) || ((b0Var = this.f14077b) != null ? !b0Var.equals(aVar.b()) : aVar.b() != null) || ((b0Var2 = this.f14078c) != null ? !b0Var2.equals(aVar.d()) : aVar.d() != null) || ((bool = this.f14079d) != null ? !bool.equals(aVar.a()) : aVar.a() != null) || this.f14080e != aVar.e()) {
            return false;
        }
        return true;
    }

    public final a0.e.d.a.C0271a f() {
        return new b(this);
    }

    public final int hashCode() {
        int hashCode = (this.f14076a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.f14077b;
        int i = 0;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.f14078c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f14079d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f14080e;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Application{execution=");
        d10.append(this.f14076a);
        d10.append(", customAttributes=");
        d10.append(this.f14077b);
        d10.append(", internalKeys=");
        d10.append(this.f14078c);
        d10.append(", background=");
        d10.append(this.f14079d);
        d10.append(", uiOrientation=");
        return d.c(d10, this.f14080e, "}");
    }
}
