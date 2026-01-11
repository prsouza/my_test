package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import d2.o;
import d2.q;
import java.util.Collections;
import java.util.List;
import u1.p;
import v1.j;
import z1.c;
import z1.d;

public class ConstraintTrackingWorker extends ListenableWorker implements c {
    public static final String z = p.e("ConstraintTrkngWrkr");

    /* renamed from: u  reason: collision with root package name */
    public WorkerParameters f2744u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f2745v = new Object();

    /* renamed from: w  reason: collision with root package name */
    public volatile boolean f2746w = false;

    /* renamed from: x  reason: collision with root package name */
    public f2.c<ListenableWorker.a> f2747x = new f2.c<>();

    /* renamed from: y  reason: collision with root package name */
    public ListenableWorker f2748y;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        public final void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            Object obj = constraintTrackingWorker.f2625b.f2635b.f2651a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            String str = obj instanceof String ? (String) obj : null;
            if (TextUtils.isEmpty(str)) {
                p.c().b(ConstraintTrackingWorker.z, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.h();
                return;
            }
            ListenableWorker a10 = constraintTrackingWorker.f2625b.f2638e.a(constraintTrackingWorker.f2624a, str, constraintTrackingWorker.f2744u);
            constraintTrackingWorker.f2748y = a10;
            if (a10 == null) {
                p.c().a(ConstraintTrackingWorker.z, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.h();
                return;
            }
            o h10 = ((q) j.s2(constraintTrackingWorker.f2624a).f12152x.w()).h(constraintTrackingWorker.f2625b.f2634a.toString());
            if (h10 == null) {
                constraintTrackingWorker.h();
                return;
            }
            Context context = constraintTrackingWorker.f2624a;
            d dVar = new d(context, j.s2(context).f12153y, constraintTrackingWorker);
            dVar.b(Collections.singletonList(h10));
            if (dVar.a(constraintTrackingWorker.f2625b.f2634a.toString())) {
                p.c().a(ConstraintTrackingWorker.z, String.format("Constraints met for delegate %s", new Object[]{str}), new Throwable[0]);
                try {
                    z6.a<ListenableWorker.a> f10 = constraintTrackingWorker.f2748y.f();
                    f10.d(new h2.a(constraintTrackingWorker, f10), constraintTrackingWorker.f2625b.f2636c);
                } catch (Throwable th2) {
                    p c10 = p.c();
                    String str2 = ConstraintTrackingWorker.z;
                    c10.a(str2, String.format("Delegated worker %s threw exception in startWork.", new Object[]{str}), th2);
                    synchronized (constraintTrackingWorker.f2745v) {
                        if (constraintTrackingWorker.f2746w) {
                            p.c().a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                            constraintTrackingWorker.i();
                        } else {
                            constraintTrackingWorker.h();
                        }
                    }
                }
            } else {
                p.c().a(ConstraintTrackingWorker.z, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{str}), new Throwable[0]);
                constraintTrackingWorker.i();
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2744u = workerParameters;
    }

    public final boolean b() {
        ListenableWorker listenableWorker = this.f2748y;
        return listenableWorker != null && listenableWorker.b();
    }

    public final void c(List<String> list) {
        p.c().a(z, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f2745v) {
            this.f2746w = true;
        }
    }

    public final void d(List<String> list) {
    }

    public final void e() {
        ListenableWorker listenableWorker = this.f2748y;
        if (listenableWorker != null && !listenableWorker.f2626c) {
            this.f2748y.g();
        }
    }

    public final z6.a<ListenableWorker.a> f() {
        this.f2625b.f2636c.execute(new a());
        return this.f2747x;
    }

    public final void h() {
        this.f2747x.j(new ListenableWorker.a.C0023a());
    }

    public final void i() {
        this.f2747x.j(new ListenableWorker.a.b());
    }
}
