package t2;

import a.a;
import java.util.Collections;
import java.util.HashMap;
import m0.b;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11280a;

    /* renamed from: b  reason: collision with root package name */
    public Object f11281b;

    /* renamed from: c  reason: collision with root package name */
    public Object f11282c;

    public i() {
        this.f11280a = 0;
    }

    public final boolean equals(Object obj) {
        switch (this.f11280a) {
            case 0:
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                F f10 = bVar.f8362a;
                F f11 = this.f11281b;
                if (!(f10 == f11 || (f10 != null && f10.equals(f11)))) {
                    return false;
                }
                S s10 = bVar.f8363b;
                S s11 = this.f11282c;
                if (s10 == s11 || (s10 != null && s10.equals(s11))) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        switch (this.f11280a) {
            case 0:
                Object obj = this.f11281b;
                int i = 0;
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f11282c;
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                return hashCode ^ i;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.f11280a) {
            case 0:
                StringBuilder d10 = a.d("Pair{");
                d10.append(String.valueOf(this.f11281b));
                d10.append(" ");
                d10.append(String.valueOf(this.f11282c));
                d10.append("}");
                return d10.toString();
            default:
                return super.toString();
        }
    }

    public i(r8.b bVar) {
        this.f11280a = 1;
        this.f11282c = Collections.synchronizedMap(new HashMap());
        this.f11281b = bVar;
    }
}
