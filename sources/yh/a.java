package yh;

public final class a extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f13661a;

    public a(String str, Throwable th2) {
        super(str);
        this.f13661a = th2;
    }

    public final Throwable getCause() {
        return this.f13661a;
    }
}
