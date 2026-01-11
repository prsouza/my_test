package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

public class RadarHighlighter extends PieRadarHighlighter<RadarChart> {
    public RadarHighlighter(RadarChart radarChart) {
        super(radarChart);
    }

    public Highlight getClosestHighlight(int i, float f10, float f11) {
        List<Highlight> highlightsAtIndex = getHighlightsAtIndex(i);
        float distanceToCenter = ((RadarChart) this.mChart).distanceToCenter(f10, f11) / ((RadarChart) this.mChart).getFactor();
        Highlight highlight = null;
        float f12 = Float.MAX_VALUE;
        for (int i10 = 0; i10 < highlightsAtIndex.size(); i10++) {
            Highlight highlight2 = highlightsAtIndex.get(i10);
            float abs = Math.abs(highlight2.getY() - distanceToCenter);
            if (abs < f12) {
                highlight = highlight2;
                f12 = abs;
            }
        }
        return highlight;
    }

    public List<Highlight> getHighlightsAtIndex(int i) {
        int i10 = i;
        this.mHighlightBuffer.clear();
        float phaseX = ((RadarChart) this.mChart).getAnimator().getPhaseX();
        float phaseY = ((RadarChart) this.mChart).getAnimator().getPhaseY();
        float sliceAngle = ((RadarChart) this.mChart).getSliceAngle();
        float factor = ((RadarChart) this.mChart).getFactor();
        MPPointF instance = MPPointF.getInstance(0.0f, 0.0f);
        int i11 = 0;
        while (i11 < ((RadarData) ((RadarChart) this.mChart).getData()).getDataSetCount()) {
            IDataSet dataSetByIndex = ((RadarData) ((RadarChart) this.mChart).getData()).getDataSetByIndex(i11);
            Entry entryForIndex = dataSetByIndex.getEntryForIndex(i10);
            float f10 = (float) i10;
            Utils.getPosition(((RadarChart) this.mChart).getCenterOffsets(), (entryForIndex.getY() - ((RadarChart) this.mChart).getYChartMin()) * factor * phaseY, ((RadarChart) this.mChart).getRotationAngle() + (sliceAngle * f10 * phaseX), instance);
            List<Highlight> list = this.mHighlightBuffer;
            Highlight highlight = r8;
            Highlight highlight2 = new Highlight(f10, entryForIndex.getY(), instance.f3610x, instance.f3611y, i11, dataSetByIndex.getAxisDependency());
            list.add(highlight);
            i11++;
            i10 = i;
        }
        return this.mHighlightBuffer;
    }
}
