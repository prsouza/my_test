package j4;

import h4.f;
import h4.h;
import h4.i;

public abstract class b extends i {

    /* renamed from: b  reason: collision with root package name */
    public transient h f7049b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(h hVar, String str) {
        super(str, hVar == null ? null : hVar.a(), (Throwable) null);
        this.f7049b = hVar;
    }

    public String getMessage() {
        return super.getMessage();
    }

    public b(String str, f fVar) {
        super(str, fVar, (Throwable) null);
        this.f7049b = null;
    }
}
