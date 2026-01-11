package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class g0 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f521v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f522w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ h0 f523x;

    public g0(h0 h0Var, int i, int[] iArr) {
        this.f523x = h0Var;
        this.f521v = i;
        this.f522w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f521v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f522w;
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
            int[] iArr3 = this.f522w;
            iArr[i11] = iArr3[i10 + i11];
            iArr2[i11] = iArr3[i10 + 8 + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        h0 h0Var = this.f523x;
        i0 i0Var = new i0(iArr);
        i0 i0Var2 = new i0(iArr2);
        e[] eVarArr = h0.f530k;
        Objects.requireNonNull(h0Var);
        return new j0(h0Var, i0Var, i0Var2, eVarArr);
    }

    public final int v0() {
        return this.f521v;
    }
}
