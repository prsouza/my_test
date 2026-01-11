package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import e6.l;
import f5.g;
import f5.i;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import x5.f;
import x5.u;

public final class FloatingActionButton extends u implements v5.a, l, CoordinatorLayout.b {
    public w5.c A;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f3918b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f3919c;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f3920s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f3921t;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f3922u;

    /* renamed from: v  reason: collision with root package name */
    public int f3923v;

    /* renamed from: w  reason: collision with root package name */
    public int f3924w;

    /* renamed from: x  reason: collision with root package name */
    public int f3925x;

    /* renamed from: y  reason: collision with root package name */
    public int f3926y;
    public boolean z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    public class b implements d6.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements d.f {

        /* renamed from: a  reason: collision with root package name */
        public final i<T> f3930a = null;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FloatingActionButton f3931b;

        /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.material.floatingactionbutton.FloatingActionButton, f5.i<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(f5.i<T> r1) {
            /*
                r0 = this;
                r0.f3931b = r1
                r0.<init>()
                r1 = 0
                r0.f3930a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.c.<init>(com.google.android.material.floatingactionbutton.FloatingActionButton):void");
        }

        public final void a() {
            this.f3930a.a();
        }

        public final void b() {
            this.f3930a.b();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).f3930a.equals(this.f3930a);
        }

        public final int hashCode() {
            return this.f3930a.hashCode();
        }
    }

    private d getImpl() {
        if (this.A == null) {
            this.A = new w5.c(this, new b());
        }
        return this.A;
    }

    public final boolean a() {
        throw null;
    }

    public final void d() {
        d impl = getImpl();
        if (impl.f3955p == null) {
            impl.f3955p = new ArrayList<>();
        }
        impl.f3955p.add((Object) null);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public final void e(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.f3954o == null) {
            impl.f3954o = new ArrayList<>();
        }
        impl.f3954o.add(animatorListener);
    }

    public final void f() {
        d impl = getImpl();
        c cVar = new c(this);
        if (impl.f3956q == null) {
            impl.f3956q = new ArrayList<>();
        }
        impl.f3956q.add(cVar);
    }

    @Deprecated
    public final void g(Rect rect) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.g.c(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            throw null;
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f3918b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3919c;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f3946e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f3947f;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.f3924w;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().f3949j;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f3922u;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f3922u;
    }

    public e6.i getShapeAppearanceModel() {
        e6.i iVar = getImpl().f3942a;
        Objects.requireNonNull(iVar);
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().i;
    }

    public int getSize() {
        return this.f3923v;
    }

    public int getSizeDimension() {
        return h(this.f3923v);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f3920s;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f3921t;
    }

    public boolean getUseCompatPadding() {
        return this.z;
    }

    public final int h(int i) {
        int i10 = this.f3924w;
        if (i10 != 0) {
            return i10;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return h(1);
        } else {
            return h(0);
        }
    }

    public final void i(a aVar, boolean z10) {
        a aVar2;
        AnimatorSet animatorSet;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new a(this, aVar);
        }
        if (!impl.g()) {
            Animator animator = impl.f3948h;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.r()) {
                g gVar = impl.f3949j;
                if (gVar != null) {
                    animatorSet = impl.b(gVar, 0.0f, 0.0f, 0.0f);
                } else {
                    animatorSet = impl.c(0.0f, 0.4f, 0.4f);
                }
                animatorSet.addListener(new b(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f3955p;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            impl.f3957r.b(z10 ? 8 : 4, z10);
            if (aVar2 != null) {
                aVar2.f3932a.a(aVar2.f3933b);
            }
        }
    }

    public final boolean j() {
        return getImpl().g();
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public final boolean k() {
        return getImpl().h();
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f3920s;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f3921t;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(androidx.appcompat.widget.l.c(colorForState, mode));
        }
    }

    public final void m(a aVar, boolean z10) {
        a aVar2;
        AnimatorSet animatorSet;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new a(this, aVar);
        }
        if (!impl.h()) {
            Animator animator = impl.f3948h;
            if (animator != null) {
                animator.cancel();
            }
            boolean z11 = impl.i == null;
            if (impl.r()) {
                if (impl.f3957r.getVisibility() != 0) {
                    float f10 = 0.0f;
                    impl.f3957r.setAlpha(0.0f);
                    impl.f3957r.setScaleY(z11 ? 0.4f : 0.0f);
                    impl.f3957r.setScaleX(z11 ? 0.4f : 0.0f);
                    if (z11) {
                        f10 = 0.4f;
                    }
                    impl.o(f10);
                }
                g gVar = impl.i;
                if (gVar != null) {
                    animatorSet = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                } else {
                    animatorSet = impl.c(1.0f, 1.0f, 1.0f);
                }
                animatorSet.addListener(new c(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f3954o;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            impl.f3957r.b(0, z10);
            impl.f3957r.setAlpha(1.0f);
            impl.f3957r.setScaleY(1.0f);
            impl.f3957r.setScaleX(1.0f);
            impl.o(1.0f);
            if (aVar2 != null) {
                aVar2.f3932a.b();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        Objects.requireNonNull(impl);
        if (!(impl instanceof w5.c)) {
            ViewTreeObserver viewTreeObserver = impl.f3957r.getViewTreeObserver();
            if (impl.f3963x == null) {
                impl.f3963x = new w5.b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f3963x);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f3957r.getViewTreeObserver();
        w5.b bVar = impl.f3963x;
        if (bVar != null) {
            viewTreeObserver.removeOnPreDrawListener(bVar);
            impl.f3963x = null;
        }
    }

    public final void onMeasure(int i, int i10) {
        this.f3925x = (getSizeDimension() - this.f3926y) / 2;
        getImpl().t();
        throw null;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g6.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g6.a aVar = (g6.a) parcelable;
        super.onRestoreInstanceState(aVar.f10849a);
        Bundle orDefault = aVar.f5259c.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = orDefault;
        throw null;
    }

    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        throw null;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g((Rect) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3918b != colorStateList) {
            this.f3918b = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3919c != mode) {
            this.f3919c = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f10) {
        d impl = getImpl();
        if (impl.f3945d != f10) {
            impl.f3945d = f10;
            impl.l(f10, impl.f3946e, impl.f3947f);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f3946e != f10) {
            impl.f3946e = f10;
            impl.l(impl.f3945d, f10, impl.f3947f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f3947f != f10) {
            impl.f3947f = f10;
            impl.l(impl.f3945d, impl.f3946e, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f3924w) {
            this.f3924w = i;
            requestLayout();
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        Objects.requireNonNull(getImpl());
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f3943b) {
            getImpl().f3943b = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f3949j = gVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(g.a(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.o(impl.f3951l);
            if (this.f3920s != null) {
                l();
            }
        }
    }

    public void setImageResource(int i) {
        throw null;
    }

    public void setMaxImageSize(int i) {
        this.f3926y = i;
        d impl = getImpl();
        if (impl.f3952m != i) {
            impl.f3952m = i;
            impl.o(impl.f3951l);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().m();
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().m();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f3944c = z10;
        impl.t();
        throw null;
    }

    public void setShapeAppearanceModel(e6.i iVar) {
        getImpl().f3942a = iVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().i = gVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(g.a(getContext(), i));
    }

    public void setSize(int i) {
        this.f3924w = 0;
        if (i != this.f3923v) {
            this.f3923v = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3920s != colorStateList) {
            this.f3920s = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3921t != mode) {
            this.f3921t = mode;
            l();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().n();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().n();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().n();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.z != z10) {
            this.z = z10;
            getImpl().j();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3927a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3928b;

        public BaseBehavior() {
            this.f3928b = true;
        }

        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1625h == 0) {
                fVar.f1625h = 80;
            }
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1619a instanceof BottomSheetBehavior : false) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayList = (ArrayList) coordinatorLayout.d(floatingActionButton);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = (View) arrayList.get(i10);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1619a instanceof BottomSheetBehavior : false) && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f3928b && fVar.f1624f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f3927a == null) {
                this.f3927a = new Rect();
            }
            Rect rect = this.f3927a;
            f.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.m((a) null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.m((a) null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5.a.f4624j);
            this.f3928b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f3922u != colorStateList) {
            this.f3922u = colorStateList;
            getImpl().p();
        }
    }
}
