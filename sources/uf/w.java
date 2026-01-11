package uf;

import e6.e;
import nd.d;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f11993a;

    /* renamed from: b  reason: collision with root package name */
    public int f11994b;

    /* renamed from: c  reason: collision with root package name */
    public int f11995c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11996d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11997e;

    /* renamed from: f  reason: collision with root package name */
    public w f11998f;
    public w g;

    public w() {
        this.f11993a = new byte[LZ4Constants.HASH_TABLE_SIZE_64K];
        this.f11997e = true;
        this.f11996d = false;
    }

    public final w a() {
        w wVar = this.f11998f;
        if (wVar == this) {
            wVar = null;
        }
        w wVar2 = this.g;
        e.B(wVar2);
        wVar2.f11998f = this.f11998f;
        w wVar3 = this.f11998f;
        e.B(wVar3);
        wVar3.g = this.g;
        this.f11998f = null;
        this.g = null;
        return wVar;
    }

    public final w b(w wVar) {
        wVar.g = this;
        wVar.f11998f = this.f11998f;
        w wVar2 = this.f11998f;
        e.B(wVar2);
        wVar2.g = wVar;
        this.f11998f = wVar;
        return wVar;
    }

    public final w c() {
        this.f11996d = true;
        return new w(this.f11993a, this.f11994b, this.f11995c, true);
    }

    public final void d(w wVar, int i) {
        if (wVar.f11997e) {
            int i10 = wVar.f11995c;
            int i11 = i10 + i;
            if (i11 > 8192) {
                if (!wVar.f11996d) {
                    int i12 = wVar.f11994b;
                    if (i11 - i12 <= 8192) {
                        byte[] bArr = wVar.f11993a;
                        d.F(bArr, bArr, 0, i12, i10, 2);
                        wVar.f11995c -= wVar.f11994b;
                        wVar.f11994b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f11993a;
            byte[] bArr3 = wVar.f11993a;
            int i13 = wVar.f11995c;
            int i14 = this.f11994b;
            d.E(bArr2, bArr3, i13, i14, i14 + i);
            wVar.f11995c += i;
            this.f11994b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public w(byte[] bArr, int i, int i10, boolean z) {
        e.D(bArr, "data");
        this.f11993a = bArr;
        this.f11994b = i;
        this.f11995c = i10;
        this.f11996d = z;
        this.f11997e = false;
    }
}
