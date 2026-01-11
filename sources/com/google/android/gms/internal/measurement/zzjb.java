package com.google.android.gms.internal.measurement;

import a8.a;
import androidx.activity.result.d;
import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzjb implements Iterable, Serializable {
    private static final Comparator zza = new zzit();
    public static final zzjb zzb = new zziy(zzkk.zzd);
    private static final zzja zzd = new zzja((zziz) null);
    private int zzc = 0;

    static {
        int i = zzin.zza;
    }

    public static int zzj(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.b("Beginning index: ", i, " < 0"));
        } else if (i10 < i) {
            throw new IndexOutOfBoundsException(d.b("Beginning index larger than ending index: ", i, ", ", i10));
        } else {
            throw new IndexOutOfBoundsException(d.b("End index: ", i10, " >= ", i11));
        }
    }

    public static zzjb zzl(byte[] bArr, int i, int i10) {
        zzj(i, i + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return new zziy(bArr2);
    }

    public static zzjb zzm(String str) {
        return new zziy(str.getBytes(zzkk.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zze(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzis(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzmj.zza(this) : zzmj.zza(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i10, int i11);

    public abstract zzjb zzf(int i, int i10);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzir zzir) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? BuildConfig.FLAVOR : zzg(charset);
    }
}
