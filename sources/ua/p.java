package ua;

import ge.d0;
import ge.g;
import ge.g0;
import ge.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l6.b1;
import md.m;
import ne.c;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import sa.b;

@e(c = "io.nodle.cash.data.repository.TransactionsRepository2$getTransactionsFromCidt$2", f = "TransactionsRepository2.kt", l = {90, 239}, m = "invokeSuspend")
public final class p extends i implements xd.p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f11893a;

    /* renamed from: b  reason: collision with root package name */
    public c f11894b;

    /* renamed from: c  reason: collision with root package name */
    public l f11895c;

    /* renamed from: s  reason: collision with root package name */
    public int f11896s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ l f11897t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ long f11898u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(l lVar, long j10, d<? super p> dVar) {
        super(2, dVar);
        this.f11897t = lVar;
        this.f11898u = j10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new p(this.f11897t, this.f11898u, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        c cVar;
        l lVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11896s;
        if (i == 0) {
            b1.w(obj);
            g0 g0Var = this.f11897t.f11858f;
            long j10 = this.f11898u;
            Objects.requireNonNull(g0Var);
            if (!(j10 < 1653307200000L)) {
                return m.f8555a;
            }
            ri.a.f10801a.a("CIDT request start", new Object[0]);
            l lVar2 = this.f11897t;
            f fVar = lVar2.f11859h;
            String str = lVar2.f11853a;
            long j11 = this.f11898u;
            Objects.requireNonNull(lVar2.f11858f);
            this.f11896s = 1;
            Objects.requireNonNull(fVar);
            obj = g.d(o0.f5434b, new h(j11, 1653307200000L, fVar, str, (d<? super h>) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else if (i == 2) {
            lVar = this.f11895c;
            cVar = this.f11894b;
            arrayList = this.f11893a;
            try {
                b1.w(obj);
                lVar.f11865o.addAll(arrayList);
                cVar.a((Object) null);
            } catch (Exception e10) {
                ri.a.f10801a.c(e10);
            } catch (Throwable th2) {
                cVar.a((Object) null);
                throw th2;
            }
            return m.f8555a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<b> list = (List) obj;
        if (list == null) {
            return m.f8555a;
        }
        l lVar3 = this.f11897t;
        ArrayList arrayList2 = new ArrayList(nd.g.S0(list));
        for (b c10 : list) {
            arrayList2.add(l.c(lVar3, c10));
        }
        l lVar4 = this.f11897t;
        cVar = lVar4.f11864n;
        this.f11893a = arrayList2;
        this.f11894b = cVar;
        this.f11895c = lVar4;
        this.f11896s = 2;
        if (cVar.b((Object) null, this) == aVar) {
            return aVar;
        }
        lVar = lVar4;
        arrayList = arrayList2;
        lVar.f11865o.addAll(arrayList);
        cVar.a((Object) null);
        return m.f8555a;
    }
}
