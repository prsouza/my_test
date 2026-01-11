package ab;

import ge.d0;
import je.o;
import l6.b1;
import md.f;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.domain.manager.FlashManager$subText$1", f = "FlashManager.kt", l = {75}, m = "invokeSuspend")
public final class g extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f270a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f271b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str, d<? super g> dVar) {
        super(2, dVar);
        this.f271b = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f271b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f270a;
        if (i == 0) {
            b1.w(obj);
            f fVar = f.f215a;
            o oVar = f.f225m;
            f fVar2 = new f(h.SUB_TEXT, this.f271b);
            this.f270a = 1;
            oVar.a(fVar2, this);
            if (m.f8555a == aVar) {
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
