package tb;

import c3.k;
import ge.d0;
import io.nodle.cash.ui.viewmodel.ImportAccountViewModel;
import java.util.Objects;
import je.o;
import l6.b1;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.ImportAccountViewModel$validateInputs$2", f = "ImportAccountViewModel.kt", l = {61}, m = "invokeSuspend")
public final class m extends i implements p<d0, d<? super md.m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11501a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImportAccountViewModel f11502b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(ImportAccountViewModel importAccountViewModel, d<? super m> dVar) {
        super(2, dVar);
        this.f11502b = importAccountViewModel;
    }

    public final d<md.m> create(Object obj, d<?> dVar) {
        return new m(this.f11502b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((d0) obj, (d) obj2)).invokeSuspend(md.m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11501a;
        if (i == 0) {
            b1.w(obj);
            this.f11501a = 1;
            if (k.f0(5000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o oVar = this.f11502b.f6788w;
        do {
            value = oVar.getValue();
            Objects.requireNonNull((gb.a) value);
        } while (!oVar.g(value, new gb.a(false)));
        return md.m.f8555a;
    }
}
