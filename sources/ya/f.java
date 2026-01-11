package ya;

import c3.k;
import e6.e;
import java.util.Map;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final g f13574a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f13575b;

    public static final class a extends f {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, Map<String, ? extends Object> map) {
            super(gVar, map, (k) null);
            e.D(gVar, "eventName");
        }
    }

    public f(g gVar, Map map, k kVar) {
        this.f13574a = gVar;
        this.f13575b = map;
    }
}
