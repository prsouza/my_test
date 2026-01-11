package ag;

public final class r extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f437a;

    public r(String str) {
        super(str);
    }

    public r(String str, Throwable th2) {
        super(str);
        this.f437a = th2;
    }

    public final Throwable getCause() {
        return this.f437a;
    }
}
