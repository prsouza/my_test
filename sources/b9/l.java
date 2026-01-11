package b9;

import android.content.Context;
import c9.e;
import c9.j;
import c9.k;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k7.d;
import l7.c;
import o7.a;
import r8.b;
import s8.f;
import t2.i;

@KeepForSdk
public final class l {

    /* renamed from: j  reason: collision with root package name */
    public static final Clock f2927j = DefaultClock.getInstance();

    /* renamed from: k  reason: collision with root package name */
    public static final Random f2928k = new Random();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c> f2929a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f2930b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f2931c;

    /* renamed from: d  reason: collision with root package name */
    public final d f2932d;

    /* renamed from: e  reason: collision with root package name */
    public final f f2933e;

    /* renamed from: f  reason: collision with root package name */
    public final c f2934f;
    public final b<a> g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2935h;
    public Map<String, String> i = new HashMap();

    public l(Context context, d dVar, f fVar, c cVar, b<a> bVar) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f2930b = context;
        this.f2931c = newCachedThreadPool;
        this.f2932d = dVar;
        this.f2933e = fVar;
        this.f2934f = cVar;
        this.g = bVar;
        dVar.a();
        this.f2935h = dVar.f7455c.f7466b;
        Tasks.call(newCachedThreadPool, new j(this));
    }

    public static boolean e(d dVar) {
        dVar.a();
        return dVar.f7454b.equals("[DEFAULT]");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<java.lang.String, b9.c>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map<java.lang.String, b9.c>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Map<java.lang.String, b9.c>, java.util.HashMap] */
    public final synchronized c a(d dVar, f fVar, c cVar, Executor executor, e eVar, e eVar2, e eVar3, com.google.firebase.remoteconfig.internal.a aVar, j jVar, com.google.firebase.remoteconfig.internal.b bVar) {
        c cVar2;
        synchronized (this) {
            if (!this.f2929a.containsKey("firebase")) {
                c cVar3 = new c(this.f2930b, fVar, e(dVar) ? cVar : null, executor, eVar, eVar2, eVar3, aVar, jVar, bVar);
                eVar2.b();
                eVar3.b();
                eVar.b();
                this.f2929a.put("firebase", cVar3);
            }
            cVar2 = (c) this.f2929a.get("firebase");
        }
        return cVar2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Map<java.lang.String, c9.k>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.Map<java.lang.String, c9.e>, java.util.HashMap] */
    public final e b(String str) {
        k kVar;
        e eVar;
        String format = String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f2935h, "firebase", str});
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Context context = this.f2930b;
        Map<String, k> map = k.f3306c;
        synchronized (k.class) {
            ? r32 = k.f3306c;
            if (!r32.containsKey(format)) {
                r32.put(format, new k(context, format));
            }
            kVar = (k) r32.get(format);
        }
        Map<String, e> map2 = e.f3280d;
        synchronized (e.class) {
            String str2 = kVar.f3308b;
            ? r33 = e.f3280d;
            if (!r33.containsKey(str2)) {
                r33.put(str2, new e(newCachedThreadPool, kVar));
            }
            eVar = (e) r33.get(str2);
        }
        return eVar;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.util.BiConsumer<java.lang.String, c9.f>>] */
    public final c c() {
        c a10;
        synchronized (this) {
            e b10 = b("fetch");
            e b11 = b("activate");
            e b12 = b("defaults");
            com.google.firebase.remoteconfig.internal.b bVar = new com.google.firebase.remoteconfig.internal.b(this.f2930b.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.f2935h, "firebase", "settings"}), 0));
            j jVar = new j(this.f2931c, b11, b12);
            i iVar = e(this.f2932d) ? new i(this.g) : null;
            if (iVar != null) {
                i iVar2 = new i(iVar);
                synchronized (jVar.f3302a) {
                    jVar.f3302a.add(iVar2);
                }
            }
            a10 = a(this.f2932d, this.f2933e, this.f2934f, this.f2931c, b10, b11, b12, d(b10, bVar), jVar, bVar);
        }
        return a10;
    }

    public final synchronized com.google.firebase.remoteconfig.internal.a d(e eVar, com.google.firebase.remoteconfig.internal.b bVar) {
        com.google.firebase.remoteconfig.internal.a aVar;
        com.google.firebase.remoteconfig.internal.b bVar2 = bVar;
        synchronized (this) {
            f fVar = this.f2933e;
            b bVar3 = e(this.f2932d) ? this.g : k.f2926a;
            ExecutorService executorService = this.f2931c;
            Clock clock = f2927j;
            Random random = f2928k;
            d dVar = this.f2932d;
            dVar.a();
            String str = dVar.f7455c.f7465a;
            d dVar2 = this.f2932d;
            dVar2.a();
            aVar = new com.google.firebase.remoteconfig.internal.a(fVar, bVar3, executorService, clock, random, eVar, new ConfigFetchHttpClient(this.f2930b, dVar2.f7455c.f7466b, str, bVar2.f4246a.getLong("fetch_timeout_in_seconds", 60), bVar2.f4246a.getLong("fetch_timeout_in_seconds", 60)), bVar, this.i);
        }
        return aVar;
    }
}
