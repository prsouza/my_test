package com.github.mikephil.charting.formatter;

import a.a;
import java.text.DecimalFormat;

public class DefaultAxisValueFormatter extends ValueFormatter {
    public int digits;
    public DecimalFormat mFormat;

    public DefaultAxisValueFormatter(int i) {
        this.digits = i;
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

    public int getDecimalDigits() {
        return this.digits;
    }

    public String getFormattedValue(float f10) {
        return this.mFormat.format((double) f10);
    }
}
