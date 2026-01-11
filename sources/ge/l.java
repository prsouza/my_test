package ge;

import a.b;
import c3.k;
import e6.e;
import ge.g1;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.r;
import md.g;
import md.m;
import pd.f;
import qd.a;
import rd.d;

public final class l<T> extends m0<T> implements k<T>, d {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5410v = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decision");

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5411w = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = b.f5366a;

    /* renamed from: s  reason: collision with root package name */
    public final pd.d<T> f5412s;

    /* renamed from: t  reason: collision with root package name */
    public final f f5413t;

    /* renamed from: u  reason: collision with root package name */
    public q0 f5414u;

    public l(pd.d<? super T> dVar, int i) {
        super(i);
        this.f5412s = dVar;
        this.f5413t = dVar.getContext();
    }

    public final void A(Object obj, int i, xd.l<? super Throwable, m> lVar) {
        boolean z;
        do {
            Object obj2 = this._state;
            z = false;
            if (obj2 instanceof q1) {
                Object B = B((q1) obj2, obj, i, lVar);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5411w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    Objects.requireNonNull(mVar);
                    if (m.f5429c.compareAndSet(mVar, 0, 1)) {
                        if (lVar != null) {
                            n(lVar, mVar.f5447a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(e.a0("Already resumed, but proposed with update ", obj).toString());
            }
        } while (!z);
        r();
        s(i);
    }

    public final Object B(q1 q1Var, Object obj, int i, xd.l lVar) {
        if ((obj instanceof t) || !b.l0(i)) {
            return obj;
        }
        if (lVar == null && (!(q1Var instanceof i) || (q1Var instanceof d))) {
            return obj;
        }
        return new s(obj, q1Var instanceof i ? (i) q1Var : null, lVar, (Throwable) null, 16);
    }

    public final r C(Object obj, xd.l lVar) {
        boolean z;
        do {
            Object obj2 = this._state;
            if (obj2 instanceof q1) {
                Object B = B((q1) obj2, obj, this.f5430c, lVar);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5411w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                boolean z10 = obj2 instanceof s;
                return null;
            }
        } while (!z);
        r();
        return k.B;
    }

    public final void a(Object obj, Throwable th2) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof q1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof t)) {
                boolean z = false;
                if (obj2 instanceof s) {
                    s sVar = (s) obj2;
                    if (!(sVar.f5443e != null)) {
                        s a10 = s.a(sVar, (i) null, th2, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5411w;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            i iVar = sVar.f5440b;
                            if (iVar != null) {
                                j(iVar, th2);
                            }
                            xd.l<Throwable, m> lVar = sVar.f5441c;
                            if (lVar != null) {
                                n(lVar, th2);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5411w;
                    s sVar2 = new s(obj2, (i) null, (xd.l) null, th2, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, sVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final pd.d<T> b() {
        return this.f5412s;
    }

    public final Throwable c(Object obj) {
        Throwable c10 = super.c(obj);
        if (c10 == null) {
            return null;
        }
        return c10;
    }

    public final void d() {
        s(this.f5430c);
    }

    public final <T> T e(Object obj) {
        return obj instanceof s ? ((s) obj).f5439a : obj;
    }

    public final Object g() {
        return C(m.f8555a, (xd.l) null);
    }

    public final d getCallerFrame() {
        pd.d<T> dVar = this.f5412s;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final f getContext() {
        return this.f5413t;
    }

    public final Object h() {
        return this._state;
    }

    public final void i(xd.l<? super Throwable, m> lVar) {
        i d1Var = lVar instanceof i ? (i) lVar : new d1(lVar);
        while (true) {
            Object obj = this._state;
            boolean z = false;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5411w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                Throwable th2 = null;
                if (!(obj instanceof i)) {
                    boolean z10 = obj instanceof t;
                    if (z10) {
                        t tVar = (t) obj;
                        Objects.requireNonNull(tVar);
                        if (!t.f5446b.compareAndSet(tVar, 0, 1)) {
                            x(lVar, obj);
                            throw null;
                        } else if (obj instanceof m) {
                            if (!z10) {
                                tVar = null;
                            }
                            if (tVar != null) {
                                th2 = tVar.f5447a;
                            }
                            k(lVar, th2);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof s) {
                        s sVar = (s) obj;
                        if (sVar.f5440b != null) {
                            x(lVar, obj);
                            throw null;
                        } else if (!(d1Var instanceof d)) {
                            Throwable th3 = sVar.f5443e;
                            if (th3 != null) {
                                k(lVar, th3);
                                return;
                            }
                            s a10 = s.a(sVar, d1Var, (Throwable) null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5411w;
                            while (true) {
                                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a10)) {
                                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(d1Var instanceof d)) {
                        s sVar2 = new s(obj, d1Var, (xd.l) null, (Throwable) null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f5411w;
                        while (true) {
                            if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, sVar2)) {
                                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                    break;
                                }
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    x(lVar, obj);
                    throw null;
                }
            }
        }
    }

    public final void j(i iVar, Throwable th2) {
        try {
            iVar.a(th2);
        } catch (Throwable th3) {
            g.a(this.f5413t, new w(e.a0("Exception in invokeOnCancellation handler for ", this), th3));
        }
    }

    public final void k(xd.l<? super Throwable, m> lVar, Throwable th2) {
        try {
            lVar.k(th2);
        } catch (Throwable th3) {
            g.a(this.f5413t, new w(e.a0("Exception in invokeOnCancellation handler for ", this), th3));
        }
    }

    public final boolean l(Throwable th2) {
        Object obj;
        boolean z;
        boolean z10;
        do {
            obj = this._state;
            z = false;
            if (obj instanceof q1) {
                z10 = obj instanceof i;
                m mVar = new m(this, th2, z10);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5411w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        i iVar = z10 ? (i) obj : null;
        if (iVar != null) {
            j(iVar, th2);
        }
        r();
        s(this.f5430c);
        return true;
    }

    public final void m(z zVar) {
        z zVar2;
        m mVar = m.f8555a;
        pd.d<T> dVar = this.f5412s;
        le.e eVar = dVar instanceof le.e ? (le.e) dVar : null;
        if (eVar == null) {
            zVar2 = null;
        } else {
            zVar2 = eVar.f8237s;
        }
        A(mVar, zVar2 == zVar ? 4 : this.f5430c, (xd.l<? super Throwable, m>) null);
    }

    public final void n(xd.l<? super Throwable, m> lVar, Throwable th2) {
        try {
            lVar.k(th2);
        } catch (Throwable th3) {
            g.a(this.f5413t, new w(e.a0("Exception in resume onCancellation handler for ", this), th3));
        }
    }

    public final void o(T t10, xd.l<? super Throwable, m> lVar) {
        A(t10, this.f5430c, lVar);
    }

    public final void p() {
        q0 q0Var = this.f5414u;
        if (q0Var != null) {
            q0Var.e();
            this.f5414u = p1.f5437a;
        }
    }

    public final Object q(Object obj, xd.l lVar) {
        return C(obj, lVar);
    }

    public final void r() {
        if (!w()) {
            p();
        }
    }

    public final void resumeWith(Object obj) {
        Throwable a10 = g.a(obj);
        if (a10 != null) {
            obj = new t(a10);
        }
        A(obj, this.f5430c, (xd.l<? super Throwable, m>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            if (r0 != r1) goto L_0x000a
            r0 = r2
            goto L_0x0020
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f5410v
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r2, r3)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            pd.d r0 = r4.b()
            r3 = 4
            if (r5 != r3) goto L_0x002b
            r2 = r1
        L_0x002b:
            if (r2 != 0) goto L_0x007f
            boolean r3 = r0 instanceof le.e
            if (r3 == 0) goto L_0x007f
            boolean r5 = a.b.l0(r5)
            int r3 = r4.f5430c
            boolean r3 = a.b.l0(r3)
            if (r5 != r3) goto L_0x007f
            r5 = r0
            le.e r5 = (le.e) r5
            ge.z r5 = r5.f8237s
            pd.f r0 = r0.getContext()
            boolean r2 = r5.v0(r0)
            if (r2 == 0) goto L_0x0050
            r5.p0(r0, r4)
            goto L_0x0082
        L_0x0050:
            ge.y1 r5 = ge.y1.f5472a
            ge.u0 r5 = ge.y1.a()
            boolean r0 = r5.A0()
            if (r0 == 0) goto L_0x0060
            r5.y0(r4)
            goto L_0x0082
        L_0x0060:
            r5.z0(r1)
            pd.d r0 = r4.b()     // Catch:{ all -> 0x0071 }
            a.b.A0(r4, r0, r1)     // Catch:{ all -> 0x0071 }
        L_0x006a:
            boolean r0 = r5.C0()     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x006a
            goto L_0x0076
        L_0x0071:
            r0 = move-exception
            r2 = 0
            r4.f(r0, r2)     // Catch:{ all -> 0x007a }
        L_0x0076:
            r5.w0(r1)
            goto L_0x0082
        L_0x007a:
            r0 = move-exception
            r5.w0(r1)
            throw r0
        L_0x007f:
            a.b.A0(r4, r0, r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.l.s(int):void");
    }

    public final Object t() {
        boolean z;
        boolean w6 = w();
        while (true) {
            int i = this._decision;
            z = false;
            if (i == 0) {
                if (f5410v.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            if (this.f5414u == null) {
                v();
            }
            if (w6) {
                y();
            }
            return a.COROUTINE_SUSPENDED;
        }
        if (w6) {
            y();
        }
        Object obj = this._state;
        if (!(obj instanceof t)) {
            if (b.l0(this.f5430c)) {
                f fVar = this.f5413t;
                int i10 = g1.f5400e;
                g1 g1Var = (g1) fVar.get(g1.b.f5401a);
                if (g1Var != null && !g1Var.a()) {
                    CancellationException S = g1Var.S();
                    a(obj, S);
                    throw S;
                }
            }
            return e(obj);
        }
        throw ((t) obj).f5447a;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CancellableContinuation");
        sb2.append('(');
        sb2.append(g0.t(this.f5412s));
        sb2.append("){");
        Object obj = this._state;
        if (obj instanceof q1) {
            str = "Active";
        } else {
            str = obj instanceof m ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(g0.o(this));
        return sb2.toString();
    }

    public final void u() {
        q0 v10 = v();
        if (v10 != null && (!(this._state instanceof q1))) {
            v10.e();
            this.f5414u = p1.f5437a;
        }
    }

    public final q0 v() {
        f fVar = this.f5413t;
        int i = g1.f5400e;
        g1 g1Var = (g1) fVar.get(g1.b.f5401a);
        if (g1Var == null) {
            return null;
        }
        q0 b10 = g1.a.b(g1Var, true, false, new n(this), 2, (Object) null);
        this.f5414u = b10;
        return b10;
    }

    public final boolean w() {
        return (this.f5430c == 2) && ((le.e) this.f5412s).k();
    }

    public final void x(xd.l<? super Throwable, m> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public final void y() {
        pd.d<T> dVar = this.f5412s;
        Throwable th2 = null;
        le.e eVar = dVar instanceof le.e ? (le.e) dVar : null;
        if (eVar != null) {
            th2 = eVar.r(this);
        }
        if (th2 != null) {
            p();
            l(th2);
        }
    }

    public final boolean z() {
        Object obj = this._state;
        if (!(obj instanceof s) || ((s) obj).f5442d == null) {
            this._decision = 0;
            this._state = b.f5366a;
            return true;
        }
        p();
        return false;
    }
}
