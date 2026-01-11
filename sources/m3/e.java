package m3;

import android.util.Base64;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import m3.o;

public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f8394a;

    public interface a<Data> {
    }

    public static final class b<Data> implements d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final String f8395a;

        /* renamed from: b  reason: collision with root package name */
        public final a<Data> f8396b;

        /* renamed from: c  reason: collision with root package name */
        public Data f8397c;

        public b(String str, a<Data> aVar) {
            this.f8395a = str;
            this.f8396b = aVar;
        }

        public final Class<Data> a() {
            Objects.requireNonNull((c.a) this.f8396b);
            return InputStream.class;
        }

        public final void b() {
            try {
                a<Data> aVar = this.f8396b;
                Data data = this.f8397c;
                Objects.requireNonNull((c.a) aVar);
                data.close();
            } catch (IOException unused) {
            }
        }

        public final void cancel() {
        }

        public final g3.a e() {
            return g3.a.LOCAL;
        }

        public final void f(g gVar, d.a<? super Data> aVar) {
            try {
                Data a10 = ((c.a) this.f8396b).a(this.f8395a);
                this.f8397c = (ByteArrayInputStream) a10;
                aVar.d(a10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a<InputStream> f8398a = new a();

        public class a implements a<InputStream> {
            public final Object a(String str) throws IllegalArgumentException {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public final o<Model, InputStream> b(s sVar) {
            return new e(this.f8398a);
        }
    }

    public e(a<Data> aVar) {
        this.f8394a = aVar;
    }

    public final o.a<Data> a(Model model, int i, int i10, h hVar) {
        return new o.a<>(new b4.b(model), new b(model.toString(), this.f8394a));
    }

    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
