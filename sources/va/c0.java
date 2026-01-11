package va;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;

public abstract class c0 extends ViewDataBinding {
    public static final /* synthetic */ int L = 0;
    public final Button I;
    public final Button J;
    public OptionsViewModel K;

    public c0(Object obj, View view, Button button, Button button2) {
        super(obj, view, 0);
        this.I = button;
        this.J = button2;
    }

    public abstract void v(OptionsViewModel optionsViewModel);
}
