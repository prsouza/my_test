package ua;

import ge.d0;
import java.util.List;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import ra.f;
import ra.g;
import rd.e;
import rd.i;
import sa.b;
import xd.p;

@e(c = "io.nodle.cash.data.repository.TransactionsRepository2$saveResultsToLocalStorage$1", f = "TransactionsRepository2.kt", l = {176}, m = "invokeSuspend")
public final class s extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11912a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f11913b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List<b> f11914c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f11915s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(l lVar, List<b> list, long j10, d<? super s> dVar) {
        super(2, dVar);
        this.f11913b = lVar;
        this.f11914c = list;
        this.f11915s = j10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new s(this.f11913b, this.f11914c, this.f11915s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11912a;
        if (i == 0) {
            b1.w(obj);
            g gVar = this.f11913b.f11855c;
            List<b> list = this.f11914c;
            long j10 = this.f11915s;
            this.f11912a = 1;
            Object d10 = ge.g.d(gVar.f10636a.f11925a, new f(gVar, list, j10, (d<? super f>) null), this);
            if (d10 != aVar) {
                d10 = m.f8555a;
            }
            if (d10 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8555a;
    }
}
