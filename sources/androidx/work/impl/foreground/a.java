package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import d2.o;
import e2.k;
import g2.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u1.h;
import u1.p;
import v1.j;
import z1.c;
import z1.d;

public final class a implements c, v1.a {
    public static final String z = p.e("SystemFgDispatcher");

    /* renamed from: a  reason: collision with root package name */
    public Context f2728a;

    /* renamed from: b  reason: collision with root package name */
    public j f2729b;

    /* renamed from: c  reason: collision with root package name */
    public final g2.a f2730c;

    /* renamed from: s  reason: collision with root package name */
    public final Object f2731s = new Object();

    /* renamed from: t  reason: collision with root package name */
    public String f2732t;

    /* renamed from: u  reason: collision with root package name */
    public final Map<String, h> f2733u;

    /* renamed from: v  reason: collision with root package name */
    public final Map<String, o> f2734v;

    /* renamed from: w  reason: collision with root package name */
    public final Set<o> f2735w;

    /* renamed from: x  reason: collision with root package name */
    public final d f2736x;

    /* renamed from: y  reason: collision with root package name */
    public C0027a f2737y;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    public interface C0027a {
    }

    public a(Context context) {
        this.f2728a = context;
        j s22 = j.s2(context);
        this.f2729b = s22;
        g2.a aVar = s22.f12153y;
        this.f2730c = aVar;
        this.f2732t = null;
        this.f2733u = new LinkedHashMap();
        this.f2735w = new HashSet();
        this.f2734v = new HashMap();
        this.f2736x = new d(this.f2728a, aVar, this);
        this.f2729b.A.b(this);
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f11640a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f11641b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f11642c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context, String str, h hVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f11640a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f11641b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f11642c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, d2.o>] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, u1.h>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.util.Set<d2.o>, java.util.HashSet] */
    public final void a(String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f2731s) {
            o oVar = (o) this.f2734v.remove(str);
            if (oVar != null ? this.f2735w.remove(oVar) : false) {
                this.f2736x.b(this.f2735w);
            }
        }
        h remove = this.f2733u.remove(str);
        if (str.equals(this.f2732t) && this.f2733u.size() > 0) {
            Iterator it = this.f2733u.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f2732t = (String) entry.getKey();
            if (this.f2737y != null) {
                h hVar = (h) entry.getValue();
                ((SystemForegroundService) this.f2737y).b(hVar.f11640a, hVar.f11641b, hVar.f11642c);
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f2737y;
                systemForegroundService.f2720b.post(new c2.d(systemForegroundService, hVar.f11640a));
            }
        }
        C0027a aVar = this.f2737y;
        if (remove != null && aVar != null) {
            p.c().a(z, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove.f11640a), str, Integer.valueOf(remove.f11641b)}), new Throwable[0]);
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar;
            systemForegroundService2.f2720b.post(new c2.d(systemForegroundService2, remove.f11640a));
        }
    }

    public final void c(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                p.c().a(z, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                j jVar = this.f2729b;
                ((b) jVar.f12153y).a(new k(jVar, next, true));
            }
        }
    }

    public final void d(List<String> list) {
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, u1.h>] */
    /* JADX WARNING: type inference failed for: r10v7, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, u1.h>] */
    public final void f(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        p.c().a(z, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f2737y != null) {
            this.f2733u.put(stringExtra, new h(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f2732t)) {
                this.f2732t = stringExtra;
                ((SystemForegroundService) this.f2737y).b(intExtra, intExtra2, notification);
                return;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.f2737y;
            systemForegroundService.f2720b.post(new c2.c(systemForegroundService, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : this.f2733u.entrySet()) {
                    i |= ((h) value.getValue()).f11641b;
                }
                h hVar = (h) this.f2733u.get(this.f2732t);
                if (hVar != null) {
                    ((SystemForegroundService) this.f2737y).b(hVar.f11640a, i, hVar.f11642c);
                }
            }
        }
    }

    public final void g() {
        this.f2737y = null;
        synchronized (this.f2731s) {
            this.f2736x.c();
        }
        this.f2729b.A.e(this);
    }
}
