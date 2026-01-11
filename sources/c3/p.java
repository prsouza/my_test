package c3;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002if.v;

public final class p {

    /* renamed from: j  reason: collision with root package name */
    public static p f3203j;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f3204a = false;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f3205b;

    /* renamed from: c  reason: collision with root package name */
    public volatile v f3206c;

    /* renamed from: d  reason: collision with root package name */
    public volatile String f3207d;

    /* renamed from: e  reason: collision with root package name */
    public int f3208e = 50;

    /* renamed from: f  reason: collision with root package name */
    public String f3209f = "https://api.amplitude.com/diagnostic";
    public u g = new u("diagnosticThread");

    /* renamed from: h  reason: collision with root package name */
    public List<String> f3210h = new ArrayList(this.f3208e);
    public Map<String, JSONObject> i = new HashMap(this.f3208e);

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3211a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Throwable f3212b;

        public a(String str, Throwable th2) {
            this.f3211a = str;
            this.f3212b = th2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map<java.lang.String, org.json.JSONObject>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v7, types: [java.util.Map<java.lang.String, org.json.JSONObject>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r4v4, types: [java.util.Map<java.lang.String, org.json.JSONObject>, java.util.HashMap] */
        public final void run() {
            JSONObject jSONObject = (JSONObject) p.this.i.get(this.f3211a);
            if (jSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("error", e.q(this.f3211a));
                    jSONObject2.put("timestamp", System.currentTimeMillis());
                    jSONObject2.put("device_id", p.this.f3207d);
                    jSONObject2.put("count", 1);
                    Throwable th2 = this.f3212b;
                    if (th2 != null) {
                        String stackTraceString = Log.getStackTraceString(th2);
                        if (!t.c(stackTraceString)) {
                            jSONObject2.put("stack_trace", e.q(stackTraceString));
                        }
                    }
                    if (p.this.f3210h.size() >= p.this.f3208e) {
                        for (int i = 0; i < 5; i++) {
                            p.this.i.remove((String) p.this.f3210h.remove(0));
                        }
                    }
                    p.this.i.put(this.f3211a, jSONObject2);
                    p.this.f3210h.add(this.f3211a);
                } catch (JSONException unused) {
                }
            } else {
                jSONObject.put("count", jSONObject.optInt("count", 0) + 1);
            }
        }
    }

    public p() {
        this.g.start();
    }

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            if (f3203j == null) {
                f3203j = new p();
            }
            pVar = f3203j;
        }
        return pVar;
    }

    public final p b(String str, Throwable th2) {
        if (this.f3204a && !t.c(str) && !t.c(this.f3207d)) {
            a aVar = new a(str, th2);
            Thread currentThread = Thread.currentThread();
            u uVar = this.g;
            if (currentThread != uVar) {
                uVar.a(aVar);
            } else {
                aVar.run();
            }
        }
        return this;
    }
}
