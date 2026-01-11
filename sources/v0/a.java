package v0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import d0.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.e0;
import n0.x;
import o0.b;
import o0.d;

public final class a extends ViewGroup {
    public static final int[] C = {16842931};
    public static final boolean D = true;
    public static final boolean E = true;
    public static boolean F;
    public Rect A;
    public Matrix B;

    /* renamed from: a  reason: collision with root package name */
    public float f12109a;

    /* renamed from: b  reason: collision with root package name */
    public float f12110b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12111c;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12112s;

    /* renamed from: t  reason: collision with root package name */
    public int f12113t;

    /* renamed from: u  reason: collision with root package name */
    public int f12114u;

    /* renamed from: v  reason: collision with root package name */
    public int f12115v;

    /* renamed from: w  reason: collision with root package name */
    public int f12116w;

    /* renamed from: x  reason: collision with root package name */
    public C0235a f12117x;

    /* renamed from: y  reason: collision with root package name */
    public List<C0235a> f12118y;
    public Drawable z;

    /* renamed from: v0.a$a  reason: collision with other inner class name */
    public interface C0235a {
        void a();
    }

    static {
        boolean z10 = true;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            z10 = false;
        }
        F = z10;
    }

    public final boolean a(View view) {
        return (g(view) & 3) == 3;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i, int i10) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            int i11 = 0;
            boolean z10 = false;
            while (i11 < childCount) {
                View childAt = getChildAt(i11);
                if (j(childAt)) {
                    if (i(childAt)) {
                        childAt.addFocusables(arrayList, i, i10);
                        z10 = true;
                    }
                    i11++;
                } else {
                    throw null;
                }
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (d() != null || j(view)) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.d.s(view, 4);
        } else {
            WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
            x.d.s(view, 1);
        }
        if (!D) {
            x.p(view, (n0.a) null);
        }
    }

    public final void b(boolean z10) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = (b) childAt.getLayoutParams();
            if (j(childAt)) {
                if (z10) {
                    Objects.requireNonNull(bVar);
                } else {
                    childAt.getWidth();
                    if (a(childAt)) {
                        childAt.getTop();
                        throw null;
                    }
                    getWidth();
                    childAt.getTop();
                    throw null;
                }
            }
        }
        throw null;
    }

    public final View c(int i) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, x.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((g(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f10 = Math.max(f10, ((b) getChildAt(i).getLayoutParams()).f12120b);
        }
        this.f12110b = f10;
        throw null;
    }

    public final View d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((b) childAt.getLayoutParams()).f12121c & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z10;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f12110b <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.A == null) {
                this.A = new Rect();
            }
            childAt.getHitRect(this.A);
            if (this.A.contains((int) x10, (int) y10) && !h(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.B == null) {
                            this.B = new Matrix();
                        }
                        matrix.invert(this.B);
                        obtain.transform(this.B);
                    }
                    z10 = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = (float) (getScrollX() - childAt.getLeft());
                    float scrollY = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    z10 = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean h10 = h(view);
        int width = getWidth();
        int save = canvas.save();
        if (h10) {
            int childCount = getChildCount();
            int i = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && j(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt)) {
                            int right = childAt.getRight();
                            if (right > i) {
                                i = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (this.f12110b <= 0.0f || !h10) {
            return drawChild;
        }
        throw null;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (j(childAt)) {
                if (j(childAt)) {
                    if (((b) childAt.getLayoutParams()).f12120b > 0.0f) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    public final int f(View view) {
        if (j(view)) {
            int i = ((b) view.getLayoutParams()).f12119a;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            int d10 = x.e.d(this);
            if (i == 3) {
                int i10 = this.f12113t;
                if (i10 != 3) {
                    return i10;
                }
                int i11 = d10 == 0 ? this.f12115v : this.f12116w;
                if (i11 != 3) {
                    return i11;
                }
            } else if (i == 5) {
                int i12 = this.f12114u;
                if (i12 != 3) {
                    return i12;
                }
                int i13 = d10 == 0 ? this.f12116w : this.f12115v;
                if (i13 != 3) {
                    return i13;
                }
            } else if (i == 8388611) {
                int i14 = this.f12115v;
                if (i14 != 3) {
                    return i14;
                }
                int i15 = d10 == 0 ? this.f12113t : this.f12114u;
                if (i15 != 3) {
                    return i15;
                }
            } else if (i == 8388613) {
                int i16 = this.f12116w;
                if (i16 != 3) {
                    return i16;
                }
                int i17 = d10 == 0 ? this.f12114u : this.f12113t;
                if (i17 != 3) {
                    return i17;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int g(View view) {
        int i = ((b) view.getLayoutParams()).f12119a;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        return Gravity.getAbsoluteGravity(i, x.e.d(this));
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public float getDrawerElevation() {
        if (E) {
            return this.f12109a;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.z;
    }

    public final boolean h(View view) {
        return ((b) view.getLayoutParams()).f12119a == 0;
    }

    public final boolean i(View view) {
        if (j(view)) {
            return (((b) view.getLayoutParams()).f12121c & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean j(View view) {
        int i = ((b) view.getLayoutParams()).f12119a;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, x.e.d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final void k(View view) {
        if (j(view)) {
            b bVar = (b) view.getLayoutParams();
            if (this.f12112s) {
                bVar.f12120b = 1.0f;
                bVar.f12121c = 1;
                o(view, true);
                n(view);
                invalidate();
                return;
            }
            bVar.f12121c |= 2;
            if (a(view)) {
                view.getTop();
                throw null;
            }
            getWidth();
            view.getWidth();
            view.getTop();
            throw null;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void l(int i, int i10) {
        View c10;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, x.e.d(this));
        if (i10 == 3) {
            this.f12113t = i;
        } else if (i10 == 5) {
            this.f12114u = i;
        } else if (i10 == 8388611) {
            this.f12115v = i;
        } else if (i10 == 8388613) {
            this.f12116w = i;
        }
        if (i != 0) {
            throw null;
        } else if (i == 1) {
            View c11 = c(absoluteGravity);
            if (c11 == null) {
                return;
            }
            if (j(c11)) {
                b bVar = (b) c11.getLayoutParams();
                if (this.f12112s) {
                    bVar.f12120b = 0.0f;
                    bVar.f12121c = 0;
                    invalidate();
                    return;
                }
                bVar.f12121c |= 4;
                if (a(c11)) {
                    c11.getWidth();
                    c11.getTop();
                    throw null;
                }
                getWidth();
                c11.getTop();
                throw null;
            }
            throw new IllegalArgumentException("View " + c11 + " is not a sliding drawer");
        } else if (i == 2 && (c10 = c(absoluteGravity)) != null) {
            k(c10);
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List<v0.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<v0.a$a>, java.util.ArrayList] */
    public final void m(View view, float f10) {
        b bVar = (b) view.getLayoutParams();
        if (f10 != bVar.f12120b) {
            bVar.f12120b = f10;
            ? r22 = this.f12118y;
            if (r22 != 0) {
                int size = r22.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C0235a) this.f12118y.get(size)).a();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void n(View view) {
        b.a aVar = b.a.f9179j;
        x.m(aVar.a(), view);
        x.j(view, 0);
        if (i(view) && f(view) != 2) {
            x.n(view, aVar, (d) null);
        }
    }

    public final void o(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z10 || j(childAt)) && (!z10 || childAt != view)) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.d.s(childAt, 4);
            } else {
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                x.d.s(childAt, 1);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12112s = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12112s = true;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        throw null;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (e() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View e10 = e();
        if (e10 != null && f(e10) == 0) {
            b(false);
            throw null;
        } else if (e10 != null) {
            return true;
        } else {
            return false;
        }
    }

    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        WindowInsets rootWindowInsets;
        float f10;
        int i13;
        boolean z11 = true;
        this.f12111c = true;
        int i14 = i11 - i;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (h(childAt)) {
                    int i16 = bVar.leftMargin;
                    childAt.layout(i16, bVar.topMargin, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + bVar.topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt)) {
                        float f11 = (float) measuredWidth;
                        i13 = (-measuredWidth) + ((int) (bVar.f12120b * f11));
                        f10 = ((float) (measuredWidth + i13)) / f11;
                    } else {
                        float f12 = (float) measuredWidth;
                        int i17 = i14 - ((int) (bVar.f12120b * f12));
                        f10 = ((float) (i14 - i17)) / f12;
                        i13 = i17;
                    }
                    boolean z12 = f10 != bVar.f12120b ? z11 : false;
                    int i18 = bVar.f12119a & 112;
                    if (i18 == 16) {
                        int i19 = i12 - i10;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = bVar.topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = i19 - bVar.bottomMargin;
                            if (i22 > i23) {
                                i20 = i23 - measuredHeight;
                            }
                        }
                        childAt.layout(i13, i20, measuredWidth + i13, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = bVar.topMargin;
                        childAt.layout(i13, i24, measuredWidth + i13, measuredHeight + i24);
                    } else {
                        int i25 = i12 - i10;
                        childAt.layout(i13, (i25 - bVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i13, i25 - bVar.bottomMargin);
                    }
                    if (z12) {
                        m(childAt, f10);
                    }
                    int i26 = bVar.f12120b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i15++;
            z11 = true;
        }
        if (!F || (rootWindowInsets = getRootWindowInsets()) == null) {
            this.f12111c = false;
            this.f12112s = false;
            return;
        }
        e0.k(rootWindowInsets, (View) null).f8798a.i();
        throw null;
    }

    public final void onMeasure(int i, int i10) {
        String str;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i10);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.e.d(this);
        int childCount = getChildCount();
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (h(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - bVar.leftMargin) - bVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - bVar.topMargin) - bVar.bottomMargin, 1073741824));
                } else if (j(childAt)) {
                    if (E) {
                        float i12 = x.i.i(childAt);
                        float f10 = this.f12109a;
                        if (i12 != f10) {
                            x.i.s(childAt, f10);
                        }
                    }
                    int g = g(childAt) & 7;
                    boolean z12 = g == 3;
                    if ((!z12 || !z10) && (z12 || !z11)) {
                        if (z12) {
                            z10 = true;
                        } else {
                            z11 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, bVar.leftMargin + 0 + bVar.rightMargin, bVar.width), ViewGroup.getChildMeasureSpec(i10, bVar.topMargin + bVar.bottomMargin, bVar.height));
                    } else {
                        StringBuilder d10 = a.a.d("Child drawer has absolute gravity ");
                        if ((g & 3) != 3) {
                            str = (g & 5) == 5 ? "RIGHT" : Integer.toHexString(g);
                        } else {
                            str = "LEFT";
                        }
                        d10.append(str);
                        d10.append(" but this ");
                        d10.append("DrawerLayout");
                        d10.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(d10.toString());
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i11 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i13 = i;
            int i14 = i10;
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        View c10;
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f10849a);
        int i = cVar.f12122c;
        if (!(i == 0 || (c10 = c(i)) == null)) {
            k(c10);
        }
        int i10 = cVar.f12123s;
        if (i10 != 3) {
            l(i10, 3);
        }
        int i11 = cVar.f12124t;
        if (i11 != 3) {
            l(i11, 5);
        }
        int i12 = cVar.f12125u;
        if (i12 != 3) {
            l(i12, 8388611);
        }
        int i13 = cVar.f12126v;
        if (i13 != 3) {
            l(i13, 8388613);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        if (!E) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.e.d(this);
            x.e.d(this);
        }
    }

    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            b bVar = (b) getChildAt(i).getLayoutParams();
            int i10 = bVar.f12121c;
            boolean z10 = true;
            boolean z11 = i10 == 1;
            if (i10 != 2) {
                z10 = false;
            }
            if (z11 || z10) {
                cVar.f12122c = bVar.f12119a;
            } else {
                i++;
            }
        }
        cVar.f12123s = this.f12113t;
        cVar.f12124t = this.f12114u;
        cVar.f12125u = this.f12115v;
        cVar.f12126v = this.f12116w;
        return cVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            b(true);
            throw null;
        }
    }

    public final void requestLayout() {
        if (!this.f12111c) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f10) {
        this.f12109a = f10;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (j(childAt)) {
                float f11 = this.f12109a;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.i.s(childAt, f11);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<v0.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<v0.a$a>, java.util.ArrayList] */
    @Deprecated
    public void setDrawerListener(C0235a aVar) {
        ? r12;
        C0235a aVar2 = this.f12117x;
        if (!(aVar2 == null || (r12 = this.f12118y) == 0)) {
            r12.remove(aVar2);
        }
        if (aVar != null) {
            if (this.f12118y == null) {
                this.f12118y = new ArrayList();
            }
            this.f12118y.add(aVar);
        }
        this.f12117x = aVar;
    }

    public void setDrawerLockMode(int i) {
        l(i, 3);
        l(i, 5);
    }

    public void setScrimColor(int i) {
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.z = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.z = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = d0.a.f4256a;
            drawable = a.b.b(context, i);
        } else {
            drawable = null;
        }
        this.z = drawable;
        invalidate();
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f12119a = 0;

        /* renamed from: b  reason: collision with root package name */
        public float f12120b;

        /* renamed from: c  reason: collision with root package name */
        public int f12121c;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.C);
            this.f12119a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public b() {
            super(-1, -1);
        }

        public b(b bVar) {
            super(bVar);
            this.f12119a = bVar.f12119a;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public static class c extends s0.a {
        public static final Parcelable.Creator<c> CREATOR = new C0236a();

        /* renamed from: c  reason: collision with root package name */
        public int f12122c = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f12123s;

        /* renamed from: t  reason: collision with root package name */
        public int f12124t;

        /* renamed from: u  reason: collision with root package name */
        public int f12125u;

        /* renamed from: v  reason: collision with root package name */
        public int f12126v;

        /* renamed from: v0.a$c$a  reason: collision with other inner class name */
        public class C0236a implements Parcelable.ClassLoaderCreator<c> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new c[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12122c = parcel.readInt();
            this.f12123s = parcel.readInt();
            this.f12124t = parcel.readInt();
            this.f12125u = parcel.readInt();
            this.f12126v = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeInt(this.f12122c);
            parcel.writeInt(this.f12123s);
            parcel.writeInt(this.f12124t);
            parcel.writeInt(this.f12125u);
            parcel.writeInt(this.f12126v);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
