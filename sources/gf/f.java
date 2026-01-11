package gf;

import a.b;
import android.support.v4.media.a;
import e6.e;

public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5486a;

    public f(String str) {
        this.f5486a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && e.r(this.f5486a, ((f) obj).f5486a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f5486a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return a.e(b.q("Ed25519SecurityResult(signature="), this.f5486a, ")");
    }
}
