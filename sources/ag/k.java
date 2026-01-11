package ag;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import xh.a;
import xh.g;

public final class k extends s {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f412a;

    /* renamed from: b  reason: collision with root package name */
    public final int f413b;

    public k(long j10) {
        this.f412a = BigInteger.valueOf(j10).toByteArray();
        this.f413b = 0;
    }

    public k(BigInteger bigInteger) {
        this.f412a = bigInteger.toByteArray();
        this.f413b = 0;
    }

    public k(byte[] bArr, boolean z) {
        if (!w(bArr)) {
            this.f412a = z ? a.a(bArr) : bArr;
            int length = bArr.length - 1;
            int i = 0;
            while (i < length) {
                int i10 = i + 1;
                if (bArr[i] != (bArr[i10] >> 7)) {
                    break;
                }
                i = i10;
            }
            this.f413b = i;
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    public static k r(y yVar) {
        s s10 = yVar.s();
        if (s10 instanceof k) {
            return s(s10);
        }
        return new k(o.s(s10).f430a, true);
    }

    public static k s(Object obj) {
        if (obj == null || (obj instanceof k)) {
            return (k) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (k) s.n((byte[]) obj);
            } catch (Exception e10) {
                StringBuilder d10 = a.a.d("encoding error in getInstance: ");
                d10.append(e10.toString());
                throw new IllegalArgumentException(d10.toString());
            }
        } else {
            StringBuilder d11 = a.a.d("illegal object in getInstance: ");
            d11.append(obj.getClass().getName());
            throw new IllegalArgumentException(d11.toString());
        }
    }

    public static int u(byte[] bArr, int i) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        byte b10 = bArr[max] & -1;
        while (true) {
            max++;
            if (max >= length) {
                return b10;
            }
            b10 = (b10 << 8) | (bArr[max] & 255);
        }
    }

    public static boolean w(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1) {
            return bArr[0] == (bArr[1] >> 7) && !g.a("org.bouncycastle.asn1.allow_unsafe_integer");
        }
        return false;
    }

    public final int hashCode() {
        return a.e(this.f412a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof k)) {
            return false;
        }
        return Arrays.equals(this.f412a, ((k) sVar).f412a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 2, this.f412a);
    }

    public final int l() {
        return v1.a(this.f412a.length) + 1 + this.f412a.length;
    }

    public final boolean o() {
        return false;
    }

    public final boolean t(BigInteger bigInteger) {
        return bigInteger != null && u(this.f412a, this.f413b) == bigInteger.intValue() && new BigInteger(this.f412a).equals(bigInteger);
    }

    public final String toString() {
        return new BigInteger(this.f412a).toString();
    }

    public final int v() {
        byte[] bArr = this.f412a;
        int length = bArr.length;
        int i = this.f413b;
        if (length - i <= 4) {
            return u(bArr, i);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public final long x() {
        byte[] bArr = this.f412a;
        int length = bArr.length;
        int i = this.f413b;
        if (length - i <= 8) {
            int length2 = bArr.length;
            int max = Math.max(i, length2 - 8);
            long j10 = (long) (-1 & bArr[max]);
            while (true) {
                max++;
                if (max >= length2) {
                    return j10;
                }
                j10 = (j10 << 8) | ((long) (bArr[max] & 255));
            }
        } else {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
    }
}
