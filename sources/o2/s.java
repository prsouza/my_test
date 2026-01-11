package o2;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class s<T> {

    /* renamed from: e  reason: collision with root package name */
    public static ExecutorService f9295e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final Set<n<T>> f9296a = new LinkedHashSet(1);

    /* renamed from: b  reason: collision with root package name */
    public final Set<n<Throwable>> f9297b = new LinkedHashSet(1);

    /* renamed from: c  reason: collision with root package name */
    public final Handler f9298c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public volatile q<T> f9299d = null;

    public class a extends FutureTask<q<T>> {
        public a(Callable<q<T>> callable) {
            super(callable);
        }

        public final void done() {
            if (!isCancelled()) {
                try {
                    s.this.c((q) get());
                } catch (InterruptedException | ExecutionException e10) {
                    s.this.c(new q(e10));
                }
            }
        }
    }

    public s(Callable<q<T>> callable, boolean z) {
        if (z) {
            try {
                c(callable.call());
            } catch (Throwable th2) {
                c(new q(th2));
            }
        } else {
            f9295e.execute(new a(callable));
        }
    }

    public final synchronized s<T> a(n<Throwable> nVar) {
        if (!(this.f9299d == null || this.f9299d.f9293b == null)) {
            nVar.a(this.f9299d.f9293b);
        }
        this.f9297b.add(nVar);
        return this;
    }

    public final synchronized s<T> b(n<T> nVar) {
        if (!(this.f9299d == null || this.f9299d.f9292a == null)) {
            nVar.a(this.f9299d.f9292a);
        }
        this.f9296a.add(nVar);
        return this;
    }

    public final void c(q<T> qVar) {
        if (this.f9299d == null) {
            this.f9299d = qVar;
            this.f9298c.post(new r(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
