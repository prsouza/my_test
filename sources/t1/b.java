package t1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import d0.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import net.jpountz.lz4.LZ4FrameOutputStream;

public final class b extends ViewGroup {
    public static final int[] J = {16842931};
    public static final Comparator<c> K = new a();
    public float A;
    public int B;
    public VelocityTracker C;
    public boolean D;
    public int E;
    public List<f> F;
    public f G;
    public List<e> H;
    public int I;

    /* renamed from: a  reason: collision with root package name */
    public Parcelable f11238a;

    /* renamed from: b  reason: collision with root package name */
    public int f11239b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f11240c;

    /* renamed from: s  reason: collision with root package name */
    public int f11241s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11242t;

    /* renamed from: u  reason: collision with root package name */
    public int f11243u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f11244v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11245w;

    /* renamed from: x  reason: collision with root package name */
    public int f11246x;

    /* renamed from: y  reason: collision with root package name */
    public float f11247y;
    public float z;

    public static class a implements Comparator<c> {
        public final int compare(Object obj, Object obj2) {
            Objects.requireNonNull((c) obj);
            Objects.requireNonNull((c) obj2);
            return 0;
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: t1.b$b  reason: collision with other inner class name */
    public @interface C0222b {
    }

    public static class c {
    }

    public static class d extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11248a;

        /* renamed from: b  reason: collision with root package name */
        public int f11249b;

        public d() {
            super(-1, -1);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.J);
            this.f11249b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public interface e {
        void a(b bVar);
    }

    public interface f {
        void a(int i);
    }

    public static class g extends s0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f11250c;

        /* renamed from: s  reason: collision with root package name */
        public Parcelable f11251s;

        /* renamed from: t  reason: collision with root package name */
        public ClassLoader f11252t;

        public static class a implements Parcelable.ClassLoaderCreator<g> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new g[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("FragmentPager.SavedState{");
            d10.append(Integer.toHexString(System.identityHashCode(this)));
            d10.append(" position=");
            return androidx.activity.result.d.c(d10, this.f11250c, "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeInt(this.f11250c);
            parcel.writeParcelable(this.f11251s, i);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? g.class.getClassLoader() : classLoader;
            this.f11250c = parcel.readInt();
            this.f11251s = parcel.readParcelable(classLoader);
            this.f11252t = classLoader;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f11242t != z10) {
            this.f11242t = z10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L_0x0008
            goto L_0x0061
        L_0x0008:
            if (r0 == 0) goto L_0x0062
            android.view.ViewParent r2 = r0.getParent()
        L_0x000e:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r5) goto L_0x0016
            r2 = 1
            goto L_0x001c
        L_0x0016:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x000e
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r2 != 0) goto L_0x0062
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0032:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x004b
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0032
        L_0x004b:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = a.a.d(r0)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
        L_0x0061:
            r0 = 0
        L_0x0062:
            android.view.FocusFinder r2 = android.view.FocusFinder.getInstance()
            android.view.View r2 = r2.findNextFocus(r5, r0, r6)
            r3 = 66
            r4 = 17
            if (r2 == 0) goto L_0x00a3
            if (r2 == r0) goto L_0x00a3
            if (r6 != r4) goto L_0x008b
            android.graphics.Rect r3 = r5.c(r2)
            int r3 = r3.left
            android.graphics.Rect r4 = r5.c(r0)
            int r4 = r4.left
            if (r0 == 0) goto L_0x0085
            if (r3 < r4) goto L_0x0085
            goto L_0x00a3
        L_0x0085:
            boolean r0 = r2.requestFocus()
        L_0x0089:
            r1 = r0
            goto L_0x00a3
        L_0x008b:
            if (r6 != r3) goto L_0x00a3
            android.graphics.Rect r3 = r5.c(r2)
            int r3 = r3.left
            android.graphics.Rect r4 = r5.c(r0)
            int r4 = r4.left
            if (r0 == 0) goto L_0x009e
            if (r3 > r4) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            boolean r0 = r2.requestFocus()
            goto L_0x0089
        L_0x00a3:
            if (r1 == 0) goto L_0x00ac
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x00ac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.a(int):boolean");
    }

    public final void addFocusables(ArrayList<View> arrayList, int i, int i10) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (getChildAt(i11).getVisibility() != 0) {
                    i11++;
                } else {
                    throw null;
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i10 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList<View> arrayList) {
        int i = 0;
        while (i < getChildCount()) {
            if (getChildAt(i).getVisibility() != 0) {
                i++;
            } else {
                throw null;
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new d();
        }
        d dVar = (d) layoutParams;
        boolean z10 = dVar.f11248a;
        boolean z11 = true;
        if (view.getClass().getAnnotation(C0222b.class) == null) {
            z11 = false;
        }
        dVar.f11248a = z10 | z11;
        super.addView(view, i, layoutParams);
    }

    public final boolean b(View view, boolean z10, int i, int i10, int i11) {
        int i12;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom()) {
                    if (b(childAt, true, i, i13 - childAt.getLeft(), i12 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z10 || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public final Rect c(View view) {
        Rect rect = new Rect();
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        throw null;
    }

    public final void d(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.B) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f11247y = motionEvent.getX(i);
            this.B = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.C;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0059
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x0056
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0044
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x0056
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.a(r4)
            goto L_0x0057
        L_0x002b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L_0x0056
            boolean r6 = r5.a(r2)
            goto L_0x0057
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x003d
            goto L_0x0056
        L_0x003d:
            r6 = 66
            boolean r6 = r5.a(r6)
            goto L_0x0057
        L_0x0044:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x004f
            boolean r6 = r5.e()
            goto L_0x0057
        L_0x004f:
            r6 = 17
            boolean r6 = r5.a(r6)
            goto L_0x0057
        L_0x0056:
            r6 = r1
        L_0x0057:
            if (r6 == 0) goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            if (getChildAt(i).getVisibility() != 0) {
                i++;
            } else {
                throw null;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (getOverScrollMode() != 0) {
            throw null;
        }
        throw null;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11240c;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final boolean g() {
        this.B = -1;
        this.f11244v = false;
        this.f11245w = false;
        VelocityTracker velocityTracker = this.C;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.C = null;
        }
        throw null;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d();
    }

    public a getAdapter() {
        return null;
    }

    public final int getChildDrawingOrder(int i, int i10) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.f11243u;
    }

    public int getPageMargin() {
        return this.f11239b;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D = true;
    }

    public final void onDetachedFromWindow() {
        removeCallbacks((Runnable) null);
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11239b > 0 && this.f11240c != null) {
            throw null;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            throw null;
        }
        if (action != 0) {
            if (this.f11244v) {
                return true;
            }
            if (this.f11245w) {
                return false;
            }
        }
        if (action != 0) {
            if (action == 2) {
                int i = this.B;
                if (i != -1) {
                    int findPointerIndex = motionEvent2.findPointerIndex(i);
                    float x10 = motionEvent2.getX(findPointerIndex);
                    float f10 = x10 - this.f11247y;
                    float abs = Math.abs(f10);
                    float y10 = motionEvent2.getY(findPointerIndex);
                    float abs2 = Math.abs(y10 - this.A);
                    int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i10 != 0) {
                        float f11 = this.f11247y;
                        if (!((f11 < ((float) this.f11246x) && i10 > 0) || (f11 > ((float) (getWidth() - this.f11246x)) && f10 < 0.0f))) {
                            if (b(this, false, (int) f10, (int) x10, (int) y10)) {
                                this.f11247y = x10;
                                this.f11245w = true;
                                return false;
                            }
                        }
                    }
                    float f12 = (float) 0;
                    if (abs > f12 && abs * 0.5f > abs2) {
                        this.f11244v = true;
                        f();
                        setScrollState(1);
                        float f13 = this.z;
                        this.f11247y = i10 > 0 ? f13 + f12 : f13 - f12;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > f12) {
                        this.f11245w = true;
                    }
                    if (this.f11244v) {
                        this.f11247y = x10;
                        getScrollX();
                        getClientWidth();
                        throw null;
                    }
                }
            } else if (action == 6) {
                d(motionEvent);
            }
            if (this.C == null) {
                this.C = VelocityTracker.obtain();
            }
            this.C.addMovement(motionEvent2);
            return this.f11244v;
        }
        float x11 = motionEvent.getX();
        this.z = x11;
        this.f11247y = x11;
        this.A = motionEvent.getY();
        this.B = motionEvent2.getPointerId(0);
        this.f11245w = false;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            t1.b$d r12 = (t1.b.d) r12
            boolean r14 = r12.f11248a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f11249b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            r3 = 0
            if (r2 >= r1) goto L_0x00d3
            android.view.View r4 = r0.getChildAt(r2)
            int r5 = r4.getVisibility()
            if (r5 == r12) goto L_0x00d0
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            t1.b$d r4 = (t1.b.d) r4
            boolean r4 = r4.f11248a
            if (r4 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            throw r3
        L_0x00d0:
            int r2 = r2 + 1
            goto L_0x00b7
        L_0x00d3:
            r0.E = r11
            boolean r1 = r0.D
            if (r1 != 0) goto L_0x00dd
            r1 = 0
            r0.D = r1
            return
        L_0x00dd:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i10) {
        d dVar;
        d dVar2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.f11246x = Math.min(measuredWidth / 10, 0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (!(childAt.getVisibility() == 8 || (dVar2 = (d) childAt.getLayoutParams()) == null || !dVar2.f11248a)) {
                int i14 = dVar2.f11249b;
                int i15 = i14 & 7;
                int i16 = i14 & 112;
                boolean z10 = true;
                boolean z11 = i16 == 48 || i16 == 80;
                if (!(i15 == 3 || i15 == 5)) {
                    z10 = false;
                }
                int i17 = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                if (z11) {
                    i11 = 1073741824;
                } else {
                    i11 = Integer.MIN_VALUE;
                    if (z10) {
                        i17 = 1073741824;
                    }
                }
                int i18 = dVar2.width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = dVar2.height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i17;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i11), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f11241s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.f11248a)) {
                Objects.requireNonNull(dVar);
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * 0.0f), 1073741824), this.f11241s);
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i10;
        int i11;
        int childCount = getChildCount();
        int i12 = -1;
        if ((i & 2) != 0) {
            i11 = 1;
            i12 = childCount;
            i10 = 0;
        } else {
            i10 = childCount - 1;
            i11 = -1;
        }
        while (i10 != i12) {
            if (getChildAt(i10).getVisibility() != 0) {
                i10 += i11;
            } else {
                throw null;
            }
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f10849a);
        this.f11238a = gVar.f11251s;
    }

    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f11250c = 0;
        return gVar;
    }

    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        if (i == i11) {
            return;
        }
        if (i11 > 0) {
            throw null;
        }
        throw null;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    public final void removeView(View view) {
        super.removeView(view);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<t1.b$e>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List<t1.b$e>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<t1.b$e>, java.util.ArrayList] */
    public void setAdapter(a aVar) {
        ? r32 = this.H;
        if (r32 != 0 && !r32.isEmpty()) {
            int size = this.H.size();
            for (int i = 0; i < size; i++) {
                ((e) this.H.get(i)).a(this);
            }
        }
    }

    public void setCurrentItem(int i) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f11243u) {
            this.f11243u = i;
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.G = fVar;
    }

    public void setPageMargin(int i) {
        this.f11239b = i;
        if (getWidth() > 0) {
            throw null;
        }
        throw null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f11240c = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<t1.b$f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<t1.b$f>, java.util.ArrayList] */
    public void setScrollState(int i) {
        if (this.I != i) {
            this.I = i;
            f fVar = this.G;
            if (fVar != null) {
                fVar.a(i);
            }
            ? r02 = this.F;
            if (r02 != 0) {
                int size = r02.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f fVar2 = (f) this.F.get(i10);
                    if (fVar2 != null) {
                        fVar2.a(i);
                    }
                }
            }
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11240c;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i) {
        Context context = getContext();
        Object obj = d0.a.f4256a;
        setPageMarginDrawable(a.b.b(context, i));
    }
}
