package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class e3 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f507v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f508w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ f3 f509x;

    public e3(f3 f3Var, int i, long[] jArr) {
        this.f509x = f3Var;
        this.f507v = i;
        this.f508w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f507v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 9; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f508w;
                jArr[i12] = j11 ^ (jArr3[i10 + i12] & j10);
                jArr2[i12] = jArr2[i12] ^ (jArr3[(i10 + 9) + i12] & j10);
            }
            i10 += 18;
        }
        return r2(jArr, jArr2);
    }

    public final f j1(int i) {
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        int i10 = i * 9 * 2;
        for (int i11 = 0; i11 < 9; i11++) {
            long[] jArr3 = this.f508w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 9 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        f3 f3Var = this.f509x;
        a3 a3Var = new a3(jArr);
        a3 a3Var2 = new a3(jArr2);
        e[] eVarArr = f3.f517k;
        Objects.requireNonNull(f3Var);
        return new g3(f3Var, a3Var, a3Var2, eVarArr);
    }

    public final int v0() {
        return this.f507v;
    }
}
