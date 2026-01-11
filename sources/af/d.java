package af;

public enum d {
    NoInformation(0),
    LifetimeExpired(1),
    BlockUnsupported(11);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f365a;

    /* access modifiers changed from: public */
    d(int i) {
        this.f365a = i;
    }

    public final int d() {
        return this.f365a;
    }

    public String toString() {
        return name() + '(' + this.f365a + ')';
    }
}
