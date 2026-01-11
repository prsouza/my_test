package com.google.android.gms.auth;

import android.text.TextUtils;
import androidx.appcompat.widget.d;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.internal.Preconditions;

public final class CookieUtil {
    private CookieUtil() {
    }

    public static String getCookieUrl(String str, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        String str2 = true != zza(bool) ? "http" : "https";
        return d.b(new StringBuilder(str2.length() + 3 + String.valueOf(str).length()), str2, "://", str);
    }

    public static String getCookieValue(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l10) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
        }
        if (zza(bool)) {
            sb2.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb2.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb2.append(";Domain=");
            sb2.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb2.append(";Path=");
            sb2.append(str4);
        }
        if (l10 != null && l10.longValue() > 0) {
            sb2.append(";Max-Age=");
            sb2.append(l10);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            sb2.append(";Priority=null");
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            sb2.append(";SameSite=null");
        }
        if (zza((Boolean) null)) {
            sb2.append(";SameParty");
        }
        return sb2.toString();
    }

    private static boolean zza(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
