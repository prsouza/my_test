package li;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import ki.f;
import p002if.t;
import p002if.y;
import p002if.z;
import uf.e;
import uf.i;

public final class b<T> implements f<T, z> {

    /* renamed from: c  reason: collision with root package name */
    public static final t f8298c = t.f6581f.a("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f8299d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Gson f8300a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter<T> f8301b;

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f8300a = gson;
        this.f8301b = typeAdapter;
    }

    public final Object a(Object obj) throws IOException {
        e eVar = new e();
        JsonWriter newJsonWriter = this.f8300a.newJsonWriter(new OutputStreamWriter(new uf.f(eVar), f8299d));
        this.f8301b.write(newJsonWriter, obj);
        newJsonWriter.close();
        t tVar = f8298c;
        i O = eVar.O();
        e6.e.D(O, "content");
        return new y(O, tVar);
    }
}
