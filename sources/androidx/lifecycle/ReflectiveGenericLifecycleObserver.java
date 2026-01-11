package androidx.lifecycle;

import androidx.lifecycle.f;
import androidx.lifecycle.r;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2041a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f2042b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2041a = obj;
        this.f2042b = f.f2105c.b(obj.getClass());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<androidx.lifecycle.r$b, java.util.List<androidx.lifecycle.f$b>>] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<androidx.lifecycle.r$b, java.util.List<androidx.lifecycle.f$b>>] */
    public final void c(a0 a0Var, r.b bVar) {
        f.a aVar = this.f2042b;
        Object obj = this.f2041a;
        f.a.a((List) aVar.f2108a.get(bVar), a0Var, bVar, obj);
        f.a.a((List) aVar.f2108a.get(r.b.ON_ANY), a0Var, bVar, obj);
    }
}
