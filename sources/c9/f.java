package c9;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: f  reason: collision with root package name */
    public static final Date f3286f = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f3287a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f3288b;

    /* renamed from: c  reason: collision with root package name */
    public Date f3289c;

    /* renamed from: d  reason: collision with root package name */
    public JSONArray f3290d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f3291e;

    public f(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f3288b = jSONObject;
        this.f3289c = date;
        this.f3290d = jSONArray;
        this.f3291e = jSONObject2;
        this.f3287a = jSONObject3;
    }

    public static f a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f3287a.toString().equals(((f) obj).toString());
    }

    public final int hashCode() {
        return this.f3287a.hashCode();
    }

    public final String toString() {
        return this.f3287a.toString();
    }
}
