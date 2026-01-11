package yc;

import ca.c;
import e6.e;
import java.util.Map;
import java.util.Objects;
import md.m;
import tc.f;
import tc.j;
import xd.l;
import yd.h;

public final class a extends h implements l<c, m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f13585b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f.c.a f13586c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Map f13587s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Map f13588t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, f.c.a aVar, Map map, Map map2) {
        super(1);
        this.f13585b = bVar;
        this.f13586c = aVar;
        this.f13587s = map;
        this.f13588t = map2;
    }

    public final Object k(Object obj) {
        c cVar = (c) obj;
        e.D(cVar, "$receiver");
        f.c.a aVar = this.f13586c;
        if (aVar instanceof f.c.a.b) {
            j.f11552d.b(cVar, this.f13585b.f13591c, ((f.c.a.b) aVar).f11542a);
        } else if (aVar instanceof f.c.a.C0224a) {
            Objects.requireNonNull((f.c.a.C0224a) aVar);
            e.D((Object) null, "byteArray");
            throw null;
        }
        b bVar = this.f13585b;
        bVar.f13590b.f11539c.b(cVar, bVar.f13591c, this.f13587s);
        tc.a aVar2 = tc.a.f11531b;
        tc.a.f11530a.b(cVar, this.f13585b.f13591c, this.f13588t);
        return m.f8555a;
    }
}
