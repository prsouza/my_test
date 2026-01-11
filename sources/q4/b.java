package q4;

import android.support.v4.media.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f10302a;

    public b(String str) {
        this.f10302a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f10302a.equals(((b) obj).f10302a);
    }

    public final int hashCode() {
        return this.f10302a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.e(a.a.d("Encoding{name=\""), this.f10302a, "\"}");
    }
}
