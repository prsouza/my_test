package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import androidx.fragment.app.o;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzjl extends zzim implements RandomAccess, zzlq {
    private static final zzjl zza;
    private double[] zzb;
    private int zzc;

    static {
        zzjl zzjl = new zzjl(new double[0], 0);
        zza = zzjl;
        zzjl.zzb();
    }

    public zzjl() {
        this(new double[10], 0);
    }

    private final String zzf(int i) {
        return d.b("Index:", i, ", Size:", this.zzc);
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        zzbS();
        if (i < 0 || i > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        double[] dArr = this.zzb;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i10 - i);
        } else {
            double[] dArr2 = new double[o.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzb, i, dArr2, i + 1, this.zzc - i);
            this.zzb = dArr2;
        }
        this.zzb[i] = doubleValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzbS();
        zzkk.zze(collection);
        if (!(collection instanceof zzjl)) {
            return super.addAll(collection);
        }
        zzjl zzjl = (zzjl) collection;
        int i = zzjl.zzc;
        if (i == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            double[] dArr = this.zzb;
            if (i11 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(zzjl.zzb, 0, this.zzb, this.zzc, zzjl.zzc);
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
        if (!(obj instanceof zzjl)) {
            return super.equals(obj);
        }
        zzjl zzjl = (zzjl) obj;
        if (this.zzc != zzjl.zzc) {
            return false;
        }
        double[] dArr = zzjl.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Double.valueOf(this.zzb[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i = (i * 31) + zzkk.zzc(Double.doubleToLongBits(this.zzb[i10]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.zzc;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.zzb[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbS();
        zzg(i);
        double[] dArr = this.zzb;
        double d10 = dArr[i];
        int i10 = this.zzc;
        if (i < i10 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i10 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final void removeRange(int i, int i10) {
        zzbS();
        if (i10 >= i) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i10, dArr, i, this.zzc - i10);
            this.zzc -= i10 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzbS();
        zzg(i);
        double[] dArr = this.zzb;
        double d10 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzkj zzd(int i) {
        if (i >= this.zzc) {
            return new zzjl(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d10) {
        zzbS();
        int i = this.zzc;
        double[] dArr = this.zzb;
        if (i == dArr.length) {
            double[] dArr2 = new double[o.a(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        dArr3[i10] = d10;
    }

    private zzjl(double[] dArr, int i) {
        this.zzb = dArr;
        this.zzc = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
