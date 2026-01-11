package va;

import android.util.SparseIntArray;
import androidx.lifecycle.LiveData;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import u0.a;

public final class o1 extends n1 {
    public static final SparseIntArray L;
    public long K = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.backButton, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o1(androidx.databinding.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = L
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r6, r7, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.K = r3
            r6 = 0
            r6 = r0[r6]
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            r6.setTag(r2)
            android.widget.TextView r6 = r5.I
            r6.setTag(r2)
            r6 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r7.setTag(r6, r5)
            r5.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.o1.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void c() {
        long j10;
        synchronized (this) {
            j10 = this.K;
            this.K = 0;
        }
        OptionsViewModel optionsViewModel = this.J;
        int i = ((j10 & 7) > 0 ? 1 : ((j10 & 7) == 0 ? 0 : -1));
        String str = null;
        if (i != 0) {
            LiveData<String> liveData = optionsViewModel != null ? optionsViewModel.f6812y : null;
            t(0, liveData);
            if (liveData != null) {
                str = liveData.d();
            }
        }
        if (i != 0) {
            a.a(this.I, str);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.K != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.K = 4;
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
            this.K |= 1;
        }
        return true;
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
