package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class s0 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f595v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f596w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ t0 f597x;

    public s0(t0 t0Var, int i, int[] iArr) {
        this.f597x = t0Var;
        this.f595v = i;
        this.f596w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f595v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 17; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f596w;
                iArr[i13] = i14 ^ (iArr3[i10 + i13] & i12);
                iArr2[i13] = iArr2[i13] ^ (iArr3[(i10 + 17) + i13] & i12);
            }
            i10 += 34;
        }
        return r2(iArr, iArr2);
    }

    public final f j1(int i) {
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int i10 = i * 17 * 2;
        for (int i11 = 0; i11 < 17; i11++) {
            int i12 = iArr[i11];
            int[] iArr3 = this.f596w;
            iArr[i11] = i12 ^ iArr3[i10 + i11];
            iArr2[i11] = iArr2[i11] ^ iArr3[(i10 + 17) + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        t0 t0Var = this.f597x;
        u0 u0Var = new u0(iArr);
        u0 u0Var2 = new u0(iArr2);
        e[] eVarArr = t0.f604k;
        Objects.requireNonNull(t0Var);
        return new v0(t0Var, u0Var, u0Var2, eVarArr);
    }

    public final int v0() {
        return this.f595v;
    }
}
