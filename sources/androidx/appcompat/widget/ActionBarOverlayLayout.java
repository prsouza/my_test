package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import com.google.android.gms.common.api.Api;
import h.v;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.e0;
import n0.k;
import n0.l;
import n0.m;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class ActionBarOverlayLayout extends ViewGroup implements i0, k, l {
    public static final int[] Q = {R.attr.actionBarSize, 16842841};
    public int A;
    public int B;
    public final Rect C = new Rect();
    public final Rect D = new Rect();
    public final Rect E = new Rect();
    public e0 F;
    public e0 G;
    public e0 H;
    public e0 I;
    public d J;
    public OverScroller K;
    public ViewPropertyAnimator L;
    public final a M;
    public final b N;
    public final c O;
    public final m P;

    /* renamed from: a  reason: collision with root package name */
    public int f1007a;

    /* renamed from: b  reason: collision with root package name */
    public int f1008b = 0;

    /* renamed from: c  reason: collision with root package name */
    public ContentFrameLayout f1009c;

    /* renamed from: s  reason: collision with root package name */
    public ActionBarContainer f1010s;

    /* renamed from: t  reason: collision with root package name */
    public j0 f1011t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f1012u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1013v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1014w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1015x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1016y;
    public boolean z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = null;
            actionBarOverlayLayout.z = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = null;
            actionBarOverlayLayout.z = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = actionBarOverlayLayout.f1010s.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.M);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = actionBarOverlayLayout.f1010s.animate().translationY((float) (-ActionBarOverlayLayout.this.f1010s.getHeight())).setListener(ActionBarOverlayLayout.this.M);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e() {
            super(-1, -1);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        e0 e0Var = e0.f8797b;
        this.F = e0Var;
        this.G = e0Var;
        this.H = e0Var;
        this.I = e0Var;
        this.M = new a();
        this.N = new b();
        this.O = new c();
        r(context);
        this.P = new m();
    }

    public final void a(Menu menu, i.a aVar) {
        s();
        this.f1011t.a(menu, aVar);
    }

    public final boolean b() {
        s();
        return this.f1011t.b();
    }

    public final void c() {
        s();
        this.f1011t.c();
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final boolean d() {
        s();
        return this.f1011t.d();
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1012u != null && !this.f1013v) {
            if (this.f1010s.getVisibility() == 0) {
                i = (int) (this.f1010s.getTranslationY() + ((float) this.f1010s.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.f1012u.setBounds(0, i, getWidth(), this.f1012u.getIntrinsicHeight() + i);
            this.f1012u.draw(canvas);
        }
    }

    public final boolean e() {
        s();
        return this.f1011t.e();
    }

    public final boolean f() {
        s();
        return this.f1011t.f();
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final boolean g() {
        s();
        return this.f1011t.g();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1010s;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        m mVar = this.P;
        return mVar.f8836b | mVar.f8835a;
    }

    public CharSequence getTitle() {
        s();
        return this.f1011t.getTitle();
    }

    public final void h(View view, View view2, int i, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void j(View view, int i, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i, i10, iArr);
        }
    }

    public final void k(int i) {
        s();
        if (i == 2) {
            this.f1011t.r();
        } else if (i == 5) {
            this.f1011t.s();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public final void l() {
        s();
        this.f1011t.h();
    }

    public final void m(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        if (i13 == 0) {
            onNestedScroll(view, i, i10, i11, i12);
        }
    }

    public final void n(View view, int i, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i, i10, i11, i12);
        }
    }

    public final boolean o(View view, View view2, int i, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        e0 k10 = e0.k(windowInsets, this);
        boolean p10 = p(this.f1010s, new Rect(k10.d(), k10.f(), k10.e(), k10.c()), false);
        Rect rect = this.C;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.i.b(this, k10, rect);
        Rect rect2 = this.C;
        e0 l10 = k10.f8798a.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.F = l10;
        boolean z10 = true;
        if (!this.G.equals(l10)) {
            this.G = this.F;
            p10 = true;
        }
        if (!this.D.equals(this.C)) {
            this.D.set(this.C);
        } else {
            z10 = p10;
        }
        if (z10) {
            requestLayout();
        }
        return k10.f8798a.a().f8798a.c().f8798a.b().j();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.h.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = eVar.leftMargin + paddingLeft;
                int i15 = eVar.topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    public final void onMeasure(int i, int i10) {
        int i11;
        e0.e eVar;
        s();
        measureChildWithMargins(this.f1010s, i, 0, i10, 0);
        e eVar2 = (e) this.f1010s.getLayoutParams();
        int max = Math.max(0, this.f1010s.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max2 = Math.max(0, this.f1010s.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1010s.getMeasuredState());
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        boolean z10 = (x.d.g(this) & 256) != 0;
        if (z10) {
            i11 = this.f1007a;
            if (this.f1015x && this.f1010s.getTabContainer() != null) {
                i11 += this.f1007a;
            }
        } else {
            i11 = this.f1010s.getVisibility() != 8 ? this.f1010s.getMeasuredHeight() : 0;
        }
        this.E.set(this.C);
        e0 e0Var = this.F;
        this.H = e0Var;
        if (this.f1014w || z10) {
            g0.b b10 = g0.b.b(e0Var.d(), this.H.f() + i11, this.H.e(), this.H.c() + 0);
            e0 e0Var2 = this.H;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                eVar = new e0.d(e0Var2);
            } else if (i12 >= 29) {
                eVar = new e0.c(e0Var2);
            } else {
                eVar = new e0.b(e0Var2);
            }
            eVar.d(b10);
            this.H = eVar.b();
        } else {
            Rect rect = this.E;
            rect.top += i11;
            rect.bottom += 0;
            this.H = e0Var.f8798a.l(0, i11, 0, 0);
        }
        p(this.f1009c, this.E, true);
        if (!this.I.equals(this.H)) {
            e0 e0Var3 = this.H;
            this.I = e0Var3;
            x.c(this.f1009c, e0Var3);
        }
        measureChildWithMargins(this.f1009c, i, 0, i10, 0);
        e eVar3 = (e) this.f1009c.getLayoutParams();
        int max3 = Math.max(max, this.f1009c.getMeasuredWidth() + eVar3.leftMargin + eVar3.rightMargin);
        int max4 = Math.max(max2, this.f1009c.getMeasuredHeight() + eVar3.topMargin + eVar3.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1009c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i10, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (!this.f1016y || !z10) {
            return false;
        }
        this.K.fling(0, 0, 0, (int) f11, 0, 0, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (this.K.getFinalY() > this.f1010s.getHeight()) {
            z11 = true;
        }
        if (z11) {
            q();
            this.O.run();
        } else {
            q();
            this.N.run();
        }
        this.z = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i10, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i, int i10, int i11, int i12) {
        int i13 = this.A + i10;
        this.A = i13;
        setActionBarHideOffset(i13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r1 = (h.v) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            n0.m r1 = r0.P
            r2 = 0
            r1.a(r3, r2)
            int r1 = r0.getActionBarHideOffset()
            r0.A = r1
            r0.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.J
            if (r1 == 0) goto L_0x001f
            h.v r1 = (h.v) r1
            m.g r2 = r1.f5638t
            if (r2 == 0) goto L_0x001f
            r2.a()
            r2 = 0
            r1.f5638t = r2
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1010s.getVisibility() != 0) {
            return false;
        }
        return this.f1016y;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f1016y && !this.z) {
            if (this.A <= this.f1010s.getHeight()) {
                q();
                postDelayed(this.N, 600);
                return;
            }
            q();
            postDelayed(this.O, 600);
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i10 = this.B ^ i;
        this.B = i;
        boolean z10 = (i & 4) == 0;
        boolean z11 = (i & 256) != 0;
        d dVar = this.J;
        if (dVar != null) {
            ((v) dVar).f5634p = !z11;
            if (z10 || !z11) {
                v vVar = (v) dVar;
                if (vVar.f5635q) {
                    vVar.f5635q = false;
                    vVar.g(true);
                }
            } else {
                v vVar2 = (v) dVar;
                if (!vVar2.f5635q) {
                    vVar2.f5635q = true;
                    vVar2.g(true);
                }
            }
        }
        if ((i10 & 256) != 0 && this.J != null) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.h.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1008b = i;
        d dVar = this.J;
        if (dVar != null) {
            ((v) dVar).f5633o = i;
        }
    }

    public final boolean p(View view, Rect rect, boolean z10) {
        boolean z11;
        int i;
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            eVar.leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = eVar.topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            eVar.topMargin = i13;
            z11 = true;
        }
        int i14 = eVar.rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            eVar.rightMargin = i15;
            z11 = true;
        }
        if (!z10 || eVar.bottomMargin == (i = rect.bottom)) {
            return z11;
        }
        eVar.bottomMargin = i;
        return true;
    }

    public final void q() {
        removeCallbacks(this.N);
        removeCallbacks(this.O);
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(Q);
        boolean z10 = false;
        this.f1007a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1012u = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.f1013v = z10;
        this.K = new OverScroller(context);
    }

    public final void s() {
        j0 j0Var;
        if (this.f1009c == null) {
            this.f1009c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1010s = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof j0) {
                j0Var = (j0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                j0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder d10 = a.a.d("Can't make a decor toolbar out of ");
                d10.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(d10.toString());
            }
            this.f1011t = j0Var;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.f1010s.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1010s.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.J = dVar;
        if (getWindowToken() != null) {
            ((v) this.J).f5633o = this.f1008b;
            int i = this.B;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1015x = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1016y) {
            this.f1016y = z10;
            if (!z10) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        s();
        this.f1011t.setIcon(i);
    }

    public void setLogo(int i) {
        s();
        this.f1011t.o(i);
    }

    public void setOverlayMode(boolean z10) {
        this.f1014w = z10;
        this.f1013v = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f1011t.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f1011t.setWindowTitle(charSequence);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f1011t.setIcon(drawable);
    }
}
