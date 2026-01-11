package com.google.android.gms.measurement.internal;

import a.a;
import android.os.Bundle;
import androidx.fragment.app.o;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class zzet {
    public static final AtomicReference zza = new AtomicReference();
    public static final AtomicReference zzb = new AtomicReference();
    public static final AtomicReference zzc = new AtomicReference();
    private final zzes zzd;

    public zzet(zzes zzes) {
        this.zzd = zzes;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (zzlp.zzal(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder d10 = a.d("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = zzb(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (d10.length() != 1) {
                    d10.append(", ");
                }
                d10.append(str);
            }
        }
        d10.append("]");
        return d10.toString();
    }

    public final String zzb(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder d10 = a.d("Bundle[{");
        for (String next : bundle.keySet()) {
            if (d10.length() != 8) {
                d10.append(", ");
            }
            d10.append(zze(next));
            d10.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = zza(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            d10.append(str);
        }
        d10.append("}]");
        return d10.toString();
    }

    public final String zzc(zzav zzav) {
        String str;
        if (!this.zzd.zza()) {
            return zzav.toString();
        }
        StringBuilder d10 = a.d("origin=");
        d10.append(zzav.zzc);
        d10.append(",name=");
        d10.append(zzd(zzav.zza));
        d10.append(",params=");
        zzat zzat = zzav.zzb;
        if (zzat == null) {
            str = null;
        } else if (!this.zzd.zza()) {
            str = zzat.toString();
        } else {
            str = zzb(zzat.zzc());
        }
        d10.append(str);
        return d10.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zzg(str, zzhf.zzc, zzhf.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zzg(str, zzhg.zzb, zzhg.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return o.c("experiment_id(", str, ")");
        }
        return zzg(str, zzhh.zzb, zzhh.zza, zzc);
    }
}
