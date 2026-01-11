package c3;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import mf.e;
import org.json.JSONArray;
import p002if.o;
import p002if.x;

public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f3214a;

    public q(p pVar) {
        this.f3214a = pVar;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.util.Map<java.lang.String, org.json.JSONObject>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v10, types: [java.util.Map<java.lang.String, org.json.JSONObject>, java.util.HashMap] */
    public final void run() {
        if (!this.f3214a.f3210h.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f3214a.f3210h.size());
            Iterator it = this.f3214a.f3210h.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f3214a.i.get((String) it.next()));
            }
            String jSONArray = new JSONArray(arrayList).toString();
            if (!t.c(jSONArray)) {
                p pVar = this.f3214a;
                Objects.requireNonNull(pVar);
                o.a aVar = new o.a();
                aVar.a("v", "1");
                aVar.a("client", pVar.f3205b);
                aVar.a("e", jSONArray);
                aVar.a("upload_time", BuildConfig.FLAVOR + System.currentTimeMillis());
                o b10 = aVar.b();
                x.a aVar2 = new x.a();
                aVar2.f(pVar.f3209f);
                aVar2.c("POST", b10);
                try {
                    if (new e(pVar.f3206c, aVar2.a(), false).d().f6458v.f().equals("success")) {
                        pVar.i.clear();
                        pVar.f3210h.clear();
                    }
                } catch (IOException | AssertionError | Exception unused) {
                }
            }
        }
    }
}
