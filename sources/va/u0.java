package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import eb.a;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public final class u0 extends t0 implements a.C0072a {
    public static final SparseIntArray Q;
    public final TextView M;
    public final a N;
    public final a O;
    public long P = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.titleTextView, 4);
        sparseIntArray.put(R.id.detailTextView, 5);
        sparseIntArray.put(R.id.pkLayout, 6);
        sparseIntArray.put(R.id.iChingImageView, 7);
        sparseIntArray.put(R.id.detailTextView2, 8);
        sparseIntArray.put(R.id.actionButton, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u0(androidx.databinding.e r7, android.view.View r8) {
        /*
            r6 = this;
            android.util.SparseIntArray r0 = Q
            r1 = 10
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r7, r8, r1, r2, r0)
            r1 = 9
            r1 = r0[r1]
            android.widget.Button r1 = (android.widget.Button) r1
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r3 = 5
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 8
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 7
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 6
            r3 = r0[r3]
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r3 = 1
            r4 = r0[r3]
            android.widget.Button r4 = (android.widget.Button) r4
            r5 = 4
            r5 = r0[r5]
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6.<init>(r7, r8, r1, r4)
            r4 = -1
            r6.P = r4
            android.widget.ImageButton r7 = r6.I
            r7.setTag(r2)
            r7 = 0
            r7 = r0[r7]
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r7.setTag(r2)
            r7 = 2
            r0 = r0[r7]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.M = r0
            r0.setTag(r2)
            android.widget.Button r0 = r6.J
            r0.setTag(r2)
            r0 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r8.setTag(r0, r6)
            eb.a r8 = new eb.a
            r8.<init>(r6, r7)
            r6.N = r8
            eb.a r7 = new eb.a
            r7.<init>(r6, r3)
            r6.O = r7
            r6.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.u0.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            HomeViewModelV2 homeViewModelV2 = this.K;
            if (homeViewModelV2 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV2.m(HomeViewModelV2.a.SHARE_PK);
            }
        } else if (i == 2) {
            HomeViewModelV2 homeViewModelV22 = this.K;
            if (homeViewModelV22 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV22.m(HomeViewModelV2.a.DISMISS_RECEIVE);
            }
        }
    }

    public final void c() {
        long j10;
        synchronized (this) {
            j10 = this.P;
            this.P = 0;
        }
        String str = null;
        HomeViewModelV2 homeViewModelV2 = this.K;
        int i = ((3 & j10) > 0 ? 1 : ((3 & j10) == 0 ? 0 : -1));
        if (!(i == 0 || homeViewModelV2 == null)) {
            if (homeViewModelV2.f6771y.length() > 0) {
                int length = homeViewModelV2.f6771y.length() / 2;
                String substring = homeViewModelV2.f6771y.substring(0, length);
                e.C(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = homeViewModelV2.f6771y.substring(length);
                e.C(substring2, "this as java.lang.String).substring(startIndex)");
                str = substring + "\n" + substring2;
            } else {
                str = BuildConfig.FLAVOR;
            }
        }
        if ((j10 & 2) != 0) {
            this.I.setOnClickListener(this.N);
            this.J.setOnClickListener(this.O);
        }
        if (i != 0) {
            u0.a.a(this.M, str);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.P != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.P = 2;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        return false;
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
            this.P |= 1;
        }
        b(3);
        o();
    }
}
