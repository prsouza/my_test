package he;

import ad.c;
import android.os.Handler;
import android.os.Looper;
import e6.e;
import ge.k;
import ge.n1;
import ge.o0;
import ge.p1;
import ge.q0;
import java.util.concurrent.CancellationException;
import md.m;
import pd.f;
import xd.l;
import yd.h;

public final class b extends c {
    private volatile b _immediate;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5938b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5939c;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f5940s;

    /* renamed from: t  reason: collision with root package name */
    public final b f5941t;

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f5942a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f5943b;

        public a(k kVar, b bVar) {
            this.f5942a = kVar;
            this.f5943b = bVar;
        }

        public final void run() {
            this.f5942a.m(this.f5943b);
        }
    }

    /* renamed from: he.b$b  reason: collision with other inner class name */
    public static final class C0100b extends h implements l<Throwable, m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f5944b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Runnable f5945c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0100b(b bVar, Runnable runnable) {
            super(1);
            this.f5944b = bVar;
            this.f5945c = runnable;
        }

        public final Object k(Object obj) {
            Throwable th2 = (Throwable) obj;
            this.f5944b.f5938b.removeCallbacks(this.f5945c);
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Handler handler, String str, boolean z) {
        super((c3.k) null);
        b bVar = null;
        this.f5938b = handler;
        this.f5939c = str;
        this.f5940s = z;
        this._immediate = z ? this : bVar;
        b bVar2 = this._immediate;
        if (bVar2 == null) {
            bVar2 = new b(handler, str, true);
            this._immediate = bVar2;
        }
        this.f5941t = bVar2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f5938b == this.f5938b;
    }

    public final void f(long j10, k<? super m> kVar) {
        a aVar = new a(kVar, this);
        Handler handler = this.f5938b;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(aVar, j10)) {
            ((ge.l) kVar).i(new C0100b(this, aVar));
            return;
        }
        y0(((ge.l) kVar).f5413t, aVar);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5938b);
    }

    public final void p0(f fVar, Runnable runnable) {
        if (!this.f5938b.post(runnable)) {
            y0(fVar, runnable);
        }
    }

    public final q0 s(long j10, Runnable runnable, f fVar) {
        Handler handler = this.f5938b;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j10)) {
            return new a(this, runnable);
        }
        y0(fVar, runnable);
        return p1.f5437a;
    }

    public final String toString() {
        String x02 = x0();
        if (x02 != null) {
            return x02;
        }
        String str = this.f5939c;
        if (str == null) {
            str = this.f5938b.toString();
        }
        return this.f5940s ? e.a0(str, ".immediate") : str;
    }

    public final boolean v0(f fVar) {
        return !this.f5940s || !e.r(Looper.myLooper(), this.f5938b.getLooper());
    }

    public final n1 w0() {
        return this.f5941t;
    }

    public final void y0(f fVar, Runnable runnable) {
        c.y(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        o0.f5434b.p0(fVar, runnable);
    }
}
