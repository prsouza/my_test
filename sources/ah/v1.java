package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class v1 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f623v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f624w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w1 f625x;

    public v1(w1 w1Var, int i, long[] jArr) {
        this.f625x = w1Var;
        this.f623v = i;
        this.f624w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[4];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f623v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 4; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f624w;
                jArr[i12] = j11 ^ (jArr3[i10 + i12] & j10);
                jArr2[i12] = jArr2[i12] ^ (jArr3[(i10 + 4) + i12] & j10);
            }
            i10 += 8;
        }
        return r2(jArr, jArr2);
    }

    public final f j1(int i) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[4];
        int i10 = i * 4 * 2;
        for (int i11 = 0; i11 < 4; i11++) {
            long[] jArr3 = this.f624w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 4 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        w1 w1Var = this.f625x;
        u1 u1Var = new u1(jArr);
        u1 u1Var2 = new u1(jArr2);
        e[] eVarArr = w1.f630k;
        Objects.requireNonNull(w1Var);
        return new x1(w1Var, u1Var, u1Var2, eVarArr);
    }

    public final int v0() {
        return this.f623v;
    }
}
