package va;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import tb.r;

public abstract class g extends ViewDataBinding {
    public final TextView I;
    public final RecyclerView J;
    public r K;

    public g(Object obj, View view, TextView textView, RecyclerView recyclerView) {
        super(obj, view, 1);
        this.I = textView;
        this.J = recyclerView;
    }

    public abstract void v(r rVar);
}
