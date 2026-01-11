package com.google.android.gms.internal.auth;

import java.util.Arrays;

public final class zzgq {
    private static final zzgq zza = new zzgq(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzgq() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgq(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z;
    }

    public static zzgq zza() {
        return zza;
    }

    public static zzgq zzb(zzgq zzgq, zzgq zzgq2) {
        int i = zzgq.zzb + zzgq2.zzb;
        int[] copyOf = Arrays.copyOf(zzgq.zzc, i);
        System.arraycopy(zzgq2.zzc, 0, copyOf, zzgq.zzb, zzgq2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgq.zzd, i);
        System.arraycopy(zzgq2.zzd, 0, copyOf2, zzgq.zzb, zzgq2.zzb);
        return new zzgq(i, copyOf, copyOf2, true);
    }

    public static zzgq zzc() {
        return new zzgq(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgq)) {
            return false;
        }
        zzgq zzgq = (zzgq) obj;
        int i = this.zzb;
        if (i == zzgq.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgq.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgq.zzd;
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

    public final void zzd() {
        this.zze = false;
    }

    public final void zze(StringBuilder sb2, int i) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzfs.zzb(sb2, i, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzf(int i, Object obj) {
        if (this.zze) {
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
}
