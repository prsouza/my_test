package ag;

import java.io.IOException;
import java.io.OutputStream;

public abstract class s extends m {
    public static s n(byte[] bArr) throws IOException {
        j jVar = new j(bArr);
        try {
            s s10 = jVar.s();
            if (jVar.available() == 0) {
                return s10;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public final s d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j(((d) obj).d());
    }

    public final void g(OutputStream outputStream) throws IOException {
        k(new q(outputStream), true);
    }

    public final void h(OutputStream outputStream, String str) throws IOException {
        q.a(outputStream, str).l(this, true);
    }

    public abstract int hashCode();

    public abstract boolean j(s sVar);

    public abstract void k(q qVar, boolean z) throws IOException;

    public abstract int l() throws IOException;

    public final boolean m(s sVar) {
        return this == sVar || j(sVar);
    }

    public abstract boolean o();

    public s p() {
        return this;
    }

    public s q() {
        return this;
    }
}
