package ge;

import e6.e;
import java.util.concurrent.CancellationException;

public final class h1 extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final g1 f5405a;

    public h1(String str, Throwable th2, g1 g1Var) {
        super(str);
        this.f5405a = g1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h1) {
                h1 h1Var = (h1) obj;
                if (!e.r(h1Var.getMessage(), getMessage()) || !e.r(h1Var.f5405a, this.f5405a) || !e.r(h1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        e.B(message);
        int hashCode = (this.f5405a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f5405a;
    }
}
