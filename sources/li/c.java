package li;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import fe.a;
import java.io.IOException;
import java.nio.charset.Charset;
import ki.f;
import p002if.b0;
import p002if.t;
import uf.h;

public final class c<T> implements f<b0, T> {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f8302a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter<T> f8303b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f8302a = gson;
        this.f8303b = typeAdapter;
    }

    public final Object a(Object obj) throws IOException {
        Charset charset;
        b0 b0Var = (b0) obj;
        Gson gson = this.f8302a;
        b0.a aVar = b0Var.f6473a;
        if (aVar == null) {
            h e10 = b0Var.e();
            t c10 = b0Var.c();
            if (c10 == null || (charset = c10.a(a.f5086b)) == null) {
                charset = a.f5086b;
            }
            aVar = new b0.a(e10, charset);
            b0Var.f6473a = aVar;
        }
        JsonReader newJsonReader = gson.newJsonReader(aVar);
        try {
            T read = this.f8303b.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            b0Var.close();
        }
    }
}
