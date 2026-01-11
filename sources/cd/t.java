package cd;

import com.github.mikephil.charting.BuildConfig;

public enum t {
    bool("bool"),
    f0char(BuildConfig.FLAVOR),
    str(BuildConfig.FLAVOR),
    u8("u8"),
    u16("u16"),
    u32("u32"),
    u64("u64"),
    u128("u128"),
    u256("u256"),
    i8("u8"),
    i16("u16"),
    i32("u32"),
    i64("u64"),
    i128("u128"),
    i256("u256");
    
    private final String localName;

    private t(String str2) {
        this.localName = str2;
    }

    public final String getLocalName() {
        return this.localName;
    }
}
