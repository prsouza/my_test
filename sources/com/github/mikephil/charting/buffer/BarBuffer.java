package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

public class BarBuffer extends AbstractBuffer<IBarDataSet> {
    public float mBarWidth = 1.0f;
    public boolean mContainsStacks;
    public int mDataSetCount;
    public int mDataSetIndex = 0;
    public boolean mInverted = false;

    public BarBuffer(int i, int i10, boolean z) {
        super(i);
        this.mDataSetCount = i10;
        this.mContainsStacks = z;
    }

    public void addBar(float f10, float f11, float f12, float f13) {
        float[] fArr = this.buffer;
        int i = this.index;
        int i10 = i + 1;
        this.index = i10;
        fArr[i] = f10;
        int i11 = i10 + 1;
        this.index = i11;
        fArr[i10] = f11;
        int i12 = i11 + 1;
        this.index = i12;
        fArr[i11] = f12;
        this.index = i12 + 1;
        fArr[i12] = f13;
    }

    public void setBarWidth(float f10) {
        this.mBarWidth = f10;
    }

    public void setDataSet(int i) {
        this.mDataSetIndex = i;
    }

    public void setInverted(boolean z) {
        this.mInverted = z;
    }

    public void feed(IBarDataSet iBarDataSet) {
        float f10;
        float f11;
        float f12;
        float f13;
        float entryCount = ((float) iBarDataSet.getEntryCount()) * this.phaseX;
        float f14 = this.mBarWidth / 2.0f;
        for (int i = 0; ((float) i) < entryCount; i++) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i);
            if (barEntry != null) {
                float x10 = barEntry.getX();
                float y10 = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                if (!this.mContainsStacks || yVals == null) {
                    float f15 = x10 - f14;
                    float f16 = x10 + f14;
                    if (this.mInverted) {
                        f10 = y10 >= 0.0f ? y10 : 0.0f;
                        if (y10 > 0.0f) {
                            y10 = 0.0f;
                        }
                    } else {
                        float f17 = y10 >= 0.0f ? y10 : 0.0f;
                        if (y10 > 0.0f) {
                            y10 = 0.0f;
                        }
                        float f18 = y10;
                        y10 = f17;
                        f10 = f18;
                    }
                    if (y10 > 0.0f) {
                        y10 *= this.phaseY;
                    } else {
                        f10 *= this.phaseY;
                    }
                    addBar(f15, y10, f16, f10);
                } else {
                    float f19 = -barEntry.getNegativeSum();
                    float f20 = 0.0f;
                    int i10 = 0;
                    while (i10 < yVals.length) {
                        float f21 = yVals[i10];
                        int i11 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
                        if (i11 == 0 && (f20 == 0.0f || f19 == 0.0f)) {
                            f11 = f21;
                            f12 = f19;
                            f19 = f11;
                        } else if (i11 >= 0) {
                            f11 = f21 + f20;
                            f12 = f19;
                            f19 = f20;
                            f20 = f11;
                        } else {
                            f11 = Math.abs(f21) + f19;
                            f12 = Math.abs(f21) + f19;
                        }
                        float f22 = x10 - f14;
                        float f23 = x10 + f14;
                        if (this.mInverted) {
                            f13 = f19 >= f11 ? f19 : f11;
                            if (f19 > f11) {
                                f19 = f11;
                            }
                        } else {
                            float f24 = f19 >= f11 ? f19 : f11;
                            if (f19 > f11) {
                                f19 = f11;
                            }
                            float f25 = f19;
                            f19 = f24;
                            f13 = f25;
                        }
                        float f26 = this.phaseY;
                        addBar(f22, f19 * f26, f23, f13 * f26);
                        i10++;
                        f19 = f12;
                    }
                }
            }
        }
        reset();
    }
}
