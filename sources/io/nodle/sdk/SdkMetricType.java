package io.nodle.sdk;

public enum SdkMetricType {
    BleScanCount(0),
    DtnTxCount(1),
    DtnRxCount(2),
    DtnForwardedCount(3),
    DtnDeliveredCount(4),
    MetricUnknown(255);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f6848id;

    private SdkMetricType(int i) {
        this.f6848id = i;
    }

    public final int getId() {
        return this.f6848id;
    }
}
