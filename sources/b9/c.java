package b9;

import android.content.Context;
import c9.e;
import c9.j;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import k7.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s8.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2912a;

    /* renamed from: b  reason: collision with root package name */
    public final l7.c f2913b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f2914c;

    /* renamed from: d  reason: collision with root package name */
    public final e f2915d;

    /* renamed from: e  reason: collision with root package name */
    public final e f2916e;

    /* renamed from: f  reason: collision with root package name */
    public final e f2917f;
    public final a g;

    /* renamed from: h  reason: collision with root package name */
    public final j f2918h;
    public final b i;

    /* renamed from: j  reason: collision with root package name */
    public final f f2919j;

    public c(Context context, f fVar, l7.c cVar, Executor executor, e eVar, e eVar2, e eVar3, a aVar, j jVar, b bVar) {
        this.f2912a = context;
        this.f2919j = fVar;
        this.f2913b = cVar;
        this.f2914c = executor;
        this.f2915d = eVar;
        this.f2916e = eVar2;
        this.f2917f = eVar3;
        this.g = aVar;
        this.f2918h = jVar;
        this.i = bVar;
    }

    public static c a() {
        return ((l) d.c().b(l.class)).c();
    }

    public static List<Map<String, String>> b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }
}
