package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.android.gms.location.LocationRequest;
import java.lang.ref.WeakReference;

public class PieChartRenderer extends DataRenderer {
    public Canvas mBitmapCanvas;
    private RectF mCenterTextLastBounds = new RectF();
    private CharSequence mCenterTextLastValue;
    private StaticLayout mCenterTextLayout;
    private TextPaint mCenterTextPaint;
    public PieChart mChart;
    public WeakReference<Bitmap> mDrawBitmap;
    public Path mDrawCenterTextPathBuffer = new Path();
    public RectF mDrawHighlightedRectF = new RectF();
    private Paint mEntryLabelsPaint;
    private Path mHoleCirclePath = new Path();
    public Paint mHolePaint;
    private RectF mInnerRectBuffer = new RectF();
    private Path mPathBuffer = new Path();
    private RectF[] mRectBuffer = {new RectF(), new RectF(), new RectF()};
    public Paint mTransparentCirclePaint;
    public Paint mValueLinePaint;

    public PieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = pieChart;
        Paint paint = new Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        this.mHolePaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.mTransparentCirclePaint = paint2;
        paint2.setColor(-1);
        this.mTransparentCirclePaint.setStyle(Paint.Style.FILL);
        this.mTransparentCirclePaint.setAlpha(LocationRequest.PRIORITY_NO_POWER);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(-16777216);
        this.mCenterTextPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.mEntryLabelsPaint = paint3;
        paint3.setColor(-1);
        this.mEntryLabelsPaint.setTextAlign(Paint.Align.CENTER);
        this.mEntryLabelsPaint.setTextSize(Utils.convertDpToPixel(13.0f));
        Paint paint4 = new Paint(1);
        this.mValueLinePaint = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    public float calculateMinimumRadiusForSpacedSlice(MPPointF mPPointF, float f10, float f11, float f12, float f13, float f14, float f15) {
        MPPointF mPPointF2 = mPPointF;
        double d10 = (double) ((f14 + f15) * 0.017453292f);
        float cos = (((float) Math.cos(d10)) * f10) + mPPointF2.f3610x;
        float sin = (((float) Math.sin(d10)) * f10) + mPPointF2.f3611y;
        double d11 = (double) (((f15 / 2.0f) + f14) * 0.017453292f);
        float cos2 = (((float) Math.cos(d11)) * f10) + mPPointF2.f3610x;
        float sin2 = (((float) Math.sin(d11)) * f10) + mPPointF2.f3611y;
        double pow = Math.pow((double) (cos - f12), 2.0d);
        return (float) (((double) (f10 - ((float) (Math.tan(((180.0d - ((double) f11)) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow((double) (sin - f13), 2.0d) + pow) / 2.0d))))) - Math.sqrt(Math.pow((double) (sin2 - ((sin + f13) / 2.0f)), 2.0d) + Math.pow((double) (cos2 - ((cos + f12) / 2.0f)), 2.0d)));
    }

    public void drawCenterText(Canvas canvas) {
        float f10;
        MPPointF mPPointF;
        Canvas canvas2 = canvas;
        CharSequence centerText = this.mChart.getCenterText();
        if (this.mChart.isDrawCenterTextEnabled() && centerText != null) {
            MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
            MPPointF centerTextOffset = this.mChart.getCenterTextOffset();
            float f11 = centerCircleBox.f3610x + centerTextOffset.f3610x;
            float f12 = centerCircleBox.f3611y + centerTextOffset.f3611y;
            if (!this.mChart.isDrawHoleEnabled() || this.mChart.isDrawSlicesUnderHoleEnabled()) {
                f10 = this.mChart.getRadius();
            } else {
                f10 = (this.mChart.getHoleRadius() / 100.0f) * this.mChart.getRadius();
            }
            RectF[] rectFArr = this.mRectBuffer;
            RectF rectF = rectFArr[0];
            rectF.left = f11 - f10;
            rectF.top = f12 - f10;
            rectF.right = f11 + f10;
            rectF.bottom = f12 + f10;
            RectF rectF2 = rectFArr[1];
            rectF2.set(rectF);
            float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
            if (((double) centerTextRadiusPercent) > Utils.DOUBLE_EPSILON) {
                rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
            }
            if (!centerText.equals(this.mCenterTextLastValue) || !rectF2.equals(this.mCenterTextLastBounds)) {
                this.mCenterTextLastBounds.set(rectF2);
                this.mCenterTextLastValue = centerText;
                mPPointF = centerTextOffset;
                StaticLayout staticLayout = r3;
                StaticLayout staticLayout2 = new StaticLayout(centerText, 0, centerText.length(), this.mCenterTextPaint, (int) Math.max(Math.ceil((double) this.mCenterTextLastBounds.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.mCenterTextLayout = staticLayout;
            } else {
                mPPointF = centerTextOffset;
            }
            canvas.save();
            Path path = this.mDrawCenterTextPathBuffer;
            path.reset();
            path.addOval(rectF, Path.Direction.CW);
            canvas2.clipPath(path);
            canvas2.translate(rectF2.left, ((rectF2.height() - ((float) this.mCenterTextLayout.getHeight())) / 2.0f) + rectF2.top);
            this.mCenterTextLayout.draw(canvas2);
            canvas.restore();
            MPPointF.recycleInstance(centerCircleBox);
            MPPointF.recycleInstance(mPPointF);
        }
    }

    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (!(bitmap != null && bitmap.getWidth() == chartWidth && bitmap.getHeight() == chartHeight)) {
            if (chartWidth > 0 && chartHeight > 0) {
                bitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444);
                this.mDrawBitmap = new WeakReference<>(bitmap);
                this.mBitmapCanvas = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (IPieDataSet iPieDataSet : ((PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    public void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        float f10;
        float[] fArr;
        float f11;
        float f12;
        int i;
        RectF rectF;
        int i10;
        float f13;
        int i11;
        MPPointF mPPointF;
        RectF rectF2;
        float f14;
        int i12;
        float f15;
        float f16;
        float f17;
        int i13;
        RectF rectF3;
        RectF rectF4;
        MPPointF mPPointF2;
        int i14;
        float f18;
        MPPointF mPPointF3;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = this.mChart.getRotationAngle();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        RectF circleBox = this.mChart.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = this.mChart.getDrawAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF5 = new RectF();
        boolean z10 = z && this.mChart.isDrawRoundedSlicesEnabled();
        int i15 = 0;
        for (int i16 = 0; i16 < entryCount; i16++) {
            if (Math.abs(((PieEntry) iPieDataSet2.getEntryForIndex(i16)).getY()) > Utils.FLOAT_EPSILON) {
                i15++;
            }
        }
        if (i15 <= 1) {
            f10 = 0.0f;
        } else {
            f10 = getSliceSpace(iPieDataSet2);
        }
        int i17 = 0;
        float f19 = 0.0f;
        while (i17 < entryCount) {
            float f20 = drawAngles[i17];
            float abs = Math.abs(iPieDataSet2.getEntryForIndex(i17).getY());
            float f21 = Utils.FLOAT_EPSILON;
            if (abs > f21 && (!this.mChart.needsHighlight(i17) || z10)) {
                boolean z11 = f10 > 0.0f && f20 <= 180.0f;
                i10 = entryCount;
                this.mRenderPaint.setColor(iPieDataSet2.getColor(i17));
                float f22 = i15 == 1 ? 0.0f : f10 / (radius * 0.017453292f);
                float f23 = (((f22 / 2.0f) + f19) * phaseY) + rotationAngle;
                float f24 = (f20 - f22) * phaseY;
                float f25 = f24 < 0.0f ? 0.0f : f24;
                this.mPathBuffer.reset();
                if (z10) {
                    float f26 = radius - holeRadius2;
                    i = i17;
                    i12 = i15;
                    double d10 = (double) (f23 * 0.017453292f);
                    f12 = rotationAngle;
                    f11 = phaseX;
                    float cos = (((float) Math.cos(d10)) * f26) + centerCircleBox.f3610x;
                    float sin = (f26 * ((float) Math.sin(d10))) + centerCircleBox.f3611y;
                    rectF5.set(cos - holeRadius2, sin - holeRadius2, cos + holeRadius2, sin + holeRadius2);
                } else {
                    i = i17;
                    i12 = i15;
                    f12 = rotationAngle;
                    f11 = phaseX;
                }
                double d11 = (double) (f23 * 0.017453292f);
                float f27 = holeRadius;
                float cos2 = (((float) Math.cos(d11)) * radius) + centerCircleBox.f3610x;
                float sin2 = (((float) Math.sin(d11)) * radius) + centerCircleBox.f3611y;
                int i18 = (f25 > 360.0f ? 1 : (f25 == 360.0f ? 0 : -1));
                if (i18 < 0 || f25 % 360.0f > f21) {
                    fArr = drawAngles;
                    if (z10) {
                        this.mPathBuffer.arcTo(rectF5, f23 + 180.0f, -180.0f);
                    }
                    this.mPathBuffer.arcTo(circleBox, f23, f25);
                } else {
                    fArr = drawAngles;
                    this.mPathBuffer.addCircle(centerCircleBox.f3610x, centerCircleBox.f3611y, radius, Path.Direction.CW);
                }
                RectF rectF6 = this.mInnerRectBuffer;
                float f28 = centerCircleBox.f3610x;
                float f29 = centerCircleBox.f3611y;
                RectF rectF7 = rectF5;
                rectF6.set(f28 - f27, f29 - f27, f28 + f27, f29 + f27);
                if (!z) {
                    f16 = radius;
                    f17 = f27;
                    i13 = i12;
                    rectF3 = rectF7;
                    rectF4 = circleBox;
                    mPPointF = centerCircleBox;
                    f15 = 360.0f;
                } else if (f27 > 0.0f || z11) {
                    if (z11) {
                        int i19 = i;
                        i11 = i12;
                        float f30 = radius;
                        rectF = circleBox;
                        RectF rectF8 = rectF7;
                        f14 = f27;
                        i14 = 1;
                        f13 = radius;
                        float f31 = f23;
                        mPPointF2 = centerCircleBox;
                        float calculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, f30, f20 * phaseY, cos2, sin2, f31, f25);
                        if (calculateMinimumRadiusForSpacedSlice < 0.0f) {
                            calculateMinimumRadiusForSpacedSlice = -calculateMinimumRadiusForSpacedSlice;
                        }
                        f18 = Math.max(f14, calculateMinimumRadiusForSpacedSlice);
                    } else {
                        f13 = radius;
                        mPPointF2 = centerCircleBox;
                        f14 = f27;
                        i11 = i12;
                        rectF = circleBox;
                        i14 = 1;
                        f18 = f14;
                    }
                    float f32 = (i11 == i14 || f18 == 0.0f) ? 0.0f : f10 / (f18 * 0.017453292f);
                    float f33 = (((f32 / 2.0f) + f19) * phaseY) + f12;
                    float f34 = (f20 - f32) * phaseY;
                    if (f34 < 0.0f) {
                        f34 = 0.0f;
                    }
                    float f35 = f33 + f34;
                    if (i18 < 0 || f25 % 360.0f > f21) {
                        if (z10) {
                            float f36 = f13 - holeRadius2;
                            double d12 = (double) (0.017453292f * f35);
                            mPPointF3 = mPPointF2;
                            float cos3 = (((float) Math.cos(d12)) * f36) + mPPointF2.f3610x;
                            float sin3 = (f36 * ((float) Math.sin(d12))) + mPPointF3.f3611y;
                            rectF2 = rectF7;
                            rectF2.set(cos3 - holeRadius2, sin3 - holeRadius2, cos3 + holeRadius2, sin3 + holeRadius2);
                            this.mPathBuffer.arcTo(rectF2, f35, 180.0f);
                        } else {
                            mPPointF3 = mPPointF2;
                            rectF2 = rectF7;
                            double d13 = (double) (f35 * 0.017453292f);
                            this.mPathBuffer.lineTo((((float) Math.cos(d13)) * f18) + mPPointF3.f3610x, (f18 * ((float) Math.sin(d13))) + mPPointF3.f3611y);
                        }
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f35, -f34);
                    } else {
                        this.mPathBuffer.addCircle(mPPointF2.f3610x, mPPointF2.f3611y, f18, Path.Direction.CCW);
                        mPPointF3 = mPPointF2;
                        rectF2 = rectF7;
                    }
                    mPPointF = mPPointF3;
                    this.mPathBuffer.close();
                    this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                    f19 = (f20 * f11) + f19;
                } else {
                    f16 = radius;
                    f17 = f27;
                    i13 = i12;
                    rectF3 = rectF7;
                    f15 = 360.0f;
                    rectF4 = circleBox;
                    mPPointF = centerCircleBox;
                }
                if (f25 % f15 > f21) {
                    if (z11) {
                        float calculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(mPPointF, f13, f20 * phaseY, cos2, sin2, f23, f25);
                        double d14 = (double) (0.017453292f * ((f25 / 2.0f) + f23));
                        this.mPathBuffer.lineTo((((float) Math.cos(d14)) * calculateMinimumRadiusForSpacedSlice2) + mPPointF.f3610x, (calculateMinimumRadiusForSpacedSlice2 * ((float) Math.sin(d14))) + mPPointF.f3611y);
                    } else {
                        this.mPathBuffer.lineTo(mPPointF.f3610x, mPPointF.f3611y);
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                f19 = (f20 * f11) + f19;
            } else {
                i = i17;
                f13 = radius;
                f12 = rotationAngle;
                f11 = phaseX;
                rectF = circleBox;
                i10 = entryCount;
                fArr = drawAngles;
                f19 = (f20 * phaseX) + f19;
                i11 = i15;
                rectF2 = rectF5;
                f14 = holeRadius;
                mPPointF = centerCircleBox;
            }
            i17 = i + 1;
            iPieDataSet2 = iPieDataSet;
            holeRadius = f14;
            rectF5 = rectF2;
            centerCircleBox = mPPointF;
            i15 = i11;
            radius = f13;
            entryCount = i10;
            circleBox = rectF;
            rotationAngle = f12;
            phaseX = f11;
            drawAngles = fArr;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    public void drawEntryLabel(Canvas canvas, String str, float f10, float f11) {
        canvas.drawText(str, f10, f11, this.mEntryLabelsPaint);
    }

    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (Paint) null);
        drawCenterText(canvas);
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        boolean z;
        float[] fArr;
        float f10;
        MPPointF mPPointF;
        float f11;
        int i;
        RectF rectF;
        float f12;
        IPieDataSet dataSetByIndex;
        float f13;
        int i10;
        float f14;
        int i11;
        float f15;
        float[] fArr2;
        float f16;
        float f17;
        Highlight[] highlightArr2 = highlightArr;
        boolean z10 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        if (!z10 || !this.mChart.isDrawRoundedSlicesEnabled()) {
            float phaseX = this.mAnimator.getPhaseX();
            float phaseY = this.mAnimator.getPhaseY();
            float rotationAngle = this.mChart.getRotationAngle();
            float[] drawAngles = this.mChart.getDrawAngles();
            float[] absoluteAngles = this.mChart.getAbsoluteAngles();
            MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
            float radius = this.mChart.getRadius();
            float holeRadius = z10 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
            RectF rectF2 = this.mDrawHighlightedRectF;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i12 = 0;
            while (i12 < highlightArr2.length) {
                int x10 = (int) highlightArr2[i12].getX();
                if (x10 < drawAngles.length && (dataSetByIndex = ((PieData) this.mChart.getData()).getDataSetByIndex(highlightArr2[i12].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                    int entryCount = dataSetByIndex.getEntryCount();
                    int i13 = 0;
                    for (int i14 = 0; i14 < entryCount; i14++) {
                        if (Math.abs(((PieEntry) dataSetByIndex.getEntryForIndex(i14)).getY()) > Utils.FLOAT_EPSILON) {
                            i13++;
                        }
                    }
                    if (x10 == 0) {
                        i10 = 1;
                        f13 = 0.0f;
                    } else {
                        f13 = absoluteAngles[x10 - 1] * phaseX;
                        i10 = 1;
                    }
                    if (i13 <= i10) {
                        f14 = 0.0f;
                    } else {
                        f14 = dataSetByIndex.getSliceSpace();
                    }
                    float f18 = drawAngles[x10];
                    float selectionShift = dataSetByIndex.getSelectionShift();
                    int i15 = i12;
                    float f19 = radius + selectionShift;
                    float f20 = holeRadius;
                    rectF2.set(this.mChart.getCircleBox());
                    float f21 = -selectionShift;
                    rectF2.inset(f21, f21);
                    boolean z11 = f14 > 0.0f && f18 <= 180.0f;
                    this.mRenderPaint.setColor(dataSetByIndex.getColor(x10));
                    float f22 = i13 == 1 ? 0.0f : f14 / (radius * 0.017453292f);
                    float f23 = i13 == 1 ? 0.0f : f14 / (f19 * 0.017453292f);
                    float f24 = (((f22 / 2.0f) + f13) * phaseY) + rotationAngle;
                    float f25 = (f18 - f22) * phaseY;
                    float f26 = f25 < 0.0f ? 0.0f : f25;
                    float f27 = (((f23 / 2.0f) + f13) * phaseY) + rotationAngle;
                    float f28 = (f18 - f23) * phaseY;
                    if (f28 < 0.0f) {
                        f28 = 0.0f;
                    }
                    this.mPathBuffer.reset();
                    int i16 = (f26 > 360.0f ? 1 : (f26 == 360.0f ? 0 : -1));
                    if (i16 < 0 || f26 % 360.0f > Utils.FLOAT_EPSILON) {
                        fArr2 = drawAngles;
                        f15 = f13;
                        double d10 = (double) (f27 * 0.017453292f);
                        i11 = i13;
                        z = z10;
                        this.mPathBuffer.moveTo((((float) Math.cos(d10)) * f19) + centerCircleBox.f3610x, (f19 * ((float) Math.sin(d10))) + centerCircleBox.f3611y);
                        this.mPathBuffer.arcTo(rectF2, f27, f28);
                    } else {
                        this.mPathBuffer.addCircle(centerCircleBox.f3610x, centerCircleBox.f3611y, f19, Path.Direction.CW);
                        fArr2 = drawAngles;
                        f15 = f13;
                        i11 = i13;
                        z = z10;
                    }
                    if (z11) {
                        double d11 = (double) (f24 * 0.017453292f);
                        i = i15;
                        rectF = rectF2;
                        f11 = f20;
                        mPPointF = centerCircleBox;
                        fArr = fArr2;
                        f16 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f18 * phaseY, (((float) Math.cos(d11)) * radius) + centerCircleBox.f3610x, (((float) Math.sin(d11)) * radius) + centerCircleBox.f3611y, f24, f26);
                    } else {
                        rectF = rectF2;
                        mPPointF = centerCircleBox;
                        i = i15;
                        f11 = f20;
                        fArr = fArr2;
                        f16 = 0.0f;
                    }
                    RectF rectF3 = this.mInnerRectBuffer;
                    float f29 = mPPointF.f3610x;
                    float f30 = mPPointF.f3611y;
                    rectF3.set(f29 - f11, f30 - f11, f29 + f11, f30 + f11);
                    if (!z || (f11 <= 0.0f && !z11)) {
                        f12 = phaseX;
                        f10 = phaseY;
                        if (f26 % 360.0f > Utils.FLOAT_EPSILON) {
                            if (z11) {
                                double d12 = (double) (((f26 / 2.0f) + f24) * 0.017453292f);
                                this.mPathBuffer.lineTo((((float) Math.cos(d12)) * f16) + mPPointF.f3610x, (f16 * ((float) Math.sin(d12))) + mPPointF.f3611y);
                            } else {
                                this.mPathBuffer.lineTo(mPPointF.f3610x, mPPointF.f3611y);
                            }
                        }
                    } else {
                        if (z11) {
                            if (f16 < 0.0f) {
                                f16 = -f16;
                            }
                            f17 = Math.max(f11, f16);
                        } else {
                            f17 = f11;
                        }
                        float f31 = (i11 == 1 || f17 == 0.0f) ? 0.0f : f14 / (f17 * 0.017453292f);
                        float f32 = (((f31 / 2.0f) + f15) * phaseY) + rotationAngle;
                        float f33 = (f18 - f31) * phaseY;
                        if (f33 < 0.0f) {
                            f33 = 0.0f;
                        }
                        float f34 = f32 + f33;
                        if (i16 < 0 || f26 % 360.0f > Utils.FLOAT_EPSILON) {
                            double d13 = (double) (f34 * 0.017453292f);
                            f12 = phaseX;
                            f10 = phaseY;
                            this.mPathBuffer.lineTo((((float) Math.cos(d13)) * f17) + mPPointF.f3610x, (f17 * ((float) Math.sin(d13))) + mPPointF.f3611y);
                            this.mPathBuffer.arcTo(this.mInnerRectBuffer, f34, -f33);
                        } else {
                            this.mPathBuffer.addCircle(mPPointF.f3610x, mPPointF.f3611y, f17, Path.Direction.CCW);
                            f12 = phaseX;
                            f10 = phaseY;
                        }
                    }
                    this.mPathBuffer.close();
                    this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                } else {
                    i = i12;
                    rectF = rectF2;
                    f11 = holeRadius;
                    fArr = drawAngles;
                    z = z10;
                    f12 = phaseX;
                    f10 = phaseY;
                    mPPointF = centerCircleBox;
                }
                i12 = i + 1;
                phaseX = f12;
                rectF2 = rectF;
                holeRadius = f11;
                centerCircleBox = mPPointF;
                phaseY = f10;
                drawAngles = fArr;
                z10 = z;
                highlightArr2 = highlightArr;
            }
            MPPointF.recycleInstance(centerCircleBox);
        }
    }

    public void drawHole(Canvas canvas) {
        if (this.mChart.isDrawHoleEnabled() && this.mBitmapCanvas != null) {
            float radius = this.mChart.getRadius();
            float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
            MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
            if (Color.alpha(this.mHolePaint.getColor()) > 0) {
                this.mBitmapCanvas.drawCircle(centerCircleBox.f3610x, centerCircleBox.f3611y, holeRadius, this.mHolePaint);
            }
            if (Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
                int alpha = this.mTransparentCirclePaint.getAlpha();
                float transparentCircleRadius = (this.mChart.getTransparentCircleRadius() / 100.0f) * radius;
                this.mTransparentCirclePaint.setAlpha((int) (this.mAnimator.getPhaseY() * this.mAnimator.getPhaseX() * ((float) alpha)));
                this.mHoleCirclePath.reset();
                this.mHoleCirclePath.addCircle(centerCircleBox.f3610x, centerCircleBox.f3611y, transparentCircleRadius, Path.Direction.CW);
                this.mHoleCirclePath.addCircle(centerCircleBox.f3610x, centerCircleBox.f3611y, holeRadius, Path.Direction.CCW);
                this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
                this.mTransparentCirclePaint.setAlpha(alpha);
            }
            MPPointF.recycleInstance(centerCircleBox);
        }
    }

    public void drawRoundedSlices(Canvas canvas) {
        float f10;
        float f11;
        float[] fArr;
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            IPieDataSet dataSet = ((PieData) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i = 0;
                while (i < dataSet.getEntryCount()) {
                    float f12 = drawAngles[i];
                    if (Math.abs(dataSet.getEntryForIndex(i).getY()) > Utils.FLOAT_EPSILON) {
                        double d10 = (double) (radius - holeRadius);
                        double d11 = (double) ((rotationAngle + f12) * phaseY);
                        f10 = phaseY;
                        fArr = drawAngles;
                        f11 = rotationAngle;
                        double d12 = (double) centerCircleBox.f3610x;
                        this.mRenderPaint.setColor(dataSet.getColor(i));
                        this.mBitmapCanvas.drawCircle((float) (d12 + (Math.cos(Math.toRadians(d11)) * d10)), (float) ((Math.sin(Math.toRadians(d11)) * d10) + ((double) centerCircleBox.f3611y)), holeRadius, this.mRenderPaint);
                    } else {
                        f10 = phaseY;
                        fArr = drawAngles;
                        f11 = rotationAngle;
                    }
                    rotationAngle = (f12 * phaseX) + f11;
                    i++;
                    phaseY = f10;
                    drawAngles = fArr;
                }
                MPPointF.recycleInstance(centerCircleBox);
            }
        }
    }

    public void drawValue(Canvas canvas, String str, float f10, float f11, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f10, f11, this.mValuePaint);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawValues(android.graphics.Canvas r50) {
        /*
            r49 = this;
            r6 = r49
            r7 = r50
            com.github.mikephil.charting.charts.PieChart r0 = r6.mChart
            com.github.mikephil.charting.utils.MPPointF r8 = r0.getCenterCircleBox()
            com.github.mikephil.charting.charts.PieChart r0 = r6.mChart
            float r9 = r0.getRadius()
            com.github.mikephil.charting.charts.PieChart r0 = r6.mChart
            float r0 = r0.getRotationAngle()
            com.github.mikephil.charting.charts.PieChart r1 = r6.mChart
            float[] r10 = r1.getDrawAngles()
            com.github.mikephil.charting.charts.PieChart r1 = r6.mChart
            float[] r11 = r1.getAbsoluteAngles()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r6.mAnimator
            float r12 = r1.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r6.mAnimator
            float r13 = r1.getPhaseY()
            com.github.mikephil.charting.charts.PieChart r1 = r6.mChart
            float r1 = r1.getHoleRadius()
            float r1 = r1 * r9
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            float r1 = r9 - r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            com.github.mikephil.charting.charts.PieChart r4 = r6.mChart
            float r4 = r4.getHoleRadius()
            float r14 = r4 / r2
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = r9 / r2
            r4 = 1080452710(0x40666666, float:3.6)
            float r2 = r2 * r4
            com.github.mikephil.charting.charts.PieChart r4 = r6.mChart
            boolean r4 = r4.isDrawHoleEnabled()
            if (r4 == 0) goto L_0x007c
            float r2 = r9 * r14
            float r2 = r9 - r2
            float r2 = r2 / r3
            com.github.mikephil.charting.charts.PieChart r3 = r6.mChart
            boolean r3 = r3.isDrawSlicesUnderHoleEnabled()
            if (r3 != 0) goto L_0x007c
            com.github.mikephil.charting.charts.PieChart r3 = r6.mChart
            boolean r3 = r3.isDrawRoundedSlicesEnabled()
            if (r3 == 0) goto L_0x007c
            double r3 = (double) r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 * r0
            double r0 = (double) r1
            r15 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r17 = r8
            double r7 = (double) r9
            double r7 = r7 * r15
            double r0 = r0 / r7
            double r0 = r0 + r3
            float r0 = (float) r0
            goto L_0x007e
        L_0x007c:
            r17 = r8
        L_0x007e:
            r7 = r0
            float r8 = r9 - r2
            com.github.mikephil.charting.charts.PieChart r0 = r6.mChart
            com.github.mikephil.charting.data.ChartData r0 = r0.getData()
            r15 = r0
            com.github.mikephil.charting.data.PieData r15 = (com.github.mikephil.charting.data.PieData) r15
            java.util.List r5 = r15.getDataSets()
            float r16 = r15.getYValueSum()
            com.github.mikephil.charting.charts.PieChart r0 = r6.mChart
            boolean r18 = r0.isDrawEntryLabelsEnabled()
            r50.save()
            r0 = 1084227584(0x40a00000, float:5.0)
            float r19 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r20 = 0
            r0 = r20
            r4 = r0
        L_0x00a6:
            int r1 = r5.size()
            if (r4 >= r1) goto L_0x0420
            java.lang.Object r1 = r5.get(r4)
            r3 = r1
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r3
            boolean r21 = r3.isDrawValuesEnabled()
            if (r21 != 0) goto L_0x00d5
            if (r18 != 0) goto L_0x00d5
            r25 = r5
            r30 = r7
            r27 = r9
            r32 = r10
            r34 = r11
            r35 = r12
            r36 = r13
            r43 = r14
            r26 = r15
            r10 = r17
            r13 = r50
            r17 = r4
            goto L_0x0408
        L_0x00d5:
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r2 = r3.getXValuePosition()
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r1 = r3.getYValuePosition()
            r6.applyValueTextStyle(r3)
            r22 = r0
            android.graphics.Paint r0 = r6.mValuePaint
            r23 = r4
            java.lang.String r4 = "Q"
            int r0 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r0, r4)
            float r0 = (float) r0
            r4 = 1082130432(0x40800000, float:4.0)
            float r4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r4)
            float r24 = r4 + r0
            com.github.mikephil.charting.formatter.ValueFormatter r4 = r3.getValueFormatter()
            int r0 = r3.getEntryCount()
            r25 = r5
            android.graphics.Paint r5 = r6.mValueLinePaint
            r26 = r15
            int r15 = r3.getValueLineColor()
            r5.setColor(r15)
            android.graphics.Paint r5 = r6.mValueLinePaint
            float r15 = r3.getValueLineWidth()
            float r15 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r15)
            r5.setStrokeWidth(r15)
            float r15 = r6.getSliceSpace(r3)
            com.github.mikephil.charting.utils.MPPointF r5 = r3.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r5 = com.github.mikephil.charting.utils.MPPointF.getInstance(r5)
            r27 = r9
            float r9 = r5.f3610x
            float r9 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r9)
            r5.f3610x = r9
            float r9 = r5.f3611y
            float r9 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r9)
            r5.f3611y = r9
            r9 = r20
        L_0x0137:
            if (r9 >= r0) goto L_0x03f0
            com.github.mikephil.charting.data.Entry r28 = r3.getEntryForIndex(r9)
            r29 = r5
            r5 = r28
            com.github.mikephil.charting.data.PieEntry r5 = (com.github.mikephil.charting.data.PieEntry) r5
            if (r22 != 0) goto L_0x0148
            r28 = 0
            goto L_0x014e
        L_0x0148:
            int r28 = r22 + -1
            r28 = r11[r28]
            float r28 = r28 * r12
        L_0x014e:
            r30 = r10[r22]
            r31 = 1016003125(0x3c8efa35, float:0.017453292)
            float r32 = r8 * r31
            float r32 = r15 / r32
            r33 = 1073741824(0x40000000, float:2.0)
            float r32 = r32 / r33
            float r30 = r30 - r32
            float r30 = r30 / r33
            float r30 = r30 + r28
            float r30 = r30 * r13
            r28 = r0
            float r0 = r30 + r7
            r30 = r7
            com.github.mikephil.charting.charts.PieChart r7 = r6.mChart
            boolean r7 = r7.isUsePercentValuesEnabled()
            if (r7 == 0) goto L_0x017c
            float r7 = r5.getY()
            float r7 = r7 / r16
            r32 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r32
            goto L_0x0180
        L_0x017c:
            float r7 = r5.getY()
        L_0x0180:
            java.lang.String r7 = r4.getPieLabel(r7, r5)
            r32 = r10
            java.lang.String r10 = r5.getLabel()
            r33 = r4
            float r4 = r0 * r31
            r31 = r5
            double r4 = (double) r4
            r34 = r11
            r35 = r12
            double r11 = java.lang.Math.cos(r4)
            float r11 = (float) r11
            r36 = r13
            double r12 = java.lang.Math.sin(r4)
            float r12 = (float) r12
            if (r18 == 0) goto L_0x01a9
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r13 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE
            if (r2 != r13) goto L_0x01a9
            r13 = 1
            goto L_0x01ab
        L_0x01a9:
            r13 = r20
        L_0x01ab:
            r37 = r15
            if (r21 == 0) goto L_0x01b5
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r15 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE
            if (r1 != r15) goto L_0x01b5
            r15 = 1
            goto L_0x01b7
        L_0x01b5:
            r15 = r20
        L_0x01b7:
            r38 = r10
            if (r18 == 0) goto L_0x01c1
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r10 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE
            if (r2 != r10) goto L_0x01c1
            r10 = 1
            goto L_0x01c3
        L_0x01c1:
            r10 = r20
        L_0x01c3:
            r39 = r2
            if (r21 == 0) goto L_0x01cf
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r2 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE
            if (r1 != r2) goto L_0x01cf
            r2 = 1
            r40 = r2
            goto L_0x01d1
        L_0x01cf:
            r40 = r20
        L_0x01d1:
            if (r13 != 0) goto L_0x01ed
            if (r15 == 0) goto L_0x01d6
            goto L_0x01ed
        L_0x01d6:
            r13 = r50
            r44 = r1
            r42 = r10
            r43 = r14
            r10 = r17
            r17 = r23
            r48 = r29
            r29 = r31
            r15 = r38
            r23 = r12
            r12 = r3
            goto L_0x0338
        L_0x01ed:
            float r2 = r3.getValueLinePart1Length()
            float r41 = r3.getValueLinePart2Length()
            float r42 = r3.getValueLinePart1OffsetPercentage()
            r43 = 1120403456(0x42c80000, float:100.0)
            r44 = r1
            float r1 = r42 / r43
            r42 = r10
            com.github.mikephil.charting.charts.PieChart r10 = r6.mChart
            boolean r10 = r10.isDrawHoleEnabled()
            if (r10 == 0) goto L_0x0214
            float r10 = r27 * r14
            r43 = r14
            r14 = r27
            float r1 = a.a.a(r14, r10, r1, r10)
            goto L_0x0219
        L_0x0214:
            r43 = r14
            r14 = r27
            float r1 = r1 * r14
        L_0x0219:
            boolean r10 = r3.isValueLineVariableLength()
            if (r10 == 0) goto L_0x022d
            float r41 = r41 * r8
            double r4 = java.lang.Math.sin(r4)
            double r4 = java.lang.Math.abs(r4)
            float r4 = (float) r4
            float r41 = r41 * r4
            goto L_0x022f
        L_0x022d:
            float r41 = r41 * r8
        L_0x022f:
            float r4 = r1 * r11
            r10 = r17
            float r5 = r10.f3610x
            float r4 = r4 + r5
            float r1 = r1 * r12
            r27 = r14
            float r14 = r10.f3611y
            float r17 = r1 + r14
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r1
            float r2 = r2 * r8
            float r1 = r2 * r11
            float r45 = r1 + r5
            float r2 = r2 * r12
            float r14 = r14 + r2
            double r0 = (double) r0
            r46 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = r0 % r46
            r46 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r2 = (r0 > r46 ? 1 : (r0 == r46 ? 0 : -1))
            if (r2 < 0) goto L_0x0279
            r46 = 4643457506423603200(0x4070e00000000000, double:270.0)
            int r0 = (r0 > r46 ? 1 : (r0 == r46 ? 0 : -1))
            if (r0 > 0) goto L_0x0279
            float r0 = r45 - r41
            android.graphics.Paint r1 = r6.mValuePaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.RIGHT
            r1.setTextAlign(r2)
            if (r13 == 0) goto L_0x0273
            android.graphics.Paint r1 = r6.mEntryLabelsPaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.RIGHT
            r1.setTextAlign(r2)
        L_0x0273:
            float r1 = r0 - r19
            r41 = r0
            r5 = r1
            goto L_0x028e
        L_0x0279:
            float r41 = r45 + r41
            android.graphics.Paint r0 = r6.mValuePaint
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r1)
            if (r13 == 0) goto L_0x028b
            android.graphics.Paint r0 = r6.mEntryLabelsPaint
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r1)
        L_0x028b:
            float r0 = r41 + r19
            r5 = r0
        L_0x028e:
            int r0 = r3.getValueLineColor()
            r1 = 1122867(0x112233, float:1.573472E-39)
            if (r0 == r1) goto L_0x02ce
            boolean r0 = r3.isUsingSliceColorAsValueLineColor()
            if (r0 == 0) goto L_0x02a6
            android.graphics.Paint r0 = r6.mValueLinePaint
            int r1 = r3.getColor(r9)
            r0.setColor(r1)
        L_0x02a6:
            android.graphics.Paint r2 = r6.mValueLinePaint
            r0 = r50
            r1 = r4
            r46 = r2
            r2 = r17
            r4 = r3
            r3 = r45
            r17 = r23
            r23 = r12
            r12 = r4
            r4 = r14
            r48 = r29
            r29 = r31
            r31 = r5
            r5 = r46
            r0.drawLine(r1, r2, r3, r4, r5)
            android.graphics.Paint r5 = r6.mValueLinePaint
            r1 = r45
            r2 = r14
            r3 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L_0x02d9
        L_0x02ce:
            r17 = r23
            r48 = r29
            r29 = r31
            r31 = r5
            r23 = r12
            r12 = r3
        L_0x02d9:
            if (r13 == 0) goto L_0x0307
            if (r15 == 0) goto L_0x0307
            int r5 = r12.getValueTextColor(r9)
            r0 = r49
            r1 = r50
            r2 = r7
            r3 = r31
            r4 = r14
            r0.drawValue(r1, r2, r3, r4, r5)
            int r0 = r26.getEntryCount()
            if (r9 >= r0) goto L_0x0300
            if (r38 == 0) goto L_0x0300
            float r14 = r14 + r24
            r5 = r50
            r3 = r31
            r4 = r38
            r6.drawEntryLabel(r5, r4, r3, r14)
            goto L_0x0304
        L_0x0300:
            r5 = r50
            r4 = r38
        L_0x0304:
            r15 = r4
            r13 = r5
            goto L_0x0338
        L_0x0307:
            r5 = r50
            r3 = r31
            r4 = r38
            if (r13 == 0) goto L_0x0320
            int r0 = r26.getEntryCount()
            if (r9 >= r0) goto L_0x0304
            if (r4 == 0) goto L_0x0304
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r24 / r0
            float r0 = r0 + r14
            r6.drawEntryLabel(r5, r4, r3, r0)
            goto L_0x0304
        L_0x0320:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r15 == 0) goto L_0x0304
            float r0 = r24 / r0
            float r13 = r0 + r14
            int r14 = r12.getValueTextColor(r9)
            r0 = r49
            r1 = r50
            r2 = r7
            r15 = r4
            r4 = r13
            r13 = r5
            r5 = r14
            r0.drawValue(r1, r2, r3, r4, r5)
        L_0x0338:
            if (r42 != 0) goto L_0x033c
            if (r40 == 0) goto L_0x0399
        L_0x033c:
            float r0 = r8 * r11
            float r1 = r10.f3610x
            float r14 = r0 + r1
            float r0 = r8 * r23
            float r1 = r10.f3611y
            float r31 = r0 + r1
            android.graphics.Paint r0 = r6.mValuePaint
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            if (r42 == 0) goto L_0x0370
            if (r40 == 0) goto L_0x0370
            int r5 = r12.getValueTextColor(r9)
            r0 = r49
            r1 = r50
            r2 = r7
            r3 = r14
            r4 = r31
            r0.drawValue(r1, r2, r3, r4, r5)
            int r0 = r26.getEntryCount()
            if (r9 >= r0) goto L_0x0399
            if (r15 == 0) goto L_0x0399
            float r0 = r31 + r24
            r6.drawEntryLabel(r13, r15, r14, r0)
            goto L_0x0399
        L_0x0370:
            if (r42 == 0) goto L_0x0384
            int r0 = r26.getEntryCount()
            if (r9 >= r0) goto L_0x0399
            if (r15 == 0) goto L_0x0399
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r24 / r0
            float r0 = r0 + r31
            r6.drawEntryLabel(r13, r15, r14, r0)
            goto L_0x0399
        L_0x0384:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r40 == 0) goto L_0x0399
            float r0 = r24 / r0
            float r4 = r0 + r31
            int r5 = r12.getValueTextColor(r9)
            r0 = r49
            r1 = r50
            r2 = r7
            r3 = r14
            r0.drawValue(r1, r2, r3, r4, r5)
        L_0x0399:
            android.graphics.drawable.Drawable r0 = r29.getIcon()
            if (r0 == 0) goto L_0x03cc
            boolean r0 = r12.isDrawIconsEnabled()
            if (r0 == 0) goto L_0x03cc
            android.graphics.drawable.Drawable r1 = r29.getIcon()
            r7 = r48
            float r0 = r7.f3611y
            float r2 = r8 + r0
            float r2 = r2 * r11
            float r3 = r10.f3610x
            float r2 = r2 + r3
            float r0 = r0 + r8
            float r0 = r0 * r23
            float r3 = r10.f3611y
            float r0 = r0 + r3
            float r3 = r7.f3610x
            float r0 = r0 + r3
            int r2 = (int) r2
            int r3 = (int) r0
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r50
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
            goto L_0x03ce
        L_0x03cc:
            r7 = r48
        L_0x03ce:
            int r22 = r22 + 1
            int r9 = r9 + 1
            r5 = r7
            r3 = r12
            r23 = r17
            r0 = r28
            r7 = r30
            r4 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r15 = r37
            r2 = r39
            r14 = r43
            r1 = r44
            r17 = r10
            r10 = r32
            goto L_0x0137
        L_0x03f0:
            r30 = r7
            r32 = r10
            r34 = r11
            r35 = r12
            r36 = r13
            r43 = r14
            r10 = r17
            r17 = r23
            r13 = r50
            r7 = r5
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r7)
            r0 = r22
        L_0x0408:
            int r4 = r17 + 1
            r17 = r10
            r5 = r25
            r15 = r26
            r9 = r27
            r7 = r30
            r10 = r32
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r43
            goto L_0x00a6
        L_0x0420:
            r13 = r50
            r10 = r17
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r10)
            r50.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.PieChartRenderer.drawValues(android.graphics.Canvas):void");
    }

    public TextPaint getPaintCenterText() {
        return this.mCenterTextPaint;
    }

    public Paint getPaintEntryLabels() {
        return this.mEntryLabelsPaint;
    }

    public Paint getPaintHole() {
        return this.mHolePaint;
    }

    public Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
    }

    public float getSliceSpace(IPieDataSet iPieDataSet) {
        if (!iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled()) {
            return iPieDataSet.getSliceSpace();
        }
        if (iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((PieData) this.mChart.getData()).getYValueSum()) * 2.0f) {
            return 0.0f;
        }
        return iPieDataSet.getSliceSpace();
    }

    public void initBuffers() {
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap((Bitmap) null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }
}
