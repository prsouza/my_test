package wh;

import a.a;
import ah.v;
import com.github.mikephil.charting.BuildConfig;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f12682a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f12683b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(byte[] r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f12682a = r0
            int r1 = r10.length
            java.lang.String r2 = "byte array is not an encoded finite field"
            r3 = 4
            if (r1 != r3) goto L_0x005f
            byte r1 = r10[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            byte r4 = r10[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r1 = r1 | r4
            r4 = 2
            byte r5 = r10[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r1 = r1 | r5
            r5 = 3
            byte r10 = r10[r5]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 24
            r10 = r10 | r1
            r9.f12683b = r10
            if (r10 != 0) goto L_0x002d
            goto L_0x004e
        L_0x002d:
            int r1 = ah.v.E(r10)
            int r1 = r1 >>> r3
            r5 = r0
        L_0x0033:
            if (r5 >= r1) goto L_0x004d
            int r4 = ah.v.S(r4, r4, r10)
            r6 = r4 ^ 2
            r7 = r6
            r6 = r10
        L_0x003d:
            if (r6 == 0) goto L_0x0047
            int r7 = ah.v.n0(r7, r6)
            r8 = r7
            r7 = r6
            r6 = r8
            goto L_0x003d
        L_0x0047:
            if (r7 == r3) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x004d:
            r0 = r3
        L_0x004e:
            if (r0 == 0) goto L_0x0059
            int r10 = r9.f12683b
            int r10 = ah.v.E(r10)
            r9.f12682a = r10
            return
        L_0x0059:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        L_0x005f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.b.<init>(byte[]):void");
    }

    public final byte[] a() {
        int i = this.f12683b;
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    public final int b(int i) {
        int i10 = (1 << this.f12682a) - 2;
        if (i10 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i10 < 0) {
            i = b(i);
            i10 = -i10;
        }
        int i11 = 1;
        while (i10 != 0) {
            if ((i10 & 1) == 1) {
                i11 = d(i11, i);
            }
            i = d(i, i);
            i10 >>>= 1;
        }
        return i11;
    }

    public final boolean c(int i) {
        int i10 = this.f12682a;
        return i10 == 31 ? i >= 0 : i >= 0 && i < (1 << i10);
    }

    public final int d(int i, int i10) {
        return v.S(i, i10, this.f12683b);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            return this.f12682a == bVar.f12682a && this.f12683b == bVar.f12683b;
        }
    }

    public final int hashCode() {
        return this.f12683b;
    }

    public final String toString() {
        String str;
        StringBuilder d10 = a.d("Finite Field GF(2^");
        d10.append(this.f12682a);
        d10.append(") = GF(2)[X]/<");
        int i = this.f12683b;
        if (i == 0) {
            str = "0";
        } else {
            String str2 = ((byte) (i & 1)) == 1 ? "1" : BuildConfig.FLAVOR;
            int i10 = i >>> 1;
            int i11 = 1;
            while (i10 != 0) {
                if (((byte) (i10 & 1)) == 1) {
                    str2 = str2 + "+x^" + i11;
                }
                i10 >>>= 1;
                i11++;
            }
            str = str2;
        }
        return android.support.v4.media.a.e(d10, str, "> ");
    }
}
