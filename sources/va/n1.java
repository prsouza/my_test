package va;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;

public abstract class n1 extends ViewDataBinding {
    public final TextView I;
    public OptionsViewModel J;

    public n1(Object obj, View view, TextView textView) {
        super(obj, view, 1);
        this.I = textView;
    }

    public abstract void v(OptionsViewModel optionsViewModel);
}
