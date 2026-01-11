package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;

public final class o0 implements a0 {

    /* renamed from: x  reason: collision with root package name */
    public static final o0 f2150x = new o0();

    /* renamed from: a  reason: collision with root package name */
    public int f2151a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2152b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2153c = true;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2154s = true;

    /* renamed from: t  reason: collision with root package name */
    public Handler f2155t;

    /* renamed from: u  reason: collision with root package name */
    public final b0 f2156u = new b0(this);

    /* renamed from: v  reason: collision with root package name */
    public a f2157v = new a();

    /* renamed from: w  reason: collision with root package name */
    public b f2158w = new b();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            o0 o0Var = o0.this;
            if (o0Var.f2152b == 0) {
                o0Var.f2153c = true;
                o0Var.f2156u.f(r.b.ON_PAUSE);
            }
            o0 o0Var2 = o0.this;
            if (o0Var2.f2151a == 0 && o0Var2.f2153c) {
                o0Var2.f2156u.f(r.b.ON_STOP);
                o0Var2.f2154s = true;
            }
        }
    }

    public class b implements q0.a {
        public b() {
        }
    }

    public final void a() {
        int i = this.f2152b + 1;
        this.f2152b = i;
        if (i != 1) {
            return;
        }
        if (this.f2153c) {
            this.f2156u.f(r.b.ON_RESUME);
            this.f2153c = false;
            return;
        }
        this.f2155t.removeCallbacks(this.f2157v);
    }

    public final void b() {
        int i = this.f2151a + 1;
        this.f2151a = i;
        if (i == 1 && this.f2154s) {
            this.f2156u.f(r.b.ON_START);
            this.f2154s = false;
        }
    }

    public final r getLifecycle() {
        return this.f2156u;
    }
}
