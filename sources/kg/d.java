package kg;

import ag.m;
import ag.s;
import ag.w0;
import xg.f;
import xh.a;

public final class d extends m {

    /* renamed from: a  reason: collision with root package name */
    public final w0 f7542a;

    /* renamed from: b  reason: collision with root package name */
    public xg.d f7543b;

    /* renamed from: c  reason: collision with root package name */
    public f f7544c;

    public d(xg.d dVar, byte[] bArr) {
        this.f7543b = dVar;
        this.f7542a = new w0(a.a(bArr));
    }

    public final s d() {
        return this.f7542a;
    }

    public final synchronized f j() {
        if (this.f7544c == null) {
            this.f7544c = this.f7543b.g(this.f7542a.f430a).n();
        }
        return this.f7544c;
    }
}
