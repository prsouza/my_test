package com.github.mikephil.charting.renderer;

import a.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class LineRadarRenderer extends LineScatterCandleRadarRenderer {
    public LineRadarRenderer(ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
    }

    private boolean clipPathSupported() {
        return Utils.getSDKInt() >= 18;
    }

    public void drawFilledPath(Canvas canvas, Path path, Drawable drawable) {
        if (clipPathSupported()) {
            int save = canvas.save();
            canvas.clipPath(path);
            drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) this.mViewPortHandler.contentTop(), (int) this.mViewPortHandler.contentRight(), (int) this.mViewPortHandler.contentBottom());
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        StringBuilder d10 = a.d("Fill-drawables not (yet) supported below API level 18, this code was run on API level ");
        d10.append(Utils.getSDKInt());
        d10.append(".");
        throw new RuntimeException(d10.toString());
    }

    public void drawFilledPath(Canvas canvas, Path path, int i, int i10) {
        int i11 = (i & 16777215) | (i10 << 24);
        if (clipPathSupported()) {
            int save = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i11);
            canvas.restoreToCount(save);
            return;
        }
        Paint.Style style = this.mRenderPaint.getStyle();
        int color = this.mRenderPaint.getColor();
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mRenderPaint.setColor(i11);
        canvas.drawPath(path, this.mRenderPaint);
        this.mRenderPaint.setColor(color);
        this.mRenderPaint.setStyle(style);
    }
}
