package va;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;

public abstract class k extends ViewDataBinding {
    public final n1 I;
    public OptionsViewModel J;

    public k(Object obj, View view, n1 n1Var) {
        super(obj, view, 1);
        this.I = n1Var;
    }

    public abstract void v(OptionsViewModel optionsViewModel);
}
