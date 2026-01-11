package va;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.HistoryViewModelV2;

public abstract class c extends ViewDataBinding {
    public final i1 I;
    public HistoryViewModelV2 J;

    public c(Object obj, View view, i1 i1Var) {
        super(obj, view, 2);
        this.I = i1Var;
    }

    public abstract void v(HistoryViewModelV2 historyViewModelV2);
}
