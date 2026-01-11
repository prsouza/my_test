package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class j2 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f541v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f542w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ k2 f543x;

    public j2(k2 k2Var, int i, long[] jArr) {
        this.f543x = k2Var;
        this.f541v = i;
        this.f542w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[4];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f541v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 4; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f542w;
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
            long[] jArr3 = this.f542w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 4 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        k2 k2Var = this.f543x;
        i2 i2Var = new i2(jArr);
        i2 i2Var2 = new i2(jArr2);
        e[] eVarArr = k2.f548k;
        Objects.requireNonNull(k2Var);
        return new l2(k2Var, i2Var, i2Var2, eVarArr);
    }

    public final int v0() {
        return this.f541v;
    }
}
