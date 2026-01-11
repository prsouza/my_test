package pb;

import android.animation.Animator;
import android.widget.LinearLayout;
import android.widget.TextView;
import e6.e;
import io.nodle.cash.R;

public final class g implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9834a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9835b;

    public g(c cVar, String str) {
        this.f9834a = cVar;
        this.f9835b = str;
    }

    public final void onAnimationCancel(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationEnd(Animator animator) {
        e.D(animator, "animator");
        TextView textView = (TextView) this.f9834a.b(R.id.pendingTextView);
        if (textView != null) {
            textView.setText(this.f9835b);
        }
        LinearLayout linearLayout = (LinearLayout) this.f9834a.b(R.id.pendingRewardLayout);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new f(this.f9834a));
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationStart(Animator animator) {
        e.D(animator, "animator");
    }
}
