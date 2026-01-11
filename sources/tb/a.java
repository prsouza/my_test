package tb;

import androidx.fragment.app.m;
import e6.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f11462a;

    /* renamed from: b  reason: collision with root package name */
    public String f11463b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11464c;

    public a(String str, String str2, boolean z) {
        this.f11462a = str;
        this.f11463b = str2;
        this.f11464c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e.r(this.f11462a, aVar.f11462a) && e.r(this.f11463b, aVar.f11463b) && this.f11464c == aVar.f11464c;
    }

    public final int hashCode() {
        int a10 = m.a(this.f11463b, this.f11462a.hashCode() * 31, 31);
        boolean z = this.f11464c;
        if (z) {
            z = true;
        }
        return a10 + (z ? 1 : 0);
    }

    public final String toString() {
        String str = this.f11462a;
        String str2 = this.f11463b;
        boolean z = this.f11464c;
        return "BackupData(title=" + str + ", message=" + str2 + ", isIntro=" + z + ")";
    }
}
