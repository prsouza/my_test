package cf;

import df.e;
import ff.c;
import ff.d;
import java.security.PrivateKey;
import java.util.Arrays;

public final class b implements a, PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3446a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3447b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3448c;

    /* renamed from: s  reason: collision with root package name */
    public final e f3449s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f3450t;

    /* renamed from: u  reason: collision with root package name */
    public final c f3451u;

    public b(d dVar) {
        this.f3446a = dVar.f5116a;
        this.f3447b = dVar.f5117b;
        this.f3448c = dVar.f5118c;
        e eVar = dVar.f5119s;
        this.f3449s = eVar;
        this.f3450t = eVar.n();
        this.f3451u = dVar.f5120t;
    }

    public final c a() {
        return this.f3451u;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Arrays.equals(this.f3446a, bVar.f3446a) || !this.f3451u.equals(bVar.f3451u)) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return "EdDSA";
    }

    public final byte[] getEncoded() {
        byte[] bArr;
        if (!this.f3451u.equals(ff.b.f5110a) || (bArr = this.f3446a) == null) {
            return null;
        }
        int length = bArr.length + 16;
        byte[] bArr2 = new byte[length];
        bArr2[0] = 48;
        bArr2[1] = (byte) (length - 2);
        bArr2[2] = 2;
        bArr2[3] = 1;
        bArr2[4] = 0;
        bArr2[5] = 48;
        bArr2[6] = 5;
        bArr2[7] = 6;
        bArr2[8] = 3;
        bArr2[9] = 43;
        bArr2[10] = 101;
        bArr2[11] = 112;
        bArr2[12] = 4;
        bArr2[13] = (byte) (bArr.length + 2);
        bArr2[14] = 4;
        bArr2[15] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3446a);
    }
}
