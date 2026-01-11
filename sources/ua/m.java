package ua;

import ge.d0;
import java.util.ArrayList;
import l6.b1;
import ne.c;
import pd.d;
import qd.a;
import ra.g;
import rd.e;
import rd.i;
import sa.b;
import xd.p;

@e(c = "io.nodle.cash.data.repository.TransactionsRepository2$getLocalTransactions$2", f = "TransactionsRepository2.kt", l = {70, 239}, m = "invokeSuspend")
public final class m extends i implements p<d0, d<? super md.m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f11873a;

    /* renamed from: b  reason: collision with root package name */
    public c f11874b;

    /* renamed from: c  reason: collision with root package name */
    public l f11875c;

    /* renamed from: s  reason: collision with root package name */
    public int f11876s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ l f11877t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ long f11878u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f11879v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(l lVar, long j10, long j11, d<? super m> dVar) {
        super(2, dVar);
        this.f11877t = lVar;
        this.f11878u = j10;
        this.f11879v = j11;
    }

    public final d<md.m> create(Object obj, d<?> dVar) {
        return new m(this.f11877t, this.f11878u, this.f11879v, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((d0) obj, (d) obj2)).invokeSuspend(md.m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        c cVar;
        l lVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11876s;
        if (i == 0) {
            b1.w(obj);
            g gVar = this.f11877t.f11855c;
            long j10 = this.f11878u;
            long j11 = this.f11879v;
            this.f11876s = 1;
            obj = ge.g.d(gVar.f10636a.f11925a, new ra.e(gVar, j10, j11, (d<? super ra.e>) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else if (i == 2) {
            lVar = this.f11875c;
            cVar = this.f11874b;
            arrayList = this.f11873a;
            b1.w(obj);
            try {
                lVar.f11865o.addAll(arrayList);
                return md.m.f8555a;
            } finally {
                cVar.a((Object) null);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<b> iterable = (Iterable) obj;
        l lVar2 = this.f11877t;
        ArrayList arrayList2 = new ArrayList(nd.g.S0(iterable));
        for (b c10 : iterable) {
            arrayList2.add(l.c(lVar2, c10));
        }
        l lVar3 = this.f11877t;
        cVar = lVar3.f11864n;
        this.f11873a = arrayList2;
        this.f11874b = cVar;
        this.f11875c = lVar3;
        this.f11876s = 2;
        if (cVar.b((Object) null, this) == aVar) {
            return aVar;
        }
        lVar = lVar3;
        arrayList = arrayList2;
        lVar.f11865o.addAll(arrayList);
        return md.m.f8555a;
    }
}
