package k7;

import java.util.Objects;
import k7.d;

public final /* synthetic */ class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f7447a;

    public /* synthetic */ b(d dVar) {
        this.f7447a = dVar;
    }

    public final void onBackgroundStateChanged(boolean z) {
        d dVar = this.f7447a;
        Objects.requireNonNull(dVar);
        if (!z) {
            dVar.f7459h.get().c();
        }
    }
}
