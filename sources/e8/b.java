package e8;

import ah.v;
import android.text.TextUtils;
import c3.k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import rg.a;
import x7.i0;

public final class b implements xg.b {

    /* renamed from: f  reason: collision with root package name */
    public final Object f4755f;
    public Object g;

    /* renamed from: h  reason: collision with root package name */
    public k f4756h;

    public /* synthetic */ b(String str, v vVar) {
        k kVar = k.E;
        if (str != null) {
            this.f4756h = kVar;
            this.g = vVar;
            this.f4755f = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public /* synthetic */ b(a aVar) {
        this.f4755f = aVar;
    }

    public final b8.a a(b8.a aVar, j jVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f4775a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.10");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f4776b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f4777c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f4778d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((i0) jVar.f4779e).c());
        return aVar;
    }

    public final void b(b8.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.c(str, str2);
        }
    }

    public final Map c(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f4781h);
        hashMap.put("display_version", jVar.g);
        hashMap.put("source", Integer.toString(jVar.i));
        String str = jVar.f4780f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public final JSONObject d(b8.b bVar) {
        int i = bVar.f2904a;
        k kVar = this.f4756h;
        kVar.b1("Settings response code was: " + i);
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str = bVar.f2905b;
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                k kVar2 = this.f4756h;
                StringBuilder d10 = a.a.d("Failed to parse settings JSON from ");
                d10.append((String) this.f4755f);
                kVar2.d1(d10.toString(), e10);
                k kVar3 = this.f4756h;
                kVar3.d1("Settings response " + str, (Throwable) null);
                return null;
            }
        } else {
            k kVar4 = this.f4756h;
            StringBuilder d11 = a8.a.d("Settings request failed; (status: ", i, ") from ");
            d11.append((String) this.f4755f);
            kVar4.g0(d11.toString(), (Throwable) null);
            return null;
        }
    }
}
