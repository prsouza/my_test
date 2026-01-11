package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class o0 extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f568v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f569w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ p0 f570x;

    public o0(p0 p0Var, int i, int[] iArr) {
        this.f570x = p0Var;
        this.f568v = i;
        this.f569w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f568v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 12; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f569w;
                iArr[i13] = i14 ^ (iArr3[i10 + i13] & i12);
                iArr2[i13] = iArr2[i13] ^ (iArr3[(i10 + 12) + i13] & i12);
            }
            i10 += 24;
        }
        return r2(iArr, iArr2);
    }

    public final f j1(int i) {
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int i10 = i * 12 * 2;
        for (int i11 = 0; i11 < 12; i11++) {
            int[] iArr3 = this.f569w;
            iArr[i11] = iArr3[i10 + i11];
            iArr2[i11] = iArr3[i10 + 12 + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        p0 p0Var = this.f570x;
        q0 q0Var = new q0(iArr);
        q0 q0Var2 = new q0(iArr2);
        e[] eVarArr = p0.f580k;
        Objects.requireNonNull(p0Var);
        return new r0(p0Var, q0Var, q0Var2, eVarArr);
    }

    public final int v0() {
        return this.f568v;
    }
}
