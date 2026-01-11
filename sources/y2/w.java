package y2;

import android.graphics.PointF;
import java.io.IOException;
import z2.c;

public final class w implements h0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final w f13421a = new w();

    public final Object a(c cVar, float f10) throws IOException {
        c.b O = cVar.O();
        if (O == c.b.BEGIN_ARRAY) {
            return p.b(cVar, f10);
        }
        if (O == c.b.BEGIN_OBJECT) {
            return p.b(cVar, f10);
        }
        if (O == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.w()) * f10, ((float) cVar.w()) * f10);
            while (cVar.s()) {
                cVar.a0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + O);
    }
}
