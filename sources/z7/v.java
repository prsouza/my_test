package z7;

import android.support.v4.media.a;
import z7.a0;

public final class v extends a0.e.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f14152a;

    public v(String str) {
        this.f14152a = str;
    }

    public final String a() {
        return this.f14152a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.f14152a.equals(((a0.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f14152a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.e(a.a.d("User{identifier="), this.f14152a, "}");
    }
}
