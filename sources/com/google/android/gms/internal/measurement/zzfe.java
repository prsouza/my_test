package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import java.util.List;
import java.util.Objects;

public final class zzfe extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfe zza;
    private int zze;
    private long zzf;
    private String zzg = BuildConfig.FLAVOR;
    private int zzh;
    private zzkj zzi = zzkc.zzbG();
    private zzkj zzj = zzkc.zzbG();
    /* access modifiers changed from: private */
    public zzkj zzk = zzkc.zzbG();
    private String zzl = BuildConfig.FLAVOR;
    private boolean zzm;
    private zzkj zzn = zzkc.zzbG();
    private zzkj zzo = zzkc.zzbG();
    private String zzp = BuildConfig.FLAVOR;

    static {
        zzfe zzfe = new zzfe();
        zza = zzfe;
        zzkc.zzbM(zzfe.class, zzfe);
    }

    private zzfe() {
    }

    public static zzfd zze() {
        return (zzfd) zza.zzbA();
    }

    public static zzfe zzg() {
        return zza;
    }

    public static /* synthetic */ void zzo(zzfe zzfe, int i, zzfc zzfc) {
        Objects.requireNonNull(zzfc);
        zzkj zzkj = zzfe.zzj;
        if (!zzkj.zzc()) {
            zzfe.zzj = zzkc.zzbH(zzkj);
        }
        zzfe.zzj.set(i, zzfc);
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final int zzb() {
        return this.zzj.size();
    }

    public final long zzc() {
        return this.zzf;
    }

    public final zzfc zzd(int i) {
        return (zzfc) this.zzj.get(i);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final String zzi() {
        return this.zzp;
    }

    public final List zzj() {
        return this.zzk;
    }

    public final List zzk() {
        return this.zzo;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzfi.class, "zzj", zzfc.class, "zzk", zzeh.class, "zzl", "zzm", "zzn", zzgs.class, "zzo", zzfa.class, "zzp"});
        } else if (i10 == 3) {
            return new zzfe();
        } else {
            if (i10 == 4) {
                return new zzfd((zzey) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final List zzm() {
        return this.zzn;
    }

    public final List zzn() {
        return this.zzi;
    }

    public final boolean zzq() {
        return this.zzm;
    }

    public final boolean zzr() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }
}
