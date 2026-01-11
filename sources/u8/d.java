package u8;

import com.google.auto.value.AutoValue;
import u8.a;
import u8.c;

@AutoValue
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11745a = 0;

    @AutoValue.Builder
    public static abstract class a {
    }

    static {
        a.C0229a aVar = new a.C0229a();
        aVar.d(0);
        aVar.c(c.a.ATTEMPT_MIGRATION);
        aVar.b(0);
        aVar.a();
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract c.a f();

    public abstract long g();

    public final boolean h() {
        return f() == c.a.REGISTER_ERROR;
    }

    public final boolean i() {
        c.a aVar = ((a) this).f11729c;
        return aVar == c.a.NOT_GENERATED || aVar == c.a.ATTEMPT_MIGRATION;
    }

    public final boolean j() {
        return f() == c.a.REGISTERED;
    }
}
