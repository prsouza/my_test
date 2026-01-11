package je;

import ah.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ke.b;
import pd.d;

public final class p extends b<o<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7241a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    public final boolean a(Object obj) {
        o oVar = (o) obj;
        if (this._state != null) {
            return false;
        }
        this._state = aa.b.B;
        return true;
    }

    public final d[] b(Object obj) {
        o oVar = (o) obj;
        this._state = null;
        return v.C;
    }
}
