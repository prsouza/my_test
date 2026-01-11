package wi;

public enum a {
    Nil(0),
    HandlerNotFound(1),
    InvalidOpcode(2),
    InvalidOperand(3),
    SegmentationFault(4),
    InvalidMemoryAccess(5),
    InvalidEventId(6),
    ArithmeticException(7),
    BleError(8),
    MissingPermission(9),
    GasTankEmpty(10),
    SelfDestruction(16),
    CatastrophicFailure(255);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f12701a;

    /* access modifiers changed from: public */
    a(int i) {
        this.f12701a = i;
    }
}
