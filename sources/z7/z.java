package z7;

import a.a;
import android.os.Build;
import java.util.Objects;
import z7.c0;

public final class z extends c0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f14169a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14170b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14171c;

    public z(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        Objects.requireNonNull(str, "Null osRelease");
        this.f14169a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f14170b = str2;
        this.f14171c = z;
    }

    public final boolean a() {
        return this.f14171c;
    }

    public final String b() {
        return this.f14170b;
    }

    public final String c() {
        return this.f14169a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.c)) {
            return false;
        }
        c0.c cVar = (c0.c) obj;
        if (!this.f14169a.equals(cVar.c()) || !this.f14170b.equals(cVar.b()) || this.f14171c != cVar.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f14169a.hashCode() ^ 1000003) * 1000003) ^ this.f14170b.hashCode()) * 1000003) ^ (this.f14171c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder d10 = a.d("OsData{osRelease=");
        d10.append(this.f14169a);
        d10.append(", osCodeName=");
        d10.append(this.f14170b);
        d10.append(", isRooted=");
        d10.append(this.f14171c);
        d10.append("}");
        return d10.toString();
    }
}
