package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class u2 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f610v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f611w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ v2 f612x;

    public u2(v2 v2Var, int i, long[] jArr) {
        this.f612x = v2Var;
        this.f610v = i;
        this.f611w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[7];
        long[] jArr2 = new long[7];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f610v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 7; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f611w;
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
            long[] jArr3 = this.f611w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 7 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        v2 v2Var = this.f612x;
        t2 t2Var = new t2(jArr);
        t2 t2Var2 = new t2(jArr2);
        e[] eVarArr = v2.f626k;
        Objects.requireNonNull(v2Var);
        return new w2(v2Var, t2Var, t2Var2, eVarArr);
    }

    public final int v0() {
        return this.f610v;
    }
}
