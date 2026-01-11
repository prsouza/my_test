package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.activity.result.d;

final class zzht extends zzhy {
    public zzht(zzhv zzhv, String str, Double d10, boolean z) {
        super(zzhv, "measurement.test.double_flag", d10, true, (zzhx) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder d10 = d.d("Invalid double value for ", super.zzc(), ": ");
            d10.append((String) obj);
            Log.e("PhenotypeFlag", d10.toString());
            return null;
        }
    }
}
