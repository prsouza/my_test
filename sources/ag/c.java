package ag;

import java.io.IOException;

public final class c extends s {

    /* renamed from: b  reason: collision with root package name */
    public static final c f377b = new c((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public static final c f378c = new c((byte) -1);

    /* renamed from: a  reason: collision with root package name */
    public final byte f379a;

    public c(byte b10) {
        this.f379a = b10;
    }

    public final int hashCode() {
        return r() ? 1 : 0;
    }

    public final boolean j(s sVar) {
        return (sVar instanceof c) && r() == ((c) sVar).r();
    }

    public final void k(q qVar, boolean z) throws IOException {
        byte b10 = this.f379a;
        if (z) {
            qVar.d(1);
        }
        qVar.j(1);
        qVar.d(b10);
    }

    public final int l() {
        return 3;
    }

    public final boolean o() {
        return false;
    }

    public final s p() {
        return r() ? f378c : f377b;
    }

    public final boolean r() {
        return this.f379a != 0;
    }

    public final String toString() {
        return r() ? "TRUE" : "FALSE";
    }
}
