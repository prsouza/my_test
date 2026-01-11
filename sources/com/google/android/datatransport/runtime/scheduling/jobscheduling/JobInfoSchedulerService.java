package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import d5.a;
import t4.i;
import t4.q;
import t4.v;
import z4.e;
import z4.n;
import z4.o;

public class JobInfoSchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3613a = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        v.b(getApplicationContext());
        q.a a10 = q.a();
        a10.a(string);
        i.a aVar = (i.a) a10;
        aVar.f11368c = a.b(i);
        if (string2 != null) {
            aVar.f11367b = Base64.decode(string2, 0);
        }
        o oVar = v.a().f11398d;
        oVar.f13833e.execute(new n(oVar, aVar.b(), i10, new e(this, jobParameters)));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
