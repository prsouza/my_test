package com.google.android.gms.internal.auth;

import java.util.List;

public final class zzhi extends zzeq<zzhi, zzhh> implements zzfr {
    /* access modifiers changed from: private */
    public static final zzhi zzb;
    private zzeu<String> zzd = zzeq.zzd();

    static {
        zzhi zzhi = new zzhi();
        zzb = zzhi;
        zzeq.zzi(zzhi.class, zzhi);
    }

    private zzhi() {
    }

    public static zzhi zzl(byte[] bArr) throws zzew {
        return (zzhi) zzeq.zzb(zzb, bArr);
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzeq.zzg(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        } else if (i10 == 3) {
            return new zzhi();
        } else {
            if (i10 == 4) {
                return new zzhh((zzhg) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List<String> zzm() {
        return this.zzd;
    }
}
