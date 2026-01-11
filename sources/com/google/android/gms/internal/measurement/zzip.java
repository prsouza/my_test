package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;

final class zzip {
    public static int zza(byte[] bArr, int i, zzio zzio) throws zzkm {
        int zzj = zzj(bArr, i, zzio);
        int i10 = zzio.zza;
        if (i10 < 0) {
            throw zzkm.zzd();
        } else if (i10 > bArr.length - zzj) {
            throw zzkm.zzf();
        } else if (i10 == 0) {
            zzio.zzc = zzjb.zzb;
            return zzj;
        } else {
            zzio.zzc = zzjb.zzl(bArr, zzj, i10);
            return zzj + i10;
        }
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzlu zzlu, byte[] bArr, int i, int i10, int i11, zzio zzio) throws IOException {
        zzlm zzlm = (zzlm) zzlu;
        Object zze = zzlm.zze();
        int zzc = zzlm.zzc(zze, bArr, i, i10, i11, zzio);
        zzlm.zzf(zze);
        zzio.zzc = zze;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzd(com.google.android.gms.internal.measurement.zzlu r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.zzio r10) throws java.io.IOException {
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
            java.lang.Object r9 = r6.zze()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zzh(r1, r2, r3, r4, r5)
            r6.zzf(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzkm r6 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzip.zzd(com.google.android.gms.internal.measurement.zzlu, byte[], int, int, com.google.android.gms.internal.measurement.zzio):int");
    }

    public static int zze(zzlu zzlu, int i, byte[] bArr, int i10, int i11, zzkj zzkj, zzio zzio) throws IOException {
        int zzd = zzd(zzlu, bArr, i10, i11, zzio);
        zzkj.add(zzio.zzc);
        while (zzd < i11) {
            int zzj = zzj(bArr, zzd, zzio);
            if (i != zzio.zza) {
                break;
            }
            zzd = zzd(zzlu, bArr, zzj, i11, zzio);
            zzkj.add(zzio.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzkj zzkj, zzio zzio) throws IOException {
        zzkd zzkd = (zzkd) zzkj;
        int zzj = zzj(bArr, i, zzio);
        int i10 = zzio.zza + zzj;
        while (zzj < i10) {
            zzj = zzj(bArr, zzj, zzio);
            zzkd.zzh(zzio.zza);
        }
        if (zzj == i10) {
            return zzj;
        }
        throw zzkm.zzf();
    }

    public static int zzg(byte[] bArr, int i, zzio zzio) throws zzkm {
        int zzj = zzj(bArr, i, zzio);
        int i10 = zzio.zza;
        if (i10 < 0) {
            throw zzkm.zzd();
        } else if (i10 == 0) {
            zzio.zzc = BuildConfig.FLAVOR;
            return zzj;
        } else {
            zzio.zzc = new String(bArr, zzj, i10, zzkk.zzb);
            return zzj + i10;
        }
    }

    public static int zzh(byte[] bArr, int i, zzio zzio) throws zzkm {
        int zzj = zzj(bArr, i, zzio);
        int i10 = zzio.zza;
        if (i10 < 0) {
            throw zzkm.zzd();
        } else if (i10 == 0) {
            zzio.zzc = BuildConfig.FLAVOR;
            return zzj;
        } else {
            zzio.zzc = zzna.zzd(bArr, zzj, i10);
            return zzj + i10;
        }
    }

    public static int zzi(int i, byte[] bArr, int i10, int i11, zzmm zzmm, zzio zzio) throws zzkm {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 == 0) {
                int zzm = zzm(bArr, i10, zzio);
                zzmm.zzh(i, Long.valueOf(zzio.zzb));
                return zzm;
            } else if (i12 == 1) {
                zzmm.zzh(i, Long.valueOf(zzn(bArr, i10)));
                return i10 + 8;
            } else if (i12 == 2) {
                int zzj = zzj(bArr, i10, zzio);
                int i13 = zzio.zza;
                if (i13 < 0) {
                    throw zzkm.zzd();
                } else if (i13 <= bArr.length - zzj) {
                    if (i13 == 0) {
                        zzmm.zzh(i, zzjb.zzb);
                    } else {
                        zzmm.zzh(i, zzjb.zzl(bArr, zzj, i13));
                    }
                    return zzj + i13;
                } else {
                    throw zzkm.zzf();
                }
            } else if (i12 == 3) {
                int i14 = (i & -8) | 4;
                zzmm zze = zzmm.zze();
                int i15 = 0;
                while (true) {
                    if (i10 >= i11) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i10, zzio);
                    int i16 = zzio.zza;
                    if (i16 == i14) {
                        i15 = i16;
                        i10 = zzj2;
                        break;
                    }
                    i15 = i16;
                    i10 = zzi(i16, bArr, zzj2, i11, zze, zzio);
                }
                if (i10 > i11 || i15 != i14) {
                    throw zzkm.zze();
                }
                zzmm.zzh(i, zze);
                return i10;
            } else if (i12 == 5) {
                zzmm.zzh(i, Integer.valueOf(zzb(bArr, i10)));
                return i10 + 4;
            } else {
                throw zzkm.zzb();
            }
        } else {
            throw zzkm.zzb();
        }
    }

    public static int zzj(byte[] bArr, int i, zzio zzio) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzk(b10, bArr, i10, zzio);
        }
        zzio.zza = b10;
        return i10;
    }

    public static int zzk(int i, byte[] bArr, int i10, zzio zzio) {
        int i11 = i & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzio.zza = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzio.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzio.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzio.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                zzio.zza = i19;
                return i20;
            }
        }
    }

    public static int zzl(int i, byte[] bArr, int i10, int i11, zzkj zzkj, zzio zzio) {
        zzkd zzkd = (zzkd) zzkj;
        int zzj = zzj(bArr, i10, zzio);
        zzkd.zzh(zzio.zza);
        while (zzj < i11) {
            int zzj2 = zzj(bArr, zzj, zzio);
            if (i != zzio.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzio);
            zzkd.zzh(zzio.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzio zzio) {
        int i10 = i + 1;
        long j10 = (long) bArr[i];
        if (j10 >= 0) {
            zzio.zzb = j10;
            return i10;
        }
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
        zzio.zzb = j11;
        return i11;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
