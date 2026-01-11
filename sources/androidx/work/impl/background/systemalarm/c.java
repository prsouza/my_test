package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.d;
import d2.o;
import d2.q;
import e2.l;
import e2.p;
import java.util.Collections;
import java.util.List;
import v1.a;
import z1.d;

public final class c implements z1.c, a, p.b {

    /* renamed from: y  reason: collision with root package name */
    public static final String f2690y = u1.p.e("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f2691a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2692b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2693c;

    /* renamed from: s  reason: collision with root package name */
    public final d f2694s;

    /* renamed from: t  reason: collision with root package name */
    public final d f2695t;

    /* renamed from: u  reason: collision with root package name */
    public final Object f2696u = new Object();

    /* renamed from: v  reason: collision with root package name */
    public int f2697v = 0;

    /* renamed from: w  reason: collision with root package name */
    public PowerManager.WakeLock f2698w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2699x = false;

    public c(Context context, int i, String str, d dVar) {
        this.f2691a = context;
        this.f2692b = i;
        this.f2694s = dVar;
        this.f2693c = str;
        this.f2695t = new d(context, dVar.f2701b, this);
    }

    public final void a(String str, boolean z) {
        u1.p.c().a(f2690y, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        e();
        if (z) {
            Intent d10 = a.d(this.f2691a, this.f2693c);
            d dVar = this.f2694s;
            dVar.e(new d.b(dVar, d10, this.f2692b));
        }
        if (this.f2699x) {
            Intent b10 = a.b(this.f2691a);
            d dVar2 = this.f2694s;
            dVar2.e(new d.b(dVar2, b10, this.f2692b));
        }
    }

    public final void b(String str) {
        u1.p.c().a(f2690y, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        g();
    }

    public final void c(List<String> list) {
        g();
    }

    public final void d(List<String> list) {
        if (list.contains(this.f2693c)) {
            synchronized (this.f2696u) {
                if (this.f2697v == 0) {
                    this.f2697v = 1;
                    u1.p.c().a(f2690y, String.format("onAllConstraintsMet for %s", new Object[]{this.f2693c}), new Throwable[0]);
                    if (this.f2694s.f2703s.g(this.f2693c, (WorkerParameters.a) null)) {
                        this.f2694s.f2702c.a(this.f2693c, this);
                    } else {
                        e();
                    }
                } else {
                    u1.p.c().a(f2690y, String.format("Already started work for %s", new Object[]{this.f2693c}), new Throwable[0]);
                }
            }
        }
    }

    public final void e() {
        synchronized (this.f2696u) {
            this.f2695t.c();
            this.f2694s.f2702c.b(this.f2693c);
            PowerManager.WakeLock wakeLock = this.f2698w;
            if (wakeLock != null && wakeLock.isHeld()) {
                u1.p.c().a(f2690y, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f2698w, this.f2693c}), new Throwable[0]);
                this.f2698w.release();
            }
        }
    }

    public final void f() {
        this.f2698w = l.a(this.f2691a, String.format("%s (%s)", new Object[]{this.f2693c, Integer.valueOf(this.f2692b)}));
        u1.p c10 = u1.p.c();
        String str = f2690y;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f2698w, this.f2693c}), new Throwable[0]);
        this.f2698w.acquire();
        o h10 = ((q) this.f2694s.f2704t.f12152x.w()).h(this.f2693c);
        if (h10 == null) {
            g();
            return;
        }
        boolean b10 = h10.b();
        this.f2699x = b10;
        if (!b10) {
            u1.p.c().a(str, String.format("No constraints for %s", new Object[]{this.f2693c}), new Throwable[0]);
            d(Collections.singletonList(this.f2693c));
            return;
        }
        this.f2695t.b(Collections.singletonList(h10));
    }

    public final void g() {
        synchronized (this.f2696u) {
            if (this.f2697v < 2) {
                this.f2697v = 2;
                u1.p c10 = u1.p.c();
                String str = f2690y;
                c10.a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f2693c}), new Throwable[0]);
                Context context = this.f2691a;
                String str2 = this.f2693c;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                d dVar = this.f2694s;
                dVar.e(new d.b(dVar, intent, this.f2692b));
                if (this.f2694s.f2703s.d(this.f2693c)) {
                    u1.p.c().a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f2693c}), new Throwable[0]);
                    Intent d10 = a.d(this.f2691a, this.f2693c);
                    d dVar2 = this.f2694s;
                    dVar2.e(new d.b(dVar2, d10, this.f2692b));
                } else {
                    u1.p.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f2693c}), new Throwable[0]);
                }
            } else {
                u1.p.c().a(f2690y, String.format("Already stopped work for %s", new Object[]{this.f2693c}), new Throwable[0]);
            }
        }
    }
}
