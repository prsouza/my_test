package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;

@Deprecated
public interface IValueFormatter {
    @Deprecated
    String getFormattedValue(float f10, Entry entry, int i, ViewPortHandler viewPortHandler);
}
