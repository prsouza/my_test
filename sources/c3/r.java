package c3;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public Object f3215a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3216b;

    public /* synthetic */ r(Object obj, Object obj2) {
        this.f3215a = obj;
        this.f3216b = obj2;
    }

    public final r a(String str, Object obj) {
        if (t.c(str)) {
            Log.w("com.amplitude.api.Identify", String.format("Attempting to perform operation %s with a null or empty string property, ignoring", new Object[]{"$set"}));
        } else if (obj == null) {
            Log.w("com.amplitude.api.Identify", String.format("Attempting to perform operation %s with null value for property %s, ignoring", new Object[]{"$set", str}));
        } else if (((JSONObject) this.f3215a).has("$clearAll")) {
            Log.w("com.amplitude.api.Identify", String.format("This Identify already contains a $clearAll operation, ignoring operation %s", new Object[]{"$set"}));
        } else if (((Set) this.f3216b).contains(str)) {
            Log.w("com.amplitude.api.Identify", String.format("Already used property %s in previous operation, ignoring operation %s", new Object[]{str, "$set"}));
        } else {
            try {
                if (!((JSONObject) this.f3215a).has("$set")) {
                    ((JSONObject) this.f3215a).put("$set", new JSONObject());
                }
                ((JSONObject) this.f3215a).getJSONObject("$set").put(str, obj);
                ((Set) this.f3216b).add(str);
            } catch (JSONException e10) {
                Log.e("com.amplitude.api.Identify", e10.toString());
            }
        }
        return this;
    }

    public /* synthetic */ r() {
        this.f3215a = new JSONObject();
        this.f3216b = new HashSet();
    }
}
