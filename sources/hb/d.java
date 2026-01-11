package hb;

import androidx.lifecycle.w0;
import dagger.hilt.android.internal.managers.a;
import n9.b;

public abstract class d extends a implements b {

    /* renamed from: v  reason: collision with root package name */
    public volatile a f5912v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f5913w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public boolean f5914x = false;

    public d() {
        addOnContextAvailableListener(new c(this));
    }

    public final Object a() {
        if (this.f5912v == null) {
            synchronized (this.f5913w) {
                if (this.f5912v == null) {
                    this.f5912v = new a(this);
                }
            }
        }
        return this.f5912v.a();
    }

    public final w0.b getDefaultViewModelProviderFactory() {
        return l9.a.a(this, super.getDefaultViewModelProviderFactory());
    }
}
