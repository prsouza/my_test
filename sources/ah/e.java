package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.f;

public final class e extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f500v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f501w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ f f502x;

    public e(f fVar, int i, int[] iArr) {
        this.f502x = fVar;
        this.f500v = i;
        this.f501w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f500v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f501w;
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
            int[] iArr3 = this.f501w;
            iArr[i11] = iArr3[i10 + i11];
            iArr2[i11] = iArr3[i10 + 5 + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        f fVar = this.f502x;
        n nVar = new n(iArr);
        n nVar2 = new n(iArr2);
        xg.e[] eVarArr = f.f511k;
        Objects.requireNonNull(fVar);
        return new g(fVar, nVar, nVar2, eVarArr);
    }

    public final int v0() {
        return this.f500v;
    }
}
