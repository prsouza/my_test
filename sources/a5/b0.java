package a5;

import a5.i;
import c5.b;
import c5.c;
import cc.a;
import java.util.Objects;

public final class b0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final a<c5.a> f74a;

    /* renamed from: b  reason: collision with root package name */
    public final a<c5.a> f75b;

    /* renamed from: c  reason: collision with root package name */
    public final a<e> f76c;

    /* renamed from: d  reason: collision with root package name */
    public final a<h0> f77d;

    /* renamed from: e  reason: collision with root package name */
    public final a<String> f78e;

    public b0(a aVar, a aVar2) {
        b bVar = b.a.f3248a;
        c cVar = c.a.f3249a;
        i iVar = i.a.f98a;
        this.f74a = bVar;
        this.f75b = cVar;
        this.f76c = iVar;
        this.f77d = aVar;
        this.f78e = aVar2;
    }

    public final Object get() {
        w4.a aVar;
        c5.a aVar2 = this.f74a.get();
        c5.a aVar3 = this.f75b.get();
        e eVar = this.f76c.get();
        h0 h0Var = this.f77d.get();
        a<String> aVar4 = this.f78e;
        Object obj = w4.a.f12605c;
        if (aVar4 instanceof v4.a) {
            aVar = (v4.a) aVar4;
        } else {
            Objects.requireNonNull(aVar4);
            aVar = new w4.a(aVar4);
        }
        return new a0(aVar2, aVar3, eVar, h0Var, aVar);
    }
}
