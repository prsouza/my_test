package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.r;
import n0.x;
import o0.b;
import t1.b;
import x5.o;
import x5.t;

@b.C0222b
public class TabLayout extends HorizontalScrollView {

    /* renamed from: h0  reason: collision with root package name */
    public static final m0.c<f> f4009h0 = new m0.e(16);
    public Drawable A = new GradientDrawable();
    public int B = 0;
    public PorterDuff.Mode C;
    public float D;
    public float E;
    public final int F;
    public int G = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R = -1;
    public int S;
    public boolean T;
    public a U;
    public c V;
    public final ArrayList<c> W = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<f> f4010a = new ArrayList<>();

    /* renamed from: a0  reason: collision with root package name */
    public i f4011a0;

    /* renamed from: b  reason: collision with root package name */
    public f f4012b;
    public ValueAnimator b0;

    /* renamed from: c  reason: collision with root package name */
    public final e f4013c;

    /* renamed from: c0  reason: collision with root package name */
    public t1.b f4014c0;

    /* renamed from: d0  reason: collision with root package name */
    public g f4015d0;

    /* renamed from: e0  reason: collision with root package name */
    public b f4016e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f4017f0;

    /* renamed from: g0  reason: collision with root package name */
    public final m0.c<h> f4018g0 = new m0.d(12);

    /* renamed from: s  reason: collision with root package name */
    public int f4019s;

    /* renamed from: t  reason: collision with root package name */
    public int f4020t;

    /* renamed from: u  reason: collision with root package name */
    public int f4021u;

    /* renamed from: v  reason: collision with root package name */
    public int f4022v;

    /* renamed from: w  reason: collision with root package name */
    public int f4023w;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f4024x;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f4025y;
    public ColorStateList z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements b.e {
        public b() {
        }

        public final void a(t1.b bVar) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f4014c0 == bVar) {
                tabLayout.k();
            }
        }
    }

    @Deprecated
    public interface c<T extends f> {
        void a(T t10);

        void b();

        void c(T t10);
    }

    public interface d extends c<f> {
    }

    public class e extends LinearLayout {

        /* renamed from: t  reason: collision with root package name */
        public static final /* synthetic */ int f4028t = 0;

        /* renamed from: a  reason: collision with root package name */
        public ValueAnimator f4029a;

        /* renamed from: b  reason: collision with root package name */
        public int f4030b = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f4031c;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f4033a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f4034b;

            public a(View view, View view2) {
                this.f4033a = view;
                this.f4034b = view2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                e.this.c(this.f4033a, this.f4034b, valueAnimator.getAnimatedFraction());
            }
        }

        public class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f4036a;

            public b(int i) {
                this.f4036a = i;
            }

            public final void onAnimationEnd(Animator animator) {
                e.this.f4030b = this.f4036a;
            }

            public final void onAnimationStart(Animator animator) {
                e.this.f4030b = this.f4036a;
            }
        }

        public e(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a() {
            View childAt = getChildAt(this.f4030b);
            TabLayout tabLayout = TabLayout.this;
            a aVar = tabLayout.U;
            Drawable drawable = tabLayout.A;
            Objects.requireNonNull(aVar);
            RectF a10 = a.a(tabLayout, childAt);
            drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
        }

        public final void b(int i) {
            Rect bounds = TabLayout.this.A.getBounds();
            TabLayout.this.A.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.U.b(tabLayout, view, view2, f10, tabLayout.A);
            } else {
                Drawable drawable = TabLayout.this.A;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.A.getBounds().bottom);
            }
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.d.k(this);
        }

        public final void d(boolean z, int i, int i10) {
            View childAt = getChildAt(this.f4030b);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f4029a = valueAnimator;
                valueAnimator.setInterpolator(f5.a.f4985b);
                valueAnimator.setDuration((long) i10);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i));
                valueAnimator.start();
                return;
            }
            this.f4029a.removeAllUpdateListeners();
            this.f4029a.addUpdateListener(aVar);
        }

        public final void draw(Canvas canvas) {
            int height = TabLayout.this.A.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.A.getIntrinsicHeight();
            }
            int i = TabLayout.this.N;
            int i10 = 0;
            if (i == 0) {
                i10 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i10 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                if (i != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.A.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.A.getBounds();
                TabLayout.this.A.setBounds(bounds.left, i10, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.A;
                int i11 = tabLayout.B;
                if (i11 != 0) {
                    drawable.setTint(i11);
                } else {
                    drawable.setTintList((ColorStateList) null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
            super.onLayout(z, i, i10, i11, i12);
            ValueAnimator valueAnimator = this.f4029a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
            } else {
                d(false, this.f4030b, -1);
            }
        }

        public final void onMeasure(int i, int i10) {
            super.onMeasure(i, i10);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.L == 1 || tabLayout.O == 2) {
                    int childCount = getChildCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = getChildAt(i12);
                        if (childAt.getVisibility() == 0) {
                            i11 = Math.max(i11, childAt.getMeasuredWidth());
                        }
                    }
                    if (i11 > 0) {
                        if (i11 * childCount <= getMeasuredWidth() - (((int) t.a(getContext(), 16)) * 2)) {
                            boolean z10 = false;
                            for (int i13 = 0; i13 < childCount; i13++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                                if (layoutParams.width != i11 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i11;
                                    layoutParams.weight = 0.0f;
                                    z10 = true;
                                }
                            }
                            z = z10;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.L = 0;
                            tabLayout2.q(false);
                        }
                        if (z) {
                            super.onMeasure(i, i10);
                        }
                    }
                }
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f4038a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f4039b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f4040c;

        /* renamed from: d  reason: collision with root package name */
        public int f4041d = -1;

        /* renamed from: e  reason: collision with root package name */
        public View f4042e;

        /* renamed from: f  reason: collision with root package name */
        public TabLayout f4043f;
        public h g;

        /* renamed from: h  reason: collision with root package name */
        public int f4044h = -1;

        public final void a() {
            TabLayout tabLayout = this.f4043f;
            if (tabLayout != null) {
                tabLayout.l(this, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final f b(CharSequence charSequence) {
            this.f4040c = charSequence;
            d();
            return this;
        }

        public final f c(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f4040c) && !TextUtils.isEmpty(charSequence)) {
                this.g.setContentDescription(charSequence);
            }
            this.f4039b = charSequence;
            d();
            return this;
        }

        public final void d() {
            h hVar = this.g;
            if (hVar != null) {
                hVar.g();
            }
        }
    }

    public static class g implements b.f {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f4045a;

        /* renamed from: b  reason: collision with root package name */
        public int f4046b;

        /* renamed from: c  reason: collision with root package name */
        public int f4047c;

        public g(TabLayout tabLayout) {
            this.f4045a = new WeakReference<>(tabLayout);
        }

        public final void a(int i) {
            this.f4046b = this.f4047c;
            this.f4047c = i;
        }
    }

    public final class h extends LinearLayout {
        public static final /* synthetic */ int A = 0;

        /* renamed from: a  reason: collision with root package name */
        public f f4048a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f4049b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f4050c;

        /* renamed from: s  reason: collision with root package name */
        public View f4051s;

        /* renamed from: t  reason: collision with root package name */
        public h5.a f4052t;

        /* renamed from: u  reason: collision with root package name */
        public View f4053u;

        /* renamed from: v  reason: collision with root package name */
        public TextView f4054v;

        /* renamed from: w  reason: collision with root package name */
        public ImageView f4055w;

        /* renamed from: x  reason: collision with root package name */
        public Drawable f4056x;

        /* renamed from: y  reason: collision with root package name */
        public int f4057y = 2;

        public h(Context context) {
            super(context);
            h(context);
            int i = TabLayout.this.f4019s;
            int i10 = TabLayout.this.f4020t;
            int i11 = TabLayout.this.f4021u;
            int i12 = TabLayout.this.f4022v;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.e.k(this, i, i10, i11, i12);
            setGravity(17);
            setOrientation(TabLayout.this.P ^ true ? 1 : 0);
            setClickable(true);
            x.r(this, r.a(getContext()));
        }

        private h5.a getBadge() {
            return this.f4052t;
        }

        private h5.a getOrCreateBadge() {
            if (this.f4052t == null) {
                this.f4052t = new h5.a(getContext());
            }
            e();
            h5.a aVar = this.f4052t;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        public final boolean b() {
            return this.f4052t != null;
        }

        public final void c(View view) {
            if (b() && view != null) {
                a(false);
                h5.c.a(this.f4052t, view);
                this.f4051s = view;
            }
        }

        public final void d() {
            if (b()) {
                a(true);
                View view = this.f4051s;
                if (view != null) {
                    h5.c.b(this.f4052t, view);
                    this.f4051s = null;
                }
            }
        }

        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f4056x;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.f4056x.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            f fVar;
            f fVar2;
            if (b()) {
                if (this.f4053u != null) {
                    d();
                    return;
                }
                ImageView imageView = this.f4050c;
                if (imageView == null || (fVar2 = this.f4048a) == null || fVar2.f4038a == null) {
                    if (this.f4049b == null || (fVar = this.f4048a) == null) {
                        d();
                        return;
                    }
                    Objects.requireNonNull(fVar);
                    View view = this.f4051s;
                    TextView textView = this.f4049b;
                    if (view != textView) {
                        d();
                        c(this.f4049b);
                        return;
                    }
                    f(textView);
                } else if (this.f4051s != imageView) {
                    d();
                    c(this.f4050c);
                } else {
                    f(imageView);
                }
            }
        }

        public final void f(View view) {
            if (b() && view == this.f4051s) {
                h5.c.c(this.f4052t, view);
            }
        }

        public final void g() {
            f fVar = this.f4048a;
            View view = fVar != null ? fVar.f4042e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f4053u = view;
                TextView textView = this.f4049b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f4050c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f4050c.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f4054v = textView2;
                if (textView2 != null) {
                    this.f4057y = textView2.getMaxLines();
                }
                this.f4055w = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f4053u;
                if (view2 != null) {
                    removeView(view2);
                    this.f4053u = null;
                }
                this.f4054v = null;
                this.f4055w = null;
            }
            boolean z10 = false;
            if (this.f4053u == null) {
                if (this.f4050c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, this, false);
                    this.f4050c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f4049b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, this, false);
                    this.f4049b = textView3;
                    addView(textView3);
                    this.f4057y = this.f4049b.getMaxLines();
                }
                this.f4049b.setTextAppearance(TabLayout.this.f4023w);
                ColorStateList colorStateList = TabLayout.this.f4024x;
                if (colorStateList != null) {
                    this.f4049b.setTextColor(colorStateList);
                }
                i(this.f4049b, this.f4050c);
                e();
                ImageView imageView3 = this.f4050c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new b(this, imageView3));
                }
                TextView textView4 = this.f4049b;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new b(this, textView4));
                }
            } else {
                TextView textView5 = this.f4054v;
                if (!(textView5 == null && this.f4055w == null)) {
                    i(textView5, this.f4055w);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f4040c)) {
                setContentDescription(fVar.f4040c);
            }
            if (fVar != null) {
                TabLayout tabLayout = fVar.f4043f;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition != -1 && selectedTabPosition == fVar.f4041d) {
                        z10 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z10);
        }

        public int getContentHeight() {
            View[] viewArr = {this.f4049b, this.f4050c, this.f4053u};
            int i = 0;
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < 3; i11++) {
                View view = viewArr[i11];
                if (view != null && view.getVisibility() == 0) {
                    i10 = z10 ? Math.min(i10, view.getTop()) : view.getTop();
                    i = z10 ? Math.max(i, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i - i10;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f4049b, this.f4050c, this.f4053u};
            int i = 0;
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < 3; i11++) {
                View view = viewArr[i11];
                if (view != null && view.getVisibility() == 0) {
                    i10 = z10 ? Math.min(i10, view.getLeft()) : view.getLeft();
                    i = z10 ? Math.max(i, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i - i10;
        }

        public f getTab() {
            return this.f4048a;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.F
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = a.b.a0(r6, r0)
                r5.f4056x = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f4056x
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f4056x = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.z
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.z
                android.content.res.ColorStateList r2 = c6.a.a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.T
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                java.util.WeakHashMap<android.view.View, n0.a0> r0 = n0.x.f8842a
                n0.x.d.q(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.h(android.content.Context):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.f4038a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(android.widget.TextView r7, android.widget.ImageView r8) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout$f r0 = r6.f4048a
                r1 = 0
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.f4038a
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L_0x000f
            L_0x000e:
                r0 = r1
            L_0x000f:
                if (r0 == 0) goto L_0x0021
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f4025y
                r0.setTintList(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.C
                if (r2 == 0) goto L_0x0021
                r0.setTintMode(r2)
            L_0x0021:
                com.google.android.material.tabs.TabLayout$f r2 = r6.f4048a
                if (r2 == 0) goto L_0x0028
                java.lang.CharSequence r2 = r2.f4039b
                goto L_0x0029
            L_0x0028:
                r2 = r1
            L_0x0029:
                r3 = 8
                r4 = 0
                if (r8 == 0) goto L_0x0040
                if (r0 == 0) goto L_0x003a
                r8.setImageDrawable(r0)
                r8.setVisibility(r4)
                r6.setVisibility(r4)
                goto L_0x0040
            L_0x003a:
                r8.setVisibility(r3)
                r8.setImageDrawable(r1)
            L_0x0040:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                r0 = r0 ^ 1
                if (r7 == 0) goto L_0x005f
                if (r0 == 0) goto L_0x0059
                r7.setText(r2)
                com.google.android.material.tabs.TabLayout$f r5 = r6.f4048a
                java.util.Objects.requireNonNull(r5)
                r7.setVisibility(r4)
                r6.setVisibility(r4)
                goto L_0x005f
            L_0x0059:
                r7.setVisibility(r3)
                r7.setText(r1)
            L_0x005f:
                if (r8 == 0) goto L_0x00a1
                android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
                if (r0 == 0) goto L_0x0079
                int r5 = r8.getVisibility()
                if (r5 != 0) goto L_0x0079
                android.content.Context r5 = r6.getContext()
                float r3 = x5.t.a(r5, r3)
                int r3 = (int) r3
                goto L_0x007a
            L_0x0079:
                r3 = r4
            L_0x007a:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                boolean r5 = r5.P
                if (r5 == 0) goto L_0x0092
                int r5 = r7.getMarginEnd()
                if (r3 == r5) goto L_0x00a1
                r7.setMarginEnd(r3)
                r7.bottomMargin = r4
                r8.setLayoutParams(r7)
                r8.requestLayout()
                goto L_0x00a1
            L_0x0092:
                int r5 = r7.bottomMargin
                if (r3 == r5) goto L_0x00a1
                r7.bottomMargin = r3
                r7.setMarginEnd(r4)
                r8.setLayoutParams(r7)
                r8.requestLayout()
            L_0x00a1:
                com.google.android.material.tabs.TabLayout$f r7 = r6.f4048a
                if (r7 == 0) goto L_0x00a7
                java.lang.CharSequence r1 = r7.f4040c
            L_0x00a7:
                int r7 = android.os.Build.VERSION.SDK_INT
                r8 = 23
                if (r7 <= r8) goto L_0x00b4
                if (r0 == 0) goto L_0x00b0
                goto L_0x00b1
            L_0x00b0:
                r2 = r1
            L_0x00b1:
                androidx.appcompat.widget.g1.a(r6, r2)
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.i(android.widget.TextView, android.widget.ImageView):void");
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            h5.a aVar = this.f4052t;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f4052t.c());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(0, 1, this.f4048a.f4041d, 1, isSelected()).f9187a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) b.a.f9176e.f9182a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) goto L_0x0095;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L_0x001e
                if (r1 == 0) goto L_0x0014
                if (r0 <= r2) goto L_0x001e
            L_0x0014:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.G
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L_0x001e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f4049b
                if (r0 == 0) goto L_0x00a5
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.D
                int r1 = r7.f4057y
                android.widget.ImageView r2 = r7.f4050c
                r3 = 1
                if (r2 == 0) goto L_0x0038
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L_0x0038
                r1 = r3
                goto L_0x0046
            L_0x0038:
                android.widget.TextView r2 = r7.f4049b
                if (r2 == 0) goto L_0x0046
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L_0x0046
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.E
            L_0x0046:
                android.widget.TextView r2 = r7.f4049b
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.f4049b
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.f4049b
                int r5 = r5.getMaxLines()
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L_0x0060
                if (r5 < 0) goto L_0x00a5
                if (r1 == r5) goto L_0x00a5
            L_0x0060:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.O
                r6 = 0
                if (r5 != r3) goto L_0x0096
                if (r2 <= 0) goto L_0x0096
                if (r4 != r3) goto L_0x0096
                android.widget.TextView r2 = r7.f4049b
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L_0x0095
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0096
            L_0x0095:
                r3 = r6
            L_0x0096:
                if (r3 == 0) goto L_0x00a5
                android.widget.TextView r2 = r7.f4049b
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f4049b
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L_0x00a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.onMeasure(int, int):void");
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f4048a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f4048a.a();
            return true;
        }

        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f4049b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f4050c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f4053u;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(f fVar) {
            if (fVar != this.f4048a) {
                this.f4048a = fVar;
                g();
            }
        }
    }

    public static class i implements d {

        /* renamed from: a  reason: collision with root package name */
        public final t1.b f4058a;

        public i(t1.b bVar) {
            this.f4058a = bVar;
        }

        public final void a(f fVar) {
        }

        public final void b() {
        }

        public final void c(f fVar) {
            this.f4058a.setCurrentItem(fVar.f4041d);
        }
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet) {
        super(j6.a.a(context, attributeSet, R.attr.tabStyle, 2131821392), attributeSet, R.attr.tabStyle);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context2);
        this.f4013c = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d10 = o.d(context2, attributeSet, e5.a.E, R.attr.tabStyle, 2131821392, 23);
        if (getBackground() instanceof ColorDrawable) {
            e6.f fVar = new e6.f();
            fVar.o(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            fVar.m(context2);
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            fVar.n(x.i.i(this));
            x.d.q(this, fVar);
        }
        setSelectedTabIndicator(b6.c.c(context2, d10, 5));
        setSelectedTabIndicatorColor(d10.getColor(8, 0));
        eVar.b(d10.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d10.getInt(10, 0));
        setTabIndicatorAnimationMode(d10.getInt(7, 0));
        setTabIndicatorFullWidth(d10.getBoolean(9, true));
        int dimensionPixelSize = d10.getDimensionPixelSize(16, 0);
        this.f4022v = dimensionPixelSize;
        this.f4021u = dimensionPixelSize;
        this.f4020t = dimensionPixelSize;
        this.f4019s = dimensionPixelSize;
        this.f4019s = d10.getDimensionPixelSize(19, dimensionPixelSize);
        this.f4020t = d10.getDimensionPixelSize(20, this.f4020t);
        this.f4021u = d10.getDimensionPixelSize(18, this.f4021u);
        this.f4022v = d10.getDimensionPixelSize(17, this.f4022v);
        int resourceId = d10.getResourceId(23, 2131821049);
        this.f4023w = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, ad.c.R);
        try {
            this.D = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f4024x = b6.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d10.hasValue(24)) {
                this.f4024x = b6.c.a(context2, d10, 24);
            }
            if (d10.hasValue(22)) {
                int color = d10.getColor(22, 0);
                int defaultColor = this.f4024x.getDefaultColor();
                this.f4024x = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.f4025y = b6.c.a(context2, d10, 3);
            this.C = t.d(d10.getInt(4, -1), (PorterDuff.Mode) null);
            this.z = b6.c.a(context2, d10, 21);
            this.M = d10.getInt(6, 300);
            this.H = d10.getDimensionPixelSize(14, -1);
            this.I = d10.getDimensionPixelSize(13, -1);
            this.F = d10.getResourceId(0, 0);
            this.K = d10.getDimensionPixelSize(1, 0);
            this.O = d10.getInt(15, 1);
            this.L = d10.getInt(2, 0);
            this.P = d10.getBoolean(12, false);
            this.T = d10.getBoolean(25, false);
            d10.recycle();
            Resources resources = getResources();
            this.E = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.J = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            f();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        int size = this.f4010a.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                f fVar = this.f4010a.get(i10);
                if (fVar != null && fVar.f4038a != null && !TextUtils.isEmpty(fVar.f4039b)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return (!z10 || this.P) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.H;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.O;
        if (i11 == 0 || i11 == 2) {
            return this.J;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f4013c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f4013c.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f4013c.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    @Deprecated
    public final void a(c cVar) {
        if (!this.W.contains(cVar)) {
            this.W.add(cVar);
        }
    }

    public final void addView(View view) {
        d(view);
    }

    public final void b(f fVar) {
        c(fVar, this.f4010a.isEmpty());
    }

    public final void c(f fVar, boolean z10) {
        int size = this.f4010a.size();
        if (fVar.f4043f == this) {
            fVar.f4041d = size;
            this.f4010a.add(size, fVar);
            int size2 = this.f4010a.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                this.f4010a.get(size).f4041d = size;
            }
            h hVar = fVar.g;
            hVar.setSelected(false);
            hVar.setActivated(false);
            e eVar = this.f4013c;
            int i10 = fVar.f4041d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            p(layoutParams);
            eVar.addView(hVar, i10, layoutParams);
            if (z10) {
                fVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void d(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            f j10 = j();
            CharSequence charSequence = tabItem.f4006a;
            if (charSequence != null) {
                j10.c(charSequence);
            }
            Drawable drawable = tabItem.f4007b;
            if (drawable != null) {
                j10.f4038a = drawable;
                TabLayout tabLayout = j10.f4043f;
                if (tabLayout.L == 1 || tabLayout.O == 2) {
                    tabLayout.q(true);
                }
                j10.d();
            }
            int i10 = tabItem.f4008c;
            if (i10 != 0) {
                j10.f4042e = LayoutInflater.from(j10.g.getContext()).inflate(i10, j10.g, false);
                j10.d();
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                j10.b(tabItem.getContentDescription());
            }
            b(j10);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void e(int i10) {
        boolean z10;
        if (i10 != -1) {
            if (getWindowToken() != null) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (x.g.c(this)) {
                    e eVar = this.f4013c;
                    int childCount = eVar.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            z10 = false;
                            break;
                        } else if (eVar.getChildAt(i11).getWidth() <= 0) {
                            z10 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (!z10) {
                        int scrollX = getScrollX();
                        int g8 = g(i10);
                        if (scrollX != g8) {
                            h();
                            this.b0.setIntValues(new int[]{scrollX, g8});
                            this.b0.start();
                        }
                        e eVar2 = this.f4013c;
                        int i12 = this.M;
                        ValueAnimator valueAnimator = eVar2.f4029a;
                        if (valueAnimator != null && valueAnimator.isRunning()) {
                            eVar2.f4029a.cancel();
                        }
                        eVar2.d(true, i10, i12);
                        return;
                    }
                }
            }
            m(i10, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 != 2) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r5 = this;
            int r0 = r5.O
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = r2
            goto L_0x0014
        L_0x000b:
            int r0 = r5.K
            int r3 = r5.f4019s
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            com.google.android.material.tabs.TabLayout$e r3 = r5.f4013c
            java.util.WeakHashMap<android.view.View, n0.a0> r4 = n0.x.f8842a
            n0.x.e.k(r3, r0, r2, r2, r2)
            int r0 = r5.O
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 == r3) goto L_0x0027
            if (r0 == r1) goto L_0x0027
            goto L_0x0052
        L_0x0027:
            int r0 = r5.L
            if (r0 != r1) goto L_0x0030
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L_0x0030:
            com.google.android.material.tabs.TabLayout$e r0 = r5.f4013c
            r0.setGravity(r3)
            goto L_0x0052
        L_0x0036:
            int r0 = r5.L
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x003f
            if (r0 == r1) goto L_0x004a
            goto L_0x0052
        L_0x003f:
            com.google.android.material.tabs.TabLayout$e r0 = r5.f4013c
            r0.setGravity(r3)
            goto L_0x0052
        L_0x0045:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L_0x004a:
            com.google.android.material.tabs.TabLayout$e r0 = r5.f4013c
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L_0x0052:
            r5.q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f():void");
    }

    public final int g(int i10) {
        View childAt;
        int i11 = this.O;
        int i12 = 0;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f4013c.getChildAt(i10)) == null) {
            return 0;
        }
        int i13 = i10 + 1;
        View childAt2 = i13 < this.f4013c.getChildCount() ? this.f4013c.getChildAt(i13) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i12 = childAt2.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) (((float) (width + i12)) * 0.5f * 0.0f);
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        return x.e.d(this) == 0 ? left + i14 : left - i14;
    }

    public int getSelectedTabPosition() {
        f fVar = this.f4012b;
        if (fVar != null) {
            return fVar.f4041d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f4010a.size();
    }

    public int getTabGravity() {
        return this.L;
    }

    public ColorStateList getTabIconTint() {
        return this.f4025y;
    }

    public int getTabIndicatorAnimationMode() {
        return this.S;
    }

    public int getTabIndicatorGravity() {
        return this.N;
    }

    public int getTabMaxWidth() {
        return this.G;
    }

    public int getTabMode() {
        return this.O;
    }

    public ColorStateList getTabRippleColor() {
        return this.z;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A;
    }

    public ColorStateList getTabTextColors() {
        return this.f4024x;
    }

    public final void h() {
        if (this.b0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.b0 = valueAnimator;
            valueAnimator.setInterpolator(f5.a.f4985b);
            this.b0.setDuration((long) this.M);
            this.b0.addUpdateListener(new a());
        }
    }

    public final f i(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f4010a.get(i10);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m0.e, m0.c<com.google.android.material.tabs.TabLayout$f>] */
    /* JADX WARNING: type inference failed for: r1v0, types: [m0.c<com.google.android.material.tabs.TabLayout$h>, m0.d] */
    public final f j() {
        f fVar = (f) f4009h0.b();
        if (fVar == null) {
            fVar = new f();
        }
        fVar.f4043f = this;
        ? r12 = this.f4018g0;
        h hVar = r12 != 0 ? (h) r12.b() : null;
        if (hVar == null) {
            hVar = new h(getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f4040c)) {
            hVar.setContentDescription(fVar.f4039b);
        } else {
            hVar.setContentDescription(fVar.f4040c);
        }
        fVar.g = hVar;
        int i10 = fVar.f4044h;
        if (i10 != -1) {
            hVar.setId(i10);
        }
        return fVar;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [m0.e, m0.c<com.google.android.material.tabs.TabLayout$f>] */
    /* JADX WARNING: type inference failed for: r2v2, types: [m0.c<com.google.android.material.tabs.TabLayout$h>, m0.d] */
    public final void k() {
        for (int childCount = this.f4013c.getChildCount() - 1; childCount >= 0; childCount--) {
            h hVar = (h) this.f4013c.getChildAt(childCount);
            this.f4013c.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab((f) null);
                hVar.setSelected(false);
                this.f4018g0.a(hVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.f4010a.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f4043f = null;
            next.g = null;
            next.f4038a = null;
            next.f4044h = -1;
            next.f4039b = null;
            next.f4040c = null;
            next.f4041d = -1;
            next.f4042e = null;
            f4009h0.a(next);
        }
        this.f4012b = null;
    }

    public final void l(f fVar, boolean z10) {
        f fVar2 = this.f4012b;
        if (fVar2 != fVar) {
            int i10 = fVar != null ? fVar.f4041d : -1;
            if (z10) {
                if ((fVar2 == null || fVar2.f4041d == -1) && i10 != -1) {
                    m(i10, true, true);
                } else {
                    e(i10);
                }
                if (i10 != -1) {
                    setSelectedTabView(i10);
                }
            }
            this.f4012b = fVar;
            if (fVar2 != null) {
                for (int size = this.W.size() - 1; size >= 0; size--) {
                    this.W.get(size).b();
                }
            }
            if (fVar != null) {
                for (int size2 = this.W.size() - 1; size2 >= 0; size2--) {
                    this.W.get(size2).c(fVar);
                }
            }
        } else if (fVar2 != null) {
            for (int size3 = this.W.size() - 1; size3 >= 0; size3--) {
                this.W.get(size3).a(fVar);
            }
            e(fVar.f4041d);
        }
    }

    public final void m(int i10, boolean z10, boolean z11) {
        int i11;
        int round = Math.round(((float) i10) + 0.0f);
        if (round >= 0 && round < this.f4013c.getChildCount()) {
            if (z11) {
                e eVar = this.f4013c;
                ValueAnimator valueAnimator = eVar.f4029a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    eVar.f4029a.cancel();
                }
                eVar.f4030b = i10;
                eVar.f4031c = 0.0f;
                eVar.c(eVar.getChildAt(i10), eVar.getChildAt(eVar.f4030b + 1), eVar.f4031c);
            }
            ValueAnimator valueAnimator2 = this.b0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.b0.cancel();
            }
            if (i10 < 0) {
                i11 = 0;
            } else {
                i11 = g(i10);
            }
            scrollTo(i11, 0);
            if (z10) {
                setSelectedTabView(round);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<t1.b$f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.List<t1.b$e>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.util.List<t1.b$e>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.util.List<t1.b$f>, java.util.ArrayList] */
    public final void n(t1.b bVar, boolean z10) {
        ? r12;
        ? r02;
        t1.b bVar2 = this.f4014c0;
        if (bVar2 != null) {
            g gVar = this.f4015d0;
            if (!(gVar == null || (r02 = bVar2.F) == 0)) {
                r02.remove(gVar);
            }
            b bVar3 = this.f4016e0;
            if (!(bVar3 == null || (r12 = this.f4014c0.H) == 0)) {
                r12.remove(bVar3);
            }
        }
        i iVar = this.f4011a0;
        if (iVar != null) {
            this.W.remove(iVar);
            this.f4011a0 = null;
        }
        if (bVar != null) {
            this.f4014c0 = bVar;
            if (this.f4015d0 == null) {
                this.f4015d0 = new g(this);
            }
            g gVar2 = this.f4015d0;
            gVar2.f4047c = 0;
            gVar2.f4046b = 0;
            if (bVar.F == null) {
                bVar.F = new ArrayList();
            }
            bVar.F.add(gVar2);
            i iVar2 = new i(bVar);
            this.f4011a0 = iVar2;
            a(iVar2);
            bVar.getAdapter();
            if (this.f4016e0 == null) {
                this.f4016e0 = new b();
            }
            b bVar4 = this.f4016e0;
            Objects.requireNonNull(bVar4);
            if (bVar.H == null) {
                bVar.H = new ArrayList();
            }
            bVar.H.add(bVar4);
            m(bVar.getCurrentItem(), true, true);
        } else {
            this.f4014c0 = null;
            k();
        }
        this.f4017f0 = z10;
    }

    public final void o() {
        int size = this.f4010a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4010a.get(i10).d();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.b.E0(this);
        if (this.f4014c0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof t1.b) {
                n((t1.b) parent, true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4017f0) {
            setupWithViewPager((t1.b) null);
            this.f4017f0 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (com.google.android.material.tabs.TabLayout.h) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.TabLayout$e r1 = r7.f4013c
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            com.google.android.material.tabs.TabLayout$e r1 = r7.f4013c
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.h
            if (r2 == 0) goto L_0x0031
            com.google.android.material.tabs.TabLayout$h r1 = (com.google.android.material.tabs.TabLayout.h) r1
            android.graphics.drawable.Drawable r2 = r1.f4056x
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.f4056x
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0175b.a(1, getTabCount(), 1).f9186a);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!(getTabMode() == 0 || getTabMode() == 2) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = x5.t.a(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.I
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = x5.t.a(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.G = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.O
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            if (!(getTabMode() == 0 || getTabMode() == 2)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(LinearLayout.LayoutParams layoutParams) {
        if (this.O == 1 && this.L == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public final void q(boolean z10) {
        for (int i10 = 0; i10 < this.f4013c.getChildCount(); i10++) {
            View childAt = this.f4013c.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            p((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a.b.D0(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            for (int i10 = 0; i10 < this.f4013c.getChildCount(); i10++) {
                View childAt = this.f4013c.getChildAt(i10);
                if (childAt instanceof h) {
                    h hVar = (h) childAt;
                    hVar.setOrientation(TabLayout.this.P ^ true ? 1 : 0);
                    TextView textView = hVar.f4054v;
                    if (textView == null && hVar.f4055w == null) {
                        hVar.i(hVar.f4049b, hVar.f4050c);
                    } else {
                        hVar.i(textView, hVar.f4055w);
                    }
                }
            }
            f();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        h();
        this.b0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.A != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.A = drawable;
            int i10 = this.R;
            if (i10 == -1) {
                i10 = drawable.getIntrinsicHeight();
            }
            this.f4013c.b(i10);
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.B = i10;
        q(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.N != i10) {
            this.N = i10;
            e eVar = this.f4013c;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.d.k(eVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.R = i10;
        this.f4013c.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.L != i10) {
            this.L = i10;
            f();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f4025y != colorStateList) {
            this.f4025y = colorStateList;
            o();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(a.b.Z(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.S = i10;
        if (i10 == 0) {
            this.U = new a();
        } else if (i10 == 1) {
            this.U = new h6.a();
        } else if (i10 == 2) {
            this.U = new h6.b();
        } else {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.Q = z10;
        e eVar = this.f4013c;
        int i10 = e.f4028t;
        eVar.a();
        e eVar2 = this.f4013c;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.k(eVar2);
    }

    public void setTabMode(int i10) {
        if (i10 != this.O) {
            this.O = i10;
            f();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            for (int i10 = 0; i10 < this.f4013c.getChildCount(); i10++) {
                View childAt = this.f4013c.getChildAt(i10);
                if (childAt instanceof h) {
                    Context context = getContext();
                    int i11 = h.A;
                    ((h) childAt).h(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(a.b.Z(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f4024x != colorStateList) {
            this.f4024x = colorStateList;
            o();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(t1.a aVar) {
        k();
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            for (int i10 = 0; i10 < this.f4013c.getChildCount(); i10++) {
                View childAt = this.f4013c.getChildAt(i10);
                if (childAt instanceof h) {
                    Context context = getContext();
                    int i11 = h.A;
                    ((h) childAt).h(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(t1.b bVar) {
        n(bVar, false);
    }

    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void addView(View view, int i10) {
        d(view);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.V;
        if (cVar2 != null) {
            this.W.remove(cVar2);
        }
        this.V = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d(view);
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        d(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(a.b.a0(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
