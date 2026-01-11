package n1;

public final class c extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8868a = 0;

    public c(String str) {
        super("Context cannot be null");
    }

    public final Throwable fillInStackTrace() {
        switch (this.f8868a) {
            case 1:
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    public c(Throwable th2) {
        super(th2);
    }
}
