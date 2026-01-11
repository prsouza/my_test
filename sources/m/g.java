package m;

import android.view.View;
import android.view.animation.Interpolator;
import c3.k;
import java.util.ArrayList;
import java.util.Iterator;
import n0.a0;
import n0.b0;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a0> f8355a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f8356b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f8357c;

    /* renamed from: d  reason: collision with root package name */
    public b0 f8358d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8359e;

    /* renamed from: f  reason: collision with root package name */
    public final a f8360f = new a();

    public class a extends k {
        public boolean H = false;
        public int I = 0;

        public a() {
        }

        public final void c() {
            int i = this.I + 1;
            this.I = i;
            if (i == g.this.f8355a.size()) {
                b0 b0Var = g.this.f8358d;
                if (b0Var != null) {
                    b0Var.c();
                }
                this.I = 0;
                this.H = false;
                g.this.f8359e = false;
            }
        }

        public final void i() {
            if (!this.H) {
                this.H = true;
                b0 b0Var = g.this.f8358d;
                if (b0Var != null) {
                    b0Var.i();
                }
            }
        }
    }

    public final void a() {
        if (this.f8359e) {
            Iterator<a0> it = this.f8355a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f8359e = false;
        }
    }

    public final g b(a0 a0Var) {
        if (!this.f8359e) {
            this.f8355a.add(a0Var);
        }
        return this;
    }

    public final void c() {
        View view;
        if (!this.f8359e) {
            Iterator<a0> it = this.f8355a.iterator();
            while (it.hasNext()) {
                a0 next = it.next();
                long j10 = this.f8356b;
                if (j10 >= 0) {
                    next.c(j10);
                }
                Interpolator interpolator = this.f8357c;
                if (!(interpolator == null || (view = next.f8774a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f8358d != null) {
                    next.d(this.f8360f);
                }
                View view2 = next.f8774a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f8359e = true;
        }
    }
}
