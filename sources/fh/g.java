package fh;

import ag.a1;
import ag.d;
import ag.e;
import ag.k;
import ag.m;
import ag.n;
import ag.o;
import ag.s;
import ag.t;
import ag.w0;

public final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    public k f5165a;

    /* renamed from: b  reason: collision with root package name */
    public n f5166b;

    /* renamed from: c  reason: collision with root package name */
    public k f5167c;

    /* renamed from: s  reason: collision with root package name */
    public byte[][] f5168s;

    /* renamed from: t  reason: collision with root package name */
    public byte[][] f5169t;

    /* renamed from: u  reason: collision with root package name */
    public byte[] f5170u;

    public g(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f5165a = new k(0);
        this.f5167c = new k((long) i);
        this.f5168s = c3.k.Z(sArr);
        this.f5169t = c3.k.Z(sArr2);
        this.f5170u = c3.k.X(sArr3);
    }

    public g(t tVar) {
        if (tVar.s(0) instanceof k) {
            this.f5165a = k.s(tVar.s(0));
        } else {
            this.f5166b = n.t(tVar.s(0));
        }
        this.f5167c = k.s(tVar.s(1));
        t r10 = t.r(tVar.s(2));
        this.f5168s = new byte[r10.size()][];
        for (int i = 0; i < r10.size(); i++) {
            this.f5168s[i] = o.s(r10.s(i)).f430a;
        }
        t tVar2 = (t) tVar.s(3);
        this.f5169t = new byte[tVar2.size()][];
        for (int i10 = 0; i10 < tVar2.size(); i10++) {
            this.f5169t[i10] = o.s(tVar2.s(i10)).f430a;
        }
        this.f5170u = o.s(((t) tVar.s(4)).s(0)).f430a;
    }

    public final s d() {
        e eVar = new e();
        d dVar = this.f5165a;
        if (dVar == null) {
            dVar = this.f5166b;
        }
        eVar.a(dVar);
        eVar.a(this.f5167c);
        e eVar2 = new e();
        int i = 0;
        int i10 = 0;
        while (true) {
            byte[][] bArr = this.f5168s;
            if (i10 >= bArr.length) {
                break;
            }
            eVar2.a(new w0(bArr[i10]));
            i10++;
        }
        eVar.a(new a1(eVar2));
        e eVar3 = new e();
        while (true) {
            byte[][] bArr2 = this.f5169t;
            if (i < bArr2.length) {
                eVar3.a(new w0(bArr2[i]));
                i++;
            } else {
                eVar.a(new a1(eVar3));
                e eVar4 = new e();
                eVar4.a(new w0(this.f5170u));
                eVar.a(new a1(eVar4));
                return new a1(eVar);
            }
        }
    }
}
