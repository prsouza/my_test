package yh;

public final class b extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f13662a;

    public b(String str, Throwable th2) {
        super(str);
        this.f13662a = th2;
    }

    public final Throwable getCause() {
        return this.f13662a;
    }
}
