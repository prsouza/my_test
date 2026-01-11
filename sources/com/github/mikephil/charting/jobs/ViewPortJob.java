package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class ViewPortJob extends ObjectPool.Poolable implements Runnable {
    public Transformer mTrans;
    public ViewPortHandler mViewPortHandler;
    public float[] pts = new float[2];
    public View view;
    public float xValue;
    public float yValue;

    public ViewPortJob(ViewPortHandler viewPortHandler, float f10, float f11, Transformer transformer, View view2) {
        this.mViewPortHandler = viewPortHandler;
        this.xValue = f10;
        this.yValue = f11;
        this.mTrans = transformer;
        this.view = view2;
    }

    public float getXValue() {
        return this.xValue;
    }

    public float getYValue() {
        return this.yValue;
    }
}
