package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class XShapeRenderer implements IShapeRenderer {
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f10, float f11, Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize() / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Utils.convertDpToPixel(1.0f));
        float f12 = f10 - scatterShapeSize;
        float f13 = f10 + scatterShapeSize;
        Canvas canvas2 = canvas;
        float f14 = f11 - scatterShapeSize;
        float f15 = scatterShapeSize + f11;
        Paint paint2 = paint;
        canvas2.drawLine(f12, f14, f13, f15, paint2);
        canvas2.drawLine(f13, f14, f12, f15, paint2);
    }
}
