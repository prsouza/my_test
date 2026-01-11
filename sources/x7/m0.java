package x7;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e6.e;
import ge.g;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import io.nodle.cash.ui.view.activity.transact.TransactActivity;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import java.util.List;
import java.util.Objects;
import jc.b;
import lb.d;
import pd.f;
import ri.a;
import sb.n;
import sb.q;
import tb.h;

public final /* synthetic */ class m0 implements Continuation, k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12949a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12950b;

    public /* synthetic */ m0(Object obj, int i) {
        this.f12949a = i;
        this.f12950b = obj;
    }

    public final void d(Object obj) {
        int i;
        switch (this.f12949a) {
            case 1:
                HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.f12950b;
                List list = (List) obj;
                int i10 = HomeActivityV2.H;
                e.D(homeActivityV2, "this$0");
                HomeViewModelV2 homeViewModelV2 = homeActivityV2.z;
                if (homeViewModelV2 != null) {
                    String str = homeActivityV2.f6710y;
                    int size = list.size();
                    Log.d(str, "TRANSFER HISTORY : " + size);
                    int min = Math.min(list.size(), homeViewModelV2.f6768v);
                    ((RecyclerView) homeActivityV2.k(R.id.transferSummaryRecyclerView)).setLayoutManager(new LinearLayoutManager(1));
                    ((RecyclerView) homeActivityV2.k(R.id.transferSummaryRecyclerView)).setAdapter(new d(homeActivityV2, list.subList(0, min)));
                    g.b(b.y(homeViewModelV2), (f) null, new h(homeViewModelV2, (pd.d<? super h>) null), 3);
                    return;
                }
                return;
            default:
                TransactActivity transactActivity = (TransactActivity) this.f12950b;
                TransactViewModel.a aVar = (TransactViewModel.a) obj;
                int i11 = TransactActivity.C;
                e.D(transactActivity, "this$0");
                a.C0210a aVar2 = a.f10801a;
                aVar2.a("Activity Action: " + aVar, new Object[0]);
                if (aVar == null) {
                    i = -1;
                } else {
                    i = TransactActivity.a.f6744a[aVar.ordinal()];
                }
                if (i == 1) {
                    aVar.toString();
                    aVar2.a("load keypad", new Object[0]);
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(transactActivity.getSupportFragmentManager());
                    aVar3.e(R.id.fragmentContainerLayout, new n(), (String) null, 1);
                    aVar3.d();
                    return;
                } else if (i == 2) {
                    String obj2 = aVar.toString();
                    aVar2.a("load  account finder", new Object[0]);
                    androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(transactActivity.getSupportFragmentManager());
                    aVar4.e(R.id.fragmentContainerLayout, new sb.e(), (String) null, 1);
                    aVar4.c(obj2);
                    aVar4.d();
                    return;
                } else if (i == 3) {
                    String obj3 = aVar.toString();
                    aVar2.a("load confirm", new Object[0]);
                    View currentFocus = transactActivity.getCurrentFocus();
                    if (currentFocus != null) {
                        ub.f.a(currentFocus);
                    }
                    androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(transactActivity.getSupportFragmentManager());
                    aVar5.e(R.id.fragmentContainerLayout, new q(), (String) null, 1);
                    aVar5.c(obj3);
                    aVar5.d();
                    return;
                } else if (i == 4) {
                    transactActivity.finish();
                    return;
                } else {
                    return;
                }
        }
    }

    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12950b;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }
}
