package m3;

import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.h;
import m3.o;

public final class w<Model> implements o<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final w<?> f8459a = new w<>();

    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f8460a = new a<>();

        public final o<Model, Model> b(s sVar) {
            return w.f8459a;
        }
    }

    public static class b<Model> implements d<Model> {

        /* renamed from: a  reason: collision with root package name */
        public final Model f8461a;

        public b(Model model) {
            this.f8461a = model;
        }

        public final Class<Model> a() {
            return this.f8461a.getClass();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final g3.a e() {
            return g3.a.LOCAL;
        }

        public final void f(g gVar, d.a<? super Model> aVar) {
            aVar.d(this.f8461a);
        }
    }

    public final o.a<Model> a(Model model, int i, int i10, h hVar) {
        return new o.a<>(new b4.b(model), new b(model));
    }

    public final boolean b(Model model) {
        return true;
    }
}
