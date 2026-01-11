package a5;

import a5.f;
import a5.h;
import android.content.Context;
import cc.a;

public final class i0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f99a;

    /* renamed from: b  reason: collision with root package name */
    public final a<String> f100b;

    /* renamed from: c  reason: collision with root package name */
    public final a<Integer> f101c;

    public i0(a aVar) {
        f fVar = f.a.f83a;
        h hVar = h.a.f87a;
        this.f99a = aVar;
        this.f100b = fVar;
        this.f101c = hVar;
    }

    public final Object get() {
        return new h0(this.f99a.get(), this.f100b.get(), this.f101c.get().intValue());
    }
}
