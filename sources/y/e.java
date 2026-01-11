package y;

import ad.c;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;

public abstract class e extends b {

    /* renamed from: x  reason: collision with root package name */
    public boolean f13325x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f13326y;

    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f311f0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f13325x = true;
                } else if (index == 22) {
                    this.f13326y = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13325x || this.f13326y) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f1503b; i++) {
                    View d10 = constraintLayout.d(this.f1502a[i]);
                    if (d10 != null) {
                        if (this.f13325x) {
                            d10.setVisibility(visibility);
                        }
                        if (this.f13326y && elevation > 0.0f) {
                            d10.setTranslationZ(d10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }
}
