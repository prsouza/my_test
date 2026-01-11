package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import androidx.fragment.app.o;
import java.util.Arrays;
import java.util.RandomAccess;

final class zzls extends zzim implements RandomAccess {
    private static final zzls zza;
    private Object[] zzb;
    private int zzc;

    static {
        zzls zzls = new zzls(new Object[0], 0);
        zza = zzls;
        zzls.zzb();
    }

    public zzls() {
        this(new Object[10], 0);
    }

    public static zzls zze() {
        return zza;
    }

    private final String zzf(int i) {
        return d.b("Index:", i, ", Size:", this.zzc);
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    public final void add(int i, Object obj) {
        int i10;
        zzbS();
        if (i < 0 || i > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        Object[] objArr = this.zzb;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i10 - i);
        } else {
            Object[] objArr2 = new Object[o.a(i10, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.zzb, i, objArr2, i + 1, this.zzc - i);
            this.zzb = objArr2;
        }
        this.zzb[i] = obj;
        this.zzc++;
        this.modCount++;
    }

    public final Object get(int i) {
        zzg(i);
        return this.zzb[i];
    }

    public final Object remove(int i) {
        zzbS();
        zzg(i);
        Object[] objArr = this.zzb;
        Object obj = objArr[i];
        int i10 = this.zzc;
        if (i < i10 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i10 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        zzbS();
        zzg(i);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzkj zzd(int i) {
        if (i >= this.zzc) {
            return new zzls(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzls(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public final boolean add(Object obj) {
        zzbS();
        int i = this.zzc;
        Object[] objArr = this.zzb;
        if (i == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        objArr2[i10] = obj;
        this.modCount++;
        return true;
    }
}
