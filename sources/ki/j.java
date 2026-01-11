package ki;

import java.util.Objects;
import p002if.a0;

public final class j extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final int f7606a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(z<?> zVar) {
        super("HTTP " + zVar.f7732a.f6455s + " " + zVar.f7732a.f6454c);
        Objects.requireNonNull(zVar, "response == null");
        a0 a0Var = zVar.f7732a;
        this.f7606a = a0Var.f6455s;
        String str = a0Var.f6454c;
    }
}
