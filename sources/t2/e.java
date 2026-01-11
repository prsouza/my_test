package t2;

import a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Marker;
import org.slf4j.helpers.MessageFormatter;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f11272c = new e("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f11273a;

    /* renamed from: b  reason: collision with root package name */
    public f f11274b;

    public e(String... strArr) {
        this.f11273a = Arrays.asList(strArr);
    }

    public final e a(String str) {
        e eVar = new e(this);
        eVar.f11273a.add(str);
        return eVar;
    }

    public final boolean b() {
        List<String> list = this.f11273a;
        return list.get(list.size() - 1).equals("**");
    }

    public final boolean c(String str, int i) {
        if (i >= this.f11273a.size()) {
            return false;
        }
        boolean z = i == this.f11273a.size() - 1;
        String str2 = this.f11273a.get(i);
        if (!str2.equals("**")) {
            boolean z10 = str2.equals(str) || str2.equals(Marker.ANY_MARKER);
            if ((z || (i == this.f11273a.size() - 2 && b())) && z10) {
                return true;
            }
            return false;
        }
        if (!z && this.f11273a.get(i + 1).equals(str)) {
            if (i == this.f11273a.size() - 2 || (i == this.f11273a.size() - 3 && b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i10 = i + 1;
            if (i10 < this.f11273a.size() - 1) {
                return false;
            }
            return this.f11273a.get(i10).equals(str);
        }
    }

    public final int d(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.f11273a.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f11273a.size() - 1 && this.f11273a.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public final boolean e(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f11273a.size()) {
            return false;
        }
        if (this.f11273a.get(i).equals(str) || this.f11273a.get(i).equals("**") || this.f11273a.get(i).equals(Marker.ANY_MARKER)) {
            return true;
        }
        return false;
    }

    public final boolean f(String str, int i) {
        if (!"__container".equals(str) && i >= this.f11273a.size() - 1 && !this.f11273a.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    public final e g(f fVar) {
        e eVar = new e(this);
        eVar.f11274b = fVar;
        return eVar;
    }

    public final String toString() {
        StringBuilder d10 = a.d("KeyPath{keys=");
        d10.append(this.f11273a);
        d10.append(",resolved=");
        d10.append(this.f11274b != null);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }

    public e(e eVar) {
        this.f11273a = new ArrayList(eVar.f11273a);
        this.f11274b = eVar.f11274b;
    }
}
