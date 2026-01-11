package tb;

import ge.d0;
import ge.g;
import ge.o0;
import io.nodle.cash.ui.viewmodel.HistoryViewModelV2;
import java.util.Objects;
import jc.b;
import je.f;
import l6.b1;
import md.m;
import pd.d;
import rd.i;
import ua.e;
import xd.p;

@rd.e(c = "io.nodle.cash.ui.viewmodel.HistoryViewModelV2$fetchHistory$1", f = "HistoryViewModelV2.kt", l = {64, 65}, m = "invokeSuspend")
public final class e extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11482a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HistoryViewModelV2 f11483b;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HistoryViewModelV2 f11484a;

        public a(HistoryViewModelV2 historyViewModelV2) {
            this.f11484a = historyViewModelV2;
        }

        public final Object a(Object obj, d dVar) {
            ua.e eVar = (ua.e) obj;
            if (eVar instanceof e.b) {
                HistoryViewModelV2 historyViewModelV2 = this.f11484a;
                g.b(b.y(historyViewModelV2), (pd.f) null, new f(historyViewModelV2, (d<? super f>) null), 3);
            } else if (eVar instanceof e.a) {
                this.f11484a.f6764y.k(Boolean.valueOf(((e.a) eVar).f11773c));
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(HistoryViewModelV2 historyViewModelV2, d<? super e> dVar) {
        super(2, dVar);
        this.f11483b = historyViewModelV2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new e(this.f11483b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f11482a;
        if (i == 0) {
            b1.w(obj);
            HistoryViewModelV2 historyViewModelV2 = this.f11483b;
            ua.f fVar = historyViewModelV2.f6758s;
            String str = historyViewModelV2.f6760u;
            this.f11482a = 1;
            Objects.requireNonNull(fVar);
            obj = g.d(o0.f5434b, new ua.g(fVar, str, 101, (d<? super ua.g>) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else if (i == 2) {
            b1.w(obj);
            return m.f8555a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a aVar2 = new a(this.f11483b);
        this.f11482a = 2;
        if (((je.e) obj).b(aVar2, this) == aVar) {
            return aVar;
        }
        return m.f8555a;
    }
}
