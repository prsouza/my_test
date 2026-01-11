package androidx.databinding;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class k<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f1691a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1692b;

    /* renamed from: c  reason: collision with root package name */
    public T f1693c;

    public k(ViewDataBinding viewDataBinding, int i, g<T> gVar, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f1692b = i;
        this.f1691a = gVar;
    }

    public final ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            b();
        }
        return viewDataBinding;
    }

    public final boolean b() {
        boolean z;
        T t10 = this.f1693c;
        if (t10 != null) {
            this.f1691a.a(t10);
            z = true;
        } else {
            z = false;
        }
        this.f1693c = null;
        return z;
    }
}
