package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import k6.a;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f4177b;

    public ExpandableTransformationBehavior() {
    }

    public void s(View view, View view2, boolean z, boolean z10) {
        AnimatorSet animatorSet = this.f4177b;
        boolean z11 = animatorSet != null;
        if (z11) {
            animatorSet.cancel();
        }
        AnimatorSet t10 = t(view, view2, z, z11);
        this.f4177b = t10;
        t10.addListener(new a(this));
        this.f4177b.start();
        if (!z10) {
            this.f4177b.end();
        }
    }

    public abstract AnimatorSet t(View view, View view2, boolean z, boolean z10);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
