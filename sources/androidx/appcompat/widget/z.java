package androidx.appcompat.widget;

import ad.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class z extends u {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1428d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1429e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1430f = null;
    public PorterDuff.Mode g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1431h = false;
    public boolean i = false;

    public z(SeekBar seekBar) {
        super(seekBar);
        this.f1428d = seekBar;
    }

    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        Context context = this.f1428d.getContext();
        int[] iArr = c.A;
        d1 q10 = d1.q(context, attributeSet, iArr, R.attr.seekBarStyle);
        SeekBar seekBar = this.f1428d;
        x.o(seekBar, seekBar.getContext(), iArr, attributeSet, q10.f1207b, R.attr.seekBarStyle);
        Drawable h10 = q10.h(0);
        if (h10 != null) {
            this.f1428d.setThumb(h10);
        }
        Drawable g8 = q10.g(1);
        Drawable drawable = this.f1429e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f1429e = g8;
        if (g8 != null) {
            g8.setCallback(this.f1428d);
            SeekBar seekBar2 = this.f1428d;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            g8.setLayoutDirection(x.e.d(seekBar2));
            if (g8.isStateful()) {
                g8.setState(this.f1428d.getDrawableState());
            }
            c();
        }
        this.f1428d.invalidate();
        if (q10.o(3)) {
            this.g = k0.e(q10.j(3, -1), this.g);
            this.i = true;
        }
        if (q10.o(2)) {
            this.f1430f = q10.c(2);
            this.f1431h = true;
        }
        q10.r();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1429e;
        if (drawable == null) {
            return;
        }
        if (this.f1431h || this.i) {
            Drawable mutate = drawable.mutate();
            this.f1429e = mutate;
            if (this.f1431h) {
                mutate.setTintList(this.f1430f);
            }
            if (this.i) {
                this.f1429e.setTintMode(this.g);
            }
            if (this.f1429e.isStateful()) {
                this.f1429e.setState(this.f1428d.getDrawableState());
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f1429e != null) {
            int max = this.f1428d.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1429e.getIntrinsicWidth();
                int intrinsicHeight = this.f1429e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f1429e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((this.f1428d.getWidth() - this.f1428d.getPaddingLeft()) - this.f1428d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1428d.getPaddingLeft(), (float) (this.f1428d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1429e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
