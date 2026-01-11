package y7;

import a8.a;
import android.util.Log;
import c8.f;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f13500b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final f f13501a;

    public e(f fVar) {
        this.f13501a = fVar;
    }

    public static Map<String, String> a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, (String) null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public final Map<String, String> b(String str, boolean z) {
        File file;
        if (z) {
            file = this.f13501a.f(str, "internal-keys");
        } else {
            file = this.f13501a.f(str, "keys");
        }
        if (!file.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                Map<String, String> a10 = a(x7.e.m(fileInputStream2));
                x7.e.a(fileInputStream2, "Failed to close user metadata file.");
                return a10;
            } catch (Exception e10) {
                e = e10;
                fileInputStream = fileInputStream2;
                try {
                    Log.e("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    x7.e.a(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th2) {
                    th = th2;
                    x7.e.a(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                x7.e.a(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Log.e("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            x7.e.a(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }

    public final String c(String str) {
        FileInputStream fileInputStream;
        File f10 = this.f13501a.f(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!f10.exists()) {
            String c10 = a.c("No userId set for session ", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", c10, (Throwable) null);
            }
            return null;
        }
        try {
            fileInputStream = new FileInputStream(f10);
            try {
                JSONObject jSONObject = new JSONObject(x7.e.m(fileInputStream));
                String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", (String) null) : null;
                String str2 = "Loaded userId " + optString + " for session " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, (Throwable) null);
                }
                x7.e.a(fileInputStream, "Failed to close user metadata file.");
                return optString;
            } catch (Exception e10) {
                e = e10;
                try {
                    Log.e("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    x7.e.a(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    x7.e.a(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            Log.e("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            x7.e.a(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th3) {
            th = th3;
            x7.e.a(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
