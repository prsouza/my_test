package xg;

import android.support.v4.media.b;
import bh.c;
import java.math.BigInteger;

public final class j extends b {

    /* renamed from: v  reason: collision with root package name */
    public final d f13258v;

    /* renamed from: w  reason: collision with root package name */
    public final c f13259w;

    public j(d dVar, c cVar) {
        if (dVar == null || dVar.f13240d == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f13258v = dVar;
        this.f13259w = cVar;
    }

    public final f x1(f fVar, BigInteger bigInteger) {
        f[] fVarArr;
        f[] fVarArr2;
        f[] fVarArr3;
        f[] fVarArr4;
        if (this.f13258v.i(fVar.f13245a)) {
            BigInteger[] c10 = this.f13259w.c(bigInteger.mod(fVar.f13245a.f13240d));
            boolean z = false;
            BigInteger bigInteger2 = c10[0];
            BigInteger bigInteger3 = c10[1];
            this.f13259w.b();
            c cVar = this.f13259w;
            boolean z10 = bigInteger2.signum() < 0;
            if (bigInteger3.signum() < 0) {
                z = true;
            }
            BigInteger abs = bigInteger2.abs();
            BigInteger abs2 = bigInteger3.abs();
            q D1 = b.D1(fVar, b.x0(Math.max(abs.bitLength(), abs2.bitLength())));
            f k12 = b.k1(cVar, fVar);
            q qVar = (q) k12.f13245a.o(k12, "bc_wnaf", new t(D1, cVar.a()));
            int min = Math.min(8, D1.f13276f);
            int min2 = Math.min(8, qVar.f13276f);
            if (z10) {
                fVarArr = D1.f13274d;
            } else {
                fVarArr = D1.f13273c;
            }
            f[] fVarArr5 = fVarArr;
            if (z) {
                fVarArr2 = qVar.f13274d;
            } else {
                fVarArr2 = qVar.f13273c;
            }
            f[] fVarArr6 = fVarArr2;
            if (z10) {
                fVarArr3 = D1.f13273c;
            } else {
                fVarArr3 = D1.f13274d;
            }
            f[] fVarArr7 = fVarArr3;
            if (z) {
                fVarArr4 = qVar.f13273c;
            } else {
                fVarArr4 = qVar.f13274d;
            }
            return a.c(fVarArr5, fVarArr7, b.r0(min, abs), fVarArr6, fVarArr4, b.r0(min2, abs2));
        }
        throw new IllegalStateException();
    }
}
