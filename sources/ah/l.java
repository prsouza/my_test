package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class l extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f550v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f551w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ m f552x;

    public l(m mVar, int i, int[] iArr) {
        this.f552x = mVar;
        this.f550v = i;
        this.f551w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f550v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f551w;
                iArr[i13] = i14 ^ (iArr3[i10 + i13] & i12);
                iArr2[i13] = iArr2[i13] ^ (iArr3[(i10 + 5) + i13] & i12);
            }
            i10 += 10;
        }
        return r2(iArr, iArr2);
    }

    public final f j1(int i) {
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int i10 = i * 5 * 2;
        for (int i11 = 0; i11 < 5; i11++) {
            int[] iArr3 = this.f551w;
            iArr[i11] = iArr3[i10 + i11];
            iArr2[i11] = iArr3[i10 + 5 + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        m mVar = this.f552x;
        n nVar = new n(iArr);
        n nVar2 = new n(iArr2);
        e[] eVarArr = m.f559k;
        Objects.requireNonNull(mVar);
        return new o(mVar, nVar, nVar2, eVarArr);
    }

    public final int v0() {
        return this.f550v;
    }
}
