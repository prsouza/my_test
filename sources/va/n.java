package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import c3.k;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;

public final class n extends m {
    public static final SparseIntArray J;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.fragmentContainerLayout, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(e eVar, View view) {
        super(eVar, view);
        Object[] l10 = ViewDataBinding.l(eVar, view, 3, (ViewDataBinding.d) null, J);
        FrameLayout frameLayout = (FrameLayout) l10[2];
        if (l10[1] != null) {
            k.K((View) l10[1]);
        }
        this.I = -1;
        ((LinearLayout) l10[0]).setTag((Object) null);
        view.setTag(R.id.dataBinding, this);
        i();
    }

    public final void c() {
        synchronized (this) {
            this.I = 0;
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.I != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.I = 2;
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
        WalletBackupViewModel walletBackupViewModel = (WalletBackupViewModel) obj;
        return true;
    }

    public final void v(WalletBackupViewModel walletBackupViewModel) {
    }
}
