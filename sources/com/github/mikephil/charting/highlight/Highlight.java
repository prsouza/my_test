package com.github.mikephil.charting.highlight;

import a.a;
import com.github.mikephil.charting.components.YAxis;

public class Highlight {
    private YAxis.AxisDependency axis;
    private int mDataIndex;
    private int mDataSetIndex;
    private float mDrawX;
    private float mDrawY;
    private int mStackIndex;
    private float mX;
    private float mXPx;
    private float mY;
    private float mYPx;

    public Highlight(float f10, float f11, int i) {
        this.mDataIndex = -1;
        this.mStackIndex = -1;
        this.mX = f10;
        this.mY = f11;
        this.mDataSetIndex = i;
    }

    public boolean equalTo(Highlight highlight) {
        return highlight != null && this.mDataSetIndex == highlight.mDataSetIndex && this.mX == highlight.mX && this.mStackIndex == highlight.mStackIndex && this.mDataIndex == highlight.mDataIndex;
    }

    public YAxis.AxisDependency getAxis() {
        return this.axis;
    }

    public int getDataIndex() {
        return this.mDataIndex;
    }

    public int getDataSetIndex() {
        return this.mDataSetIndex;
    }

    public float getDrawX() {
        return this.mDrawX;
    }

    public float getDrawY() {
        return this.mDrawY;
    }

    public int getStackIndex() {
        return this.mStackIndex;
    }

    public float getX() {
        return this.mX;
    }

    public float getXPx() {
        return this.mXPx;
    }

    public float getY() {
        return this.mY;
    }

    public float getYPx() {
        return this.mYPx;
    }

    public boolean isStacked() {
        return this.mStackIndex >= 0;
    }

    public void setDataIndex(int i) {
        this.mDataIndex = i;
    }

    public void setDraw(float f10, float f11) {
        this.mDrawX = f10;
        this.mDrawY = f11;
    }

    public String toString() {
        StringBuilder d10 = a.d("Highlight, x: ");
        d10.append(this.mX);
        d10.append(", y: ");
        d10.append(this.mY);
        d10.append(", dataSetIndex: ");
        d10.append(this.mDataSetIndex);
        d10.append(", stackIndex (only stacked barentry): ");
        d10.append(this.mStackIndex);
        return d10.toString();
    }

    public Highlight(float f10, int i, int i10) {
        this(f10, Float.NaN, i);
        this.mStackIndex = i10;
    }

    public Highlight(float f10, float f11, float f12, float f13, int i, YAxis.AxisDependency axisDependency) {
        this.mDataIndex = -1;
        this.mStackIndex = -1;
        this.mX = f10;
        this.mY = f11;
        this.mXPx = f12;
        this.mYPx = f13;
        this.mDataSetIndex = i;
        this.axis = axisDependency;
    }

    public Highlight(float f10, float f11, float f12, float f13, int i, int i10, YAxis.AxisDependency axisDependency) {
        this(f10, f11, f12, f13, i, axisDependency);
        this.mStackIndex = i10;
    }
}
