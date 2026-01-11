package i2;

import aa.c;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import p9.e;
import p9.f;

public abstract class z<T> {

    public class a extends z<T> {
        public a() {
        }

        public final T read(aa.a aVar) {
            if (aVar.A0() != 9) {
                return z.this.read(aVar);
            }
            aVar.x0();
            return null;
        }

        public final void write(c cVar, T t10) {
            if (t10 == null) {
                cVar.f0();
            } else {
                z.this.write(cVar, t10);
            }
        }
    }

    public final T fromJson(Reader reader) {
        return read(new aa.a(reader));
    }

    public final T fromJson(String str) {
        return fromJson((Reader) new StringReader(str));
    }

    public final T fromJsonTree(p pVar) {
        try {
            return read(new e(pVar));
        } catch (IOException e10) {
            throw new q((Throwable) e10);
        }
    }

    public final z<T> nullSafe() {
        return new a();
    }

    public abstract T read(aa.a aVar);

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void toJson(Writer writer, T t10) {
        write(new c(writer), t10);
    }

    public final p toJsonTree(T t10) {
        try {
            f fVar = new f();
            write(fVar, t10);
            return fVar.x0();
        } catch (IOException e10) {
            throw new q((Throwable) e10);
        }
    }

    public abstract void write(c cVar, T t10);
}
