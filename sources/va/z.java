package va;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;

public abstract class z extends ViewDataBinding {
    public static final /* synthetic */ int K = 0;
    public final TextView I;
    public OptionsViewModel J;

    public z(Object obj, View view, TextView textView) {
        super(obj, view, 0);
        this.I = textView;
    }

    public abstract void v(OptionsViewModel optionsViewModel);
}
