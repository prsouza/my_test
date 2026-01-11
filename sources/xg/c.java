package xg;

import android.support.v4.media.b;
import java.math.BigInteger;

public final class c extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f13233v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f13234w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ byte[] f13235x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ d f13236y;

    public c(d dVar, int i, int i10, byte[] bArr) {
        this.f13236y = dVar;
        this.f13233v = i;
        this.f13234w = i10;
        this.f13235x = bArr;
    }

    public final f i1(int i) {
        int i10;
        int i11 = this.f13234w;
        byte[] bArr = new byte[i11];
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < this.f13233v; i13++) {
            int i14 = ((i13 ^ i) - 1) >> 31;
            int i15 = 0;
            while (true) {
                i10 = this.f13234w;
                if (i15 >= i10) {
                    break;
                }
                byte b10 = bArr[i15];
                byte[] bArr3 = this.f13235x;
                bArr[i15] = (byte) (b10 ^ (bArr3[i12 + i15] & i14));
                bArr2[i15] = (byte) ((bArr3[(i10 + i12) + i15] & i14) ^ bArr2[i15]);
                i15++;
            }
            i12 += i10 * 2;
        }
        return r2(bArr, bArr2);
    }

    public final f j1(int i) {
        int i10 = this.f13234w;
        byte[] bArr = new byte[i10];
        byte[] bArr2 = new byte[i10];
        int i11 = i * i10 * 2;
        int i12 = 0;
        while (true) {
            int i13 = this.f13234w;
            if (i12 >= i13) {
                return r2(bArr, bArr2);
            }
            byte[] bArr3 = this.f13235x;
            bArr[i12] = bArr3[i11 + i12];
            bArr2[i12] = bArr3[i13 + i11 + i12];
            i12++;
        }
    }

    public final f r2(byte[] bArr, byte[] bArr2) {
        d dVar = this.f13236y;
        return dVar.e(dVar.j(new BigInteger(1, bArr)), this.f13236y.j(new BigInteger(1, bArr2)));
    }

    public final int v0() {
        return this.f13233v;
    }
}
