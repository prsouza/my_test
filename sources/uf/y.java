package uf;

import a.b;
import ah.v;
import e6.e;
import java.security.MessageDigest;
import nd.d;

public final class y extends i {

    /* renamed from: u  reason: collision with root package name */
    public final transient byte[][] f12003u;

    /* renamed from: v  reason: collision with root package name */
    public final transient int[] f12004v;

    public y(byte[][] bArr, int[] iArr) {
        super(i.f11955s.f11959c);
        this.f12003u = bArr;
        this.f12004v = iArr;
    }

    public final String d() {
        return u().d();
    }

    public final i e(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = this.f12003u.length;
        int i = 0;
        int i10 = 0;
        while (i < length) {
            int[] iArr = this.f12004v;
            int i11 = iArr[length + i];
            int i12 = iArr[i];
            instance.update(this.f12003u[i], i11, i12 - i10);
            i++;
            i10 = i12;
        }
        byte[] digest = instance.digest();
        e.C(digest, "digest.digest()");
        return new i(digest);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (iVar.h() != h() || !p(iVar, h())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int h() {
        return this.f12004v[this.f12003u.length - 1];
    }

    public final int hashCode() {
        int i = this.f11957a;
        if (i != 0) {
            return i;
        }
        int length = this.f12003u.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f12004v;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr = this.f12003u[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f11957a = i11;
        return i11;
    }

    public final String i() {
        return u().i();
    }

    public final byte[] k() {
        return t();
    }

    public final byte l(int i) {
        int i10;
        v.B((long) this.f12004v[this.f12003u.length - 1], (long) i, 1);
        int B0 = b.B0(this, i);
        if (B0 == 0) {
            i10 = 0;
        } else {
            i10 = this.f12004v[B0 - 1];
        }
        int[] iArr = this.f12004v;
        byte[][] bArr = this.f12003u;
        return bArr[B0][(i - i10) + iArr[bArr.length + B0]];
    }

    public final boolean o(int i, byte[] bArr, int i10, int i11) {
        int i12;
        e.D(bArr, "other");
        if (i < 0 || i > h() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i13 = i11 + i;
        int B0 = b.B0(this, i);
        while (i < i13) {
            if (B0 == 0) {
                i12 = 0;
            } else {
                i12 = this.f12004v[B0 - 1];
            }
            int[] iArr = this.f12004v;
            int i14 = iArr[this.f12003u.length + B0];
            int min = Math.min(i13, (iArr[B0] - i12) + i12) - i;
            if (!v.x(this.f12003u[B0], (i - i12) + i14, bArr, i10, min)) {
                return false;
            }
            i10 += min;
            i += min;
            B0++;
        }
        return true;
    }

    public final boolean p(i iVar, int i) {
        int i10;
        e.D(iVar, "other");
        if (h() - i < 0) {
            return false;
        }
        int i11 = i + 0;
        int B0 = b.B0(this, 0);
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            if (B0 == 0) {
                i10 = 0;
            } else {
                i10 = this.f12004v[B0 - 1];
            }
            int[] iArr = this.f12004v;
            int i14 = iArr[this.f12003u.length + B0];
            int min = Math.min(i11, (iArr[B0] - i10) + i10) - i12;
            if (!iVar.o(i13, this.f12003u[B0], (i12 - i10) + i14, min)) {
                return false;
            }
            i13 += min;
            i12 += min;
            B0++;
        }
        return true;
    }

    public final i q() {
        return u().q();
    }

    public final void s(e eVar, int i) {
        int i10;
        e.D(eVar, "buffer");
        int i11 = i + 0;
        int B0 = b.B0(this, 0);
        int i12 = 0;
        while (i12 < i11) {
            if (B0 == 0) {
                i10 = 0;
            } else {
                i10 = this.f12004v[B0 - 1];
            }
            int[] iArr = this.f12004v;
            int i13 = iArr[this.f12003u.length + B0];
            int min = Math.min(i11, (iArr[B0] - i10) + i10) - i12;
            int i14 = (i12 - i10) + i13;
            w wVar = new w(this.f12003u[B0], i14, i14 + min, true);
            w wVar2 = eVar.f11951a;
            if (wVar2 == null) {
                wVar.g = wVar;
                wVar.f11998f = wVar;
                eVar.f11951a = wVar;
            } else {
                w wVar3 = wVar2.g;
                e.B(wVar3);
                wVar3.b(wVar);
            }
            i12 += min;
            B0++;
        }
        eVar.f11952b += (long) h();
    }

    public final byte[] t() {
        byte[] bArr = new byte[h()];
        int length = this.f12003u.length;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (i < length) {
            int[] iArr = this.f12004v;
            int i12 = iArr[length + i];
            int i13 = iArr[i];
            int i14 = i13 - i10;
            d.E(this.f12003u[i], bArr, i11, i12, i12 + i14);
            i11 += i14;
            i++;
            i10 = i13;
        }
        return bArr;
    }

    public final String toString() {
        return u().toString();
    }

    public final i u() {
        return new i(t());
    }
}
