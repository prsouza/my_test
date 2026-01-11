package af;

public enum a {
    ReceivedBundle(0),
    ForwardedBundle(1),
    DeliveredBundle(2),
    DeletedBundle(3);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f349a;

    /* access modifiers changed from: public */
    a(int i) {
        this.f349a = i;
    }

    public String toString() {
        return name() + '(' + this.f349a + ')';
    }
}
