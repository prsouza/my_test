package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.d0;
import androidx.work.impl.background.systemalarm.d;
import e2.l;
import java.util.HashMap;
import java.util.WeakHashMap;
import u1.p;

public class SystemAlarmService extends d0 implements d.c {

    /* renamed from: s  reason: collision with root package name */
    public static final String f2678s = p.e("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    public d f2679b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2680c;

    public final void a() {
        d dVar = new d(this);
        this.f2679b = dVar;
        if (dVar.f2709y != null) {
            p.c().b(d.z, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.f2709y = this;
        }
    }

    public final void b() {
        this.f2680c = true;
        p.c().a(f2678s, "All commands completed in dispatcher", new Throwable[0]);
        String str = l.f4557a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = l.f4558b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                p.c().f(l.f4557a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
        stopSelf();
    }

    public final void onCreate() {
        super.onCreate();
        a();
        this.f2680c = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2680c = true;
        this.f2679b.d();
    }

    public final int onStartCommand(Intent intent, int i, int i10) {
        super.onStartCommand(intent, i, i10);
        if (this.f2680c) {
            p.c().d(f2678s, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f2679b.d();
            a();
            this.f2680c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f2679b.b(intent, i10);
        return 3;
    }
}
