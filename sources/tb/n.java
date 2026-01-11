package tb;

import android.util.Log;
import bb.b;
import bb.c;
import bb.d;
import gb.g;
import java.util.List;
import je.o;
import md.m;
import pd.f;
import xd.a;
import yd.h;

public final class n extends h implements a<m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f11503b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f11504c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(r rVar, b bVar) {
        super(0);
        this.f11503b = rVar;
        this.f11504c = bVar;
    }

    public final Object c() {
        Object value;
        Log.d(this.f11503b.f11516t, "onSelect test ####");
        o oVar = this.f11503b.f11517u;
        b bVar = this.f11504c;
        do {
            value = oVar.getValue();
        } while (!oVar.g(value, g.a((g) value, (List) null, false, jc.b.C(bVar, c.f2942b, d.f2943b), 3)));
        r rVar = this.f11503b;
        b bVar2 = this.f11504c;
        int i = bVar2.f2938a;
        ge.g.b(jc.b.y(rVar), (f) null, new q(bVar2.f2941d, rVar, i, (pd.d<? super q>) null), 3);
        return m.f8555a;
    }
}
