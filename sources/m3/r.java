package m3;

import aa.b;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.f;
import g3.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import m0.c;
import m3.o;
import org.slf4j.helpers.MessageFormatter;

public final class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<o<Model, Data>> f8433a;

    /* renamed from: b  reason: collision with root package name */
    public final c<List<Throwable>> f8434b;

    public static class a<Data> implements d<Data>, d.a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final List<d<Data>> f8435a;

        /* renamed from: b  reason: collision with root package name */
        public final c<List<Throwable>> f8436b;

        /* renamed from: c  reason: collision with root package name */
        public int f8437c;

        /* renamed from: s  reason: collision with root package name */
        public g f8438s;

        /* renamed from: t  reason: collision with root package name */
        public d.a<? super Data> f8439t;

        /* renamed from: u  reason: collision with root package name */
        public List<Throwable> f8440u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f8441v;

        public a(List<d<Data>> list, c<List<Throwable>> cVar) {
            this.f8436b = cVar;
            if (!list.isEmpty()) {
                this.f8435a = list;
                this.f8437c = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public final Class<Data> a() {
            return this.f8435a.get(0).a();
        }

        public final void b() {
            List<Throwable> list = this.f8440u;
            if (list != null) {
                this.f8436b.a(list);
            }
            this.f8440u = null;
            for (d<Data> b10 : this.f8435a) {
                b10.b();
            }
        }

        public final void c(Exception exc) {
            List<Throwable> list = this.f8440u;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        public final void cancel() {
            this.f8441v = true;
            for (d<Data> cancel : this.f8435a) {
                cancel.cancel();
            }
        }

        public final void d(Data data) {
            if (data != null) {
                this.f8439t.d(data);
            } else {
                g();
            }
        }

        public final g3.a e() {
            return this.f8435a.get(0).e();
        }

        public final void f(g gVar, d.a<? super Data> aVar) {
            this.f8438s = gVar;
            this.f8439t = aVar;
            this.f8440u = this.f8436b.b();
            this.f8435a.get(this.f8437c).f(gVar, this);
            if (this.f8441v) {
                cancel();
            }
        }

        public final void g() {
            if (!this.f8441v) {
                if (this.f8437c < this.f8435a.size() - 1) {
                    this.f8437c++;
                    f(this.f8438s, this.f8439t);
                    return;
                }
                b.u(this.f8440u);
                this.f8439t.c(new i3.r("Fetch failed", new ArrayList(this.f8440u)));
            }
        }
    }

    public r(List<o<Model, Data>> list, c<List<Throwable>> cVar) {
        this.f8433a = list;
        this.f8434b = cVar;
    }

    public final o.a<Data> a(Model model, int i, int i10, h hVar) {
        o.a a10;
        int size = this.f8433a.size();
        ArrayList arrayList = new ArrayList(size);
        f fVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = this.f8433a.get(i11);
            if (oVar.b(model) && (a10 = oVar.a(model, i, i10, hVar)) != null) {
                fVar = a10.f8426a;
                arrayList.add(a10.f8428c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new o.a<>(fVar, new a(arrayList, this.f8434b));
    }

    public final boolean b(Model model) {
        for (o<Model, Data> b10 : this.f8433a) {
            if (b10.b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("MultiModelLoader{modelLoaders=");
        d10.append(Arrays.toString(this.f8433a.toArray()));
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
