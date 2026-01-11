package fh;

import ag.a1;
import ag.d1;
import ag.e;
import ag.k;
import ag.o;
import ag.s;
import ag.t;
import ag.w0;
import ag.y;
import xh.a;
import xh.b;

public final class m extends ag.m {

    /* renamed from: a  reason: collision with root package name */
    public final int f5190a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5191b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5192c;

    /* renamed from: s  reason: collision with root package name */
    public final byte[] f5193s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f5194t;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f5195u;

    /* renamed from: v  reason: collision with root package name */
    public final int f5196v;

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f5197w;

    public m(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f5190a = 0;
        this.f5191b = i;
        this.f5192c = a.a(bArr);
        this.f5193s = a.a(bArr2);
        this.f5194t = a.a(bArr3);
        this.f5195u = a.a(bArr4);
        this.f5197w = a.a(bArr5);
        this.f5196v = -1;
    }

    public m(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i10) {
        this.f5190a = 1;
        this.f5191b = i;
        this.f5192c = a.a(bArr);
        this.f5193s = a.a(bArr2);
        this.f5194t = a.a(bArr3);
        this.f5195u = a.a(bArr4);
        this.f5197w = a.a(bArr5);
        this.f5196v = i10;
    }

    public m(t tVar) {
        int i;
        k s10 = k.s(tVar.s(0));
        if (s10.t(b.f13290a) || s10.t(b.f13291b)) {
            this.f5190a = s10.v();
            if (tVar.size() == 2 || tVar.size() == 3) {
                t r10 = t.r(tVar.s(1));
                this.f5191b = k.s(r10.s(0)).v();
                this.f5192c = a.a(o.s(r10.s(1)).f430a);
                this.f5193s = a.a(o.s(r10.s(2)).f430a);
                this.f5194t = a.a(o.s(r10.s(3)).f430a);
                this.f5195u = a.a(o.s(r10.s(4)).f430a);
                if (r10.size() == 6) {
                    y r11 = y.r(r10.s(5));
                    if (r11.f464a == 0) {
                        i = k.r(r11).v();
                    } else {
                        throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                    }
                } else if (r10.size() == 5) {
                    i = -1;
                } else {
                    throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
                }
                this.f5196v = i;
                if (tVar.size() == 3) {
                    this.f5197w = a.a(o.r(y.r(tVar.s(2))).f430a);
                } else {
                    this.f5197w = null;
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
        eVar.a(this.f5196v >= 0 ? new k(1) : new k(0));
        e eVar2 = new e();
        eVar2.a(new k((long) this.f5191b));
        eVar2.a(new w0(this.f5192c));
        eVar2.a(new w0(this.f5193s));
        eVar2.a(new w0(this.f5194t));
        eVar2.a(new w0(this.f5195u));
        int i = this.f5196v;
        if (i >= 0) {
            eVar2.a(new d1(false, 0, new k((long) i)));
        }
        eVar.a(new a1(eVar2));
        eVar.a(new d1(true, 0, new w0(this.f5197w)));
        return new a1(eVar);
    }
}
