package kb;

import androidx.lifecycle.w0;
import hb.a;

public abstract class b extends a implements n9.b {

    /* renamed from: v  reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.a f7490v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f7491w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public boolean f7492x = false;

    public b() {
        addOnContextAvailableListener(new a(this));
    }

    public final Object a() {
        if (this.f7490v == null) {
            synchronized (this.f7491w) {
                if (this.f7490v == null) {
                    this.f7490v = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f7490v.a();
    }

    public final w0.b getDefaultViewModelProviderFactory() {
        return l9.a.a(this, super.getDefaultViewModelProviderFactory());
    }
}
