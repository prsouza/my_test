package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import io.nodle.cash.R;
import j.c;
import java.lang.reflect.Field;
import q0.d;

public class l0 extends ListView {
    public d A;
    public b B;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f1320a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public int f1321b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1322c = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f1323s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f1324t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f1325u;

    /* renamed from: v  reason: collision with root package name */
    public Field f1326v;

    /* renamed from: w  reason: collision with root package name */
    public a f1327w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1328x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1329y;
    public boolean z;

    public static class a extends c {

        /* renamed from: b  reason: collision with root package name */
        public boolean f1330b = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.f1330b) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f10, float f11) {
            if (this.f1330b) {
                super.setHotspot(f10, f11);
            }
        }

        public final void setHotspotBounds(int i, int i10, int i11, int i12) {
            if (this.f1330b) {
                super.setHotspotBounds(i, i10, i11, i12);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.f1330b) {
                return super.setState(iArr);
            }
            return false;
        }

        public final boolean setVisible(boolean z, boolean z10) {
            if (this.f1330b) {
                return super.setVisible(z, z10);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            l0 l0Var = l0.this;
            l0Var.B = null;
            l0Var.drawableStateChanged();
        }
    }

    public l0(Context context, boolean z10) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f1329y = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1326v = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z10) {
        a aVar = this.f1327w;
        if (aVar != null) {
            aVar.f1330b = z10;
        }
    }

    public final int a(int i, int i10) {
        int i11;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i12 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i12;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            if (i15 > 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                i11 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i11);
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i10) {
                return i10;
            }
        }
        return i12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r0 = 2
            if (r3 == r0) goto L_0x0016
            r0 = 3
            if (r3 == r0) goto L_0x001f
            r0 = r4
            r4 = r5
            goto L_0x0126
        L_0x0016:
            r0 = r4
            goto L_0x0019
        L_0x0018:
            r0 = r5
        L_0x0019:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0023
        L_0x001f:
            r0 = r5
            r4 = r0
            goto L_0x0126
        L_0x0023:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0036
            goto L_0x0126
        L_0x0036:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.z = r4
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0050
            r1.setPressed(r4)
        L_0x0050:
            r16.layoutChildren()
            int r0 = r1.f1325u
            if (r0 == r9) goto L_0x006d
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006d
            if (r0 == r10) goto L_0x006d
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006d
            r0.setPressed(r5)
        L_0x006d:
            r1.f1325u = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            r10.drawableHotspotChanged(r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0089
            r10.setPressed(r4)
        L_0x0089:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0093
            if (r8 == r9) goto L_0x0093
            r12 = r4
            goto L_0x0094
        L_0x0093:
            r12 = r5
        L_0x0094:
            if (r12 == 0) goto L_0x0099
            r11.setVisible(r5, r5)
        L_0x0099:
            android.graphics.Rect r0 = r1.f1320a
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r4 = r10.getBottom()
            r0.set(r13, r14, r15, r4)
            int r4 = r0.left
            int r13 = r1.f1321b
            int r4 = r4 - r13
            r0.left = r4
            int r4 = r0.top
            int r13 = r1.f1322c
            int r4 = r4 - r13
            r0.top = r4
            int r4 = r0.right
            int r13 = r1.f1323s
            int r4 = r4 + r13
            r0.right = r4
            int r4 = r0.bottom
            int r13 = r1.f1324t
            int r4 = r4 + r13
            r0.bottom = r4
            java.lang.reflect.Field r0 = r1.f1326v     // Catch:{ IllegalAccessException -> 0x00ea }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ea }
            boolean r4 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r4 == r0) goto L_0x00ee
            java.lang.reflect.Field r4 = r1.f1326v     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r0 != 0) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = r5
        L_0x00dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ea }
            r4.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r8 == r9) goto L_0x00ee
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00ee:
            if (r12 == 0) goto L_0x0109
            android.graphics.Rect r0 = r1.f1320a
            float r4 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0102
            r12 = 1
            goto L_0x0103
        L_0x0102:
            r12 = r5
        L_0x0103:
            r11.setVisible(r12, r5)
            r11.setHotspot(r4, r0)
        L_0x0109:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0114
            if (r8 == r9) goto L_0x0114
            r0.setHotspot(r7, r6)
        L_0x0114:
            r1.setSelectorEnabled(r5)
            r16.refreshDrawableState()
            r4 = 1
            if (r3 != r4) goto L_0x0124
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L_0x0124:
            r4 = r5
            r0 = 1
        L_0x0126:
            if (r0 == 0) goto L_0x012a
            if (r4 == 0) goto L_0x0142
        L_0x012a:
            r1.z = r5
            r1.setPressed(r5)
            r16.drawableStateChanged()
            int r3 = r1.f1325u
            int r4 = r16.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x0142
            r3.setPressed(r5)
        L_0x0142:
            if (r0 == 0) goto L_0x015a
            q0.d r3 = r1.A
            if (r3 != 0) goto L_0x014f
            q0.d r3 = new q0.d
            r3.<init>(r1)
            r1.A = r3
        L_0x014f:
            q0.d r3 = r1.A
            boolean r4 = r3.E
            r4 = 1
            r3.E = r4
            r3.onTouch(r1, r2)
            goto L_0x0167
        L_0x015a:
            q0.d r2 = r1.A
            if (r2 == 0) goto L_0x0167
            boolean r3 = r2.E
            if (r3 == 0) goto L_0x0165
            r2.d()
        L_0x0165:
            r2.E = r5
        L_0x0167:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.z && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1320a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1320a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.B == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public final boolean hasFocus() {
        return this.f1329y || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.f1329y || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.f1329y || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.f1329y && this.f1328x) || super.isInTouchMode();
    }

    public final void onDetachedFromWindow() {
        this.B = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.B == null) {
            b bVar = new b();
            this.B = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1325u = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.B;
        if (bVar != null) {
            l0 l0Var = l0.this;
            l0Var.B = null;
            l0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f1328x = z10;
    }

    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1327w = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1321b = rect.left;
        this.f1322c = rect.top;
        this.f1323s = rect.right;
        this.f1324t = rect.bottom;
    }
}
