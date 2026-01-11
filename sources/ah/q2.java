package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class q2 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f586v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f587w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ r2 f588x;

    public q2(r2 r2Var, int i, long[] jArr) {
        this.f588x = r2Var;
        this.f586v = i;
        this.f587w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[5];
        long[] jArr2 = new long[5];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f586v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 5; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f587w;
                jArr[i12] = j11 ^ (jArr3[i10 + i12] & j10);
                jArr2[i12] = jArr2[i12] ^ (jArr3[(i10 + 5) + i12] & j10);
            }
            i10 += 10;
        }
        return r2(jArr, jArr2);
    }

    public final f j1(int i) {
        long[] jArr = new long[5];
        long[] jArr2 = new long[5];
        int i10 = i * 5 * 2;
        for (int i11 = 0; i11 < 5; i11++) {
            long[] jArr3 = this.f587w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 5 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        r2 r2Var = this.f588x;
        m2 m2Var = new m2(jArr);
        m2 m2Var2 = new m2(jArr2);
        e[] eVarArr = r2.f593k;
        Objects.requireNonNull(r2Var);
        return new s2(r2Var, m2Var, m2Var2, eVarArr);
    }

    public final int v0() {
        return this.f586v;
    }
}
