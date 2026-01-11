package xg;

import ah.w0;
import java.math.BigInteger;

public abstract class e implements b {

    public static abstract class a extends e {
        public e r() {
            int e10 = e();
            if ((e10 & 1) != 0) {
                int i = (e10 + 1) >>> 1;
                int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
                e eVar = this;
                int i10 = 1;
                while (numberOfLeadingZeros > 0) {
                    eVar = eVar.o(i10 << 1).a(eVar);
                    numberOfLeadingZeros--;
                    i10 = i >>> numberOfLeadingZeros;
                    if ((i10 & 1) != 0) {
                        eVar = eVar.o(2).a(this);
                    }
                }
                return eVar;
            }
            throw new IllegalStateException("Half-trace only defined for odd m");
        }

        public boolean s() {
            return this instanceof w0;
        }

        public int t() {
            int e10 = e();
            int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(e10);
            e eVar = this;
            int i = 1;
            while (numberOfLeadingZeros > 0) {
                eVar = eVar.o(i).a(eVar);
                numberOfLeadingZeros--;
                i = e10 >>> numberOfLeadingZeros;
                if ((i & 1) != 0) {
                    eVar = eVar.m().a(this);
                }
            }
            if (eVar.h()) {
                return 0;
            }
            if (eVar.g()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    public static abstract class b extends e {
    }

    public abstract e a(e eVar);

    public abstract e b();

    public abstract e c(e eVar);

    public final byte[] d() {
        int e10 = (e() + 7) / 8;
        BigInteger q10 = q();
        BigInteger bigInteger = xh.b.f13290a;
        byte[] byteArray = q10.toByteArray();
        if (byteArray.length == e10) {
            return byteArray;
        }
        int i = 0;
        if (byteArray[0] == 0) {
            i = 1;
        }
        int length = byteArray.length - i;
        if (length <= e10) {
            byte[] bArr = new byte[e10];
            System.arraycopy(byteArray, i, bArr, e10 - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    public abstract int e();

    public abstract e f();

    public boolean g() {
        return q().bitLength() == 1;
    }

    public boolean h() {
        return q().signum() == 0;
    }

    public abstract e i(e eVar);

    public e j(e eVar, e eVar2, e eVar3) {
        return i(eVar).a(eVar2.i(eVar3));
    }

    public abstract e k();

    public abstract e l();

    public abstract e m();

    public e n(e eVar, e eVar2) {
        return m().a(eVar.i(eVar2));
    }

    public e o(int i) {
        e eVar = this;
        for (int i10 = 0; i10 < i; i10++) {
            eVar = eVar.m();
        }
        return eVar;
    }

    public boolean p() {
        return q().testBit(0);
    }

    public abstract BigInteger q();

    public final String toString() {
        return q().toString(16);
    }
}
