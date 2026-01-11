package ab;

import ge.d0;
import l6.b1;
import md.m;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.domain.manager.FlashManager$deviceText$1", f = "FlashManager.kt", l = {99}, m = "invokeSuspend")
public final class d extends i implements p<d0, pd.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f211a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f212b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, pd.d<? super d> dVar) {
        super(2, dVar);
        this.f212b = str;
    }

    public final pd.d<m> create(Object obj, pd.d<?> dVar) {
        return new d(this.f212b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [je.l, je.h<java.lang.String>] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = a.COROUTINE_SUSPENDED;
        int i = this.f211a;
        if (i == 0) {
            b1.w(obj);
            f fVar = f.f215a;
            ? r42 = f.f226n;
            String str = this.f212b;
            this.f211a = 1;
            if (r42.a(str, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8555a;
    }
}
