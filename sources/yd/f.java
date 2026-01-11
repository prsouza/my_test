package yd;

import androidx.fragment.app.m;
import de.a;
import de.e;
import java.util.Objects;

public class f extends b implements e, e {

    /* renamed from: v  reason: collision with root package name */
    public final int f13614v;

    /* renamed from: w  reason: collision with root package name */
    public final int f13615w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int i, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f13614v = i;
        this.f13615w = i10 >> 1;
    }

    public final a b() {
        Objects.requireNonNull(v.f13623a);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!this.f13607s.equals(fVar.f13607s) || !this.f13608t.equals(fVar.f13608t) || this.f13615w != fVar.f13615w || this.f13614v != fVar.f13614v || !e6.e.r(this.f13605b, fVar.f13605b) || !e6.e.r(d(), fVar.d())) {
                return false;
            }
            return true;
        } else if (obj instanceof e) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public final int getArity() {
        return this.f13614v;
    }

    public final int hashCode() {
        return this.f13608t.hashCode() + m.a(this.f13607s, d() == null ? 0 : d().hashCode() * 31, 31);
    }

    public final String toString() {
        a a10 = a();
        if (a10 != this) {
            return a10.toString();
        }
        if ("<init>".equals(this.f13607s)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return android.support.v4.media.a.e(a.a.d("function "), this.f13607s, " (Kotlin reflection is not available)");
    }
}
