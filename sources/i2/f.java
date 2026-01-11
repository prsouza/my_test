package i2;

import aa.a;
import aa.c;

public final class f extends z<Number> {
    public final Object read(a aVar) {
        if (aVar.A0() != 9) {
            return Float.valueOf((float) aVar.f0());
        }
        aVar.x0();
        return null;
    }

    public final void write(c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.f0();
            return;
        }
        j.g((double) number.floatValue());
        cVar.f(number);
    }
}
