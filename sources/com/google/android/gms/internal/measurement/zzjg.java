package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;

final class zzjg extends zzjj {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzjg(byte[] bArr, int i, int i10) {
        super((zzji) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i10) | i10) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i10)}));
    }

    public final int zza() {
        return this.zzc - this.zzd;
    }

    public final void zzb(byte b10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
        }
    }

    public final void zzc(byte[] bArr, int i, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i10);
            this.zzd += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i10)}), e10);
        }
    }

    public final void zzd(int i, boolean z) throws IOException {
        zzq(i << 3);
        zzb(z ? (byte) 1 : 0);
    }

    public final void zze(int i, zzjb zzjb) throws IOException {
        zzq((i << 3) | 2);
        zzq(zzjb.zzd());
        zzjb.zzh(this);
    }

    public final void zzf(int i, int i10) throws IOException {
        zzq((i << 3) | 5);
        zzg(i10);
    }

    public final void zzg(int i) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            int i11 = i10 + 1;
            this.zzd = i11;
            bArr[i10] = (byte) (i & 255);
            int i12 = i11 + 1;
            this.zzd = i12;
            bArr[i11] = (byte) ((i >> 8) & 255);
            int i13 = i12 + 1;
            this.zzd = i13;
            bArr[i12] = (byte) ((i >> 16) & 255);
            this.zzd = i13 + 1;
            bArr[i13] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
        }
    }

    public final void zzh(int i, long j10) throws IOException {
        zzq((i << 3) | 1);
        zzi(j10);
    }

    public final void zzi(long j10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            int i10 = i + 1;
            this.zzd = i10;
            bArr[i] = (byte) (((int) j10) & 255);
            int i11 = i10 + 1;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j10 >> 8)) & 255);
            int i12 = i11 + 1;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j10 >> 16)) & 255);
            int i13 = i12 + 1;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j10 >> 24)) & 255);
            int i14 = i13 + 1;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
            int i15 = i14 + 1;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
            int i16 = i15 + 1;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
            this.zzd = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
        }
    }

    public final void zzj(int i, int i10) throws IOException {
        zzq(i << 3);
        zzk(i10);
    }

    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs((long) i);
        }
    }

    public final void zzl(byte[] bArr, int i, int i10) throws IOException {
        zzc(bArr, 0, i10);
    }

    public final void zzm(int i, String str) throws IOException {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i = this.zzd;
        try {
            int zzA = zzjj.zzA(str.length() * 3);
            int zzA2 = zzjj.zzA(str.length());
            if (zzA2 == zzA) {
                int i10 = i + zzA2;
                this.zzd = i10;
                int zzb2 = zzna.zzb(str, this.zzb, i10, this.zzc - i10);
                this.zzd = i;
                zzq((zzb2 - i) - zzA2);
                this.zzd = zzb2;
                return;
            }
            zzq(zzna.zzc(str));
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            this.zzd = zzna.zzb(str, bArr, i11, this.zzc - i11);
        } catch (zzmz e10) {
            this.zzd = i;
            zzE(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzjh(e11);
        }
    }

    public final void zzo(int i, int i10) throws IOException {
        zzq((i << 3) | i10);
    }

    public final void zzp(int i, int i10) throws IOException {
        zzq(i << 3);
        zzq(i10);
    }

    public final void zzq(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr[i10] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr2[i11] = (byte) i;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
        }
    }

    public final void zzr(int i, long j10) throws IOException {
        zzq(i << 3);
        zzs(j10);
    }

    public final void zzs(long j10) throws IOException {
        if (!zzjj.zzc || this.zzc - this.zzd < 10) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                this.zzd = i + 1;
                bArr[i] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr2[i10] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
            }
        } else {
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                zzmv.zzn(bArr3, (long) i11, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            zzmv.zzn(bArr4, (long) i12, (byte) ((int) j10));
        }
    }
}
