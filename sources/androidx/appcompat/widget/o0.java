package androidx.appcompat.widget;

import a.b;
import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import n0.x;

public class o0 extends ViewGroup {
    public int A;
    public int B;
    public int C;
    public int D;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1352a;

    /* renamed from: b  reason: collision with root package name */
    public int f1353b;

    /* renamed from: c  reason: collision with root package name */
    public int f1354c;

    /* renamed from: s  reason: collision with root package name */
    public int f1355s;

    /* renamed from: t  reason: collision with root package name */
    public int f1356t;

    /* renamed from: u  reason: collision with root package name */
    public int f1357u;

    /* renamed from: v  reason: collision with root package name */
    public float f1358v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1359w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f1360x;

    /* renamed from: y  reason: collision with root package name */
    public int[] f1361y;
    public Drawable z;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i, int i10) {
            super(i, i10);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public o0(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void f(Canvas canvas, int i) {
        this.z.setBounds(getPaddingLeft() + this.D, i, (getWidth() - getPaddingRight()) - this.D, this.B + i);
        this.z.draw(canvas);
    }

    public final void g(Canvas canvas, int i) {
        this.z.setBounds(i, getPaddingTop() + this.D, this.A + i, (getHeight() - getPaddingBottom()) - this.D);
        this.z.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.f1353b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f1353b;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i11 = this.f1354c;
                if (this.f1355s == 1 && (i = this.f1356t & 112) != 48) {
                    if (i == 16) {
                        i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1357u) / 2;
                    } else if (i == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1357u;
                    }
                }
                return i11 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1353b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1353b;
    }

    public Drawable getDividerDrawable() {
        return this.z;
    }

    public int getDividerPadding() {
        return this.D;
    }

    public int getDividerWidth() {
        return this.A;
    }

    public int getGravity() {
        return this.f1356t;
    }

    public int getOrientation() {
        return this.f1355s;
    }

    public int getShowDividers() {
        return this.C;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1358v;
    }

    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i = this.f1355s;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean k(int i) {
        if (i == 0) {
            return (this.C & 1) != 0;
        }
        if (i == getChildCount()) {
            if ((this.C & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.C & 2) == 0) {
            return false;
        } else {
            for (int i10 = i - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.z != null) {
            int i14 = 0;
            if (this.f1355s == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i14 < virtualChildCount) {
                    View childAt = getChildAt(i14);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !k(i14))) {
                        f(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.B);
                    }
                    i14++;
                }
                if (k(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i13 = (getHeight() - getPaddingBottom()) - this.B;
                    } else {
                        i13 = childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin;
                    }
                    f(canvas, i13);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean b10 = k1.b(this);
            while (i14 < virtualChildCount2) {
                View childAt3 = getChildAt(i14);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !k(i14))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    if (b10) {
                        i12 = childAt3.getRight() + aVar.rightMargin;
                    } else {
                        i12 = (childAt3.getLeft() - aVar.leftMargin) - this.A;
                    }
                    g(canvas, i12);
                }
                i14++;
            }
            if (k(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (b10) {
                        i11 = childAt4.getLeft() - aVar2.leftMargin;
                        i10 = this.A;
                    } else {
                        i = childAt4.getRight() + aVar2.rightMargin;
                        g(canvas, i);
                    }
                } else if (b10) {
                    i = getPaddingLeft();
                    g(canvas, i);
                } else {
                    i11 = getWidth() - getPaddingRight();
                    i10 = this.A;
                }
                i = i11 - i10;
                g(canvas, i);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f1355s
            r2 = 8
            r3 = 5
            r4 = 16
            r5 = 80
            r6 = 1
            r7 = 8388615(0x800007, float:1.1754953E-38)
            if (r1 != r6) goto L_0x00b9
            int r1 = r17.getPaddingLeft()
            int r8 = r21 - r19
            int r9 = r17.getPaddingRight()
            int r9 = r8 - r9
            int r8 = r8 - r1
            int r10 = r17.getPaddingRight()
            int r8 = r8 - r10
            int r10 = r17.getVirtualChildCount()
            int r11 = r0.f1356t
            r12 = r11 & 112(0x70, float:1.57E-43)
            r7 = r7 & r11
            if (r12 == r4) goto L_0x0041
            if (r12 == r5) goto L_0x0035
            int r4 = r17.getPaddingTop()
            goto L_0x004d
        L_0x0035:
            int r4 = r17.getPaddingTop()
            int r4 = r4 + r22
            int r4 = r4 - r20
            int r5 = r0.f1357u
            int r4 = r4 - r5
            goto L_0x004d
        L_0x0041:
            int r4 = r17.getPaddingTop()
            int r5 = r22 - r20
            int r11 = r0.f1357u
            int r5 = r5 - r11
            int r5 = r5 / 2
            int r4 = r4 + r5
        L_0x004d:
            r5 = 0
        L_0x004e:
            if (r5 >= r10) goto L_0x01ce
            android.view.View r11 = r0.getChildAt(r5)
            if (r11 != 0) goto L_0x0059
            int r4 = r4 + 0
            goto L_0x00b4
        L_0x0059:
            int r12 = r11.getVisibility()
            if (r12 == r2) goto L_0x00b4
            int r2 = r11.getMeasuredWidth()
            int r12 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            androidx.appcompat.widget.o0$a r13 = (androidx.appcompat.widget.o0.a) r13
            int r14 = r13.gravity
            if (r14 >= 0) goto L_0x0072
            r14 = r7
        L_0x0072:
            java.util.WeakHashMap<android.view.View, n0.a0> r15 = n0.x.f8842a
            int r15 = n0.x.e.d(r17)
            int r14 = android.view.Gravity.getAbsoluteGravity(r14, r15)
            r14 = r14 & 7
            if (r14 == r6) goto L_0x008b
            if (r14 == r3) goto L_0x0086
            int r3 = r13.leftMargin
            int r3 = r3 + r1
            goto L_0x0096
        L_0x0086:
            int r3 = r9 - r2
            int r14 = r13.rightMargin
            goto L_0x0095
        L_0x008b:
            int r3 = r8 - r2
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r14 = r13.leftMargin
            int r3 = r3 + r14
            int r14 = r13.rightMargin
        L_0x0095:
            int r3 = r3 - r14
        L_0x0096:
            boolean r14 = r0.k(r5)
            if (r14 == 0) goto L_0x009f
            int r14 = r0.B
            int r4 = r4 + r14
        L_0x009f:
            int r14 = r13.topMargin
            int r4 = r4 + r14
            int r14 = r4 + 0
            int r2 = r2 + r3
            int r15 = r12 + r14
            r11.layout(r3, r14, r2, r15)
            int r2 = r13.bottomMargin
            r3 = 0
            int r2 = androidx.appcompat.widget.d.a(r12, r2, r3, r4)
            int r5 = r5 + 0
            r4 = r2
        L_0x00b4:
            int r5 = r5 + r6
            r2 = 8
            r3 = 5
            goto L_0x004e
        L_0x00b9:
            boolean r1 = androidx.appcompat.widget.k1.b(r17)
            int r2 = r17.getPaddingTop()
            int r3 = r22 - r20
            int r4 = r17.getPaddingBottom()
            int r4 = r3 - r4
            int r3 = r3 - r2
            int r5 = r17.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r17.getVirtualChildCount()
            int r8 = r0.f1356t
            r7 = r7 & r8
            r8 = r8 & 112(0x70, float:1.57E-43)
            boolean r9 = r0.f1352a
            int[] r10 = r0.f1360x
            int[] r11 = r0.f1361y
            java.util.WeakHashMap<android.view.View, n0.a0> r12 = n0.x.f8842a
            int r12 = n0.x.e.d(r17)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r12)
            if (r7 == r6) goto L_0x00fe
            r12 = 5
            if (r7 == r12) goto L_0x00f2
            int r7 = r17.getPaddingLeft()
            goto L_0x010a
        L_0x00f2:
            int r7 = r17.getPaddingLeft()
            int r7 = r7 + r21
            int r7 = r7 - r19
            int r12 = r0.f1357u
            int r7 = r7 - r12
            goto L_0x010a
        L_0x00fe:
            int r7 = r17.getPaddingLeft()
            int r12 = r21 - r19
            int r13 = r0.f1357u
            int r12 = r12 - r13
            int r12 = r12 / 2
            int r7 = r7 + r12
        L_0x010a:
            if (r1 == 0) goto L_0x0110
            int r1 = r5 + -1
            r6 = -1
            goto L_0x0111
        L_0x0110:
            r1 = 0
        L_0x0111:
            r12 = 0
        L_0x0112:
            if (r12 >= r5) goto L_0x01ce
            int r13 = r6 * r12
            int r13 = r13 + r1
            android.view.View r14 = r0.getChildAt(r13)
            if (r14 != 0) goto L_0x0123
            int r7 = r7 + 0
            r18 = r1
            goto L_0x01b8
        L_0x0123:
            int r15 = r14.getVisibility()
            r18 = r1
            r1 = 8
            if (r15 == r1) goto L_0x01b8
            int r1 = r14.getMeasuredWidth()
            int r15 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r14.getLayoutParams()
            r20 = r5
            r5 = r16
            androidx.appcompat.widget.o0$a r5 = (androidx.appcompat.widget.o0.a) r5
            if (r9 == 0) goto L_0x014f
            r19 = r6
            int r6 = r5.height
            r22 = r8
            r8 = -1
            if (r6 == r8) goto L_0x0153
            int r6 = r14.getBaseline()
            goto L_0x0154
        L_0x014f:
            r19 = r6
            r22 = r8
        L_0x0153:
            r6 = -1
        L_0x0154:
            int r8 = r5.gravity
            if (r8 >= 0) goto L_0x015a
            r8 = r22
        L_0x015a:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r16 = r9
            r9 = 16
            if (r8 == r9) goto L_0x018d
            r9 = 48
            if (r8 == r9) goto L_0x017f
            r9 = 80
            if (r8 == r9) goto L_0x016c
            r8 = r2
            goto L_0x0199
        L_0x016c:
            int r8 = r4 - r15
            int r9 = r5.bottomMargin
            int r8 = r8 - r9
            r9 = -1
            if (r6 == r9) goto L_0x0199
            int r9 = r14.getMeasuredHeight()
            int r9 = r9 - r6
            r6 = 2
            r6 = r11[r6]
            int r6 = r6 - r9
            int r8 = r8 - r6
            goto L_0x0199
        L_0x017f:
            r8 = -1
            int r9 = r5.topMargin
            int r9 = r9 + r2
            if (r6 == r8) goto L_0x018b
            r8 = 1
            r8 = r10[r8]
            int r8 = r8 - r6
            int r8 = r8 + r9
            goto L_0x0199
        L_0x018b:
            r8 = r9
            goto L_0x0199
        L_0x018d:
            int r6 = r3 - r15
            int r6 = r6 / 2
            int r6 = r6 + r2
            int r8 = r5.topMargin
            int r6 = r6 + r8
            int r8 = r5.bottomMargin
            int r8 = r6 - r8
        L_0x0199:
            boolean r6 = r0.k(r13)
            if (r6 == 0) goto L_0x01a2
            int r6 = r0.A
            int r7 = r7 + r6
        L_0x01a2:
            int r6 = r5.leftMargin
            int r7 = r7 + r6
            int r6 = r7 + 0
            int r9 = r1 + r6
            int r15 = r15 + r8
            r14.layout(r6, r8, r9, r15)
            int r5 = r5.rightMargin
            r6 = 0
            int r1 = androidx.appcompat.widget.d.a(r1, r5, r6, r7)
            int r12 = r12 + 0
            r7 = r1
            goto L_0x01c0
        L_0x01b8:
            r20 = r5
            r19 = r6
            r22 = r8
            r16 = r9
        L_0x01c0:
            int r12 = r12 + 1
            r1 = r18
            r6 = r19
            r5 = r20
            r8 = r22
            r9 = r16
            goto L_0x0112
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x068c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06e0  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0703  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x07f4  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x084b  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0857  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x08b4  */
    /* JADX WARNING: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r35, int r36) {
        /*
            r34 = this;
            r6 = r34
            r7 = r35
            r8 = r36
            int r0 = r6.f1355s
            r1 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            r10 = 0
            if (r0 != r9) goto L_0x03a3
            r6.f1357u = r10
            int r11 = r34.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r35)
            int r13 = android.view.View.MeasureSpec.getMode(r36)
            int r14 = r6.f1353b
            boolean r15 = r6.f1359w
            r0 = r4
            r16 = r9
            r7 = r10
            r8 = r7
            r17 = r8
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r9 = r2
            r2 = r16
        L_0x003a:
            if (r7 >= r11) goto L_0x016b
            android.view.View r23 = r6.getChildAt(r7)
            if (r23 != 0) goto L_0x0049
            int r0 = r6.f1357u
            int r0 = r0 + r20
            r6.f1357u = r0
            goto L_0x0051
        L_0x0049:
            int r2 = r23.getVisibility()
            if (r2 != r3) goto L_0x0059
            int r7 = r7 + 0
        L_0x0051:
            r0 = 1
            r2 = r0
            r27 = r11
            r26 = r13
            goto L_0x0159
        L_0x0059:
            boolean r2 = r6.k(r7)
            if (r2 == 0) goto L_0x0066
            int r2 = r6.f1357u
            int r3 = r6.B
            int r2 = r2 + r3
            r6.f1357u = r2
        L_0x0066:
            android.view.ViewGroup$LayoutParams r2 = r23.getLayoutParams()
            r3 = r2
            androidx.appcompat.widget.o0$a r3 = (androidx.appcompat.widget.o0.a) r3
            float r2 = r3.weight
            float r20 = r4 + r2
            if (r13 != r5) goto L_0x0092
            int r4 = r3.height
            if (r4 != 0) goto L_0x0092
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0092
            int r0 = r6.f1357u
            int r1 = r3.topMargin
            int r1 = r1 + r0
            int r2 = r3.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.f1357u = r0
            r21 = 1
            r0 = 1
            r27 = r11
            r26 = r13
            r13 = r3
            goto L_0x00e3
        L_0x0092:
            int r4 = r3.height
            if (r4 != 0) goto L_0x009f
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x009f
            r3.height = r1
            r1 = 0
            r5 = r1
            goto L_0x00a0
        L_0x009f:
            r5 = r9
        L_0x00a0:
            r4 = 0
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00a8
            int r0 = r6.f1357u
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            r24 = r0
            r25 = 1
            r0 = r34
            r1 = r23
            r2 = r35
            r26 = r13
            r13 = r3
            r3 = r4
            r4 = r36
            r27 = r11
            r11 = r5
            r5 = r24
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r11 == r9) goto L_0x00c5
            r13.height = r11
        L_0x00c5:
            int r0 = r23.getMeasuredHeight()
            int r1 = r6.f1357u
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 + 0
            int r1 = java.lang.Math.max(r1, r2)
            r6.f1357u = r1
            if (r15 == 0) goto L_0x00e1
            int r10 = java.lang.Math.max(r0, r10)
        L_0x00e1:
            r0 = r25
        L_0x00e3:
            if (r14 < 0) goto L_0x00ed
            int r1 = r7 + 1
            if (r14 != r1) goto L_0x00ed
            int r1 = r6.f1357u
            r6.f1354c = r1
        L_0x00ed:
            if (r7 >= r14) goto L_0x00ff
            float r1 = r13.weight
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00f7
            goto L_0x00ff
        L_0x00f7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x00ff:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x010c
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x010c
            r1 = r0
            r22 = r1
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r23.getMeasuredWidth()
            int r3 = r3 + r2
            int r4 = java.lang.Math.max(r8, r3)
            int r5 = r23.getMeasuredState()
            r9 = r19
            int r5 = android.view.View.combineMeasuredStates(r9, r5)
            if (r16 == 0) goto L_0x012e
            int r8 = r13.width
            r9 = -1
            if (r8 != r9) goto L_0x012e
            r8 = r0
            goto L_0x012f
        L_0x012e:
            r8 = 0
        L_0x012f:
            float r9 = r13.weight
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x0141
            if (r1 == 0) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r2 = r3
        L_0x013a:
            r11 = r18
            int r18 = java.lang.Math.max(r11, r2)
            goto L_0x014f
        L_0x0141:
            r11 = r18
            if (r1 == 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r2 = r3
        L_0x0147:
            r1 = r17
            int r17 = java.lang.Math.max(r1, r2)
            r18 = r11
        L_0x014f:
            int r7 = r7 + 0
            r2 = r0
            r19 = r5
            r16 = r8
            r8 = r4
            r4 = r20
        L_0x0159:
            int r7 = r7 + 1
            r20 = 0
            r1 = -2
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r0 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r13 = r26
            r11 = r27
            goto L_0x003a
        L_0x016b:
            r27 = r11
            r26 = r13
            r1 = r17
            r11 = r18
            r9 = r19
            int r0 = r6.f1357u
            r7 = r27
            if (r0 <= 0) goto L_0x0188
            boolean r0 = r6.k(r7)
            if (r0 == 0) goto L_0x0188
            int r0 = r6.f1357u
            int r3 = r6.B
            int r0 = r0 + r3
            r6.f1357u = r0
        L_0x0188:
            if (r15 == 0) goto L_0x01d1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r26
            if (r3 == r0) goto L_0x0192
            if (r3 != 0) goto L_0x01d3
        L_0x0192:
            r0 = 0
            r6.f1357u = r0
            r5 = r0
        L_0x0196:
            if (r0 >= r7) goto L_0x01d3
            android.view.View r13 = r6.getChildAt(r0)
            if (r13 != 0) goto L_0x01a6
            int r13 = r6.f1357u
            int r13 = r13 + r5
            r6.f1357u = r13
            r17 = r0
            goto L_0x01cb
        L_0x01a6:
            int r5 = r13.getVisibility()
            r14 = 8
            if (r5 != r14) goto L_0x01b1
            int r0 = r0 + 0
            goto L_0x01cd
        L_0x01b1:
            android.view.ViewGroup$LayoutParams r5 = r13.getLayoutParams()
            androidx.appcompat.widget.o0$a r5 = (androidx.appcompat.widget.o0.a) r5
            int r13 = r6.f1357u
            int r14 = r13 + r10
            r17 = r0
            int r0 = r5.topMargin
            int r14 = r14 + r0
            int r0 = r5.bottomMargin
            int r14 = r14 + r0
            int r14 = r14 + 0
            int r0 = java.lang.Math.max(r13, r14)
            r6.f1357u = r0
        L_0x01cb:
            r0 = r17
        L_0x01cd:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x0196
        L_0x01d1:
            r3 = r26
        L_0x01d3:
            int r0 = r6.f1357u
            int r5 = r34.getPaddingTop()
            int r13 = r34.getPaddingBottom()
            int r13 = r13 + r5
            int r13 = r13 + r0
            r6.f1357u = r13
            int r0 = r34.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r13, r0)
            r5 = 0
            r13 = r36
            int r0 = android.view.View.resolveSizeAndState(r0, r13, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r0
            int r14 = r6.f1357u
            int r5 = r5 - r14
            if (r21 != 0) goto L_0x0244
            if (r5 == 0) goto L_0x0201
            r14 = 0
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0201
            goto L_0x0244
        L_0x0201:
            int r1 = java.lang.Math.max(r1, r11)
            if (r15 == 0) goto L_0x023e
            r2 = 1073741824(0x40000000, float:2.0)
            if (r3 == r2) goto L_0x023e
            r2 = 0
        L_0x020c:
            if (r2 >= r7) goto L_0x023e
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L_0x023b
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x021d
            goto L_0x023b
        L_0x021d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.o0$a r4 = (androidx.appcompat.widget.o0.a) r4
            float r4 = r4.weight
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x023b
            int r4 = r3.getMeasuredWidth()
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5)
            r3.measure(r4, r5)
        L_0x023b:
            int r2 = r2 + 1
            goto L_0x020c
        L_0x023e:
            r5 = r35
        L_0x0240:
            r10 = r16
            goto L_0x0343
        L_0x0244:
            float r10 = r6.f1358v
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x024c
            r4 = r10
        L_0x024c:
            r10 = 0
            r6.f1357u = r10
        L_0x024f:
            if (r10 >= r7) goto L_0x0331
            android.view.View r11 = r6.getChildAt(r10)
            int r14 = r11.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0267
            r17 = r2
            r26 = r3
            r18 = r5
            r5 = r35
            goto L_0x0327
        L_0x0267:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            androidx.appcompat.widget.o0$a r14 = (androidx.appcompat.widget.o0.a) r14
            float r15 = r14.weight
            r17 = 0
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 <= 0) goto L_0x02d4
            r17 = r2
            float r2 = (float) r5
            float r2 = r2 * r15
            float r2 = r2 / r4
            int r2 = (int) r2
            float r4 = r4 - r15
            int r5 = r5 - r2
            int r15 = r34.getPaddingLeft()
            int r18 = r34.getPaddingRight()
            int r18 = r18 + r15
            int r15 = r14.leftMargin
            int r18 = r18 + r15
            int r15 = r14.rightMargin
            int r15 = r18 + r15
            r18 = r4
            int r4 = r14.width
            r19 = r5
            r5 = r35
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r5, r15, r4)
            int r15 = r14.height
            if (r15 != 0) goto L_0x02b0
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 == r15) goto L_0x02a4
            goto L_0x02b2
        L_0x02a4:
            if (r2 <= 0) goto L_0x02a7
            goto L_0x02a8
        L_0x02a7:
            r2 = 0
        L_0x02a8:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11.measure(r4, r2)
            goto L_0x02c5
        L_0x02b0:
            r15 = 1073741824(0x40000000, float:2.0)
        L_0x02b2:
            int r20 = r11.getMeasuredHeight()
            int r20 = r20 + r2
            if (r20 >= 0) goto L_0x02bc
            r20 = 0
        L_0x02bc:
            r2 = r20
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11.measure(r4, r2)
        L_0x02c5:
            int r2 = r11.getMeasuredState()
            r2 = r2 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r4 = r18
            r2 = r19
            goto L_0x02d9
        L_0x02d4:
            r17 = r2
            r2 = r5
            r5 = r35
        L_0x02d9:
            int r15 = r14.leftMargin
            r18 = r2
            int r2 = r14.rightMargin
            int r15 = r15 + r2
            int r2 = r11.getMeasuredWidth()
            int r2 = r2 + r15
            int r8 = java.lang.Math.max(r8, r2)
            r19 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x02f9
            int r2 = r14.width
            r26 = r3
            r3 = -1
            if (r2 != r3) goto L_0x02fc
            r2 = r17
            goto L_0x02fd
        L_0x02f9:
            r26 = r3
            r3 = -1
        L_0x02fc:
            r2 = 0
        L_0x02fd:
            if (r2 == 0) goto L_0x0300
            goto L_0x0302
        L_0x0300:
            r15 = r19
        L_0x0302:
            int r1 = java.lang.Math.max(r1, r15)
            if (r16 == 0) goto L_0x030f
            int r2 = r14.width
            if (r2 != r3) goto L_0x030f
            r2 = r17
            goto L_0x0310
        L_0x030f:
            r2 = 0
        L_0x0310:
            int r3 = r6.f1357u
            int r11 = r11.getMeasuredHeight()
            int r11 = r11 + r3
            int r15 = r14.topMargin
            int r11 = r11 + r15
            int r14 = r14.bottomMargin
            int r11 = r11 + r14
            int r11 = r11 + 0
            int r3 = java.lang.Math.max(r3, r11)
            r6.f1357u = r3
            r16 = r2
        L_0x0327:
            int r10 = r10 + 1
            r2 = r17
            r5 = r18
            r3 = r26
            goto L_0x024f
        L_0x0331:
            r5 = r35
            int r2 = r6.f1357u
            int r3 = r34.getPaddingTop()
            int r4 = r34.getPaddingBottom()
            int r4 = r4 + r3
            int r4 = r4 + r2
            r6.f1357u = r4
            goto L_0x0240
        L_0x0343:
            if (r10 != 0) goto L_0x034a
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x034a
            goto L_0x034b
        L_0x034a:
            r1 = r8
        L_0x034b:
            int r2 = r34.getPaddingLeft()
            int r3 = r34.getPaddingRight()
            int r3 = r3 + r2
            int r3 = r3 + r1
            int r1 = r34.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = android.view.View.resolveSizeAndState(r1, r5, r9)
            r6.setMeasuredDimension(r1, r0)
            if (r22 == 0) goto L_0x08f0
            int r0 = r34.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
            r9 = r0
        L_0x0372:
            if (r9 >= r7) goto L_0x08f0
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x03a0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            androidx.appcompat.widget.o0$a r10 = (androidx.appcompat.widget.o0.a) r10
            int r0 = r10.width
            r2 = -1
            if (r0 != r2) goto L_0x03a0
            int r11 = r10.height
            int r0 = r1.getMeasuredHeight()
            r10.height = r0
            r3 = 0
            r5 = 0
            r0 = r34
            r2 = r8
            r4 = r36
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.height = r11
        L_0x03a0:
            int r9 = r9 + 1
            goto L_0x0372
        L_0x03a3:
            r5 = r7
            r13 = r8
            r6.f1357u = r10
            int r7 = r34.getVirtualChildCount()
            int r8 = android.view.View.MeasureSpec.getMode(r35)
            int r10 = android.view.View.MeasureSpec.getMode(r36)
            int[] r0 = r6.f1360x
            r1 = 4
            if (r0 == 0) goto L_0x03bc
            int[] r0 = r6.f1361y
            if (r0 != 0) goto L_0x03c4
        L_0x03bc:
            int[] r0 = new int[r1]
            r6.f1360x = r0
            int[] r0 = new int[r1]
            r6.f1361y = r0
        L_0x03c4:
            int[] r11 = r6.f1360x
            int[] r12 = r6.f1361y
            r0 = 3
            r1 = -1
            r11[r0] = r1
            r14 = 2
            r11[r14] = r1
            r11[r9] = r1
            r2 = 0
            r11[r2] = r1
            r12[r0] = r1
            r12[r14] = r1
            r12[r9] = r1
            r12[r2] = r1
            boolean r15 = r6.f1352a
            boolean r4 = r6.f1359w
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 != r0) goto L_0x03e7
            r16 = r9
            goto L_0x03ea
        L_0x03e7:
            r0 = 0
            r16 = r0
        L_0x03ea:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r14 = r17
            r28 = r19
            r19 = r9
            r9 = r18
            r33 = r3
            r3 = r0
            r0 = r33
        L_0x0405:
            if (r0 >= r7) goto L_0x05a4
            android.view.View r5 = r6.getChildAt(r0)
            if (r5 != 0) goto L_0x0418
            int r5 = r6.f1357u
            int r5 = r5 + 0
            r6.f1357u = r5
            r22 = r2
            r23 = r3
            goto L_0x0426
        L_0x0418:
            r22 = r2
            int r2 = r5.getVisibility()
            r23 = r3
            r3 = 8
            if (r2 != r3) goto L_0x0430
            int r0 = r0 + 0
        L_0x0426:
            r13 = r35
            r2 = r22
            r3 = r23
            r22 = r4
            goto L_0x059b
        L_0x0430:
            boolean r2 = r6.k(r0)
            if (r2 == 0) goto L_0x043d
            int r2 = r6.f1357u
            int r3 = r6.A
            int r2 = r2 + r3
            r6.f1357u = r2
        L_0x043d:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            r3 = r2
            androidx.appcompat.widget.o0$a r3 = (androidx.appcompat.widget.o0.a) r3
            float r2 = r3.weight
            float r24 = r1 + r2
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 != r1) goto L_0x049c
            int r1 = r3.width
            if (r1 != 0) goto L_0x049c
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x049c
            if (r16 == 0) goto L_0x0464
            int r1 = r6.f1357u
            int r2 = r3.leftMargin
            r25 = r0
            int r0 = r3.rightMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            r6.f1357u = r2
            goto L_0x0474
        L_0x0464:
            r25 = r0
            int r0 = r6.f1357u
            int r1 = r3.leftMargin
            int r1 = r1 + r0
            int r2 = r3.rightMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.f1357u = r0
        L_0x0474:
            if (r15 == 0) goto L_0x048b
            r0 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r5.measure(r0, r0)
            r13 = r35
            r2 = r3
            r29 = r22
            r31 = r23
            r22 = r4
            r23 = r5
            goto L_0x0512
        L_0x048b:
            r0 = 1073741824(0x40000000, float:2.0)
            r13 = r35
            r2 = r3
            r29 = r22
            r31 = r23
            r20 = 1
            r22 = r4
            r23 = r5
            goto L_0x0514
        L_0x049c:
            r25 = r0
            int r0 = r3.width
            if (r0 != 0) goto L_0x04ac
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x04ad
            r1 = -2
            r3.width = r1
            r1 = 0
            goto L_0x04af
        L_0x04ac:
            r0 = 0
        L_0x04ad:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x04af:
            r2 = r1
            int r0 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x04b7
            int r0 = r6.f1357u
            goto L_0x04b8
        L_0x04b7:
            r0 = 0
        L_0x04b8:
            r26 = r0
            r27 = 0
            r0 = r34
            r1 = r5
            r30 = r2
            r29 = r22
            r2 = r35
            r32 = r3
            r31 = r23
            r3 = r26
            r22 = r4
            r4 = r36
            r13 = r35
            r23 = r5
            r5 = r27
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r30
            if (r1 == r0) goto L_0x04e3
            r2 = r32
            r2.width = r1
            goto L_0x04e5
        L_0x04e3:
            r2 = r32
        L_0x04e5:
            int r0 = r23.getMeasuredWidth()
            if (r16 == 0) goto L_0x04fa
            int r1 = r6.f1357u
            int r3 = r2.leftMargin
            int r3 = r3 + r0
            int r4 = r2.rightMargin
            r5 = 0
            int r1 = androidx.appcompat.widget.d.a(r3, r4, r5, r1)
            r6.f1357u = r1
            goto L_0x050c
        L_0x04fa:
            int r1 = r6.f1357u
            int r3 = r1 + r0
            int r4 = r2.leftMargin
            int r3 = r3 + r4
            int r4 = r2.rightMargin
            int r3 = r3 + r4
            int r3 = r3 + 0
            int r1 = java.lang.Math.max(r1, r3)
            r6.f1357u = r1
        L_0x050c:
            if (r22 == 0) goto L_0x0512
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0512:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0514:
            if (r10 == r0) goto L_0x051f
            int r0 = r2.height
            r1 = -1
            if (r0 != r1) goto L_0x051f
            r0 = 1
            r21 = 1
            goto L_0x0520
        L_0x051f:
            r0 = 0
        L_0x0520:
            int r1 = r2.topMargin
            int r3 = r2.bottomMargin
            int r1 = r1 + r3
            int r3 = r23.getMeasuredHeight()
            int r3 = r3 + r1
            int r4 = r23.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r9, r4)
            if (r15 == 0) goto L_0x055e
            int r5 = r23.getBaseline()
            r9 = -1
            if (r5 == r9) goto L_0x055e
            int r9 = r2.gravity
            if (r9 >= 0) goto L_0x0541
            int r9 = r6.f1356t
        L_0x0541:
            r9 = r9 & 112(0x70, float:1.57E-43)
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r23 = r1
            r1 = r11[r9]
            int r1 = java.lang.Math.max(r1, r5)
            r11[r9] = r1
            r1 = r12[r9]
            int r5 = r3 - r5
            int r1 = java.lang.Math.max(r1, r5)
            r12[r9] = r1
            goto L_0x0560
        L_0x055e:
            r23 = r1
        L_0x0560:
            r5 = r28
            int r1 = java.lang.Math.max(r5, r3)
            if (r19 == 0) goto L_0x056f
            int r5 = r2.height
            r9 = -1
            if (r5 != r9) goto L_0x056f
            r5 = 1
            goto L_0x0570
        L_0x056f:
            r5 = 0
        L_0x0570:
            float r2 = r2.weight
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0584
            if (r0 == 0) goto L_0x057b
            r3 = r23
        L_0x057b:
            r2 = r31
            int r3 = java.lang.Math.max(r2, r3)
            r2 = r29
            goto L_0x0592
        L_0x0584:
            r2 = r31
            if (r0 == 0) goto L_0x058a
            r3 = r23
        L_0x058a:
            r0 = r29
            int r0 = java.lang.Math.max(r0, r3)
            r3 = r2
            r2 = r0
        L_0x0592:
            int r0 = r25 + 0
            r28 = r1
            r9 = r4
            r19 = r5
            r1 = r24
        L_0x059b:
            int r0 = r0 + 1
            r5 = r13
            r4 = r22
            r13 = r36
            goto L_0x0405
        L_0x05a4:
            r0 = r2
            r2 = r3
            r22 = r4
            r13 = r5
            r5 = r28
            int r3 = r6.f1357u
            if (r3 <= 0) goto L_0x05bc
            boolean r3 = r6.k(r7)
            if (r3 == 0) goto L_0x05bc
            int r3 = r6.f1357u
            int r4 = r6.A
            int r3 = r3 + r4
            r6.f1357u = r3
        L_0x05bc:
            r3 = 1
            r4 = r11[r3]
            r3 = -1
            if (r4 != r3) goto L_0x05db
            r4 = 0
            r4 = r11[r4]
            if (r4 != r3) goto L_0x05db
            r23 = r9
            r4 = 2
            r9 = r11[r4]
            if (r9 != r3) goto L_0x05dd
            r4 = 3
            r9 = r11[r4]
            if (r9 == r3) goto L_0x05d4
            goto L_0x05de
        L_0x05d4:
            r28 = r5
            r25 = r10
            r24 = r15
            goto L_0x0616
        L_0x05db:
            r23 = r9
        L_0x05dd:
            r4 = 3
        L_0x05de:
            r3 = r11[r4]
            r4 = 0
            r4 = r11[r4]
            r24 = r15
            r9 = 1
            r15 = r11[r9]
            r17 = 2
            r9 = r11[r17]
            int r9 = java.lang.Math.max(r15, r9)
            int r4 = java.lang.Math.max(r4, r9)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 3
            r4 = r12[r4]
            r9 = 0
            r9 = r12[r9]
            r25 = r10
            r15 = 1
            r10 = r12[r15]
            r15 = r12[r17]
            int r10 = java.lang.Math.max(r10, r15)
            int r9 = java.lang.Math.max(r9, r10)
            int r4 = java.lang.Math.max(r4, r9)
            int r4 = r4 + r3
            int r28 = java.lang.Math.max(r5, r4)
        L_0x0616:
            if (r22 == 0) goto L_0x0668
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r3) goto L_0x061e
            if (r8 != 0) goto L_0x0668
        L_0x061e:
            r3 = 0
            r6.f1357u = r3
            r4 = r3
        L_0x0622:
            if (r3 >= r7) goto L_0x0668
            android.view.View r5 = r6.getChildAt(r3)
            if (r5 != 0) goto L_0x0630
            int r5 = r6.f1357u
            int r5 = r5 + r4
            r6.f1357u = r5
            goto L_0x0664
        L_0x0630:
            int r4 = r5.getVisibility()
            r9 = 8
            if (r4 != r9) goto L_0x063b
            int r3 = r3 + 0
            goto L_0x0664
        L_0x063b:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            androidx.appcompat.widget.o0$a r4 = (androidx.appcompat.widget.o0.a) r4
            if (r16 == 0) goto L_0x0652
            int r5 = r6.f1357u
            int r9 = r4.leftMargin
            int r9 = r9 + r14
            int r4 = r4.rightMargin
            r10 = 0
            int r4 = androidx.appcompat.widget.d.a(r9, r4, r10, r5)
            r6.f1357u = r4
            goto L_0x0664
        L_0x0652:
            int r5 = r6.f1357u
            int r9 = r5 + r14
            int r10 = r4.leftMargin
            int r9 = r9 + r10
            int r4 = r4.rightMargin
            int r9 = r9 + r4
            int r9 = r9 + 0
            int r4 = java.lang.Math.max(r5, r9)
            r6.f1357u = r4
        L_0x0664:
            int r3 = r3 + 1
            r4 = 0
            goto L_0x0622
        L_0x0668:
            int r3 = r6.f1357u
            int r4 = r34.getPaddingLeft()
            int r5 = r34.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f1357u = r5
            int r3 = r34.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r13, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.f1357u
            int r4 = r4 - r5
            if (r20 != 0) goto L_0x06d9
            if (r4 == 0) goto L_0x0694
            r5 = 0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0694
            goto L_0x06d9
        L_0x0694:
            int r0 = java.lang.Math.max(r0, r2)
            if (r22 == 0) goto L_0x06d1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == r1) goto L_0x06d1
            r1 = 0
        L_0x069f:
            if (r1 >= r7) goto L_0x06d1
            android.view.View r2 = r6.getChildAt(r1)
            if (r2 == 0) goto L_0x06ce
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x06b0
            goto L_0x06ce
        L_0x06b0:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.o0$a r4 = (androidx.appcompat.widget.o0.a) r4
            float r4 = r4.weight
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x06ce
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r8 = r2.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r2.measure(r5, r4)
        L_0x06ce:
            int r1 = r1 + 1
            goto L_0x069f
        L_0x06d1:
            r4 = r36
            r9 = r23
            r8 = r25
            goto L_0x0854
        L_0x06d9:
            float r2 = r6.f1358v
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x06e1
            r1 = r2
        L_0x06e1:
            r2 = 3
            r5 = -1
            r11[r2] = r5
            r9 = 2
            r11[r9] = r5
            r10 = 1
            r11[r10] = r5
            r14 = 0
            r11[r14] = r5
            r12[r2] = r5
            r12[r9] = r5
            r12[r10] = r5
            r12[r14] = r5
            r6.f1357u = r14
            r2 = -1
            r5 = 0
            r9 = r23
            r33 = r2
            r2 = r0
            r0 = r33
        L_0x0701:
            if (r5 >= r7) goto L_0x0829
            android.view.View r10 = r6.getChildAt(r5)
            if (r10 == 0) goto L_0x0817
            int r14 = r10.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0713
            goto L_0x0817
        L_0x0713:
            android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()
            androidx.appcompat.widget.o0$a r14 = (androidx.appcompat.widget.o0.a) r14
            float r15 = r14.weight
            r20 = 0
            int r20 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r20 <= 0) goto L_0x077f
            float r13 = (float) r4
            float r13 = r13 * r15
            float r13 = r13 / r1
            int r13 = (int) r13
            float r1 = r1 - r15
            int r4 = r4 - r13
            int r15 = r34.getPaddingTop()
            int r20 = r34.getPaddingBottom()
            int r20 = r20 + r15
            int r15 = r14.topMargin
            int r20 = r20 + r15
            int r15 = r14.bottomMargin
            int r15 = r20 + r15
            r20 = r1
            int r1 = r14.height
            r22 = r4
            r4 = r36
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r15, r1)
            int r15 = r14.width
            if (r15 != 0) goto L_0x075a
            r15 = 1073741824(0x40000000, float:2.0)
            if (r8 == r15) goto L_0x074e
            goto L_0x075c
        L_0x074e:
            if (r13 <= 0) goto L_0x0751
            goto L_0x0752
        L_0x0751:
            r13 = 0
        L_0x0752:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r10.measure(r13, r1)
            goto L_0x076f
        L_0x075a:
            r15 = 1073741824(0x40000000, float:2.0)
        L_0x075c:
            int r23 = r10.getMeasuredWidth()
            int r23 = r23 + r13
            if (r23 >= 0) goto L_0x0766
            r23 = 0
        L_0x0766:
            r13 = r23
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r10.measure(r13, r1)
        L_0x076f:
            int r1 = r10.getMeasuredState()
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r13
            int r9 = android.view.View.combineMeasuredStates(r9, r1)
            r1 = r20
            r13 = r22
            goto L_0x0782
        L_0x077f:
            r13 = r4
            r4 = r36
        L_0x0782:
            if (r16 == 0) goto L_0x079e
            int r15 = r6.f1357u
            int r20 = r10.getMeasuredWidth()
            r22 = r1
            int r1 = r14.leftMargin
            int r1 = r20 + r1
            r20 = r8
            int r8 = r14.rightMargin
            r23 = r9
            r9 = 0
            int r1 = androidx.appcompat.widget.d.a(r1, r8, r9, r15)
            r6.f1357u = r1
            goto L_0x07b9
        L_0x079e:
            r22 = r1
            r20 = r8
            r23 = r9
            int r1 = r6.f1357u
            int r8 = r10.getMeasuredWidth()
            int r8 = r8 + r1
            int r9 = r14.leftMargin
            int r8 = r8 + r9
            int r9 = r14.rightMargin
            int r8 = r8 + r9
            int r8 = r8 + 0
            int r1 = java.lang.Math.max(r1, r8)
            r6.f1357u = r1
        L_0x07b9:
            r1 = 1073741824(0x40000000, float:2.0)
            r8 = r25
            if (r8 == r1) goto L_0x07c6
            int r1 = r14.height
            r9 = -1
            if (r1 != r9) goto L_0x07c6
            r1 = 1
            goto L_0x07c7
        L_0x07c6:
            r1 = 0
        L_0x07c7:
            int r9 = r14.topMargin
            int r15 = r14.bottomMargin
            int r9 = r9 + r15
            int r15 = r10.getMeasuredHeight()
            int r15 = r15 + r9
            int r0 = java.lang.Math.max(r0, r15)
            if (r1 == 0) goto L_0x07d8
            goto L_0x07d9
        L_0x07d8:
            r9 = r15
        L_0x07d9:
            int r1 = java.lang.Math.max(r2, r9)
            if (r19 == 0) goto L_0x07e6
            int r2 = r14.height
            r9 = -1
            if (r2 != r9) goto L_0x07e7
            r2 = 1
            goto L_0x07e8
        L_0x07e6:
            r9 = -1
        L_0x07e7:
            r2 = 0
        L_0x07e8:
            if (r24 == 0) goto L_0x080f
            int r10 = r10.getBaseline()
            if (r10 == r9) goto L_0x080f
            int r9 = r14.gravity
            if (r9 >= 0) goto L_0x07f6
            int r9 = r6.f1356t
        L_0x07f6:
            r9 = r9 & 112(0x70, float:1.57E-43)
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r14 = r11[r9]
            int r14 = java.lang.Math.max(r14, r10)
            r11[r9] = r14
            r14 = r12[r9]
            int r15 = r15 - r10
            int r10 = java.lang.Math.max(r14, r15)
            r12[r9] = r10
        L_0x080f:
            r19 = r2
            r9 = r23
            r2 = r1
            r1 = r22
            goto L_0x081e
        L_0x0817:
            r13 = r4
            r20 = r8
            r8 = r25
            r4 = r36
        L_0x081e:
            int r5 = r5 + 1
            r25 = r8
            r4 = r13
            r8 = r20
            r13 = r35
            goto L_0x0701
        L_0x0829:
            r4 = r36
            r8 = r25
            int r1 = r6.f1357u
            int r5 = r34.getPaddingLeft()
            int r10 = r34.getPaddingRight()
            int r10 = r10 + r5
            int r10 = r10 + r1
            r6.f1357u = r10
            r1 = 1
            r5 = r11[r1]
            r1 = -1
            if (r5 != r1) goto L_0x0857
            r5 = 0
            r5 = r11[r5]
            if (r5 != r1) goto L_0x0857
            r5 = 2
            r10 = r11[r5]
            if (r10 != r1) goto L_0x0857
            r5 = 3
            r10 = r11[r5]
            if (r10 == r1) goto L_0x0851
            goto L_0x0858
        L_0x0851:
            r28 = r0
            r0 = r2
        L_0x0854:
            r1 = 0
            r2 = r0
            goto L_0x088a
        L_0x0857:
            r5 = 3
        L_0x0858:
            r1 = r11[r5]
            r10 = 0
            r13 = r11[r10]
            r14 = 1
            r15 = r11[r14]
            r16 = 2
            r11 = r11[r16]
            int r11 = java.lang.Math.max(r15, r11)
            int r11 = java.lang.Math.max(r13, r11)
            int r1 = java.lang.Math.max(r1, r11)
            r5 = r12[r5]
            r11 = r12[r10]
            r13 = r12[r14]
            r12 = r12[r16]
            int r12 = java.lang.Math.max(r13, r12)
            int r11 = java.lang.Math.max(r11, r12)
            int r5 = java.lang.Math.max(r5, r11)
            int r5 = r5 + r1
            int r28 = java.lang.Math.max(r0, r5)
            r1 = r10
        L_0x088a:
            if (r19 != 0) goto L_0x0891
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 == r0) goto L_0x0891
            goto L_0x0893
        L_0x0891:
            r2 = r28
        L_0x0893:
            int r0 = r34.getPaddingTop()
            int r5 = r34.getPaddingBottom()
            int r5 = r5 + r0
            int r5 = r5 + r2
            int r0 = r34.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r5, r0)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r9
            r2 = r2 | r3
            int r3 = r9 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r3)
            r6.setMeasuredDimension(r2, r0)
            if (r21 == 0) goto L_0x08f0
            int r0 = r34.getMeasuredHeight()
            r2 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r9 = r1
        L_0x08bf:
            if (r9 >= r7) goto L_0x08f0
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x08ed
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            androidx.appcompat.widget.o0$a r10 = (androidx.appcompat.widget.o0.a) r10
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x08ed
            int r11 = r10.width
            int r0 = r1.getMeasuredWidth()
            r10.width = r0
            r3 = 0
            r5 = 0
            r0 = r34
            r2 = r35
            r4 = r8
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.width = r11
        L_0x08ed:
            int r9 = r9 + 1
            goto L_0x08bf
        L_0x08f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f1352a = z10;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder d10 = a.a.d("base aligned child index out of range (0, ");
            d10.append(getChildCount());
            d10.append(")");
            throw new IllegalArgumentException(d10.toString());
        }
        this.f1353b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.z) {
            this.z = drawable;
            boolean z10 = false;
            if (drawable != null) {
                this.A = drawable.getIntrinsicWidth();
                this.B = drawable.getIntrinsicHeight();
            } else {
                this.A = 0;
                this.B = 0;
            }
            if (drawable == null) {
                z10 = true;
            }
            setWillNotDraw(z10);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.D = i;
    }

    public void setGravity(int i) {
        if (this.f1356t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1356t = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i10 = i & 8388615;
        int i11 = this.f1356t;
        if ((8388615 & i11) != i10) {
            this.f1356t = i10 | (-8388616 & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1359w = z10;
    }

    public void setOrientation(int i) {
        if (this.f1355s != i) {
            this.f1355s = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.C) {
            requestLayout();
        }
        this.C = i;
    }

    public void setVerticalGravity(int i) {
        int i10 = i & 112;
        int i11 = this.f1356t;
        if ((i11 & 112) != i10) {
            this.f1356t = i10 | (i11 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1358v = Math.max(0.0f, f10);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public o0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.f1352a = true;
        this.f1353b = -1;
        this.f1354c = 0;
        this.f1356t = 8388659;
        int[] iArr = c.H;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        x.o(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        int i10 = obtainStyledAttributes.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = obtainStyledAttributes.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f1358v = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f1353b = obtainStyledAttributes.getInt(3, -1);
        this.f1359w = obtainStyledAttributes.getBoolean(7, false);
        if (!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(5);
        } else {
            drawable = b.a0(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.C = obtainStyledAttributes.getInt(8, 0);
        this.D = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }
}
