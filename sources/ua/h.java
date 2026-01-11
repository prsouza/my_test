package ua;

import ad.c;
import android.content.Context;
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
import rd.i;
import sa.b;
import ta.f;
import xd.l;
import xd.p;

@e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchRewardsFromCIDT$2", f = "TransactionRepository.kt", l = {247, 263}, m = "invokeSuspend")
public final class h extends i implements p<d0, d<? super List<? extends b>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11820a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f11821b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f11822c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ f f11823s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f11824t;

    @e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchRewardsFromCIDT$2$result$1", f = "TransactionRepository.kt", l = {250}, m = "invokeSuspend")
    public static final class a extends i implements l<d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f11825a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f11826b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f11827c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ long f11828s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ long f11829t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, String str, long j10, long j11, d<? super a> dVar) {
            super(1, dVar);
            this.f11826b = fVar;
            this.f11827c = str;
            this.f11828s = j10;
            this.f11829t = j11;
        }

        public final d<m> create(d<?> dVar) {
            return new a(this.f11826b, this.f11827c, this.f11828s, this.f11829t, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f11825a;
            if (i == 0) {
                b1.w(obj);
                Object b10 = f.f11451a.a(this.f11826b.f11774a).b(BlockExplorerApi.class);
                e6.e.C(b10, "buildRetrofit(context).c…kExplorerApi::class.java)");
                p002if.z rewardsRequestBody = BlockExplorerApiKt.getRewardsRequestBody(this.f11827c, c.M(this.f11828s), c.M(this.f11829t));
                this.f11825a = 1;
                obj = BlockExplorerApi.DefaultImpls.getStats$default((BlockExplorerApi) b10, (String) null, rewardsRequestBody, this, 1, (Object) null);
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
    public h(long j10, long j11, f fVar, String str, d<? super h> dVar) {
        super(2, dVar);
        this.f11821b = j10;
        this.f11822c = j11;
        this.f11823s = fVar;
        this.f11824t = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f11821b, this.f11822c, this.f11823s, this.f11824t, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f11820a;
        boolean z = true;
        if (i == 0) {
            b1.w(obj);
            ri.a.f10801a.a("fetchRewardsFromCIDT, fromTime : %s, toTime = %s", c.M(this.f11821b), c.M(this.f11822c));
            f fVar = f.f11451a;
            a aVar2 = new a(this.f11823s, this.f11824t, this.f11821b, this.f11822c, (d<? super a>) null);
            this.f11820a = 1;
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
        if (eVar instanceof ta.h) {
            b0 b0Var = (b0) ((ta.h) eVar).f11461b;
            String f10 = b0Var != null ? b0Var.f() : null;
            if (!(f10 == null || f10.length() == 0)) {
                z = false;
            }
            if (!z) {
                Context context = this.f11823s.f11774a;
                this.f11820a = 2;
                obj = BlockExplorerApiKt.parseRewardsResponseBody(context, f10, this);
                return obj == aVar ? aVar : obj;
            }
            ri.a.f10801a.b("Failure in fetchStats: Empty response body", new Object[0]);
        } else if (eVar instanceof ta.b) {
            ri.a.f10801a.b(a8.a.c("Failure in fetchStats: ", ((ta.b) eVar).f11449c), new Object[0]);
        } else if (eVar instanceof ta.a) {
            ta.a aVar3 = (ta.a) eVar;
            ri.a.f10801a.d(aVar3.f11445a, a8.a.c("Error in fetchStats: ", aVar3.f11446b), new Object[0]);
        }
        return null;
    }
}
