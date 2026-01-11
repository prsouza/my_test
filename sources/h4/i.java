package h4;

import java.io.IOException;

public class i extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public f f5833a;

    public i(String str, f fVar, Throwable th2) {
        super(str);
        if (th2 != null) {
            initCause(th2);
        }
        this.f5833a = fVar;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        f fVar = this.f5833a;
        if (fVar == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (fVar != null) {
            sb2.append(10);
            sb2.append(" at ");
            sb2.append(fVar.toString());
        }
        return sb2.toString();
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
