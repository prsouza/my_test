package sb;

import android.view.animation.Animation;
import android.widget.TextView;
import io.nodle.cash.R;

public final class k implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f11077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f11078b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11079c;

    public k(TextView textView, n nVar, int i) {
        this.f11077a = textView;
        this.f11078b = nVar;
        this.f11079c = i;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f11077a.setTextColor(this.f11079c);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.f11077a.setTextColor(this.f11078b.getResources().getColor(R.color.colorErrorText));
    }
}
