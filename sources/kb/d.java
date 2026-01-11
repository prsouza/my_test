package kb;

import androidx.lifecycle.w0;
import hb.a;
import n9.b;

public abstract class d extends a implements b {

    /* renamed from: v  reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.a f7494v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f7495w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public boolean f7496x = false;

    public d() {
        addOnContextAvailableListener(new c(this));
    }

    public final Object a() {
        if (this.f7494v == null) {
            synchronized (this.f7495w) {
                if (this.f7494v == null) {
                    this.f7494v = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f7494v.a();
    }

    public final w0.b getDefaultViewModelProviderFactory() {
        return l9.a.a(this, super.getDefaultViewModelProviderFactory());
    }
}
