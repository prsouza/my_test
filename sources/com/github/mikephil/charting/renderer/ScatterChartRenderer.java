package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.scatter.IShapeRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class ScatterChartRenderer extends LineScatterCandleRadarRenderer {
    public ScatterDataProvider mChart;
    public float[] mPixelBuffer = new float[2];

    public ScatterChartRenderer(ScatterDataProvider scatterDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = scatterDataProvider;
    }

    public void drawData(Canvas canvas) {
        for (IScatterDataSet iScatterDataSet : this.mChart.getScatterData().getDataSets()) {
            if (iScatterDataSet.isVisible()) {
                drawDataSet(canvas, iScatterDataSet);
            }
        }
    }

    public void drawDataSet(Canvas canvas, IScatterDataSet iScatterDataSet) {
        int i;
        IScatterDataSet iScatterDataSet2 = iScatterDataSet;
        if (iScatterDataSet.getEntryCount() >= 1) {
            ViewPortHandler viewPortHandler = this.mViewPortHandler;
            Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
            float phaseY = this.mAnimator.getPhaseY();
            IShapeRenderer shapeRenderer = iScatterDataSet.getShapeRenderer();
            if (shapeRenderer == null) {
                Log.i("MISSING", "There's no IShapeRenderer specified for ScatterDataSet");
                return;
            }
            int min = (int) Math.min(Math.ceil((double) (this.mAnimator.getPhaseX() * ((float) iScatterDataSet.getEntryCount()))), (double) ((float) iScatterDataSet.getEntryCount()));
            int i10 = 0;
            while (i10 < min) {
                Entry entryForIndex = iScatterDataSet2.getEntryForIndex(i10);
                this.mPixelBuffer[0] = entryForIndex.getX();
                this.mPixelBuffer[1] = entryForIndex.getY() * phaseY;
                transformer.pointValuesToPixel(this.mPixelBuffer);
                if (viewPortHandler.isInBoundsRight(this.mPixelBuffer[0])) {
                    if (!viewPortHandler.isInBoundsLeft(this.mPixelBuffer[0]) || !viewPortHandler.isInBoundsY(this.mPixelBuffer[1])) {
                        i = i10;
                    } else {
                        this.mRenderPaint.setColor(iScatterDataSet2.getColor(i10 / 2));
                        ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                        float[] fArr = this.mPixelBuffer;
                        i = i10;
                        shapeRenderer.renderShape(canvas, iScatterDataSet, viewPortHandler2, fArr[0], fArr[1], this.mRenderPaint);
                    }
                    i10 = i + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void drawExtras(Canvas canvas) {
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        ScatterData scatterData = this.mChart.getScatterData();
        for (Highlight highlight : highlightArr) {
            IScatterDataSet iScatterDataSet = (IScatterDataSet) scatterData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iScatterDataSet != null && iScatterDataSet.isHighlightEnabled()) {
                Entry entryForXValue = iScatterDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iScatterDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), this.mAnimator.getPhaseY() * entryForXValue.getY());
                    highlight.setDraw((float) pixelForValues.f3608x, (float) pixelForValues.f3609y);
                    drawHighlightLines(canvas, (float) pixelForValues.f3608x, (float) pixelForValues.f3609y, iScatterDataSet);
                }
            }
        }
    }

    public void drawValue(Canvas canvas, String str, float f10, float f11, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f10, f11, this.mValuePaint);
    }

    public void drawValues(Canvas canvas) {
        IScatterDataSet iScatterDataSet;
        Entry entry;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getScatterData().getDataSets();
            for (int i = 0; i < this.mChart.getScatterData().getDataSetCount(); i++) {
                IScatterDataSet iScatterDataSet2 = (IScatterDataSet) dataSets.get(i);
                if (shouldDrawValues(iScatterDataSet2) && iScatterDataSet2.getEntryCount() >= 1) {
                    applyValueTextStyle(iScatterDataSet2);
                    this.mXBounds.set(this.mChart, iScatterDataSet2);
                    Transformer transformer = this.mChart.getTransformer(iScatterDataSet2.getAxisDependency());
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] generateTransformedValuesScatter = transformer.generateTransformedValuesScatter(iScatterDataSet2, phaseX, phaseY, xBounds.min, xBounds.max);
                    float convertDpToPixel = Utils.convertDpToPixel(iScatterDataSet2.getScatterShapeSize());
                    ValueFormatter valueFormatter = iScatterDataSet2.getValueFormatter();
                    MPPointF instance = MPPointF.getInstance(iScatterDataSet2.getIconsOffset());
                    instance.f3610x = Utils.convertDpToPixel(instance.f3610x);
                    instance.f3611y = Utils.convertDpToPixel(instance.f3611y);
                    int i10 = 0;
                    while (i10 < generateTransformedValuesScatter.length && this.mViewPortHandler.isInBoundsRight(generateTransformedValuesScatter[i10])) {
                        if (this.mViewPortHandler.isInBoundsLeft(generateTransformedValuesScatter[i10])) {
                            int i11 = i10 + 1;
                            if (this.mViewPortHandler.isInBoundsY(generateTransformedValuesScatter[i11])) {
                                int i12 = i10 / 2;
                                Entry entryForIndex = iScatterDataSet2.getEntryForIndex(this.mXBounds.min + i12);
                                if (iScatterDataSet2.isDrawValuesEnabled()) {
                                    String pointLabel = valueFormatter.getPointLabel(entryForIndex);
                                    float f10 = generateTransformedValuesScatter[i10];
                                    entry = entryForIndex;
                                    float f11 = generateTransformedValuesScatter[i11] - convertDpToPixel;
                                    iScatterDataSet = iScatterDataSet2;
                                    drawValue(canvas, pointLabel, f10, f11, iScatterDataSet2.getValueTextColor(i12 + this.mXBounds.min));
                                } else {
                                    entry = entryForIndex;
                                    iScatterDataSet = iScatterDataSet2;
                                }
                                if (entry.getIcon() != null && iScatterDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = entry.getIcon();
                                    Utils.drawImage(canvas, icon, (int) (generateTransformedValuesScatter[i10] + instance.f3610x), (int) (generateTransformedValuesScatter[i11] + instance.f3611y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                                i10 += 2;
                                iScatterDataSet2 = iScatterDataSet;
                            }
                        }
                        iScatterDataSet = iScatterDataSet2;
                        i10 += 2;
                        iScatterDataSet2 = iScatterDataSet;
                    }
                    MPPointF.recycleInstance(instance);
                }
            }
        }
    }

    public void initBuffers() {
    }
}
