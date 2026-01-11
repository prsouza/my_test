package wi;

import j2.a;

public enum d {
    OP_JMP(27),
    OP_HTTP_GET(128),
    OP_HTTP_POST(129),
    OP_BLE_MTU(144),
    OP_BLE_READ(145),
    OP_BLE_WRITE(146),
    OP_DTN_SEND(148),
    OP_SDKID(160),
    OP_LOCATION(161);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f12715a;

    /* access modifiers changed from: public */
    d(int i) {
        this.f12715a = i;
    }

    public String toString() {
        return name() + '(' + a.a((byte) this.f12715a) + ')';
    }
}
