package bi;

import java.math.BigInteger;

public final class a {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static byte[] a(BigInteger bigInteger) {
        int i;
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int i10 = 1;
        if (byteArray[0] == 0) {
            i = byteArray.length - 1;
        } else {
            i10 = 0;
            i = byteArray.length;
        }
        if (i <= 32) {
            System.arraycopy(byteArray, i10, bArr, 32 - i, i);
            return bArr;
        }
        throw new RuntimeException("Input is too large to put in byte array of size 32");
    }
}
