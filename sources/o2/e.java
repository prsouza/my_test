package o2;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Map;
import java.util.concurrent.Callable;

public final class e implements Callable<q<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9195a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f9196b;

    public e(LottieAnimationView lottieAnimationView, String str) {
        this.f9196b = lottieAnimationView;
        this.f9195a = str;
    }

    public final Object call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f9196b;
        if (!lottieAnimationView.E) {
            return g.b(lottieAnimationView.getContext(), this.f9195a, (String) null);
        }
        Context context = lottieAnimationView.getContext();
        String str = this.f9195a;
        Map<String, s<f>> map = g.f9210a;
        return g.b(context, str, "asset_" + str);
    }
}
