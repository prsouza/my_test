package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class HorizontalBarChartRenderer extends BarChartRenderer {
    private RectF mBarShadowRectBuffer = new RectF();

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
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
                rectF.top = x10 - barWidth;
                rectF.bottom = x10 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (!this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    Canvas canvas2 = canvas;
                } else if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                    break;
                } else {
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
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
            int i13 = i11 + 3;
            if (this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i13])) {
                int i14 = i11 + 1;
                if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i14])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iBarDataSet2.getColor(i11 / 4));
                    }
                    float[] fArr = barBuffer.buffer;
                    int i15 = i11 + 2;
                    canvas.drawRect(fArr[i11], fArr[i14], fArr[i15], fArr[i13], this.mRenderPaint);
                    if (z10) {
                        float[] fArr2 = barBuffer.buffer;
                        canvas.drawRect(fArr2[i11], fArr2[i14], fArr2[i15], fArr2[i13], this.mBarBorderPaint);
                    }
                }
                i11 += 4;
                Canvas canvas4 = canvas;
            } else {
                return;
            }
        }
    }

    public void drawValue(Canvas canvas, String str, float f10, float f11, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f10, f11, this.mValuePaint);
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawValues(android.graphics.Canvas r41) {
        /*
            r40 = this;
            r6 = r40
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            boolean r0 = r6.isDrawingValuesAllowed(r0)
            if (r0 == 0) goto L_0x03cc
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            java.util.List r7 = r0.getDataSets()
            r0 = 1084227584(0x40a00000, float:5.0)
            float r8 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            boolean r9 = r0.isDrawValueAboveBarEnabled()
            r11 = 0
        L_0x0021:
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            com.github.mikephil.charting.data.BarData r0 = r0.getBarData()
            int r0 = r0.getDataSetCount()
            if (r11 >= r0) goto L_0x03cc
            java.lang.Object r0 = r7.get(r11)
            r12 = r0
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet r12 = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) r12
            boolean r0 = r6.shouldDrawValues(r12)
            if (r0 != 0) goto L_0x0040
            r19 = r7
            r20 = r11
            goto L_0x03c6
        L_0x0040:
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r12.getAxisDependency()
            boolean r13 = r0.isInverted(r1)
            r6.applyValueTextStyle(r12)
            android.graphics.Paint r0 = r6.mValuePaint
            java.lang.String r1 = "10"
            int r0 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r0, r1)
            float r0 = (float) r0
            r14 = 1073741824(0x40000000, float:2.0)
            float r15 = r0 / r14
            com.github.mikephil.charting.formatter.ValueFormatter r5 = r12.getValueFormatter()
            com.github.mikephil.charting.buffer.BarBuffer[] r0 = r6.mBarBuffers
            r4 = r0[r11]
            com.github.mikephil.charting.animation.ChartAnimator r0 = r6.mAnimator
            float r16 = r0.getPhaseY()
            com.github.mikephil.charting.utils.MPPointF r0 = r12.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r3 = com.github.mikephil.charting.utils.MPPointF.getInstance(r0)
            float r0 = r3.f3610x
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.f3610x = r0
            float r0 = r3.f3611y
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r3.f3611y = r0
            boolean r0 = r12.isStacked()
            r17 = 0
            if (r0 != 0) goto L_0x019f
            r2 = 0
        L_0x0089:
            float r0 = (float) r2
            float[] r1 = r4.buffer
            int r1 = r1.length
            float r1 = (float) r1
            com.github.mikephil.charting.animation.ChartAnimator r10 = r6.mAnimator
            float r10 = r10.getPhaseX()
            float r10 = r10 * r1
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0198
            float[] r0 = r4.buffer
            int r1 = r2 + 1
            r10 = r0[r1]
            int r16 = r2 + 3
            r16 = r0[r16]
            float r10 = r10 + r16
            float r10 = r10 / r14
            com.github.mikephil.charting.utils.ViewPortHandler r14 = r6.mViewPortHandler
            r0 = r0[r1]
            boolean r0 = r14.isInBoundsTop(r0)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0198
        L_0x00b2:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r14 = r4.buffer
            r14 = r14[r2]
            boolean r0 = r0.isInBoundsX(r14)
            if (r0 != 0) goto L_0x00cb
        L_0x00be:
            r25 = r2
            r19 = r7
            r20 = r11
            r23 = r15
            r7 = r3
            r11 = r4
            r15 = r5
            goto L_0x0189
        L_0x00cb:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r14 = r4.buffer
            r1 = r14[r1]
            boolean r0 = r0.isInBoundsBottom(r1)
            if (r0 != 0) goto L_0x00d8
            goto L_0x00be
        L_0x00d8:
            int r0 = r2 / 4
            com.github.mikephil.charting.data.Entry r0 = r12.getEntryForIndex(r0)
            r14 = r0
            com.github.mikephil.charting.data.BarEntry r14 = (com.github.mikephil.charting.data.BarEntry) r14
            float r16 = r14.getY()
            java.lang.String r1 = r5.getBarLabel(r14)
            android.graphics.Paint r0 = r6.mValuePaint
            int r0 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r0, r1)
            float r0 = (float) r0
            r19 = r1
            if (r9 == 0) goto L_0x00f6
            r1 = r8
            goto L_0x00f9
        L_0x00f6:
            float r1 = r0 + r8
            float r1 = -r1
        L_0x00f9:
            r20 = r3
            if (r9 == 0) goto L_0x0101
            float r3 = r0 + r8
            float r3 = -r3
            goto L_0x0102
        L_0x0101:
            r3 = r8
        L_0x0102:
            if (r13 == 0) goto L_0x0108
            float r1 = -r1
            float r1 = r1 - r0
            float r3 = -r3
            float r3 = r3 - r0
        L_0x0108:
            r21 = r1
            r22 = r3
            boolean r0 = r12.isDrawValuesEnabled()
            if (r0 == 0) goto L_0x0145
            float[] r0 = r4.buffer
            int r1 = r2 + 2
            r0 = r0[r1]
            int r1 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x011f
            r1 = r21
            goto L_0x0121
        L_0x011f:
            r1 = r22
        L_0x0121:
            float r3 = r0 + r1
            float r23 = r10 + r15
            int r0 = r2 / 2
            int r24 = r12.getValueTextColor(r0)
            r0 = r40
            r1 = r41
            r25 = r2
            r2 = r19
            r19 = r7
            r7 = r20
            r20 = r11
            r11 = r4
            r4 = r23
            r23 = r15
            r15 = r5
            r5 = r24
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L_0x0151
        L_0x0145:
            r25 = r2
            r19 = r7
            r23 = r15
            r7 = r20
            r15 = r5
            r20 = r11
            r11 = r4
        L_0x0151:
            android.graphics.drawable.Drawable r0 = r14.getIcon()
            if (r0 == 0) goto L_0x0189
            boolean r0 = r12.isDrawIconsEnabled()
            if (r0 == 0) goto L_0x0189
            android.graphics.drawable.Drawable r27 = r14.getIcon()
            float[] r0 = r11.buffer
            int r2 = r25 + 2
            r0 = r0[r2]
            int r1 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            r21 = r22
        L_0x016e:
            float r0 = r0 + r21
            float r1 = r7.f3610x
            float r0 = r0 + r1
            float r1 = r7.f3611y
            float r10 = r10 + r1
            int r0 = (int) r0
            int r1 = (int) r10
            int r30 = r27.getIntrinsicWidth()
            int r31 = r27.getIntrinsicHeight()
            r26 = r41
            r28 = r0
            r29 = r1
            com.github.mikephil.charting.utils.Utils.drawImage(r26, r27, r28, r29, r30, r31)
        L_0x0189:
            int r2 = r25 + 4
            r3 = r7
            r4 = r11
            r5 = r15
            r7 = r19
            r11 = r20
            r15 = r23
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x0089
        L_0x0198:
            r19 = r7
            r20 = r11
            r7 = r3
            goto L_0x03c3
        L_0x019f:
            r19 = r7
            r20 = r11
            r23 = r15
            r7 = r3
            r11 = r4
            r15 = r5
            com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider r0 = r6.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r12.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r10 = r0.getTransformer(r1)
            r14 = 0
            r21 = 0
        L_0x01b5:
            float r0 = (float) r14
            int r1 = r12.getEntryCount()
            float r1 = (float) r1
            com.github.mikephil.charting.animation.ChartAnimator r2 = r6.mAnimator
            float r2 = r2.getPhaseX()
            float r2 = r2 * r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x03c3
            com.github.mikephil.charting.data.Entry r0 = r12.getEntryForIndex(r14)
            r5 = r0
            com.github.mikephil.charting.data.BarEntry r5 = (com.github.mikephil.charting.data.BarEntry) r5
            int r22 = r12.getValueTextColor(r14)
            float[] r4 = r5.getYVals()
            if (r4 != 0) goto L_0x029d
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r1 = r11.buffer
            int r24 = r21 + 1
            r1 = r1[r24]
            boolean r0 = r0.isInBoundsTop(r1)
            if (r0 != 0) goto L_0x01e7
            goto L_0x03c3
        L_0x01e7:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r1 = r11.buffer
            r1 = r1[r21]
            boolean r0 = r0.isInBoundsX(r1)
            if (r0 != 0) goto L_0x01f4
            goto L_0x01b5
        L_0x01f4:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            float[] r1 = r11.buffer
            r1 = r1[r24]
            boolean r0 = r0.isInBoundsBottom(r1)
            if (r0 != 0) goto L_0x0201
            goto L_0x01b5
        L_0x0201:
            java.lang.String r2 = r15.getBarLabel(r5)
            android.graphics.Paint r0 = r6.mValuePaint
            int r0 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r0, r2)
            float r0 = (float) r0
            if (r9 == 0) goto L_0x0210
            r1 = r8
            goto L_0x0213
        L_0x0210:
            float r1 = r0 + r8
            float r1 = -r1
        L_0x0213:
            if (r9 == 0) goto L_0x0219
            float r3 = r0 + r8
            float r3 = -r3
            goto L_0x021a
        L_0x0219:
            r3 = r8
        L_0x021a:
            if (r13 == 0) goto L_0x0220
            float r1 = -r1
            float r1 = r1 - r0
            float r3 = -r3
            float r3 = r3 - r0
        L_0x0220:
            r25 = r1
            r26 = r3
            boolean r0 = r12.isDrawValuesEnabled()
            if (r0 == 0) goto L_0x0256
            float[] r0 = r11.buffer
            int r1 = r21 + 2
            r0 = r0[r1]
            float r1 = r5.getY()
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x023b
            r1 = r25
            goto L_0x023d
        L_0x023b:
            r1 = r26
        L_0x023d:
            float r3 = r0 + r1
            float[] r0 = r11.buffer
            r0 = r0[r24]
            float r27 = r0 + r23
            r0 = r40
            r1 = r41
            r28 = r14
            r14 = r4
            r4 = r27
            r27 = r5
            r5 = r22
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L_0x025b
        L_0x0256:
            r27 = r5
            r28 = r14
            r14 = r4
        L_0x025b:
            android.graphics.drawable.Drawable r0 = r27.getIcon()
            if (r0 == 0) goto L_0x03b1
            boolean r0 = r12.isDrawIconsEnabled()
            if (r0 == 0) goto L_0x03b1
            android.graphics.drawable.Drawable r30 = r27.getIcon()
            float[] r0 = r11.buffer
            int r1 = r21 + 2
            r0 = r0[r1]
            float r1 = r27.getY()
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x027a
            goto L_0x027c
        L_0x027a:
            r25 = r26
        L_0x027c:
            float r0 = r0 + r25
            float[] r1 = r11.buffer
            r1 = r1[r24]
            float r2 = r7.f3610x
            float r0 = r0 + r2
            float r2 = r7.f3611y
            float r1 = r1 + r2
            int r0 = (int) r0
            int r1 = (int) r1
            int r33 = r30.getIntrinsicWidth()
            int r34 = r30.getIntrinsicHeight()
            r29 = r41
            r31 = r0
            r32 = r1
            com.github.mikephil.charting.utils.Utils.drawImage(r29, r30, r31, r32, r33, r34)
            goto L_0x03b1
        L_0x029d:
            r27 = r5
            r28 = r14
            r14 = r4
            int r0 = r14.length
            int r5 = r0 * 2
            float[] r4 = new float[r5]
            float r0 = r27.getNegativeSum()
            float r0 = -r0
            r24 = r0
            r25 = r17
            r0 = 0
            r1 = 0
        L_0x02b2:
            if (r0 >= r5) goto L_0x02df
            r2 = r14[r1]
            int r3 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x02c9
            int r26 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r26 == 0) goto L_0x02c2
            int r26 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r26 != 0) goto L_0x02c9
        L_0x02c2:
            r39 = r24
            r24 = r2
            r2 = r39
            goto L_0x02d4
        L_0x02c9:
            if (r3 < 0) goto L_0x02d2
            float r25 = r25 + r2
            r2 = r24
            r24 = r25
            goto L_0x02d4
        L_0x02d2:
            float r2 = r24 - r2
        L_0x02d4:
            float r24 = r24 * r16
            r4[r0] = r24
            int r0 = r0 + 2
            int r1 = r1 + 1
            r24 = r2
            goto L_0x02b2
        L_0x02df:
            r10.pointValuesToPixel(r4)
            r3 = 0
        L_0x02e3:
            if (r3 >= r5) goto L_0x03b1
            int r0 = r3 / 2
            r0 = r14[r0]
            r2 = r27
            java.lang.String r1 = r15.getBarStackedLabel(r0, r2)
            android.graphics.Paint r2 = r6.mValuePaint
            int r2 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r2, r1)
            float r2 = (float) r2
            r26 = r1
            if (r9 == 0) goto L_0x02fc
            r1 = r8
            goto L_0x02ff
        L_0x02fc:
            float r1 = r2 + r8
            float r1 = -r1
        L_0x02ff:
            r29 = r5
            if (r9 == 0) goto L_0x0307
            float r5 = r2 + r8
            float r5 = -r5
            goto L_0x0308
        L_0x0307:
            r5 = r8
        L_0x0308:
            if (r13 == 0) goto L_0x030e
            float r1 = -r1
            float r1 = r1 - r2
            float r5 = -r5
            float r5 = r5 - r2
        L_0x030e:
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x031a
            int r2 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x031a
            int r2 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x031e
        L_0x031a:
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0320
        L_0x031e:
            r0 = 1
            goto L_0x0321
        L_0x0320:
            r0 = 0
        L_0x0321:
            r2 = r4[r3]
            if (r0 == 0) goto L_0x0326
            r1 = r5
        L_0x0326:
            float r5 = r2 + r1
            float[] r0 = r11.buffer
            int r1 = r21 + 1
            r1 = r0[r1]
            int r2 = r21 + 3
            r0 = r0[r2]
            float r1 = r1 + r0
            r18 = 1073741824(0x40000000, float:2.0)
            float r2 = r1 / r18
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            boolean r0 = r0.isInBoundsTop(r2)
            if (r0 != 0) goto L_0x0341
            goto L_0x03b3
        L_0x0341:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            boolean r0 = r0.isInBoundsX(r5)
            if (r0 != 0) goto L_0x034e
        L_0x0349:
            r26 = r3
            r32 = r4
            goto L_0x03a9
        L_0x034e:
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r6.mViewPortHandler
            boolean r0 = r0.isInBoundsBottom(r2)
            if (r0 != 0) goto L_0x0357
            goto L_0x0349
        L_0x0357:
            boolean r0 = r12.isDrawValuesEnabled()
            if (r0 == 0) goto L_0x0376
            float r30 = r2 + r23
            r0 = r40
            r1 = r41
            r31 = r2
            r2 = r26
            r26 = r3
            r3 = r5
            r32 = r4
            r4 = r30
            r30 = r5
            r5 = r22
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L_0x037e
        L_0x0376:
            r31 = r2
            r26 = r3
            r32 = r4
            r30 = r5
        L_0x037e:
            android.graphics.drawable.Drawable r0 = r27.getIcon()
            if (r0 == 0) goto L_0x03a9
            boolean r0 = r12.isDrawIconsEnabled()
            if (r0 == 0) goto L_0x03a9
            android.graphics.drawable.Drawable r34 = r27.getIcon()
            float r0 = r7.f3610x
            float r5 = r30 + r0
            int r0 = (int) r5
            float r1 = r7.f3611y
            float r2 = r31 + r1
            int r1 = (int) r2
            int r37 = r34.getIntrinsicWidth()
            int r38 = r34.getIntrinsicHeight()
            r33 = r41
            r35 = r0
            r36 = r1
            com.github.mikephil.charting.utils.Utils.drawImage(r33, r34, r35, r36, r37, r38)
        L_0x03a9:
            int r3 = r26 + 2
            r5 = r29
            r4 = r32
            goto L_0x02e3
        L_0x03b1:
            r18 = 1073741824(0x40000000, float:2.0)
        L_0x03b3:
            if (r14 != 0) goto L_0x03b8
            int r21 = r21 + 4
            goto L_0x03bf
        L_0x03b8:
            int r0 = r14.length
            int r0 = r0 * 4
            int r0 = r0 + r21
            r21 = r0
        L_0x03bf:
            int r14 = r28 + 1
            goto L_0x01b5
        L_0x03c3:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r7)
        L_0x03c6:
            int r11 = r20 + 1
            r7 = r19
            goto L_0x0021
        L_0x03cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.HorizontalBarChartRenderer.drawValues(android.graphics.Canvas):void");
    }

    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < this.mViewPortHandler.getScaleY() * ((float) chartInterface.getMaxVisibleCount());
    }

    public void prepareBarHighlight(float f10, float f11, float f12, float f13, Transformer transformer) {
        this.mBarRect.set(f11, f10 - f13, f12, f10 + f13);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }
}
