package z5;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.g1;
import d0.a;
import io.nodle.cash.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.r;
import n0.x;
import o0.b;

public abstract class a extends FrameLayout implements j.a {
    public static final int[] R = {16842912};
    public static final b S = new b();
    public static final c T = new c();
    public final ViewGroup A;
    public final TextView B;
    public final TextView C;
    public int D;
    public g E;
    public ColorStateList F;
    public Drawable G;
    public Drawable H;
    public ValueAnimator I;
    public b J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public int P;
    public h5.a Q;

    /* renamed from: a  reason: collision with root package name */
    public boolean f13853a;

    /* renamed from: b  reason: collision with root package name */
    public int f13854b;

    /* renamed from: c  reason: collision with root package name */
    public int f13855c;

    /* renamed from: s  reason: collision with root package name */
    public float f13856s;

    /* renamed from: t  reason: collision with root package name */
    public float f13857t;

    /* renamed from: u  reason: collision with root package name */
    public float f13858u;

    /* renamed from: v  reason: collision with root package name */
    public int f13859v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f13860w;

    /* renamed from: x  reason: collision with root package name */
    public final FrameLayout f13861x;

    /* renamed from: y  reason: collision with root package name */
    public final View f13862y;
    public final ImageView z;

    /* renamed from: z5.a$a  reason: collision with other inner class name */
    public class C0266a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13863a;

        public C0266a(int i) {
            this.f13863a = i;
        }

        public final void run() {
            a.this.i(this.f13863a);
        }
    }

    public static class b {
        public float a(float f10) {
            return 1.0f;
        }
    }

    public static class c extends b {
        public final float a(float f10) {
            LinearInterpolator linearInterpolator = f5.a.f4984a;
            return (f10 * 0.6f) + 0.4f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto L_0x000c
        L_0x000a:
            r5 = r1
            goto L_0x004c
        L_0x000c:
            int[] r2 = e5.a.F
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L_0x0021
            goto L_0x000a
        L_0x0021:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L_0x003e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L_0x004c
        L_0x003e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L_0x004c:
            if (r5 == 0) goto L_0x0052
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a.f(android.widget.TextView, int):void");
    }

    public static void g(View view, float f10, float f11, int i) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f13861x;
        return frameLayout != null ? frameLayout : this.z;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i10 = 0; i10 < indexOfChild; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        h5.a aVar = this.Q;
        int minimumHeight = aVar != null ? aVar.getMinimumHeight() / 2 : 0;
        return this.z.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        int i;
        h5.a aVar = this.Q;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.getMinimumWidth() - this.Q.f5840t.f5847b.B.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(i, layoutParams.leftMargin);
        return Math.max(i, layoutParams.rightMargin) + this.z.getMeasuredWidth() + max;
    }

    public static void h(View view, int i, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i10;
        view.setLayoutParams(layoutParams);
    }

    public static void j(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void a(float f10, float f11) {
        this.f13856s = f10 - f11;
        this.f13857t = (f11 * 1.0f) / f10;
        this.f13858u = (f10 * 1.0f) / f11;
    }

    public final boolean b() {
        return this.Q != null;
    }

    public final void c() {
        g gVar = this.E;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    public final void d(g gVar) {
        CharSequence charSequence;
        this.E = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.f952e);
        setId(gVar.f948a);
        if (!TextUtils.isEmpty(gVar.f962q)) {
            setContentDescription(gVar.f962q);
        }
        if (!TextUtils.isEmpty(gVar.f963r)) {
            charSequence = gVar.f963r;
        } else {
            charSequence = gVar.f952e;
        }
        if (Build.VERSION.SDK_INT > 23) {
            g1.a(this, charSequence);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        this.f13853a = true;
    }

    public final void e(float f10, float f11) {
        View view = this.f13862y;
        if (view != null) {
            b bVar = this.J;
            Objects.requireNonNull(bVar);
            LinearInterpolator linearInterpolator = f5.a.f4984a;
            view.setScaleX((0.6f * f10) + 0.4f);
            view.setScaleY(bVar.a(f10));
            int i = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            view.setAlpha(f5.a.a(0.0f, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f10));
        }
        this.K = f10;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f13862y;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public h5.a getBadge() {
        return this.Q;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    public g getItemData() {
        return this.E;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.D;
    }

    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
        return this.A.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.A.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(int i) {
        int i10;
        if (this.f13862y != null) {
            int min = Math.min(this.M, i - (this.P * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13862y.getLayoutParams();
            if (this.O && this.f13859v == 2) {
                i10 = min;
            } else {
                i10 = this.N;
            }
            layoutParams.height = i10;
            layoutParams.width = min;
            this.f13862y.setLayoutParams(layoutParams);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.E;
        if (gVar != null && gVar.isCheckable() && this.E.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, R);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h5.a aVar = this.Q;
        if (aVar != null && aVar.isVisible()) {
            g gVar = this.E;
            CharSequence charSequence = gVar.f952e;
            if (!TextUtils.isEmpty(gVar.f962q)) {
                charSequence = this.E.f962q;
            }
            accessibilityNodeInfo.setContentDescription(charSequence + ", " + this.Q.c());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(0, 1, getItemVisiblePosition(), 1, isSelected()).f9187a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) b.a.f9176e.f9182a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        post(new C0266a(i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f13862y;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.L = z10;
        View view = this.f13862y;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.N = i;
        i(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.P = i;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.O = z10;
    }

    public void setActiveIndicatorWidth(int i) {
        this.M = i;
        i(getWidth());
    }

    public void setBadge(h5.a aVar) {
        if (this.Q != aVar) {
            if (b() && this.z != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                ImageView imageView = this.z;
                if (b()) {
                    if (imageView != null) {
                        setClipChildren(true);
                        setClipToPadding(true);
                        h5.c.b(this.Q, imageView);
                    }
                    this.Q = null;
                }
            }
            this.Q = aVar;
            ImageView imageView2 = this.z;
            if (imageView2 != null && b()) {
                setClipChildren(false);
                setClipToPadding(false);
                h5.c.a(this.Q, imageView2);
            }
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.C
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.C
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.B
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.B
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x0031
            r1 = r0
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            boolean r3 = r9.L
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x00a0
            boolean r3 = r9.f13853a
            if (r3 == 0) goto L_0x00a0
            java.util.WeakHashMap<android.view.View, n0.a0> r3 = n0.x.f8842a
            boolean r3 = n0.x.g.b(r9)
            if (r3 != 0) goto L_0x0045
            goto L_0x00a0
        L_0x0045:
            android.animation.ValueAnimator r3 = r9.I
            if (r3 == 0) goto L_0x004f
            r3.cancel()
            r3 = 0
            r9.I = r3
        L_0x004f:
            float[] r3 = new float[r2]
            float r6 = r9.K
            r3[r5] = r6
            r3[r4] = r1
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            r9.I = r3
            z5.b r6 = new z5.b
            r6.<init>(r9, r1)
            r3.addUpdateListener(r6)
            android.animation.ValueAnimator r1 = r9.I
            android.content.Context r3 = r9.getContext()
            b1.b r6 = f5.a.f4985b
            android.animation.TimeInterpolator r3 = y5.a.c(r3, r6)
            r1.setInterpolator(r3)
            android.animation.ValueAnimator r1 = r9.I
            android.content.Context r3 = r9.getContext()
            r6 = 2130903820(0x7f03030c, float:1.7414469E38)
            android.content.res.Resources r7 = r9.getResources()
            r8 = 2131296288(0x7f090020, float:1.8210488E38)
            int r7 = r7.getInteger(r8)
            android.util.TypedValue r3 = b6.b.a(r3, r6)
            if (r3 == 0) goto L_0x0096
            int r6 = r3.type
            r8 = 16
            if (r6 != r8) goto L_0x0096
            int r7 = r3.data
        L_0x0096:
            long r6 = (long) r7
            r1.setDuration(r6)
            android.animation.ValueAnimator r1 = r9.I
            r1.start()
            goto L_0x00a3
        L_0x00a0:
            r9.e(r1, r1)
        L_0x00a3:
            int r1 = r9.f13859v
            r3 = -1
            r6 = 17
            r7 = 49
            r8 = 4
            if (r1 == r3) goto L_0x0139
            if (r1 == 0) goto L_0x0108
            if (r1 == r4) goto L_0x00cc
            if (r1 == r2) goto L_0x00b5
            goto L_0x01a7
        L_0x00b5:
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f13854b
            h(r0, r1, r6)
            android.widget.TextView r0 = r9.C
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.B
            r0.setVisibility(r1)
            goto L_0x01a7
        L_0x00cc:
            android.view.ViewGroup r1 = r9.A
            int r2 = r9.f13855c
            j(r1, r2)
            if (r10 == 0) goto L_0x00f1
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f13854b
            float r2 = (float) r2
            float r3 = r9.f13856s
            float r2 = r2 + r3
            int r2 = (int) r2
            h(r1, r2, r7)
            android.widget.TextView r1 = r9.C
            g(r1, r0, r0, r5)
            android.widget.TextView r0 = r9.B
            float r1 = r9.f13857t
            g(r0, r1, r1, r8)
            goto L_0x01a7
        L_0x00f1:
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f13854b
            h(r1, r2, r7)
            android.widget.TextView r1 = r9.C
            float r2 = r9.f13858u
            g(r1, r2, r2, r8)
            android.widget.TextView r1 = r9.B
            g(r1, r0, r0, r5)
            goto L_0x01a7
        L_0x0108:
            if (r10 == 0) goto L_0x0120
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f13854b
            h(r0, r1, r7)
            android.view.ViewGroup r0 = r9.A
            int r1 = r9.f13855c
            j(r0, r1)
            android.widget.TextView r0 = r9.C
            r0.setVisibility(r5)
            goto L_0x0133
        L_0x0120:
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f13854b
            h(r0, r1, r6)
            android.view.ViewGroup r0 = r9.A
            j(r0, r5)
            android.widget.TextView r0 = r9.C
            r0.setVisibility(r8)
        L_0x0133:
            android.widget.TextView r0 = r9.B
            r0.setVisibility(r8)
            goto L_0x01a7
        L_0x0139:
            boolean r1 = r9.f13860w
            if (r1 == 0) goto L_0x016e
            if (r10 == 0) goto L_0x0155
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f13854b
            h(r0, r1, r7)
            android.view.ViewGroup r0 = r9.A
            int r1 = r9.f13855c
            j(r0, r1)
            android.widget.TextView r0 = r9.C
            r0.setVisibility(r5)
            goto L_0x0168
        L_0x0155:
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f13854b
            h(r0, r1, r6)
            android.view.ViewGroup r0 = r9.A
            j(r0, r5)
            android.widget.TextView r0 = r9.C
            r0.setVisibility(r8)
        L_0x0168:
            android.widget.TextView r0 = r9.B
            r0.setVisibility(r8)
            goto L_0x01a7
        L_0x016e:
            android.view.ViewGroup r1 = r9.A
            int r2 = r9.f13855c
            j(r1, r2)
            if (r10 == 0) goto L_0x0192
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f13854b
            float r2 = (float) r2
            float r3 = r9.f13856s
            float r2 = r2 + r3
            int r2 = (int) r2
            h(r1, r2, r7)
            android.widget.TextView r1 = r9.C
            g(r1, r0, r0, r5)
            android.widget.TextView r0 = r9.B
            float r1 = r9.f13857t
            g(r0, r1, r1, r8)
            goto L_0x01a7
        L_0x0192:
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f13854b
            h(r1, r2, r7)
            android.widget.TextView r1 = r9.C
            float r2 = r9.f13858u
            g(r1, r2, r2, r8)
            android.widget.TextView r1 = r9.B
            g(r1, r0, r0, r5)
        L_0x01a7:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a.setChecked(boolean):void");
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.B.setEnabled(z10);
        this.C.setEnabled(z10);
        this.z.setEnabled(z10);
        if (z10) {
            x.r(this, r.a(getContext()));
        } else {
            x.r(this, (r) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.G) {
            this.G = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                this.H = drawable;
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
            }
            this.z.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.z.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.z.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.F = colorStateList;
        if (this.E != null && (drawable = this.H) != null) {
            drawable.setTintList(colorStateList);
            this.H.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            Context context = getContext();
            Object obj = d0.a.f4256a;
            drawable = a.b.b(context, i);
        }
        setItemBackground(drawable);
    }

    public void setItemPaddingBottom(int i) {
        if (this.f13855c != i) {
            this.f13855c = i;
            c();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f13854b != i) {
            this.f13854b = i;
            c();
        }
    }

    public void setItemPosition(int i) {
        this.D = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f13859v != i) {
            this.f13859v = i;
            if (this.O && i == 2) {
                this.J = T;
            } else {
                this.J = S;
            }
            i(getWidth());
            c();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f13860w != z10) {
            this.f13860w = z10;
            c();
        }
    }

    public void setTextAppearanceActive(int i) {
        f(this.C, i);
        a(this.B.getTextSize(), this.C.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        f(this.B, i);
        a(this.B.getTextSize(), this.C.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.B.setTextColor(colorStateList);
            this.C.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.B.setText(charSequence);
        this.C.setText(charSequence);
        g gVar = this.E;
        if (gVar == null || TextUtils.isEmpty(gVar.f962q)) {
            setContentDescription(charSequence);
        }
        g gVar2 = this.E;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.f963r)) {
            charSequence = this.E.f963r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            g1.a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.q(this, drawable);
    }
}
