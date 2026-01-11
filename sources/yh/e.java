package yh;

import com.google.android.gms.location.LocationRequest;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final short[] f13666a = new short[128];

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f13667b;

    static {
        byte[] bArr = new byte[112];
        f13667b = bArr;
        byte[] bArr2 = new byte[128];
        a(bArr2, 0, 15, (byte) 1);
        a(bArr2, 16, 31, (byte) 2);
        a(bArr2, 32, 63, (byte) 3);
        a(bArr2, 64, 65, (byte) 0);
        a(bArr2, 66, 95, (byte) 4);
        a(bArr2, 96, 96, (byte) 5);
        a(bArr2, 97, 108, (byte) 6);
        a(bArr2, 109, 109, (byte) 7);
        a(bArr2, 110, 111, (byte) 6);
        a(bArr2, 112, 112, (byte) 8);
        a(bArr2, 113, 115, (byte) 9);
        a(bArr2, 116, 116, (byte) 10);
        a(bArr2, 117, 127, (byte) 0);
        a(bArr, 0, bArr.length - 1, (byte) -2);
        a(bArr, 8, 11, (byte) -1);
        a(bArr, 24, 27, (byte) 0);
        a(bArr, 40, 43, (byte) 16);
        a(bArr, 58, 59, (byte) 0);
        a(bArr, 72, 73, (byte) 0);
        a(bArr, 89, 91, (byte) 16);
        a(bArr, LocationRequest.PRIORITY_LOW_POWER, LocationRequest.PRIORITY_LOW_POWER, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b10 = bArr2[i];
            f13666a[i] = (short) (bArr4[b10] | ((bArr3[b10] & i) << 8));
        }
    }

    public static void a(byte[] bArr, int i, int i10, byte b10) {
        while (i <= i10) {
            bArr[i] = b10;
            i++;
        }
    }
}
