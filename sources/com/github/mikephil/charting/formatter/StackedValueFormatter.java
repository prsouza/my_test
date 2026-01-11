package com.github.mikephil.charting.formatter;

import a.a;
import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.data.BarEntry;
import java.text.DecimalFormat;

public class StackedValueFormatter extends ValueFormatter {
    private boolean mDrawWholeStack;
    private DecimalFormat mFormat;
    private String mSuffix;

    public StackedValueFormatter(boolean z, String str, int i) {
        this.mDrawWholeStack = z;
        this.mSuffix = str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        StringBuilder d10 = a.d("###,###,###,##0");
        d10.append(stringBuffer.toString());
        this.mFormat = new DecimalFormat(d10.toString());
    }

    public String getBarStackedLabel(float f10, BarEntry barEntry) {
        float[] yVals;
        if (this.mDrawWholeStack || (yVals = barEntry.getYVals()) == null) {
            return this.mFormat.format((double) f10) + this.mSuffix;
        } else if (yVals[yVals.length - 1] != f10) {
            return BuildConfig.FLAVOR;
        } else {
            return this.mFormat.format((double) barEntry.getY()) + this.mSuffix;
        }
    }
}
