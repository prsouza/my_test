package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class TriangleShapeRenderer implements IShapeRenderer {
    public Path mTrianglePathBuffer = new Path();

    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f10, float f11, Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f12 = scatterShapeSize / 2.0f;
        float convertDpToPixel = (scatterShapeSize - (Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius()) * 2.0f)) / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.mTrianglePathBuffer;
        path.reset();
        float f13 = f11 - f12;
        path.moveTo(f10, f13);
        float f14 = f10 + f12;
        float f15 = f11 + f12;
        path.lineTo(f14, f15);
        float f16 = f10 - f12;
        path.lineTo(f16, f15);
        int i = (((double) scatterShapeSize) > Utils.DOUBLE_EPSILON ? 1 : (((double) scatterShapeSize) == Utils.DOUBLE_EPSILON ? 0 : -1));
        if (i > 0) {
            path.lineTo(f10, f13);
            float f17 = f16 + convertDpToPixel;
            float f18 = f15 - convertDpToPixel;
            path.moveTo(f17, f18);
            path.lineTo(f14 - convertDpToPixel, f18);
            path.lineTo(f10, f13 + convertDpToPixel);
            path.lineTo(f17, f18);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (i > 0 && scatterShapeHoleColor != 1122867) {
            paint.setColor(scatterShapeHoleColor);
            path.moveTo(f10, f13 + convertDpToPixel);
            float f19 = f15 - convertDpToPixel;
            path.lineTo(f14 - convertDpToPixel, f19);
            path.lineTo(f16 + convertDpToPixel, f19);
            path.close();
            canvas.drawPath(path, paint);
            path.reset();
        }
    }
}
