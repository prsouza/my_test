package c3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.activity.result.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t {
    public static JSONObject a(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArray = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e10) {
            Log.e("com.amplitude.api.Utils", e10.toString());
            jSONArray = null;
        }
        int length = jSONArray != null ? jSONArray.length() : 0;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e11) {
            Log.e("com.amplitude.api.Utils", e11.toString());
            return null;
        }
    }

    public static SharedPreferences b(Context context, String str) {
        StringBuilder d10 = d.d("com.amplitude.api.", str, ".");
        d10.append(context.getPackageName());
        return context.getSharedPreferences(d10.toString(), 4);
    }

    public static boolean c(String str) {
        return str == null || str.length() == 0;
    }

    public static String d(String str) {
        if (c(str)) {
            str = "$default_instance";
        }
        return str.toLowerCase();
    }
}
