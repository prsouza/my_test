package hb;

import androidx.lifecycle.w0;
import dagger.hilt.android.internal.managers.a;
import n9.b;

public abstract class f extends a implements b {

    /* renamed from: v  reason: collision with root package name */
    public volatile a f5916v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f5917w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public boolean f5918x = false;

    public f() {
        addOnContextAvailableListener(new e(this));
    }

    public final Object a() {
        if (this.f5916v == null) {
            synchronized (this.f5917w) {
                if (this.f5916v == null) {
                    this.f5916v = new a(this);
                }
            }
        }
        return this.f5916v.a();
    }

    public final w0.b getDefaultViewModelProviderFactory() {
        return l9.a.a(this, super.getDefaultViewModelProviderFactory());
    }
}
