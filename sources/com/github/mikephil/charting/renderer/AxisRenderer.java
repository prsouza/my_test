package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class AxisRenderer extends Renderer {
    public AxisBase mAxis;
    public Paint mAxisLabelPaint;
    public Paint mAxisLinePaint;
    public Paint mGridPaint;
    public Paint mLimitLinePaint;
    public Transformer mTrans;

    public AxisRenderer(ViewPortHandler viewPortHandler, Transformer transformer, AxisBase axisBase) {
        super(viewPortHandler);
        this.mTrans = transformer;
        this.mAxis = axisBase;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint = new Paint(1);
            Paint paint = new Paint();
            this.mGridPaint = paint;
            paint.setColor(-7829368);
            this.mGridPaint.setStrokeWidth(1.0f);
            this.mGridPaint.setStyle(Paint.Style.STROKE);
            this.mGridPaint.setAlpha(90);
            Paint paint2 = new Paint();
            this.mAxisLinePaint = paint2;
            paint2.setColor(-16777216);
            this.mAxisLinePaint.setStrokeWidth(1.0f);
            this.mAxisLinePaint.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.mLimitLinePaint = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public void computeAxis(float f10, float f11, boolean z) {
        float f12;
        double d10;
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        if (viewPortHandler != null && viewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            if (!z) {
                f12 = (float) valuesByTouchPoint2.f3609y;
                d10 = valuesByTouchPoint.f3609y;
            } else {
                f12 = (float) valuesByTouchPoint.f3609y;
                d10 = valuesByTouchPoint2.f3609y;
            }
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f10 = f12;
            f11 = (float) d10;
        }
        computeAxisValues(f10, f11);
    }

    public void computeAxisValues(float f10, float f11) {
        double d10;
        double d11;
        float f12 = f10;
        float f13 = f11;
        int labelCount = this.mAxis.getLabelCount();
        double abs = (double) Math.abs(f13 - f12);
        if (labelCount == 0 || abs <= Utils.DOUBLE_EPSILON || Double.isInfinite(abs)) {
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = new float[0];
            axisBase.mCenteredEntries = new float[0];
            axisBase.mEntryCount = 0;
            return;
        }
        double roundToNextSignificant = (double) Utils.roundToNextSignificant(abs / ((double) labelCount));
        if (this.mAxis.isGranularityEnabled() && roundToNextSignificant < ((double) this.mAxis.getGranularity())) {
            roundToNextSignificant = (double) this.mAxis.getGranularity();
        }
        double roundToNextSignificant2 = (double) Utils.roundToNextSignificant(Math.pow(10.0d, (double) ((int) Math.log10(roundToNextSignificant))));
        if (((int) (roundToNextSignificant / roundToNextSignificant2)) > 5) {
            roundToNextSignificant = Math.floor(roundToNextSignificant2 * 10.0d);
        }
        int isCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            roundToNextSignificant = (double) (((float) abs) / ((float) (labelCount - 1)));
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = labelCount;
            if (axisBase2.mEntries.length < labelCount) {
                axisBase2.mEntries = new float[labelCount];
            }
            for (int i = 0; i < labelCount; i++) {
                this.mAxis.mEntries[i] = f12;
                f12 = (float) (((double) f12) + roundToNextSignificant);
            }
        } else {
            int i10 = (roundToNextSignificant > Utils.DOUBLE_EPSILON ? 1 : (roundToNextSignificant == Utils.DOUBLE_EPSILON ? 0 : -1));
            if (i10 == 0) {
                d10 = Utils.DOUBLE_EPSILON;
            } else {
                d10 = Math.ceil(((double) f12) / roundToNextSignificant) * roundToNextSignificant;
            }
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                d10 -= roundToNextSignificant;
            }
            if (i10 == 0) {
                d11 = Utils.DOUBLE_EPSILON;
            } else {
                d11 = Utils.nextUp(Math.floor(((double) f13) / roundToNextSignificant) * roundToNextSignificant);
            }
            if (i10 != 0) {
                for (double d12 = d10; d12 <= d11; d12 += roundToNextSignificant) {
                    isCenterAxisLabelsEnabled++;
                }
            }
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = isCenterAxisLabelsEnabled;
            if (axisBase3.mEntries.length < isCenterAxisLabelsEnabled) {
                axisBase3.mEntries = new float[isCenterAxisLabelsEnabled];
            }
            for (int i11 = 0; i11 < isCenterAxisLabelsEnabled; i11++) {
                if (d10 == Utils.DOUBLE_EPSILON) {
                    d10 = 0.0d;
                }
                this.mAxis.mEntries[i11] = (float) d10;
                d10 += roundToNextSignificant;
            }
            labelCount = isCenterAxisLabelsEnabled;
        }
        if (roundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(roundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            AxisBase axisBase4 = this.mAxis;
            if (axisBase4.mCenteredEntries.length < labelCount) {
                axisBase4.mCenteredEntries = new float[labelCount];
            }
            float f14 = ((float) roundToNextSignificant) / 2.0f;
            for (int i12 = 0; i12 < labelCount; i12++) {
                AxisBase axisBase5 = this.mAxis;
                axisBase5.mCenteredEntries[i12] = axisBase5.mEntries[i12] + f14;
            }
        }
    }

    public Paint getPaintAxisLabels() {
        return this.mAxisLabelPaint;
    }

    public Paint getPaintAxisLine() {
        return this.mAxisLinePaint;
    }

    public Paint getPaintGrid() {
        return this.mGridPaint;
    }

    public Transformer getTransformer() {
        return this.mTrans;
    }

    public abstract void renderAxisLabels(Canvas canvas);

    public abstract void renderAxisLine(Canvas canvas);

    public abstract void renderGridLines(Canvas canvas);

    public abstract void renderLimitLines(Canvas canvas);
}
