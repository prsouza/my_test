package va;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public abstract class p0 extends ViewDataBinding {
    public final Button I;
    public final LinearLayout J;
    public final z0 K;
    public HomeViewModelV2 L;

    public p0(Object obj, View view, Button button, LinearLayout linearLayout, z0 z0Var) {
        super(obj, view, 2);
        this.I = button;
        this.J = linearLayout;
        this.K = z0Var;
    }

    public abstract void v(HomeViewModelV2 homeViewModelV2);
}
