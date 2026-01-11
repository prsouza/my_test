package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class x0 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f632v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f633w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ y0 f634x;

    public x0(y0 y0Var, int i, long[] jArr) {
        this.f634x = y0Var;
        this.f632v = i;
        this.f633w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f632v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 2; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f633w;
                jArr[i12] = j11 ^ (jArr3[i10 + i12] & j10);
                jArr2[i12] = jArr2[i12] ^ (jArr3[(i10 + 2) + i12] & j10);
            }
            i10 += 4;
        }
        return r2(jArr, jArr2);
    }

    public final f j1(int i) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i10 = i * 2 * 2;
        for (int i11 = 0; i11 < 2; i11++) {
            long[] jArr3 = this.f633w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 2 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        y0 y0Var = this.f634x;
        w0 w0Var = new w0(jArr);
        w0 w0Var2 = new w0(jArr2);
        e[] eVarArr = y0.f641k;
        Objects.requireNonNull(y0Var);
        return new z0(y0Var, w0Var, w0Var2, eVarArr);
    }

    public final int v0() {
        return this.f632v;
    }
}
