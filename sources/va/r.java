package va;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;

public abstract class r extends ViewDataBinding {
    public static final /* synthetic */ int L = 0;
    public final TextView I;
    public final TextView J;
    public WalletBackupViewModel K;

    public r(Object obj, View view, TextView textView, TextView textView2) {
        super(obj, view, 3);
        this.I = textView;
        this.J = textView2;
    }

    public abstract void v(WalletBackupViewModel walletBackupViewModel);
}
