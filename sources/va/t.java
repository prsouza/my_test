package va;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;

public abstract class t extends ViewDataBinding {
    public static final /* synthetic */ int K = 0;
    public final Button I;
    public WalletBackupViewModel J;

    public t(Object obj, View view, Button button) {
        super(obj, view, 1);
        this.I = button;
    }

    public abstract void v(WalletBackupViewModel walletBackupViewModel);
}
