package h7;

import i7.z;

public enum i0 implements z.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final z.b<i0> internalValueMap = null;
    private final int value;

    public class a implements z.b<i0> {
    }

    public static final class b implements z.c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f5878a = null;

        static {
            f5878a = new b();
        }

        public final boolean a(int i) {
            return i0.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new a();
    }

    private i0(int i) {
        this.value = i;
    }

    public static i0 forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static z.b<i0> internalGetValueMap() {
        return internalValueMap;
    }

    public static z.c internalGetVerifier() {
        return b.f5878a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static i0 valueOf(int i) {
        return forNumber(i);
    }
}
