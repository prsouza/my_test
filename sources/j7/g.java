package j7;

import java.security.InvalidKeyException;

public final class g extends h {
    public g(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    public final int[] d(int[] iArr, int i) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            h.j(iArr2, this.f7096a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    public final int g() {
        return 12;
    }
}
