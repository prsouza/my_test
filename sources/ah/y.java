package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class y extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f638v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f639w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ z f640x;

    public y(z zVar, int i, int[] iArr) {
        this.f640x = zVar;
        this.f638v = i;
        this.f639w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f638v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 7; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f639w;
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
        int i10 = 0;
        for (int i11 = 0; i11 < this.f638v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 7; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f639w;
                iArr[i13] = i14 ^ (iArr3[i10 + i13] & i12);
                iArr2[i13] = iArr2[i13] ^ (iArr3[(i10 + 7) + i13] & i12);
            }
            i10 += 14;
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        z zVar = this.f640x;
        a0 a0Var = new a0(iArr);
        a0 a0Var2 = new a0(iArr2);
        e[] eVarArr = z.f649k;
        Objects.requireNonNull(zVar);
        return new b0(zVar, a0Var, a0Var2, eVarArr);
    }

    public final int v0() {
        return this.f638v;
    }
}
