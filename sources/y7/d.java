package y7;

import org.json.JSONException;
import org.json.JSONObject;

public final class d extends JSONObject {
    public d(String str) throws JSONException {
        put("userId", str);
    }
}
