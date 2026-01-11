package ub;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public final class e extends BarChartRenderer {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f11928a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public float f11929b;

    public e(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
    }

    public final Path a(RectF rectF, float f10, float f11) {
        float f12 = rectF.top;
        float f13 = rectF.left;
        float f14 = rectF.right;
        float f15 = rectF.bottom;
        Path path = new Path();
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f16 = f14 - f13;
        float f17 = f15 - f12;
        float f18 = (float) 2;
        float f19 = f16 / f18;
        if (f10 > f19) {
            f10 = f19;
        }
        float f20 = f17 / f18;
        if (f11 > f20) {
            f11 = f20;
        }
        float f21 = f16 - (f18 * f10);
        float f22 = f17 - (f18 * f11);
        path.moveTo(f14, f12 + f11);
        float f23 = -f11;
        path.rQuadTo(0.0f, f23, -f10, f23);
        path.rLineTo(-f21, 0.0f);
        float f24 = -f10;
        path.rQuadTo(f24, 0.0f, f24, f11);
        path.rLineTo(0.0f, f22);
        path.rLineTo(0.0f, f11);
        path.rLineTo(f10, 0.0f);
        path.rLineTo(f21, 0.0f);
        path.rLineTo(f10, 0.0f);
        path.rLineTo(0.0f, -f11);
        path.rLineTo(0.0f, -f22);
        path.close();
        return path;
    }

    public final void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        boolean z;
        Canvas canvas2 = canvas;
        IBarDataSet iBarDataSet2 = iBarDataSet;
        int i10 = i;
        e6.e.D(canvas2, "c");
        e6.e.D(iBarDataSet2, "dataSet");
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        e6.e.C(transformer, "mChart.getTransformer(dataSet.axisDependency)");
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
        boolean z10 = true;
        boolean z11 = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            double min = Math.min(Math.ceil((double) (((float) iBarDataSet.getEntryCount()) * phaseX)), (double) iBarDataSet.getEntryCount());
            for (int i11 = 0; ((double) i11) < min; i11++) {
                float x10 = ((BarEntry) iBarDataSet2.getEntryForIndex(i11)).getX();
                RectF rectF = this.f11928a;
                rectF.left = x10 - barWidth;
                rectF.right = x10 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsLeft(this.f11928a.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.f11928a.left)) {
                        break;
                    }
                    this.f11928a.top = this.mViewPortHandler.contentTop();
                    this.f11928a.bottom = this.mViewPortHandler.contentBottom();
                    RectF rectF2 = this.mBarRect;
                    float f10 = this.f11929b;
                    canvas2.drawRoundRect(rectF2, f10, f10, this.mShadowPaint);
                }
            }
        }
        BarBuffer barBuffer = this.mBarBuffers[i10];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i10);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet2);
        transformer.pointValuesToPixel(barBuffer.buffer);
        if (iBarDataSet.getColors().size() != 1) {
            z10 = false;
        }
        if (z10) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        int i12 = 0;
        while (i12 < barBuffer.size()) {
            int i13 = i12 + 2;
            if (!this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i13])) {
                z = z10;
            } else if (this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i12])) {
                if (!z10) {
                    this.mRenderPaint.setColor(iBarDataSet2.getColor(i12 / 4));
                }
                if (iBarDataSet.getGradientColor() != null) {
                    GradientColor gradientColor = iBarDataSet.getGradientColor();
                    Paint paint = this.mRenderPaint;
                    float[] fArr = barBuffer.buffer;
                    z = z10;
                    LinearGradient linearGradient = r10;
                    LinearGradient linearGradient2 = new LinearGradient(fArr[i12], fArr[i12 + 3], fArr[i12], fArr[i12 + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR);
                    paint.setShader(linearGradient);
                } else {
                    z = z10;
                }
                if (iBarDataSet.getGradientColors() != null) {
                    Paint paint2 = this.mRenderPaint;
                    float[] fArr2 = barBuffer.buffer;
                    float f11 = fArr2[i12];
                    float f12 = fArr2[i12 + 3];
                    float f13 = fArr2[i12];
                    float f14 = fArr2[i12 + 1];
                    int i14 = i12 / 4;
                    paint2.setShader(new LinearGradient(f11, f12, f13, f14, iBarDataSet2.getGradientColor(i14).getStartColor(), iBarDataSet2.getGradientColor(i14).getEndColor(), Shader.TileMode.MIRROR));
                }
                float[] fArr3 = barBuffer.buffer;
                int i15 = i12 + 1;
                int i16 = i12 + 3;
                RectF rectF3 = new RectF(fArr3[i12], fArr3[i15], fArr3[i13], fArr3[i16]);
                float f15 = this.f11929b;
                canvas2.drawPath(a(rectF3, f15, f15), this.mRenderPaint);
                if (z11) {
                    float[] fArr4 = barBuffer.buffer;
                    RectF rectF4 = new RectF(fArr4[i12], fArr4[i15], fArr4[i13], fArr4[i16]);
                    float f16 = this.f11929b;
                    canvas2.drawPath(a(rectF4, f16, f16), this.mBarBorderPaint);
                }
            } else {
                return;
            }
            i12 += 4;
            z10 = z;
        }
    }
}
