package o2;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

public final class d implements Callable<q<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9193a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f9194b;

    public d(LottieAnimationView lottieAnimationView, int i) {
        this.f9194b = lottieAnimationView;
        this.f9193a = i;
    }

    public final Object call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f9194b;
        if (!lottieAnimationView.E) {
            return g.e(lottieAnimationView.getContext(), this.f9193a, (String) null);
        }
        Context context = lottieAnimationView.getContext();
        int i = this.f9193a;
        return g.e(context, i, g.h(context, i));
    }
}
