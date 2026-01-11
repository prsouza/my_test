package gf;

import a.b;
import ah.v;
import e6.e;
import h4.k;
import java.util.ArrayList;
import xd.l;
import xe.n;
import yd.h;

public final class d extends h implements l<p4.d, a> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p4.d f5485b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(p4.d dVar) {
        super(1);
        this.f5485b = dVar;
    }

    public final Object k(Object obj) {
        e.D((p4.d) obj, "it");
        p4.d dVar = this.f5485b;
        e.D(dVar, "$this$readArray");
        b.X(dVar);
        ArrayList arrayList = new ArrayList();
        while (dVar.V0() != k.END_ARRAY) {
            arrayList.add(Integer.valueOf(dVar.R0()));
        }
        a aVar = new a(arrayList, b.R(this.f5485b), b.S(this.f5485b), n.b(this.f5485b), (aa.b) null, 48);
        if (aVar.f5479b == 1) {
            if (v.m(aVar)) {
                p4.d dVar2 = this.f5485b;
                e.D(dVar2, "$this$readEd25519SecurityParameters");
                b.X(dVar2);
                b.X(dVar2);
                b.R(dVar2);
                byte[] I = b.I(dVar2);
                b.L(dVar2);
                b.X(dVar2);
                b.R(dVar2);
                long S = b.S(dVar2);
                b.L(dVar2);
                b.L(dVar2);
                aVar.f5482e = new e(new qg.e(I), S);
            }
            aVar.f5483f = b.s(this.f5485b, new c(this));
            return aVar;
        }
        throw new xe.l("security context unknown");
    }
}
