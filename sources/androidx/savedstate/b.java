package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.r;
import androidx.savedstate.a;
import java.util.Map;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f2611a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2612b = new a();

    public b(c cVar) {
        this.f2611a = cVar;
    }

    public final void a(Bundle bundle) {
        r lifecycle = this.f2611a.getLifecycle();
        if (lifecycle.b() == r.c.INITIALIZED) {
            lifecycle.a(new Recreator(this.f2611a));
            a aVar = this.f2612b;
            if (!aVar.f2608c) {
                if (bundle != null) {
                    aVar.f2607b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                lifecycle.a(new SavedStateRegistry$1(aVar));
                aVar.f2608c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void b(Bundle bundle) {
        a aVar = this.f2612b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f2607b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        p.b<K, V>.d d10 = aVar.f2606a.d();
        while (d10.hasNext()) {
            Map.Entry entry = (Map.Entry) d10.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
