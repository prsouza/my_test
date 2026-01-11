package s7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Class<? super T>> f10935a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<n> f10936b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10937c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10938d;

    /* renamed from: e  reason: collision with root package name */
    public final e<T> f10939e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f10940f;

    /* renamed from: s7.b$b  reason: collision with other inner class name */
    public static class C0214b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Class<? super T>> f10941a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<n> f10942b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public int f10943c;

        /* renamed from: d  reason: collision with root package name */
        public int f10944d;

        /* renamed from: e  reason: collision with root package name */
        public e<T> f10945e;

        /* renamed from: f  reason: collision with root package name */
        public Set<Class<?>> f10946f;

        public C0214b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.f10941a = hashSet;
            this.f10943c = 0;
            this.f10944d = 0;
            this.f10946f = new HashSet();
            hashSet.add(cls);
            for (Class requireNonNull : clsArr) {
                Objects.requireNonNull(requireNonNull, "Null interface");
            }
            Collections.addAll(this.f10941a, clsArr);
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Class<? super T>>] */
        /* JADX WARNING: type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<s7.n>] */
        public final C0214b<T> a(n nVar) {
            if (!this.f10941a.contains(nVar.f10966a)) {
                this.f10942b.add(nVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final b<T> b() {
            if (this.f10945e != null) {
                return new b(new HashSet(this.f10941a), new HashSet(this.f10942b), this.f10943c, this.f10944d, this.f10945e, this.f10946f, (a) null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final C0214b<T> c() {
            if (this.f10943c == 0) {
                this.f10943c = 2;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public b(Set set, Set set2, int i, int i10, e eVar, Set set3, a aVar) {
        this.f10935a = Collections.unmodifiableSet(set);
        this.f10936b = Collections.unmodifiableSet(set2);
        this.f10937c = i;
        this.f10938d = i10;
        this.f10939e = eVar;
        this.f10940f = Collections.unmodifiableSet(set3);
    }

    public static <T> C0214b<T> a(Class<T> cls) {
        return new C0214b<>(cls, new Class[0], (a) null);
    }

    @SafeVarargs
    public static <T> b<T> c(T t10, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        for (Class<? super T> requireNonNull : clsArr) {
            Objects.requireNonNull(requireNonNull, "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        return new b(new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(t10), hashSet3, (a) null);
    }

    public final boolean b() {
        return this.f10938d == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f10935a.toArray()) + ">{" + this.f10937c + ", type=" + this.f10938d + ", deps=" + Arrays.toString(this.f10936b.toArray()) + "}";
    }
}
