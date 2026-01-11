package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.b0;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.savedstate.a;
import androidx.savedstate.b;
import androidx.savedstate.c;

public final class p0 implements q, c, y0 {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f1972a;

    /* renamed from: b  reason: collision with root package name */
    public final x0 f1973b;

    /* renamed from: c  reason: collision with root package name */
    public w0.b f1974c;

    /* renamed from: s  reason: collision with root package name */
    public b0 f1975s = null;

    /* renamed from: t  reason: collision with root package name */
    public b f1976t = null;

    public p0(Fragment fragment, x0 x0Var) {
        this.f1972a = fragment;
        this.f1973b = x0Var;
    }

    public final void a(r.b bVar) {
        this.f1975s.f(bVar);
    }

    public final void b() {
        if (this.f1975s == null) {
            this.f1975s = new b0(this);
            this.f1976t = new b(this);
        }
    }

    public final w0.b getDefaultViewModelProviderFactory() {
        w0.b defaultViewModelProviderFactory = this.f1972a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f1972a.mDefaultFactory)) {
            this.f1974c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f1974c == null) {
            Application application = null;
            Context context = this.f1972a.requireContext().getApplicationContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            this.f1974c = new s0(application, this, this.f1972a.getArguments());
        }
        return this.f1974c;
    }

    public final r getLifecycle() {
        b();
        return this.f1975s;
    }

    public final a getSavedStateRegistry() {
        b();
        return this.f1976t.f2612b;
    }

    public final x0 getViewModelStore() {
        b();
        return this.f1973b;
    }
}
