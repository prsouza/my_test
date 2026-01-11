package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

public final class zzmm {
    private static final zzmm zza = new zzmm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmm() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzmm zzc() {
        return zza;
    }

    public static zzmm zzd(zzmm zzmm, zzmm zzmm2) {
        int i = zzmm.zzb + zzmm2.zzb;
        int[] copyOf = Arrays.copyOf(zzmm.zzc, i);
        System.arraycopy(zzmm2.zzc, 0, copyOf, zzmm.zzb, zzmm2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmm.zzd, i);
        System.arraycopy(zzmm2.zzd, 0, copyOf2, zzmm.zzb, zzmm2.zzb);
        return new zzmm(i, copyOf, copyOf2, true);
    }

    public static zzmm zze() {
        return new zzmm(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmm)) {
            return false;
        }
        zzmm zzmm = (zzmm) obj;
        int i = this.zzb;
        if (i == zzmm.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmm.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmm.zzd;
                    int i11 = this.zzb;
                    int i12 = 0;
                    while (i12 < i11) {
                        if (objArr[i12].equals(objArr2[i12])) {
                            i12++;
                        }
                    }
                    return true;
                } else if (iArr[i10] != iArr2[i10]) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i10 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public final int zza() {
        int i;
        int i10;
        int i11;
        int i12 = this.zze;
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzb; i14++) {
            int i15 = this.zzc[i14];
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i17 != 0) {
                if (i17 == 1) {
                    ((Long) this.zzd[i14]).longValue();
                    i11 = zzjj.zzA(i16 << 3) + 8;
                } else if (i17 == 2) {
                    int zzA = zzjj.zzA(i16 << 3);
                    int zzd2 = ((zzjb) this.zzd[i14]).zzd();
                    i13 = zzjj.zzA(zzd2) + zzd2 + zzA + i13;
                } else if (i17 == 3) {
                    int zzz = zzjj.zzz(i16);
                    i10 = zzz + zzz;
                    i = ((zzmm) this.zzd[i14]).zza();
                } else if (i17 == 5) {
                    ((Integer) this.zzd[i14]).intValue();
                    i11 = zzjj.zzA(i16 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzkm.zza());
                }
                i13 = i11 + i13;
            } else {
                long longValue = ((Long) this.zzd[i14]).longValue();
                i10 = zzjj.zzA(i16 << 3);
                i = zzjj.zzB(longValue);
            }
            i13 = i + i10 + i13;
        }
        this.zze = i13;
        return i13;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int zzA = zzjj.zzA(8);
            int zzd2 = ((zzjb) this.zzd[i11]).zzd();
            i10 += zzjj.zzA(zzd2) + zzd2 + zzjj.zzA(24) + zzjj.zzA(i12 >>> 3) + zzjj.zzA(16) + zzA + zzA;
        }
        this.zze = i10;
        return i10;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb2, int i) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzll.zzb(sb2, i, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzh(int i, Object obj) {
        if (this.zzf) {
            int i10 = this.zzb;
            int[] iArr = this.zzc;
            if (i10 == iArr.length) {
                int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
                this.zzc = Arrays.copyOf(iArr, i11);
                this.zzd = Arrays.copyOf(this.zzd, i11);
            }
            int[] iArr2 = this.zzc;
            int i12 = this.zzb;
            iArr2[i12] = i;
            this.zzd[i12] = obj;
            this.zzb = i12 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zznd zznd) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i10 = this.zzc[i];
                Object obj = this.zzd[i];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 == 0) {
                    zznd.zzt(i11, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zznd.zzm(i11, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zznd.zzd(i11, (zzjb) obj);
                } else if (i12 == 3) {
                    zznd.zzE(i11);
                    ((zzmm) obj).zzi(zznd);
                    zznd.zzh(i11);
                } else if (i12 == 5) {
                    zznd.zzk(i11, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkm.zza());
                }
            }
        }
    }
}
