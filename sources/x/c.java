package x;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import x.d;

public final class c extends b implements d.C0248d {
    public View[] A;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12718x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f12719y;
    public float z;

    public final void a() {
    }

    public final void b() {
    }

    public float getProgress() {
        return this.z;
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ad.c.f321l0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f12718x = obtainStyledAttributes.getBoolean(index, this.f12718x);
                } else if (index == 0) {
                    this.f12719y = obtainStyledAttributes.getBoolean(index, this.f12719y);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.z = f10;
        int i = 0;
        if (this.f1503b > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f1508v;
            if (viewArr == null || viewArr.length != this.f1503b) {
                this.f1508v = new View[this.f1503b];
            }
            for (int i10 = 0; i10 < this.f1503b; i10++) {
                this.f1508v[i10] = constraintLayout.d(this.f1502a[i10]);
            }
            this.A = this.f1508v;
            while (i < this.f1503b) {
                View view = this.A[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            boolean z10 = viewGroup.getChildAt(i) instanceof c;
            i++;
        }
    }
}
