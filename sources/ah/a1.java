package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class a1 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f474v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long[] f475w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b1 f476x;

    public a1(b1 b1Var, int i, long[] jArr) {
        this.f476x = b1Var;
        this.f474v = i;
        this.f475w = jArr;
    }

    public final f i1(int i) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f474v; i11++) {
            long j10 = (long) (((i11 ^ i) - 1) >> 31);
            for (int i12 = 0; i12 < 2; i12++) {
                long j11 = jArr[i12];
                long[] jArr3 = this.f475w;
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
            long[] jArr3 = this.f475w;
            jArr[i11] = jArr3[i10 + i11];
            jArr2[i11] = jArr3[i10 + 2 + i11];
        }
        return r2(jArr, jArr2);
    }

    public final f r2(long[] jArr, long[] jArr2) {
        b1 b1Var = this.f476x;
        w0 w0Var = new w0(jArr);
        w0 w0Var2 = new w0(jArr2);
        e[] eVarArr = b1.f480k;
        Objects.requireNonNull(b1Var);
        return new c1(b1Var, w0Var, w0Var2, eVarArr);
    }

    public final int v0() {
        return this.f474v;
    }
}
