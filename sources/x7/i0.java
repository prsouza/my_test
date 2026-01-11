package x7;

import a.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.github.mikephil.charting.BuildConfig;
import h.o;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import s8.f;

public final class i0 implements j0 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f12925h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final o f12926a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f12927b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12928c;

    /* renamed from: d  reason: collision with root package name */
    public final f f12929d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f12930e;

    /* renamed from: f  reason: collision with root package name */
    public String f12931f;

    public i0(Context context, String str, f fVar, d0 d0Var) {
        if (str != null) {
            this.f12927b = context;
            this.f12928c = str;
            this.f12929d = fVar;
            this.f12930e = d0Var;
            this.f12926a = new o();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public static String b() {
        StringBuilder d10 = a.d("SYN_");
        d10.append(UUID.randomUUID().toString());
        return d10.toString();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String str2;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            str2 = null;
        } else {
            str2 = g.matcher(uuid).replaceAll(BuildConfig.FLAVOR).toLowerCase(Locale.US);
        }
        String str3 = "Created new Crashlytics installation ID: " + str2 + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str3, (Throwable) null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", str2).putString("firebase.installation.id", str).apply();
        return str2;
    }

    public final synchronized String c() {
        String str;
        String str2 = this.f12931f;
        if (str2 != null) {
            return str2;
        }
        boolean z = false;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", (Throwable) null);
        }
        SharedPreferences g8 = e.g(this.f12927b);
        String string = g8.getString("firebase.installation.id", (String) null);
        String str3 = "Cached Firebase Installation ID: " + string;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str3, (Throwable) null);
        }
        if (this.f12930e.a()) {
            try {
                str = (String) o0.a(this.f12929d.getId());
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e10);
                str = null;
            }
            String str4 = "Fetched Firebase Installation ID: " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str4, (Throwable) null);
            }
            if (str == null) {
                str = string == null ? b() : string;
            }
            if (str.equals(string)) {
                this.f12931f = g8.getString("crashlytics.installation.id", (String) null);
            } else {
                this.f12931f = a(str, g8);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                this.f12931f = g8.getString("crashlytics.installation.id", (String) null);
            } else {
                this.f12931f = a(b(), g8);
            }
        }
        if (this.f12931f == null) {
            Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", (Throwable) null);
            this.f12931f = a(b(), g8);
        }
        String str5 = "Crashlytics installation ID: " + this.f12931f;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            z = true;
        }
        if (z) {
            Log.v("FirebaseCrashlytics", str5, (Throwable) null);
        }
        return this.f12931f;
    }

    public final String d() {
        String str;
        o oVar = this.f12926a;
        Context context = this.f12927b;
        synchronized (oVar) {
            if (((String) oVar.f5596a) == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = BuildConfig.FLAVOR;
                }
                oVar.f5596a = installerPackageName;
            }
            str = BuildConfig.FLAVOR.equals((String) oVar.f5596a) ? null : (String) oVar.f5596a;
        }
        return str;
    }

    public final String e(String str) {
        return str.replaceAll(f12925h, BuildConfig.FLAVOR);
    }
}
