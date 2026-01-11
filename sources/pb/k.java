package pb;

import ab.f;
import ge.d0;
import io.nodle.cash.R;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.view.fragment.home.MapFragment$initMap$2$1$1", f = "MapFragment.kt", l = {196}, m = "invokeSuspend")
public final class k extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9858a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f9859b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(j jVar, d<? super k> dVar) {
        super(2, dVar);
        this.f9859b = jVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new k(this.f9859b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f9858a;
        if (i == 0) {
            b1.w(obj);
            f fVar = f.f215a;
            String string = this.f9859b.getString(R.string.discoverSubTitle);
            e6.e.C(string, "getString(R.string.discoverSubTitle)");
            this.f9858a = 1;
            if (fVar.n(string, false, false, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8555a;
    }
}
