package sh;

import ag.d;
import ag.u0;
import c3.k;
import fh.e;
import fh.g;
import java.security.PublicKey;
import xh.a;

public final class b implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    public short[][] f11144a;

    /* renamed from: b  reason: collision with root package name */
    public short[][] f11145b;

    /* renamed from: c  reason: collision with root package name */
    public short[] f11146c;

    /* renamed from: s  reason: collision with root package name */
    public int f11147s;

    public b(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f11147s = i;
        this.f11144a = sArr;
        this.f11145b = sArr2;
        this.f11146c = sArr3;
    }

    public b(vh.b bVar) {
        int i = bVar.f12479s;
        short[][] sArr = bVar.f12476a;
        short[][] sArr2 = bVar.f12477b;
        short[] sArr3 = bVar.f12478c;
        this.f11147s = i;
        this.f11144a = sArr;
        this.f11145b = sArr2;
        this.f11146c = sArr3;
    }

    public final short[][] a() {
        short[][] sArr = new short[this.f11145b.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.f11145b;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = a.b(sArr2[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11147s != bVar.f11147s || !k.j0(this.f11144a, bVar.f11144a) || !k.j0(this.f11145b, bVar.a()) || !k.i0(this.f11146c, a.b(bVar.f11146c))) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public final byte[] getEncoded() {
        try {
            return new jg.b(new jg.a(e.f5150a, u0.f450a), (d) new g(this.f11147s, this.f11144a, this.f11145b, this.f11146c)).i("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        int j10 = a.j(this.f11144a);
        int j11 = a.j(this.f11145b);
        return a.i(this.f11146c) + ((j11 + ((j10 + (this.f11147s * 37)) * 37)) * 37);
    }
}
