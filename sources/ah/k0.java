package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class k0 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f544v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f545w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ l0 f546x;

    public k0(l0 l0Var, int i, int[] iArr) {
        this.f546x = l0Var;
        this.f544v = i;
        this.f545w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f544v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f545w;
                iArr[i13] = i14 ^ (iArr3[i10 + i13] & i12);
                iArr2[i13] = iArr2[i13] ^ (iArr3[(i10 + 8) + i13] & i12);
            }
            i10 += 16;
        }
        return r2(iArr, iArr2);
    }

    public final f j1(int i) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i10 = i * 8 * 2;
        for (int i11 = 0; i11 < 8; i11++) {
            int[] iArr3 = this.f545w;
            iArr[i11] = iArr3[i10 + i11];
            iArr2[i11] = iArr3[i10 + 8 + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        l0 l0Var = this.f546x;
        m0 m0Var = new m0(iArr);
        m0 m0Var2 = new m0(iArr2);
        e[] eVarArr = l0.f554k;
        Objects.requireNonNull(l0Var);
        return new n0(l0Var, m0Var, m0Var2, eVarArr);
    }

    public final int v0() {
        return this.f544v;
    }
}
