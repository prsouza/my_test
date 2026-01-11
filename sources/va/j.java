package va;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OnboardViewModel;

public final class j extends i {
    public static final SparseIntArray N;
    public long M = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.containerLayout, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(androidx.databinding.e r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = N
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r10, r11, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            com.airbnb.lottie.LottieAnimationView r7 = (com.airbnb.lottie.LottieAnimationView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = -1
            r9.M = r3
            android.widget.ImageView r10 = r9.I
            r10.setTag(r2)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r10.setTag(r2)
            com.airbnb.lottie.LottieAnimationView r10 = r9.J
            r10.setTag(r2)
            android.widget.TextView r10 = r9.K
            r10.setTag(r2)
            r10 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r11.setTag(r10, r9)
            r9.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.j.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void c() {
        long j10;
        int i;
        long j11;
        long j12;
        synchronized (this) {
            j10 = this.M;
            this.M = 0;
        }
        OnboardViewModel onboardViewModel = this.L;
        int i10 = ((j10 & 7) > 0 ? 1 : ((j10 & 7) == 0 ? 0 : -1));
        int i11 = 0;
        if (i10 != 0) {
            Boolean bool = null;
            LiveData<Boolean> liveData = onboardViewModel != null ? onboardViewModel.A : null;
            t(0, liveData);
            if (liveData != null) {
                bool = liveData.d();
            }
            boolean q10 = ViewDataBinding.q(bool);
            if (i10 != 0) {
                if (q10) {
                    j12 = j10 | 16;
                    j11 = 64;
                } else {
                    j12 = j10 | 8;
                    j11 = 32;
                }
                j10 = j12 | j11;
            }
            i = q10 ? 0 : 8;
            if (q10) {
                i11 = 8;
            }
        } else {
            i = 0;
        }
        if ((j10 & 7) != 0) {
            this.I.setVisibility(i11);
            this.J.setVisibility(i);
            this.K.setVisibility(i);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.M != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.M = 4;
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
            this.M |= 1;
        }
        return true;
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((OnboardViewModel) obj);
        return true;
    }

    public final void v(OnboardViewModel onboardViewModel) {
        this.L = onboardViewModel;
        synchronized (this) {
            this.M |= 2;
        }
        b(3);
        o();
    }
}
