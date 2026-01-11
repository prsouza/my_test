package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import androidx.fragment.app.o;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzky extends zzim implements RandomAccess, zzki, zzlq {
    private static final zzky zza;
    private long[] zzb;
    private int zzc;

    static {
        zzky zzky = new zzky(new long[0], 0);
        zza = zzky;
        zzky.zzb();
    }

    public zzky() {
        this(new long[10], 0);
    }

    public static zzky zzf() {
        return zza;
    }

    private final String zzh(int i) {
        return d.b("Index:", i, ", Size:", this.zzc);
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        zzbS();
        if (i < 0 || i > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        long[] jArr = this.zzb;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i10 - i);
        } else {
            long[] jArr2 = new long[o.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzb, i, jArr2, i + 1, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzbS();
        zzkk.zze(collection);
        if (!(collection instanceof zzky)) {
            return super.addAll(collection);
        }
        zzky zzky = (zzky) collection;
        int i = zzky.zzc;
        if (i == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            long[] jArr = this.zzb;
            if (i11 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(zzky.zzb, 0, this.zzb, this.zzc, zzky.zzc);
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
        if (!(obj instanceof zzky)) {
            return super.equals(obj);
        }
        zzky zzky = (zzky) obj;
        if (this.zzc != zzky.zzc) {
            return false;
        }
        long[] jArr = zzky.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzi(i);
        return Long.valueOf(this.zzb[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i = (i * 31) + zzkk.zzc(this.zzb[i10]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.zzc;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.zzb[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbS();
        zzi(i);
        long[] jArr = this.zzb;
        long j10 = jArr[i];
        int i10 = this.zzc;
        if (i < i10 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i10 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final void removeRange(int i, int i10) {
        zzbS();
        if (i10 >= i) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i10, jArr, i, this.zzc - i10);
            this.zzc -= i10 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbS();
        zzi(i);
        long[] jArr = this.zzb;
        long j10 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.zzc;
    }

    public final long zza(int i) {
        zzi(i);
        return this.zzb[i];
    }

    /* renamed from: zze */
    public final zzki zzd(int i) {
        if (i >= this.zzc) {
            return new zzky(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(long j10) {
        zzbS();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[o.a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        jArr3[i10] = j10;
    }

    private zzky(long[] jArr, int i) {
        this.zzb = jArr;
        this.zzc = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
