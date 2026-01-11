package androidx.appcompat.widget;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Api;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f994a;

    /* renamed from: b  reason: collision with root package name */
    public w0 f995b;

    /* renamed from: c  reason: collision with root package name */
    public View f996c;

    /* renamed from: s  reason: collision with root package name */
    public View f997s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f998t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f999u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f1000v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1001w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1002x;

    /* renamed from: y  reason: collision with root package name */
    public int f1003y;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f336u);
        boolean z = false;
        this.f998t = obtainStyledAttributes.getDrawable(0);
        this.f999u = obtainStyledAttributes.getDrawable(2);
        this.f1003y = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1001w = true;
            this.f1000v = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1001w ? this.f998t == null && this.f999u == null : this.f1000v == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f998t;
        if (drawable != null && drawable.isStateful()) {
            this.f998t.setState(getDrawableState());
        }
        Drawable drawable2 = this.f999u;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f999u.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1000v;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1000v.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f995b;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f998t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f999u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1000v;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f996c = findViewById(R.id.action_bar);
        this.f997s = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f994a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            androidx.appcompat.widget.w0 r5 = r4.f995b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f1001w
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f1000v
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f998t
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f996c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f998t
            android.view.View r7 = r4.f996c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f996c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f996c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f996c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f997s
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f998t
            android.view.View r7 = r4.f997s
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f997s
            int r8 = r8.getTop()
            android.view.View r0 = r4.f997s
            int r0 = r0.getRight()
            android.view.View r2 = r4.f997s
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f998t
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.f1002x = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f999u
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        if (this.f996c == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i12 = this.f1003y) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
        }
        super.onMeasure(i, i10);
        if (this.f996c != null) {
            int mode = View.MeasureSpec.getMode(i10);
            w0 w0Var = this.f995b;
            if (w0Var != null && w0Var.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f996c)) {
                    i11 = a(this.f996c);
                } else {
                    i11 = !b(this.f997s) ? a(this.f997s) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f995b) + i11, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i10) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f998t;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f998t);
        }
        this.f998t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f996c;
            if (view != null) {
                this.f998t.setBounds(view.getLeft(), this.f996c.getTop(), this.f996c.getRight(), this.f996c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1001w ? !(this.f998t == null && this.f999u == null) : this.f1000v != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1000v;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1000v);
        }
        this.f1000v = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1001w && (drawable2 = this.f1000v) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1001w ? this.f998t == null && this.f999u == null : this.f1000v == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f999u;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f999u);
        }
        this.f999u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1002x && (drawable2 = this.f999u) != null) {
                drawable2.setBounds(this.f995b.getLeft(), this.f995b.getTop(), this.f995b.getRight(), this.f995b.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1001w ? !(this.f998t == null && this.f999u == null) : this.f1000v != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(w0 w0Var) {
        w0 w0Var2 = this.f995b;
        if (w0Var2 != null) {
            removeView(w0Var2);
        }
        this.f995b = w0Var;
        if (w0Var != null) {
            addView(w0Var);
            ViewGroup.LayoutParams layoutParams = w0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            w0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f994a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f998t;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f999u;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1000v;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f998t && !this.f1001w) || (drawable == this.f999u && this.f1002x) || ((drawable == this.f1000v && this.f1001w) || super.verifyDrawable(drawable));
    }
}
