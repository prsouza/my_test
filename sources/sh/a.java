package sh;

import c3.k;
import java.security.PrivateKey;
import java.util.Arrays;

public final class a implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    public short[][] f11138a;

    /* renamed from: b  reason: collision with root package name */
    public short[] f11139b;

    /* renamed from: c  reason: collision with root package name */
    public short[][] f11140c;

    /* renamed from: s  reason: collision with root package name */
    public short[] f11141s;

    /* renamed from: t  reason: collision with root package name */
    public kh.a[] f11142t;

    /* renamed from: u  reason: collision with root package name */
    public int[] f11143u;

    public a(vh.a aVar) {
        short[][] sArr = aVar.f12470a;
        short[] sArr2 = aVar.f12471b;
        short[][] sArr3 = aVar.f12472c;
        short[] sArr4 = aVar.f12473s;
        int[] iArr = aVar.f12474t;
        kh.a[] aVarArr = aVar.f12475u;
        this.f11138a = sArr;
        this.f11139b = sArr2;
        this.f11140c = sArr3;
        this.f11141s = sArr4;
        this.f11143u = iArr;
        this.f11142t = aVarArr;
    }

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, kh.a[] aVarArr) {
        this.f11138a = sArr;
        this.f11139b = sArr2;
        this.f11140c = sArr3;
        this.f11141s = sArr4;
        this.f11143u = iArr;
        this.f11142t = aVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        boolean z = ((((k.j0(this.f11138a, aVar.f11138a)) && k.j0(this.f11140c, aVar.f11140c)) && k.i0(this.f11139b, aVar.f11139b)) && k.i0(this.f11141s, aVar.f11141s)) && Arrays.equals(this.f11143u, aVar.f11143u);
        kh.a[] aVarArr = this.f11142t;
        if (aVarArr.length != aVar.f11142t.length) {
            return false;
        }
        for (int length = aVarArr.length - 1; length >= 0; length--) {
            z &= this.f11142t[length].equals(aVar.f11142t[length]);
        }
        return z;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] getEncoded() {
        /*
            r8 = this;
            fh.f r7 = new fh.f
            short[][] r1 = r8.f11138a
            short[] r2 = r8.f11139b
            short[][] r3 = r8.f11140c
            short[] r4 = r8.f11141s
            int[] r5 = r8.f11143u
            kh.a[] r6 = r8.f11142t
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            jg.a r1 = new jg.a     // Catch:{ IOException -> 0x0025 }
            ag.n r2 = fh.e.f5150a     // Catch:{ IOException -> 0x0025 }
            ag.u0 r3 = ag.u0.f450a     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0025 }
            hg.b r2 = new hg.b     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r1, r7, r0, r0)     // Catch:{ IOException -> 0x0025 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.a.getEncoded():byte[]");
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        int j10 = xh.a.j(this.f11138a);
        int i = xh.a.i(this.f11139b);
        int j11 = xh.a.j(this.f11140c);
        int f10 = xh.a.f(this.f11143u) + ((xh.a.i(this.f11141s) + ((j11 + ((i + ((j10 + (this.f11142t.length * 37)) * 37)) * 37)) * 37)) * 37);
        for (int length = this.f11142t.length - 1; length >= 0; length--) {
            f10 = (f10 * 37) + this.f11142t[length].hashCode();
        }
        return f10;
    }
}
