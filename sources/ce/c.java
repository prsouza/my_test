package ce;

public final class c extends a {

    /* renamed from: s  reason: collision with root package name */
    public static final a f3437s = new a();

    /* renamed from: t  reason: collision with root package name */
    public static final c f3438t = new c(1, 0);

    public static final class a {
    }

    public c(int i, int i10) {
        super(i, i10, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(this.f3430a == cVar.f3430a && this.f3431b == cVar.f3431b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3430a * 31) + this.f3431b;
    }

    public final boolean isEmpty() {
        return this.f3430a > this.f3431b;
    }

    public final String toString() {
        return this.f3430a + ".." + this.f3431b;
    }
}
