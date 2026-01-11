package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class t {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5446b = AtomicIntegerFieldUpdater.newUpdater(t.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f5447a;

    public t(Throwable th2) {
        this.f5447a = th2;
        this._handled = 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5447a + ']';
    }

    public t(Throwable th2, boolean z) {
        this.f5447a = th2;
        this._handled = z ? 1 : 0;
    }
}
