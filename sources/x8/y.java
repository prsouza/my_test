package x8;

import a.a;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f13146a;

    public y(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.f13146a = new Bundle(bundle);
    }

    public static boolean l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final boolean a(String str) {
        String j10 = j(str);
        return "1".equals(j10) || Boolean.parseBoolean(j10);
    }

    public final Integer b(String str) {
        String j10 = j(str);
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(j10));
        } catch (NumberFormatException unused) {
            StringBuilder d10 = a.d("Couldn't parse value of ");
            d10.append(n(str));
            d10.append("(");
            d10.append(j10);
            d10.append(") into an int");
            Log.w("NotificationParams", d10.toString());
            return null;
        }
    }

    public final JSONArray c(String str) {
        String j10 = j(str);
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        try {
            return new JSONArray(j10);
        } catch (JSONException unused) {
            StringBuilder d10 = a.d("Malformed JSON for key ");
            d10.append(n(str));
            d10.append(": ");
            d10.append(j10);
            d10.append(", falling back to default");
            Log.w("NotificationParams", d10.toString());
            return null;
        }
    }

    public final int[] d() {
        JSONArray c10 = c("gcm.n.light_settings");
        if (c10 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c10.length() == 3) {
                int parseColor = Color.parseColor(c10.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = c10.optInt(1);
                    iArr[2] = c10.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c10 + ". Skipping setting LightSettings");
            return null;
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c10 + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        }
    }

    public final Uri e() {
        String j10 = j("gcm.n.link_android");
        if (TextUtils.isEmpty(j10)) {
            j10 = j("gcm.n.link");
        }
        if (!TextUtils.isEmpty(j10)) {
            return Uri.parse(j10);
        }
        return null;
    }

    public final Object[] f(String str) {
        JSONArray c10 = c(str + "_loc_args");
        if (c10 == null) {
            return null;
        }
        int length = c10.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c10.optString(i);
        }
        return strArr;
    }

    public final String g(String str) {
        return j(str + "_loc_key");
    }

    public final Long h() {
        String j10 = j("gcm.n.event_time");
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(j10));
        } catch (NumberFormatException unused) {
            StringBuilder d10 = a.d("Couldn't parse value of ");
            d10.append(n("gcm.n.event_time"));
            d10.append("(");
            d10.append(j10);
            d10.append(") into a long");
            Log.w("NotificationParams", d10.toString());
            return null;
        }
    }

    public final String i(Resources resources, String str, String str2) {
        String j10 = j(str2);
        if (!TextUtils.isEmpty(j10)) {
            return j10;
        }
        String g = g(str2);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        int identifier = resources.getIdentifier(g, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", n(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] f10 = f(str2);
        if (f10 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f10);
        } catch (MissingFormatArgumentException e10) {
            StringBuilder d10 = a.d("Missing format argument for ");
            d10.append(n(str2));
            d10.append(": ");
            d10.append(Arrays.toString(f10));
            d10.append(" Default value will be used.");
            Log.w("NotificationParams", d10.toString(), e10);
            return null;
        }
    }

    public final String j(String str) {
        String str2;
        Bundle bundle = this.f13146a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.f13146a.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public final long[] k() {
        JSONArray c10 = c("gcm.n.vibrate_timings");
        if (c10 == null) {
            return null;
        }
        try {
            if (c10.length() > 1) {
                int length = c10.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c10.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c10 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public final Bundle m() {
        Bundle bundle = new Bundle(this.f13146a);
        for (String next : this.f13146a.keySet()) {
            if (!(next.startsWith("google.c.a.") || next.equals("from"))) {
                bundle.remove(next);
            }
        }
        return bundle;
    }
}
