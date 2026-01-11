package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class c0 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f487v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f488w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ d0 f489x;

    public c0(d0 d0Var, int i, int[] iArr) {
        this.f489x = d0Var;
        this.f487v = i;
        this.f488w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f487v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 7; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f488w;
                iArr[i13] = i14 ^ (iArr3[i10 + i13] & i12);
                iArr2[i13] = iArr2[i13] ^ (iArr3[(i10 + 7) + i13] & i12);
            }
            i10 += 14;
        }
        return r2(iArr, iArr2);
    }

    public final f j1(int i) {
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int i10 = i * 7 * 2;
        for (int i11 = 0; i11 < 7; i11++) {
            int[] iArr3 = this.f488w;
            iArr[i11] = iArr3[i10 + i11];
            iArr2[i11] = iArr3[i10 + 7 + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        d0 d0Var = this.f489x;
        e0 e0Var = new e0(iArr);
        e0 e0Var2 = new e0(iArr2);
        e[] eVarArr = d0.f496k;
        Objects.requireNonNull(d0Var);
        return new f0(d0Var, e0Var, e0Var2, eVarArr);
    }

    public final int v0() {
        return this.f487v;
    }
}
