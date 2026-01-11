package va;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public abstract class e extends ViewDataBinding {
    public final p0 I;
    public final k1 J;
    public HomeViewModelV2 K;

    public e(Object obj, View view, p0 p0Var, k1 k1Var) {
        super(obj, view, 2);
        this.I = p0Var;
        this.J = k1Var;
    }

    public abstract void v(HomeViewModelV2 homeViewModelV2);
}
