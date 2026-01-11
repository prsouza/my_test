package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class c2 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f490v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f491w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ d2 f492x;

    public c2(d2 d2Var, int i, long[] jArr) {
        this.f492x = d2Var;
        this.f490v = i;
        this.f491w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[4];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f490v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 4; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f491w;
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
            long[] jArr3 = this.f491w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 4 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        d2 d2Var = this.f492x;
        b2 b2Var = new b2(jArr);
        b2 b2Var2 = new b2(jArr2);
        e[] eVarArr = d2.f498k;
        Objects.requireNonNull(d2Var);
        return new e2(d2Var, b2Var, b2Var2, eVarArr);
    }

    public final int v0() {
        return this.f490v;
    }
}
