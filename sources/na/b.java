package na;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f8931d = new b(a.MEDIUM, 2500, 150.0f);

    /* renamed from: a  reason: collision with root package name */
    public long f8932a;

    /* renamed from: b  reason: collision with root package name */
    public float f8933b;

    /* renamed from: c  reason: collision with root package name */
    public a f8934c;

    static {
        a aVar = a.HIGH;
        a aVar2 = a.LOW;
    }

    public b(a aVar, long j10, float f10) {
        this.f8932a = j10;
        this.f8933b = f10;
        this.f8934c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Float.compare(bVar.f8933b, this.f8933b) == 0 && this.f8932a == bVar.f8932a && this.f8934c == bVar.f8934c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8932a;
        int i = ((int) (j10 ^ (j10 >>> 32))) * 31;
        float f10 = this.f8933b;
        return this.f8934c.hashCode() + ((i + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31);
    }
}
