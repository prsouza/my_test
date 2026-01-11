package i3;

import g3.f;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public final class q<Z> implements w<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6134a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6135b;

    /* renamed from: c  reason: collision with root package name */
    public final w<Z> f6136c;

    /* renamed from: s  reason: collision with root package name */
    public final a f6137s;

    /* renamed from: t  reason: collision with root package name */
    public final f f6138t;

    /* renamed from: u  reason: collision with root package name */
    public int f6139u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6140v;

    public interface a {
        void a(f fVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z, boolean z10, f fVar, a aVar) {
        Objects.requireNonNull(wVar, "Argument must not be null");
        this.f6136c = wVar;
        this.f6134a = z;
        this.f6135b = z10;
        this.f6138t = fVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f6137s = aVar;
    }

    public final synchronized void a() {
        if (!this.f6140v) {
            this.f6139u++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final int b() {
        return this.f6136c.b();
    }

    public final Class<Z> c() {
        return this.f6136c.c();
    }

    public final synchronized void d() {
        if (this.f6139u > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f6140v) {
            this.f6140v = true;
            if (this.f6135b) {
                this.f6136c.d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final void e() {
        boolean z;
        synchronized (this) {
            int i = this.f6139u;
            if (i > 0) {
                z = true;
                int i10 = i - 1;
                this.f6139u = i10;
                if (i10 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f6137s.a(this.f6138t, this);
        }
    }

    public final Z get() {
        return this.f6136c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f6134a + ", listener=" + this.f6137s + ", key=" + this.f6138t + ", acquired=" + this.f6139u + ", isRecycled=" + this.f6140v + ", resource=" + this.f6136c + MessageFormatter.DELIM_STOP;
    }
}
