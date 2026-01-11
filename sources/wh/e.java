package wh;

import a.a;
import a.b;
import com.github.mikephil.charting.BuildConfig;
import java.util.Objects;
import org.slf4j.Marker;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public b f12686a;

    /* renamed from: b  reason: collision with root package name */
    public int f12687b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f12688c;

    public e(b bVar, int i) {
        this.f12686a = bVar;
        this.f12687b = i;
        int[] iArr = new int[(i + 1)];
        this.f12688c = iArr;
        iArr[i] = 1;
    }

    public e(b bVar, byte[] bArr) {
        this.f12686a = bVar;
        int i = 8;
        int i10 = 1;
        while (bVar.f12682a > i) {
            i10++;
            i += 8;
        }
        if (bArr.length % i10 == 0) {
            this.f12688c = new int[(bArr.length / i10)];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int[] iArr = this.f12688c;
                if (i11 < iArr.length) {
                    int i13 = 0;
                    while (i13 < i) {
                        int[] iArr2 = this.f12688c;
                        iArr2[i11] = ((bArr[i12] & 255) << i13) ^ iArr2[i11];
                        i13 += 8;
                        i12++;
                    }
                    if (this.f12686a.c(this.f12688c[i11])) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    c();
                    return;
                } else {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    public e(e eVar) {
        this.f12686a = eVar.f12686a;
        this.f12687b = eVar.f12687b;
        this.f12688c = b.N(eVar.f12688c);
    }

    public static int b(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    public final int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            b bVar = this.f12686a;
            int i = iArr3[length];
            int i10 = iArr[length];
            Objects.requireNonNull(bVar);
            iArr3[length] = i ^ i10;
        }
        return iArr3;
    }

    public final void c() {
        int length = this.f12688c.length;
        do {
            this.f12687b = length - 1;
            length = this.f12687b;
            if (length < 0 || this.f12688c[length] != 0) {
            }
            this.f12687b = length - 1;
            length = this.f12687b;
            return;
        } while (this.f12688c[length] != 0);
    }

    public final int d(int i) {
        if (i < 0 || i > this.f12687b) {
            return 0;
        }
        return this.f12688c[i];
    }

    public final int e() {
        int[] iArr = this.f12688c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x003c
            boolean r1 = r8 instanceof wh.e
            if (r1 != 0) goto L_0x0008
            goto L_0x003c
        L_0x0008:
            wh.e r8 = (wh.e) r8
            wh.b r1 = r7.f12686a
            wh.b r2 = r8.f12686a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            int r1 = r7.f12687b
            int r2 = r8.f12687b
            if (r1 != r2) goto L_0x003c
            int[] r1 = r7.f12688c
            int[] r8 = r8.f12688c
            int r2 = b(r1)
            int r3 = b(r8)
            r4 = 1
            if (r2 == r3) goto L_0x002b
        L_0x0029:
            r8 = r0
            goto L_0x0039
        L_0x002b:
            r3 = r0
        L_0x002c:
            if (r3 > r2) goto L_0x0038
            r5 = r1[r3]
            r6 = r8[r3]
            if (r5 == r6) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0038:
            r8 = r4
        L_0x0039:
            if (r8 == 0) goto L_0x003c
            return r4
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.e.equals(java.lang.Object):boolean");
    }

    public final byte[] f() {
        int i = 8;
        int i10 = 1;
        while (this.f12686a.f12682a > i) {
            i10++;
            i += 8;
        }
        byte[] bArr = new byte[(this.f12688c.length * i10)];
        int i11 = 0;
        for (int i12 = 0; i12 < this.f12688c.length; i12++) {
            int i13 = 0;
            while (i13 < i) {
                bArr[i11] = (byte) (this.f12688c[i12] >>> i13);
                i13 += 8;
                i11++;
            }
        }
        return bArr;
    }

    public final void g(int i) {
        if (this.f12686a.c(i)) {
            this.f12688c = i(this.f12688c, i);
            c();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public final e h(int i) {
        if (this.f12686a.c(i)) {
            return new e(this.f12686a, i(this.f12688c, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public final int hashCode() {
        int i = this.f12686a.f12683b;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f12688c;
            if (i10 >= iArr.length) {
                return i;
            }
            i = (i * 31) + iArr[i10];
            i10++;
        }
    }

    public final int[] i(int[] iArr, int i) {
        int b10 = b(iArr);
        if (b10 == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        int[] iArr3 = new int[(b10 + 1)];
        while (b10 >= 0) {
            iArr3[b10] = this.f12686a.d(iArr[b10], i);
            b10--;
        }
        return iArr3;
    }

    public final String toString() {
        String str;
        StringBuilder sb2;
        StringBuilder d10 = a.d(" Polynomial over ");
        d10.append(this.f12686a.toString());
        d10.append(": \n");
        String sb3 = d10.toString();
        for (int i = 0; i < this.f12688c.length; i++) {
            StringBuilder d11 = a.d(sb3);
            b bVar = this.f12686a;
            int i10 = this.f12688c[i];
            String str2 = BuildConfig.FLAVOR;
            for (int i11 = 0; i11 < bVar.f12682a; i11++) {
                if ((((byte) i10) & 1) == 0) {
                    sb2 = new StringBuilder();
                    str = "0";
                } else {
                    sb2 = new StringBuilder();
                    str = "1";
                }
                str2 = android.support.v4.media.a.e(sb2, str, str2);
                i10 >>>= 1;
            }
            d11.append(str2);
            d11.append("Y^");
            d11.append(i);
            d11.append(Marker.ANY_NON_NULL_MARKER);
            sb3 = d11.toString();
        }
        return a8.a.c(sb3, ";");
    }

    public e(b bVar, int[] iArr) {
        int[] iArr2;
        this.f12686a = bVar;
        int b10 = b(iArr);
        if (b10 == -1) {
            iArr2 = new int[1];
        } else {
            int i = b10 + 1;
            if (iArr.length == i) {
                iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.f12688c = iArr2;
        c();
    }
}
