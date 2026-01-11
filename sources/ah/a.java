package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class a extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f469v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f470w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b f471x;

    public a(b bVar, int i, int[] iArr) {
        this.f471x = bVar;
        this.f469v = i;
        this.f470w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f469v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 4; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f470w;
                iArr[i13] = i14 ^ (iArr3[i10 + i13] & i12);
                iArr2[i13] = iArr2[i13] ^ (iArr3[(i10 + 4) + i13] & i12);
            }
            i10 += 8;
        }
        return r2(iArr, iArr2);
    }

    public final f j1(int i) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i10 = i * 4 * 2;
        for (int i11 = 0; i11 < 4; i11++) {
            int[] iArr3 = this.f470w;
            iArr[i11] = iArr3[i10 + i11];
            iArr2[i11] = iArr3[i10 + 4 + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        b bVar = this.f471x;
        c cVar = new c(iArr);
        c cVar2 = new c(iArr2);
        e[] eVarArr = b.f479k;
        Objects.requireNonNull(bVar);
        return new d(bVar, cVar, cVar2, eVarArr);
    }

    public final int v0() {
        return this.f469v;
    }
}
