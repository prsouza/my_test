package androidx.appcompat.widget;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f1135a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1136b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<View> f1137c;

    /* renamed from: s  reason: collision with root package name */
    public LayoutInflater f1138s;

    /* renamed from: t  reason: collision with root package name */
    public a f1139t;

    public interface a {
        void a();
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.V, 0, 0);
        this.f1136b = obtainStyledAttributes.getResourceId(2, -1);
        this.f1135a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1135a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1138s;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1135a, viewGroup, false);
            int i = this.f1136b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1137c = new WeakReference<>(inflate);
            a aVar = this.f1139t;
            if (aVar != null) {
                aVar.a();
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1136b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1138s;
    }

    public int getLayoutResource() {
        return this.f1135a;
    }

    public final void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1136b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1138s = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1135a = i;
    }

    public void setOnInflateListener(a aVar) {
        this.f1139t = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1137c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }
}
