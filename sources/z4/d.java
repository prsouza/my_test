package z4;

import aa.b;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import d5.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import t4.q;
import z4.f;

public final class d implements u {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13802a;

    /* renamed from: b  reason: collision with root package name */
    public final a5.d f13803b;

    /* renamed from: c  reason: collision with root package name */
    public final f f13804c;

    public d(Context context, a5.d dVar, f fVar) {
        this.f13802a = context;
        this.f13803b = dVar;
        this.f13804c = fVar;
    }

    public final void a(q qVar, int i, boolean z) {
        boolean z10;
        q qVar2 = qVar;
        int i10 = i;
        ComponentName componentName = new ComponentName(this.f13802a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f13802a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f13802a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(qVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(qVar.d())).array());
        if (qVar.c() != null) {
            adler32.update(qVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        z10 = true;
                    }
                }
            }
            z10 = false;
            if (z10) {
                b.A("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", qVar2);
                return;
            }
        }
        long k02 = this.f13803b.k0(qVar2);
        f fVar = this.f13804c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        q4.d d10 = qVar.d();
        String str = "JobInfoScheduler";
        builder.setMinimumLatency(fVar.b(d10, k02, i10));
        Set<f.b> c10 = fVar.c().get(d10).c();
        if (c10.contains(f.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c10.contains(f.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c10.contains(f.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", qVar.b());
        persistableBundle.putInt("priority", a.a(qVar.d()));
        if (qVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(qVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        b.B(str, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", qVar2, Integer.valueOf(value), Long.valueOf(this.f13804c.b(qVar.d(), k02, i10)), Long.valueOf(k02), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }

    public final void b(q qVar, int i) {
        a(qVar, i, false);
    }
}
