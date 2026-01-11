package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

public class HorizontalBarBuffer extends BarBuffer {
    public HorizontalBarBuffer(int i, int i10, boolean z) {
        super(i, i10, z);
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
                    addBar(f10, f16, y10, f15);
                } else {
                    float f19 = -barEntry.getNegativeSum();
                    float f20 = 0.0f;
                    int i10 = 0;
                    while (i10 < yVals.length) {
                        float f21 = yVals[i10];
                        if (f21 >= 0.0f) {
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
                        addBar(f13 * f26, f23, f19 * f26, f22);
                        i10++;
                        f19 = f12;
                    }
                }
            }
        }
        reset();
    }
}
