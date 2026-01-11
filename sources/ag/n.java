package ag;

import androidx.appcompat.widget.d;
import androidx.fragment.app.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class n extends s {

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentMap<a, n> f424c = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f425a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f426b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f427a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f428b;

        public a(byte[] bArr) {
            this.f427a = xh.a.e(bArr);
            this.f428b = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.f428b, ((a) obj).f428b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f427a;
        }
    }

    public n(n nVar, String str) {
        if (v(str, 0)) {
            this.f425a = d.b(new StringBuilder(), nVar.f425a, ".", str);
            return;
        }
        throw new IllegalArgumentException(o.c("string ", str, " not a valid OID branch"));
    }

    public n(byte[] bArr) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j10 = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b10 = bArr2[i] & 255;
            if (j10 <= 72057594037927808L) {
                long j11 = j10 + ((long) (b10 & Byte.MAX_VALUE));
                if ((b10 & 128) == 0) {
                    if (z) {
                        if (j11 < 40) {
                            stringBuffer.append('0');
                        } else if (j11 < 80) {
                            stringBuffer.append('1');
                            j11 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j11 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j10) : bigInteger).or(BigInteger.valueOf((long) (b10 & Byte.MAX_VALUE)));
                if ((b10 & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j10 = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f425a = stringBuffer.toString();
        this.f426b = xh.a.a(bArr);
    }

    public static n t(Object obj) {
        if (obj == null || (obj instanceof n)) {
            return (n) obj;
        }
        if (obj instanceof d) {
            s d10 = ((d) obj).d();
            if (d10 instanceof n) {
                return (n) d10;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (n) s.n((byte[]) obj);
            } catch (IOException e10) {
                StringBuilder d11 = a.a.d("failed to construct object identifier from byte[]: ");
                d11.append(e10.getMessage());
                throw new IllegalArgumentException(d11.toString());
            }
        } else {
            StringBuilder d12 = a.a.d("illegal object in getInstance: ");
            d12.append(obj.getClass().getName());
            throw new IllegalArgumentException(d12.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 == 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 <= 1) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7.charAt(r0 + 1) != '0') goto L_0x0004;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean v(java.lang.String r7, int r8) {
        /*
            int r0 = r7.length()
        L_0x0004:
            r1 = 0
            r2 = r1
        L_0x0006:
            int r0 = r0 + -1
            r3 = 48
            r4 = 1
            if (r0 < r8) goto L_0x002c
            char r5 = r7.charAt(r0)
            r6 = 46
            if (r5 != r6) goto L_0x0022
            if (r2 == 0) goto L_0x0021
            if (r2 <= r4) goto L_0x0004
            int r2 = r0 + 1
            char r2 = r7.charAt(r2)
            if (r2 != r3) goto L_0x0004
        L_0x0021:
            return r1
        L_0x0022:
            if (r3 > r5) goto L_0x002b
            r3 = 57
            if (r5 > r3) goto L_0x002b
            int r2 = r2 + 1
            goto L_0x0006
        L_0x002b:
            return r1
        L_0x002c:
            if (r2 == 0) goto L_0x0039
            if (r2 <= r4) goto L_0x0038
            int r0 = r0 + r4
            char r7 = r7.charAt(r0)
            if (r7 != r3) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            return r4
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.n.v(java.lang.String, int):boolean");
    }

    public final int hashCode() {
        return this.f425a.hashCode();
    }

    public final boolean j(s sVar) {
        if (sVar == this) {
            return true;
        }
        if (!(sVar instanceof n)) {
            return false;
        }
        return this.f425a.equals(((n) sVar).f425a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 6, s());
    }

    public final int l() throws IOException {
        int length = s().length;
        return v1.a(length) + 1 + length;
    }

    public final boolean o() {
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0042  */
    public final void r(java.io.ByteArrayOutputStream r8) {
        /*
            r7 = this;
            la.a r0 = new la.a
            java.lang.String r1 = r7.f425a
            r0.<init>(r1)
            java.lang.String r1 = r0.c()
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * 40
            java.lang.String r2 = r0.c()
            int r3 = r2.length()
            r4 = 18
            if (r3 > r4) goto L_0x0026
            long r5 = (long) r1
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 + r5
            r2 = r1
            r1 = r7
            goto L_0x0050
        L_0x0026:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r3.add(r1)
            r7.x(r8, r1)
            r1 = r7
        L_0x0038:
            int r2 = r0.f8155a
            r3 = -1
            if (r2 == r3) goto L_0x003f
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            if (r2 == 0) goto L_0x005d
            java.lang.String r2 = r0.c()
            int r3 = r2.length()
            if (r3 > r4) goto L_0x0054
            long r2 = java.lang.Long.parseLong(r2)
        L_0x0050:
            r1.w(r8, r2)
            goto L_0x0038
        L_0x0054:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            r1.x(r8, r3)
            goto L_0x0038
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.n.r(java.io.ByteArrayOutputStream):void");
    }

    public final synchronized byte[] s() {
        if (this.f426b == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            r(byteArrayOutputStream);
            this.f426b = byteArrayOutputStream.toByteArray();
        }
        return this.f426b;
    }

    public final String toString() {
        return this.f425a;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.concurrent.ConcurrentMap<ag.n$a, ag.n>, java.util.concurrent.ConcurrentHashMap] */
    public final n u() {
        a aVar = new a(s());
        ? r12 = f424c;
        n nVar = (n) r12.get(aVar);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = (n) r12.putIfAbsent(aVar, this);
        return nVar2 == null ? this : nVar2;
    }

    public final void w(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j10) & 127);
        while (j10 >= 128) {
            j10 >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j10) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public final void x(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i10 = i; i10 >= 0; i10--) {
            bArr[i10] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    public n(String str) {
        char charAt;
        boolean z = false;
        if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
            z = v(str, 2);
        }
        if (z) {
            this.f425a = str;
            return;
        }
        throw new IllegalArgumentException(o.c("string ", str, " not an OID"));
    }
}
