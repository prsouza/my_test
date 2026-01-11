package le;

import a.a;
import aa.b;
import ad.c;
import ge.g0;
import ge.k;
import ge.l;
import ge.m0;
import ge.u;
import ge.u0;
import ge.y1;
import ge.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.t;
import pd.f;
import rd.d;

public final class e<T> extends m0<T> implements d, pd.d<T> {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8236w = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: s  reason: collision with root package name */
    public final z f8237s;

    /* renamed from: t  reason: collision with root package name */
    public final pd.d<T> f8238t;

    /* renamed from: u  reason: collision with root package name */
    public Object f8239u = b.E;

    /* renamed from: v  reason: collision with root package name */
    public final Object f8240v;

    public e(z zVar, pd.d<? super T> dVar) {
        super(-1);
        this.f8237s = zVar;
        this.f8238t = dVar;
        f context = getContext();
        r rVar = t.f8267a;
        Object fold = context.fold(0, t.a.f8268b);
        e6.e.B(fold);
        this.f8240v = fold;
        this._reusableCancellableContinuation = null;
    }

    public final void a(Object obj, Throwable th2) {
        if (obj instanceof u) {
            ((u) obj).f5451b.k(th2);
        }
    }

    public final pd.d<T> b() {
        return this;
    }

    public final d getCallerFrame() {
        pd.d<T> dVar = this.f8238t;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final f getContext() {
        return this.f8238t.getContext();
    }

    public final Object h() {
        Object obj = this.f8239u;
        this.f8239u = b.E;
        return obj;
    }

    public final l<T> j() {
        boolean z;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = b.F;
                return null;
            } else if (obj instanceof l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8236w;
                r rVar = b.F;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return (l) obj;
                }
            } else if (obj != b.F && !(obj instanceof Throwable)) {
                throw new IllegalStateException(e6.e.a0("Inconsistent state ", obj).toString());
            }
        }
    }

    public final boolean k() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean n(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r rVar = b.F;
            boolean z = false;
            boolean z10 = true;
            if (e6.e.r(obj, rVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8236w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, th2)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8236w;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    return false;
                }
            }
        }
    }

    public final void p() {
        Object obj = this._reusableCancellableContinuation;
        l lVar = obj instanceof l ? (l) obj : null;
        if (lVar != null) {
            lVar.p();
        }
    }

    public final Throwable r(k<?> kVar) {
        boolean z;
        do {
            Object obj = this._reusableCancellableContinuation;
            r rVar = b.F;
            z = false;
            if (obj == rVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8236w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8236w;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalStateException(e6.e.a0("Inconsistent state ", obj).toString());
            }
        } while (!z);
        return null;
    }

    public final void resumeWith(Object obj) {
        f context;
        Object b10;
        f context2 = this.f8238t.getContext();
        Object B0 = c.B0(obj, (xd.l) null);
        if (this.f8237s.v0(context2)) {
            this.f8239u = B0;
            this.f5430c = 0;
            this.f8237s.p0(context2, this);
            return;
        }
        y1 y1Var = y1.f5472a;
        u0 a10 = y1.a();
        if (a10.A0()) {
            this.f8239u = B0;
            this.f5430c = 0;
            a10.y0(this);
            return;
        }
        a10.z0(true);
        try {
            context = getContext();
            b10 = t.b(context, this.f8240v);
            this.f8238t.resumeWith(obj);
            t.a(context, b10);
            do {
            } while (a10.C0());
        } catch (Throwable th2) {
            try {
                f(th2, (Throwable) null);
            } catch (Throwable th3) {
                a10.w0(true);
                throw th3;
            }
        }
        a10.w0(true);
    }

    public final String toString() {
        StringBuilder d10 = a.d("DispatchedContinuation[");
        d10.append(this.f8237s);
        d10.append(", ");
        d10.append(g0.t(this.f8238t));
        d10.append(']');
        return d10.toString();
    }
}
