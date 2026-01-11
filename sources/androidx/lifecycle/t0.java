package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.r;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f2184a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2185b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public a f2186c;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f2187a;

        /* renamed from: b  reason: collision with root package name */
        public final r.b f2188b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2189c = false;

        public a(b0 b0Var, r.b bVar) {
            this.f2187a = b0Var;
            this.f2188b = bVar;
        }

        public final void run() {
            if (!this.f2189c) {
                this.f2187a.f(this.f2188b);
                this.f2189c = true;
            }
        }
    }

    public t0(a0 a0Var) {
        this.f2184a = new b0(a0Var);
    }

    public final void a(r.b bVar) {
        a aVar = this.f2186c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f2184a, bVar);
        this.f2186c = aVar2;
        this.f2185b.postAtFrontOfQueue(aVar2);
    }
}
