package h7;

import i7.z;

public enum z implements z.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final z.b<z> internalValueMap = null;
    private final int value;

    public class a implements z.b<z> {
    }

    public static final class b implements z.c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f5899a = null;

        static {
            f5899a = new b();
        }

        public final boolean a(int i) {
            return z.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new a();
    }

    private z(int i) {
        this.value = i;
    }

    public static z forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static z.b<z> internalGetValueMap() {
        return internalValueMap;
    }

    public static z.c internalGetVerifier() {
        return b.f5899a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static z valueOf(int i) {
        return forNumber(i);
    }
}
