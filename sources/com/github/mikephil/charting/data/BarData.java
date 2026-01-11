package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import java.util.List;

public class BarData extends BarLineScatterCandleBubbleData<IBarDataSet> {
    private float mBarWidth = 0.85f;

    public BarData() {
    }

    public float getBarWidth() {
        return this.mBarWidth;
    }

    public float getGroupWidth(float f10, float f11) {
        return ((this.mBarWidth + f11) * ((float) this.mDataSets.size())) + f10;
    }

    public void groupBars(float f10, float f11, float f12) {
        BarEntry barEntry;
        if (this.mDataSets.size() > 1) {
            int entryCount = ((IBarDataSet) getMaxEntryCountSet()).getEntryCount();
            float f13 = f11 / 2.0f;
            float f14 = f12 / 2.0f;
            float f15 = this.mBarWidth / 2.0f;
            float groupWidth = getGroupWidth(f11, f12);
            for (int i = 0; i < entryCount; i++) {
                float f16 = f10 + f13;
                for (T t10 : this.mDataSets) {
                    float f17 = f16 + f14 + f15;
                    if (i < t10.getEntryCount() && (barEntry = (BarEntry) t10.getEntryForIndex(i)) != null) {
                        barEntry.setX(f17);
                    }
                    f16 = f17 + f15 + f14;
                }
                float f18 = f16 + f13;
                float f19 = groupWidth - (f18 - f10);
                if (f19 > 0.0f || f19 < 0.0f) {
                    f18 += f19;
                }
                f10 = f18;
            }
            notifyDataChanged();
            return;
        }
        throw new RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
    }

    public void setBarWidth(float f10) {
        this.mBarWidth = f10;
    }

    public BarData(IBarDataSet... iBarDataSetArr) {
        super((T[]) iBarDataSetArr);
    }

    public BarData(List<IBarDataSet> list) {
        super(list);
    }
}
