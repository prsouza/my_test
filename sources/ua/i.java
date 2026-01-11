package ua;

import ah.v;
import android.content.Context;
import android.util.Log;
import ge.d0;
import io.nodle.cash.data.remote.api.BlockExplorerApi;
import io.nodle.cash.data.remote.api.BlockExplorerApiKt;
import java.util.List;
import ki.z;
import l6.b1;
import md.m;
import p002if.b0;
import pd.d;
import rd.e;
import sa.b;
import ta.f;
import ta.h;
import xd.l;
import xd.p;

@e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchTransactionsFromCIDT$2", f = "TransactionRepository.kt", l = {214, 230}, m = "invokeSuspend")
public final class i extends rd.i implements p<d0, d<? super List<? extends b>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11830a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f11831b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11832c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f11833s;

    @e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchTransactionsFromCIDT$2$result$1", f = "TransactionRepository.kt", l = {217}, m = "invokeSuspend")
    public static final class a extends rd.i implements l<d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f11834a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f11835b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f11836c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ int f11837s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, String str, int i, d<? super a> dVar) {
            super(1, dVar);
            this.f11835b = fVar;
            this.f11836c = str;
            this.f11837s = i;
        }

        public final d<m> create(d<?> dVar) {
            return new a(this.f11835b, this.f11836c, this.f11837s, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f11834a;
            if (i == 0) {
                b1.w(obj);
                Object b10 = f.f11451a.a(this.f11835b.f11774a).b(BlockExplorerApi.class);
                e6.e.C(b10, "buildRetrofit(context).c…kExplorerApi::class.java)");
                String K = v.K("blockexplorer_api_url");
                p002if.z historyRequestBody = BlockExplorerApiKt.getHistoryRequestBody(this.f11836c, this.f11837s, 0);
                this.f11834a = 1;
                obj = ((BlockExplorerApi) b10).getHistory(K, historyRequestBody, this);
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

        public final Object k(Object obj) {
            return ((a) create((d) obj)).invokeSuspend(m.f8555a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(f fVar, String str, int i, d<? super i> dVar) {
        super(2, dVar);
        this.f11831b = fVar;
        this.f11832c = str;
        this.f11833s = i;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new i(this.f11831b, this.f11832c, this.f11833s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f11830a;
        boolean z = true;
        if (i == 0) {
            b1.w(obj);
            Log.d(this.f11831b.f11776c, "fetchTransactionsFromCIDT");
            f fVar = f.f11451a;
            a aVar2 = new a(this.f11831b, this.f11832c, this.f11833s, (d<? super a>) null);
            this.f11830a = 1;
            obj = fVar.c(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else if (i == 2) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ta.e eVar = (ta.e) obj;
        if (eVar instanceof h) {
            Log.d(this.f11831b.f11776c, "fetchTransactionsFromCIDT Success");
            T t10 = ((h) eVar).f11461b;
            if (t10 != null) {
                String f10 = ((b0) t10).f();
                if (f10.length() <= 0) {
                    z = false;
                }
                if (z) {
                    Context context = this.f11831b.f11774a;
                    this.f11830a = 2;
                    obj = BlockExplorerApiKt.parseHistoryResponseBody(context, f10, this);
                    return obj == aVar ? aVar : obj;
                }
            }
        } else if (eVar instanceof ta.b) {
            androidx.fragment.app.m.g("Failure in CIDT getTransactions: ", ((ta.b) eVar).f11449c, this.f11831b.f11776c);
        } else if (eVar instanceof ta.a) {
            androidx.fragment.app.m.g("Error in CIDT getTransactions: ", ((ta.a) eVar).f11446b, this.f11831b.f11776c);
        }
        return null;
    }
}
