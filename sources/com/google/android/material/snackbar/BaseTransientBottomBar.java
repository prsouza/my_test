package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import io.nodle.cash.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import x5.t;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3986a = 0;

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: h  reason: collision with root package name */
        public final b f3987h = new b(this);

        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            Objects.requireNonNull(this.f3987h);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (f6.a.a().f5004a) {
                    }
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                synchronized (f6.a.a().f5004a) {
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        public final boolean s(View view) {
            Objects.requireNonNull(this.f3987h);
            return view instanceof c;
        }
    }

    public class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            } else if (i != 1) {
                return false;
            } else {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            }
        }
    }

    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            Objects.requireNonNull(swipeDismissBehavior);
            swipeDismissBehavior.f3664e = SwipeDismissBehavior.t(0.1f);
            swipeDismissBehavior.f3665f = SwipeDismissBehavior.t(0.6f);
            swipeDismissBehavior.f3662c = 0;
        }
    }

    public static class c extends FrameLayout {
        public static final a z = new a();

        /* renamed from: a  reason: collision with root package name */
        public BaseTransientBottomBar<?> f3988a;

        /* renamed from: b  reason: collision with root package name */
        public int f3989b;

        /* renamed from: c  reason: collision with root package name */
        public final float f3990c;

        /* renamed from: s  reason: collision with root package name */
        public final float f3991s;

        /* renamed from: t  reason: collision with root package name */
        public final int f3992t;

        /* renamed from: u  reason: collision with root package name */
        public final int f3993u;

        /* renamed from: v  reason: collision with root package name */
        public ColorStateList f3994v;

        /* renamed from: w  reason: collision with root package name */
        public PorterDuff.Mode f3995w;

        /* renamed from: x  reason: collision with root package name */
        public Rect f3996x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f3997y;

        public class a implements View.OnTouchListener {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(j6.a.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, e5.a.B);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.i.s(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f3989b = obtainStyledAttributes.getInt(2, 0);
            this.f3990c = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(b6.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(t.d(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f3991s = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f3992t = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f3993u = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(z);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(y.c.N(y.c.B(this, R.attr.colorSurface), y.c.B(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                ColorStateList colorStateList = this.f3994v;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                x.d.q(this, gradientDrawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f3988a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f3991s;
        }

        public int getAnimationMode() {
            return this.f3989b;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f3990c;
        }

        public int getMaxInlineActionWidth() {
            return this.f3993u;
        }

        public int getMaxWidth() {
            return this.f3992t;
        }

        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f3988a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.a();
            }
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.h.c(this);
        }

        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f3988a != null) {
                synchronized (f6.a.a().f5004a) {
                }
            }
        }

        public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
            super.onLayout(z10, i, i10, i11, i12);
        }

        public void onMeasure(int i, int i10) {
            int i11;
            super.onMeasure(i, i10);
            if (this.f3992t > 0 && getMeasuredWidth() > (i11 = this.f3992t)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
            }
        }

        public void setAnimationMode(int i) {
            this.f3989b = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f3994v == null)) {
                drawable = drawable.mutate();
                drawable.setTintList(this.f3994v);
                drawable.setTintMode(this.f3995w);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f3994v = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintList(colorStateList);
                mutate.setTintMode(this.f3995w);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f3995w = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintMode(mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f3997y && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f3996x = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f3988a;
                if (baseTransientBottomBar != null) {
                    int i = BaseTransientBottomBar.f3986a;
                    Objects.requireNonNull(baseTransientBottomBar);
                    throw null;
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : z);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        new Handler(Looper.getMainLooper(), new a());
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
    }
}
