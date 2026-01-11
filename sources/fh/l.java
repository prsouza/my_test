package fh;

import ag.a1;
import ag.e;
import ag.k;
import ag.m;
import ag.s;
import ag.w0;
import xh.a;

public final class l extends m {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5188a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5189b;

    public l(byte[] bArr, byte[] bArr2) {
        this.f5188a = a.a(bArr);
        this.f5189b = a.a(bArr2);
    }

    public final s d() {
        e eVar = new e();
        eVar.a(new k(0));
        eVar.a(new w0(this.f5188a));
        eVar.a(new w0(this.f5189b));
        return new a1(eVar);
    }
}
