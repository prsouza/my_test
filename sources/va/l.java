package va;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.a0;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;

public final class l extends k {
    public static final ViewDataBinding.d L;
    public static final SparseIntArray M;
    public long K = -1;

    static {
        ViewDataBinding.d dVar = new ViewDataBinding.d(3);
        L = dVar;
        dVar.a(0, new String[]{"toolbar_options"}, new int[]{1}, new int[]{R.layout.toolbar_options});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.fragmentContainerLayout, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(androidx.databinding.e r4, android.view.View r5) {
        /*
            r3 = this;
            androidx.databinding.ViewDataBinding$d r0 = L
            android.util.SparseIntArray r1 = M
            r2 = 3
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r4, r5, r2, r0, r1)
            r1 = 2
            r1 = r0[r1]
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1 = 1
            r1 = r0[r1]
            va.n1 r1 = (va.n1) r1
            r3.<init>(r4, r5, r1)
            r1 = -1
            r3.K = r1
            r4 = 0
            r4 = r0[r4]
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 0
            r4.setTag(r0)
            va.n1 r4 = r3.I
            if (r4 == 0) goto L_0x0029
            r4.z = r3
        L_0x0029:
            r4 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r5.setTag(r4, r3)
            r3.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.l.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void c() {
        long j10;
        synchronized (this) {
            j10 = this.K;
            this.K = 0;
        }
        OptionsViewModel optionsViewModel = this.J;
        if ((j10 & 6) != 0) {
            this.I.v(optionsViewModel);
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
            long r0 = r4.K     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            va.n1 r0 = r4.I
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
        throw new UnsupportedOperationException("Method not decompiled: va.l.g():boolean");
    }

    public final void i() {
        synchronized (this) {
            this.K = 4;
        }
        this.I.i();
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        if (i != 0) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    public final void r(a0 a0Var) {
        super.r(a0Var);
        this.I.r(a0Var);
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((OptionsViewModel) obj);
        return true;
    }

    public final void v(OptionsViewModel optionsViewModel) {
        this.J = optionsViewModel;
        synchronized (this) {
            this.K |= 2;
        }
        b(3);
        o();
    }
}
