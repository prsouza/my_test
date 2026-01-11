package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class RadarChartRenderer extends LineRadarRenderer {
    public RadarChart mChart;
    public Path mDrawDataSetSurfacePathBuffer = new Path();
    public Path mDrawHighlightCirclePathBuffer = new Path();
    public Paint mHighlightCirclePaint;
    public Paint mWebPaint;

    public RadarChartRenderer(RadarChart radarChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = radarChart;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.mWebPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mHighlightCirclePaint = new Paint(1);
    }

    public void drawData(Canvas canvas) {
        RadarData radarData = (RadarData) this.mChart.getData();
        int entryCount = ((IRadarDataSet) radarData.getMaxEntryCountSet()).getEntryCount();
        for (IRadarDataSet iRadarDataSet : radarData.getDataSets()) {
            if (iRadarDataSet.isVisible()) {
                drawDataSet(canvas, iRadarDataSet, entryCount);
            }
        }
    }

    public void drawDataSet(Canvas canvas, IRadarDataSet iRadarDataSet, int i) {
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        MPPointF instance = MPPointF.getInstance(0.0f, 0.0f);
        Path path = this.mDrawDataSetSurfacePathBuffer;
        path.reset();
        boolean z = false;
        for (int i10 = 0; i10 < iRadarDataSet.getEntryCount(); i10++) {
            this.mRenderPaint.setColor(iRadarDataSet.getColor(i10));
            Utils.getPosition(centerOffsets, (((RadarEntry) iRadarDataSet.getEntryForIndex(i10)).getY() - this.mChart.getYChartMin()) * factor * phaseY, this.mChart.getRotationAngle() + (((float) i10) * sliceAngle * phaseX), instance);
            if (!Float.isNaN(instance.f3610x)) {
                if (!z) {
                    path.moveTo(instance.f3610x, instance.f3611y);
                    z = true;
                } else {
                    path.lineTo(instance.f3610x, instance.f3611y);
                }
            }
        }
        if (iRadarDataSet.getEntryCount() > i) {
            path.lineTo(centerOffsets.f3610x, centerOffsets.f3611y);
        }
        path.close();
        if (iRadarDataSet.isDrawFilledEnabled()) {
            Drawable fillDrawable = iRadarDataSet.getFillDrawable();
            if (fillDrawable != null) {
                drawFilledPath(canvas, path, fillDrawable);
            } else {
                drawFilledPath(canvas, path, iRadarDataSet.getFillColor(), iRadarDataSet.getFillAlpha());
            }
        }
        this.mRenderPaint.setStrokeWidth(iRadarDataSet.getLineWidth());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        if (!iRadarDataSet.isDrawFilledEnabled() || iRadarDataSet.getFillAlpha() < 255) {
            canvas.drawPath(path, this.mRenderPaint);
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(instance);
    }

    public void drawExtras(Canvas canvas) {
        drawWeb(canvas);
    }

    public void drawHighlightCircle(Canvas canvas, MPPointF mPPointF, float f10, float f11, int i, int i10, float f12) {
        canvas.save();
        float convertDpToPixel = Utils.convertDpToPixel(f11);
        float convertDpToPixel2 = Utils.convertDpToPixel(f10);
        if (i != 1122867) {
            Path path = this.mDrawHighlightCirclePathBuffer;
            path.reset();
            path.addCircle(mPPointF.f3610x, mPPointF.f3611y, convertDpToPixel, Path.Direction.CW);
            if (convertDpToPixel2 > 0.0f) {
                path.addCircle(mPPointF.f3610x, mPPointF.f3611y, convertDpToPixel2, Path.Direction.CCW);
            }
            this.mHighlightCirclePaint.setColor(i);
            this.mHighlightCirclePaint.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.mHighlightCirclePaint);
        }
        if (i10 != 1122867) {
            this.mHighlightCirclePaint.setColor(i10);
            this.mHighlightCirclePaint.setStyle(Paint.Style.STROKE);
            this.mHighlightCirclePaint.setStrokeWidth(Utils.convertDpToPixel(f12));
            canvas.drawCircle(mPPointF.f3610x, mPPointF.f3611y, convertDpToPixel, this.mHighlightCirclePaint);
        }
        canvas.restore();
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        int i;
        int i10;
        Highlight[] highlightArr2 = highlightArr;
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        MPPointF instance = MPPointF.getInstance(0.0f, 0.0f);
        RadarData radarData = (RadarData) this.mChart.getData();
        int length = highlightArr2.length;
        int i11 = 0;
        int i12 = 0;
        while (i12 < length) {
            Highlight highlight = highlightArr2[i12];
            IRadarDataSet iRadarDataSet = (IRadarDataSet) radarData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iRadarDataSet != null && iRadarDataSet.isHighlightEnabled()) {
                RadarEntry radarEntry = (RadarEntry) iRadarDataSet.getEntryForIndex((int) highlight.getX());
                if (isInBoundsX(radarEntry, iRadarDataSet)) {
                    Utils.getPosition(centerOffsets, this.mAnimator.getPhaseY() * (radarEntry.getY() - this.mChart.getYChartMin()) * factor, this.mChart.getRotationAngle() + (this.mAnimator.getPhaseX() * highlight.getX() * sliceAngle), instance);
                    highlight.setDraw(instance.f3610x, instance.f3611y);
                    drawHighlightLines(canvas, instance.f3610x, instance.f3611y, iRadarDataSet);
                    if (iRadarDataSet.isDrawHighlightCircleEnabled() && !Float.isNaN(instance.f3610x) && !Float.isNaN(instance.f3611y)) {
                        int highlightCircleStrokeColor = iRadarDataSet.getHighlightCircleStrokeColor();
                        if (highlightCircleStrokeColor == 1122867) {
                            highlightCircleStrokeColor = iRadarDataSet.getColor(i11);
                        }
                        if (iRadarDataSet.getHighlightCircleStrokeAlpha() < 255) {
                            highlightCircleStrokeColor = ColorTemplate.colorWithAlpha(highlightCircleStrokeColor, iRadarDataSet.getHighlightCircleStrokeAlpha());
                        }
                        float highlightCircleInnerRadius = iRadarDataSet.getHighlightCircleInnerRadius();
                        float highlightCircleOuterRadius = iRadarDataSet.getHighlightCircleOuterRadius();
                        int highlightCircleFillColor = iRadarDataSet.getHighlightCircleFillColor();
                        i = i12;
                        i10 = i11;
                        drawHighlightCircle(canvas, instance, highlightCircleInnerRadius, highlightCircleOuterRadius, highlightCircleFillColor, highlightCircleStrokeColor, iRadarDataSet.getHighlightCircleStrokeWidth());
                        i12 = i + 1;
                        i11 = i10;
                    }
                }
            }
            i = i12;
            i10 = i11;
            i12 = i + 1;
            i11 = i10;
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(instance);
    }

    public void drawValue(Canvas canvas, String str, float f10, float f11, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f10, f11, this.mValuePaint);
    }

    public void drawValues(Canvas canvas) {
        float f10;
        int i;
        float f11;
        int i10;
        int i11;
        RadarEntry radarEntry;
        ValueFormatter valueFormatter;
        IRadarDataSet iRadarDataSet;
        MPPointF mPPointF;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        MPPointF instance = MPPointF.getInstance(0.0f, 0.0f);
        MPPointF instance2 = MPPointF.getInstance(0.0f, 0.0f);
        float convertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i12 = 0;
        while (i12 < ((RadarData) this.mChart.getData()).getDataSetCount()) {
            IRadarDataSet iRadarDataSet2 = (IRadarDataSet) ((RadarData) this.mChart.getData()).getDataSetByIndex(i12);
            if (!shouldDrawValues(iRadarDataSet2)) {
                i = i12;
                f10 = phaseX;
            } else {
                applyValueTextStyle(iRadarDataSet2);
                ValueFormatter valueFormatter2 = iRadarDataSet2.getValueFormatter();
                MPPointF instance3 = MPPointF.getInstance(iRadarDataSet2.getIconsOffset());
                instance3.f3610x = Utils.convertDpToPixel(instance3.f3610x);
                instance3.f3611y = Utils.convertDpToPixel(instance3.f3611y);
                int i13 = 0;
                while (i13 < iRadarDataSet2.getEntryCount()) {
                    RadarEntry radarEntry2 = (RadarEntry) iRadarDataSet2.getEntryForIndex(i13);
                    MPPointF mPPointF2 = instance3;
                    float f12 = ((float) i13) * sliceAngle * phaseX;
                    Utils.getPosition(centerOffsets, (radarEntry2.getY() - this.mChart.getYChartMin()) * factor * phaseY, this.mChart.getRotationAngle() + f12, instance);
                    if (iRadarDataSet2.isDrawValuesEnabled()) {
                        String radarLabel = valueFormatter2.getRadarLabel(radarEntry2);
                        float f13 = instance.f3610x;
                        radarEntry = radarEntry2;
                        float f14 = instance.f3611y - convertDpToPixel;
                        int valueTextColor = iRadarDataSet2.getValueTextColor(i13);
                        i10 = i13;
                        f11 = phaseX;
                        mPPointF = mPPointF2;
                        valueFormatter = valueFormatter2;
                        float f15 = f13;
                        iRadarDataSet = iRadarDataSet2;
                        float f16 = f14;
                        i11 = i12;
                        drawValue(canvas, radarLabel, f15, f16, valueTextColor);
                    } else {
                        radarEntry = radarEntry2;
                        i10 = i13;
                        iRadarDataSet = iRadarDataSet2;
                        i11 = i12;
                        f11 = phaseX;
                        mPPointF = mPPointF2;
                        valueFormatter = valueFormatter2;
                    }
                    if (radarEntry.getIcon() != null && iRadarDataSet.isDrawIconsEnabled()) {
                        Drawable icon = radarEntry.getIcon();
                        Utils.getPosition(centerOffsets, (radarEntry.getY() * factor * phaseY) + mPPointF.f3611y, this.mChart.getRotationAngle() + f12, instance2);
                        float f17 = instance2.f3611y + mPPointF.f3610x;
                        instance2.f3611y = f17;
                        Utils.drawImage(canvas, icon, (int) instance2.f3610x, (int) f17, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i13 = i10 + 1;
                    instance3 = mPPointF;
                    iRadarDataSet2 = iRadarDataSet;
                    valueFormatter2 = valueFormatter;
                    i12 = i11;
                    phaseX = f11;
                }
                i = i12;
                f10 = phaseX;
                MPPointF.recycleInstance(instance3);
            }
            i12 = i + 1;
            phaseX = f10;
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(instance);
        MPPointF.recycleInstance(instance2);
    }

    public void drawWeb(Canvas canvas) {
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        float rotationAngle = this.mChart.getRotationAngle();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidth());
        this.mWebPaint.setColor(this.mChart.getWebColor());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int skipWebLineCount = this.mChart.getSkipWebLineCount() + 1;
        int entryCount = ((IRadarDataSet) ((RadarData) this.mChart.getData()).getMaxEntryCountSet()).getEntryCount();
        MPPointF instance = MPPointF.getInstance(0.0f, 0.0f);
        for (int i = 0; i < entryCount; i += skipWebLineCount) {
            Utils.getPosition(centerOffsets, this.mChart.getYRange() * factor, (((float) i) * sliceAngle) + rotationAngle, instance);
            canvas.drawLine(centerOffsets.f3610x, centerOffsets.f3611y, instance.f3610x, instance.f3611y, this.mWebPaint);
        }
        MPPointF.recycleInstance(instance);
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidthInner());
        this.mWebPaint.setColor(this.mChart.getWebColorInner());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int i10 = this.mChart.getYAxis().mEntryCount;
        MPPointF instance2 = MPPointF.getInstance(0.0f, 0.0f);
        MPPointF instance3 = MPPointF.getInstance(0.0f, 0.0f);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (i12 < ((RadarData) this.mChart.getData()).getEntryCount()) {
                float yChartMin = (this.mChart.getYAxis().mEntries[i11] - this.mChart.getYChartMin()) * factor;
                Utils.getPosition(centerOffsets, yChartMin, (((float) i12) * sliceAngle) + rotationAngle, instance2);
                i12++;
                Utils.getPosition(centerOffsets, yChartMin, (((float) i12) * sliceAngle) + rotationAngle, instance3);
                canvas.drawLine(instance2.f3610x, instance2.f3611y, instance3.f3610x, instance3.f3611y, this.mWebPaint);
            }
        }
        MPPointF.recycleInstance(instance2);
        MPPointF.recycleInstance(instance3);
    }

    public Paint getWebPaint() {
        return this.mWebPaint;
    }

    public void initBuffers() {
    }
}
