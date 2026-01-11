package bb;

import androidx.fragment.app.m;
import e6.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f2938a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2939b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2940c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2941d;

    public b(int i, String str, long j10, boolean z) {
        e.D(str, "data");
        this.f2938a = i;
        this.f2939b = str;
        this.f2940c = j10;
        this.f2941d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2938a == bVar.f2938a && e.r(this.f2939b, bVar.f2939b) && this.f2940c == bVar.f2940c && this.f2941d == bVar.f2941d;
    }

    public final int hashCode() {
        int a10 = m.a(this.f2939b, this.f2938a * 31, 31);
        long j10 = this.f2940c;
        int i = (a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z = this.f2941d;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        int i = this.f2938a;
        String str = this.f2939b;
        long j10 = this.f2940c;
        boolean z = this.f2941d;
        return "Notification(id=" + i + ", data=" + str + ", timestamp=" + j10 + ", isSeen=" + z + ")";
    }
}
