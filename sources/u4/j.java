package u4;

import android.content.Context;
import c5.b;
import c5.c;
import cc.a;

public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f11700a;

    /* renamed from: b  reason: collision with root package name */
    public final a<c5.a> f11701b;

    /* renamed from: c  reason: collision with root package name */
    public final a<c5.a> f11702c;

    public j(a aVar) {
        b bVar = b.a.f3248a;
        c cVar = c.a.f3249a;
        this.f11700a = aVar;
        this.f11701b = bVar;
        this.f11702c = cVar;
    }

    public final Object get() {
        return new i(this.f11700a.get(), this.f11701b.get(), this.f11702c.get());
    }
}
