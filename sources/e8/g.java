package e8;

import android.util.Log;
import c3.k;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final k f4774a;

    public g(k kVar) {
        this.f4774a = kVar;
    }

    public final c a(JSONObject jSONObject) throws JSONException {
        h hVar;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", (Throwable) null);
            hVar = new a();
        } else {
            hVar = new k();
        }
        return hVar.a(this.f4774a, jSONObject);
    }
}
