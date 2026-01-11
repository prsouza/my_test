package a9;

import java.util.Objects;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f170a;

    /* renamed from: b  reason: collision with root package name */
    public final String f171b;

    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f170a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f171b = str2;
    }

    public final String a() {
        return this.f170a;
    }

    public final String b() {
        return this.f171b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f170a.equals(dVar.a()) || !this.f171b.equals(dVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f170a.hashCode() ^ 1000003) * 1000003) ^ this.f171b.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("LibraryVersion{libraryName=");
        d10.append(this.f170a);
        d10.append(", version=");
        return android.support.v4.media.a.e(d10, this.f171b, "}");
    }
}
