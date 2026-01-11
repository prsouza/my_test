package tb;

import bb.g;
import ge.d0;
import io.nodle.cash.ui.viewmodel.HistoryViewModelV2;
import je.o;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.HistoryViewModelV2$loadHistoryLocal$1", f = "HistoryViewModelV2.kt", l = {88, 88}, m = "invokeSuspend")
public final class f extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public o f11485a;

    /* renamed from: b  reason: collision with root package name */
    public int f11486b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ HistoryViewModelV2 f11487c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(HistoryViewModelV2 historyViewModelV2, d<? super f> dVar) {
        super(2, dVar);
        this.f11487c = historyViewModelV2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new f(this.f11487c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        o oVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11486b;
        if (i == 0) {
            b1.w(obj);
            HistoryViewModelV2 historyViewModelV2 = this.f11487c;
            oVar = historyViewModelV2.f6762w;
            ua.f fVar = historyViewModelV2.f6758s;
            g gVar = historyViewModelV2.f6761v;
            int i10 = historyViewModelV2.f6759t;
            this.f11485a = oVar;
            this.f11486b = 1;
            obj = fVar.c(gVar, i10, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            oVar = this.f11485a;
            b1.w(obj);
        } else if (i == 2) {
            b1.w(obj);
            return m.f8555a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f11485a = null;
        this.f11486b = 2;
        if (oVar.a(obj, this) == aVar) {
            return aVar;
        }
        return m.f8555a;
    }
}
