package fh;

import ag.a1;
import ag.e;
import ag.k;
import ag.m;
import ag.o;
import ag.s;
import ag.t;
import ag.w0;
import java.math.BigInteger;
import xh.a;

public final class n extends m {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5198a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5199b;

    public n(t tVar) {
        if (k.s(tVar.s(0)).t(BigInteger.valueOf(0))) {
            this.f5198a = a.a(o.s(tVar.s(1)).f430a);
            this.f5199b = a.a(o.s(tVar.s(2)).f430a);
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public n(byte[] bArr, byte[] bArr2) {
        this.f5198a = a.a(bArr);
        this.f5199b = a.a(bArr2);
    }

    public static n j(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(t.r(obj));
        }
        return null;
    }

    public final s d() {
        e eVar = new e();
        eVar.a(new k(0));
        eVar.a(new w0(this.f5198a));
        eVar.a(new w0(this.f5199b));
        return new a1(eVar);
    }
}
