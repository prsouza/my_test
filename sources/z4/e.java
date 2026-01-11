package z4;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f13805a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JobParameters f13806b;

    public /* synthetic */ e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f13805a = jobInfoSchedulerService;
        this.f13806b = jobParameters;
    }

    public final void run() {
        JobInfoSchedulerService jobInfoSchedulerService = this.f13805a;
        JobParameters jobParameters = this.f13806b;
        int i = JobInfoSchedulerService.f3613a;
        jobInfoSchedulerService.jobFinished(jobParameters, false);
    }
}
