package va;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.OnboardViewModel;

public abstract class i0 extends ViewDataBinding {
    public static final /* synthetic */ int O = 0;
    public final TextView I;
    public final Button J;
    public final Button K;
    public final ImageView L;
    public final TextView M;
    public OnboardViewModel N;

    public i0(Object obj, View view, TextView textView, Button button, Button button2, ImageView imageView, TextView textView2) {
        super(obj, view, 0);
        this.I = textView;
        this.J = button;
        this.K = button2;
        this.L = imageView;
        this.M = textView2;
    }

    public abstract void v(OnboardViewModel onboardViewModel);
}
