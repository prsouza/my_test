package com.github.mikephil.charting.jobs;

import a.a;
import android.animation.ValueAnimator;
import android.view.View;
import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class AnimatedMoveViewJob extends AnimatedViewPortJob {
    private static ObjectPool<AnimatedMoveViewJob> pool;

    static {
        ObjectPool<AnimatedMoveViewJob> create = ObjectPool.create(4, new AnimatedMoveViewJob((ViewPortHandler) null, 0.0f, 0.0f, (Transformer) null, (View) null, 0.0f, 0.0f, 0));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    public AnimatedMoveViewJob(ViewPortHandler viewPortHandler, float f10, float f11, Transformer transformer, View view, float f12, float f13, long j10) {
        super(viewPortHandler, f10, f11, transformer, view, f12, f13, j10);
    }

    public static AnimatedMoveViewJob getInstance(ViewPortHandler viewPortHandler, float f10, float f11, Transformer transformer, View view, float f12, float f13, long j10) {
        AnimatedMoveViewJob animatedMoveViewJob = pool.get();
        animatedMoveViewJob.mViewPortHandler = viewPortHandler;
        animatedMoveViewJob.xValue = f10;
        animatedMoveViewJob.yValue = f11;
        animatedMoveViewJob.mTrans = transformer;
        animatedMoveViewJob.view = view;
        animatedMoveViewJob.xOrigin = f12;
        animatedMoveViewJob.yOrigin = f13;
        animatedMoveViewJob.animator.setDuration(j10);
        return animatedMoveViewJob;
    }

    public static void recycleInstance(AnimatedMoveViewJob animatedMoveViewJob) {
        pool.recycle(animatedMoveViewJob);
    }

    public ObjectPool.Poolable instantiate() {
        return new AnimatedMoveViewJob((ViewPortHandler) null, 0.0f, 0.0f, (Transformer) null, (View) null, 0.0f, 0.0f, 0);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.pts;
        float f10 = this.xOrigin;
        float f11 = this.phase;
        fArr[0] = ((this.xValue - f10) * f11) + f10;
        float f12 = this.yOrigin;
        fArr[1] = a.a(this.yValue, f12, f11, f12);
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.centerViewPort(this.pts, this.view);
    }

    public void recycleSelf() {
        recycleInstance(this);
    }
}
