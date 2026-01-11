package y1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import d2.g;
import d2.i;
import d2.o;
import d2.q;
import e2.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import u1.p;
import u1.t;
import u1.v;
import v1.d;
import v1.j;

public final class b implements d {

    /* renamed from: t  reason: collision with root package name */
    public static final String f13370t = p.e("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f13371a;

    /* renamed from: b  reason: collision with root package name */
    public final JobScheduler f13372b;

    /* renamed from: c  reason: collision with root package name */
    public final j f13373c;

    /* renamed from: s  reason: collision with root package name */
    public final a f13374s;

    public b(Context context, j jVar) {
        a aVar = new a(context);
        this.f13371a = context;
        this.f13373c = jVar;
        this.f13372b = (JobScheduler) context.getSystemService("jobscheduler");
        this.f13374s = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th2) {
            p.c().b(f13370t, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th2);
        }
    }

    public static List<Integer> c(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> d10 = d(context, jobScheduler);
        if (d10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = ((ArrayList) d10).iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            if (str.equals(g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            p.c().b(f13370t, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static String g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final void b(String str) {
        List<Integer> c10 = c(this.f13371a, this.f13372b, str);
        if (c10 != null) {
            ArrayList arrayList = (ArrayList) c10;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a(this.f13372b, ((Integer) it.next()).intValue());
                }
                ((i) this.f13373c.f12152x.t()).c(str);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(o... oVarArr) {
        int i;
        List<Integer> c10;
        int i10;
        WorkDatabase workDatabase = this.f13373c.f12152x;
        e eVar = new e(workDatabase);
        int length = oVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            o oVar = oVarArr[i11];
            workDatabase.c();
            try {
                o h10 = ((q) workDatabase.w()).h(oVar.f4293a);
                if (h10 == null) {
                    p.c().f(f13370t, "Skipping scheduling " + oVar.f4293a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.p();
                } else if (h10.f4294b != v.ENQUEUED) {
                    p.c().f(f13370t, "Skipping scheduling " + oVar.f4293a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.p();
                } else {
                    g a10 = ((i) workDatabase.t()).a(oVar.f4293a);
                    if (a10 != null) {
                        i = a10.f4281b;
                    } else {
                        Objects.requireNonNull(this.f13373c.f12151w);
                        i = eVar.b(this.f13373c.f12151w.g);
                    }
                    if (a10 == null) {
                        ((i) this.f13373c.f12152x.t()).b(new g(oVar.f4293a, i));
                    }
                    h(oVar, i);
                    if (Build.VERSION.SDK_INT == 23 && (c10 = c(this.f13371a, this.f13372b, oVar.f4293a)) != null) {
                        ArrayList arrayList = (ArrayList) c10;
                        int indexOf = arrayList.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            arrayList.remove(indexOf);
                        }
                        if (!arrayList.isEmpty()) {
                            i10 = ((Integer) arrayList.get(0)).intValue();
                        } else {
                            Objects.requireNonNull(this.f13373c.f12151w);
                            i10 = eVar.b(this.f13373c.f12151w.g);
                        }
                        h(oVar, i10);
                    }
                    workDatabase.p();
                }
                workDatabase.l();
                i11++;
            } catch (Throwable th2) {
                workDatabase.l();
                throw th2;
            }
        }
    }

    public final boolean f() {
        return true;
    }

    public final void h(o oVar, int i) {
        int i10;
        JobInfo a10 = this.f13374s.a(oVar, i);
        p c10 = p.c();
        String str = f13370t;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{oVar.f4293a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            if (this.f13372b.schedule(a10) == 0) {
                p.c().f(str, String.format("Unable to schedule work ID %s", new Object[]{oVar.f4293a}), new Throwable[0]);
                if (oVar.f4307q && oVar.f4308r == t.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    oVar.f4307q = false;
                    p.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{oVar.f4293a}), new Throwable[0]);
                    h(oVar, i);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> d10 = d(this.f13371a, this.f13372b);
            int size = d10 != null ? ((ArrayList) d10).size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(size);
            objArr[1] = Integer.valueOf(((ArrayList) ((q) this.f13373c.f12152x.w()).e()).size());
            a aVar = this.f13373c.f12151w;
            if (Build.VERSION.SDK_INT == 23) {
                i10 = aVar.f2648h / 2;
            } else {
                i10 = aVar.f2648h;
            }
            objArr[2] = Integer.valueOf(i10);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            p.c().b(f13370t, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th2) {
            p.c().b(f13370t, String.format("Unable to schedule %s", new Object[]{oVar}), th2);
        }
    }
}
