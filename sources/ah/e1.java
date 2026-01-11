package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class e1 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f504v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f505w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ f1 f506x;

    public e1(f1 f1Var, int i, long[] jArr) {
        this.f506x = f1Var;
        this.f504v = i;
        this.f505w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f504v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 3; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f505w;
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
            long[] jArr3 = this.f505w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 3 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        f1 f1Var = this.f506x;
        d1 d1Var = new d1(jArr);
        d1 d1Var2 = new d1(jArr2);
        e[] eVarArr = f1.f512k;
        Objects.requireNonNull(f1Var);
        return new g1(f1Var, d1Var, d1Var2, eVarArr);
    }

    public final int v0() {
        return this.f504v;
    }
}
