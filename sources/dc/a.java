package dc;

import e6.e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final char[] f4427a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4428b;

    public a() {
        char[] charArray = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();
        e.C(charArray, "(this as java.lang.String).toCharArray()");
        this.f4427a = charArray;
        int[] iArr = new int[128];
        this.f4428b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            this.f4428b[this.f4427a[i]] = i;
        }
        try {
            MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final byte[] a(byte[] bArr, int i, int i10) {
        int i11 = i10 - i;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i, bArr2, 0, i11);
        return bArr2;
    }
}
