package u2;

import android.content.Context;
import android.util.Log;
import c8.f;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import l6.a0;
import l6.l2;
import o6.z;
import org.json.JSONObject;
import r2.a;
import r2.i;
import r2.j;

public final class e implements m, z {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11663a;

    public /* synthetic */ e(Object obj) {
        this.f11663a = obj;
    }

    public final a a() {
        if (((b3.a) ((List) this.f11663a).get(0)).c()) {
            return new j((List) this.f11663a);
        }
        return new i((List) this.f11663a);
    }

    public final List b() {
        return (List) this.f11663a;
    }

    public final boolean c() {
        return ((List) this.f11663a).size() == 1 && ((b3.a) ((List) this.f11663a).get(0)).c();
    }

    public final JSONObject d() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        boolean z = false;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", (Throwable) null);
        }
        try {
            File file = (File) this.f11663a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(x7.e.m(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e10) {
                    e = e10;
                    try {
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        x7.e.a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        x7.e.a(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    z = true;
                }
                if (z) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", (Throwable) null);
                }
                jSONObject = null;
            }
            x7.e.a(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
            x7.e.a(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th3) {
            th = th3;
            x7.e.a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new l2((a0) ((z) this.f11663a).zza());
    }

    public /* synthetic */ e(Context context) {
        this.f11663a = context;
    }

    public /* synthetic */ e(f fVar) {
        this.f11663a = fVar.a("com.crashlytics.settings.json");
    }
}
