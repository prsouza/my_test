package x7;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import c8.e;
import c8.f;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d8.a;
import d8.c;
import e8.i;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l6.t2;
import q4.b;
import t4.r;
import t4.v;
import y7.c;
import y7.k;
import z7.a0;
import z7.b0;
import z7.d;
import z7.k;
import z7.l;
import z7.m;
import z7.o;
import z7.t;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f12938a;

    /* renamed from: b  reason: collision with root package name */
    public final e f12939b;

    /* renamed from: c  reason: collision with root package name */
    public final a f12940c;

    /* renamed from: d  reason: collision with root package name */
    public final c f12941d;

    /* renamed from: e  reason: collision with root package name */
    public final k f12942e;

    public l0(a0 a0Var, e eVar, a aVar, c cVar, k kVar) {
        this.f12938a = a0Var;
        this.f12939b = eVar;
        this.f12940c = aVar;
        this.f12941d = cVar;
        this.f12942e = kVar;
    }

    public static l0 b(Context context, i0 i0Var, f fVar, a aVar, c cVar, k kVar, f8.c cVar2, i iVar, t2 t2Var) {
        a0 a0Var = new a0(context, i0Var, aVar, cVar2);
        e eVar = new e(fVar, iVar);
        a8.c cVar3 = a.f4354b;
        v.b(context);
        return new l0(a0Var, eVar, new a(new d8.c(((r) v.a().c(new r4.a(a.f4355c, a.f4356d))).a("FIREBASE_CRASHLYTICS_REPORT", new b("json"), a.f4357e), ((e8.f) iVar).b(), t2Var)), cVar, kVar);
    }

    public static List<a0.c> c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Objects.requireNonNull(str, "Null key");
            String str2 = (String) next.getValue();
            Objects.requireNonNull(str2, "Null value");
            arrayList.add(new d(str, str2));
        }
        Collections.sort(arrayList, k0.f12934a);
        return arrayList;
    }

    public final a0.e.d a(a0.e.d dVar, c cVar, k kVar) {
        z7.k kVar2 = (z7.k) dVar;
        k.a aVar = new k.a(kVar2);
        String b10 = cVar.f13499b.b();
        if (b10 != null) {
            aVar.f14075e = new t(b10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", (Throwable) null);
        }
        List<a0.c> c10 = c(kVar.f13528d.a());
        List<a0.c> c11 = c(kVar.f13529e.a());
        if (!((ArrayList) c10).isEmpty() || !((ArrayList) c11).isEmpty()) {
            l.b bVar = (l.b) kVar2.f14068c.f();
            bVar.f14082b = new b0<>(c10);
            bVar.f14083c = new b0<>(c11);
            aVar.f14073c = bVar.a();
        }
        return aVar.a();
    }

    public final void d(Throwable th2, Thread thread, String str, String str2, long j10, boolean z) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Thread thread2 = thread;
        String str3 = str2;
        boolean equals = str3.equals(AppMeasurement.CRASH_ORIGIN);
        a0 a0Var = this.f12938a;
        int i = a0Var.f12888a.getResources().getConfiguration().orientation;
        f8.c cVar = a0Var.f12891d;
        String localizedMessage = th2.getLocalizedMessage();
        String name = th2.getClass().getName();
        StackTraceElement[] e10 = cVar.e(th2.getStackTrace());
        Throwable cause = th2.getCause();
        Boolean bool = null;
        f8.d dVar = cause != null ? new f8.d(cause, cVar) : null;
        k.a aVar = new k.a();
        aVar.f14072b = str3;
        aVar.b(j10);
        String str4 = a0Var.f12890c.f12883d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) a0Var.f12888a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str4)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            bool = Boolean.valueOf(runningAppProcessInfo.importance != 100);
        }
        l.b bVar = new l.b();
        bVar.f14084d = bool;
        bVar.b(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a0Var.f(thread2, e10, 4));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread3 = (Thread) next.getKey();
                if (!thread3.equals(thread2)) {
                    arrayList.add(a0Var.f(thread3, a0Var.f12891d.e((StackTraceElement[]) next.getValue()), 0));
                }
                thread2 = thread;
            }
        }
        b0 b0Var = new b0(arrayList);
        if (e10 == null) {
            e10 = new StackTraceElement[0];
        }
        o.b bVar2 = new o.b();
        bVar2.f14104a = name;
        bVar2.f14105b = localizedMessage;
        bVar2.f14106c = new b0<>(a0Var.d(e10, 4));
        bVar2.f14108e = 0;
        if (dVar != null) {
            bVar2.f14107d = a0Var.c(dVar, 1);
        }
        bVar.f14081a = new m(b0Var, bVar2.a(), (a0.a) null, a0Var.e(), a0Var.a(), (m.a) null);
        aVar.f14073c = bVar.a();
        aVar.f14074d = a0Var.b(i);
        this.f12939b.d(a(aVar.a(), this.f12941d, this.f12942e), str, equals);
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.lang.Runnable>] */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.lang.Runnable>] */
    public final Task<Void> e(Executor executor, String str) {
        TaskCompletionSource taskCompletionSource;
        List<File> b10 = this.f12939b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) b10).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(new b(e.f3263f.g(e.e(file)), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b0 b0Var = (b0) it2.next();
            if (str == null || str.equals(b0Var.c())) {
                a aVar = this.f12940c;
                boolean z = true;
                boolean z10 = str != null;
                d8.c cVar = aVar.f4358a;
                synchronized (cVar.f4365e) {
                    taskCompletionSource = new TaskCompletionSource();
                    if (z10) {
                        ((AtomicInteger) cVar.f4367h.f8030a).getAndIncrement();
                        if (cVar.f4365e.size() >= cVar.f4364d) {
                            z = false;
                        }
                        if (z) {
                            c3.k kVar = c3.k.E;
                            kVar.e0("Enqueueing report: " + b0Var.c());
                            kVar.e0("Queue size: " + cVar.f4365e.size());
                            cVar.f4366f.execute(new c.b(b0Var, taskCompletionSource, (c.a) null));
                            kVar.e0("Closing task for report: " + b0Var.c());
                            taskCompletionSource.trySetResult(b0Var);
                        } else {
                            cVar.a();
                            String str2 = "Dropping report due to queue being full: " + b0Var.c();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, (Throwable) null);
                            }
                            ((AtomicInteger) cVar.f4367h.f8031b).getAndIncrement();
                            taskCompletionSource.trySetResult(b0Var);
                        }
                    } else {
                        cVar.b(b0Var, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new a5.l(this)));
            }
        }
        return Tasks.whenAll((Collection<? extends Task<?>>) arrayList2);
    }
}
