package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class BarChartRenderer extends BarLineScatterCandleBubbleRenderer {
    public Paint mBarBorderPaint;
    public BarBuffer[] mBarBuffers;
    public RectF mBarRect = new RectF();
    private RectF mBarShadowRectBuffer = new RectF();
    public BarDataProvider mChart;
    public Paint mShadowPaint;

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = barDataProvider;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.mShadowPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.mBarBorderPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    public void drawData(Canvas canvas) {
        BarData barData = this.mChart.getBarData();
        for (int i = 0; i < barData.getDataSetCount(); i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            if (iBarDataSet.isVisible()) {
                drawDataSet(canvas, iBarDataSet, i);
            }
        }
    }

    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        IBarDataSet iBarDataSet2 = iBarDataSet;
        int i10 = i;
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        int i11 = 0;
        boolean z = true;
        boolean z10 = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int min = Math.min((int) Math.ceil((double) (((float) iBarDataSet.getEntryCount()) * phaseX)), iBarDataSet.getEntryCount());
            for (int i12 = 0; i12 < min; i12++) {
                float x10 = ((BarEntry) iBarDataSet2.getEntryForIndex(i12)).getX();
                RectF rectF = this.mBarShadowRectBuffer;
                rectF.left = x10 - barWidth;
                rectF.right = x10 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (!this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    Canvas canvas2 = canvas;
                } else if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                    break;
                } else {
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        Canvas canvas3 = canvas;
        BarBuffer barBuffer = this.mBarBuffers[i10];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i10);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet2);
        transformer.pointValuesToPixel(barBuffer.buffer);
        if (iBarDataSet.getColors().size() != 1) {
            z = false;
        }
        if (z) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        while (i11 < barBuffer.size()) {
            int i13 = i11 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i13])) {
                if (this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i11])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iBarDataSet2.getColor(i11 / 4));
                    }
                    if (iBarDataSet.getGradientColor() != null) {
                        GradientColor gradientColor = iBarDataSet.getGradientColor();
                        Paint paint = this.mRenderPaint;
                        float[] fArr = barBuffer.buffer;
                        paint.setShader(new LinearGradient(fArr[i11], fArr[i11 + 3], fArr[i11], fArr[i11 + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
                    }
                    if (iBarDataSet.getGradientColors() != null) {
                        Paint paint2 = this.mRenderPaint;
                        float[] fArr2 = barBuffer.buffer;
                        float f10 = fArr2[i11];
                        float f11 = fArr2[i11 + 3];
                        float f12 = fArr2[i11];
                        float f13 = fArr2[i11 + 1];
                        int i14 = i11 / 4;
                        paint2.setShader(new LinearGradient(f10, f11, f12, f13, iBarDataSet2.getGradientColor(i14).getStartColor(), iBarDataSet2.getGradientColor(i14).getEndColor(), Shader.TileMode.MIRROR));
                    }
                    float[] fArr3 = barBuffer.buffer;
                    int i15 = i11 + 1;
                    int i16 = i11 + 3;
                    canvas.drawRect(fArr3[i11], fArr3[i15], fArr3[i13], fArr3[i16], this.mRenderPaint);
                    if (z10) {
                        float[] fArr4 = barBuffer.buffer;
                        canvas.drawRect(fArr4[i11], fArr4[i15], fArr4[i13], fArr4[i16], this.mBarBorderPaint);
                    }
                } else {
                    return;
                }
            }
            i11 += 4;
            Canvas canvas4 = canvas;
        }
    }

    public void drawExtras(Canvas canvas) {
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float f10;
        float f11;
        float f12;
        float f13;
        BarData barData = this.mChart.getBarData();
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (!(highlight.getStackIndex() >= 0 && barEntry.isStacked())) {
                        f13 = barEntry.getY();
                        f12 = 0.0f;
                    } else if (this.mChart.isHighlightFullBarEnabled()) {
                        f13 = barEntry.getPositiveSum();
                        f12 = -barEntry.getNegativeSum();
                    } else {
                        Range range = barEntry.getRanges()[highlight.getStackIndex()];
                        f11 = range.from;
                        f10 = range.to;
                        prepareBarHighlight(barEntry.getX(), f11, f10, barData.getBarWidth() / 2.0f, transformer);
                        setHighlightDrawPos(highlight, this.mBarRect);
                        canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                    }
                    f10 = f12;
                    f11 = f13;
                    prepareBarHighlight(barEntry.getX(), f11, f10, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    public void drawValue(Canvas canvas, String str, float f10, float f11, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f10, f11, this.mValuePaint);
    }

    public void drawValues(Canvas canvas) {
        boolean z;
        float f10;
        float f11;
        List list;
        boolean z10;
        MPPointF mPPointF;
        int i;
        float f12;
        boolean z11;
        Transformer transformer;
        float[] fArr;
        float f13;
        int i10;
        int i11;
        BarEntry barEntry;
        float[] fArr2;
        float f14;
        float f15;
        float f16;
        BarEntry barEntry2;
        List list2;
        int i12;
        ValueFormatter valueFormatter;
        MPPointF mPPointF2;
        float f17;
        BarEntry barEntry3;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float convertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean isDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i13 = 0;
            while (i13 < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i13);
                if (!shouldDrawValues(iBarDataSet)) {
                    list = dataSets;
                    f11 = f10;
                    z10 = z;
                } else {
                    applyValueTextStyle(iBarDataSet);
                    boolean isInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float calcTextHeight = (float) Utils.calcTextHeight(this.mValuePaint, "8");
                    float f18 = z ? -f10 : calcTextHeight + f10;
                    float f19 = z ? calcTextHeight + f10 : -f10;
                    if (isInverted) {
                        f18 = (-f18) - calcTextHeight;
                        f19 = (-f19) - calcTextHeight;
                    }
                    float f20 = f18;
                    float f21 = f19;
                    BarBuffer barBuffer = this.mBarBuffers[i13];
                    float phaseY = this.mAnimator.getPhaseY();
                    ValueFormatter valueFormatter2 = iBarDataSet.getValueFormatter();
                    MPPointF instance = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    instance.f3610x = Utils.convertDpToPixel(instance.f3610x);
                    instance.f3611y = Utils.convertDpToPixel(instance.f3611y);
                    if (iBarDataSet.isStacked()) {
                        ValueFormatter valueFormatter3 = valueFormatter2;
                        list = dataSets;
                        mPPointF = instance;
                        Transformer transformer2 = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (((float) i14) >= this.mAnimator.getPhaseX() * ((float) iBarDataSet.getEntryCount())) {
                                break;
                            }
                            BarEntry barEntry4 = (BarEntry) iBarDataSet.getEntryForIndex(i14);
                            float[] yVals = barEntry4.getYVals();
                            float[] fArr3 = barBuffer.buffer;
                            float f22 = (fArr3[i15] + fArr3[i15 + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i14);
                            if (yVals != null) {
                                BarEntry barEntry5 = barEntry4;
                                i = i14;
                                f12 = f10;
                                z11 = z;
                                fArr = yVals;
                                transformer = transformer2;
                                float f23 = f22;
                                int length = fArr.length * 2;
                                float[] fArr4 = new float[length];
                                float f24 = -barEntry5.getNegativeSum();
                                float f25 = 0.0f;
                                int i16 = 0;
                                int i17 = 0;
                                while (i16 < length) {
                                    float f26 = fArr[i17];
                                    int i18 = (f26 > 0.0f ? 1 : (f26 == 0.0f ? 0 : -1));
                                    if (i18 == 0 && (f25 == 0.0f || f24 == 0.0f)) {
                                        float f27 = f24;
                                        f24 = f26;
                                        f15 = f27;
                                    } else if (i18 >= 0) {
                                        f25 += f26;
                                        f15 = f24;
                                        f24 = f25;
                                    } else {
                                        f15 = f24 - f26;
                                    }
                                    fArr4[i16 + 1] = f24 * phaseY;
                                    i16 += 2;
                                    i17++;
                                    f24 = f15;
                                }
                                transformer.pointValuesToPixel(fArr4);
                                int i19 = 0;
                                while (i19 < length) {
                                    float f28 = fArr[i19 / 2];
                                    float f29 = fArr4[i19 + 1] + (((f28 > 0.0f ? 1 : (f28 == 0.0f ? 0 : -1)) == 0 && (f24 > 0.0f ? 1 : (f24 == 0.0f ? 0 : -1)) == 0 && (f25 > 0.0f ? 1 : (f25 == 0.0f ? 0 : -1)) > 0) || (f28 > 0.0f ? 1 : (f28 == 0.0f ? 0 : -1)) < 0 ? f21 : f20);
                                    int i20 = i19;
                                    if (!this.mViewPortHandler.isInBoundsRight(f23)) {
                                        break;
                                    }
                                    if (!this.mViewPortHandler.isInBoundsY(f29) || !this.mViewPortHandler.isInBoundsLeft(f23)) {
                                        i10 = length;
                                        f13 = f23;
                                        i11 = i20;
                                        barEntry = barEntry5;
                                        fArr2 = fArr4;
                                    } else {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            BarEntry barEntry6 = barEntry5;
                                            f14 = f29;
                                            i11 = i20;
                                            barEntry = barEntry6;
                                            fArr2 = fArr4;
                                            i10 = length;
                                            f13 = f23;
                                            drawValue(canvas, valueFormatter3.getBarStackedLabel(f28, barEntry6), f23, f14, valueTextColor);
                                        } else {
                                            f14 = f29;
                                            i10 = length;
                                            f13 = f23;
                                            i11 = i20;
                                            barEntry = barEntry5;
                                            fArr2 = fArr4;
                                        }
                                        if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon = barEntry.getIcon();
                                            Utils.drawImage(canvas, icon, (int) (f13 + mPPointF.f3610x), (int) (f14 + mPPointF.f3611y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                        }
                                    }
                                    i19 = i11 + 2;
                                    fArr4 = fArr2;
                                    barEntry5 = barEntry;
                                    length = i10;
                                    f23 = f13;
                                }
                            } else if (!this.mViewPortHandler.isInBoundsRight(f22)) {
                                break;
                            } else {
                                float[] fArr5 = yVals;
                                int i21 = i15 + 1;
                                if (!this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i21]) || !this.mViewPortHandler.isInBoundsLeft(f22)) {
                                    transformer2 = transformer2;
                                    z = z;
                                    f10 = f10;
                                    i14 = i14;
                                } else {
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        f16 = f22;
                                        f12 = f10;
                                        fArr = fArr5;
                                        barEntry2 = barEntry4;
                                        i = i14;
                                        z11 = z;
                                        transformer = transformer2;
                                        drawValue(canvas, valueFormatter3.getBarLabel(barEntry4), f16, barBuffer.buffer[i21] + (barEntry4.getY() >= 0.0f ? f20 : f21), valueTextColor);
                                    } else {
                                        f16 = f22;
                                        i = i14;
                                        f12 = f10;
                                        z11 = z;
                                        fArr = fArr5;
                                        barEntry2 = barEntry4;
                                        transformer = transformer2;
                                    }
                                    if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon2 = barEntry2.getIcon();
                                        Utils.drawImage(canvas, icon2, (int) (mPPointF.f3610x + f16), (int) (barBuffer.buffer[i21] + (barEntry2.getY() >= 0.0f ? f20 : f21) + mPPointF.f3611y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                    }
                                }
                            }
                            if (fArr == null) {
                                i15 += 4;
                            } else {
                                i15 = (fArr.length * 4) + i15;
                            }
                            i14 = i + 1;
                            transformer2 = transformer;
                            z = z11;
                            f10 = f12;
                        }
                    } else {
                        int i22 = 0;
                        while (true) {
                            if (((float) i22) >= this.mAnimator.getPhaseX() * ((float) barBuffer.buffer.length)) {
                                break;
                            }
                            float[] fArr6 = barBuffer.buffer;
                            float f30 = (fArr6[i22] + fArr6[i22 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsRight(f30)) {
                                break;
                            }
                            int i23 = i22 + 1;
                            if (!this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i23]) || !this.mViewPortHandler.isInBoundsLeft(f30)) {
                                i12 = i22;
                                valueFormatter = valueFormatter2;
                                list2 = dataSets;
                                mPPointF2 = instance;
                            } else {
                                int i24 = i22 / 4;
                                BarEntry barEntry7 = (BarEntry) iBarDataSet.getEntryForIndex(i24);
                                float y10 = barEntry7.getY();
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    String barLabel = valueFormatter2.getBarLabel(barEntry7);
                                    int i25 = (y10 > 0.0f ? 1 : (y10 == 0.0f ? 0 : -1));
                                    float[] fArr7 = barBuffer.buffer;
                                    barEntry3 = barEntry7;
                                    f17 = f30;
                                    String str = barLabel;
                                    i12 = i22;
                                    list2 = dataSets;
                                    mPPointF2 = instance;
                                    float f31 = i25 >= 0 ? fArr7[i23] + f20 : fArr7[i22 + 3] + f21;
                                    valueFormatter = valueFormatter2;
                                    drawValue(canvas, str, f17, f31, iBarDataSet.getValueTextColor(i24));
                                } else {
                                    barEntry3 = barEntry7;
                                    f17 = f30;
                                    i12 = i22;
                                    valueFormatter = valueFormatter2;
                                    list2 = dataSets;
                                    mPPointF2 = instance;
                                }
                                if (barEntry3.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon3 = barEntry3.getIcon();
                                    Utils.drawImage(canvas, icon3, (int) (f17 + mPPointF2.f3610x), (int) ((y10 >= 0.0f ? barBuffer.buffer[i23] + f20 : barBuffer.buffer[i12 + 3] + f21) + mPPointF2.f3611y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            }
                            i22 = i12 + 4;
                            instance = mPPointF2;
                            valueFormatter2 = valueFormatter;
                            dataSets = list2;
                        }
                        list = dataSets;
                        mPPointF = instance;
                    }
                    f11 = f10;
                    z10 = z;
                    MPPointF.recycleInstance(mPPointF);
                }
                i13++;
                isDrawValueAboveBarEnabled = z10;
                dataSets = list;
                convertDpToPixel = f11;
            }
        }
    }

    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    public void prepareBarHighlight(float f10, float f11, float f12, float f13, Transformer transformer) {
        this.mBarRect.set(f10 - f13, f11, f10 + f13, f12);
        transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }
}
