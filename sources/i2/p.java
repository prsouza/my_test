package i2;

import aa.c;
import java.io.IOException;
import java.io.StringWriter;
import p9.o;

public abstract class p {
    public final s b() {
        if (this instanceof s) {
            return (s) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final u d() {
        if (this instanceof u) {
            return (u) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [p9.o$b0, i2.z<i2.p>] */
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.f205u = true;
            o.C.write(cVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
