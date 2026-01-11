package kh;

import c3.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f7554a;

    /* renamed from: b  reason: collision with root package name */
    public int f7555b;

    /* renamed from: c  reason: collision with root package name */
    public int f7556c;

    /* renamed from: d  reason: collision with root package name */
    public short[][][] f7557d;

    /* renamed from: e  reason: collision with root package name */
    public short[][][] f7558e;

    /* renamed from: f  reason: collision with root package name */
    public short[][] f7559f;
    public short[] g;

    public a(byte b10, byte b11, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        byte b12 = b10 & 255;
        this.f7554a = b12;
        byte b13 = b11 & 255;
        this.f7555b = b13;
        this.f7556c = b13 - b12;
        this.f7557d = sArr;
        this.f7558e = sArr2;
        this.f7559f = sArr3;
        this.g = sArr4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7554a != aVar.f7554a || this.f7555b != aVar.f7555b || this.f7556c != aVar.f7556c || !k.k0(this.f7557d, aVar.f7557d) || !k.k0(this.f7558e, aVar.f7558e) || !k.j0(this.f7559f, aVar.f7559f) || !k.i0(this.g, aVar.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f7554a * 37) + this.f7555b) * 37) + this.f7556c) * 37;
        short[][][] sArr = this.f7557d;
        int i10 = 0;
        for (int i11 = 0; i11 != sArr.length; i11++) {
            i10 = (i10 * 257) + xh.a.j(sArr[i11]);
        }
        int i12 = (i + i10) * 37;
        short[][][] sArr2 = this.f7558e;
        int i13 = 0;
        for (int i14 = 0; i14 != sArr2.length; i14++) {
            i13 = (i13 * 257) + xh.a.j(sArr2[i14]);
        }
        return xh.a.i(this.g) + ((xh.a.j(this.f7559f) + ((i12 + i13) * 37)) * 37);
    }
}
