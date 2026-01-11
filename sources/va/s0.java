package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import pb.o;

public final class s0 extends r0 {
    public long K = -1;

    public s0(e eVar, View view) {
        super(eVar, view, (FrameLayout) ViewDataBinding.l(eVar, view, 1, (ViewDataBinding.d) null, (SparseIntArray) null)[0]);
        this.I.setTag((Object) null);
        view.setTag(R.id.dataBinding, this);
        i();
    }

    public final void c() {
        synchronized (this) {
            this.K = 0;
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
        return false;
    }

    public final boolean s(int i, Object obj) {
        if (1 == i) {
            o oVar = (o) obj;
            return true;
        } else if (3 != i) {
            return false;
        } else {
            HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) obj;
            return true;
        }
    }

    public final void v(HomeViewModelV2 homeViewModelV2) {
    }
}
