package zb;

public enum j {
    DOUBLE(k.DOUBLE, 1),
    FLOAT(k.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(k.BOOLEAN, 0),
    STRING(k.STRING, 2) {
    },
    GROUP(r13, 3) {
    },
    MESSAGE(r13, 2) {
    },
    BYTES(k.BYTE_STRING, 2) {
    },
    UINT32(r11, 0),
    ENUM(k.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: a  reason: collision with root package name */
    public final k f14325a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14326b;

    /* access modifiers changed from: public */
    j(k kVar, int i) {
        this.f14325a = kVar;
        this.f14326b = i;
    }
}
