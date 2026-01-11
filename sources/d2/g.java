package d2;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f4280a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4281b;

    public g(String str, int i) {
        this.f4280a = str;
        this.f4281b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f4281b != gVar.f4281b) {
            return false;
        }
        return this.f4280a.equals(gVar.f4280a);
    }

    public final int hashCode() {
        return (this.f4280a.hashCode() * 31) + this.f4281b;
    }
}
