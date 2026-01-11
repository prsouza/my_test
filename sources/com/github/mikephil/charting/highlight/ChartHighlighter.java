package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import java.util.ArrayList;
import java.util.List;

public class ChartHighlighter<T extends BarLineScatterCandleBubbleDataProvider> implements IHighlighter {
    public T mChart;
    public List<Highlight> mHighlightBuffer = new ArrayList();

    public ChartHighlighter(T t10) {
        this.mChart = t10;
    }

    public List<Highlight> buildHighlights(IDataSet iDataSet, int i, float f10, DataSet.Rounding rounding) {
        Entry entryForXValue;
        ArrayList arrayList = new ArrayList();
        List<Entry> entriesForXValue = iDataSet.getEntriesForXValue(f10);
        if (entriesForXValue.size() == 0 && (entryForXValue = iDataSet.getEntryForXValue(f10, Float.NaN, rounding)) != null) {
            entriesForXValue = iDataSet.getEntriesForXValue(entryForXValue.getX());
        }
        if (entriesForXValue.size() == 0) {
            return arrayList;
        }
        for (Entry entry : entriesForXValue) {
            MPPointD pixelForValues = this.mChart.getTransformer(iDataSet.getAxisDependency()).getPixelForValues(entry.getX(), entry.getY());
            arrayList.add(new Highlight(entry.getX(), entry.getY(), (float) pixelForValues.f3608x, (float) pixelForValues.f3609y, i, iDataSet.getAxisDependency()));
        }
        return arrayList;
    }

    public Highlight getClosestHighlightByPixel(List<Highlight> list, float f10, float f11, YAxis.AxisDependency axisDependency, float f12) {
        Highlight highlight = null;
        for (int i = 0; i < list.size(); i++) {
            Highlight highlight2 = list.get(i);
            if (axisDependency == null || highlight2.getAxis() == axisDependency) {
                float distance = getDistance(f10, f11, highlight2.getXPx(), highlight2.getYPx());
                if (distance < f12) {
                    highlight = highlight2;
                    f12 = distance;
                }
            }
        }
        return highlight;
    }

    public BarLineScatterCandleBubbleData getData() {
        return this.mChart.getData();
    }

    public float getDistance(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot((double) (f10 - f12), (double) (f11 - f13));
    }

    public Highlight getHighlight(float f10, float f11) {
        MPPointD valsForTouch = getValsForTouch(f10, f11);
        MPPointD.recycleInstance(valsForTouch);
        return getHighlightForX((float) valsForTouch.f3608x, f10, f11);
    }

    public Highlight getHighlightForX(float f10, float f11, float f12) {
        List<Highlight> highlightsAtXValue = getHighlightsAtXValue(f10, f11, f12);
        if (highlightsAtXValue.isEmpty()) {
            return null;
        }
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        float minimumDistance = getMinimumDistance(highlightsAtXValue, f12, axisDependency);
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        return getClosestHighlightByPixel(highlightsAtXValue, f11, f12, minimumDistance < getMinimumDistance(highlightsAtXValue, f12, axisDependency2) ? axisDependency : axisDependency2, this.mChart.getMaxHighlightDistance());
    }

    public float getHighlightPos(Highlight highlight) {
        return highlight.getYPx();
    }

    public List<Highlight> getHighlightsAtXValue(float f10, float f11, float f12) {
        this.mHighlightBuffer.clear();
        BarLineScatterCandleBubbleData data = getData();
        if (data == null) {
            return this.mHighlightBuffer;
        }
        int dataSetCount = data.getDataSetCount();
        for (int i = 0; i < dataSetCount; i++) {
            IDataSet dataSetByIndex = data.getDataSetByIndex(i);
            if (dataSetByIndex.isHighlightEnabled()) {
                this.mHighlightBuffer.addAll(buildHighlights(dataSetByIndex, i, f10, DataSet.Rounding.CLOSEST));
            }
        }
        return this.mHighlightBuffer;
    }

    public float getMinimumDistance(List<Highlight> list, float f10, YAxis.AxisDependency axisDependency) {
        float f11 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            Highlight highlight = list.get(i);
            if (highlight.getAxis() == axisDependency) {
                float abs = Math.abs(getHighlightPos(highlight) - f10);
                if (abs < f11) {
                    f11 = abs;
                }
            }
        }
        return f11;
    }

    public MPPointD getValsForTouch(float f10, float f11) {
        return this.mChart.getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(f10, f11);
    }
}
