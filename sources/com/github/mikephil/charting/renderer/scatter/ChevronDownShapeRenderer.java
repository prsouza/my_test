package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class ChevronDownShapeRenderer implements IShapeRenderer {
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f10, float f11, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Utils.convertDpToPixel(1.0f));
        float scatterShapeSize = (iScatterDataSet.getScatterShapeSize() / 2.0f) * 2.0f;
        Canvas canvas2 = canvas;
        float f12 = f10;
        float f13 = f11 + scatterShapeSize;
        float f14 = f11;
        Paint paint2 = paint;
        canvas2.drawLine(f12, f13, f10 + scatterShapeSize, f14, paint2);
        canvas2.drawLine(f12, f13, f10 - scatterShapeSize, f14, paint2);
    }
}
