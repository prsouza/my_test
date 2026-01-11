package gb;

import c3.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5316a;

    public a() {
        this.f5316a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5316a == ((a) obj).f5316a;
    }

    public final int hashCode() {
        boolean z = this.f5316a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.f5316a;
        return "ImportAccountUiState(showFailure=" + z + ")";
    }

    public a(boolean z) {
        this.f5316a = z;
    }

    public a(boolean z, int i, k kVar) {
        this.f5316a = false;
    }
}
