package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import eb.a;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.Objects;

public final class q0 extends p0 implements a.C0072a {
    public static final ViewDataBinding.d U;
    public static final SparseIntArray V;
    public final TextView M;
    public final Button N;
    public final Button O;
    public final a P;
    public final a Q;
    public final a R;
    public final a S;
    public long T = -1;

    static {
        ViewDataBinding.d dVar = new ViewDataBinding.d(11);
        U = dVar;
        dVar.a(1, new String[]{"layout_history_summary"}, new int[]{7}, new int[]{R.layout.layout_history_summary});
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(R.id.homeBottomSheet, 8);
        sparseIntArray.put(R.id.shimmerLayout, 9);
        sparseIntArray.put(R.id.nodleCashLabel, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q0(androidx.databinding.e r10, android.view.View r11) {
        /*
            r9 = this;
            androidx.databinding.ViewDataBinding$d r0 = U
            android.util.SparseIntArray r1 = V
            r2 = 11
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r10, r11, r2, r0, r1)
            r1 = 4
            r2 = r0[r1]
            r6 = r2
            android.widget.Button r6 = (android.widget.Button) r6
            r2 = 8
            r2 = r0[r2]
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            r2 = 2
            r3 = r0[r2]
            r7 = r3
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r3 = 10
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 9
            r3 = r0[r3]
            com.facebook.shimmer.ShimmerFrameLayout r3 = (com.facebook.shimmer.ShimmerFrameLayout) r3
            r3 = 7
            r3 = r0[r3]
            r8 = r3
            va.z0 r8 = (va.z0) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = -1
            r9.T = r3
            android.widget.Button r10 = r9.I
            r3 = 0
            r10.setTag(r3)
            r10 = 0
            r10 = r0[r10]
            androidx.coordinatorlayout.widget.CoordinatorLayout r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r10
            r10.setTag(r3)
            r10 = 1
            r4 = r0[r10]
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.setTag(r3)
            r4 = 3
            r5 = r0[r4]
            android.widget.TextView r5 = (android.widget.TextView) r5
            r9.M = r5
            r5.setTag(r3)
            r5 = 5
            r5 = r0[r5]
            android.widget.Button r5 = (android.widget.Button) r5
            r9.N = r5
            r5.setTag(r3)
            r5 = 6
            r0 = r0[r5]
            android.widget.Button r0 = (android.widget.Button) r0
            r9.O = r0
            r0.setTag(r3)
            android.widget.LinearLayout r0 = r9.J
            r0.setTag(r3)
            va.z0 r0 = r9.K
            if (r0 == 0) goto L_0x0077
            r0.z = r9
        L_0x0077:
            r0 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r11.setTag(r0, r9)
            eb.a r11 = new eb.a
            r11.<init>(r9, r10)
            r9.P = r11
            eb.a r10 = new eb.a
            r10.<init>(r9, r2)
            r9.Q = r10
            eb.a r10 = new eb.a
            r10.<init>(r9, r4)
            r9.R = r10
            eb.a r10 = new eb.a
            r10.<init>(r9, r1)
            r9.S = r10
            r9.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.q0.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            HomeViewModelV2 homeViewModelV2 = this.L;
            if (homeViewModelV2 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV2.o(view);
            }
        } else if (i == 2) {
            HomeViewModelV2 homeViewModelV22 = this.L;
            if (homeViewModelV22 != null) {
                z = true;
            }
            if (z) {
                Objects.requireNonNull(homeViewModelV22);
                homeViewModelV22.m(HomeViewModelV2.a.GOTO_ESTIMATION);
            }
        } else if (i == 3) {
            HomeViewModelV2 homeViewModelV23 = this.L;
            if (homeViewModelV23 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV23.m(HomeViewModelV2.a.GOTO_RECEIVE);
            }
        } else if (i == 4) {
            HomeViewModelV2 homeViewModelV24 = this.L;
            if (homeViewModelV24 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV24.m(HomeViewModelV2.a.GOTO_PAY);
            }
        }
    }

    public final void c() {
        long j10;
        synchronized (this) {
            j10 = this.T;
            this.T = 0;
        }
        HomeViewModelV2 homeViewModelV2 = this.L;
        int i = ((13 & j10) > 0 ? 1 : ((13 & j10) == 0 ? 0 : -1));
        String str = null;
        if (i != 0) {
            LiveData<String> liveData = homeViewModelV2 != null ? homeViewModelV2.I : null;
            t(0, liveData);
            if (liveData != null) {
                str = liveData.d();
            }
        }
        if ((8 & j10) != 0) {
            this.I.setOnClickListener(this.Q);
            this.N.setOnClickListener(this.R);
            this.O.setOnClickListener(this.S);
            this.J.setOnClickListener(this.P);
        }
        if (i != 0) {
            u0.a.a(this.M, str);
        }
        if ((j10 & 12) != 0) {
            this.K.v(homeViewModelV2);
        }
        this.K.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.K.g() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.T     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            va.z0 r0 = r4.K
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
        throw new UnsupportedOperationException("Method not decompiled: va.q0.g():boolean");
    }

    public final void i() {
        synchronized (this) {
            this.T = 8;
        }
        this.K.i();
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        if (i == 0) {
            LiveData liveData = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.T |= 1;
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            z0 z0Var = (z0) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.T |= 2;
            }
            return true;
        }
    }

    public final void r(a0 a0Var) {
        super.r(a0Var);
        this.K.r(a0Var);
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((HomeViewModelV2) obj);
        return true;
    }

    public final void v(HomeViewModelV2 homeViewModelV2) {
        this.L = homeViewModelV2;
        synchronized (this) {
            this.T |= 4;
        }
        b(3);
        o();
    }
}
