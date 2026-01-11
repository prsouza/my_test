package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class h1 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f531v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f532w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i1 f533x;

    public h1(i1 i1Var, int i, long[] jArr) {
        this.f533x = i1Var;
        this.f531v = i;
        this.f532w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f531v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 3; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f532w;
                jArr[i12] = j11 ^ (jArr3[i10 + i12] & j10);
                jArr2[i12] = jArr2[i12] ^ (jArr3[(i10 + 3) + i12] & j10);
            }
            i10 += 6;
        }
        return r2(jArr, jArr2);
    }

    public final f j1(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i10 = i * 3 * 2;
        for (int i11 = 0; i11 < 3; i11++) {
            long[] jArr3 = this.f532w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 3 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        i1 i1Var = this.f533x;
        d1 d1Var = new d1(jArr);
        d1 d1Var2 = new d1(jArr2);
        e[] eVarArr = i1.f537k;
        Objects.requireNonNull(i1Var);
        return new j1(i1Var, d1Var, d1Var2, eVarArr);
    }

    public final int v0() {
        return this.f531v;
    }
}
