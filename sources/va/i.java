package va;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import io.nodle.cash.ui.viewmodel.OnboardViewModel;

public abstract class i extends ViewDataBinding {
    public final ImageView I;
    public final LottieAnimationView J;
    public final TextView K;
    public OnboardViewModel L;

    public i(Object obj, View view, ImageView imageView, LottieAnimationView lottieAnimationView, TextView textView) {
        super(obj, view, 1);
        this.I = imageView;
        this.J = lottieAnimationView;
        this.K = textView;
    }

    public abstract void v(OnboardViewModel onboardViewModel);
}
