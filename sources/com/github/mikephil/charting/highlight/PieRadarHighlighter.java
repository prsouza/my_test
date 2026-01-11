package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

public abstract class PieRadarHighlighter<T extends PieRadarChartBase> implements IHighlighter {
    public T mChart;
    public List<Highlight> mHighlightBuffer = new ArrayList();

    public PieRadarHighlighter(T t10) {
        this.mChart = t10;
    }

    public abstract Highlight getClosestHighlight(int i, float f10, float f11);

    public Highlight getHighlight(float f10, float f11) {
        if (this.mChart.distanceToCenter(f10, f11) > this.mChart.getRadius()) {
            return null;
        }
        float angleForPoint = this.mChart.getAngleForPoint(f10, f11);
        T t10 = this.mChart;
        if (t10 instanceof PieChart) {
            angleForPoint /= t10.getAnimator().getPhaseY();
        }
        int indexForAngle = this.mChart.getIndexForAngle(angleForPoint);
        if (indexForAngle < 0 || indexForAngle >= this.mChart.getData().getMaxEntryCountSet().getEntryCount()) {
            return null;
        }
        return getClosestHighlight(indexForAngle, f10, f11);
    }
}
