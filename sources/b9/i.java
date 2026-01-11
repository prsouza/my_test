package b9;

import android.os.Bundle;
import c9.f;
import com.google.android.gms.common.util.BiConsumer;
import java.util.Map;
import o7.a;
import org.json.JSONObject;
import r8.b;

public final /* synthetic */ class i implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t2.i f2924a;

    public /* synthetic */ i(t2.i iVar) {
        this.f2924a = iVar;
    }

    public final void accept(Object obj, Object obj2) {
        JSONObject optJSONObject;
        t2.i iVar = this.f2924a;
        String str = (String) obj;
        f fVar = (f) obj2;
        a aVar = (a) ((b) iVar.f11281b).get();
        if (aVar != null) {
            JSONObject jSONObject = fVar.f3291e;
            if (jSONObject.length() >= 1) {
                JSONObject jSONObject2 = fVar.f3288b;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (((Map) iVar.f11282c)) {
                            if (!optString.equals(((Map) iVar.f11282c).get(str))) {
                                ((Map) iVar.f11282c).put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", jSONObject2.optString(str));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                aVar.g("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                aVar.g("fp", "_fpc", bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}
