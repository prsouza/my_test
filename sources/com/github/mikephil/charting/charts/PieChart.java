package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.PieHighlighter;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.PieChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

public class PieChart extends PieRadarChartBase<PieData> {
    private float[] mAbsoluteAngles = new float[1];
    private CharSequence mCenterText = BuildConfig.FLAVOR;
    private MPPointF mCenterTextOffset = MPPointF.getInstance(0.0f, 0.0f);
    private float mCenterTextRadiusPercent = 100.0f;
    private RectF mCircleBox = new RectF();
    private float[] mDrawAngles = new float[1];
    private boolean mDrawCenterText = true;
    private boolean mDrawEntryLabels = true;
    private boolean mDrawHole = true;
    private boolean mDrawRoundedSlices = false;
    private boolean mDrawSlicesUnderHole = false;
    private float mHoleRadiusPercent = 50.0f;
    public float mMaxAngle = 360.0f;
    private float mMinAngleForSlices = 0.0f;
    public float mTransparentCircleRadiusPercent = 55.0f;
    private boolean mUsePercentValues = false;

    public PieChart(Context context) {
        super(context);
    }

    private float calcAngle(float f10) {
        return calcAngle(f10, ((PieData) this.mData).getYValueSum());
    }

    private void calcAngles() {
        int entryCount = ((PieData) this.mData).getEntryCount();
        if (this.mDrawAngles.length != entryCount) {
            this.mDrawAngles = new float[entryCount];
        } else {
            for (int i = 0; i < entryCount; i++) {
                this.mDrawAngles[i] = 0.0f;
            }
        }
        if (this.mAbsoluteAngles.length != entryCount) {
            this.mAbsoluteAngles = new float[entryCount];
        } else {
            for (int i10 = 0; i10 < entryCount; i10++) {
                this.mAbsoluteAngles[i10] = 0.0f;
            }
        }
        float yValueSum = ((PieData) this.mData).getYValueSum();
        List dataSets = ((PieData) this.mData).getDataSets();
        float f10 = this.mMinAngleForSlices;
        boolean z = f10 != 0.0f && ((float) entryCount) * f10 <= this.mMaxAngle;
        float[] fArr = new float[entryCount];
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < ((PieData) this.mData).getDataSetCount(); i12++) {
            IPieDataSet iPieDataSet = (IPieDataSet) dataSets.get(i12);
            for (int i13 = 0; i13 < iPieDataSet.getEntryCount(); i13++) {
                float calcAngle = calcAngle(Math.abs(((PieEntry) iPieDataSet.getEntryForIndex(i13)).getY()), yValueSum);
                if (z) {
                    float f13 = this.mMinAngleForSlices;
                    float f14 = calcAngle - f13;
                    if (f14 <= 0.0f) {
                        fArr[i11] = f13;
                        f11 += -f14;
                    } else {
                        fArr[i11] = calcAngle;
                        f12 += f14;
                    }
                }
                float[] fArr2 = this.mDrawAngles;
                fArr2[i11] = calcAngle;
                if (i11 == 0) {
                    this.mAbsoluteAngles[i11] = fArr2[i11];
                } else {
                    float[] fArr3 = this.mAbsoluteAngles;
                    fArr3[i11] = fArr3[i11 - 1] + fArr2[i11];
                }
                i11++;
            }
        }
        if (z) {
            for (int i14 = 0; i14 < entryCount; i14++) {
                fArr[i14] = fArr[i14] - (((fArr[i14] - this.mMinAngleForSlices) / f12) * f11);
                if (i14 == 0) {
                    this.mAbsoluteAngles[0] = fArr[0];
                } else {
                    float[] fArr4 = this.mAbsoluteAngles;
                    fArr4[i14] = fArr4[i14 - 1] + fArr[i14];
                }
            }
            this.mDrawAngles = fArr;
        }
    }

    public void calcMinMax() {
        calcAngles();
    }

    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.mData != null) {
            float diameter = getDiameter() / 2.0f;
            MPPointF centerOffsets = getCenterOffsets();
            float selectionShift = ((PieData) this.mData).getDataSet().getSelectionShift();
            RectF rectF = this.mCircleBox;
            float f10 = centerOffsets.f3610x;
            float f11 = centerOffsets.f3611y;
            rectF.set((f10 - diameter) + selectionShift, (f11 - diameter) + selectionShift, (f10 + diameter) - selectionShift, (f11 + diameter) - selectionShift);
            MPPointF.recycleInstance(centerOffsets);
        }
    }

    public float[] getAbsoluteAngles() {
        return this.mAbsoluteAngles;
    }

    public MPPointF getCenterCircleBox() {
        return MPPointF.getInstance(this.mCircleBox.centerX(), this.mCircleBox.centerY());
    }

    public CharSequence getCenterText() {
        return this.mCenterText;
    }

    public MPPointF getCenterTextOffset() {
        MPPointF mPPointF = this.mCenterTextOffset;
        return MPPointF.getInstance(mPPointF.f3610x, mPPointF.f3611y);
    }

    public float getCenterTextRadiusPercent() {
        return this.mCenterTextRadiusPercent;
    }

    public RectF getCircleBox() {
        return this.mCircleBox;
    }

    public int getDataSetIndexForIndex(int i) {
        List dataSets = ((PieData) this.mData).getDataSets();
        for (int i10 = 0; i10 < dataSets.size(); i10++) {
            if (((IPieDataSet) dataSets.get(i10)).getEntryForXValue((float) i, Float.NaN) != null) {
                return i10;
            }
        }
        return -1;
    }

    public float[] getDrawAngles() {
        return this.mDrawAngles;
    }

    public float getHoleRadius() {
        return this.mHoleRadiusPercent;
    }

    public int getIndexForAngle(float f10) {
        float normalizedAngle = Utils.getNormalizedAngle(f10 - getRotationAngle());
        int i = 0;
        while (true) {
            float[] fArr = this.mAbsoluteAngles;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > normalizedAngle) {
                return i;
            }
            i++;
        }
    }

    public float[] getMarkerPosition(Highlight highlight) {
        MPPointF centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float f10 = (radius / 10.0f) * 3.6f;
        if (isDrawHoleEnabled()) {
            f10 = (radius - (getHoleRadius() * (radius / 100.0f))) / 2.0f;
        }
        float f11 = radius - f10;
        float rotationAngle = getRotationAngle();
        int x10 = (int) highlight.getX();
        float f12 = this.mDrawAngles[x10] / 2.0f;
        double d10 = (double) f11;
        float cos = (float) ((Math.cos(Math.toRadians((double) (this.mAnimator.getPhaseY() * ((this.mAbsoluteAngles[x10] + rotationAngle) - f12)))) * d10) + ((double) centerCircleBox.f3610x));
        float phaseY = this.mAnimator.getPhaseY();
        MPPointF.recycleInstance(centerCircleBox);
        return new float[]{cos, (float) ((Math.sin(Math.toRadians((double) (phaseY * ((rotationAngle + this.mAbsoluteAngles[x10]) - f12)))) * d10) + ((double) centerCircleBox.f3611y))};
    }

    public float getMaxAngle() {
        return this.mMaxAngle;
    }

    public float getMinAngleForSlices() {
        return this.mMinAngleForSlices;
    }

    public float getRadius() {
        RectF rectF = this.mCircleBox;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.mCircleBox.height() / 2.0f);
    }

    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    public float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.mTransparentCircleRadiusPercent;
    }

    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    public void init() {
        super.init();
        this.mRenderer = new PieChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis = null;
        this.mHighlighter = new PieHighlighter(this);
    }

    public boolean isDrawCenterTextEnabled() {
        return this.mDrawCenterText;
    }

    public boolean isDrawEntryLabelsEnabled() {
        return this.mDrawEntryLabels;
    }

    public boolean isDrawHoleEnabled() {
        return this.mDrawHole;
    }

    public boolean isDrawRoundedSlicesEnabled() {
        return this.mDrawRoundedSlices;
    }

    public boolean isDrawSlicesUnderHoleEnabled() {
        return this.mDrawSlicesUnderHole;
    }

    public boolean isUsePercentValuesEnabled() {
        return this.mUsePercentValues;
    }

    public boolean needsHighlight(int i) {
        if (!valuesToHighlight()) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Highlight[] highlightArr = this.mIndicesToHighlight;
            if (i10 >= highlightArr.length) {
                return false;
            }
            if (((int) highlightArr[i10].getX()) == i) {
                return true;
            }
            i10++;
        }
    }

    public void onDetachedFromWindow() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer != null && (dataRenderer instanceof PieChartRenderer)) {
            ((PieChartRenderer) dataRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData != null) {
            this.mRenderer.drawData(canvas);
            if (valuesToHighlight()) {
                this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
            }
            this.mRenderer.drawExtras(canvas);
            this.mRenderer.drawValues(canvas);
            this.mLegendRenderer.renderLegend(canvas);
            drawDescription(canvas);
            drawMarkers(canvas);
        }
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.mCenterText = BuildConfig.FLAVOR;
        } else {
            this.mCenterText = charSequence;
        }
    }

    public void setCenterTextColor(int i) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setColor(i);
    }

    public void setCenterTextOffset(float f10, float f11) {
        this.mCenterTextOffset.f3610x = Utils.convertDpToPixel(f10);
        this.mCenterTextOffset.f3611y = Utils.convertDpToPixel(f11);
    }

    public void setCenterTextRadiusPercent(float f10) {
        this.mCenterTextRadiusPercent = f10;
    }

    public void setCenterTextSize(float f10) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(Utils.convertDpToPixel(f10));
    }

    public void setCenterTextSizePixels(float f10) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(f10);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z) {
        this.mDrawCenterText = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.mDrawEntryLabels = z;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.mDrawHole = z;
    }

    public void setDrawRoundedSlices(boolean z) {
        this.mDrawRoundedSlices = z;
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.mDrawEntryLabels = z;
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.mDrawSlicesUnderHole = z;
    }

    public void setEntryLabelColor(int i) {
        ((PieChartRenderer) this.mRenderer).getPaintEntryLabels().setColor(i);
    }

    public void setEntryLabelTextSize(float f10) {
        ((PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTextSize(Utils.convertDpToPixel(f10));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTypeface(typeface);
    }

    public void setHoleColor(int i) {
        ((PieChartRenderer) this.mRenderer).getPaintHole().setColor(i);
    }

    public void setHoleRadius(float f10) {
        this.mHoleRadiusPercent = f10;
    }

    public void setMaxAngle(float f10) {
        if (f10 > 360.0f) {
            f10 = 360.0f;
        }
        if (f10 < 90.0f) {
            f10 = 90.0f;
        }
        this.mMaxAngle = f10;
    }

    public void setMinAngleForSlices(float f10) {
        float f11 = this.mMaxAngle;
        if (f10 > f11 / 2.0f) {
            f10 = f11 / 2.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.mMinAngleForSlices = f10;
    }

    public void setTransparentCircleAlpha(int i) {
        ((PieChartRenderer) this.mRenderer).getPaintTransparentCircle().setAlpha(i);
    }

    public void setTransparentCircleColor(int i) {
        Paint paintTransparentCircle = ((PieChartRenderer) this.mRenderer).getPaintTransparentCircle();
        int alpha = paintTransparentCircle.getAlpha();
        paintTransparentCircle.setColor(i);
        paintTransparentCircle.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f10) {
        this.mTransparentCircleRadiusPercent = f10;
    }

    public void setUsePercentValues(boolean z) {
        this.mUsePercentValues = z;
    }

    private float calcAngle(float f10, float f11) {
        return (f10 / f11) * this.mMaxAngle;
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
