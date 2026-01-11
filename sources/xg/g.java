package xg;

import android.support.v4.media.b;
import java.math.BigInteger;

public final class g extends b {
    public final f x1(f fVar, BigInteger bigInteger) {
        d dVar = fVar.f13245a;
        int a10 = i.a(dVar);
        if (bigInteger.bitLength() <= a10) {
            h b10 = i.b(fVar);
            b bVar = b10.f13254b;
            int i = b10.f13255c;
            int i10 = ((a10 + i) - 1) / i;
            f l10 = dVar.l();
            int i11 = i * i10;
            int[] l02 = b.l0(i11, bigInteger);
            int i12 = i11 - 1;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = 0;
                for (int i15 = i12 - i13; i15 >= 0; i15 -= i10) {
                    int i16 = l02[i15 >>> 5] >>> (i15 & 31);
                    i14 = ((i14 ^ (i16 >>> 1)) << 1) ^ i16;
                }
                l10 = l10.x(bVar.i1(i14));
            }
            return l10.a(b10.f13253a);
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
