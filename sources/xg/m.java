package xg;

import java.math.BigInteger;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final BigInteger f13260a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13261b;

    public m(BigInteger bigInteger, int i) {
        if (i >= 0) {
            this.f13260a = bigInteger;
            this.f13261b = i;
            return;
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public final m a(m mVar) {
        if (this.f13261b == mVar.f13261b) {
            return new m(this.f13260a.add(mVar.f13260a), this.f13261b);
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public final int b(BigInteger bigInteger) {
        return this.f13260a.compareTo(bigInteger.shiftLeft(this.f13261b));
    }

    public final BigInteger c() {
        BigInteger bigInteger = b.f13229b;
        m mVar = new m(bigInteger, 1);
        int i = this.f13261b;
        if (i >= 0) {
            if (i != 1) {
                mVar = new m(bigInteger.shiftLeft(i - 1), i);
            }
            m a10 = a(mVar);
            return a10.f13260a.shiftRight(a10.f13261b);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public final m d(m mVar) {
        return a(new m(mVar.f13260a.negate(), mVar.f13261b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13260a.equals(mVar.f13260a) && this.f13261b == mVar.f13261b;
    }

    public final int hashCode() {
        return this.f13260a.hashCode() ^ this.f13261b;
    }

    public final String toString() {
        int i = this.f13261b;
        if (i == 0) {
            return this.f13260a.toString();
        }
        BigInteger shiftRight = this.f13260a.shiftRight(i);
        BigInteger subtract = this.f13260a.subtract(shiftRight.shiftLeft(this.f13261b));
        if (this.f13260a.signum() == -1) {
            subtract = b.f13229b.shiftLeft(this.f13261b).subtract(subtract);
        }
        if (shiftRight.signum() == -1 && !subtract.equals(b.f13228a)) {
            shiftRight = shiftRight.add(b.f13229b);
        }
        String bigInteger = shiftRight.toString();
        char[] cArr = new char[this.f13261b];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i10 = this.f13261b - length;
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = '0';
        }
        for (int i12 = 0; i12 < length; i12++) {
            cArr[i10 + i12] = bigInteger2.charAt(i12);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
