package li;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import ki.a0;
import ki.f;
import p002if.b0;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f8297a;

    public a(Gson gson) {
        this.f8297a = gson;
    }

    public final f a(Type type) {
        return new b(this.f8297a, this.f8297a.getAdapter(TypeToken.get(type)));
    }

    public final f<b0, ?> b(Type type, Annotation[] annotationArr, a0 a0Var) {
        return new c(this.f8297a, this.f8297a.getAdapter(TypeToken.get(type)));
    }
}
