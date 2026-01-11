package va;

import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HistoryViewModelV2;
import u0.a;

public final class d extends c {
    public static final ViewDataBinding.d M;
    public static final SparseIntArray N;
    public final TextView K;
    public long L = -1;

    static {
        ViewDataBinding.d dVar = new ViewDataBinding.d(4);
        M = dVar;
        dVar.a(0, new String[]{"toolbar_history_v2"}, new int[]{2}, new int[]{R.layout.toolbar_history_v2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.historyRecyclerView, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(androidx.databinding.e r4, android.view.View r5) {
        /*
            r3 = this;
            androidx.databinding.ViewDataBinding$d r0 = M
            android.util.SparseIntArray r1 = N
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r4, r5, r2, r0, r1)
            r1 = 3
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r1 = 2
            r1 = r0[r1]
            va.i1 r1 = (va.i1) r1
            r3.<init>(r4, r5, r1)
            r1 = -1
            r3.L = r1
            r4 = 0
            r4 = r0[r4]
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r1 = 0
            r4.setTag(r1)
            r4 = 1
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.K = r4
            r4.setTag(r1)
            va.i1 r4 = r3.I
            if (r4 == 0) goto L_0x0033
            r4.z = r3
        L_0x0033:
            r4 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r5.setTag(r4, r3)
            r3.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.d.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void c() {
        long j10;
        synchronized (this) {
            j10 = this.L;
            this.L = 0;
        }
        HistoryViewModelV2 historyViewModelV2 = this.J;
        int i = ((j10 & 14) > 0 ? 1 : ((j10 & 14) == 0 ? 0 : -1));
        String str = null;
        int i10 = 0;
        if (i != 0) {
            LiveData<String> liveData = historyViewModelV2 != null ? historyViewModelV2.A : null;
            boolean z = true;
            t(1, liveData);
            if (liveData != null) {
                str = liveData.d();
            }
            if (str != null) {
                z = false;
            }
            if (i != 0) {
                j10 |= z ? 32 : 16;
            }
            if (z) {
                i10 = 8;
            }
        }
        if ((14 & j10) != 0) {
            a.a(this.K, str);
            this.K.setVisibility(i10);
        }
        if ((j10 & 12) != 0) {
            this.I.v(historyViewModelV2);
        }
        this.I.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.I.g() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.L     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            va.i1 r0 = r4.I
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.d.g():boolean");
    }

    public final void i() {
        synchronized (this) {
            this.L = 8;
        }
        this.I.i();
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        if (i == 0) {
            i1 i1Var = (i1) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.L |= 1;
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            LiveData liveData = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.L |= 2;
            }
            return true;
        }
    }

    public final void r(a0 a0Var) {
        super.r(a0Var);
        this.I.r(a0Var);
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((HistoryViewModelV2) obj);
        return true;
    }

    public final void v(HistoryViewModelV2 historyViewModelV2) {
        this.J = historyViewModelV2;
        synchronized (this) {
            this.L |= 4;
        }
        b(3);
        o();
    }
}
