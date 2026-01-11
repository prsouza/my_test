package y2;

import android.graphics.Color;
import java.io.IOException;
import z2.c;

public final class f implements h0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f13387a = new f();

    public final Object a(c cVar, float f10) throws IOException {
        boolean z = cVar.O() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.a();
        }
        double w6 = cVar.w();
        double w10 = cVar.w();
        double w11 = cVar.w();
        double w12 = cVar.O() == c.b.NUMBER ? cVar.w() : 1.0d;
        if (z) {
            cVar.e();
        }
        if (w6 <= 1.0d && w10 <= 1.0d && w11 <= 1.0d) {
            w6 *= 255.0d;
            w10 *= 255.0d;
            w11 *= 255.0d;
            if (w12 <= 1.0d) {
                w12 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) w12, (int) w6, (int) w10, (int) w11));
    }
}
