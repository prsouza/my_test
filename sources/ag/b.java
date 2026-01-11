package ag;

import java.io.IOException;
import java.util.Objects;
import xh.a;

public abstract class b extends s {

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f371c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f372a;

    /* renamed from: b  reason: collision with root package name */
    public final int f373b;

    public b(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "'data' cannot be null");
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.f372a = a.a(bArr);
            this.f373b = i;
        }
    }

    public final int hashCode() {
        byte[] bArr = this.f372a;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        byte b10 = (byte) (bArr[length] & (255 << this.f373b));
        int i = 0;
        if (bArr != null) {
            int i10 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i10 = (i10 * 257) ^ bArr[0 + length];
            }
            i = i10;
        }
        return ((i * 257) ^ b10) ^ this.f373b;
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof b)) {
            return false;
        }
        b bVar = (b) sVar;
        if (this.f373b != bVar.f373b) {
            return false;
        }
        byte[] bArr = this.f372a;
        byte[] bArr2 = bVar.f372a;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i = length - 1;
        if (i < 0) {
            return true;
        }
        for (int i10 = 0; i10 < i; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        byte b10 = bArr[i];
        int i11 = this.f373b;
        return ((byte) (b10 & (255 << i11))) == ((byte) (bArr2[i] & (255 << i11)));
    }

    public s p() {
        return new n0(this.f372a, this.f373b);
    }

    public s q() {
        return new i1(this.f372a, this.f373b);
    }

    public final byte[] r() {
        byte[] bArr = this.f372a;
        int i = this.f373b;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] a10 = a.a(bArr);
        int length = bArr.length - 1;
        a10[length] = (byte) ((255 << i) & a10[length]);
        return a10;
    }

    public final byte[] s() {
        if (this.f373b == 0) {
            return a.a(this.f372a);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i = 0; i != encoded.length; i++) {
                char[] cArr = f371c;
                stringBuffer.append(cArr[(encoded[i] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e10) {
            StringBuilder d10 = a.a.d("Internal error encoding BitString: ");
            d10.append(e10.getMessage());
            throw new r(d10.toString(), e10);
        }
    }
}
