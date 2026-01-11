package h1;

import ge.d0;
import java.util.concurrent.Callable;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
public final class j extends i implements p<d0, d<Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f5736a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Callable<Object> callable, d<? super j> dVar) {
        super(2, dVar);
        this.f5736a = callable;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new j(this.f5736a, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        b1.w(obj);
        return this.f5736a.call();
    }
}
