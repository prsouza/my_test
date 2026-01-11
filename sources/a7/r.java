package a7;

import h7.c0;
import h7.d0;
import h7.i0;
import h7.z;
import java.nio.charset.Charset;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f166a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static d0 a(c0 c0Var) {
        d0.b A = d0.A();
        int C = c0Var.C();
        A.m();
        d0.x((d0) A.f6389b, C);
        for (c0.c next : c0Var.B()) {
            d0.c.a C2 = d0.c.C();
            String C3 = next.B().C();
            C2.m();
            d0.c.x((d0.c) C2.f6389b, C3);
            z E = next.E();
            C2.m();
            d0.c.z((d0.c) C2.f6389b, E);
            i0 D = next.D();
            C2.m();
            d0.c.y((d0.c) C2.f6389b, D);
            int C4 = next.C();
            C2.m();
            d0.c.A((d0.c) C2.f6389b, C4);
            A.m();
            d0.y((d0) A.f6389b, (d0.c) C2.k());
        }
        return (d0) A.k();
    }
}
