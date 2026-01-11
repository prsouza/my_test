package va;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.a0;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public final class f extends e {
    public static final ViewDataBinding.d M;
    public static final SparseIntArray N;
    public long L = -1;

    static {
        ViewDataBinding.d dVar = new ViewDataBinding.d(5);
        M = dVar;
        dVar.a(0, new String[]{"fragment_sheet_home", "toolbar_home_v2"}, new int[]{1, 2}, new int[]{R.layout.fragment_sheet_home, R.layout.toolbar_home_v2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.fragmentContainer, 3);
        sparseIntArray.put(R.id.flashContainer, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(androidx.databinding.e r4, android.view.View r5) {
        /*
            r3 = this;
            androidx.databinding.ViewDataBinding$d r0 = M
            android.util.SparseIntArray r1 = N
            r2 = 5
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r4, r5, r2, r0, r1)
            r1 = 1
            r1 = r0[r1]
            va.p0 r1 = (va.p0) r1
            r2 = 4
            r2 = r0[r2]
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2 = 3
            r2 = r0[r2]
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2 = 2
            r2 = r0[r2]
            va.k1 r2 = (va.k1) r2
            r3.<init>(r4, r5, r1, r2)
            r1 = -1
            r3.L = r1
            va.p0 r4 = r3.I
            if (r4 == 0) goto L_0x002a
            r4.z = r3
        L_0x002a:
            r4 = 0
            r4 = r0[r4]
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r0 = 0
            r4.setTag(r0)
            va.k1 r4 = r3.J
            if (r4 == 0) goto L_0x0039
            r4.z = r3
        L_0x0039:
            r4 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r5.setTag(r4, r3)
            r3.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.f.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void c() {
        long j10;
        synchronized (this) {
            j10 = this.L;
            this.L = 0;
        }
        HomeViewModelV2 homeViewModelV2 = this.K;
        if ((j10 & 12) != 0) {
            this.I.v(homeViewModelV2);
            this.J.v(homeViewModelV2);
        }
        this.I.d();
        this.J.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r4.J.g() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
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
            long r0 = r4.L     // Catch:{ all -> 0x0021 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0021 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0021 }
            va.p0 r0 = r4.I
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            va.k1 r0 = r4.J
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x001f
            return r1
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.f.g():boolean");
    }

    public final void i() {
        synchronized (this) {
            this.L = 8;
        }
        this.I.i();
        this.J.i();
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        if (i == 0) {
            k1 k1Var = (k1) obj;
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
            p0 p0Var = (p0) obj;
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
        this.J.r(a0Var);
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((HomeViewModelV2) obj);
        return true;
    }

    public final void v(HomeViewModelV2 homeViewModelV2) {
        this.K = homeViewModelV2;
        synchronized (this) {
            this.L |= 4;
        }
        b(3);
        o();
    }
}
