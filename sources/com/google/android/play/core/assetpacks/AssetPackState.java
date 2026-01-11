package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.github.mikephil.charting.utils.Utils;
import l6.b1;
import l6.f0;
import l6.x0;
import l6.y1;
import l6.z;

public abstract class AssetPackState {
    public static AssetPackState h(String str, int i, int i10, long j10, long j11, double d10, int i11, String str2, String str3) {
        return new f0(str, i, i10, j10, j11, (int) Math.rint(100.0d * d10), i11, str2, str3);
    }

    public static AssetPackState i(Bundle bundle, String str, x0 x0Var, y1 y1Var, z zVar) {
        double d10;
        int i;
        Bundle bundle2 = bundle;
        String str2 = str;
        x0 x0Var2 = x0Var;
        int zza = zVar.zza(bundle2.getInt(b1.x("status", str2)));
        int i10 = bundle2.getInt(b1.x("error_code", str2));
        long j10 = bundle2.getLong(b1.x("bytes_downloaded", str2));
        long j11 = bundle2.getLong(b1.x("total_bytes_to_download", str2));
        synchronized (x0Var) {
            Double d11 = (Double) x0Var2.f8086a.get(str2);
            if (d11 == null) {
                d10 = Utils.DOUBLE_EPSILON;
            } else {
                d10 = d11.doubleValue();
            }
        }
        long j12 = bundle2.getLong(b1.x("pack_version", str2));
        long j13 = bundle2.getLong(b1.x("pack_base_version", str2));
        int i11 = 1;
        int i12 = 4;
        if (zza == 4) {
            if (!(j13 == 0 || j13 == j12)) {
                i11 = 2;
            }
            i = i11;
        } else {
            i = 1;
            i12 = zza;
        }
        return h(str, i12, i10, j10, j11, d10, i, bundle2.getString(b1.x("pack_version_tag", str2), String.valueOf(bundle2.getInt("app_version_code"))), y1Var.a(str2));
    }

    public abstract long a();

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public abstract long e();

    public abstract int f();

    public abstract int g();

    public abstract String j();

    public abstract String k();
}
