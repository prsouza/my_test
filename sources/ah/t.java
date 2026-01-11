package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class t extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f600v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f601w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u f602x;

    public t(u uVar, int i, int[] iArr) {
        this.f602x = uVar;
        this.f600v = i;
        this.f601w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f600v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 6; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f601w;
                iArr[i13] = i14 ^ (iArr3[i10 + i13] & i12);
                iArr2[i13] = iArr2[i13] ^ (iArr3[(i10 + 6) + i13] & i12);
            }
            i10 += 12;
        }
        return r2(iArr, iArr2);
    }

    public final f j1(int i) {
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int i10 = i * 6 * 2;
        for (int i11 = 0; i11 < 6; i11++) {
            int[] iArr3 = this.f601w;
            iArr[i11] = iArr3[i10 + i11];
            iArr2[i11] = iArr3[i10 + 6 + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        u uVar = this.f602x;
        w wVar = new w(iArr);
        w wVar2 = new w(iArr2);
        e[] eVarArr = u.f607k;
        Objects.requireNonNull(uVar);
        return new x(uVar, wVar, wVar2, eVarArr);
    }

    public final int v0() {
        return this.f600v;
    }
}
