package gb;

import c3.k;
import e6.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f5317a;

    public c(b bVar) {
        this.f5317a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f5317a == ((c) obj).f5317a;
    }

    public final int hashCode() {
        return this.f5317a.hashCode();
    }

    public final String toString() {
        b bVar = this.f5317a;
        return "LauncherUiState(goto=" + bVar + ")";
    }

    public c() {
        b bVar = b.NONE;
        e.D(bVar, "goto");
        this.f5317a = bVar;
    }

    public c(b bVar, int i, k kVar) {
        b bVar2 = b.NONE;
        e.D(bVar2, "goto");
        this.f5317a = bVar2;
    }
}
