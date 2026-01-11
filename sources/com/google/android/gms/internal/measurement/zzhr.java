package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.activity.result.d;

final class zzhr extends zzhy {
    public zzhr(zzhv zzhv, String str, Long l10, boolean z) {
        super(zzhv, str, l10, true, (zzhx) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder d10 = d.d("Invalid long value for ", super.zzc(), ": ");
            d10.append((String) obj);
            Log.e("PhenotypeFlag", d10.toString());
            return null;
        }
    }
}
