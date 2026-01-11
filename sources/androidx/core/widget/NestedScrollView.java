package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.activity.result.d;
import androidx.appcompat.app.AlertController;
import com.google.android.gms.common.api.Api;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.a0;
import n0.i;
import n0.j;
import n0.l;
import n0.m;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;
import o0.b;
import q0.c;

public class NestedScrollView extends FrameLayout implements l, i {
    public static final a P = new a();
    public static final int[] Q = {16843130};
    public boolean A;
    public boolean B = true;
    public int C;
    public int D;
    public int E;
    public int F = -1;
    public final int[] G = new int[2];
    public final int[] H = new int[2];
    public int I;
    public int J;
    public c K;
    public final m L;
    public final j M;
    public float N;
    public b O;

    /* renamed from: a  reason: collision with root package name */
    public long f1651a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f1652b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public OverScroller f1653c;

    /* renamed from: s  reason: collision with root package name */
    public EdgeEffect f1654s;

    /* renamed from: t  reason: collision with root package name */
    public EdgeEffect f1655t;

    /* renamed from: u  reason: collision with root package name */
    public int f1656u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1657v = true;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1658w = false;

    /* renamed from: x  reason: collision with root package name */
    public View f1659x = null;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1660y = false;
    public VelocityTracker z;

    public static class a extends n0.a {
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        public final void d(View view, o0.b bVar) {
            int scrollRange;
            this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.n(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.w();
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.b(b.a.g);
                    bVar.b(b.a.f9180k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.b(b.a.f9177f);
                    bVar.b(b.a.f9181l);
                }
            }
        }

        public final boolean g(View view, int i, Bundle bundle) {
            if (super.g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.z(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.z(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    public interface b {
    }

    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f1661a;

        public class a implements Parcelable.Creator<c> {
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public final Object[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("HorizontalScrollView.SavedState{");
            d10.append(Integer.toHexString(System.identityHashCode(this)));
            d10.append(" scrollPosition=");
            return d.c(d10, this.f1661a, "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1661a);
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f1661a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        if (j0.a.a()) {
            edgeEffect = c.a.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1654s = edgeEffect;
        if (j0.a.a()) {
            edgeEffect2 = c.a.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1655t = edgeEffect2;
        this.f1653c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.C = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        this.E = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.L = new m();
        this.M = new j(this);
        setNestedScrollingEnabled(true);
        x.p(this, P);
    }

    public static int c(int i, int i10, int i11) {
        if (i10 >= i11 || i < 0) {
            return 0;
        }
        return i10 + i > i11 ? i11 - i10 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.N == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.N = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.N;
    }

    public static boolean q(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !q((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public final boolean A(int i, int i10) {
        return this.M.h(i, i10);
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z10;
        if (q0.c.a(this.f1654s) != 0.0f) {
            q0.c.b(this.f1654s, 0.0f, motionEvent.getY() / ((float) getHeight()));
            z10 = true;
        } else {
            z10 = false;
        }
        if (q0.c.a(this.f1655t) == 0.0f) {
            return z10;
        }
        q0.c.b(this.f1655t, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
        return true;
    }

    public final void C(int i) {
        this.M.i(i);
    }

    public final void a() {
        this.f1653c.abortAnimation();
        C(1);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final boolean b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !r(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            f(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1652b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1652b);
            f(d(this.f1652b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!r(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public final void computeScroll() {
        if (!this.f1653c.isFinished()) {
            this.f1653c.computeScrollOffset();
            int currY = this.f1653c.getCurrY();
            int i = currY - this.J;
            this.J = currY;
            int[] iArr = this.H;
            boolean z10 = false;
            iArr[1] = 0;
            e(0, i, iArr, (int[]) null, 1);
            int i10 = i - this.H[1];
            int scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                u(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i10 - scrollY2;
                int[] iArr2 = this.H;
                iArr2[1] = 0;
                this.M.e(0, scrollY2, 0, i11, this.G, 1, iArr2);
                i10 = i11 - this.H[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z10 = true;
                }
                if (z10) {
                    if (i10 < 0) {
                        if (this.f1654s.isFinished()) {
                            this.f1654s.onAbsorb((int) this.f1653c.getCurrVelocity());
                        }
                    } else if (this.f1655t.isFinished()) {
                        this.f1655t.onAbsorb((int) this.f1653c.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f1653c.isFinished()) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.d.k(this);
                return;
            }
            C(1);
        }
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final int d(Rect rect) {
        int i;
        int i10;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i12 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i11 - verticalFadingEdgeLength : i11;
        int i13 = rect.bottom;
        if (i13 > i12 && rect.top > scrollY) {
            if (rect.height() > height) {
                i10 = rect.top - scrollY;
            } else {
                i10 = rect.bottom - i12;
            }
            return Math.min(i10 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i11);
        } else if (rect.top >= scrollY || i13 >= i12) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i12 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || g(keyEvent);
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.M.a(f10, f11, z10);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.M.b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i, int i10, int[] iArr, int[] iArr2) {
        return e(i, i10, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i10, int i11, int i12, int[] iArr) {
        return this.M.e(i, i10, i11, i12, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i10 = 0;
        if (!this.f1654s.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f1654s.setSize(width, height);
            if (this.f1654s.draw(canvas)) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f1655t.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i10 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i10 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f1655t.setSize(width2, height2);
            if (this.f1655t.draw(canvas)) {
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                x.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final boolean e(int i, int i10, int[] iArr, int[] iArr2, int i11) {
        return this.M.c(i, i10, iArr, iArr2, i11);
    }

    public final void f(int i) {
        if (i == 0) {
            return;
        }
        if (this.B) {
            z(0, i, false);
        } else {
            scrollBy(0, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f1652b
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fb
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00ec
            r4 = 20
            if (r0 == r4) goto L_0x00dc
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fb
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r5 = r3
        L_0x0084:
            if (r5 != r3) goto L_0x0088
            r7 = r1
            goto L_0x0089
        L_0x0088:
            r7 = r2
        L_0x0089:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00c0
            android.graphics.Rect r7 = r6.f1652b
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d1
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f1652b
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d1
            int r1 = r1 - r0
            r7.top = r1
            goto L_0x00d1
        L_0x00c0:
            android.graphics.Rect r7 = r6.f1652b
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f1652b
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d1
            r7.top = r2
        L_0x00d1:
            android.graphics.Rect r7 = r6.f1652b
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.x(r5, r1, r0)
            goto L_0x00fb
        L_0x00dc:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e7
            boolean r2 = r6.b(r3)
            goto L_0x00fb
        L_0x00e7:
            boolean r2 = r6.l(r3)
            goto L_0x00fb
        L_0x00ec:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f7
            boolean r2 = r6.b(r5)
            goto L_0x00fb
        L_0x00f7:
            boolean r2 = r6.l(r5)
        L_0x00fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.g(android.view.KeyEvent):boolean");
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        m mVar = this.L;
        return mVar.f8836b | mVar.f8835a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final void h(View view, View view2, int i, int i10) {
        this.L.a(i, i10);
        A(2, i10);
    }

    public final boolean hasNestedScrollingParent() {
        return p(0);
    }

    public final void i(View view, int i) {
        m mVar = this.L;
        if (i == 1) {
            mVar.f8836b = 0;
        } else {
            mVar.f8835a = 0;
        }
        C(i);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.M.f8833d;
    }

    public final void j(View view, int i, int i10, int[] iArr, int i11) {
        e(i, i10, iArr, (int[]) null, i11);
    }

    public final void k(int i) {
        if (getChildCount() > 0) {
            this.f1653c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            w(true);
        }
    }

    public final boolean l(int i) {
        int childCount;
        boolean z10 = i == 130;
        int height = getHeight();
        Rect rect = this.f1652b;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1652b.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1652b;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1652b;
        return x(i, rect3.top, rect3.bottom);
    }

    public final void m(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        s(i12, i13, iArr);
    }

    public final void measureChild(View view, int i, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(View view, int i, int i10, int i11, int i12, int i13) {
        s(i12, i13, (int[]) null);
    }

    public final boolean o(View view, View view2, int i, int i10) {
        return (i & 2) != 0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1658w = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1660y) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r11.f1660y
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00ad
            r4 = -1
            if (r0 == r2) goto L_0x0085
            if (r0 == r1) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x012f
        L_0x001f:
            r11.t(r12)
            goto L_0x012f
        L_0x0024:
            int r0 = r11.F
            if (r0 != r4) goto L_0x002a
            goto L_0x012f
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x012f
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f1656u
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.C
            if (r4 <= r5) goto L_0x012f
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x012f
            r11.f1660y = r2
            r11.f1656u = r0
            android.view.VelocityTracker r0 = r11.z
            if (r0 != 0) goto L_0x0073
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.z = r0
        L_0x0073:
            android.view.VelocityTracker r0 = r11.z
            r0.addMovement(r12)
            r11.I = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x012f
            r12.requestDisallowInterceptTouchEvent(r2)
            goto L_0x012f
        L_0x0085:
            r11.f1660y = r3
            r11.F = r4
            r11.v()
            android.widget.OverScroller r4 = r11.f1653c
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00a8
            java.util.WeakHashMap<android.view.View, n0.a0> r12 = n0.x.f8842a
            n0.x.d.k(r11)
        L_0x00a8:
            r11.C(r3)
            goto L_0x012f
        L_0x00ad:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00e1
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00e1
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00e1
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00e1
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00e1
            r4 = r2
            goto L_0x00e2
        L_0x00e1:
            r4 = r3
        L_0x00e2:
            if (r4 != 0) goto L_0x00fa
            boolean r12 = r11.B(r12)
            if (r12 != 0) goto L_0x00f4
            android.widget.OverScroller r12 = r11.f1653c
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r2 = r3
        L_0x00f4:
            r11.f1660y = r2
            r11.v()
            goto L_0x012f
        L_0x00fa:
            r11.f1656u = r0
            int r0 = r12.getPointerId(r3)
            r11.F = r0
            android.view.VelocityTracker r0 = r11.z
            if (r0 != 0) goto L_0x010d
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.z = r0
            goto L_0x0110
        L_0x010d:
            r0.clear()
        L_0x0110:
            android.view.VelocityTracker r0 = r11.z
            r0.addMovement(r12)
            android.widget.OverScroller r0 = r11.f1653c
            r0.computeScrollOffset()
            boolean r12 = r11.B(r12)
            if (r12 != 0) goto L_0x012a
            android.widget.OverScroller r12 = r11.f1653c
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r2 = r3
        L_0x012a:
            r11.f1660y = r2
            r11.A(r1, r3)
        L_0x012f:
            boolean r12 = r11.f1660y
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        int i13 = 0;
        this.f1657v = false;
        View view = this.f1659x;
        if (view != null && q(view, this)) {
            y(this.f1659x);
        }
        this.f1659x = null;
        if (!this.f1658w) {
            if (this.K != null) {
                scrollTo(getScrollX(), this.K.f1661a);
                this.K = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int c10 = c(scrollY, paddingTop, i13);
            if (c10 != scrollY) {
                scrollTo(getScrollX(), c10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1658w = true;
    }

    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (this.A && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        k((int) f11);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public final void onNestedPreScroll(View view, int i, int i10, int[] iArr) {
        e(i, i10, iArr, (int[]) null, 0);
    }

    public final void onNestedScroll(View view, int i, int i10, int i11, int i12) {
        s(i12, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.L.a(i, 0);
        A(2, 0);
    }

    public final void onOverScrolled(int i, int i10, boolean z10, boolean z11) {
        super.scrollTo(i, i10);
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !(true ^ r(view, 0, getHeight()))) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.K = cVar;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f1661a = getScrollY();
        return cVar;
    }

    public final void onScrollChanged(int i, int i10, int i11, int i12) {
        super.onScrollChanged(i, i10, i11, i12);
        b bVar = this.O;
        if (bVar != null) {
            h.b bVar2 = (h.b) bVar;
            AlertController.b(this, bVar2.f5520a, bVar2.f5521b);
        }
    }

    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && r(findFocus, 0, i12)) {
            findFocus.getDrawingRect(this.f1652b);
            offsetDescendantRectToMyCoords(findFocus, this.f1652b);
            f(d(this.f1652b));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public final void onStopNestedScroll(View view) {
        this.L.f8835a = 0;
        C(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            android.view.VelocityTracker r0 = r6.z
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.z = r0
        L_0x000e:
            int r0 = r24.getActionMasked()
            r8 = 0
            if (r0 != 0) goto L_0x0017
            r6.I = r8
        L_0x0017:
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r24)
            int r1 = r6.I
            float r1 = (float) r1
            r2 = 0
            r9.offsetLocation(r2, r1)
            r1 = 2
            r10 = 1
            if (r0 == 0) goto L_0x02be
            r3 = -1
            if (r0 == r10) goto L_0x023f
            if (r0 == r1) goto L_0x0098
            r1 = 3
            if (r0 == r1) goto L_0x005b
            r1 = 5
            if (r0 == r1) goto L_0x0048
            r1 = 6
            if (r0 == r1) goto L_0x0036
            goto L_0x02ed
        L_0x0036:
            r23.t(r24)
            int r0 = r6.F
            int r0 = r7.findPointerIndex(r0)
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            r6.f1656u = r0
            goto L_0x02ed
        L_0x0048:
            int r0 = r24.getActionIndex()
            float r1 = r7.getY(r0)
            int r1 = (int) r1
            r6.f1656u = r1
            int r0 = r7.getPointerId(r0)
            r6.F = r0
            goto L_0x02ed
        L_0x005b:
            boolean r0 = r6.f1660y
            if (r0 == 0) goto L_0x0082
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x0082
            android.widget.OverScroller r11 = r6.f1653c
            int r12 = r23.getScrollX()
            int r13 = r23.getScrollY()
            r14 = 0
            r15 = 0
            r16 = 0
            int r17 = r23.getScrollRange()
            boolean r0 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0082
            java.util.WeakHashMap<android.view.View, n0.a0> r0 = n0.x.f8842a
            n0.x.d.k(r23)
        L_0x0082:
            r6.F = r3
            r6.f1660y = r8
            r23.v()
            r6.C(r8)
            android.widget.EdgeEffect r0 = r6.f1654s
            r0.onRelease()
            android.widget.EdgeEffect r0 = r6.f1655t
            r0.onRelease()
            goto L_0x02ed
        L_0x0098:
            int r0 = r6.F
            int r11 = r7.findPointerIndex(r0)
            if (r11 != r3) goto L_0x00bb
            java.lang.String r0 = "Invalid pointerId="
            java.lang.StringBuilder r0 = a.a.d(r0)
            int r1 = r6.F
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x02ed
        L_0x00bb:
            float r0 = r7.getY(r11)
            int r12 = (int) r0
            int r0 = r6.f1656u
            int r0 = r0 - r12
            float r1 = r7.getX(r11)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r3 = (float) r0
            int r4 = r23.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            android.widget.EdgeEffect r4 = r6.f1654s
            float r4 = q0.c.a(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L_0x00f9
            android.widget.EdgeEffect r4 = r6.f1654s
            float r3 = -r3
            float r1 = q0.c.b(r4, r3, r1)
            float r1 = -r1
            android.widget.EdgeEffect r3 = r6.f1654s
            float r3 = q0.c.a(r3)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00f7
            android.widget.EdgeEffect r2 = r6.f1654s
            r2.onRelease()
        L_0x00f7:
            r2 = r1
            goto L_0x011b
        L_0x00f9:
            android.widget.EdgeEffect r4 = r6.f1655t
            float r4 = q0.c.a(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x011b
            android.widget.EdgeEffect r4 = r6.f1655t
            float r1 = r13 - r1
            float r1 = q0.c.b(r4, r3, r1)
            android.widget.EdgeEffect r3 = r6.f1655t
            float r3 = q0.c.a(r3)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00f7
            android.widget.EdgeEffect r2 = r6.f1655t
            r2.onRelease()
            goto L_0x00f7
        L_0x011b:
            int r1 = r23.getHeight()
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            if (r1 == 0) goto L_0x012a
            r23.invalidate()
        L_0x012a:
            int r0 = r0 - r1
            boolean r1 = r6.f1660y
            if (r1 != 0) goto L_0x014b
            int r1 = java.lang.Math.abs(r0)
            int r2 = r6.C
            if (r1 <= r2) goto L_0x014b
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x0140
            r1.requestDisallowInterceptTouchEvent(r10)
        L_0x0140:
            r6.f1660y = r10
            if (r0 <= 0) goto L_0x0148
            int r1 = r6.C
            int r0 = r0 - r1
            goto L_0x014b
        L_0x0148:
            int r1 = r6.C
            int r0 = r0 + r1
        L_0x014b:
            r14 = r0
            boolean r0 = r6.f1660y
            if (r0 == 0) goto L_0x02ed
            r1 = 0
            int[] r3 = r6.H
            int[] r4 = r6.G
            r5 = 0
            r0 = r23
            r2 = r14
            boolean r0 = r0.e(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x016d
            int[] r0 = r6.H
            r0 = r0[r10]
            int r14 = r14 - r0
            int r0 = r6.I
            int[] r1 = r6.G
            r1 = r1[r10]
            int r0 = r0 + r1
            r6.I = r0
        L_0x016d:
            int[] r0 = r6.G
            r0 = r0[r10]
            int r12 = r12 - r0
            r6.f1656u = r12
            int r0 = r23.getScrollY()
            int r1 = r23.getScrollRange()
            int r2 = r23.getOverScrollMode()
            if (r2 == 0) goto L_0x0189
            if (r2 != r10) goto L_0x0187
            if (r1 <= 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r2 = r8
            goto L_0x018a
        L_0x0189:
            r2 = r10
        L_0x018a:
            int r3 = r23.getScrollY()
            boolean r3 = r6.u(r14, r8, r3, r1)
            if (r3 == 0) goto L_0x019c
            boolean r3 = r6.p(r8)
            if (r3 != 0) goto L_0x019c
            r3 = r10
            goto L_0x019d
        L_0x019c:
            r3 = r8
        L_0x019d:
            int r4 = r23.getScrollY()
            int r17 = r4 - r0
            int r19 = r14 - r17
            int[] r4 = r6.H
            r4[r10] = r8
            r16 = 0
            r18 = 0
            int[] r5 = r6.G
            r21 = 0
            n0.j r15 = r6.M
            r20 = r5
            r22 = r4
            r15.e(r16, r17, r18, r19, r20, r21, r22)
            int r4 = r6.f1656u
            int[] r5 = r6.G
            r12 = r5[r10]
            int r4 = r4 - r12
            r6.f1656u = r4
            int r4 = r6.I
            r5 = r5[r10]
            int r4 = r4 + r5
            r6.I = r4
            if (r2 == 0) goto L_0x0235
            int[] r2 = r6.H
            r2 = r2[r10]
            int r14 = r14 - r2
            int r0 = r0 + r14
            if (r0 >= 0) goto L_0x01f9
            android.widget.EdgeEffect r0 = r6.f1654s
            int r1 = -r14
            float r1 = (float) r1
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r7.getX(r11)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            q0.c.b(r0, r1, r2)
            android.widget.EdgeEffect r0 = r6.f1655t
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x021f
            android.widget.EdgeEffect r0 = r6.f1655t
            r0.onRelease()
            goto L_0x021f
        L_0x01f9:
            if (r0 <= r1) goto L_0x021f
            android.widget.EdgeEffect r0 = r6.f1655t
            float r1 = (float) r14
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r7.getX(r11)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            float r13 = r13 - r2
            q0.c.b(r0, r1, r13)
            android.widget.EdgeEffect r0 = r6.f1654s
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x021f
            android.widget.EdgeEffect r0 = r6.f1654s
            r0.onRelease()
        L_0x021f:
            android.widget.EdgeEffect r0 = r6.f1654s
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x022f
            android.widget.EdgeEffect r0 = r6.f1655t
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0235
        L_0x022f:
            java.util.WeakHashMap<android.view.View, n0.a0> r0 = n0.x.f8842a
            n0.x.d.k(r23)
            goto L_0x0236
        L_0x0235:
            r8 = r3
        L_0x0236:
            if (r8 == 0) goto L_0x02ed
            android.view.VelocityTracker r0 = r6.z
            r0.clear()
            goto L_0x02ed
        L_0x023f:
            android.view.VelocityTracker r0 = r6.z
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r6.E
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r6.F
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r6.D
            if (r1 < r4) goto L_0x028c
            android.widget.EdgeEffect r1 = r6.f1654s
            float r1 = q0.c.a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0268
            android.widget.EdgeEffect r1 = r6.f1654s
            r1.onAbsorb(r0)
            goto L_0x0278
        L_0x0268:
            android.widget.EdgeEffect r1 = r6.f1655t
            float r1 = q0.c.a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x027a
            android.widget.EdgeEffect r1 = r6.f1655t
            int r4 = -r0
            r1.onAbsorb(r4)
        L_0x0278:
            r1 = r10
            goto L_0x027b
        L_0x027a:
            r1 = r8
        L_0x027b:
            if (r1 != 0) goto L_0x02a9
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r6.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x02a9
            r6.dispatchNestedFling(r2, r1, r10)
            r6.k(r0)
            goto L_0x02a9
        L_0x028c:
            android.widget.OverScroller r11 = r6.f1653c
            int r12 = r23.getScrollX()
            int r13 = r23.getScrollY()
            r14 = 0
            r15 = 0
            r16 = 0
            int r17 = r23.getScrollRange()
            boolean r0 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x02a9
            java.util.WeakHashMap<android.view.View, n0.a0> r0 = n0.x.f8842a
            n0.x.d.k(r23)
        L_0x02a9:
            r6.F = r3
            r6.f1660y = r8
            r23.v()
            r6.C(r8)
            android.widget.EdgeEffect r0 = r6.f1654s
            r0.onRelease()
            android.widget.EdgeEffect r0 = r6.f1655t
            r0.onRelease()
            goto L_0x02ed
        L_0x02be:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x02c5
            return r8
        L_0x02c5:
            boolean r0 = r6.f1660y
            if (r0 == 0) goto L_0x02d2
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x02d2
            r0.requestDisallowInterceptTouchEvent(r10)
        L_0x02d2:
            android.widget.OverScroller r0 = r6.f1653c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x02dd
            r23.a()
        L_0x02dd:
            float r0 = r24.getY()
            int r0 = (int) r0
            r6.f1656u = r0
            int r0 = r7.getPointerId(r8)
            r6.F = r0
            r6.A(r1, r8)
        L_0x02ed:
            android.view.VelocityTracker r0 = r6.z
            if (r0 == 0) goto L_0x02f4
            r0.addMovement(r9)
        L_0x02f4:
            r9.recycle()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i) {
        return this.M.g(i);
    }

    public final boolean r(View view, int i, int i10) {
        view.getDrawingRect(this.f1652b);
        offsetDescendantRectToMyCoords(view, this.f1652b);
        return this.f1652b.bottom + i >= getScrollY() && this.f1652b.top - i <= getScrollY() + i10;
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f1657v) {
            y(view2);
        } else {
            this.f1659x = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int d10 = d(rect);
        boolean z11 = d10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, d10);
            } else {
                z(0, d10, false);
            }
        }
        return z11;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            v();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void requestLayout() {
        this.f1657v = true;
        super.requestLayout();
    }

    public final void s(int i, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.M.d(scrollY2, i - scrollY2, i10, iArr);
    }

    public final void scrollTo(int i, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int c10 = c(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int c11 = c(i10, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (c10 != getScrollX() || c11 != getScrollY()) {
                super.scrollTo(c10, c11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.A) {
            this.A = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        j jVar = this.M;
        if (jVar.f8833d) {
            View view = jVar.f8832c;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.i.z(view);
        }
        jVar.f8833d = z10;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.O = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.B = z10;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return A(i, 0);
    }

    public final void stopNestedScroll() {
        C(0);
    }

    public final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1656u = (int) motionEvent.getY(i);
            this.F = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.z;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean u(int i, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        int overScrollMode = getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i13 = i10 + 0;
        int i14 = i11 + i;
        int i15 = i12 + 0;
        if (i13 <= 0 && i13 >= 0) {
            z10 = false;
        } else {
            i13 = 0;
            z10 = true;
        }
        if (i14 > i15) {
            i14 = i15;
        } else if (i14 < 0) {
            i14 = 0;
        } else {
            z11 = false;
            if (z11 && !p(1)) {
                this.f1653c.springBack(i13, i14, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i13, i14, z10, z11);
            if (z10 && !z11) {
                return false;
            }
        }
        z11 = true;
        this.f1653c.springBack(i13, i14, 0, 0, 0, getScrollRange());
        onOverScrolled(i13, i14, z10, z11);
        return z10 ? true : true;
    }

    public final void v() {
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.z = null;
        }
    }

    public final void w(boolean z10) {
        if (z10) {
            A(2, 1);
        } else {
            C(1);
        }
        this.J = getScrollY();
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.k(this);
    }

    public final boolean x(int i, int i10, int i11) {
        boolean z10;
        int i12 = i;
        int i13 = i10;
        int i14 = i11;
        int height = getHeight();
        int scrollY = getScrollY();
        int i15 = height + scrollY;
        boolean z11 = i12 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i16 = 0; i16 < size; i16++) {
            View view2 = focusables.get(i16);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i13 < bottom && top < i14) {
                boolean z13 = i13 < top && bottom < i14;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (!z14) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i13 < scrollY || i14 > i15) {
            f(z11 ? i13 - scrollY : i14 - i15);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i12);
        }
        return z10;
    }

    public final void y(View view) {
        view.getDrawingRect(this.f1652b);
        offsetDescendantRectToMyCoords(view, this.f1652b);
        int d10 = d(this.f1652b);
        if (d10 != 0) {
            scrollBy(0, d10);
        }
    }

    public final void z(int i, int i10, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1651a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1653c;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                w(z10);
            } else {
                if (!this.f1653c.isFinished()) {
                    a();
                }
                scrollBy(i, i10);
            }
            this.f1651a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
