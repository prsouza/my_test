package h1;

import ge.d0;
import ge.k;
import java.util.concurrent.Callable;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
public final class l extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f5745a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k<Object> f5746b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Callable<Object> callable, k<Object> kVar, d<? super l> dVar) {
        super(2, dVar);
        this.f5745a = callable;
        this.f5746b = kVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new l(this.f5745a, this.f5746b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m mVar = m.f8555a;
        ((l) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
        return mVar;
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        b1.w(obj);
        try {
            this.f5746b.resumeWith(this.f5745a.call());
        } catch (Throwable th2) {
            this.f5746b.resumeWith(b1.k(th2));
        }
        return m.f8555a;
    }
}
