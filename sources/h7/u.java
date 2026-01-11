package h7;

import i7.z;

public enum u implements z.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final z.b<u> internalValueMap = null;
    private final int value;

    public class a implements z.b<u> {
    }

    public static final class b implements z.c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f5893a = null;

        static {
            f5893a = new b();
        }

        public final boolean a(int i) {
            return u.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new a();
    }

    private u(int i) {
        this.value = i;
    }

    public static u forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    public static z.b<u> internalGetValueMap() {
        return internalValueMap;
    }

    public static z.c internalGetVerifier() {
        return b.f5893a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static u valueOf(int i) {
        return forNumber(i);
    }
}
