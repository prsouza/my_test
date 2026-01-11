package va;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;

public abstract class k0 extends ViewDataBinding {
    public static final /* synthetic */ int L = 0;
    public final LinearLayout I;
    public final TextView J;
    public OptionsViewModel K;

    public k0(Object obj, View view, LinearLayout linearLayout, TextView textView) {
        super(obj, view, 1);
        this.I = linearLayout;
        this.J = textView;
    }

    public abstract void v(OptionsViewModel optionsViewModel);
}
