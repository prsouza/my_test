package ef;

import df.c;
import df.d;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public c f4832a;

    public static int b(byte[] bArr, int i) {
        int i10 = i + 1;
        return ((bArr[i10 + 1] & 255) << 16) | (bArr[i] & 255) | ((bArr[i10] & 255) << 8);
    }

    public static long c(byte[] bArr, int i) {
        int i10 = i + 1;
        int i11 = i10 + 1;
        byte b10 = (bArr[i] & 255) | ((bArr[i10] & 255) << 8);
        return ((long) ((bArr[i11 + 1] << 24) | b10 | ((bArr[i11] & 255) << 16))) & 4294967295L;
    }

    public final byte[] a(d dVar) {
        int[] iArr = ((a) dVar).f4831b;
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int i17 = iArr[8];
        int i18 = iArr[9];
        int i19 = (((i18 + ((i17 + ((i16 + ((i15 + ((i14 + ((i13 + ((i12 + ((i11 + ((i10 + ((i + (((i18 * 19) + 16777216) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26)) >> 25) * 19) + i;
        int i20 = i19 >> 26;
        int i21 = i10 + i20;
        int i22 = i19 - (i20 << 26);
        int i23 = i21 >> 25;
        int i24 = i11 + i23;
        int i25 = i21 - (i23 << 25);
        int i26 = i24 >> 26;
        int i27 = i12 + i26;
        int i28 = i24 - (i26 << 26);
        int i29 = i27 >> 25;
        int i30 = i13 + i29;
        int i31 = i27 - (i29 << 25);
        int i32 = i30 >> 26;
        int i33 = i14 + i32;
        int i34 = i30 - (i32 << 26);
        int i35 = i33 >> 25;
        int i36 = i15 + i35;
        int i37 = i33 - (i35 << 25);
        int i38 = i36 >> 26;
        int i39 = i16 + i38;
        int i40 = i36 - (i38 << 26);
        int i41 = i39 >> 25;
        int i42 = i17 + i41;
        int i43 = i39 - (i41 << 25);
        int i44 = i42 >> 26;
        int i45 = i18 + i44;
        int i46 = i42 - (i44 << 26);
        int i47 = i45 - ((i45 >> 25) << 25);
        return new byte[]{(byte) i22, (byte) (i22 >> 8), (byte) (i22 >> 16), (byte) ((i22 >> 24) | (i25 << 2)), (byte) (i25 >> 6), (byte) (i25 >> 14), (byte) ((i25 >> 22) | (i28 << 3)), (byte) (i28 >> 5), (byte) (i28 >> 13), (byte) ((i28 >> 21) | (i31 << 5)), (byte) (i31 >> 3), (byte) (i31 >> 11), (byte) ((i31 >> 19) | (i34 << 6)), (byte) (i34 >> 2), (byte) (i34 >> 10), (byte) (i34 >> 18), (byte) i37, (byte) (i37 >> 8), (byte) (i37 >> 16), (byte) ((i37 >> 24) | (i40 << 1)), (byte) (i40 >> 7), (byte) (i40 >> 15), (byte) ((i40 >> 23) | (i43 << 3)), (byte) (i43 >> 5), (byte) (i43 >> 13), (byte) ((i43 >> 21) | (i46 << 4)), (byte) (i46 >> 4), (byte) (i46 >> 12), (byte) ((i46 >> 20) | (i47 << 6)), (byte) (i47 >> 2), (byte) (i47 >> 10), (byte) (i47 >> 18)};
    }
}
