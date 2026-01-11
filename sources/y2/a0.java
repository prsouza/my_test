package y2;

import b3.d;
import java.io.IOException;
import z2.c;

public final class a0 implements h0<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f13376a = new a0();

    public final Object a(c cVar, float f10) throws IOException {
        boolean z = cVar.O() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.a();
        }
        float w6 = (float) cVar.w();
        float w10 = (float) cVar.w();
        while (cVar.s()) {
            cVar.a0();
        }
        if (z) {
            cVar.e();
        }
        return new d((w6 / 100.0f) * f10, (w10 / 100.0f) * f10);
    }
}
