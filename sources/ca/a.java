package ca;

import java.math.BigInteger;

public enum a {
    SINGLE((byte) 0),
    TWO((byte) 1),
    FOUR((byte) 2),
    BIGINT((byte) 3);
    
    private static BigInteger MAX;
    private byte value;

    /* access modifiers changed from: public */
    static {
        MAX = BigInteger.valueOf(2).pow(536).subtract(BigInteger.ONE);
    }

    private a(byte b10) {
        this.value = b10;
    }

    public static a byValue(byte b10) {
        a aVar = SINGLE;
        if (b10 == aVar.value) {
            return aVar;
        }
        a aVar2 = TWO;
        if (b10 == aVar2.value) {
            return aVar2;
        }
        a aVar3 = FOUR;
        if (b10 == aVar3.value) {
            return aVar3;
        }
        return BIGINT;
    }

    public static a forNumber(int i) {
        return forNumber((long) i);
    }

    public byte getValue() {
        return this.value;
    }

    public static a forNumber(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Negative numbers are not supported");
        } else if (j10 <= 63) {
            return SINGLE;
        } else {
            if (j10 <= 16383) {
                return TWO;
            }
            if (j10 <= 1073741823) {
                return FOUR;
            }
            return BIGINT;
        }
    }

    public static a forNumber(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException("Negative numbers are not supported");
        } else if (bigInteger.compareTo(MAX) > 0) {
            throw new IllegalArgumentException("Numbers larger than 2**536-1 are not supported");
        } else if (bigInteger.equals(BigInteger.ZERO)) {
            return SINGLE;
        } else {
            if (bigInteger.compareTo(BigInteger.valueOf(1073741823)) > 0) {
                return BIGINT;
            }
            if (bigInteger.compareTo(BigInteger.valueOf(16383)) > 0) {
                return FOUR;
            }
            if (bigInteger.compareTo(BigInteger.valueOf(63)) > 0) {
                return TWO;
            }
            return SINGLE;
        }
    }
}
