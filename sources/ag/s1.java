package ag;

import java.io.IOException;
import java.util.Enumeration;

public final class s1 implements Enumeration {

    /* renamed from: a  reason: collision with root package name */
    public j f443a;

    /* renamed from: b  reason: collision with root package name */
    public s f444b = ((s) a());

    public s1(byte[] bArr) {
        this.f443a = new j(bArr, true);
    }

    public final Object a() {
        try {
            return this.f443a.s();
        } catch (IOException e10) {
            throw new r("malformed DER construction: " + e10, e10);
        }
    }

    public final boolean hasMoreElements() {
        return this.f444b != null;
    }

    public final Object nextElement() {
        s sVar = this.f444b;
        this.f444b = (s) a();
        return sVar;
    }
}
