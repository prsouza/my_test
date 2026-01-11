package va;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public abstract class t0 extends ViewDataBinding {
    public static final /* synthetic */ int L = 0;
    public final ImageButton I;
    public final Button J;
    public HomeViewModelV2 K;

    public t0(Object obj, View view, ImageButton imageButton, Button button) {
        super(obj, view, 0);
        this.I = imageButton;
        this.J = button;
    }

    public abstract void v(HomeViewModelV2 homeViewModelV2);
}
