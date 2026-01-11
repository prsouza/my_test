package z7;

import android.support.v4.media.a;
import z7.a0;

public final class t extends a0.e.d.C0281d {

    /* renamed from: a  reason: collision with root package name */
    public final String f14143a;

    public t(String str) {
        this.f14143a = str;
    }

    public final String a() {
        return this.f14143a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.C0281d) {
            return this.f14143a.equals(((a0.e.d.C0281d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f14143a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.e(a.a.d("Log{content="), this.f14143a, "}");
    }
}
