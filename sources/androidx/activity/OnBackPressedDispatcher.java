package androidx.activity;

import androidx.lifecycle.a0;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f771a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<d> f772b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements y, a {

        /* renamed from: a  reason: collision with root package name */
        public final r f773a;

        /* renamed from: b  reason: collision with root package name */
        public final d f774b;

        /* renamed from: c  reason: collision with root package name */
        public a f775c;

        public LifecycleOnBackPressedCancellable(r rVar, d dVar) {
            this.f773a = rVar;
            this.f774b = dVar;
            rVar.a(this);
        }

        public final void c(a0 a0Var, r.b bVar) {
            if (bVar == r.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                d dVar = this.f774b;
                onBackPressedDispatcher.f772b.add(dVar);
                a aVar = new a(dVar);
                dVar.f786b.add(aVar);
                this.f775c = aVar;
            } else if (bVar == r.b.ON_STOP) {
                a aVar2 = this.f775c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (bVar == r.b.ON_DESTROY) {
                cancel();
            }
        }

        public final void cancel() {
            this.f773a.c(this);
            this.f774b.f786b.remove(this);
            a aVar = this.f775c;
            if (aVar != null) {
                aVar.cancel();
                this.f775c = null;
            }
        }
    }

    public class a implements a {

        /* renamed from: a  reason: collision with root package name */
        public final d f777a;

        public a(d dVar) {
            this.f777a = dVar;
        }

        public final void cancel() {
            OnBackPressedDispatcher.this.f772b.remove(this.f777a);
            this.f777a.f786b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f771a = runnable;
    }

    public final void a(a0 a0Var, d dVar) {
        r lifecycle = a0Var.getLifecycle();
        if (lifecycle.b() != r.c.DESTROYED) {
            dVar.f786b.add(new LifecycleOnBackPressedCancellable(lifecycle, dVar));
        }
    }

    public final void b() {
        Iterator<d> descendingIterator = this.f772b.descendingIterator();
        while (descendingIterator.hasNext()) {
            d next = descendingIterator.next();
            if (next.f785a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f771a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
