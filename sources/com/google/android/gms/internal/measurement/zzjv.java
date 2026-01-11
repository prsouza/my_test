package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import androidx.fragment.app.o;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzjv extends zzim implements RandomAccess, zzlq {
    private static final zzjv zza;
    private float[] zzb;
    private int zzc;

    static {
        zzjv zzjv = new zzjv(new float[0], 0);
        zza = zzjv;
        zzjv.zzb();
    }

    public zzjv() {
        this(new float[10], 0);
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
        float floatValue = ((Float) obj).floatValue();
        zzbS();
        if (i < 0 || i > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        float[] fArr = this.zzb;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i10 - i);
        } else {
            float[] fArr2 = new float[o.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzb, i, fArr2, i + 1, this.zzc - i);
            this.zzb = fArr2;
        }
        this.zzb[i] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzbS();
        zzkk.zze(collection);
        if (!(collection instanceof zzjv)) {
            return super.addAll(collection);
        }
        zzjv zzjv = (zzjv) collection;
        int i = zzjv.zzc;
        if (i == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            float[] fArr = this.zzb;
            if (i11 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(zzjv.zzb, 0, this.zzb, this.zzc, zzjv.zzc);
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
        if (!(obj instanceof zzjv)) {
            return super.equals(obj);
        }
        zzjv zzjv = (zzjv) obj;
        if (this.zzc != zzjv.zzc) {
            return false;
        }
        float[] fArr = zzjv.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Float.floatToIntBits(this.zzb[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Float.valueOf(this.zzb[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i = (i * 31) + Float.floatToIntBits(this.zzb[i10]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.zzc;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.zzb[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbS();
        zzg(i);
        float[] fArr = this.zzb;
        float f10 = fArr[i];
        int i10 = this.zzc;
        if (i < i10 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i10 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i, int i10) {
        zzbS();
        if (i10 >= i) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i10, fArr, i, this.zzc - i10);
            this.zzc -= i10 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzbS();
        zzg(i);
        float[] fArr = this.zzb;
        float f10 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzkj zzd(int i) {
        if (i >= this.zzc) {
            return new zzjv(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f10) {
        zzbS();
        int i = this.zzc;
        float[] fArr = this.zzb;
        if (i == fArr.length) {
            float[] fArr2 = new float[o.a(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        fArr3[i10] = f10;
    }

    private zzjv(float[] fArr, int i) {
        this.zzb = fArr;
        this.zzc = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
