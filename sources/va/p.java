package va;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;

public abstract class p extends ViewDataBinding {
    public static final /* synthetic */ int N = 0;
    public final Button I;
    public final TextView J;
    public final Button K;
    public final TextView L;
    public WalletBackupViewModel M;

    public p(Object obj, View view, Button button, TextView textView, Button button2, TextView textView2) {
        super(obj, view, 0);
        this.I = button;
        this.J = textView;
        this.K = button2;
        this.L = textView2;
    }

    public abstract void v(WalletBackupViewModel walletBackupViewModel);
}
