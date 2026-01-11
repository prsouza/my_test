package qc;

import ca.c;
import e6.e;
import kc.a;
import md.m;
import xd.l;
import yd.h;

public final class b extends h implements l<c, m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f10399b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f10400c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f10401s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, a aVar2, Object obj) {
        super(1);
        this.f10399b = aVar;
        this.f10400c = aVar2;
        this.f10401s = obj;
    }

    public final Object k(Object obj) {
        c cVar = (c) obj;
        e.D(cVar, "$receiver");
        this.f10399b.c(cVar, this.f10400c, this.f10401s);
        return m.f8555a;
    }
}
