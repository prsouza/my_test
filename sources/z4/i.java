package z4;

import b5.b;
import java.util.Map;
import java.util.Objects;
import x4.c;

public final /* synthetic */ class i implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f13813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f13814b;

    public /* synthetic */ i(o oVar, Map map) {
        this.f13813a = oVar;
        this.f13814b = map;
    }

    public final Object a() {
        o oVar = this.f13813a;
        Map map = this.f13814b;
        Objects.requireNonNull(oVar);
        for (Map.Entry entry : map.entrySet()) {
            oVar.i.f((long) ((Integer) entry.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }
}
