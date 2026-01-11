package io.nodle.cash.data.local;

import android.app.Application;
import ge.d0;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.data.local.CashDatabase$Companion$clearDatabase$1", f = "CashDatabase.kt", l = {}, m = "invokeSuspend")
public final class b extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Application f6687a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Application application, d<? super b> dVar) {
        super(2, dVar);
        this.f6687a = application;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f6687a, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m mVar = m.f8555a;
        ((b) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
        return mVar;
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        b1.w(obj);
        CashDatabase.f6682n.a(this.f6687a).d();
        return m.f8555a;
    }
}
