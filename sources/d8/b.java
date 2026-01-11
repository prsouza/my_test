package d8;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import e6.e;
import hb.g;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import q4.h;
import q6.c;
import q6.d;
import t6.a;
import t6.m;
import t6.q;
import x7.b0;
import x8.j;

public final /* synthetic */ class b implements h, OnCompleteListener, a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f4359a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4360b;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f4359a = obj;
        this.f4360b = obj2;
    }

    public final void a(q qVar) {
        q qVar2;
        d dVar = (d) this.f4359a;
        HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.f4360b;
        int i = HomeActivityV2.H;
        e.D(dVar, "$manager");
        e.D(homeActivityV2, "this$0");
        e.D(qVar, "task");
        if (qVar.d()) {
            Object c10 = qVar.c();
            e.C(c10, "task.result");
            ReviewInfo reviewInfo = (ReviewInfo) c10;
            if (reviewInfo.b()) {
                qVar2 = new q();
                qVar2.f((Object) null);
            } else {
                Intent intent = new Intent(homeActivityV2, PlayCoreDialogWrapperActivity.class);
                intent.putExtra("confirmation_intent", reviewInfo.a());
                intent.putExtra("window_flags", homeActivityV2.getWindow().getDecorView().getWindowSystemUiVisibility());
                m mVar = new m();
                intent.putExtra("result_receiver", new c(dVar.f10315b, mVar));
                homeActivityV2.startActivity(intent);
                qVar2 = mVar.f11420a;
            }
            e.C(qVar2, "manager.launchReviewFlow…meActivityV2, reviewInfo)");
            qVar2.a(new g(homeActivityV2));
            return;
        }
        Exception b10 = qVar.b();
        if (b10 != null) {
            b10.printStackTrace();
        }
    }

    public final void b(Exception exc) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4359a;
        b0 b0Var = (b0) this.f4360b;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
        } else {
            taskCompletionSource.trySetResult(b0Var);
        }
    }

    public final void onComplete(Task task) {
        int i = j.f13062u;
        ((j) this.f4359a).a((Intent) this.f4360b);
    }
}
