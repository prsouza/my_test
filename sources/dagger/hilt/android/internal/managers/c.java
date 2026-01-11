package dagger.hilt.android.internal.managers;

import ah.v;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import e6.e;
import i9.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import l6.b1;

public final class c implements n9.b<j9.a> {

    /* renamed from: a  reason: collision with root package name */
    public final w0 f4410a;

    /* renamed from: b  reason: collision with root package name */
    public volatile j9.a f4411b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4412c = new Object();

    public interface a {
        k9.b b();
    }

    public static final class b extends u0 {

        /* renamed from: c  reason: collision with root package name */
        public final j9.a f4413c;

        public b(j9.a aVar) {
            this.f4413c = aVar;
        }

        /* JADX WARNING: type inference failed for: r0v6, types: [java.util.Set<i9.a$a>, java.util.HashSet] */
        public final void f() {
            d dVar = (d) ((C0063c) v.I(this.f4413c, C0063c.class)).b();
            Objects.requireNonNull(dVar);
            if (b1.f7789b == null) {
                b1.f7789b = Looper.getMainLooper().getThread();
            }
            if (Thread.currentThread() == b1.f7789b) {
                Iterator it = dVar.f4414a.iterator();
                while (it.hasNext()) {
                    ((a.C0106a) it.next()).a();
                }
                return;
            }
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: dagger.hilt.android.internal.managers.c$c  reason: collision with other inner class name */
    public interface C0063c {
        i9.a b();
    }

    public static final class d implements i9.a {

        /* renamed from: a  reason: collision with root package name */
        public final Set<a.C0106a> f4414a = new HashSet();
    }

    public c(ComponentActivity componentActivity) {
        b bVar = new b(componentActivity);
        e.D(componentActivity, "owner");
        x0 viewModelStore = componentActivity.getViewModelStore();
        e.C(viewModelStore, "owner.viewModelStore");
        this.f4410a = new w0(viewModelStore, bVar);
    }

    public final Object a() {
        if (this.f4411b == null) {
            synchronized (this.f4412c) {
                if (this.f4411b == null) {
                    this.f4411b = ((b) this.f4410a.a(b.class)).f4413c;
                }
            }
        }
        return this.f4411b;
    }
}
