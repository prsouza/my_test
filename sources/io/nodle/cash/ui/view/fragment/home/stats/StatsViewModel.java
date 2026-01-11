package io.nodle.cash.ui.view.fragment.home.stats;

import ge.g;
import java.util.List;
import je.o;
import pd.d;
import qb.c;
import qb.e;
import qb.f;
import qb.t;
import qb.u;
import qb.v;
import tb.b;

public final class StatsViewModel extends b<u, t> {

    /* renamed from: v  reason: collision with root package name */
    public final c f6748v;

    public StatsViewModel(e eVar, c cVar) {
        super(new u(0, true, eVar.a()));
        this.f6748v = cVar;
    }

    public final void i(f fVar) {
        if (e6.e.r(fVar, f.b.f10357a)) {
            g.b(jc.b.y(this), (pd.f) null, new v(this, (d<? super v>) null), 3);
        } else if (fVar instanceof f.a) {
            int i = ((f.a) fVar).f10356a;
            Object value = this.f11465c.getValue();
            if (value instanceof u) {
                o oVar = this.f11465c;
                e6.e.D((u) oVar.getValue(), "it");
                oVar.h((Object) null, u.a((u) value, i, (List) null, 6));
            }
        } else {
            throw new md.e();
        }
    }
}
