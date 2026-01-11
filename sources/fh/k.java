package fh;

import ag.a1;
import ag.d1;
import ag.e;
import ag.m;
import ag.o;
import ag.s;
import ag.t;
import ag.w0;
import ag.y;
import xh.a;
import xh.b;

public final class k extends m {

    /* renamed from: a  reason: collision with root package name */
    public final int f5180a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5181b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5182c;

    /* renamed from: s  reason: collision with root package name */
    public final byte[] f5183s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f5184t;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f5185u;

    /* renamed from: v  reason: collision with root package name */
    public final byte[] f5186v;

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f5187w;

    public k(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f5180a = 0;
        this.f5181b = j10;
        this.f5183s = a.a(bArr);
        this.f5184t = a.a(bArr2);
        this.f5185u = a.a(bArr3);
        this.f5186v = a.a(bArr4);
        this.f5187w = a.a(bArr5);
        this.f5182c = -1;
    }

    public k(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j11) {
        this.f5180a = 1;
        this.f5181b = j10;
        this.f5183s = a.a(bArr);
        this.f5184t = a.a(bArr2);
        this.f5185u = a.a(bArr3);
        this.f5186v = a.a(bArr4);
        this.f5187w = a.a(bArr5);
        this.f5182c = j11;
    }

    public k(t tVar) {
        long j10;
        ag.k s10 = ag.k.s(tVar.s(0));
        if (s10.t(b.f13290a) || s10.t(b.f13291b)) {
            this.f5180a = s10.v();
            if (tVar.size() == 2 || tVar.size() == 3) {
                t r10 = t.r(tVar.s(1));
                this.f5181b = ag.k.s(r10.s(0)).x();
                this.f5183s = a.a(o.s(r10.s(1)).f430a);
                this.f5184t = a.a(o.s(r10.s(2)).f430a);
                this.f5185u = a.a(o.s(r10.s(3)).f430a);
                this.f5186v = a.a(o.s(r10.s(4)).f430a);
                if (r10.size() == 6) {
                    y r11 = y.r(r10.s(5));
                    if (r11.f464a == 0) {
                        j10 = ag.k.r(r11).x();
                    } else {
                        throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                    }
                } else if (r10.size() == 5) {
                    j10 = -1;
                } else {
                    throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
                }
                this.f5182c = j10;
                if (tVar.size() == 3) {
                    this.f5187w = a.a(o.r(y.r(tVar.s(2))).f430a);
                } else {
                    this.f5187w = null;
                }
            } else {
                throw new IllegalArgumentException("key sequence wrong size");
            }
        } else {
            throw new IllegalArgumentException("unknown version of sequence");
        }
    }

    public final s d() {
        e eVar = new e();
        eVar.a(this.f5182c >= 0 ? new ag.k(1) : new ag.k(0));
        e eVar2 = new e();
        eVar2.a(new ag.k(this.f5181b));
        eVar2.a(new w0(this.f5183s));
        eVar2.a(new w0(this.f5184t));
        eVar2.a(new w0(this.f5185u));
        eVar2.a(new w0(this.f5186v));
        long j10 = this.f5182c;
        if (j10 >= 0) {
            eVar2.a(new d1(false, 0, new ag.k(j10)));
        }
        eVar.a(new a1(eVar2));
        eVar.a(new d1(true, 0, new w0(this.f5187w)));
        return new a1(eVar);
    }
}
