package ua;

import ge.d0;
import ge.g1;
import ki.j;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.data.repository.TransactionsRepository2$requestTransaction$2", f = "TransactionsRepository2.kt", l = {142, 146, 146}, m = "invokeSuspend")
public final class q extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11899a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11900b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11901c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ l f11902s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ long f11903t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(int i, int i10, l lVar, long j10, d<? super q> dVar) {
        super(2, dVar);
        this.f11900b = i;
        this.f11901c = i10;
        this.f11902s = lVar;
        this.f11903t = j10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new q(this.f11900b, this.f11901c, this.f11902s, this.f11903t, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11899a;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                try {
                    b1.w(obj);
                } catch (Exception e10) {
                    ri.a.f10801a.c(e10);
                    if (this.f11901c > 0) {
                        if (this.f11900b < this.f11902s.f11863m.get() && (e10 instanceof j) && ((j) e10).f7606a == 429) {
                            z = true;
                        }
                        if (z) {
                            this.f11899a = 2;
                            obj = l.a(this.f11902s, this.f11900b, this.f11903t, this.f11901c - 1);
                            if (obj == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
            } else if (i == 2) {
                b1.w(obj);
            } else if (i == 3) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8555a;
        }
        b1.w(obj);
        ri.a.f10801a.a("Subscan request start, page = " + this.f11900b + ", repeatMax = " + this.f11901c + ", lastAvailable = " + this.f11902s.f11863m.get(), new Object[0]);
        l lVar = this.f11902s;
        int i10 = this.f11900b;
        long j10 = this.f11903t;
        this.f11899a = 1;
        if (l.b(lVar, i10, j10, this) == aVar) {
            return aVar;
        }
        return m.f8555a;
        this.f11899a = 3;
        if (((g1) obj).t(this) == aVar) {
            return aVar;
        }
        return m.f8555a;
    }
}
