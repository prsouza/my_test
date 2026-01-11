package wi;

import j2.a;

public enum b {
    TxDelivered(0),
    BleTargetDeviceConnected(160);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f12705a;

    /* access modifiers changed from: public */
    b(int i) {
        this.f12705a = i;
    }

    public String toString() {
        return name() + '(' + a.a((byte) this.f12705a) + ')';
    }
}
