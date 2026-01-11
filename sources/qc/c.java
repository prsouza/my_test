package qc;

import e6.e;
import kc.a;
import md.m;
import xd.l;
import yd.h;

public final class c extends h implements l<ca.c, m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f10402b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f10403c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f10404s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(a aVar, a aVar2, Object obj) {
        super(1);
        this.f10402b = aVar;
        this.f10403c = aVar2;
        this.f10404s = obj;
    }

    public final Object k(Object obj) {
        ca.c cVar = (ca.c) obj;
        e.D(cVar, "$receiver");
        this.f10402b.b(cVar, this.f10403c, this.f10404s);
        return m.f8555a;
    }
}
