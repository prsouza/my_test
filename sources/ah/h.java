package ah;

import android.support.v4.media.b;
import java.util.Objects;
import xg.e;
import xg.f;

public final class h extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f526v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int[] f527w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i f528x;

    public h(i iVar, int i, int[] iArr) {
        this.f528x = iVar;
        this.f526v = i;
        this.f527w = iArr;
    }

    public final f i1(int i) {
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f526v; i11++) {
            int i12 = ((i11 ^ i) - 1) >> 31;
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = iArr[i13];
                int[] iArr3 = this.f527w;
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
            int[] iArr3 = this.f527w;
            iArr[i11] = iArr3[i10 + i11];
            iArr2[i11] = iArr3[i10 + 5 + i11];
        }
        return r2(iArr, iArr2);
    }

    public final f r2(int[] iArr, int[] iArr2) {
        i iVar = this.f528x;
        j jVar = new j(iArr);
        j jVar2 = new j(iArr2);
        e[] eVarArr = i.f535k;
        Objects.requireNonNull(iVar);
        return new k(iVar, jVar, jVar2, eVarArr);
    }

    public final int v0() {
        return this.f526v;
    }
}
