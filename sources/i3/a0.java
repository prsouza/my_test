package i3;

import com.bumptech.glide.load.data.d;
import g3.f;
import i3.h;
import m3.o;

public final class a0 implements d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o.a f6011a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f6012b;

    public a0(b0 b0Var, o.a aVar) {
        this.f6012b = b0Var;
        this.f6011a = aVar;
    }

    public final void c(Exception exc) {
        b0 b0Var = this.f6012b;
        o.a<?> aVar = this.f6011a;
        o.a<?> aVar2 = b0Var.f6019u;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f6012b;
            o.a aVar3 = this.f6011a;
            h.a aVar4 = b0Var2.f6015b;
            f fVar = b0Var2.f6020v;
            d<Data> dVar = aVar3.f8428c;
            aVar4.e(fVar, exc, dVar, dVar.e());
        }
    }

    public final void d(Object obj) {
        b0 b0Var = this.f6012b;
        o.a<?> aVar = this.f6011a;
        o.a<?> aVar2 = b0Var.f6019u;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f6012b;
            o.a aVar3 = this.f6011a;
            l lVar = b0Var2.f6014a.f6055p;
            if (obj == null || !lVar.c(aVar3.f8428c.e())) {
                h.a aVar4 = b0Var2.f6015b;
                f fVar = aVar3.f8426a;
                d<Data> dVar = aVar3.f8428c;
                aVar4.i(fVar, obj, dVar, dVar.e(), b0Var2.f6020v);
                return;
            }
            b0Var2.f6018t = obj;
            b0Var2.f6015b.d();
        }
    }
}
