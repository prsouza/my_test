package com.google.android.gms.internal.auth;

final class zzhd {
    private static final zzhb zza = new zzhc();

    static {
        if (zzgz.zzu() && zzgz.zzv()) {
            int i = zzdo.zza;
        }
    }

    public static /* synthetic */ int zza(byte[] bArr, int i, int i10) {
        byte b10 = bArr[i - 1];
        int i11 = i10 - i;
        if (i11 != 0) {
            if (i11 == 1) {
                byte b11 = bArr[i];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else if (i11 == 2) {
                byte b12 = bArr[i];
                byte b13 = bArr[i + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            } else {
                throw new AssertionError();
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    public static String zzb(byte[] bArr, int i, int i10) throws zzew {
        int i11;
        int length = bArr.length;
        if ((i | i10 | ((length - i) - i10)) >= 0) {
            int i12 = i + i10;
            char[] cArr = new char[i10];
            int i13 = 0;
            while (r11 < i12) {
                byte b10 = bArr[r11];
                if (!zzha.zzd(b10)) {
                    break;
                }
                i = r11 + 1;
                cArr[i11] = (char) b10;
                i13 = i11 + 1;
            }
            while (r11 < i12) {
                int i14 = r11 + 1;
                byte b11 = bArr[r11];
                if (zzha.zzd(b11)) {
                    int i15 = i11 + 1;
                    cArr[i11] = (char) b11;
                    r11 = i14;
                    while (true) {
                        i11 = i15;
                        if (r11 >= i12) {
                            break;
                        }
                        byte b12 = bArr[r11];
                        if (!zzha.zzd(b12)) {
                            break;
                        }
                        r11++;
                        i15 = i11 + 1;
                        cArr[i11] = (char) b12;
                    }
                } else if (b11 < -32) {
                    if (i14 < i12) {
                        zzha.zzb(b11, bArr[i14], cArr, i11);
                        r11 = i14 + 1;
                        i11++;
                    } else {
                        throw zzew.zzb();
                    }
                } else if (b11 < -16) {
                    if (i14 < i12 - 1) {
                        int i16 = i14 + 1;
                        zzha.zzc(b11, bArr[i14], bArr[i16], cArr, i11);
                        r11 = i16 + 1;
                        i11++;
                    } else {
                        throw zzew.zzb();
                    }
                } else if (i14 < i12 - 2) {
                    int i17 = i14 + 1;
                    int i18 = i17 + 1;
                    zzha.zza(b11, bArr[i14], bArr[i17], bArr[i18], cArr, i11);
                    i11 += 2;
                    r11 = i18 + 1;
                } else {
                    throw zzew.zzb();
                }
            }
            return new String(cArr, 0, i11);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i10)}));
    }

    public static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzd(byte[] bArr, int i, int i10) {
        return zza.zzb(bArr, i, i10);
    }
}
