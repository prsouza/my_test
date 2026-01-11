package pe;

import e6.e;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import nd.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Annotation> f9882a = o.f8966a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f9883b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f9884c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final List<e> f9885d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final List<List<Annotation>> f9886e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<Boolean> f9887f = new ArrayList();

    public a(String str) {
        e.D(str, "serialName");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.List<pe.e>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List<java.util.List<java.lang.annotation.Annotation>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.List<java.lang.Boolean>, java.util.ArrayList] */
    public static void a(a aVar, String str, e eVar) {
        o oVar = o.f8966a;
        Objects.requireNonNull(aVar);
        e.D(str, "elementName");
        e.D(eVar, "descriptor");
        if (aVar.f9884c.add(str)) {
            aVar.f9883b.add(str);
            aVar.f9885d.add(eVar);
            aVar.f9886e.add(oVar);
            aVar.f9887f.add(false);
            return;
        }
        throw new IllegalArgumentException(androidx.fragment.app.o.c("Element with name '", str, "' is already registered").toString());
    }
}
