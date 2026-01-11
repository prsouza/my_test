package pb;

import ab.k;
import ge.d0;
import io.nodle.cash.R;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.i;
import xd.p;

@rd.e(c = "io.nodle.cash.ui.view.fragment.home.FlashFragment$manageMainFlash$ocl$1$1", f = "FlashFragment.kt", l = {96}, m = "invokeSuspend")
public final class e extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9829a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f9830b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(c cVar, d<? super e> dVar) {
        super(2, dVar);
        this.f9830b = cVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new e(this.f9830b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f9829a;
        if (i == 0) {
            b1.w(obj);
            ab.i iVar = new ab.i();
            iVar.f272a = this.f9830b.getString(R.string.discoveringPopupTitle);
            iVar.f273b = this.f9830b.getString(R.string.discoveringPopupHeader);
            iVar.i = new Integer(R.layout.notice_info);
            k kVar = k.f279a;
            this.f9829a = 1;
            if (kVar.a(iVar, this) == aVar) {
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
