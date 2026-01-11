package db;

import c3.k;
import com.google.gson.Gson;
import e6.e;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nd.o;
import nd.q;
import qa.f;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final f f4425a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f4426b;

    public g(c cVar, f fVar, Gson gson) {
        Set<String> set;
        this.f4425a = fVar;
        String p02 = ((k) cVar).p0();
        try {
            Type type = new f().getType();
            e.C(type, "object : TypeToken<ArrayList<String>>() {}.type");
            Collection collection = (List) gson.fromJson(p02, type);
            set = new HashSet<>(collection == null ? o.f8966a : collection);
        } catch (Exception unused) {
            set = q.f8968a;
        }
        this.f4426b = set;
    }
}
