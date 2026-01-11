package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import d0.a;
import io.nodle.cash.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.e0;
import n0.k;
import n0.l;
import n0.m;
import n0.n;
import n0.x;

public class CoordinatorLayout extends ViewGroup implements k, l {
    public static final String I;
    public static final Class<?>[] J = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<c>>> K = new ThreadLocal<>();
    public static final Comparator<View> L = new i();
    public static final m0.c<Rect> M = new m0.e(12);
    public g A;
    public boolean B;
    public e0 C;
    public boolean D;
    public Drawable E;
    public ViewGroup.OnHierarchyChangeListener F;
    public a G;
    public final m H = new m();

    /* renamed from: a  reason: collision with root package name */
    public final List<View> f1607a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final a0.a<View> f1608b = new a0.a<>();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f1609c = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final List<View> f1610s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final int[] f1611t = new int[2];

    /* renamed from: u  reason: collision with root package name */
    public final int[] f1612u = new int[2];

    /* renamed from: v  reason: collision with root package name */
    public boolean f1613v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1614w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f1615x;

    /* renamed from: y  reason: collision with root package name */
    public View f1616y;
    public View z;

    public class a implements n {
        public a() {
        }

        public final e0 a(View view, e0 e0Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.C, e0Var)) {
                coordinatorLayout.C = e0Var;
                boolean z = true;
                boolean z10 = e0Var.f() > 0;
                coordinatorLayout.D = z10;
                if (z10 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!e0Var.h()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, a0> weakHashMap = x.f8842a;
                        if (x.d.b(childAt) && ((f) childAt.getLayoutParams()).f1619a != null && e0Var.h()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return e0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i, int i10, int[] iArr, int i11) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
            iArr[0] = iArr[0] + i10;
            iArr[1] = iArr[1] + i11;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.F;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.F;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class i implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            float m10 = x.i.m((View) obj);
            float m11 = x.i.m((View) obj2);
            if (m10 > m11) {
                return -1;
            }
            return m10 < m11 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            I = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            L = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            J = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            K = r0
            m0.e r0 = new m0.e
            r1 = 12
            r0.<init>(r1)
            M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = ad.c.f331q0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1615x = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f1615x.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.f1615x;
                iArr2[i10] = (int) (((float) iArr2[i10]) * f10);
            }
        }
        this.E = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.d.c(this) == 0) {
            x.d.s(this, 1);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m0.c<android.graphics.Rect>, m0.e] */
    public static Rect a() {
        Rect rect = (Rect) M.b();
        return rect == null ? new Rect() : rect;
    }

    public final void b(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - fVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final void c(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final List<View> d(View view) {
        a0.a<View> aVar = this.f1608b;
        int i10 = aVar.f13b.f10843c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList m10 = aVar.f13b.m(i11);
            if (m10 != null && m10.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.f13b.i(i11));
            }
        }
        this.f1610s.clear();
        if (arrayList != null) {
            this.f1610s.addAll(arrayList);
        }
        return this.f1610s;
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c cVar = ((f) view.getLayoutParams()).f1619a;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.E;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final List<View> e(View view) {
        List orDefault = this.f1608b.f13b.getOrDefault(view, null);
        this.f1610s.clear();
        if (orDefault != null) {
            this.f1610s.addAll(orDefault);
        }
        return this.f1610s;
    }

    public final void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = a0.b.f16a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = a0.b.f16a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        a0.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = a0.b.f17b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void g(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int i13;
        int i14;
        int i15 = fVar.f1621c;
        if (i15 == 0) {
            i15 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i15, i10);
        int i16 = fVar.f1622d;
        if ((i16 & 7) == 0) {
            i16 |= 8388611;
        }
        if ((i16 & 112) == 0) {
            i16 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i16, i10);
        int i17 = absoluteGravity & 7;
        int i18 = absoluteGravity & 112;
        int i19 = absoluteGravity2 & 7;
        int i20 = absoluteGravity2 & 112;
        if (i19 == 1) {
            i13 = rect.left + (rect.width() / 2);
        } else if (i19 != 5) {
            i13 = rect.left;
        } else {
            i13 = rect.right;
        }
        if (i20 == 16) {
            i14 = rect.top + (rect.height() / 2);
        } else if (i20 != 80) {
            i14 = rect.top;
        } else {
            i14 = rect.bottom;
        }
        if (i17 == 1) {
            i13 -= i11 / 2;
        } else if (i17 != 5) {
            i13 -= i11;
        }
        if (i18 == 16) {
            i14 -= i12 / 2;
        } else if (i18 != 80) {
            i14 -= i12;
        }
        rect2.set(i13, i14, i11 + i13, i12 + i14);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f1607a);
    }

    public final e0 getLastWindowInsets() {
        return this.C;
    }

    public int getNestedScrollAxes() {
        m mVar = this.H;
        return mVar.f8836b | mVar.f8835a;
    }

    public Drawable getStatusBarBackground() {
        return this.E;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(View view, View view2, int i10, int i11) {
        this.H.a(i10, i11);
        this.z = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            Objects.requireNonNull((f) getChildAt(i12).getLayoutParams());
        }
    }

    public final void i(View view, int i10) {
        m mVar = this.H;
        if (i10 == 1) {
            mVar.f8836b = 0;
        } else {
            mVar.f8835a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f1619a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                fVar.c(i10, false);
                fVar.f1632p = false;
            }
        }
        this.z = null;
    }

    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int i13;
        int i14;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                int i18 = i12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f1619a) != null) {
                    int[] iArr2 = this.f1611t;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1611t;
                    if (i10 > 0) {
                        i13 = Math.max(i15, iArr3[0]);
                    } else {
                        i13 = Math.min(i15, iArr3[0]);
                    }
                    i15 = i13;
                    int[] iArr4 = this.f1611t;
                    if (i11 > 0) {
                        i14 = Math.max(i16, iArr4[1]);
                    } else {
                        i14 = Math.min(i16, iArr4[1]);
                    }
                    i16 = i14;
                    z10 = true;
                }
            }
        }
        iArr[0] = i15;
        iArr[1] = i16;
        if (z10) {
            q(1);
        }
    }

    public final int k(int i10) {
        int[] iArr = this.f1615x;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    public final f l(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1620b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.f1620b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        StringBuilder d10 = a.a.d("Default behavior class ");
                        d10.append(dVar.value().getName());
                        d10.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", d10.toString(), e10);
                    }
                }
                fVar.f1620b = true;
            }
        }
        return fVar;
    }

    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int i15;
        int i16;
        int childCount = getChildCount();
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                int i20 = i14;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f1619a) != null) {
                    int[] iArr2 = this.f1611t;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i11, i12, i13, iArr2);
                    int[] iArr3 = this.f1611t;
                    if (i12 > 0) {
                        i15 = Math.max(i17, iArr3[0]);
                    } else {
                        i15 = Math.min(i17, iArr3[0]);
                    }
                    i17 = i15;
                    if (i13 > 0) {
                        i16 = Math.max(i18, this.f1611t[1]);
                    } else {
                        i16 = Math.min(i18, this.f1611t[1]);
                    }
                    i18 = i16;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i17;
        iArr[1] = iArr[1] + i18;
        if (z10) {
            q(1);
        }
    }

    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f1612u);
    }

    public final boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1619a;
                if (cVar != null) {
                    boolean p10 = cVar.p(this, childAt, view, i10, i11);
                    z10 |= p10;
                    fVar.c(i11, p10);
                } else {
                    fVar.c(i11, false);
                }
            }
        }
        return z10;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.B) {
            if (this.A == null) {
                this.A = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.A);
        }
        if (this.C == null) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.d.b(this)) {
                x.h.c(this);
            }
        }
        this.f1614w = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.B && this.A != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A);
        }
        View view = this.z;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1614w = false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.D && this.E != null) {
            e0 e0Var = this.C;
            int f10 = e0Var != null ? e0Var.f() : 0;
            if (f10 > 0) {
                this.E.setBounds(0, 0, getWidth(), f10);
                this.E.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t10 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t10;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        int d10 = x.e.d(this);
        int size = this.f1607a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f1607a.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1619a) == null || !cVar.h(this, view, d10))) {
                r(view, d10);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018c, code lost:
        if (r0.i(r30, r19, r24, r20, r25) == false) goto L_0x01a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r6 = r30
            r30.u()
            int r0 = r30.getChildCount()
            r7 = 0
            r1 = r7
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x0038
            android.view.View r3 = r6.getChildAt(r1)
            a0.a<android.view.View> r4 = r6.f1608b
            s.g<T, java.util.ArrayList<T>> r5 = r4.f13b
            int r5 = r5.f10843c
            r8 = r7
        L_0x0019:
            if (r8 >= r5) goto L_0x0030
            s.g<T, java.util.ArrayList<T>> r9 = r4.f13b
            java.lang.Object r9 = r9.m(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r3 = r2
            goto L_0x0031
        L_0x002d:
            int r8 = r8 + 1
            goto L_0x0019
        L_0x0030:
            r3 = r7
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0039
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0038:
            r0 = r7
        L_0x0039:
            boolean r1 = r6.B
            if (r0 == r1) goto L_0x006d
            if (r0 == 0) goto L_0x005a
            boolean r0 = r6.f1614w
            if (r0 == 0) goto L_0x0057
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.A
            if (r0 != 0) goto L_0x004e
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r6.A = r0
        L_0x004e:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.A
            r0.addOnPreDrawListener(r1)
        L_0x0057:
            r6.B = r2
            goto L_0x006d
        L_0x005a:
            boolean r0 = r6.f1614w
            if (r0 == 0) goto L_0x006b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.A
            if (r0 == 0) goto L_0x006b
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.A
            r0.removeOnPreDrawListener(r1)
        L_0x006b:
            r6.B = r7
        L_0x006d:
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, n0.a0> r3 = n0.x.f8842a
            int r10 = n0.x.e.d(r30)
            if (r10 != r2) goto L_0x0087
            r11 = r2
            goto L_0x0088
        L_0x0087:
            r11 = r7
        L_0x0088:
            int r12 = android.view.View.MeasureSpec.getMode(r31)
            int r13 = android.view.View.MeasureSpec.getSize(r31)
            int r14 = android.view.View.MeasureSpec.getMode(r32)
            int r15 = android.view.View.MeasureSpec.getSize(r32)
            int r16 = r8 + r9
            int r17 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            n0.e0 r3 = r6.C
            if (r3 == 0) goto L_0x00b1
            boolean r3 = n0.x.d.b(r30)
            if (r3 == 0) goto L_0x00b1
            r18 = r2
            goto L_0x00b3
        L_0x00b1:
            r18 = r7
        L_0x00b3:
            java.util.List<android.view.View> r2 = r6.f1607a
            int r5 = r2.size()
            r4 = r0
            r3 = r1
            r1 = r7
            r2 = r1
        L_0x00bd:
            if (r2 >= r5) goto L_0x01e8
            java.util.List<android.view.View> r0 = r6.f1607a
            java.lang.Object r0 = r0.get(r2)
            r19 = r0
            android.view.View r19 = (android.view.View) r19
            int r0 = r19.getVisibility()
            r7 = 8
            if (r0 != r7) goto L_0x00df
            r21 = r2
            r28 = r5
            r22 = r8
            r26 = r9
            r27 = r10
            r23 = 0
            goto L_0x01da
        L_0x00df:
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r7 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r7
            int r0 = r7.f1623e
            if (r0 < 0) goto L_0x012b
            if (r12 == 0) goto L_0x012b
            int r0 = r6.k(r0)
            r21 = r1
            int r1 = r7.f1621c
            if (r1 != 0) goto L_0x00f9
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f9:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r22 = r2
            r2 = 3
            if (r1 != r2) goto L_0x0106
            if (r11 == 0) goto L_0x010b
        L_0x0106:
            r2 = 5
            if (r1 != r2) goto L_0x0117
            if (r11 == 0) goto L_0x0117
        L_0x010b:
            int r1 = r13 - r9
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r2 = r0
            r20 = r1
            goto L_0x0132
        L_0x0117:
            if (r1 != r2) goto L_0x011b
            if (r11 == 0) goto L_0x0120
        L_0x011b:
            r2 = 3
            if (r1 != r2) goto L_0x0129
            if (r11 == 0) goto L_0x0129
        L_0x0120:
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x0132
        L_0x0129:
            r2 = 0
            goto L_0x0130
        L_0x012b:
            r21 = r1
            r22 = r2
            goto L_0x0129
        L_0x0130:
            r20 = r2
        L_0x0132:
            if (r18 == 0) goto L_0x0165
            boolean r0 = n0.x.d.b(r19)
            if (r0 != 0) goto L_0x0165
            n0.e0 r0 = r6.C
            int r0 = r0.d()
            n0.e0 r1 = r6.C
            int r1 = r1.e()
            int r1 = r1 + r0
            n0.e0 r0 = r6.C
            int r0 = r0.f()
            n0.e0 r2 = r6.C
            int r2 = r2.c()
            int r2 = r2 + r0
            int r0 = r13 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r1 = r15 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r24 = r0
            r25 = r1
            goto L_0x0169
        L_0x0165:
            r24 = r31
            r25 = r32
        L_0x0169:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r7.f1619a
            if (r0 == 0) goto L_0x018f
            r2 = r21
            r1 = r30
            r21 = r22
            r23 = 0
            r22 = r8
            r8 = r2
            r2 = r19
            r26 = r9
            r9 = r3
            r3 = r24
            r27 = r10
            r10 = r4
            r4 = r20
            r28 = r5
            r5 = r25
            boolean r0 = r0.i(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01af
            goto L_0x01a1
        L_0x018f:
            r28 = r5
            r26 = r9
            r27 = r10
            r23 = 0
            r9 = r3
            r10 = r4
            r29 = r22
            r22 = r8
            r8 = r21
            r21 = r29
        L_0x01a1:
            r5 = 0
            r0 = r30
            r1 = r19
            r2 = r24
            r3 = r20
            r4 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01af:
            int r0 = r19.getMeasuredWidth()
            int r0 = r0 + r16
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r10, r0)
            int r1 = r19.getMeasuredHeight()
            int r1 = r1 + r17
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r9, r1)
            int r2 = r19.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r4 = r0
            r3 = r1
            r1 = r2
        L_0x01da:
            int r2 = r21 + 1
            r8 = r22
            r7 = r23
            r9 = r26
            r10 = r27
            r5 = r28
            goto L_0x00bd
        L_0x01e8:
            r8 = r1
            r9 = r3
            r10 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r1 = r31
            int r0 = android.view.View.resolveSizeAndState(r10, r1, r0)
            int r1 = r8 << 16
            r2 = r32
            int r1 = android.view.View.resolveSizeAndState(r9, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ((f) childAt.getLayoutParams()).a(0);
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1619a) != null) {
                    z10 |= cVar.j(view);
                }
            }
        }
        return z10;
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f1612u);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        h(view, view2, i10, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f10849a);
        SparseArray<Parcelable> sparseArray = hVar.f1635c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = l(childAt).f1619a;
            if (!(id2 == -1 || cVar == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable o4;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1619a;
            if (!(id2 == -1 || cVar == null || (o4 = cVar.o(childAt)) == null)) {
                sparseArray.append(id2, o4);
            }
        }
        hVar.f1635c = sparseArray;
        return hVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1616y
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f1616y
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1619a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f1616y
            boolean r6 = r6.r(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f1616y
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.v(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [m0.c<android.graphics.Rect>, m0.e] */
    /* JADX WARNING: type inference failed for: r3v2, types: [m0.c<android.graphics.Rect>, m0.e] */
    public final boolean p(View view, int i10, int i11) {
        Rect a10 = a();
        f(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            a10.setEmpty();
            M.a(a10);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v5, types: [m0.c<android.graphics.Rect>, m0.e] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v9, types: [m0.c<android.graphics.Rect>, m0.e] */
    /* JADX WARNING: type inference failed for: r0v32, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v41, types: [m0.c<android.graphics.Rect>, m0.e] */
    public final void q(int i10) {
        int i11;
        Rect rect;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        Rect rect2;
        int i19;
        int i20;
        int i21;
        f fVar;
        c cVar;
        int i22 = i10;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        int d10 = x.e.d(this);
        int size = this.f1607a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        int i23 = 0;
        int i24 = i22;
        while (i23 < size) {
            View view = (View) this.f1607a.get(i23);
            f fVar2 = (f) view.getLayoutParams();
            if (i24 == 0 && view.getVisibility() == 8) {
                i12 = size;
                rect = a12;
                i11 = i23;
            } else {
                int i25 = 0;
                while (i25 < i23) {
                    if (fVar2.f1628l == ((View) this.f1607a.get(i25))) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.f1627k != null) {
                            Rect a13 = a();
                            Rect a14 = a();
                            Rect a15 = a();
                            f(fVar3.f1627k, a13);
                            c(view, false, a14);
                            int measuredWidth = view.getMeasuredWidth();
                            i21 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            int i26 = measuredWidth;
                            Rect rect3 = a15;
                            i20 = i23;
                            Rect rect4 = a14;
                            Rect rect5 = a13;
                            f fVar4 = fVar3;
                            i19 = i25;
                            rect2 = a12;
                            fVar = fVar2;
                            g(d10, a13, rect3, fVar3, i26, measuredHeight);
                            Rect rect6 = rect3;
                            boolean z13 = (rect6.left == rect4.left && rect6.top == rect4.top) ? false : true;
                            f fVar5 = fVar4;
                            b(fVar5, rect6, i26, measuredHeight);
                            int i27 = rect6.left - rect4.left;
                            int i28 = rect6.top - rect4.top;
                            if (i27 != 0) {
                                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                                view.offsetLeftAndRight(i27);
                            }
                            if (i28 != 0) {
                                WeakHashMap<View, a0> weakHashMap3 = x.f8842a;
                                view.offsetTopAndBottom(i28);
                            }
                            if (z13 && (cVar = fVar5.f1619a) != null) {
                                cVar.d(this, view, fVar5.f1627k);
                            }
                            rect5.setEmpty();
                            ? r12 = M;
                            r12.a(rect5);
                            rect4.setEmpty();
                            r12.a(rect4);
                            rect6.setEmpty();
                            r12.a(rect6);
                            i25 = i19 + 1;
                            fVar2 = fVar;
                            size = i21;
                            i23 = i20;
                            a12 = rect2;
                        }
                    }
                    i19 = i25;
                    i21 = size;
                    rect2 = a12;
                    i20 = i23;
                    fVar = fVar2;
                    i25 = i19 + 1;
                    fVar2 = fVar;
                    size = i21;
                    i23 = i20;
                    a12 = rect2;
                }
                int i29 = size;
                Rect rect7 = a12;
                i11 = i23;
                f fVar6 = fVar2;
                c(view, true, a11);
                if (fVar6.g != 0 && !a11.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar6.g, d10);
                    int i30 = absoluteGravity & 112;
                    if (i30 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i30 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i31 = absoluteGravity & 7;
                    if (i31 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i31 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar6.f1625h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, a0> weakHashMap4 = x.f8842a;
                    if (x.g.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar7 = (f) view.getLayoutParams();
                        c cVar2 = fVar7.f1619a;
                        Rect a16 = a();
                        Rect a17 = a();
                        a17.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.a(view)) {
                            a16.set(a17);
                        } else if (!a17.contains(a16)) {
                            StringBuilder d11 = a.a.d("Rect should be within the child's bounds. Rect:");
                            d11.append(a16.toShortString());
                            d11.append(" | Bounds:");
                            d11.append(a17.toShortString());
                            throw new IllegalArgumentException(d11.toString());
                        }
                        a17.setEmpty();
                        ? r32 = M;
                        r32.a(a17);
                        if (a16.isEmpty()) {
                            a16.setEmpty();
                            r32.a(a16);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar7.f1625h, d10);
                            if ((absoluteGravity2 & 48) != 48 || (i17 = (a16.top - fVar7.topMargin) - fVar7.f1626j) >= (i18 = a10.top)) {
                                z11 = false;
                            } else {
                                x(view, i18 - i17);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a16.bottom) - fVar7.bottomMargin) + fVar7.f1626j) < (i16 = a10.bottom)) {
                                x(view, height - i16);
                                z11 = true;
                            }
                            if (!z11) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i14 = (a16.left - fVar7.leftMargin) - fVar7.i) >= (i15 = a10.left)) {
                                z12 = false;
                            } else {
                                w(view, i15 - i14);
                                z12 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a16.right) - fVar7.rightMargin) + fVar7.i) < (i13 = a10.right)) {
                                w(view, width - i13);
                                z12 = true;
                            }
                            if (!z12) {
                                w(view, 0);
                            }
                            a16.setEmpty();
                            r32.a(a16);
                        }
                    }
                }
                if (i22 != 2) {
                    rect = rect7;
                    rect.set(((f) view.getLayoutParams()).f1633q);
                    if (rect.equals(a11)) {
                        i12 = i29;
                        i24 = i22;
                    } else {
                        ((f) view.getLayoutParams()).f1633q.set(a11);
                    }
                } else {
                    rect = rect7;
                }
                i12 = i29;
                for (int i32 = i11 + 1; i32 < i12; i32++) {
                    View view2 = (View) this.f1607a.get(i32);
                    f fVar8 = (f) view2.getLayoutParams();
                    c cVar3 = fVar8.f1619a;
                    if (cVar3 != null && cVar3.b(view2, view)) {
                        if (i22 != 0 || !fVar8.f1632p) {
                            if (i22 != 2) {
                                z10 = cVar3.d(this, view2, view);
                            } else {
                                cVar3.e(this, view);
                                z10 = true;
                            }
                            if (i22 == 1) {
                                fVar8.f1632p = z10;
                            }
                        } else {
                            fVar8.f1632p = false;
                        }
                    }
                }
                i24 = i22;
            }
            i23 = i11 + 1;
            size = i12;
            a12 = rect;
        }
        Rect rect8 = a12;
        a10.setEmpty();
        ? r02 = M;
        r02.a(a10);
        a11.setEmpty();
        r02.a(a11);
        rect8.setEmpty();
        r02.a(rect8);
    }

    /* JADX WARNING: type inference failed for: r13v2, types: [m0.c<android.graphics.Rect>, m0.e] */
    /* JADX WARNING: type inference failed for: r14v10, types: [m0.c<android.graphics.Rect>, m0.e] */
    /* JADX WARNING: type inference failed for: r13v4, types: [m0.c<android.graphics.Rect>, m0.e] */
    public final void r(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1627k;
        int i11 = 0;
        if (view2 == null && fVar.f1624f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a10 = a();
            Rect a11 = a();
            try {
                f(view2, a10);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                g(i10, a10, a11, fVar2, measuredWidth, measuredHeight);
                b(fVar2, a11, measuredWidth, measuredHeight);
                view.layout(a11.left, a11.top, a11.right, a11.bottom);
            } finally {
                a10.setEmpty();
                ? r14 = M;
                r14.a(a10);
                a11.setEmpty();
                r14.a(a11);
            }
        } else {
            int i12 = fVar.f1623e;
            if (i12 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i13 = fVar3.f1621c;
                if (i13 == 0) {
                    i13 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 == 1) {
                    i12 = width - i12;
                }
                int k10 = k(i12) - measuredWidth2;
                if (i14 == 1) {
                    k10 += measuredWidth2 / 2;
                } else if (i14 == 5) {
                    k10 += measuredWidth2;
                }
                if (i15 == 16) {
                    i11 = 0 + (measuredHeight2 / 2);
                } else if (i15 == 80) {
                    i11 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(k10, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            Rect a12 = a();
            a12.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
            if (this.C != null) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (x.d.b(this) && !x.d.b(view)) {
                    a12.left = this.C.d() + a12.left;
                    a12.top = this.C.f() + a12.top;
                    a12.right -= this.C.e();
                    a12.bottom -= this.C.c();
                }
            }
            Rect a13 = a();
            int i16 = fVar4.f1621c;
            if ((i16 & 7) == 0) {
                i16 |= 8388611;
            }
            if ((i16 & 112) == 0) {
                i16 |= 48;
            }
            Gravity.apply(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), a12, a13, i10);
            view.layout(a13.left, a13.top, a13.right, a13.bottom);
            a12.setEmpty();
            ? r13 = M;
            r13.a(a12);
            a13.setEmpty();
            r13.a(a13);
        }
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f1619a;
        if (cVar == null || !cVar.m(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f1613v) {
            v(false);
            this.f1613v = true;
        }
    }

    public final void s(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.F = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.E = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.E.setState(getDrawableState());
                }
                Drawable drawable4 = this.E;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                drawable4.setLayoutDirection(x.e.d(this));
                this.E.setVisible(getVisibility() == 0, false);
                this.E.setCallback(this);
            }
            WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
            x.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = d0.a.f4256a;
            drawable = a.b.b(context, i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.E;
        if (drawable != null && drawable.isVisible() != z10) {
            this.E.setVisible(z10, false);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.List<android.view.View>, java.util.ArrayList] */
    public final boolean t(MotionEvent motionEvent, int i10) {
        boolean z10;
        MotionEvent motionEvent2 = motionEvent;
        int i11 = i10;
        int actionMasked = motionEvent.getActionMasked();
        ? r42 = this.f1609c;
        r42.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            r42.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i12) : i12));
        }
        Comparator<View> comparator = L;
        if (comparator != null) {
            Collections.sort(r42, comparator);
        }
        int size = r42.size();
        MotionEvent motionEvent3 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) r42.get(i13);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1619a;
            if ((!z11 && !z12) || actionMasked == 0) {
                if (!z11 && cVar != null) {
                    if (i11 == 0) {
                        z11 = cVar.g(this, view, motionEvent2);
                    } else if (i11 == 1) {
                        z11 = cVar.r(this, view, motionEvent2);
                    }
                    if (z11) {
                        this.f1616y = view;
                    }
                }
                if (fVar.f1619a == null) {
                    fVar.f1629m = false;
                }
                boolean z13 = fVar.f1629m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    fVar.f1629m = z10;
                }
                z12 = z10 && !z13;
                if (z10 && !z12) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i11 == 0) {
                    cVar.g(this, view, motionEvent3);
                } else if (i11 == 1) {
                    cVar.r(this, view, motionEvent3);
                }
            }
        }
        r42.clear();
        return z11;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v8, types: [m0.c<java.util.ArrayList<T>>, m0.d] */
    /* JADX WARNING: type inference failed for: r5v26, types: [m0.c<java.util.ArrayList<T>>, m0.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r5 != false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r12 = this;
            java.util.List<android.view.View> r0 = r12.f1607a
            r0.clear()
            a0.a<android.view.View> r0 = r12.f1608b
            s.g<T, java.util.ArrayList<T>> r1 = r0.f13b
            int r1 = r1.f10843c
            r2 = 0
            r3 = r2
        L_0x000d:
            if (r3 >= r1) goto L_0x0024
            s.g<T, java.util.ArrayList<T>> r4 = r0.f13b
            java.lang.Object r4 = r4.m(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0021
            r4.clear()
            m0.c<java.util.ArrayList<T>> r5 = r0.f12a
            r5.a(r4)
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0024:
            s.g<T, java.util.ArrayList<T>> r0 = r0.f13b
            r0.clear()
            int r0 = r12.getChildCount()
            r1 = r2
        L_0x002e:
            if (r1 >= r0) goto L_0x019d
            android.view.View r3 = r12.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r12.l(r3)
            int r5 = r4.f1624f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0045
            r4.f1628l = r7
            r4.f1627k = r7
            goto L_0x00cb
        L_0x0045:
            android.view.View r5 = r4.f1627k
            if (r5 == 0) goto L_0x0076
            int r5 = r5.getId()
            int r6 = r4.f1624f
            if (r5 == r6) goto L_0x0052
            goto L_0x006f
        L_0x0052:
            android.view.View r5 = r4.f1627k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0058:
            if (r6 == r12) goto L_0x0071
            if (r6 == 0) goto L_0x006b
            if (r6 != r3) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x0066
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x0066:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0058
        L_0x006b:
            r4.f1628l = r7
            r4.f1627k = r7
        L_0x006f:
            r5 = r2
            goto L_0x0074
        L_0x0071:
            r4.f1628l = r5
            r5 = r8
        L_0x0074:
            if (r5 != 0) goto L_0x00cb
        L_0x0076:
            int r5 = r4.f1624f
            android.view.View r5 = r12.findViewById(r5)
            r4.f1627k = r5
            if (r5 == 0) goto L_0x00c1
            if (r5 != r12) goto L_0x0095
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x008d
            r4.f1628l = r7
            r4.f1627k = r7
            goto L_0x00cb
        L_0x008d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0095:
            android.view.ViewParent r6 = r5.getParent()
        L_0x0099:
            if (r6 == r12) goto L_0x00be
            if (r6 == 0) goto L_0x00be
            if (r6 != r3) goto L_0x00b2
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x00aa
            r4.f1628l = r7
            r4.f1627k = r7
            goto L_0x00cb
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00b2:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x00b9
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00b9:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0099
        L_0x00be:
            r4.f1628l = r5
            goto L_0x00cb
        L_0x00c1:
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x0178
            r4.f1628l = r7
            r4.f1627k = r7
        L_0x00cb:
            a0.a<android.view.View> r5 = r12.f1608b
            s.g<T, java.util.ArrayList<T>> r6 = r5.f13b
            boolean r6 = r6.containsKey(r3)
            if (r6 != 0) goto L_0x00da
            s.g<T, java.util.ArrayList<T>> r5 = r5.f13b
            r5.put(r3, r7)
        L_0x00da:
            r5 = r2
        L_0x00db:
            if (r5 >= r0) goto L_0x0174
            if (r5 != r1) goto L_0x00e1
            goto L_0x0170
        L_0x00e1:
            android.view.View r6 = r12.getChildAt(r5)
            android.view.View r9 = r4.f1628l
            if (r6 == r9) goto L_0x0118
            java.util.WeakHashMap<android.view.View, n0.a0> r9 = n0.x.f8842a
            int r9 = n0.x.e.d(r12)
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r10
            int r10 = r10.g
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r9)
            if (r10 == 0) goto L_0x0108
            int r11 = r4.f1625h
            int r9 = android.view.Gravity.getAbsoluteGravity(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x0108
            r9 = r8
            goto L_0x0109
        L_0x0108:
            r9 = r2
        L_0x0109:
            if (r9 != 0) goto L_0x0118
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r9 = r4.f1619a
            if (r9 == 0) goto L_0x0116
            boolean r9 = r9.b(r3, r6)
            if (r9 == 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r9 = r2
            goto L_0x0119
        L_0x0118:
            r9 = r8
        L_0x0119:
            if (r9 == 0) goto L_0x0170
            a0.a<android.view.View> r9 = r12.f1608b
            s.g<T, java.util.ArrayList<T>> r9 = r9.f13b
            boolean r9 = r9.containsKey(r6)
            if (r9 != 0) goto L_0x0134
            a0.a<android.view.View> r9 = r12.f1608b
            s.g<T, java.util.ArrayList<T>> r10 = r9.f13b
            boolean r10 = r10.containsKey(r6)
            if (r10 != 0) goto L_0x0134
            s.g<T, java.util.ArrayList<T>> r9 = r9.f13b
            r9.put(r6, r7)
        L_0x0134:
            a0.a<android.view.View> r9 = r12.f1608b
            s.g<T, java.util.ArrayList<T>> r10 = r9.f13b
            boolean r10 = r10.containsKey(r6)
            if (r10 == 0) goto L_0x0168
            s.g<T, java.util.ArrayList<T>> r10 = r9.f13b
            boolean r10 = r10.containsKey(r3)
            if (r10 == 0) goto L_0x0168
            s.g<T, java.util.ArrayList<T>> r10 = r9.f13b
            java.lang.Object r10 = r10.getOrDefault(r6, r7)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0164
            m0.c<java.util.ArrayList<T>> r10 = r9.f12a
            java.lang.Object r10 = r10.b()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x015f
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x015f:
            s.g<T, java.util.ArrayList<T>> r9 = r9.f13b
            r9.put(r6, r10)
        L_0x0164:
            r10.add(r3)
            goto L_0x0170
        L_0x0168:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0170:
            int r5 = r5 + 1
            goto L_0x00db
        L_0x0174:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0178:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = a.a.d(r1)
            android.content.res.Resources r2 = r12.getResources()
            int r4 = r4.f1624f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x019d:
            java.util.List<android.view.View> r0 = r12.f1607a
            a0.a<android.view.View> r1 = r12.f1608b
            java.util.ArrayList<T> r3 = r1.f14c
            r3.clear()
            java.util.HashSet<T> r3 = r1.f15d
            r3.clear()
            s.g<T, java.util.ArrayList<T>> r3 = r1.f13b
            int r3 = r3.f10843c
        L_0x01af:
            if (r2 >= r3) goto L_0x01c1
            s.g<T, java.util.ArrayList<T>> r4 = r1.f13b
            java.lang.Object r4 = r4.i(r2)
            java.util.ArrayList<T> r5 = r1.f14c
            java.util.HashSet<T> r6 = r1.f15d
            r1.a(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01af
        L_0x01c1:
            java.util.ArrayList<T> r1 = r1.f14c
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r12.f1607a
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f1619a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).f1629m = false;
        }
        this.f1616y = null;
        this.f1613v = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.E;
    }

    public final void w(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.i;
        if (i11 != i10) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            view.offsetLeftAndRight(i10 - i11);
            fVar.i = i10;
        }
    }

    public final void x(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1626j;
        if (i11 != i10) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            view.offsetTopAndBottom(i10 - i11);
            fVar.f1626j = i10;
        }
    }

    public final void y() {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.d.b(this)) {
            if (this.G == null) {
                this.G = new a();
            }
            x.i.u(this, this.G);
            setSystemUiVisibility(1280);
            return;
        }
        x.i.u(this, (n) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public static class h extends s0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<Parcelable> f1635c;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new h[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1635c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1635c.append(iArr[i], readParcelableArray[i]);
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            SparseArray<Parcelable> sparseArray = this.f1635c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = this.f1635c.keyAt(i10);
                parcelableArr[i10] = this.f1635c.valueAt(i10);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f1619a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1620b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f1621c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1622d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1623e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1624f = -1;
        public int g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1625h = 0;
        public int i;

        /* renamed from: j  reason: collision with root package name */
        public int f1626j;

        /* renamed from: k  reason: collision with root package name */
        public View f1627k;

        /* renamed from: l  reason: collision with root package name */
        public View f1628l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1629m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1630n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1631o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1632p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f1633q = new Rect();

        public f() {
            super(-2, -2);
        }

        public final boolean a(int i10) {
            if (i10 == 0) {
                return this.f1630n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f1631o;
        }

        public final void b(c cVar) {
            c cVar2 = this.f1619a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.f1619a = cVar;
                this.f1620b = true;
                if (cVar != null) {
                    cVar.c(this);
                }
            }
        }

        public final void c(int i10, boolean z) {
            if (i10 == 0) {
                this.f1630n = z;
            } else if (i10 == 1) {
                this.f1631o = z;
            }
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.f333r0);
            this.f1621c = obtainStyledAttributes.getInteger(0, 0);
            this.f1624f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1622d = obtainStyledAttributes.getInteger(2, 0);
            this.f1623e = obtainStyledAttributes.getInteger(6, -1);
            this.g = obtainStyledAttributes.getInt(5, 0);
            this.f1625h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1620b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.I;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.I;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.K;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.J);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e10) {
                        throw new RuntimeException(a8.a.c("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f1619a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f1619a;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
