package eh;

import java.util.Arrays;
import xh.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f4837a;

    public c(int[] iArr) {
        this.f4837a = (int[]) iArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return Arrays.equals(this.f4837a, ((c) obj).f4837a);
    }

    public final int hashCode() {
        return a.f(this.f4837a);
    }
}
