package com.github.mikephil.charting.data;

import a.a;
import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

public abstract class DataSet<T extends Entry> extends BaseDataSet<T> {
    public List<T> mValues;
    public float mXMax = -3.4028235E38f;
    public float mXMin = Float.MAX_VALUE;
    public float mYMax = -3.4028235E38f;
    public float mYMin = Float.MAX_VALUE;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.mValues = list;
        if (list == null) {
            this.mValues = new ArrayList();
        }
        calcMinMax();
    }

    public boolean addEntry(T t10) {
        if (t10 == null) {
            return false;
        }
        List values = getValues();
        if (values == null) {
            values = new ArrayList();
        }
        calcMinMax(t10);
        return values.add(t10);
    }

    public void addEntryOrdered(T t10) {
        if (t10 != null) {
            if (this.mValues == null) {
                this.mValues = new ArrayList();
            }
            calcMinMax(t10);
            if (this.mValues.size() > 0) {
                List<T> list = this.mValues;
                if (((Entry) list.get(list.size() - 1)).getX() > t10.getX()) {
                    this.mValues.add(getEntryIndex(t10.getX(), t10.getY(), Rounding.UP), t10);
                    return;
                }
            }
            this.mValues.add(t10);
        }
    }

    public void calcMinMax() {
        List<T> list = this.mValues;
        if (list != null && !list.isEmpty()) {
            this.mYMax = -3.4028235E38f;
            this.mYMin = Float.MAX_VALUE;
            this.mXMax = -3.4028235E38f;
            this.mXMin = Float.MAX_VALUE;
            for (T calcMinMax : this.mValues) {
                calcMinMax(calcMinMax);
            }
        }
    }

    public void calcMinMaxX(T t10) {
        if (t10.getX() < this.mXMin) {
            this.mXMin = t10.getX();
        }
        if (t10.getX() > this.mXMax) {
            this.mXMax = t10.getX();
        }
    }

    public void calcMinMaxY(float f10, float f11) {
        List<T> list = this.mValues;
        if (list != null && !list.isEmpty()) {
            this.mYMax = -3.4028235E38f;
            this.mYMin = Float.MAX_VALUE;
            int entryIndex = getEntryIndex(f11, Float.NaN, Rounding.UP);
            for (int entryIndex2 = getEntryIndex(f10, Float.NaN, Rounding.DOWN); entryIndex2 <= entryIndex; entryIndex2++) {
                calcMinMaxY((Entry) this.mValues.get(entryIndex2));
            }
        }
    }

    public void clear() {
        this.mValues.clear();
        notifyDataSetChanged();
    }

    public abstract DataSet<T> copy();

    public void copy(DataSet dataSet) {
        super.copy(dataSet);
    }

    public List<T> getEntriesForXValue(float f10) {
        ArrayList arrayList = new ArrayList();
        int size = this.mValues.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i10 = (size + i) / 2;
            Entry entry = (Entry) this.mValues.get(i10);
            if (f10 == entry.getX()) {
                while (i10 > 0 && ((Entry) this.mValues.get(i10 - 1)).getX() == f10) {
                    i10--;
                }
                int size2 = this.mValues.size();
                while (i10 < size2) {
                    Entry entry2 = (Entry) this.mValues.get(i10);
                    if (entry2.getX() != f10) {
                        break;
                    }
                    arrayList.add(entry2);
                    i10++;
                }
            } else if (f10 > entry.getX()) {
                i = i10 + 1;
            } else {
                size = i10 - 1;
            }
        }
        return arrayList;
    }

    public int getEntryCount() {
        return this.mValues.size();
    }

    public T getEntryForIndex(int i) {
        return (Entry) this.mValues.get(i);
    }

    public T getEntryForXValue(float f10, float f11, Rounding rounding) {
        int entryIndex = getEntryIndex(f10, f11, rounding);
        if (entryIndex > -1) {
            return (Entry) this.mValues.get(entryIndex);
        }
        return null;
    }

    public int getEntryIndex(Entry entry) {
        return this.mValues.indexOf(entry);
    }

    public List<T> getValues() {
        return this.mValues;
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

    public boolean removeEntry(T t10) {
        List<T> list;
        if (t10 == null || (list = this.mValues) == null) {
            return false;
        }
        boolean remove = list.remove(t10);
        if (remove) {
            calcMinMax();
        }
        return remove;
    }

    public void setValues(List<T> list) {
        this.mValues = list;
        notifyDataSetChanged();
    }

    public String toSimpleString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder d10 = a.d("DataSet, label: ");
        d10.append(getLabel() == null ? BuildConfig.FLAVOR : getLabel());
        d10.append(", entries: ");
        d10.append(this.mValues.size());
        d10.append("\n");
        stringBuffer.append(d10.toString());
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(toSimpleString());
        for (int i = 0; i < this.mValues.size(); i++) {
            stringBuffer.append(((Entry) this.mValues.get(i)).toString() + " ");
        }
        return stringBuffer.toString();
    }

    public int getEntryIndex(float f10, float f11, Rounding rounding) {
        int i;
        Entry entry;
        List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int i10 = 0;
        int size = this.mValues.size() - 1;
        while (i10 < size) {
            int i11 = (i10 + size) / 2;
            float x10 = ((Entry) this.mValues.get(i11)).getX() - f10;
            int i12 = i11 + 1;
            float abs = Math.abs(x10);
            float abs2 = Math.abs(((Entry) this.mValues.get(i12)).getX() - f10);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d10 = (double) x10;
                    if (d10 < Utils.DOUBLE_EPSILON) {
                        if (d10 >= Utils.DOUBLE_EPSILON) {
                        }
                    }
                }
                size = i11;
            }
            i10 = i12;
        }
        if (size == -1) {
            return size;
        }
        float x11 = ((Entry) this.mValues.get(size)).getX();
        if (rounding == Rounding.UP) {
            if (x11 < f10 && size < this.mValues.size() - 1) {
                size++;
            }
        } else if (rounding == Rounding.DOWN && x11 > f10 && size > 0) {
            size--;
        }
        if (Float.isNaN(f11)) {
            return size;
        }
        while (size > 0 && ((Entry) this.mValues.get(size - 1)).getX() == x11) {
            size--;
        }
        float y10 = ((Entry) this.mValues.get(size)).getY();
        loop2:
        while (true) {
            i = size;
            do {
                size++;
                if (size >= this.mValues.size()) {
                    break loop2;
                }
                entry = (Entry) this.mValues.get(size);
                if (entry.getX() != x11) {
                    break loop2;
                }
            } while (Math.abs(entry.getY() - f11) >= Math.abs(y10 - f11));
            y10 = f11;
        }
        return i;
    }

    public T getEntryForXValue(float f10, float f11) {
        return getEntryForXValue(f10, f11, Rounding.CLOSEST);
    }

    public void calcMinMaxY(T t10) {
        if (t10.getY() < this.mYMin) {
            this.mYMin = t10.getY();
        }
        if (t10.getY() > this.mYMax) {
            this.mYMax = t10.getY();
        }
    }

    public void calcMinMax(T t10) {
        if (t10 != null) {
            calcMinMaxX(t10);
            calcMinMaxY(t10);
        }
    }
}
