package va;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public abstract class k1 extends ViewDataBinding {
    public final Button I;
    public final ImageButton J;
    public final ImageView K;
    public final ImageButton L;
    public final Button M;
    public HomeViewModelV2 N;

    public k1(Object obj, View view, Button button, ImageButton imageButton, ImageView imageView, ImageButton imageButton2, Button button2) {
        super(obj, view, 1);
        this.I = button;
        this.J = imageButton;
        this.K = imageView;
        this.L = imageButton2;
        this.M = button2;
    }

    public abstract void v(HomeViewModelV2 homeViewModelV2);
}
