package com.google.android.gms.internal.measurement;

import a.a;

final class zzna {
    private static final zzmx zza = new zzmy();

    static {
        if (zzmv.zzx() && zzmv.zzy()) {
            int i = zzin.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i10) {
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

    public static int zzb(CharSequence charSequence, byte[] bArr, int i, int i10) {
        int i11;
        int i12;
        int i13;
        char charAt;
        int length = charSequence.length();
        int i14 = i10 + i;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i) < i14 && (charAt = charSequence.charAt(i15)) < 128) {
            bArr[i13] = (byte) charAt;
            i15++;
        }
        if (i15 == length) {
            return i + length;
        }
        int i16 = i + i15;
        while (i15 < length) {
            char charAt2 = charSequence.charAt(i15);
            if (charAt2 < 128 && i16 < i14) {
                i12 = i16 + 1;
                bArr[i16] = (byte) charAt2;
            } else if (charAt2 < 2048 && i16 <= i14 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((charAt2 >>> 6) | 960);
                i16 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 & '?') | 128);
                i15++;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i16 <= i14 - 3) {
                int i18 = i16 + 1;
                bArr[i16] = (byte) ((charAt2 >>> 12) | 480);
                int i19 = i18 + 1;
                bArr[i18] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i12 = i19 + 1;
                bArr[i19] = (byte) ((charAt2 & '?') | 128);
            } else if (i16 <= i14 - 4) {
                int i20 = i15 + 1;
                if (i20 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i20);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i21 = i16 + 1;
                        bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                        int i22 = i21 + 1;
                        bArr[i21] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i23 = i22 + 1;
                        bArr[i22] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i16 = i23 + 1;
                        bArr[i23] = (byte) ((codePoint & 63) | 128);
                        i15 = i20;
                        i15++;
                    } else {
                        i15 = i20;
                    }
                }
                throw new zzmz(i15 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i11 = i15 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i11)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i16);
            } else {
                throw new zzmz(i15, length);
            }
            i16 = i12;
            i15++;
        }
        return i16;
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new zzmz(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        StringBuilder d10 = a.d("UTF-8 length does not fit in int: ");
        d10.append(((long) i11) + 4294967296L);
        throw new IllegalArgumentException(d10.toString());
    }

    public static String zzd(byte[] bArr, int i, int i10) throws zzkm {
        int i11;
        int length = bArr.length;
        if ((i | i10 | ((length - i) - i10)) >= 0) {
            int i12 = i + i10;
            char[] cArr = new char[i10];
            int i13 = 0;
            while (r11 < i12) {
                byte b10 = bArr[r11];
                if (!zzmw.zzd(b10)) {
                    break;
                }
                i = r11 + 1;
                cArr[i11] = (char) b10;
                i13 = i11 + 1;
            }
            while (r11 < i12) {
                int i14 = r11 + 1;
                byte b11 = bArr[r11];
                if (zzmw.zzd(b11)) {
                    int i15 = i11 + 1;
                    cArr[i11] = (char) b11;
                    r11 = i14;
                    while (true) {
                        i11 = i15;
                        if (r11 >= i12) {
                            break;
                        }
                        byte b12 = bArr[r11];
                        if (!zzmw.zzd(b12)) {
                            break;
                        }
                        r11++;
                        i15 = i11 + 1;
                        cArr[i11] = (char) b12;
                    }
                } else if (b11 < -32) {
                    if (i14 < i12) {
                        zzmw.zzc(b11, bArr[i14], cArr, i11);
                        r11 = i14 + 1;
                        i11++;
                    } else {
                        throw zzkm.zzc();
                    }
                } else if (b11 < -16) {
                    if (i14 < i12 - 1) {
                        int i16 = i14 + 1;
                        zzmw.zzb(b11, bArr[i14], bArr[i16], cArr, i11);
                        r11 = i16 + 1;
                        i11++;
                    } else {
                        throw zzkm.zzc();
                    }
                } else if (i14 < i12 - 2) {
                    int i17 = i14 + 1;
                    int i18 = i17 + 1;
                    zzmw.zza(b11, bArr[i14], bArr[i17], bArr[i18], cArr, i11);
                    i11 += 2;
                    r11 = i18 + 1;
                } else {
                    throw zzkm.zzc();
                }
            }
            return new String(cArr, 0, i11);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i10)}));
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i, int i10) {
        return zza.zzb(bArr, i, i10);
    }
}
