package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import e6.e;
import eb.a;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public final class l1 extends k1 implements a.C0072a {
    public static final SparseIntArray T;
    public final a O;
    public final a P;
    public final a Q;
    public final a R;
    public long S = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.tabLayout, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l1(androidx.databinding.e r17, android.view.View r18) {
        /*
            r16 = this;
            r8 = r16
            r9 = r18
            android.util.SparseIntArray r0 = T
            r1 = 7
            r10 = 0
            r2 = r17
            java.lang.Object[] r11 = androidx.databinding.ViewDataBinding.l(r2, r9, r1, r10, r0)
            r12 = 2
            r0 = r11[r12]
            r3 = r0
            android.widget.Button r3 = (android.widget.Button) r3
            r13 = 4
            r0 = r11[r13]
            r4 = r0
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0 = 5
            r0 = r11[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r14 = 1
            r0 = r11[r14]
            r6 = r0
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r15 = 3
            r0 = r11[r15]
            r7 = r0
            android.widget.Button r7 = (android.widget.Button) r7
            r0 = 6
            r0 = r11[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = r16
            r1 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r8.S = r0
            android.widget.Button r0 = r8.I
            java.lang.String r1 = "Map"
            r0.setTag(r1)
            r0 = 0
            r0 = r11[r0]
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r0.setTag(r10)
            android.widget.ImageButton r0 = r8.J
            r0.setTag(r10)
            android.widget.ImageView r0 = r8.K
            r0.setTag(r10)
            android.widget.ImageButton r0 = r8.L
            r0.setTag(r10)
            android.widget.Button r0 = r8.M
            java.lang.String r1 = "Stats"
            r0.setTag(r1)
            r0 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r9.setTag(r0, r8)
            eb.a r0 = new eb.a
            r0.<init>(r8, r15)
            r8.O = r0
            eb.a r0 = new eb.a
            r0.<init>(r8, r13)
            r8.P = r0
            eb.a r0 = new eb.a
            r0.<init>(r8, r14)
            r8.Q = r0
            eb.a r0 = new eb.a
            r0.<init>(r8, r12)
            r8.R = r0
            r16.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.l1.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            HomeViewModelV2 homeViewModelV2 = this.N;
            if (homeViewModelV2 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV2.m(HomeViewModelV2.a.GOTO_SETTINGS);
            }
        } else if (i == 2) {
            HomeViewModelV2 homeViewModelV22 = this.N;
            if (homeViewModelV22 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV22.m(HomeViewModelV2.a.GOTO_MAP);
            }
        } else if (i == 3) {
            HomeViewModelV2 homeViewModelV23 = this.N;
            if (homeViewModelV23 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV23.m(HomeViewModelV2.a.GOTO_STATS);
            }
        } else if (i == 4) {
            HomeViewModelV2 homeViewModelV24 = this.N;
            if (homeViewModelV24 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV24.m(HomeViewModelV2.a.GOTO_NOTIFICATION);
            }
        }
    }

    public final void c() {
        long j10;
        int i;
        synchronized (this) {
            j10 = this.S;
            this.S = 0;
        }
        HomeViewModelV2 homeViewModelV2 = this.N;
        int i10 = ((7 & j10) > 0 ? 1 : ((7 & j10) == 0 ? 0 : -1));
        int i11 = 0;
        if (i10 != 0) {
            Integer num = null;
            LiveData<Integer> liveData = homeViewModelV2 != null ? homeViewModelV2.H : null;
            t(0, liveData);
            if (liveData != null) {
                num = liveData.d();
            }
            i = ViewDataBinding.p(num);
        } else {
            i = 0;
        }
        if ((j10 & 4) != 0) {
            this.I.setOnClickListener(this.R);
            this.J.setOnClickListener(this.P);
            this.L.setOnClickListener(this.Q);
            this.M.setOnClickListener(this.O);
        }
        if (i10 != 0) {
            ImageView imageView = this.K;
            e.D(imageView, "view");
            if (i == 0) {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.S != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.S = 4;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        if (i != 0) {
            return false;
        }
        LiveData liveData = (LiveData) obj;
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.S |= 1;
        }
        return true;
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((HomeViewModelV2) obj);
        return true;
    }

    public final void v(HomeViewModelV2 homeViewModelV2) {
        this.N = homeViewModelV2;
        synchronized (this) {
            this.S |= 2;
        }
        b(3);
        o();
    }
}
