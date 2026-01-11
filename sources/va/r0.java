package va;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public abstract class r0 extends ViewDataBinding {
    public static final /* synthetic */ int J = 0;
    public final FrameLayout I;

    public r0(Object obj, View view, FrameLayout frameLayout) {
        super(obj, view, 0);
        this.I = frameLayout;
    }

    public abstract void v(HomeViewModelV2 homeViewModelV2);
}
