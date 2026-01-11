package xb;

public enum c {
    BlePayloadEvent(0),
    BleStartSearching(1),
    BleStopSearching(2);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f13164id;

    private c(int i) {
        this.f13164id = i;
    }

    public final int getId() {
        return this.f13164id;
    }
}
