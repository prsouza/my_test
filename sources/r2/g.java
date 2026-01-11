package r2;

import android.content.Context;
import f9.c;
import java.util.ArrayList;
import java.util.List;
import l6.s2;
import l6.u2;
import l6.v2;
import o6.w;
import o6.y;
import o6.z;

public final class g implements z {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10539a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10540b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10541c;

    public /* synthetic */ g(String str, c cVar) {
        this.f10539a = "b60f376107041c3ba0066825c58607fc";
        this.f10540b = str;
        this.f10541c = cVar;
    }

    public /* synthetic */ g(z zVar, z zVar2, z zVar3) {
        this.f10539a = zVar;
        this.f10540b = zVar2;
        this.f10541c = zVar3;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        v2 v2Var;
        Context a10 = ((u2) ((z) this.f10539a)).a();
        w a11 = y.a((z) this.f10540b);
        w a12 = y.a((z) this.f10541c);
        if (s2.a(a10) == null) {
            v2Var = (v2) a11.zza();
        } else {
            v2Var = (v2) a12.zza();
        }
        y.c.s0(v2Var);
        return v2Var;
    }

    public g(List list) {
        this.f10541c = list;
        this.f10539a = new ArrayList(list.size());
        this.f10540b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((List) this.f10539a).add(((v2.g) list.get(i)).f12203b.a());
            ((List) this.f10540b).add(((v2.g) list.get(i)).f12204c.a());
        }
    }
}
