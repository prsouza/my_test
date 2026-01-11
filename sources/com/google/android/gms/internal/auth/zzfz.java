package com.google.android.gms.internal.auth;

import androidx.fragment.app.o;
import java.util.Arrays;
import java.util.RandomAccess;

final class zzfz<E> extends zzdn<E> implements RandomAccess {
    private static final zzfz<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzfz<Object> zzfz = new zzfz<>(new Object[0], 0);
        zza = zzfz;
        zzfz.zzb();
    }

    public zzfz() {
        this(new Object[10], 0);
    }

    public static <E> zzfz<E> zze() {
        return zza;
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

    public final void add(int i, E e10) {
        int i10;
        zza();
        if (i < 0 || i > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        E[] eArr = this.zzb;
        if (i10 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i10 - i);
        } else {
            E[] eArr2 = new Object[o.a(i10, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
            this.zzb = eArr2;
        }
        this.zzb[i] = e10;
        this.zzc++;
        this.modCount++;
    }

    public final E get(int i) {
        zzg(i);
        return this.zzb[i];
    }

    public final E remove(int i) {
        zza();
        zzg(i);
        E[] eArr = this.zzb;
        E e10 = eArr[i];
        int i10 = this.zzc;
        if (i < i10 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i10 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e10;
    }

    public final E set(int i, E e10) {
        zza();
        zzg(i);
        E[] eArr = this.zzb;
        E e11 = eArr[i];
        eArr[i] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzeu zzd(int i) {
        if (i >= this.zzc) {
            return new zzfz(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzfz(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    public final boolean add(E e10) {
        zza();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        eArr2[i10] = e10;
        this.modCount++;
        return true;
    }
}
