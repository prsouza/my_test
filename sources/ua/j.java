package ua;

import ah.v;
import android.content.Context;
import android.util.Log;
import ge.d0;
import io.nodle.cash.data.remote.api.SubscanApi;
import io.nodle.cash.data.remote.api.SubscanApiKt;
import java.util.List;
import ki.z;
import l6.b1;
import md.m;
import p002if.b0;
import pd.d;
import rd.e;
import rd.i;
import sa.b;
import ta.f;
import ta.h;
import xd.l;
import xd.p;

@e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchTransactionsFromSubscan$2", f = "TransactionRepository.kt", l = {185, 199}, m = "invokeSuspend")
public final class j extends i implements p<d0, d<? super List<? extends b>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11838a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f11839b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11840c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f11841s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f11842t;

    @e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchTransactionsFromSubscan$2$result$1", f = "TransactionRepository.kt", l = {188}, m = "invokeSuspend")
    public static final class a extends i implements l<d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f11843a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f11844b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f11845c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ int f11846s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ int f11847t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, String str, int i, int i10, d<? super a> dVar) {
            super(1, dVar);
            this.f11844b = fVar;
            this.f11845c = str;
            this.f11846s = i;
            this.f11847t = i10;
        }

        public final d<m> create(d<?> dVar) {
            return new a(this.f11844b, this.f11845c, this.f11846s, this.f11847t, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f11843a;
            if (i == 0) {
                b1.w(obj);
                Object b10 = f.f11451a.a(this.f11844b.f11774a).b(SubscanApi.class);
                e6.e.C(b10, "buildRetrofit(context).c…e(SubscanApi::class.java)");
                String K = v.K("subscan_api_url");
                p002if.z subscanHistoryRequestBody = SubscanApiKt.getSubscanHistoryRequestBody(this.f11845c, this.f11846s, this.f11847t);
                this.f11843a = 1;
                obj = ((SubscanApi) b10).getHistory(K, subscanHistoryRequestBody, this);
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
    public j(f fVar, String str, int i, int i10, d<? super j> dVar) {
        super(2, dVar);
        this.f11839b = fVar;
        this.f11840c = str;
        this.f11841s = i;
        this.f11842t = i10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new j(this.f11839b, this.f11840c, this.f11841s, this.f11842t, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f11838a;
        boolean z = true;
        if (i == 0) {
            b1.w(obj);
            androidx.fragment.app.m.g("fetchTransactionsFromSubscan ", this.f11840c, this.f11839b.f11776c);
            f fVar = f.f11451a;
            a aVar2 = new a(this.f11839b, this.f11840c, this.f11841s, this.f11842t, (d<? super a>) null);
            this.f11838a = 1;
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
            Log.d(this.f11839b.f11776c, "fetchTransactionsFromSubscan Success");
            T t10 = ((h) eVar).f11461b;
            if (t10 == null) {
                return null;
            }
            String f10 = ((b0) t10).f();
            if (f10.length() <= 0) {
                z = false;
            }
            if (!z) {
                return null;
            }
            Context context = this.f11839b.f11774a;
            this.f11838a = 2;
            obj = SubscanApiKt.parseSubscanHistoryResponseBody(context, f10, this);
            return obj == aVar ? aVar : obj;
        } else if (eVar instanceof ta.b) {
            androidx.fragment.app.m.g("Failure in Subscan getTransactions: ", ((ta.b) eVar).f11449c, this.f11839b.f11776c);
            return null;
        } else if (!(eVar instanceof ta.a)) {
            return null;
        } else {
            androidx.fragment.app.m.g("Error in Subscan getTransactions: ", ((ta.a) eVar).f11446b, this.f11839b.f11776c);
            return null;
        }
    }
}
