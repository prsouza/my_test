package com.github.mikephil.charting.data;

import android.graphics.Typeface;
import android.util.Log;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.ArrayList;
import java.util.List;

public abstract class ChartData<T extends IDataSet<? extends Entry>> {
    public List<T> mDataSets;
    public float mLeftAxisMax;
    public float mLeftAxisMin;
    public float mRightAxisMax;
    public float mRightAxisMin;
    public float mXMax;
    public float mXMin;
    public float mYMax;
    public float mYMin;

    public ChartData() {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = new ArrayList();
    }

    private List<T> arrayToList(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T add : tArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public void addDataSet(T t10) {
        if (t10 != null) {
            calcMinMax(t10);
            this.mDataSets.add(t10);
        }
    }

    public void addEntry(Entry entry, int i) {
        if (this.mDataSets.size() <= i || i < 0) {
            Log.e("addEntry", "Cannot add Entry because dataSetIndex too high or too low.");
            return;
        }
        IDataSet iDataSet = (IDataSet) this.mDataSets.get(i);
        if (iDataSet.addEntry(entry)) {
            calcMinMax(entry, iDataSet.getAxisDependency());
        }
    }

    public void calcMinMax() {
        List<T> list = this.mDataSets;
        if (list != null) {
            this.mYMax = -3.4028235E38f;
            this.mYMin = Float.MAX_VALUE;
            this.mXMax = -3.4028235E38f;
            this.mXMin = Float.MAX_VALUE;
            for (T calcMinMax : list) {
                calcMinMax(calcMinMax);
            }
            this.mLeftAxisMax = -3.4028235E38f;
            this.mLeftAxisMin = Float.MAX_VALUE;
            this.mRightAxisMax = -3.4028235E38f;
            this.mRightAxisMin = Float.MAX_VALUE;
            IDataSet firstLeft = getFirstLeft(this.mDataSets);
            if (firstLeft != null) {
                this.mLeftAxisMax = firstLeft.getYMax();
                this.mLeftAxisMin = firstLeft.getYMin();
                for (T t10 : this.mDataSets) {
                    if (t10.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                        if (t10.getYMin() < this.mLeftAxisMin) {
                            this.mLeftAxisMin = t10.getYMin();
                        }
                        if (t10.getYMax() > this.mLeftAxisMax) {
                            this.mLeftAxisMax = t10.getYMax();
                        }
                    }
                }
            }
            IDataSet firstRight = getFirstRight(this.mDataSets);
            if (firstRight != null) {
                this.mRightAxisMax = firstRight.getYMax();
                this.mRightAxisMin = firstRight.getYMin();
                for (T t11 : this.mDataSets) {
                    if (t11.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                        if (t11.getYMin() < this.mRightAxisMin) {
                            this.mRightAxisMin = t11.getYMin();
                        }
                        if (t11.getYMax() > this.mRightAxisMax) {
                            this.mRightAxisMax = t11.getYMax();
                        }
                    }
                }
            }
        }
    }

    public void calcMinMaxY(float f10, float f11) {
        for (T calcMinMaxY : this.mDataSets) {
            calcMinMaxY.calcMinMaxY(f10, f11);
        }
        calcMinMax();
    }

    public void clearValues() {
        List<T> list = this.mDataSets;
        if (list != null) {
            list.clear();
        }
        notifyDataChanged();
    }

    public boolean contains(T t10) {
        for (T equals : this.mDataSets) {
            if (equals.equals(t10)) {
                return true;
            }
        }
        return false;
    }

    public int[] getColors() {
        if (this.mDataSets == null) {
            return null;
        }
        int i = 0;
        for (int i10 = 0; i10 < this.mDataSets.size(); i10++) {
            i += ((IDataSet) this.mDataSets.get(i10)).getColors().size();
        }
        int[] iArr = new int[i];
        int i11 = 0;
        for (int i12 = 0; i12 < this.mDataSets.size(); i12++) {
            for (Integer intValue : ((IDataSet) this.mDataSets.get(i12)).getColors()) {
                iArr[i11] = intValue.intValue();
                i11++;
            }
        }
        return iArr;
    }

    public T getDataSetByIndex(int i) {
        List<T> list = this.mDataSets;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (IDataSet) this.mDataSets.get(i);
    }

    public T getDataSetByLabel(String str, boolean z) {
        int dataSetIndexByLabel = getDataSetIndexByLabel(this.mDataSets, str, z);
        if (dataSetIndexByLabel < 0 || dataSetIndexByLabel >= this.mDataSets.size()) {
            return null;
        }
        return (IDataSet) this.mDataSets.get(dataSetIndexByLabel);
    }

    public int getDataSetCount() {
        List<T> list = this.mDataSets;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T getDataSetForEntry(Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i = 0; i < this.mDataSets.size(); i++) {
            T t10 = (IDataSet) this.mDataSets.get(i);
            for (int i10 = 0; i10 < t10.getEntryCount(); i10++) {
                if (entry.equalTo(t10.getEntryForXValue(entry.getX(), entry.getY()))) {
                    return t10;
                }
            }
        }
        return null;
    }

    public int getDataSetIndexByLabel(List<T> list, String str, boolean z) {
        int i = 0;
        if (z) {
            while (i < list.size()) {
                if (str.equalsIgnoreCase(((IDataSet) list.get(i)).getLabel())) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < list.size()) {
            if (str.equals(((IDataSet) list.get(i)).getLabel())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public String[] getDataSetLabels() {
        String[] strArr = new String[this.mDataSets.size()];
        for (int i = 0; i < this.mDataSets.size(); i++) {
            strArr[i] = ((IDataSet) this.mDataSets.get(i)).getLabel();
        }
        return strArr;
    }

    public List<T> getDataSets() {
        return this.mDataSets;
    }

    public int getEntryCount() {
        int i = 0;
        for (T entryCount : this.mDataSets) {
            i += entryCount.getEntryCount();
        }
        return i;
    }

    public Entry getEntryForHighlight(Highlight highlight) {
        if (highlight.getDataSetIndex() >= this.mDataSets.size()) {
            return null;
        }
        return ((IDataSet) this.mDataSets.get(highlight.getDataSetIndex())).getEntryForXValue(highlight.getX(), highlight.getY());
    }

    public T getFirstLeft(List<T> list) {
        for (T t10 : list) {
            if (t10.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                return t10;
            }
        }
        return null;
    }

    public T getFirstRight(List<T> list) {
        for (T t10 : list) {
            if (t10.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                return t10;
            }
        }
        return null;
    }

    public int getIndexOfDataSet(T t10) {
        return this.mDataSets.indexOf(t10);
    }

    public T getMaxEntryCountSet() {
        List<T> list = this.mDataSets;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t10 = (IDataSet) this.mDataSets.get(0);
        for (T t11 : this.mDataSets) {
            if (t11.getEntryCount() > t10.getEntryCount()) {
                t10 = t11;
            }
        }
        return t10;
    }

    public float getXMax() {
        return this.mXMax;
    }

    public float getXMin() {
        return this.mXMin;
    }

    public float getYMax() {
        return this.mYMax;
    }

    public float getYMin() {
        return this.mYMin;
    }

    public boolean isHighlightEnabled() {
        for (T isHighlightEnabled : this.mDataSets) {
            if (!isHighlightEnabled.isHighlightEnabled()) {
                return false;
            }
        }
        return true;
    }

    public void notifyDataChanged() {
        calcMinMax();
    }

    public boolean removeDataSet(T t10) {
        if (t10 == null) {
            return false;
        }
        boolean remove = this.mDataSets.remove(t10);
        if (remove) {
            calcMinMax();
        }
        return remove;
    }

    public boolean removeEntry(Entry entry, int i) {
        IDataSet iDataSet;
        if (entry == null || i >= this.mDataSets.size() || (iDataSet = (IDataSet) this.mDataSets.get(i)) == null) {
            return false;
        }
        boolean removeEntry = iDataSet.removeEntry(entry);
        if (removeEntry) {
            calcMinMax();
        }
        return removeEntry;
    }

    public void setDrawValues(boolean z) {
        for (T drawValues : this.mDataSets) {
            drawValues.setDrawValues(z);
        }
    }

    public void setHighlightEnabled(boolean z) {
        for (T highlightEnabled : this.mDataSets) {
            highlightEnabled.setHighlightEnabled(z);
        }
    }

    public void setValueFormatter(ValueFormatter valueFormatter) {
        if (valueFormatter != null) {
            for (T valueFormatter2 : this.mDataSets) {
                valueFormatter2.setValueFormatter(valueFormatter);
            }
        }
    }

    public void setValueTextColor(int i) {
        for (T valueTextColor : this.mDataSets) {
            valueTextColor.setValueTextColor(i);
        }
    }

    public void setValueTextColors(List<Integer> list) {
        for (T valueTextColors : this.mDataSets) {
            valueTextColors.setValueTextColors(list);
        }
    }

    public void setValueTextSize(float f10) {
        for (T valueTextSize : this.mDataSets) {
            valueTextSize.setValueTextSize(f10);
        }
    }

    public void setValueTypeface(Typeface typeface) {
        for (T valueTypeface : this.mDataSets) {
            valueTypeface.setValueTypeface(typeface);
        }
    }

    public float getYMax(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f10 = this.mLeftAxisMax;
            return f10 == -3.4028235E38f ? this.mRightAxisMax : f10;
        }
        float f11 = this.mRightAxisMax;
        return f11 == -3.4028235E38f ? this.mLeftAxisMax : f11;
    }

    public float getYMin(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f10 = this.mLeftAxisMin;
            return f10 == Float.MAX_VALUE ? this.mRightAxisMin : f10;
        }
        float f11 = this.mRightAxisMin;
        return f11 == Float.MAX_VALUE ? this.mLeftAxisMin : f11;
    }

    public boolean removeDataSet(int i) {
        if (i >= this.mDataSets.size() || i < 0) {
            return false;
        }
        return removeDataSet((IDataSet) this.mDataSets.get(i));
    }

    public boolean removeEntry(float f10, int i) {
        Entry entryForXValue;
        if (i < this.mDataSets.size() && (entryForXValue = ((IDataSet) this.mDataSets.get(i)).getEntryForXValue(f10, Float.NaN)) != null) {
            return removeEntry(entryForXValue, i);
        }
        return false;
    }

    public ChartData(T... tArr) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = arrayToList(tArr);
        notifyDataChanged();
    }

    public ChartData(List<T> list) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = list;
        notifyDataChanged();
    }

    public void calcMinMax(Entry entry, YAxis.AxisDependency axisDependency) {
        if (this.mYMax < entry.getY()) {
            this.mYMax = entry.getY();
        }
        if (this.mYMin > entry.getY()) {
            this.mYMin = entry.getY();
        }
        if (this.mXMax < entry.getX()) {
            this.mXMax = entry.getX();
        }
        if (this.mXMin > entry.getX()) {
            this.mXMin = entry.getX();
        }
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < entry.getY()) {
                this.mLeftAxisMax = entry.getY();
            }
            if (this.mLeftAxisMin > entry.getY()) {
                this.mLeftAxisMin = entry.getY();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < entry.getY()) {
            this.mRightAxisMax = entry.getY();
        }
        if (this.mRightAxisMin > entry.getY()) {
            this.mRightAxisMin = entry.getY();
        }
    }

    public void calcMinMax(T t10) {
        if (this.mYMax < t10.getYMax()) {
            this.mYMax = t10.getYMax();
        }
        if (this.mYMin > t10.getYMin()) {
            this.mYMin = t10.getYMin();
        }
        if (this.mXMax < t10.getXMax()) {
            this.mXMax = t10.getXMax();
        }
        if (this.mXMin > t10.getXMin()) {
            this.mXMin = t10.getXMin();
        }
        if (t10.getAxisDependency() == YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < t10.getYMax()) {
                this.mLeftAxisMax = t10.getYMax();
            }
            if (this.mLeftAxisMin > t10.getYMin()) {
                this.mLeftAxisMin = t10.getYMin();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < t10.getYMax()) {
            this.mRightAxisMax = t10.getYMax();
        }
        if (this.mRightAxisMin > t10.getYMin()) {
            this.mRightAxisMin = t10.getYMin();
        }
    }
}
