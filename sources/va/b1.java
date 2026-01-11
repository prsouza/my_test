package va;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public abstract class b1 extends ViewDataBinding {
    public final Button I;
    public final ImageButton J;
    public final ImageView K;
    public final TextView L;
    public final TextView M;
    public HomeViewModelV2 N;
    public Object O;

    public /* synthetic */ b1(Object obj, View view, Button button, Button button2, ImageButton imageButton, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, 0);
        this.I = button;
        this.O = button2;
        this.J = imageButton;
        this.K = imageView;
        this.L = textView;
        this.M = textView2;
    }

    public /* synthetic */ b1(Object obj, View view, Button button, ImageButton imageButton, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, 0);
        this.I = button;
        this.J = imageButton;
        this.K = imageView;
        this.L = textView;
        this.M = textView2;
    }
}
