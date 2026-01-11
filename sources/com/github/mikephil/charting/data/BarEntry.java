package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.highlight.Range;

public class BarEntry extends Entry {
    private float mNegativeSum;
    private float mPositiveSum;
    private Range[] mRanges;
    private float[] mYVals;

    public BarEntry(float f10, float f11) {
        super(f10, f11);
    }

    private void calcPosNegSum() {
        float[] fArr = this.mYVals;
        if (fArr == null) {
            this.mNegativeSum = 0.0f;
            this.mPositiveSum = 0.0f;
            return;
        }
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (float f12 : fArr) {
            if (f12 <= 0.0f) {
                f10 += Math.abs(f12);
            } else {
                f11 += f12;
            }
        }
        this.mNegativeSum = f10;
        this.mPositiveSum = f11;
    }

    private static float calcSum(float[] fArr) {
        float f10 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    public void calcRanges() {
        float[] yVals = getYVals();
        if (yVals != null && yVals.length != 0) {
            this.mRanges = new Range[yVals.length];
            float f10 = -getNegativeSum();
            int i = 0;
            float f11 = 0.0f;
            while (true) {
                Range[] rangeArr = this.mRanges;
                if (i < rangeArr.length) {
                    float f12 = yVals[i];
                    if (f12 < 0.0f) {
                        float f13 = f10 - f12;
                        rangeArr[i] = new Range(f10, f13);
                        f10 = f13;
                    } else {
                        float f14 = f12 + f11;
                        rangeArr[i] = new Range(f11, f14);
                        f11 = f14;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Deprecated
    public float getBelowSum(int i) {
        return getSumBelow(i);
    }

    public float getNegativeSum() {
        return this.mNegativeSum;
    }

    public float getPositiveSum() {
        return this.mPositiveSum;
    }

    public Range[] getRanges() {
        return this.mRanges;
    }

    public float getSumBelow(int i) {
        float[] fArr = this.mYVals;
        float f10 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        int length = fArr.length - 1;
        while (length > i && length >= 0) {
            f10 += this.mYVals[length];
            length--;
        }
        return f10;
    }

    public float getY() {
        return super.getY();
    }

    public float[] getYVals() {
        return this.mYVals;
    }

    public boolean isStacked() {
        return this.mYVals != null;
    }

    public void setVals(float[] fArr) {
        setY(calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f10, float f11, Object obj) {
        super(f10, f11, obj);
    }

    public BarEntry copy() {
        BarEntry barEntry = new BarEntry(getX(), getY(), getData());
        barEntry.setVals(this.mYVals);
        return barEntry;
    }

    public BarEntry(float f10, float f11, Drawable drawable) {
        super(f10, f11, drawable);
    }

    public BarEntry(float f10, float f11, Drawable drawable, Object obj) {
        super(f10, f11, drawable, obj);
    }

    public BarEntry(float f10, float[] fArr) {
        super(f10, calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f10, float[] fArr, Object obj) {
        super(f10, calcSum(fArr), obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f10, float[] fArr, Drawable drawable) {
        super(f10, calcSum(fArr), drawable);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f10, float[] fArr, Drawable drawable, Object obj) {
        super(f10, calcSum(fArr), drawable, obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }
}
