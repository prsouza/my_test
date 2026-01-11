package te;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f11586a;

    static {
        byte[] bArr = new byte[126];
        for (int i = 0; i <= 32; i++) {
            bArr[i] = 11;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
        f11586a = bArr;
    }

    public static final byte a(char c10) {
        if (c10 < '~') {
            return f11586a[c10];
        }
        return 0;
    }
}
