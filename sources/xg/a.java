package xg;

import android.support.v4.media.b;
import eh.e;
import java.math.BigInteger;

public final class a {
    public static f a(f fVar) {
        if (fVar.i(false, false)) {
            return fVar;
        }
        throw new IllegalStateException("Invalid result");
    }

    public static f b(f fVar, BigInteger bigInteger, f fVar2, BigInteger bigInteger2) {
        f[] fVarArr;
        f[] fVarArr2;
        f[] fVarArr3;
        f[] fVarArr4;
        f fVar3;
        f fVar4;
        f fVar5 = fVar;
        BigInteger bigInteger3 = bigInteger;
        f fVar6 = fVar2;
        BigInteger bigInteger4 = bigInteger2;
        boolean z = bigInteger.signum() < 0;
        boolean z10 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int x02 = b.x0(abs.bitLength());
        int x03 = b.x0(abs2.bitLength());
        q D1 = b.D1(fVar5, x02);
        q D12 = b.D1(fVar6, x03);
        int a10 = i.a(fVar5.f13245a);
        if (!z && !z10 && bigInteger.bitLength() <= a10 && bigInteger2.bitLength() <= a10) {
            if (D1.f13271a <= 0) {
                if (D12.f13271a <= 0) {
                    d dVar = fVar5.f13245a;
                    int a11 = i.a(dVar);
                    if (bigInteger.bitLength() > a11 || bigInteger2.bitLength() > a11) {
                        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
                    }
                    h b10 = i.b(fVar);
                    h b11 = i.b(fVar2);
                    b bVar = b10.f13254b;
                    b bVar2 = b11.f13254b;
                    int i = b10.f13255c;
                    if (i != b11.f13255c) {
                        g gVar = new g();
                        fVar4 = gVar.w1(fVar5, bigInteger3);
                        fVar3 = gVar.w1(fVar6, bigInteger4);
                    } else {
                        int i10 = ((a11 + i) - 1) / i;
                        f l10 = dVar.l();
                        int i11 = i * i10;
                        int[] l02 = b.l0(i11, bigInteger3);
                        int[] l03 = b.l0(i11, bigInteger4);
                        int i12 = i11 - 1;
                        for (int i13 = 0; i13 < i10; i13++) {
                            int i14 = 0;
                            int i15 = 0;
                            for (int i16 = i12 - i13; i16 >= 0; i16 -= i10) {
                                int i17 = i16 >>> 5;
                                int i18 = i16 & 31;
                                int i19 = l02[i17] >>> i18;
                                i14 = ((i14 ^ (i19 >>> 1)) << 1) ^ i19;
                                int i20 = l03[i17] >>> i18;
                                i15 = ((i15 ^ (i20 >>> 1)) << 1) ^ i20;
                            }
                            l10 = l10.x(bVar.j1(i14).a(bVar2.j1(i15)));
                        }
                        fVar4 = l10.a(b10.f13253a);
                        fVar3 = b11.f13253a;
                    }
                    return fVar4.a(fVar3);
                }
            }
        }
        int min = Math.min(8, D1.f13276f);
        int min2 = Math.min(8, D12.f13276f);
        if (z) {
            fVarArr = D1.f13274d;
        } else {
            fVarArr = D1.f13273c;
        }
        f[] fVarArr5 = fVarArr;
        if (z10) {
            fVarArr2 = D12.f13274d;
        } else {
            fVarArr2 = D12.f13273c;
        }
        f[] fVarArr6 = fVarArr2;
        if (z) {
            fVarArr3 = D1.f13273c;
        } else {
            fVarArr3 = D1.f13274d;
        }
        f[] fVarArr7 = fVarArr3;
        if (z10) {
            fVarArr4 = D12.f13273c;
        } else {
            fVarArr4 = D12.f13274d;
        }
        return c(fVarArr5, fVarArr7, b.r0(min, abs), fVarArr6, fVarArr4, b.r0(min2, abs2));
    }

    public static f c(f[] fVarArr, f[] fVarArr2, byte[] bArr, f[] fVarArr3, f[] fVarArr4, byte[] bArr2) {
        f fVar;
        int max = Math.max(bArr.length, bArr2.length);
        f l10 = fVarArr[0].f13245a.l();
        int i = max - 1;
        int i10 = 0;
        f fVar2 = l10;
        while (i >= 0) {
            byte b10 = i < bArr.length ? bArr[i] : 0;
            byte b11 = i < bArr2.length ? bArr2[i] : 0;
            if ((b10 | b11) == 0) {
                i10++;
            } else {
                if (b10 != 0) {
                    fVar = l10.a((b10 < 0 ? fVarArr2 : fVarArr)[Math.abs(b10) >>> 1]);
                } else {
                    fVar = l10;
                }
                if (b11 != 0) {
                    fVar = fVar.a((b11 < 0 ? fVarArr4 : fVarArr3)[Math.abs(b11) >>> 1]);
                }
                if (i10 > 0) {
                    fVar2 = fVar2.v(i10);
                    i10 = 0;
                }
                fVar2 = fVar2.x(fVar);
            }
            i--;
        }
        return i10 > 0 ? fVar2.v(i10) : fVar2;
    }

    public static f d(boolean[] zArr, q[] qVarArr, byte[][] bArr) {
        f[] fVarArr;
        int i = 0;
        for (byte[] length : bArr) {
            i = Math.max(i, length.length);
        }
        f l10 = qVarArr[0].f13273c[0].f13245a.l();
        int i10 = i - 1;
        int i11 = 0;
        f fVar = l10;
        while (i10 >= 0) {
            f fVar2 = l10;
            for (int i12 = 0; i12 < r0; i12++) {
                byte[] bArr2 = bArr[i12];
                byte b10 = i10 < bArr2.length ? bArr2[i10] : 0;
                if (b10 != 0) {
                    int abs = Math.abs(b10);
                    q qVar = qVarArr[i12];
                    if ((b10 < 0) == zArr[i12]) {
                        fVarArr = qVar.f13273c;
                    } else {
                        fVarArr = qVar.f13274d;
                    }
                    fVar2 = fVar2.a(fVarArr[abs >>> 1]);
                }
            }
            if (fVar2 == l10) {
                i11++;
            } else {
                if (i11 > 0) {
                    fVar = fVar.v(i11);
                    i11 = 0;
                }
                fVar = fVar.x(fVar2);
            }
            i10--;
        }
        return i11 > 0 ? fVar.v(i11) : fVar;
    }

    public static f e(d dVar, f fVar) {
        if (dVar.i(fVar.f13245a)) {
            return dVar.m(fVar);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean f(d dVar) {
        eh.a aVar = dVar.f13237a;
        return aVar.b() > 1 && aVar.c().equals(b.f13230c) && (aVar instanceof e);
    }

    public static boolean g(d dVar) {
        return dVar.f13237a.b() == 1;
    }
}
