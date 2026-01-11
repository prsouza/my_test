package bc;

import ge.d0;
import java.util.Objects;
import l6.b1;
import ld.a;
import md.m;
import rd.e;
import rd.i;
import xd.l;
import xd.p;
import yd.h;

@e(c = "io.nodle.sdk.location.LocationEngineStarted$waitForFix$2$1", f = "LocationSpi.kt", l = {56}, m = "invokeSuspend")
public final class d extends i implements p<d0, pd.d<? super i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f2959a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f2960b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ie.e<i> f2961c;

    public static final class a extends h implements l<i, m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ie.e<i> f2962b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ie.e<i> eVar) {
            super(1);
            this.f2962b = eVar;
        }

        public final Object k(Object obj) {
            i iVar = (i) obj;
            e6.e.D(iVar, "fix");
            this.f2962b.k(iVar);
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, ie.e<i> eVar2, pd.d<? super d> dVar) {
        super(2, dVar);
        this.f2960b = eVar;
        this.f2961c = eVar2;
    }

    public final pd.d<m> create(Object obj, pd.d<?> dVar) {
        return new d(this.f2960b, this.f2961c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        return new d(this.f2960b, this.f2961c, (pd.d) obj2).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f2959a;
        if (i == 0) {
            b1.w(obj);
            e eVar = this.f2960b;
            T aVar2 = new a(this.f2961c);
            a.C0147a aVar3 = (a.C0147a) eVar;
            Objects.requireNonNull(aVar3);
            aVar3.f8224b.f13622a = aVar2;
            ie.e<i> eVar2 = this.f2961c;
            this.f2959a = 1;
            obj = eVar2.j(this);
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
