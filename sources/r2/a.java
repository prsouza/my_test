package r2;

import java.util.ArrayList;
import java.util.List;

public abstract class a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    public final List<C0206a> f10526a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f10527b = false;

    /* renamed from: c  reason: collision with root package name */
    public final c<K> f10528c;

    /* renamed from: d  reason: collision with root package name */
    public float f10529d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public b3.c f10530e;

    /* renamed from: f  reason: collision with root package name */
    public A f10531f = null;
    public float g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f10532h = -1.0f;

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    public interface C0206a {
        void b();
    }

    public static final class b<T> implements c<T> {
        public final float a() {
            return 1.0f;
        }

        public final boolean b(float f10) {
            throw new IllegalStateException("not implemented");
        }

        public final float c() {
            return 0.0f;
        }

        public final b3.a<T> d() {
            throw new IllegalStateException("not implemented");
        }

        public final boolean e(float f10) {
            return false;
        }

        public final boolean isEmpty() {
            return true;
        }
    }

    public interface c<T> {
        float a();

        boolean b(float f10);

        float c();

        b3.a<T> d();

        boolean e(float f10);

        boolean isEmpty();
    }

    public static final class d<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends b3.a<T>> f10533a;

        /* renamed from: b  reason: collision with root package name */
        public b3.a<T> f10534b;

        /* renamed from: c  reason: collision with root package name */
        public b3.a<T> f10535c = null;

        /* renamed from: d  reason: collision with root package name */
        public float f10536d = -1.0f;

        public d(List<? extends b3.a<T>> list) {
            this.f10533a = list;
            this.f10534b = f(0.0f);
        }

        public final float a() {
            List<? extends b3.a<T>> list = this.f10533a;
            return ((b3.a) list.get(list.size() - 1)).a();
        }

        public final boolean b(float f10) {
            b3.a<T> aVar = this.f10535c;
            b3.a<T> aVar2 = this.f10534b;
            if (aVar == aVar2 && this.f10536d == f10) {
                return true;
            }
            this.f10535c = aVar2;
            this.f10536d = f10;
            return false;
        }

        public final float c() {
            return ((b3.a) this.f10533a.get(0)).b();
        }

        public final b3.a<T> d() {
            return this.f10534b;
        }

        public final boolean e(float f10) {
            b3.a<T> aVar = this.f10534b;
            if (f10 >= aVar.b() && f10 < aVar.a()) {
                return !this.f10534b.c();
            }
            this.f10534b = f(f10);
            return true;
        }

        public final b3.a<T> f(float f10) {
            List<? extends b3.a<T>> list = this.f10533a;
            b3.a<T> aVar = (b3.a) list.get(list.size() - 1);
            if (f10 >= aVar.b()) {
                return aVar;
            }
            int size = this.f10533a.size() - 2;
            while (true) {
                boolean z = false;
                if (size < 1) {
                    return (b3.a) this.f10533a.get(0);
                }
                b3.a<T> aVar2 = (b3.a) this.f10533a.get(size);
                if (this.f10534b != aVar2) {
                    if (f10 >= aVar2.b() && f10 < aVar2.a()) {
                        z = true;
                    }
                    if (z) {
                        return aVar2;
                    }
                }
                size--;
            }
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    public static final class e<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b3.a<T> f10537a;

        /* renamed from: b  reason: collision with root package name */
        public float f10538b = -1.0f;

        public e(List<? extends b3.a<T>> list) {
            this.f10537a = (b3.a) list.get(0);
        }

        public final float a() {
            return this.f10537a.a();
        }

        public final boolean b(float f10) {
            if (this.f10538b == f10) {
                return true;
            }
            this.f10538b = f10;
            return false;
        }

        public final float c() {
            return this.f10537a.b();
        }

        public final b3.a<T> d() {
            return this.f10537a;
        }

        public final boolean e(float f10) {
            return !this.f10537a.c();
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends b3.a<K>> list) {
        c<K> cVar;
        c<K> cVar2;
        if (list.isEmpty()) {
            cVar = new b<>();
        } else {
            if (list.size() == 1) {
                cVar2 = new e<>(list);
            } else {
                cVar2 = new d<>(list);
            }
            cVar = cVar2;
        }
        this.f10528c = cVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<r2.a$a>, java.util.ArrayList] */
    public final void a(C0206a aVar) {
        this.f10526a.add(aVar);
    }

    public final b3.a<K> b() {
        b3.a<K> d10 = this.f10528c.d();
        ad.c.E();
        return d10;
    }

    public float c() {
        if (this.f10532h == -1.0f) {
            this.f10532h = this.f10528c.a();
        }
        return this.f10532h;
    }

    public final float d() {
        b3.a b10 = b();
        if (b10.c()) {
            return 0.0f;
        }
        return b10.f2847d.getInterpolation(e());
    }

    public final float e() {
        if (this.f10527b) {
            return 0.0f;
        }
        b3.a b10 = b();
        if (b10.c()) {
            return 0.0f;
        }
        return (this.f10529d - b10.b()) / (b10.a() - b10.b());
    }

    public A f() {
        float d10 = d();
        if (this.f10530e == null && this.f10528c.b(d10)) {
            return this.f10531f;
        }
        A g8 = g(b(), d10);
        this.f10531f = g8;
        return g8;
    }

    public abstract A g(b3.a<K> aVar, float f10);

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<r2.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<r2.a$a>, java.util.ArrayList] */
    public void h() {
        for (int i = 0; i < this.f10526a.size(); i++) {
            ((C0206a) this.f10526a.get(i)).b();
        }
    }

    public void i(float f10) {
        if (!this.f10528c.isEmpty()) {
            if (this.g == -1.0f) {
                this.g = this.f10528c.c();
            }
            float f11 = this.g;
            if (f10 < f11) {
                if (f11 == -1.0f) {
                    this.g = this.f10528c.c();
                }
                f10 = this.g;
            } else if (f10 > c()) {
                f10 = c();
            }
            if (f10 != this.f10529d) {
                this.f10529d = f10;
                if (this.f10528c.e(f10)) {
                    h();
                }
            }
        }
    }

    public final void j(b3.c cVar) {
        b3.c cVar2 = this.f10530e;
        if (cVar2 != null) {
            cVar2.f2860c = null;
        }
        this.f10530e = cVar;
        if (cVar != null) {
            cVar.f2860c = this;
        }
    }
}
