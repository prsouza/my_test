package ya;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import c3.b;
import c3.c;
import c3.e;
import c3.m;
import c3.p;
import c3.r;
import c3.t;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final e f13569a;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, c3.e>, java.util.HashMap] */
    public a(Context context) {
        String str;
        e eVar;
        e6.e.D(context, "context");
        Map<String, e> map = c3.a.f3120a;
        synchronized (c3.a.class) {
            str = null;
            String d10 = t.d((String) null);
            ? r42 = c3.a.f3120a;
            eVar = (e) r42.get(d10);
            if (eVar == null) {
                eVar = new e(d10);
                r42.put(d10, eVar);
            }
        }
        synchronized (eVar) {
            if (t.c("7e9ce4d0e81a8ad05172642ae6f169df")) {
                Log.e("com.amplitude.api.AmplitudeClient", "Argument apiKey cannot be null or blank in initialize()");
            } else {
                Context applicationContext = context.getApplicationContext();
                eVar.f3130a = applicationContext;
                eVar.f3133d = "7e9ce4d0e81a8ad05172642ae6f169df";
                eVar.f3132c = m.s(applicationContext, eVar.f3134e);
                eVar.f3138k = t.c((String) null) ? "Android" : str;
                eVar.k(new c(eVar, context, eVar));
            }
        }
        eVar.B = true;
        Application application = (Application) context;
        if (!eVar.A && eVar.c("enableForegroundTracking()")) {
            application.registerActivityLifecycleCallbacks(new b(eVar));
        }
        this.f13569a = eVar;
    }

    public final void a(h hVar) {
        JSONObject put = new JSONObject().put(hVar.f13577a.getId(), hVar.f13578b);
        e eVar = this.f13569a;
        Objects.requireNonNull(eVar);
        if (put != null && put.length() != 0 && eVar.c("setUserProperties")) {
            JSONObject s10 = eVar.s(put);
            if (s10.length() != 0) {
                r rVar = new r();
                Iterator<String> keys = s10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        rVar.a(next, s10.get(next));
                    } catch (JSONException e10) {
                        Log.e("com.amplitude.api.AmplitudeClient", e10.toString());
                        p.a().b(String.format("Failed to set user property %s", new Object[]{next}), e10);
                    }
                }
                if (((JSONObject) rVar.f3215a).length() != 0 && eVar.c("identify()")) {
                    eVar.f("$identify", (JSONObject) null, (JSONObject) rVar.f3215a, System.currentTimeMillis());
                }
            }
        }
    }

    public final void b(f fVar) {
        boolean z;
        g gVar = fVar.f13574a;
        e eVar = this.f13569a;
        String id2 = gVar.getId();
        Map<String, Object> map = fVar.f13575b;
        JSONObject jSONObject = map != null ? new JSONObject(map) : new JSONObject();
        Objects.requireNonNull(eVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (t.c(id2)) {
            Log.e("com.amplitude.api.AmplitudeClient", "Argument eventType cannot be null or blank in logEvent()");
            z = false;
        } else {
            z = eVar.c("logEvent()");
        }
        if (z) {
            eVar.f(id2, jSONObject, (JSONObject) null, currentTimeMillis);
        }
    }
}
