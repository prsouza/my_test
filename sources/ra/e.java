package ra;

import ge.d0;
import java.util.List;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.i;
import sa.b;
import xd.p;

@rd.e(c = "io.nodle.cash.data.local.TransactionLocalStorage$getTransactions$2", f = "TransactionLocalStorage.kt", l = {35}, m = "invokeSuspend")
public final class e extends i implements p<d0, d<? super List<? extends b>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10627a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f10628b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f10629c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f10630s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(g gVar, long j10, long j11, d<? super e> dVar) {
        super(2, dVar);
        this.f10628b = gVar;
        this.f10629c = j10;
        this.f10630s = j11;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new e(this.f10628b, this.f10629c, this.f10630s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f10627a;
        if (i == 0) {
            b1.w(obj);
            c cVar = this.f10628b.f10637b;
            long j10 = this.f10629c;
            long j11 = this.f10630s;
            this.f10627a = 1;
            obj = cVar.c(j10, j11, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
