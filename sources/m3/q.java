package m3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m0.c;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final s f8429a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8430b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, C0155a<?>> f8431a = new HashMap();

        /* renamed from: m3.q$a$a  reason: collision with other inner class name */
        public static class C0155a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<o<Model, ?>> f8432a;

            public C0155a(List<o<Model, ?>> list) {
                this.f8432a = list;
            }
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, m3.q$a$a<?>>] */
        public final <Model> void a(Class<Model> cls, List<o<Model, ?>> list) {
            if (((C0155a) this.f8431a.put(cls, new C0155a(list))) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public q(c<List<Throwable>> cVar) {
        s sVar = new s(cVar);
        this.f8429a = sVar;
    }
}
