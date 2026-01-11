package com.google.android.material.bottomappbar;

import a.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e6.f;
import io.nodle.cash.R;
import j5.c;
import j5.d;
import j5.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import x5.t;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ int f3672q0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public Integer f3673h0;

    /* renamed from: i0  reason: collision with root package name */
    public Animator f3674i0;

    /* renamed from: j0  reason: collision with root package name */
    public Animator f3675j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f3676k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f3677l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f3678m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f3679n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f3680o0;

    /* renamed from: p0  reason: collision with root package name */
    public Behavior f3681p0;

    public static class a extends s0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0041a();

        /* renamed from: c  reason: collision with root package name */
        public int f3686c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f3687s;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a  reason: collision with other inner class name */
        public class C0041a implements Parcelable.ClassLoaderCreator<a> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new a[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeInt(this.f3686c);
            parcel.writeInt(this.f3687s ? 1 : 0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3686c = parcel.readInt();
            this.f3687s = parcel.readInt() != 0;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return z(this.f3676k0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().B;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private g getTopEdgeTreatment() {
        throw null;
    }

    public final boolean A() {
        FloatingActionButton w6 = w();
        return w6 != null && w6.k();
    }

    public final void B() {
        getTopEdgeTreatment().C = getFabTranslationX();
        x();
        if (this.f3680o0) {
            boolean A = A();
        }
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().B;
    }

    public int getFabAlignmentMode() {
        return this.f3676k0;
    }

    public int getFabAnimationMode() {
        return this.f3677l0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().A;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().z;
    }

    public boolean getHideOnScroll() {
        return this.f3678m0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.F0(this, (f) null);
        throw null;
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        super.onLayout(z, i, i10, i11, i12);
        if (z) {
            Animator animator = this.f3675j0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f3674i0;
            if (animator2 != null) {
                animator2.cancel();
            }
            B();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f3675j0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!A()) {
                actionMenuView.setTranslationX((float) y(actionMenuView, 0, false));
            } else {
                actionMenuView.setTranslationX((float) y(actionMenuView, this.f3676k0, this.f3680o0));
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f10849a);
        this.f3676k0 = aVar.f3686c;
        this.f3680o0 = aVar.f3687s;
    }

    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f3686c = this.f3676k0;
        aVar.f3687s = this.f3680o0;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            g topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f10 >= 0.0f) {
                topEdgeTreatment.B = f10;
                throw null;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    public void setElevation(float f10) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i10;
        this.f3679n0 = 0;
        boolean z = this.f3680o0;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (!x.g.c(this)) {
            int i11 = this.f3679n0;
            if (i11 != 0) {
                this.f3679n0 = 0;
                getMenu().clear();
                n(i11);
            }
        } else {
            Animator animator = this.f3675j0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!A()) {
                z = false;
                i10 = 0;
            } else {
                i10 = i;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
                if (Math.abs(actionMenuView.getTranslationX() - ((float) y(actionMenuView, i10, z))) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                    ofFloat2.addListener(new d(this, actionMenuView, i10, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150);
                    animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f3675j0 = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.f3675j0.start();
        }
        if (this.f3676k0 != i && x.g.c(this)) {
            Animator animator2 = this.f3674i0;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f3677l0 == 1) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w(), "translationX", new float[]{z(i)});
                ofFloat3.setDuration(300);
                arrayList2.add(ofFloat3);
            } else {
                FloatingActionButton w6 = w();
                if (w6 != null && !w6.j()) {
                    w6.i(new j5.b(this, i), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f3674i0 = animatorSet3;
            animatorSet3.addListener(new j5.a(this));
            this.f3674i0.start();
        }
        this.f3676k0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f3677l0 = i;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().D) {
            getTopEdgeTreatment().D = f10;
            throw null;
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().A = f10;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().z = f10;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f3678m0 = z;
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f3673h0 == null)) {
            drawable = drawable.mutate();
            drawable.setTint(this.f3673h0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f3673h0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public final FloatingActionButton w() {
        View x10 = x();
        if (x10 instanceof FloatingActionButton) {
            return (FloatingActionButton) x10;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View x() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.e(r4)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002e
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x001a
        L_0x002e:
            return r2
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.x():android.view.View");
    }

    public final int y(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean c10 = t.c(this);
        int measuredWidth = c10 ? getMeasuredWidth() : 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f5519a & 8388615) == 8388611) {
                if (c10) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((c10 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }

    public final float z(int i) {
        boolean c10 = t.c(this);
        int i10 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) + 0;
        if (c10) {
            i10 = -1;
        }
        return (float) (measuredWidth * i10);
    }

    public Behavior getBehavior() {
        if (this.f3681p0 == null) {
            this.f3681p0 = new Behavior();
        }
        return this.f3681p0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        public final Rect f3682e = new Rect();

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f3683f;
        public int g;

        /* renamed from: h  reason: collision with root package name */
        public final a f3684h = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                if (Behavior.this.f3683f.get() == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Behavior.this.f3682e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f3683f = new WeakReference<>(bottomAppBar);
            int i10 = BottomAppBar.f3672q0;
            View x10 = bottomAppBar.x();
            if (x10 != null) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (!x.g.c(x10)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) x10.getLayoutParams();
                    fVar.f1622d = 49;
                    this.g = fVar.bottomMargin;
                    if (x10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) x10;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f3684h);
                        floatingActionButton.d();
                        floatingActionButton.e(new j5.f(bottomAppBar));
                        floatingActionButton.f();
                    }
                    bottomAppBar.B();
                    throw null;
                }
            }
            coordinatorLayout.r(bottomAppBar, i);
            this.f3655a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
