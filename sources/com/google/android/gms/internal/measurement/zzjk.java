package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

final class zzjk implements zznd {
    private final zzjj zza;

    private zzjk(zzjj zzjj) {
        zzkk.zzf(zzjj, "output");
        this.zza = zzjj;
        zzjj.zza = this;
    }

    public static zzjk zza(zzjj zzjj) {
        zzjk zzjk = zzjj.zza;
        return zzjk != null ? zzjk : new zzjk(zzjj);
    }

    public final void zzA(int i, int i10) throws IOException {
        this.zza.zzp(i, (i10 >> 31) ^ (i10 + i10));
    }

    public final void zzB(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                i11 += zzjj.zzA((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                zzjj zzjj = this.zza;
                int intValue2 = ((Integer) list.get(i10)).intValue();
                zzjj.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            zzjj zzjj2 = this.zza;
            int intValue3 = ((Integer) list.get(i10)).intValue();
            zzjj2.zzp(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i10++;
        }
    }

    public final void zzC(int i, long j10) throws IOException {
        this.zza.zzr(i, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzD(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long longValue = ((Long) list.get(i12)).longValue();
                i11 += zzjj.zzB((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                zzjj zzjj = this.zza;
                long longValue2 = ((Long) list.get(i10)).longValue();
                zzjj.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            zzjj zzjj2 = this.zza;
            long longValue3 = ((Long) list.get(i10)).longValue();
            zzjj2.zzr(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i10++;
        }
    }

    @Deprecated
    public final void zzE(int i) throws IOException {
        this.zza.zzo(i, 3);
    }

    public final void zzF(int i, String str) throws IOException {
        this.zza.zzm(i, str);
    }

    public final void zzG(int i, List list) throws IOException {
        int i10 = 0;
        if (list instanceof zzkr) {
            zzkr zzkr = (zzkr) list;
            while (i10 < list.size()) {
                Object zzf = zzkr.zzf(i10);
                if (zzf instanceof String) {
                    this.zza.zzm(i, (String) zzf);
                } else {
                    this.zza.zze(i, (zzjb) zzf);
                }
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzm(i, (String) list.get(i10));
            i10++;
        }
    }

    public final void zzH(int i, int i10) throws IOException {
        this.zza.zzp(i, i10);
    }

    public final void zzI(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzjj.zzA(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzp(i, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzJ(int i, long j10) throws IOException {
        this.zza.zzr(i, j10);
    }

    public final void zzK(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzjj.zzB(((Long) list.get(i12)).longValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzr(i, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzd(i, z);
    }

    public final void zzc(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).booleanValue();
                i11++;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : 0);
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzd(i, ((Boolean) list.get(i10)).booleanValue());
            i10++;
        }
    }

    public final void zzd(int i, zzjb zzjb) throws IOException {
        this.zza.zze(i, zzjb);
    }

    public final void zze(int i, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i, (zzjb) list.get(i10));
        }
    }

    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).doubleValue();
                i11 += 8;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzo(i, 4);
    }

    public final void zzi(int i, int i10) throws IOException {
        this.zza.zzj(i, i10);
    }

    public final void zzj(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzjj.zzv(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzj(i, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzk(int i, int i10) throws IOException {
        this.zza.zzf(i, i10);
    }

    public final void zzl(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).intValue();
                i11 += 4;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzf(i, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzm(int i, long j10) throws IOException {
        this.zza.zzh(i, j10);
    }

    public final void zzn(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).longValue();
                i11 += 8;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzo(int i, float f10) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).floatValue();
                i11 += 4;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public final void zzq(int i, Object obj, zzlu zzlu) throws IOException {
        zzjj zzjj = this.zza;
        zzjj.zzo(i, 3);
        zzlu.zzi((zzlj) obj, zzjj.zza);
        zzjj.zzo(i, 4);
    }

    public final void zzr(int i, int i10) throws IOException {
        this.zza.zzj(i, i10);
    }

    public final void zzs(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzjj.zzv(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzj(i, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzt(int i, long j10) throws IOException {
        this.zza.zzr(i, j10);
    }

    public final void zzu(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzjj.zzB(((Long) list.get(i12)).longValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzr(i, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzv(int i, Object obj, zzlu zzlu) throws IOException {
        zzlj zzlj = (zzlj) obj;
        zzjg zzjg = (zzjg) this.zza;
        zzjg.zzq((i << 3) | 2);
        zzil zzil = (zzil) zzlj;
        int zzbu = zzil.zzbu();
        if (zzbu == -1) {
            zzbu = zzlu.zza(zzil);
            zzil.zzbx(zzbu);
        }
        zzjg.zzq(zzbu);
        zzlu.zzi(zzlj, zzjg.zza);
    }

    public final void zzw(int i, int i10) throws IOException {
        this.zza.zzf(i, i10);
    }

    public final void zzx(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).intValue();
                i11 += 4;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzf(i, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzy(int i, long j10) throws IOException {
        this.zza.zzh(i, j10);
    }

    public final void zzz(int i, List list, boolean z) throws IOException {
        int i10 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).longValue();
                i11 += 8;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
