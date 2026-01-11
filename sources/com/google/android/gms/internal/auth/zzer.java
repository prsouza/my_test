package com.google.android.gms.internal.auth;

import androidx.fragment.app.o;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzer extends zzdn<Integer> implements RandomAccess, zzfx {
    private static final zzer zza;
    private int[] zzb;
    private int zzc;

    static {
        zzer zzer = new zzer(new int[0], 0);
        zza = zzer;
        zzer.zzb();
    }

    public zzer() {
        this(new int[10], 0);
    }

    private final String zzf(int i) {
        int i10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i);
        sb2.append(", Size:");
        sb2.append(i10);
        return sb2.toString();
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i < 0 || i > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        int[] iArr = this.zzb;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i10 - i);
        } else {
            int[] iArr2 = new int[o.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzb, i, iArr2, i + 1, this.zzc - i);
            this.zzb = iArr2;
        }
        this.zzb[i] = intValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        zza();
        zzev.zze(collection);
        if (!(collection instanceof zzer)) {
            return super.addAll(collection);
        }
        zzer zzer = (zzer) collection;
        int i = zzer.zzc;
        if (i == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            int[] iArr = this.zzb;
            if (i11 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(zzer.zzb, 0, this.zzb, this.zzc, zzer.zzc);
            this.zzc = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzer)) {
            return super.equals(obj);
        }
        zzer zzer = (zzer) obj;
        if (this.zzc != zzer.zzc) {
            return false;
        }
        int[] iArr = zzer.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzg(i);
        return Integer.valueOf(this.zzb[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i = (i * 31) + this.zzb[i10];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.zzc;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.zzb[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        int[] iArr = this.zzb;
        int i10 = iArr[i];
        int i11 = this.zzc;
        if (i < i11 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i11 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i10);
    }

    public final void removeRange(int i, int i10) {
        zza();
        if (i10 >= i) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i10, iArr, i, this.zzc - i10);
            this.zzc -= i10 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzg(i);
        int[] iArr = this.zzb;
        int i10 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzeu zzd(int i) {
        if (i >= this.zzc) {
            return new zzer(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(int i) {
        zza();
        int i10 = this.zzc;
        int[] iArr = this.zzb;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[o.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        iArr3[i11] = i;
    }

    private zzer(int[] iArr, int i) {
        this.zzb = iArr;
        this.zzc = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Integer) obj).intValue());
        return true;
    }
}
