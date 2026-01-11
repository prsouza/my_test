package xg;

import bh.c;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import xg.e;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public eh.a f13237a;

    /* renamed from: b  reason: collision with root package name */
    public e f13238b;

    /* renamed from: c  reason: collision with root package name */
    public e f13239c;

    /* renamed from: d  reason: collision with root package name */
    public BigInteger f13240d;

    /* renamed from: e  reason: collision with root package name */
    public BigInteger f13241e;

    /* renamed from: f  reason: collision with root package name */
    public int f13242f = 0;
    public c g = null;

    /* renamed from: h  reason: collision with root package name */
    public android.support.v4.media.b f13243h = null;

    public static abstract class a extends d {
        public BigInteger[] i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r6, int r7, int r8, int r9) {
            /*
                r5 = this;
                if (r7 == 0) goto L_0x004c
                r0 = 2
                r1 = 1
                r2 = 3
                r3 = 0
                if (r8 != 0) goto L_0x001f
                if (r9 != 0) goto L_0x0017
                int[] r8 = new int[r2]
                r8[r3] = r3
                r8[r1] = r7
                r8[r0] = r6
                eh.e r6 = eh.b.a(r8)
                goto L_0x0035
            L_0x0017:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be 0 if k2 == 0"
                r6.<init>(r7)
                throw r6
            L_0x001f:
                if (r8 <= r7) goto L_0x0044
                if (r9 <= r8) goto L_0x003c
                r4 = 5
                int[] r4 = new int[r4]
                r4[r3] = r3
                r4[r1] = r7
                r4[r0] = r8
                r4[r2] = r9
                r7 = 4
                r4[r7] = r6
                eh.e r6 = eh.b.a(r4)
            L_0x0035:
                r5.<init>(r6)
                r6 = 0
                r5.i = r6
                return
            L_0x003c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be > k2"
                r6.<init>(r7)
                throw r6
            L_0x0044:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k2 must be > k1"
                r6.<init>(r7)
                throw r6
            L_0x004c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k1 must be > 0"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: xg.d.a.<init>(int, int, int, int):void");
        }

        public final f d(BigInteger bigInteger, BigInteger bigInteger2) {
            e j10 = j(bigInteger);
            e j11 = j(bigInteger2);
            int i10 = this.f13242f;
            if (i10 == 5 || i10 == 6) {
                if (!j10.h()) {
                    j11 = j11.c(j10).a(j10);
                } else if (!j11.m().equals(this.f13239c)) {
                    throw new IllegalArgumentException();
                }
            }
            return e(j10, j11);
        }

        public final f h(int i10, BigInteger bigInteger) {
            e eVar;
            e j10 = j(bigInteger);
            if (j10.h()) {
                eVar = this.f13239c.l();
            } else {
                e s10 = s(j10.m().f().i(this.f13239c).a(this.f13238b).a(j10));
                if (s10 != null) {
                    boolean p10 = s10.p();
                    boolean z = true;
                    if (i10 != 1) {
                        z = false;
                    }
                    if (p10 != z) {
                        s10 = s10.b();
                    }
                    int i11 = this.f13242f;
                    eVar = (i11 == 5 || i11 == 6) ? s10.a(j10) : s10.i(j10);
                } else {
                    eVar = null;
                }
            }
            if (eVar != null) {
                return e(j10, eVar);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public boolean r() {
            return this.f13240d != null && this.f13241e != null && this.f13239c.g() && (this.f13238b.h() || this.f13238b.g());
        }

        public final e s(e eVar) {
            e eVar2;
            e.a aVar = (e.a) eVar;
            boolean s10 = aVar.s();
            if (s10 && aVar.t() != 0) {
                return null;
            }
            int k10 = k();
            if ((k10 & 1) != 0) {
                e r10 = aVar.r();
                if (s10 || r10.m().a(r10).a(eVar).h()) {
                    return r10;
                }
                return null;
            } else if (eVar.h()) {
                return eVar;
            } else {
                e j10 = j(b.f13228a);
                Random random = new Random();
                do {
                    e j11 = j(new BigInteger(k10, random));
                    e eVar3 = eVar;
                    eVar2 = j10;
                    for (int i10 = 1; i10 < k10; i10++) {
                        e m10 = eVar3.m();
                        eVar2 = eVar2.m().a(m10.i(j11));
                        eVar3 = m10.a(eVar);
                    }
                    if (!eVar3.h()) {
                        return null;
                    }
                } while (eVar2.m().a(eVar2).h());
                return eVar2;
            }
        }
    }

    public static abstract class b extends d {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.math.BigInteger r4) {
            /*
                r3 = this;
                eh.f r0 = eh.b.f4835a
                int r0 = r4.bitLength()
                int r1 = r4.signum()
                if (r1 <= 0) goto L_0x002b
                r1 = 2
                if (r0 < r1) goto L_0x002b
                r2 = 3
                if (r0 >= r2) goto L_0x0021
                int r0 = r4.intValue()
                if (r0 == r1) goto L_0x001e
                if (r0 == r2) goto L_0x001b
                goto L_0x0021
            L_0x001b:
                eh.f r4 = eh.b.f4836b
                goto L_0x0027
            L_0x001e:
                eh.f r4 = eh.b.f4835a
                goto L_0x0027
            L_0x0021:
                eh.f r0 = new eh.f
                r0.<init>(r4)
                r4 = r0
            L_0x0027:
                r3.<init>(r4)
                return
            L_0x002b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "'characteristic' must be >= 2"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: xg.d.b.<init>(java.math.BigInteger):void");
        }

        public final f h(int i, BigInteger bigInteger) {
            e j10 = j(bigInteger);
            e l10 = j10.m().a(this.f13238b).i(j10).a(this.f13239c).l();
            if (l10 != null) {
                boolean p10 = l10.p();
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                if (p10 != z) {
                    l10 = l10.k();
                }
                return e(j10, l10);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }
    }

    public d(eh.a aVar) {
        this.f13237a = aVar;
    }

    public abstract d a();

    public android.support.v4.media.b b(f[] fVarArr, int i) {
        int k10 = (k() + 7) >>> 3;
        byte[] bArr = new byte[(i * k10 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            byte[] byteArray = fVar.f13246b.q().toByteArray();
            byte[] byteArray2 = fVar.f13247c.q().toByteArray();
            int i12 = 1;
            int i13 = byteArray.length > k10 ? 1 : 0;
            int length = byteArray.length - i13;
            if (byteArray2.length <= k10) {
                i12 = 0;
            }
            int length2 = byteArray2.length - i12;
            int i14 = i10 + k10;
            System.arraycopy(byteArray, i13, bArr, i14 - length, length);
            i10 = i14 + k10;
            System.arraycopy(byteArray2, i12, bArr, i10 - length2, length2);
        }
        return new c(this, i, k10, bArr);
    }

    public android.support.v4.media.b c() {
        c cVar = this.g;
        return cVar instanceof c ? new j(this, cVar) : new p();
    }

    public f d(BigInteger bigInteger, BigInteger bigInteger2) {
        return e(j(bigInteger), j(bigInteger2));
    }

    public abstract f e(e eVar, e eVar2);

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof d) && i((d) obj));
    }

    public abstract f f(e eVar, e eVar2, e[] eVarArr);

    public final f g(byte[] bArr) {
        f fVar;
        int k10 = (k() + 7) / 8;
        boolean z = false;
        byte b10 = bArr[0];
        if (b10 != 0) {
            if (b10 == 2 || b10 == 3) {
                if (bArr.length == k10 + 1) {
                    fVar = h(b10 & 1, xh.b.a(bArr, 1, k10));
                    if (!fVar.i(true, true)) {
                        throw new IllegalArgumentException("Invalid point");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
            } else if (b10 != 4) {
                if (b10 != 6 && b10 != 7) {
                    StringBuilder d10 = a.a.d("Invalid point encoding 0x");
                    d10.append(Integer.toString(b10, 16));
                    throw new IllegalArgumentException(d10.toString());
                } else if (bArr.length == (k10 * 2) + 1) {
                    BigInteger a10 = xh.b.a(bArr, 1, k10);
                    BigInteger a11 = xh.b.a(bArr, k10 + 1, k10);
                    boolean testBit = a11.testBit(0);
                    if (b10 == 7) {
                        z = true;
                    }
                    if (testBit == z) {
                        fVar = q(a10, a11);
                    } else {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
            } else if (bArr.length == (k10 * 2) + 1) {
                fVar = q(xh.b.a(bArr, 1, k10), xh.b.a(bArr, k10 + 1, k10));
            } else {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            }
        } else if (bArr.length == 1) {
            fVar = l();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b10 == 0 || !fVar.j()) {
            return fVar;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public abstract f h(int i, BigInteger bigInteger);

    public final int hashCode() {
        return (this.f13237a.hashCode() ^ Integer.rotateLeft(this.f13238b.q().hashCode(), 8)) ^ Integer.rotateLeft(this.f13239c.q().hashCode(), 16);
    }

    public final boolean i(d dVar) {
        return this == dVar || (dVar != null && this.f13237a.equals(dVar.f13237a) && this.f13238b.q().equals(dVar.f13238b.q()) && this.f13239c.q().equals(dVar.f13239c.q()));
    }

    public abstract e j(BigInteger bigInteger);

    public abstract int k();

    public abstract f l();

    public final f m(f fVar) {
        if (this == fVar.f13245a) {
            return fVar;
        }
        if (fVar.j()) {
            return l();
        }
        f n10 = fVar.n();
        return d(n10.f13246b.q(), n10.g().q());
    }

    public final void n(f[] fVarArr, int i, int i10, e eVar) {
        if (i < 0 || i10 < 0 || i > fVarArr.length - i10) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        int i11 = 0;
        while (i11 < i10) {
            f fVar = fVarArr[i + i11];
            if (fVar == null || this == fVar.f13245a) {
                i11++;
            } else {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
        int i12 = this.f13242f;
        if (i12 != 0 && i12 != 5) {
            e[] eVarArr = new e[i10];
            int[] iArr = new int[i10];
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i + i14;
                f fVar2 = fVarArr[i15];
                if (fVar2 != null && (eVar != null || !fVar2.k())) {
                    eVarArr[i13] = fVar2.h();
                    iArr[i13] = i15;
                    i13++;
                }
            }
            if (i13 != 0) {
                e[] eVarArr2 = new e[i13];
                eVarArr2[0] = eVarArr[0];
                int i16 = 0;
                while (true) {
                    i16++;
                    if (i16 >= i13) {
                        break;
                    }
                    eVarArr2[i16] = eVarArr2[i16 - 1].i(eVarArr[0 + i16]);
                }
                int i17 = i16 - 1;
                if (eVar != null) {
                    eVarArr2[i17] = eVarArr2[i17].i(eVar);
                }
                e f10 = eVarArr2[i17].f();
                while (i17 > 0) {
                    int i18 = i17 - 1;
                    int i19 = i17 + 0;
                    e eVar2 = eVarArr[i19];
                    eVarArr[i19] = eVarArr2[i18].i(f10);
                    f10 = f10.i(eVar2);
                    i17 = i18;
                }
                eVarArr[0] = f10;
                for (int i20 = 0; i20 < i13; i20++) {
                    int i21 = iArr[i20];
                    fVarArr[i21] = fVarArr[i21].o(eVarArr[i20]);
                }
            }
        } else if (eVar != null) {
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
        }
    }

    public final l o(f fVar, String str, k kVar) {
        Hashtable hashtable;
        l a10;
        if (fVar == null || this != fVar.f13245a) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
        synchronized (fVar) {
            hashtable = fVar.f13249e;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                fVar.f13249e = hashtable;
            }
        }
        synchronized (hashtable) {
            l lVar = (l) hashtable.get(str);
            a10 = kVar.a(lVar);
            if (a10 != lVar) {
                hashtable.put(str, a10);
            }
        }
        return a10;
    }

    public boolean p(int i) {
        return i == 0;
    }

    public final f q(BigInteger bigInteger, BigInteger bigInteger2) {
        f d10 = d(bigInteger, bigInteger2);
        if (d10.i(false, true)) {
            return d10;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }
}
