package c3;

import org.json.JSONObject;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3162a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JSONObject f3163b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ JSONObject f3164c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ JSONObject f3165s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ JSONObject f3166t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ JSONObject f3167u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f3168v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f3169w = false;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ e f3170x;

    public h(e eVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j10) {
        this.f3170x = eVar;
        this.f3162a = str;
        this.f3163b = jSONObject;
        this.f3164c = jSONObject2;
        this.f3165s = jSONObject3;
        this.f3166t = jSONObject4;
        this.f3167u = jSONObject5;
        this.f3168v = j10;
    }

    public final void run() {
        if (!t.c(this.f3170x.f3133d)) {
            this.f3170x.e(this.f3162a, this.f3163b, this.f3164c, this.f3165s, this.f3166t, this.f3167u, this.f3168v, this.f3169w);
        }
    }
}
