package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class r1 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f590v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f591w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ s1 f592x;

    public r1(s1 s1Var, int i, long[] jArr) {
        this.f592x = s1Var;
        this.f590v = i;
        this.f591w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f590v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 3; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f591w;
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
            long[] jArr3 = this.f591w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 3 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        s1 s1Var = this.f592x;
        k1 k1Var = new k1(jArr);
        k1 k1Var2 = new k1(jArr2);
        e[] eVarArr = s1.f598k;
        Objects.requireNonNull(s1Var);
        return new t1(s1Var, k1Var, k1Var2, eVarArr);
    }

    public final int v0() {
        return this.f590v;
    }
}
