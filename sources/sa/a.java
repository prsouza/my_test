package sa;

import androidx.fragment.app.m;
import e6.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f11031a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11032b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11033c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11034d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11035e;

    public a(int i, String str, long j10, long j11, boolean z) {
        e.D(str, "data");
        this.f11031a = i;
        this.f11032b = str;
        this.f11033c = j10;
        this.f11034d = j11;
        this.f11035e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11031a == aVar.f11031a && e.r(this.f11032b, aVar.f11032b) && this.f11033c == aVar.f11033c && this.f11034d == aVar.f11034d && this.f11035e == aVar.f11035e;
    }

    public final int hashCode() {
        int a10 = m.a(this.f11032b, this.f11031a * 31, 31);
        long j10 = this.f11033c;
        long j11 = this.f11034d;
        int i = (((a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        boolean z = this.f11035e;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        int i = this.f11031a;
        String str = this.f11032b;
        long j10 = this.f11033c;
        long j11 = this.f11034d;
        boolean z = this.f11035e;
        return "NotificationEntity(id=" + i + ", data=" + str + ", timestamp=" + j10 + ", expireTimestamp=" + j11 + ", isSeen=" + z + ")";
    }
}
