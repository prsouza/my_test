package xe;

import a.b;
import e6.e;
import java.util.Arrays;
import ui.c;

public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f13170a;

    public a() {
        this(new byte[0]);
    }

    public a(byte[] bArr) {
        e.D(bArr, "buffer");
        this.f13170a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Arrays.equals(this.f13170a, ((a) obj).f13170a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13170a);
    }

    public final String toString() {
        StringBuilder q10 = b.q("BlobBlockData(buffer=0x");
        q10.append(c.a(this.f13170a));
        q10.append(')');
        return q10.toString();
    }
}
