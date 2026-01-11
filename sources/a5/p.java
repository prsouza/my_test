package a5;

import ah.v;
import android.util.Log;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bb.g;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import io.nodle.cash.ui.view.activity.transact.HistoryActivityV2;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import lb.d;
import x7.o0;

public final /* synthetic */ class p implements Continuation, k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f110b;

    public /* synthetic */ p(Object obj, int i) {
        this.f109a = i;
        this.f110b = obj;
    }

    public final void d(Object obj) {
        boolean z = false;
        switch (this.f109a) {
            case 3:
                HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.f110b;
                List list = (List) obj;
                int i = HomeActivityV2.H;
                e.D(homeActivityV2, "this$0");
                HomeViewModelV2 homeViewModelV2 = homeActivityV2.z;
                if (homeViewModelV2 != null) {
                    Log.d(homeActivityV2.f6710y, "REWARD HISTORY : " + list.size());
                    int min = Math.min(list.size(), homeViewModelV2.f6768v);
                    ((RecyclerView) homeActivityV2.k(R.id.rewardSummaryRecyclerView)).setLayoutManager(new LinearLayoutManager(1));
                    ((RecyclerView) homeActivityV2.k(R.id.rewardSummaryRecyclerView)).setAdapter(new d(homeActivityV2, list.subList(0, min)));
                    List d10 = homeViewModelV2.A.d();
                    if (d10 != null && d10.isEmpty()) {
                        z = true;
                    }
                    if (!z || Long.parseLong(v.J(homeViewModelV2.f6765s, qa.e.REWARDS_PENDING_DEVICE_COUNT)) != 0) {
                        homeViewModelV2.D.j(null);
                        return;
                    } else {
                        homeViewModelV2.D.j(homeViewModelV2.f6765s.getString(g.REWARD.getEmptyPlaceholder()));
                        return;
                    }
                } else {
                    return;
                }
            default:
                HistoryActivityV2 historyActivityV2 = (HistoryActivityV2) this.f110b;
                int i10 = HistoryActivityV2.D;
                e.D(historyActivityV2, "this$0");
                if (e.r((Boolean) obj, Boolean.TRUE)) {
                    ((ShimmerFrameLayout) historyActivityV2.k(R.id.shimmerLayout1)).b();
                    return;
                }
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) historyActivityV2.k(R.id.shimmerLayout1);
                if (shimmerFrameLayout.f3584c) {
                    shimmerFrameLayout.c();
                    shimmerFrameLayout.f3584c = false;
                    shimmerFrameLayout.invalidate();
                    return;
                }
                return;
        }
    }

    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f110b;
        ExecutorService executorService = o0.f12956a;
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
