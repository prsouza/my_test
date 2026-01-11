package ge;

import pd.f;

public final class k0 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final f f5408a;

    public k0(f fVar) {
        this.f5408a = fVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f5408a.toString();
    }
}
