package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import java.util.List;

public class Transformer {
    private Matrix mMBuffer1 = new Matrix();
    private Matrix mMBuffer2 = new Matrix();
    public Matrix mMatrixOffset = new Matrix();
    public Matrix mMatrixValueToPx = new Matrix();
    public Matrix mPixelToValueMatrixBuffer = new Matrix();
    public ViewPortHandler mViewPortHandler;
    public float[] ptsBuffer = new float[2];
    public float[] valuePointsForGenerateTransformedValuesBubble = new float[1];
    public float[] valuePointsForGenerateTransformedValuesCandle = new float[1];
    public float[] valuePointsForGenerateTransformedValuesLine = new float[1];
    public float[] valuePointsForGenerateTransformedValuesScatter = new float[1];

    public Transformer(ViewPortHandler viewPortHandler) {
        this.mViewPortHandler = viewPortHandler;
    }

    public float[] generateTransformedValuesBubble(IBubbleDataSet iBubbleDataSet, float f10, int i, int i10) {
        int i11 = ((i10 - i) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesBubble.length != i11) {
            this.valuePointsForGenerateTransformedValuesBubble = new float[i11];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesBubble;
        for (int i12 = 0; i12 < i11; i12 += 2) {
            Entry entryForIndex = iBubbleDataSet.getEntryForIndex((i12 / 2) + i);
            if (entryForIndex != null) {
                fArr[i12] = entryForIndex.getX();
                fArr[i12 + 1] = entryForIndex.getY() * f10;
            } else {
                fArr[i12] = 0.0f;
                fArr[i12 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public float[] generateTransformedValuesCandle(ICandleDataSet iCandleDataSet, float f10, float f11, int i, int i10) {
        int i11 = ((int) ((((float) (i10 - i)) * f10) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesCandle.length != i11) {
            this.valuePointsForGenerateTransformedValuesCandle = new float[i11];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesCandle;
        for (int i12 = 0; i12 < i11; i12 += 2) {
            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex((i12 / 2) + i);
            if (candleEntry != null) {
                fArr[i12] = candleEntry.getX();
                fArr[i12 + 1] = candleEntry.getHigh() * f11;
            } else {
                fArr[i12] = 0.0f;
                fArr[i12 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public float[] generateTransformedValuesLine(ILineDataSet iLineDataSet, float f10, float f11, int i, int i10) {
        int i11 = (((int) (((float) (i10 - i)) * f10)) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesLine.length != i11) {
            this.valuePointsForGenerateTransformedValuesLine = new float[i11];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesLine;
        for (int i12 = 0; i12 < i11; i12 += 2) {
            Entry entryForIndex = iLineDataSet.getEntryForIndex((i12 / 2) + i);
            if (entryForIndex != null) {
                fArr[i12] = entryForIndex.getX();
                fArr[i12 + 1] = entryForIndex.getY() * f11;
            } else {
                fArr[i12] = 0.0f;
                fArr[i12 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public float[] generateTransformedValuesScatter(IScatterDataSet iScatterDataSet, float f10, float f11, int i, int i10) {
        int i11 = ((int) ((((float) (i10 - i)) * f10) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesScatter.length != i11) {
            this.valuePointsForGenerateTransformedValuesScatter = new float[i11];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesScatter;
        for (int i12 = 0; i12 < i11; i12 += 2) {
            Entry entryForIndex = iScatterDataSet.getEntryForIndex((i12 / 2) + i);
            if (entryForIndex != null) {
                fArr[i12] = entryForIndex.getX();
                fArr[i12 + 1] = entryForIndex.getY() * f11;
            } else {
                fArr[i12] = 0.0f;
                fArr[i12 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public Matrix getOffsetMatrix() {
        return this.mMatrixOffset;
    }

    public MPPointD getPixelForValues(float f10, float f11) {
        float[] fArr = this.ptsBuffer;
        fArr[0] = f10;
        fArr[1] = f11;
        pointValuesToPixel(fArr);
        float[] fArr2 = this.ptsBuffer;
        return MPPointD.getInstance((double) fArr2[0], (double) fArr2[1]);
    }

    public Matrix getPixelToValueMatrix() {
        getValueToPixelMatrix().invert(this.mMBuffer2);
        return this.mMBuffer2;
    }

    public Matrix getValueMatrix() {
        return this.mMatrixValueToPx;
    }

    public Matrix getValueToPixelMatrix() {
        this.mMBuffer1.set(this.mMatrixValueToPx);
        this.mMBuffer1.postConcat(this.mViewPortHandler.mMatrixTouch);
        this.mMBuffer1.postConcat(this.mMatrixOffset);
        return this.mMBuffer1;
    }

    public MPPointD getValuesByTouchPoint(float f10, float f11) {
        MPPointD instance = MPPointD.getInstance(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
        getValuesByTouchPoint(f10, f11, instance);
        return instance;
    }

    public void pathValueToPixel(Path path) {
        path.transform(this.mMatrixValueToPx);
        path.transform(this.mViewPortHandler.getMatrixTouch());
        path.transform(this.mMatrixOffset);
    }

    public void pathValuesToPixel(List<Path> list) {
        for (int i = 0; i < list.size(); i++) {
            pathValueToPixel(list.get(i));
        }
    }

    public void pixelsToValue(float[] fArr) {
        Matrix matrix = this.mPixelToValueMatrixBuffer;
        matrix.reset();
        this.mMatrixOffset.invert(matrix);
        matrix.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().invert(matrix);
        matrix.mapPoints(fArr);
        this.mMatrixValueToPx.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void pointValuesToPixel(float[] fArr) {
        this.mMatrixValueToPx.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().mapPoints(fArr);
        this.mMatrixOffset.mapPoints(fArr);
    }

    public void prepareMatrixOffset(boolean z) {
        this.mMatrixOffset.reset();
        if (!z) {
            this.mMatrixOffset.postTranslate(this.mViewPortHandler.offsetLeft(), this.mViewPortHandler.getChartHeight() - this.mViewPortHandler.offsetBottom());
            return;
        }
        this.mMatrixOffset.setTranslate(this.mViewPortHandler.offsetLeft(), -this.mViewPortHandler.offsetTop());
        this.mMatrixOffset.postScale(1.0f, -1.0f);
    }

    public void prepareMatrixValuePx(float f10, float f11, float f12, float f13) {
        float contentWidth = this.mViewPortHandler.contentWidth() / f11;
        float contentHeight = this.mViewPortHandler.contentHeight() / f12;
        if (Float.isInfinite(contentWidth)) {
            contentWidth = 0.0f;
        }
        if (Float.isInfinite(contentHeight)) {
            contentHeight = 0.0f;
        }
        this.mMatrixValueToPx.reset();
        this.mMatrixValueToPx.postTranslate(-f10, -f13);
        this.mMatrixValueToPx.postScale(contentWidth, -contentHeight);
    }

    public void rectToPixelPhase(RectF rectF, float f10) {
        rectF.top *= f10;
        rectF.bottom *= f10;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectToPixelPhaseHorizontal(RectF rectF, float f10) {
        rectF.left *= f10;
        rectF.right *= f10;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixel(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixelHorizontal(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValuesToPixel(List<RectF> list) {
        Matrix valueToPixelMatrix = getValueToPixelMatrix();
        for (int i = 0; i < list.size(); i++) {
            valueToPixelMatrix.mapRect(list.get(i));
        }
    }

    public void getValuesByTouchPoint(float f10, float f11, MPPointD mPPointD) {
        float[] fArr = this.ptsBuffer;
        fArr[0] = f10;
        fArr[1] = f11;
        pixelsToValue(fArr);
        float[] fArr2 = this.ptsBuffer;
        mPPointD.f3608x = (double) fArr2[0];
        mPPointD.f3609y = (double) fArr2[1];
    }

    public void rectValueToPixelHorizontal(RectF rectF, float f10) {
        rectF.left *= f10;
        rectF.right *= f10;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }
}
