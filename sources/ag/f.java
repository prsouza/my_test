package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;

public final class f extends s {

    /* renamed from: b  reason: collision with root package name */
    public static f[] f392b = new f[12];

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f393a;

    public f(byte[] bArr) {
        if (!k.w(bArr)) {
            int i = 0;
            if ((bArr[0] & 128) == 0) {
                this.f393a = a.a(bArr);
                int length = bArr.length - 1;
                while (i < length) {
                    byte b10 = bArr[i];
                    i++;
                    if (b10 != (bArr[i] >> 7)) {
                        return;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    public final int hashCode() {
        return a.e(this.f393a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof f)) {
            return false;
        }
        return Arrays.equals(this.f393a, ((f) sVar).f393a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 10, this.f393a);
    }

    public final int l() {
        return v1.a(this.f393a.length) + 1 + this.f393a.length;
    }

    public final boolean o() {
        return false;
    }
}
