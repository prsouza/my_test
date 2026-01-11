package va;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public abstract class z0 extends ViewDataBinding {
    public final RecyclerView I;
    public final RecyclerView J;
    public HomeViewModelV2 K;

    public z0(Object obj, View view, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, 4);
        this.I = recyclerView;
        this.J = recyclerView2;
    }

    public abstract void v(HomeViewModelV2 homeViewModelV2);
}
