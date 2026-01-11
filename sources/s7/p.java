package s7;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import m8.a;
import m8.b;
import m8.c;
import m8.d;

public final class p implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> f10970a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Queue<a<?>> f10971b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f10972c;

    public p(Executor executor) {
        this.f10972c = executor;
    }

    public final <T> void a(b bVar) {
        b(this.f10972c, bVar);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<m8.b<java.lang.Object>, java.util.concurrent.Executor>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<m8.b<java.lang.Object>, java.util.concurrent.Executor>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<m8.b<java.lang.Object>, java.util.concurrent.Executor>>, java.util.HashMap] */
    public final synchronized <T> void b(Executor executor, b bVar) {
        Class<k7.a> cls = k7.a.class;
        synchronized (this) {
            Objects.requireNonNull(executor);
            if (!this.f10970a.containsKey(cls)) {
                this.f10970a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f10970a.get(cls)).put(bVar, executor);
        }
    }
}
