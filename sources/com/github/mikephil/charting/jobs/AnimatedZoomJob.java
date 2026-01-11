package com.github.mikephil.charting.jobs;

import a.a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class AnimatedZoomJob extends AnimatedViewPortJob {
    private static ObjectPool<AnimatedZoomJob> pool;
    public Matrix mOnAnimationUpdateMatrixBuffer = new Matrix();
    public float xAxisRange;
    public YAxis yAxis;
    public float zoomCenterX;
    public float zoomCenterY;
    public float zoomOriginX;
    public float zoomOriginY;

    static {
        AnimatedZoomJob animatedZoomJob = r0;
        AnimatedZoomJob animatedZoomJob2 = new AnimatedZoomJob((ViewPortHandler) null, (View) null, (Transformer) null, (YAxis) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0);
        pool = ObjectPool.create(8, animatedZoomJob);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedZoomJob(ViewPortHandler viewPortHandler, View view, Transformer transformer, YAxis yAxis2, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j10) {
        super(viewPortHandler, f11, f12, transformer, view, f13, f14, j10);
        this.zoomCenterX = f15;
        this.zoomCenterY = f16;
        this.zoomOriginX = f17;
        this.zoomOriginY = f18;
        this.animator.addListener(this);
        this.yAxis = yAxis2;
        this.xAxisRange = f10;
    }

    public static AnimatedZoomJob getInstance(ViewPortHandler viewPortHandler, View view, Transformer transformer, YAxis yAxis2, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j10) {
        AnimatedZoomJob animatedZoomJob = pool.get();
        animatedZoomJob.mViewPortHandler = viewPortHandler;
        animatedZoomJob.xValue = f11;
        animatedZoomJob.yValue = f12;
        animatedZoomJob.mTrans = transformer;
        animatedZoomJob.view = view;
        animatedZoomJob.xOrigin = f13;
        animatedZoomJob.yOrigin = f14;
        animatedZoomJob.yAxis = yAxis2;
        animatedZoomJob.xAxisRange = f10;
        animatedZoomJob.resetAnimator();
        animatedZoomJob.animator.setDuration(j10);
        return animatedZoomJob;
    }

    public ObjectPool.Poolable instantiate() {
        return new AnimatedZoomJob((ViewPortHandler) null, (View) null, (Transformer) null, (YAxis) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.view).calculateOffsets();
        this.view.postInvalidate();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10 = this.xOrigin;
        float f11 = this.phase;
        float f12 = ((this.xValue - f10) * f11) + f10;
        float f13 = this.yOrigin;
        float a10 = a.a(this.yValue, f13, f11, f13);
        Matrix matrix = this.mOnAnimationUpdateMatrixBuffer;
        this.mViewPortHandler.setZoom(f12, a10, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, false);
        float scaleY = this.yAxis.mAxisRange / this.mViewPortHandler.getScaleY();
        float scaleX = this.xAxisRange / this.mViewPortHandler.getScaleX();
        float[] fArr = this.pts;
        float f14 = this.zoomOriginX;
        float f15 = this.phase;
        fArr[0] = (((this.zoomCenterX - (scaleX / 2.0f)) - f14) * f15) + f14;
        float f16 = this.zoomOriginY;
        fArr[1] = ((((scaleY / 2.0f) + this.zoomCenterY) - f16) * f15) + f16;
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.translate(this.pts, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, true);
    }

    public void recycleSelf() {
    }
}
