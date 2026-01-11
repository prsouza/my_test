package y4;

import a5.d;
import android.content.Context;
import c5.c;
import cc.a;
import z4.f;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f13489a;

    /* renamed from: b  reason: collision with root package name */
    public final a<d> f13490b;

    /* renamed from: c  reason: collision with root package name */
    public final a<f> f13491c;

    /* renamed from: d  reason: collision with root package name */
    public final a<c5.a> f13492d;

    public g(a aVar, a aVar2, a aVar3) {
        c cVar = c.a.f3249a;
        this.f13489a = aVar;
        this.f13490b = aVar2;
        this.f13491c = aVar3;
        this.f13492d = cVar;
    }

    public final Object get() {
        c5.a aVar = this.f13492d.get();
        return new z4.d(this.f13489a.get(), this.f13490b.get(), this.f13491c.get());
    }
}
