package db;

import c3.k;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nd.o;
import nd.q;
import qa.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f4423a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f4424b;

    public e(c cVar, f fVar, Gson gson) {
        Set<String> set;
        this.f4423a = fVar;
        String o02 = ((k) cVar).o0();
        try {
            Type type = new d().getType();
            e6.e.C(type, "object : TypeToken<ArrayList<String>>() {}.type");
            Collection collection = (List) gson.fromJson(o02, type);
            set = new HashSet<>(collection == null ? o.f8966a : collection);
        } catch (Exception unused) {
            set = q.f8968a;
        }
        this.f4424b = set;
    }
}
