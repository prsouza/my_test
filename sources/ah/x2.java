package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class x2 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f635v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f636w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ y2 f637x;

    public x2(y2 y2Var, int i, long[] jArr) {
        this.f637x = y2Var;
        this.f635v = i;
        this.f636w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[7];
        long[] jArr2 = new long[7];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f635v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 7; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f636w;
                jArr[i12] = j11 ^ (jArr3[i10 + i12] & j10);
                jArr2[i12] = jArr2[i12] ^ (jArr3[(i10 + 7) + i12] & j10);
            }
            i10 += 14;
        }
        return r2(jArr, jArr2);
    }

    public final f j1(int i) {
        long[] jArr = new long[7];
        long[] jArr2 = new long[7];
        int i10 = i * 7 * 2;
        for (int i11 = 0; i11 < 7; i11++) {
            long[] jArr3 = this.f636w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 7 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        y2 y2Var = this.f637x;
        t2 t2Var = new t2(jArr);
        t2 t2Var2 = new t2(jArr2);
        e[] eVarArr = y2.f646k;
        Objects.requireNonNull(y2Var);
        return new z2(y2Var, t2Var, t2Var2, eVarArr);
    }

    public final int v0() {
        return this.f635v;
    }
}
