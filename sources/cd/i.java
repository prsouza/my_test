package cd;

import dd.a;
import dd.b;
import dd.c;
import dd.d;
import de.h;
import e6.e;
import java.math.BigInteger;
import java.util.Objects;
import yd.o;
import yd.v;

public final class i extends d<i> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ h[] f3369b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f3370c;

    /* renamed from: s  reason: collision with root package name */
    public static final c f3371s;

    /* renamed from: t  reason: collision with root package name */
    public static final i f3372t;

    static {
        Class<i> cls = i.class;
        o oVar = new o(cls, "id", "getId()Ljp/co/soramitsu/fearless_utils/scale/Field;");
        Objects.requireNonNull(v.f13623a);
        f3369b = new h[]{oVar, new o(cls, "type", "getType()Ljp/co/soramitsu/fearless_utils/scale/Field;")};
        i iVar = new i();
        f3372t = iVar;
        f3370c = new c(ed.d.f4804v, iVar, null);
        f3371s = e.X(iVar, j.f3377u);
    }

    public final b<BigInteger> d() {
        return f3370c.a(this, f3369b[0]);
    }

    public final b<a<j>> e() {
        return f3371s.a(this, f3369b[1]);
    }
}
