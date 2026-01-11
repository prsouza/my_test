package s7;

import android.support.v4.media.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m8.c;

public final class x extends b {
    public final Set<Class<?>> A;
    public final c B;

    /* renamed from: v  reason: collision with root package name */
    public final Set<Class<?>> f10984v;

    /* renamed from: w  reason: collision with root package name */
    public final Set<Class<?>> f10985w;

    /* renamed from: x  reason: collision with root package name */
    public final Set<Class<?>> f10986x;

    /* renamed from: y  reason: collision with root package name */
    public final Set<Class<?>> f10987y;
    public final Set<Class<?>> z;

    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final c f10988a;

        public a(c cVar) {
            this.f10988a = cVar;
        }
    }

    public x(b<?> bVar, c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (n next : bVar.f10936b) {
            int i = next.f10968c;
            boolean z10 = true;
            if (!(i == 0)) {
                if (i != 2 ? false : z10) {
                    hashSet3.add(next.f10966a);
                } else if (next.a()) {
                    hashSet5.add(next.f10966a);
                } else {
                    hashSet2.add(next.f10966a);
                }
            } else if (next.a()) {
                hashSet4.add(next.f10966a);
            } else {
                hashSet.add(next.f10966a);
            }
        }
        if (!bVar.f10940f.isEmpty()) {
            hashSet.add(c.class);
        }
        this.f10984v = Collections.unmodifiableSet(hashSet);
        this.f10985w = Collections.unmodifiableSet(hashSet2);
        this.f10986x = Collections.unmodifiableSet(hashSet3);
        this.f10987y = Collections.unmodifiableSet(hashSet4);
        this.z = Collections.unmodifiableSet(hashSet5);
        this.A = bVar.f10940f;
        this.B = cVar;
    }

    public final <T> T a(Class<T> cls) {
        if (this.f10984v.contains(cls)) {
            T a10 = this.B.a(cls);
            if (!cls.equals(c.class)) {
                return a10;
            }
            return new a((c) a10);
        }
        throw new le.x(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public final <T> Set<T> c(Class<T> cls) {
        if (this.f10987y.contains(cls)) {
            return this.B.c(cls);
        }
        throw new le.x(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public final <T> r8.b<T> d(Class<T> cls) {
        if (this.f10985w.contains(cls)) {
            return this.B.d(cls);
        }
        throw new le.x(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public final <T> r8.b<Set<T>> e(Class<T> cls) {
        if (this.z.contains(cls)) {
            return this.B.e(cls);
        }
        throw new le.x(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public final <T> r8.a<T> f(Class<T> cls) {
        if (this.f10986x.contains(cls)) {
            return this.B.f(cls);
        }
        throw new le.x(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }
}
