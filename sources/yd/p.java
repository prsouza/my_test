package yd;

import androidx.fragment.app.m;
import de.a;
import de.h;
import e6.e;
import yd.b;

public abstract class p extends b implements h {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (!d().equals(pVar.d()) || !this.f13607s.equals(pVar.f13607s) || !this.f13608t.equals(pVar.f13608t) || !e.r(this.f13605b, pVar.f13605b)) {
                return false;
            }
            return true;
        } else if (obj instanceof h) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return this.f13608t.hashCode() + m.a(this.f13607s, d().hashCode() * 31, 31);
    }

    public final String toString() {
        a a10 = a();
        if (a10 != this) {
            return a10.toString();
        }
        return android.support.v4.media.a.e(a.a.d("property "), this.f13607s, " (Kotlin reflection is not available)");
    }

    public p() {
        super(b.a.f13610a, (Class) null, (String) null, (String) null, false);
    }
}
