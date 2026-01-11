package k6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f7446a;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f7446a = expandableTransformationBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7446a.f4177b = null;
    }
}
