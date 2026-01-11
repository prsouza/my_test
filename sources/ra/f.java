package ra;

import de.h;
import ge.d0;
import java.util.List;
import l6.b1;
import md.m;
import pd.d;
import qa.c;
import qd.a;
import rd.e;
import rd.i;
import sa.b;
import xd.p;

@e(c = "io.nodle.cash.data.local.TransactionLocalStorage$saveTransactions$2", f = "TransactionLocalStorage.kt", l = {40}, m = "invokeSuspend")
public final class f extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10631a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f10632b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List<b> f10633c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f10634s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(g gVar, List<b> list, long j10, d<? super f> dVar) {
        super(2, dVar);
        this.f10632b = gVar;
        this.f10633c = list;
        this.f10634s = j10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new f(this.f10632b, this.f10633c, this.f10634s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f10631a;
        if (i == 0) {
            b1.w(obj);
            c cVar = this.f10632b.f10637b;
            List<b> list = this.f10633c;
            this.f10631a = 1;
            if (cVar.g(list, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MIN_VALUE;
        for (b bVar : this.f10633c) {
            j10 = Math.min(bVar.f11045y, j10);
            j11 = Math.max(bVar.f11045y, j11);
        }
        g gVar = this.f10632b;
        c cVar2 = gVar.f10639d;
        h<Object>[] hVarArr = g.f10635e;
        gVar.f10639d.b(gVar, hVarArr[1], Math.min(cVar2.a(gVar, hVarArr[1]).longValue(), j10));
        g gVar2 = this.f10632b;
        gVar2.f10638c.b(gVar2, hVarArr[0], Math.max(gVar2.f10638c.a(gVar2, hVarArr[0]).longValue(), Math.max(j11, this.f10634s)));
        return m.f8555a;
    }
}
