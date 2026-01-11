package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;

public final class f1 extends s {

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f394b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f395a;

    public f1(byte[] bArr) {
        this.f395a = a.a(bArr);
    }

    public final int hashCode() {
        return a.e(this.f395a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof f1)) {
            return false;
        }
        return Arrays.equals(this.f395a, ((f1) sVar).f395a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 28, this.f395a);
    }

    public final int l() {
        return v1.a(this.f395a.length) + 1 + this.f395a.length;
    }

    public final boolean o() {
        return false;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i = 0; i != encoded.length; i++) {
                char[] cArr = f394b;
                stringBuffer.append(cArr[(encoded[i] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new r("internal error encoding UniversalString");
        }
    }
}
