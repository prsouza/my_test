package com.google.android.gms.internal.auth;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;

final class zzdq {
    public static int zza(byte[] bArr, int i, zzdp zzdp) throws zzew {
        int zzj = zzj(bArr, i, zzdp);
        int i10 = zzdp.zza;
        if (i10 < 0) {
            throw zzew.zzc();
        } else if (i10 > bArr.length - zzj) {
            throw zzew.zzf();
        } else if (i10 == 0) {
            zzdp.zzc = zzeb.zzb;
            return zzj;
        } else {
            zzdp.zzc = zzeb.zzk(bArr, zzj, i10);
            return zzj + i10;
        }
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzgb zzgb, byte[] bArr, int i, int i10, int i11, zzdp zzdp) throws IOException {
        zzft zzft = (zzft) zzgb;
        Object zzd = zzft.zzd();
        int zzb = zzft.zzb(zzd, bArr, i, i10, i11, zzdp);
        zzft.zze(zzd);
        zzdp.zzc = zzd;
        return zzb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzd(com.google.android.gms.internal.auth.zzgb r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.auth.zzdp r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zzk(r8, r7, r0, r10)
            int r8 = r10.zza
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zzd()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zzg(r1, r2, r3, r4, r5)
            r6.zze(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.auth.zzew r6 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdq.zzd(com.google.android.gms.internal.auth.zzgb, byte[], int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    public static int zze(zzgb<?> zzgb, int i, byte[] bArr, int i10, int i11, zzeu<?> zzeu, zzdp zzdp) throws IOException {
        int zzd = zzd(zzgb, bArr, i10, i11, zzdp);
        zzeu.add(zzdp.zzc);
        while (zzd < i11) {
            int zzj = zzj(bArr, zzd, zzdp);
            if (i != zzdp.zza) {
                break;
            }
            zzd = zzd(zzgb, bArr, zzj, i11, zzdp);
            zzeu.add(zzdp.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzeu<?> zzeu, zzdp zzdp) throws IOException {
        zzer zzer = (zzer) zzeu;
        int zzj = zzj(bArr, i, zzdp);
        int i10 = zzdp.zza + zzj;
        while (zzj < i10) {
            zzj = zzj(bArr, zzj, zzdp);
            zzer.zze(zzdp.zza);
        }
        if (zzj == i10) {
            return zzj;
        }
        throw zzew.zzf();
    }

    public static int zzg(byte[] bArr, int i, zzdp zzdp) throws zzew {
        int zzj = zzj(bArr, i, zzdp);
        int i10 = zzdp.zza;
        if (i10 < 0) {
            throw zzew.zzc();
        } else if (i10 == 0) {
            zzdp.zzc = BuildConfig.FLAVOR;
            return zzj;
        } else {
            zzdp.zzc = new String(bArr, zzj, i10, zzev.zza);
            return zzj + i10;
        }
    }

    public static int zzh(byte[] bArr, int i, zzdp zzdp) throws zzew {
        int zzj = zzj(bArr, i, zzdp);
        int i10 = zzdp.zza;
        if (i10 < 0) {
            throw zzew.zzc();
        } else if (i10 == 0) {
            zzdp.zzc = BuildConfig.FLAVOR;
            return zzj;
        } else {
            zzdp.zzc = zzhd.zzb(bArr, zzj, i10);
            return zzj + i10;
        }
    }

    public static int zzi(int i, byte[] bArr, int i10, int i11, zzgq zzgq, zzdp zzdp) throws zzew {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 == 0) {
                int zzm = zzm(bArr, i10, zzdp);
                zzgq.zzf(i, Long.valueOf(zzdp.zzb));
                return zzm;
            } else if (i12 == 1) {
                zzgq.zzf(i, Long.valueOf(zzn(bArr, i10)));
                return i10 + 8;
            } else if (i12 == 2) {
                int zzj = zzj(bArr, i10, zzdp);
                int i13 = zzdp.zza;
                if (i13 < 0) {
                    throw zzew.zzc();
                } else if (i13 <= bArr.length - zzj) {
                    if (i13 == 0) {
                        zzgq.zzf(i, zzeb.zzb);
                    } else {
                        zzgq.zzf(i, zzeb.zzk(bArr, zzj, i13));
                    }
                    return zzj + i13;
                } else {
                    throw zzew.zzf();
                }
            } else if (i12 == 3) {
                int i14 = (i & -8) | 4;
                zzgq zzc = zzgq.zzc();
                int i15 = 0;
                while (true) {
                    if (i10 >= i11) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i10, zzdp);
                    int i16 = zzdp.zza;
                    if (i16 == i14) {
                        i15 = i16;
                        i10 = zzj2;
                        break;
                    }
                    i15 = i16;
                    i10 = zzi(i16, bArr, zzj2, i11, zzc, zzdp);
                }
                if (i10 > i11 || i15 != i14) {
                    throw zzew.zzd();
                }
                zzgq.zzf(i, zzc);
                return i10;
            } else if (i12 == 5) {
                zzgq.zzf(i, Integer.valueOf(zzb(bArr, i10)));
                return i10 + 4;
            } else {
                throw zzew.zza();
            }
        } else {
            throw zzew.zza();
        }
    }

    public static int zzj(byte[] bArr, int i, zzdp zzdp) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzk(b10, bArr, i10, zzdp);
        }
        zzdp.zza = b10;
        return i10;
    }

    public static int zzk(int i, byte[] bArr, int i10, zzdp zzdp) {
        int i11 = i & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzdp.zza = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzdp.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzdp.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzdp.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                zzdp.zza = i19;
                return i20;
            }
        }
    }

    public static int zzl(int i, byte[] bArr, int i10, int i11, zzeu<?> zzeu, zzdp zzdp) {
        zzer zzer = (zzer) zzeu;
        int zzj = zzj(bArr, i10, zzdp);
        zzer.zze(zzdp.zza);
        while (zzj < i11) {
            int zzj2 = zzj(bArr, zzj, zzdp);
            if (i != zzdp.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzdp);
            zzer.zze(zzdp.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzdp zzdp) {
        int i10 = i + 1;
        long j10 = (long) bArr[i];
        if (j10 < 0) {
            int i11 = i10 + 1;
            byte b10 = bArr[i10];
            long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
            int i12 = 7;
            while (b10 < 0) {
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                i12 += 7;
                j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i12;
                int i14 = i13;
                b10 = b11;
                i11 = i14;
            }
            zzdp.zzb = j11;
            return i11;
        }
        zzdp.zzb = j10;
        return i10;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
