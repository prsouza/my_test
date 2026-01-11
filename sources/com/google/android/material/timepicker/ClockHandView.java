package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

class ClockHandView extends View {
    public boolean A;
    public double B;
    public int C;

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f4155a;

    /* renamed from: b  reason: collision with root package name */
    public float f4156b;

    /* renamed from: c  reason: collision with root package name */
    public float f4157c;

    /* renamed from: s  reason: collision with root package name */
    public int f4158s;

    /* renamed from: t  reason: collision with root package name */
    public final List<a> f4159t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final int f4160u;

    /* renamed from: v  reason: collision with root package name */
    public final float f4161v;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f4162w;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f4163x;

    /* renamed from: y  reason: collision with root package name */
    public final int f4164y;
    public float z;

    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f4162w = paint;
        this.f4163x = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5.a.f4623h, R.attr.materialClockStyle, 2131821643);
        this.C = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f4160u = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f4164y = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f4161v = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        this.f4158s = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f11 - ((float) (getHeight() / 2))), (double) (f10 - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f4155a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10, false);
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [java.util.List<com.google.android.material.timepicker.ClockHandView$a>, java.util.ArrayList] */
    public final void c(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.z = f11;
        this.B = Math.toRadians((double) (f11 - 90.0f));
        float cos = (((float) this.C) * ((float) Math.cos(this.B))) + ((float) (getWidth() / 2));
        float sin = (((float) this.C) * ((float) Math.sin(this.B))) + ((float) (getHeight() / 2));
        RectF rectF = this.f4163x;
        float f12 = (float) this.f4160u;
        rectF.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f4159t.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = (float) width;
        float f11 = (float) height;
        this.f4162w.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.C) * ((float) Math.cos(this.B))) + f10, (((float) this.C) * ((float) Math.sin(this.B))) + f11, (float) this.f4160u, this.f4162w);
        double sin = Math.sin(this.B);
        double cos = Math.cos(this.B);
        double d10 = (double) ((float) (this.C - this.f4160u));
        float f12 = (float) (width + ((int) (cos * d10)));
        float f13 = (float) (height + ((int) (d10 * sin)));
        this.f4162w.setStrokeWidth((float) this.f4164y);
        canvas.drawLine(f10, f11, f12, f13, this.f4162w);
        canvas.drawCircle(f10, f11, this.f4161v, this.f4162w);
    }

    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        b(this.z);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.f4156b = x10;
            this.f4157c = y10;
            this.A = false;
            z11 = false;
            z10 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.A;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z13 = this.A;
        float a10 = (float) a(x10, y10);
        boolean z14 = this.z != a10;
        if (!z10 || !z14) {
            if (z14 || z11) {
                b(a10);
            }
            this.A = z13 | z12;
            return true;
        }
        z12 = true;
        this.A = z13 | z12;
        return true;
    }
}
