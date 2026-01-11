package va;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import tb.c;

public abstract class a extends ViewDataBinding {
    public final g1 I;

    public a(Object obj, View view, g1 g1Var) {
        super(obj, view, 1);
        this.I = g1Var;
    }

    public abstract void v(c cVar);
}
