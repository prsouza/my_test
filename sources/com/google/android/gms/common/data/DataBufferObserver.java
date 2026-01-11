package com.google.android.gms.common.data;

public interface DataBufferObserver {

    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i, int i10);

    void onDataRangeInserted(int i, int i10);

    void onDataRangeMoved(int i, int i10, int i11);

    void onDataRangeRemoved(int i, int i10);
}
