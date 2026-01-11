package androidx.fragment.app;

import ah.v;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e6.e;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.e0;
import n0.x;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final List<View> f1795a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<View> f1796b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1797c;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1798s = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        e.D(context, "context");
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.J, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final void a(View view) {
        if (this.f1796b.contains(view)) {
            this.f1795a.add(view);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        e.D(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        e0 e0Var;
        e.D(windowInsets, "insets");
        e0 k10 = e0.k(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1797c;
        if (onApplyWindowInsetsListener != null) {
            e.B(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            e.C(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            e0Var = e0.k(onApplyWindowInsets, (View) null);
        } else {
            e0Var = x.k(this, k10);
        }
        if (!e0Var.h()) {
            int i = 0;
            int childCount = getChildCount();
            if (childCount > 0) {
                while (true) {
                    int i10 = i + 1;
                    x.c(getChildAt(i), e0Var);
                    if (i10 >= childCount) {
                        break;
                    }
                    i = i10;
                }
            }
        }
        return windowInsets;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final void dispatchDraw(Canvas canvas) {
        e.D(canvas, "canvas");
        if (this.f1798s) {
            Iterator it = this.f1795a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        e.D(canvas, "canvas");
        e.D(view, "child");
        if (!this.f1798s || !(!this.f1795a.isEmpty()) || !this.f1795a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final void endViewTransition(View view) {
        e.D(view, "view");
        this.f1796b.remove(view);
        if (this.f1795a.remove(view)) {
            this.f1798s = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        Fragment fragment;
        a0 a0Var;
        r rVar = null;
        View view = this;
        while (true) {
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fragment == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof r) {
                    rVar = (r) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rVar != null) {
                a0Var = rVar.getSupportFragmentManager();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (fragment.isAdded()) {
            a0Var = fragment.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return a0Var.E(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e.D(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i = childCount - 1;
                View childAt = getChildAt(childCount);
                e.C(childAt, "view");
                a(childAt);
                if (i < 0) {
                    break;
                }
                childCount = i;
            }
        }
        super.removeAllViewsInLayout();
    }

    public final void removeView(View view) {
        e.D(view, "view");
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        e.C(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        e.D(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i, int i10) {
        int i11 = i + i10;
        if (i < i11) {
            int i12 = i;
            while (true) {
                int i13 = i12 + 1;
                View childAt = getChildAt(i12);
                e.C(childAt, "view");
                a(childAt);
                if (i13 >= i11) {
                    break;
                }
                i12 = i13;
            }
        }
        super.removeViews(i, i10);
    }

    public final void removeViewsInLayout(int i, int i10) {
        int i11 = i + i10;
        if (i < i11) {
            int i12 = i;
            while (true) {
                int i13 = i12 + 1;
                View childAt = getChildAt(i12);
                e.C(childAt, "view");
                a(childAt);
                if (i13 >= i11) {
                    break;
                }
                i12 = i13;
            }
        }
        super.removeViewsInLayout(i, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f1798s = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        e.D(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f1797c = onApplyWindowInsetsListener;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final void startViewTransition(View view) {
        e.D(view, "view");
        if (view.getParent() == this) {
            this.f1796b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, a0 a0Var) {
        super(context, attributeSet);
        View view;
        e.D(context, "context");
        e.D(attributeSet, "attrs");
        e.D(a0Var, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.J, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment E = a0Var.E(id2);
        if (classAttribute != null && E == null) {
            if (id2 == -1) {
                String a02 = string != null ? e.a0(" with tag ", string) : BuildConfig.FLAVOR;
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + a02);
            }
            Fragment a10 = a0Var.H().a(context.getClassLoader(), classAttribute);
            e.C(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(a0Var);
            aVar.f1931p = true;
            a10.mContainer = this;
            aVar.e(getId(), a10, string, 1);
            if (!aVar.g) {
                aVar.f1924h = false;
                aVar.f1799q.B(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = ((ArrayList) a0Var.f1804c.e()).iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            Fragment fragment = g0Var.f1902c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                g0Var.b();
            }
        }
    }
}
