package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class SquareShapeRenderer implements IShapeRenderer {
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f10, float f11, Paint paint) {
        Paint paint2 = paint;
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f12 = scatterShapeSize / 2.0f;
        float convertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius());
        float f13 = (scatterShapeSize - (convertDpToPixel * 2.0f)) / 2.0f;
        float f14 = f13 / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        if (((double) scatterShapeSize) > Utils.DOUBLE_EPSILON) {
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(f13);
            float f15 = f10 - convertDpToPixel;
            float f16 = f11 - convertDpToPixel;
            float f17 = f10 + convertDpToPixel;
            float f18 = f11 + convertDpToPixel;
            canvas.drawRect(f15 - f14, f16 - f14, f17 + f14, f18 + f14, paint);
            if (scatterShapeHoleColor != 1122867) {
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(scatterShapeHoleColor);
                canvas.drawRect(f15, f16, f17, f18, paint);
                return;
            }
            return;
        }
        paint2.setStyle(Paint.Style.FILL);
        Canvas canvas2 = canvas;
        canvas2.drawRect(f10 - f12, f11 - f12, f10 + f12, f11 + f12, paint);
    }
}
