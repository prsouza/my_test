package i2;

import aa.a;
import aa.c;

public final class e extends z<Number> {
    public final Object read(a aVar) {
        if (aVar.A0() != 9) {
            return Double.valueOf(aVar.f0());
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
        j.g(number.doubleValue());
        cVar.f(number);
    }
}
