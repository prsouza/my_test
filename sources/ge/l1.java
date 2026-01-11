package ge;

import e6.e;
import ee.f;
import ge.g1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.g;
import le.h;
import le.n;
import md.m;
import org.slf4j.helpers.MessageFormatter;
import pd.f;
import xd.l;
import xd.p;

public class l1 implements g1, q, r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5416a = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public static final class a extends k1 {

        /* renamed from: t  reason: collision with root package name */
        public final l1 f5417t;

        /* renamed from: u  reason: collision with root package name */
        public final b f5418u;

        /* renamed from: v  reason: collision with root package name */
        public final p f5419v;

        /* renamed from: w  reason: collision with root package name */
        public final Object f5420w;

        public a(l1 l1Var, b bVar, p pVar, Object obj) {
            this.f5417t = l1Var;
            this.f5418u = bVar;
            this.f5419v = pVar;
            this.f5420w = obj;
        }

        public final /* bridge */ /* synthetic */ Object k(Object obj) {
            x((Throwable) obj);
            return m.f8555a;
        }

        public final void x(Throwable th2) {
            l1 l1Var = this.f5417t;
            b bVar = this.f5418u;
            p pVar = this.f5419v;
            Object obj = this.f5420w;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.f5416a;
            p X = l1Var.X(pVar);
            if (X == null || !l1Var.j0(bVar, X, obj)) {
                l1Var.s(l1Var.F(bVar, obj));
            }
        }
    }

    public static final class b implements b1 {
        private volatile /* synthetic */ Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        public final o1 f5421a;

        public b(o1 o1Var, Throwable th2) {
            this.f5421a = o1Var;
            this._rootCause = th2;
            this._exceptionsHolder = null;
        }

        public final boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        public final void b(Throwable th2) {
            Throwable th3 = (Throwable) this._rootCause;
            if (th3 == null) {
                this._rootCause = th2;
            } else if (th2 != th3) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th2;
                } else if (obj instanceof Throwable) {
                    if (th2 != obj) {
                        ArrayList<Throwable> c10 = c();
                        c10.add(obj);
                        c10.add(th2);
                        this._exceptionsHolder = c10;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th2);
                } else {
                    throw new IllegalStateException(e.a0("State is ", obj).toString());
                }
            }
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        public final boolean f() {
            return this._isCompleting;
        }

        public final o1 g() {
            return this.f5421a;
        }

        public final boolean h() {
            return this._exceptionsHolder == a.b.f8v;
        }

        public final List<Throwable> i(Throwable th2) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = c();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(obj);
                arrayList = c10;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(e.a0("State is ", obj).toString());
            }
            Throwable th3 = (Throwable) this._rootCause;
            if (th3 != null) {
                arrayList.add(0, th3);
            }
            if (th2 != null && !e.r(th2, th3)) {
                arrayList.add(th2);
            }
            this._exceptionsHolder = a.b.f8v;
            return arrayList;
        }

        public final void j() {
            this._isCompleting = 1;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [int, boolean] */
        public final String toString() {
            StringBuilder d10 = a.a.d("Finishing[cancelling=");
            d10.append(e());
            d10.append(", completing=");
            d10.append(this._isCompleting);
            d10.append(", rootCause=");
            d10.append((Throwable) this._rootCause);
            d10.append(", exceptions=");
            d10.append(this._exceptionsHolder);
            d10.append(", list=");
            d10.append(this.f5421a);
            d10.append(']');
            return d10.toString();
        }
    }

    public static final class c extends h.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ l1 f5422d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f5423e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h hVar, l1 l1Var, Object obj) {
            super(hVar);
            this.f5422d = l1Var;
            this.f5423e = obj;
        }

        public final Object c(Object obj) {
            h hVar = (h) obj;
            if (this.f5422d.L() == this.f5423e) {
                return null;
            }
            return a.b.A;
        }
    }

    @rd.e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
    public static final class d extends rd.h implements p<f<? super g1>, pd.d<? super m>, Object> {

        /* renamed from: b  reason: collision with root package name */
        public g f5424b;

        /* renamed from: c  reason: collision with root package name */
        public h f5425c;

        /* renamed from: s  reason: collision with root package name */
        public int f5426s;

        /* renamed from: t  reason: collision with root package name */
        public /* synthetic */ Object f5427t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ l1 f5428u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(l1 l1Var, pd.d<? super d> dVar) {
            super(dVar);
            this.f5428u = l1Var;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            d dVar2 = new d(this.f5428u, dVar);
            dVar2.f5427t = obj;
            return dVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((f) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                qd.a r0 = qd.a.COROUTINE_SUSPENDED
                int r1 = r7.f5426s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                le.h r1 = r7.f5425c
                le.g r3 = r7.f5424b
                java.lang.Object r4 = r7.f5427t
                ee.f r4 = (ee.f) r4
                l6.b1.w(r8)
                r8 = r7
                goto L_0x0079
            L_0x0019:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0021:
                l6.b1.w(r8)
                goto L_0x007e
            L_0x0025:
                l6.b1.w(r8)
                java.lang.Object r8 = r7.f5427t
                ee.f r8 = (ee.f) r8
                ge.l1 r1 = r7.f5428u
                java.lang.Object r1 = r1.L()
                boolean r4 = r1 instanceof ge.p
                if (r4 == 0) goto L_0x0043
                ge.p r1 = (ge.p) r1
                ge.q r1 = r1.f5435t
                r7.f5426s = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L_0x007e
                return r0
            L_0x0043:
                boolean r3 = r1 instanceof ge.b1
                if (r3 == 0) goto L_0x007e
                ge.b1 r1 = (ge.b1) r1
                ge.o1 r1 = r1.g()
                if (r1 != 0) goto L_0x0050
                goto L_0x007e
            L_0x0050:
                java.lang.Object r3 = r1.o()
                le.h r3 = (le.h) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L_0x005b:
                boolean r5 = e6.e.r(r1, r3)
                if (r5 != 0) goto L_0x007e
                boolean r5 = r1 instanceof ge.p
                if (r5 == 0) goto L_0x0079
                r5 = r1
                ge.p r5 = (ge.p) r5
                ge.q r5 = r5.f5435t
                r8.f5427t = r4
                r8.f5424b = r3
                r8.f5425c = r1
                r8.f5426s = r2
                java.lang.Object r5 = r4.a(r5, r8)
                if (r5 != r0) goto L_0x0079
                return r0
            L_0x0079:
                le.h r1 = r1.p()
                goto L_0x005b
            L_0x007e:
                md.m r8 = md.m.f8555a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ge.l1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l1(boolean z) {
        this._state = z ? a.b.f10x : a.b.f9w;
        this._parentHandle = null;
    }

    public boolean A(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (!u(th2) || !H()) {
            return false;
        }
        return true;
    }

    public final o B(q qVar) {
        return (o) g1.a.b(this, true, false, new p(qVar), 2, (Object) null);
    }

    public final void C(b1 b1Var, Object obj) {
        w wVar;
        o oVar = (o) this._parentHandle;
        if (oVar != null) {
            oVar.e();
            this._parentHandle = p1.f5437a;
        }
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th2 = tVar == null ? null : tVar.f5447a;
        if (b1Var instanceof k1) {
            try {
                ((k1) b1Var).x(th2);
            } catch (Throwable th3) {
                N(new w("Exception in completion handler " + b1Var + " for " + this, th3));
            }
        } else {
            o1 g = b1Var.g();
            if (g != null) {
                w wVar2 = null;
                for (h hVar = (h) g.o(); !e.r(hVar, g); hVar = hVar.p()) {
                    if (hVar instanceof k1) {
                        k1 k1Var = (k1) hVar;
                        try {
                            k1Var.x(th2);
                        } catch (Throwable th4) {
                            if (wVar2 == null) {
                                wVar = null;
                            } else {
                                a.b.D(wVar2, th4);
                                wVar = wVar2;
                            }
                            if (wVar == null) {
                                wVar2 = new w("Exception in completion handler " + k1Var + " for " + this, th4);
                            }
                        }
                    }
                }
                if (wVar2 != null) {
                    N(wVar2);
                }
            }
        }
    }

    public final Throwable D(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new h1(z(), (Throwable) null, this);
            }
            return th2;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((r1) obj).O();
    }

    public final void E(r1 r1Var) {
        u(r1Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0095 A[LOOP:1: B:42:0x0095->B:45:0x00a0, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(ge.l1.b r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ge.t
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r9
            ge.t r0 = (ge.t) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.lang.Throwable r1 = r0.f5447a
        L_0x000f:
            monitor-enter(r8)
            r8.e()     // Catch:{ all -> 0x00a6 }
            java.util.List r0 = r8.i(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.Throwable r2 = r7.G(r8, r0)     // Catch:{ all -> 0x00a6 }
            r3 = 1
            if (r2 == 0) goto L_0x0054
            int r4 = r0.size()     // Catch:{ all -> 0x00a6 }
            if (r4 > r3) goto L_0x0025
            goto L_0x0054
        L_0x0025:
            int r4 = r0.size()     // Catch:{ all -> 0x00a6 }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00a6 }
            r5.<init>(r4)     // Catch:{ all -> 0x00a6 }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0036:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r5 == 0) goto L_0x0054
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x00a6 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00a6 }
            if (r5 == r2) goto L_0x0036
            if (r5 == r2) goto L_0x0036
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00a6 }
            if (r6 != 0) goto L_0x0036
            boolean r6 = r4.add(r5)     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x0036
            a.b.D(r2, r5)     // Catch:{ all -> 0x00a6 }
            goto L_0x0036
        L_0x0054:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            if (r2 != r1) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            ge.t r9 = new ge.t
            r9.<init>(r2)
        L_0x0061:
            if (r2 == 0) goto L_0x0082
            boolean r1 = r7.x(r2)
            if (r1 != 0) goto L_0x0072
            boolean r1 = r7.M(r2)
            if (r1 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r1 = r0
            goto L_0x0073
        L_0x0072:
            r1 = r3
        L_0x0073:
            if (r1 == 0) goto L_0x0082
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            java.util.Objects.requireNonNull(r9, r1)
            r1 = r9
            ge.t r1 = (ge.t) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = ge.t.f5446b
            r2.compareAndSet(r1, r0, r3)
        L_0x0082:
            r7.Z(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f5416a
            boolean r1 = r9 instanceof ge.b1
            if (r1 == 0) goto L_0x0094
            ge.c1 r1 = new ge.c1
            r2 = r9
            ge.b1 r2 = (ge.b1) r2
            r1.<init>(r2)
            goto L_0x0095
        L_0x0094:
            r1 = r9
        L_0x0095:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L_0x0095
        L_0x00a2:
            r7.C(r8, r9)
            return r9
        L_0x00a6:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.l1.F(ge.l1$b, java.lang.Object):java.lang.Object");
    }

    public final Throwable G(b bVar, List<? extends Throwable> list) {
        T t10;
        boolean z;
        T t11 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (!(((Throwable) t10) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th2 = (Throwable) t10;
            if (th2 != null) {
                return th2;
            }
            Throwable th3 = (Throwable) list.get(0);
            if (th3 instanceof z1) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th4 = (Throwable) next;
                    if (th4 == th3 || !(th4 instanceof z1)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t11 = next;
                        break;
                    }
                }
                Throwable th5 = (Throwable) t11;
                if (th5 != null) {
                    return th5;
                }
            }
            return th3;
        } else if (bVar.e()) {
            return new h1(z(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return false;
    }

    public final o1 J(b1 b1Var) {
        o1 g = b1Var.g();
        if (g != null) {
            return g;
        }
        if (b1Var instanceof t0) {
            return new o1();
        }
        if (b1Var instanceof k1) {
            d0((k1) b1Var);
            return null;
        }
        throw new IllegalStateException(e.a0("State should have list: ", b1Var).toString());
    }

    public final o K() {
        return (o) this._parentHandle;
    }

    public final Object L() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public boolean M(Throwable th2) {
        return false;
    }

    public void N(Throwable th2) {
        throw th2;
    }

    public final CancellationException O() {
        Throwable th2;
        Object L = L();
        CancellationException cancellationException = null;
        if (L instanceof b) {
            th2 = ((b) L).d();
        } else if (L instanceof t) {
            th2 = ((t) L).f5447a;
        } else if (!(L instanceof b1)) {
            th2 = null;
        } else {
            throw new IllegalStateException(e.a0("Cannot be cancelling child in this state: ", L).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        }
        return cancellationException == null ? new h1(e.a0("Parent job is ", g0(L)), th2, this) : cancellationException;
    }

    public final void P(g1 g1Var) {
        if (g1Var == null) {
            this._parentHandle = p1.f5437a;
            return;
        }
        g1Var.start();
        o B = g1Var.B(this);
        this._parentHandle = B;
        if (!(L() instanceof b1)) {
            B.e();
            this._parentHandle = p1.f5437a;
        }
    }

    public final q0 Q(l<? super Throwable, m> lVar) {
        return T(false, true, lVar);
    }

    public final CancellationException S() {
        Object L = L();
        CancellationException cancellationException = null;
        if (L instanceof b) {
            Throwable d10 = ((b) L).d();
            if (d10 != null) {
                cancellationException = h0(d10, e.a0(getClass().getSimpleName(), " is cancelling"));
            }
            if (cancellationException != null) {
                return cancellationException;
            }
            throw new IllegalStateException(e.a0("Job is still new or active: ", this).toString());
        } else if (L instanceof b1) {
            throw new IllegalStateException(e.a0("Job is still new or active: ", this).toString());
        } else if (L instanceof t) {
            return h0(((t) L).f5447a, (String) null);
        } else {
            return new h1(e.a0(getClass().getSimpleName(), " has completed normally"), (Throwable) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e A[LOOP:2: B:35:0x005e->B:38:0x0069, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ge.q0 T(boolean r8, boolean r9, xd.l<? super java.lang.Throwable, md.m> r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0014
            boolean r1 = r10 instanceof ge.i1
            if (r1 == 0) goto L_0x000b
            r1 = r10
            ge.i1 r1 = (ge.i1) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0027
            ge.e1 r1 = new ge.e1
            r1.<init>(r10)
            goto L_0x0027
        L_0x0014:
            boolean r1 = r10 instanceof ge.k1
            if (r1 == 0) goto L_0x001c
            r1 = r10
            ge.k1 r1 = (ge.k1) r1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 != 0) goto L_0x0020
            r1 = r0
        L_0x0020:
            if (r1 != 0) goto L_0x0027
            ge.f1 r1 = new ge.f1
            r1.<init>(r10)
        L_0x0027:
            r1.f5409s = r7
        L_0x0029:
            java.lang.Object r2 = r7.L()
            boolean r3 = r2 instanceof ge.t0
            if (r3 == 0) goto L_0x006c
            r3 = r2
            ge.t0 r3 = (ge.t0) r3
            boolean r4 = r3.f5448a
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f5416a
        L_0x003a:
            boolean r3 = r4.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L_0x0042
            r2 = 1
            goto L_0x0049
        L_0x0042:
            java.lang.Object r3 = r4.get(r7)
            if (r3 == r2) goto L_0x003a
            r2 = 0
        L_0x0049:
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x004c:
            ge.o1 r2 = new ge.o1
            r2.<init>()
            boolean r4 = r3.f5448a
            if (r4 == 0) goto L_0x0057
            r4 = r2
            goto L_0x005c
        L_0x0057:
            ge.a1 r4 = new ge.a1
            r4.<init>(r2)
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f5416a
        L_0x005e:
            boolean r2 = r5.compareAndSet(r7, r3, r4)
            if (r2 == 0) goto L_0x0065
            goto L_0x0029
        L_0x0065:
            java.lang.Object r2 = r5.get(r7)
            if (r2 == r3) goto L_0x005e
            goto L_0x0029
        L_0x006c:
            boolean r3 = r2 instanceof ge.b1
            if (r3 == 0) goto L_0x00c6
            r3 = r2
            ge.b1 r3 = (ge.b1) r3
            ge.o1 r3 = r3.g()
            if (r3 != 0) goto L_0x0084
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            java.util.Objects.requireNonNull(r2, r3)
            ge.k1 r2 = (ge.k1) r2
            r7.d0(r2)
            goto L_0x0029
        L_0x0084:
            ge.p1 r4 = ge.p1.f5437a
            if (r8 == 0) goto L_0x00b6
            boolean r5 = r2 instanceof ge.l1.b
            if (r5 == 0) goto L_0x00b6
            monitor-enter(r2)
            r5 = r2
            ge.l1$b r5 = (ge.l1.b) r5     // Catch:{ all -> 0x00b3 }
            java.lang.Throwable r5 = r5.d()     // Catch:{ all -> 0x00b3 }
            if (r5 == 0) goto L_0x00a3
            boolean r6 = r10 instanceof ge.p     // Catch:{ all -> 0x00b3 }
            if (r6 == 0) goto L_0x00b1
            r6 = r2
            ge.l1$b r6 = (ge.l1.b) r6     // Catch:{ all -> 0x00b3 }
            boolean r6 = r6.f()     // Catch:{ all -> 0x00b3 }
            if (r6 != 0) goto L_0x00b1
        L_0x00a3:
            boolean r4 = r7.r(r2, r3, r1)     // Catch:{ all -> 0x00b3 }
            if (r4 != 0) goto L_0x00ac
            monitor-exit(r2)
            goto L_0x0029
        L_0x00ac:
            if (r5 != 0) goto L_0x00b0
            monitor-exit(r2)
            return r1
        L_0x00b0:
            r4 = r1
        L_0x00b1:
            monitor-exit(r2)
            goto L_0x00b7
        L_0x00b3:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x00b6:
            r5 = r0
        L_0x00b7:
            if (r5 == 0) goto L_0x00bf
            if (r9 == 0) goto L_0x00be
            r10.k(r5)
        L_0x00be:
            return r4
        L_0x00bf:
            boolean r2 = r7.r(r2, r3, r1)
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x00c6:
            if (r9 == 0) goto L_0x00d8
            boolean r8 = r2 instanceof ge.t
            if (r8 == 0) goto L_0x00cf
            ge.t r2 = (ge.t) r2
            goto L_0x00d0
        L_0x00cf:
            r2 = r0
        L_0x00d0:
            if (r2 != 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            java.lang.Throwable r0 = r2.f5447a
        L_0x00d5:
            r10.k(r0)
        L_0x00d8:
            ge.p1 r8 = ge.p1.f5437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.l1.T(boolean, boolean, xd.l):ge.q0");
    }

    public boolean U() {
        return this instanceof e;
    }

    public final Object V(Object obj) {
        Object i02;
        do {
            i02 = i0(L(), obj);
            if (i02 == a.b.f4c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                t tVar = obj instanceof t ? (t) obj : null;
                if (tVar != null) {
                    th2 = tVar.f5447a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (i02 == a.b.f6t);
        return i02;
    }

    public String W() {
        return getClass().getSimpleName();
    }

    public final p X(h hVar) {
        while (hVar.t()) {
            hVar = hVar.q();
        }
        while (true) {
            hVar = hVar.p();
            if (!hVar.t()) {
                if (hVar instanceof p) {
                    return (p) hVar;
                }
                if (hVar instanceof o1) {
                    return null;
                }
            }
        }
    }

    public final void Y(o1 o1Var, Throwable th2) {
        w wVar;
        w wVar2 = null;
        for (h hVar = (h) o1Var.o(); !e.r(hVar, o1Var); hVar = hVar.p()) {
            if (hVar instanceof i1) {
                k1 k1Var = (k1) hVar;
                try {
                    k1Var.x(th2);
                } catch (Throwable th3) {
                    if (wVar2 == null) {
                        wVar = null;
                    } else {
                        a.b.D(wVar2, th3);
                        wVar = wVar2;
                    }
                    if (wVar == null) {
                        wVar2 = new w("Exception in completion handler " + k1Var + " for " + this, th3);
                    }
                }
            }
        }
        if (wVar2 != null) {
            N(wVar2);
        }
        x(th2);
    }

    public void Z(Object obj) {
    }

    public boolean a() {
        Object L = L();
        return (L instanceof b1) && ((b1) L).a();
    }

    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new h1(z(), (Throwable) null, this);
        }
        v(cancellationException);
    }

    public void c0() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[LOOP:2: B:12:0x0036->B:15:0x0041, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d0(ge.k1 r6) {
        /*
            r5 = this;
            ge.o1 r0 = new ge.o1
            r0.<init>()
            java.util.Objects.requireNonNull(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = le.h.f8247b
            r1.lazySet(r0, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = le.h.f8246a
            r1.lazySet(r0, r6)
        L_0x0012:
            java.lang.Object r1 = r6.o()
            r2 = 0
            if (r1 == r6) goto L_0x001a
            goto L_0x0030
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = le.h.f8246a
        L_0x001c:
            boolean r3 = r1.compareAndSet(r6, r6, r0)
            r4 = 1
            if (r3 == 0) goto L_0x0025
            r2 = r4
            goto L_0x002b
        L_0x0025:
            java.lang.Object r3 = r1.get(r6)
            if (r3 == r6) goto L_0x001c
        L_0x002b:
            if (r2 == 0) goto L_0x0012
            r0.n(r6)
        L_0x0030:
            le.h r1 = r6.p()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f5416a
        L_0x0036:
            boolean r0 = r2.compareAndSet(r5, r6, r1)
            if (r0 == 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            java.lang.Object r0 = r2.get(r5)
            if (r0 == r6) goto L_0x0036
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.l1.d0(ge.k1):void");
    }

    public final int e0(Object obj) {
        boolean z = false;
        if (obj instanceof t0) {
            if (((t0) obj).f5448a) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5416a;
            t0 t0Var = a.b.f10x;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, t0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return -1;
            }
            c0();
            return 1;
        } else if (!(obj instanceof a1)) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5416a;
            o1 o1Var = ((a1) obj).f5364a;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, o1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return -1;
            }
            c0();
            return 1;
        }
    }

    public final <R> R fold(R r10, p<? super R, ? super f.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    public final String g0(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.e()) {
                return "Cancelling";
            }
            if (bVar.f()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof b1)) {
            return obj instanceof t ? "Cancelled" : "Completed";
        } else {
            if (((b1) obj).a()) {
                return "Active";
            }
            return "New";
        }
    }

    public final <E extends f.a> E get(f.b<E> bVar) {
        return f.a.C0191a.a(this, bVar);
    }

    public final f.b<?> getKey() {
        return g1.b.f5401a;
    }

    public final CancellationException h0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = z();
            }
            cancellationException = new h1(str, th2, this);
        }
        return cancellationException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ae, code lost:
        if (r5 != null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b1, code lost:
        Y(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00b6, code lost:
        if ((r8 instanceof ge.p) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00b8, code lost:
        r0 = (ge.p) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00bc, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00bd, code lost:
        if (r0 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00bf, code lost:
        r8 = r8.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c3, code lost:
        if (r8 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00c6, code lost:
        r4 = X(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00cb, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00cc, code lost:
        if (r4 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00d2, code lost:
        if (j0(r3, r4, r9) == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return F(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return a.b.f5s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i0(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ge.b1
            if (r0 != 0) goto L_0x0007
            le.r r8 = a.b.f4c
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof ge.t0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r8 instanceof ge.k1
            if (r0 == 0) goto L_0x004b
        L_0x0011:
            boolean r0 = r8 instanceof ge.p
            if (r0 != 0) goto L_0x004b
            boolean r0 = r9 instanceof ge.t
            if (r0 != 0) goto L_0x004b
            r0 = r8
            ge.b1 r0 = (ge.b1) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f5416a
            boolean r8 = r9 instanceof ge.b1
            if (r8 == 0) goto L_0x002b
            ge.c1 r8 = new ge.c1
            r4 = r9
            ge.b1 r4 = (ge.b1) r4
            r8.<init>(r4)
            goto L_0x002c
        L_0x002b:
            r8 = r9
        L_0x002c:
            boolean r4 = r3.compareAndSet(r7, r0, r8)
            if (r4 == 0) goto L_0x0034
            r8 = r1
            goto L_0x003b
        L_0x0034:
            java.lang.Object r4 = r3.get(r7)
            if (r4 == r0) goto L_0x002c
            r8 = r2
        L_0x003b:
            if (r8 != 0) goto L_0x003f
            r1 = r2
            goto L_0x0045
        L_0x003f:
            r7.Z(r9)
            r7.C(r0, r9)
        L_0x0045:
            if (r1 == 0) goto L_0x0048
            return r9
        L_0x0048:
            le.r r8 = a.b.f6t
            return r8
        L_0x004b:
            ge.b1 r8 = (ge.b1) r8
            ge.o1 r0 = r7.J(r8)
            if (r0 != 0) goto L_0x0057
            le.r r8 = a.b.f6t
            goto L_0x00db
        L_0x0057:
            boolean r3 = r8 instanceof ge.l1.b
            r4 = 0
            if (r3 == 0) goto L_0x0060
            r3 = r8
            ge.l1$b r3 = (ge.l1.b) r3
            goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            if (r3 != 0) goto L_0x0068
            ge.l1$b r3 = new ge.l1$b
            r3.<init>(r0, r4)
        L_0x0068:
            monitor-enter(r3)
            boolean r5 = r3.f()     // Catch:{ all -> 0x00dc }
            if (r5 == 0) goto L_0x0074
            le.r r8 = a.b.f4c     // Catch:{ all -> 0x00dc }
            monitor-exit(r3)
            goto L_0x00db
        L_0x0074:
            r3.j()     // Catch:{ all -> 0x00dc }
            if (r3 == r8) goto L_0x008f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f5416a     // Catch:{ all -> 0x00dc }
        L_0x007b:
            boolean r6 = r5.compareAndSet(r7, r8, r3)     // Catch:{ all -> 0x00dc }
            if (r6 == 0) goto L_0x0083
            r2 = r1
            goto L_0x0089
        L_0x0083:
            java.lang.Object r6 = r5.get(r7)     // Catch:{ all -> 0x00dc }
            if (r6 == r8) goto L_0x007b
        L_0x0089:
            if (r2 != 0) goto L_0x008f
            le.r r8 = a.b.f6t     // Catch:{ all -> 0x00dc }
            monitor-exit(r3)
            goto L_0x00db
        L_0x008f:
            boolean r2 = r3.e()     // Catch:{ all -> 0x00dc }
            boolean r5 = r9 instanceof ge.t     // Catch:{ all -> 0x00dc }
            if (r5 == 0) goto L_0x009b
            r5 = r9
            ge.t r5 = (ge.t) r5     // Catch:{ all -> 0x00dc }
            goto L_0x009c
        L_0x009b:
            r5 = r4
        L_0x009c:
            if (r5 != 0) goto L_0x009f
            goto L_0x00a4
        L_0x009f:
            java.lang.Throwable r5 = r5.f5447a     // Catch:{ all -> 0x00dc }
            r3.b(r5)     // Catch:{ all -> 0x00dc }
        L_0x00a4:
            java.lang.Throwable r5 = r3.d()     // Catch:{ all -> 0x00dc }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r5 = r4
        L_0x00ad:
            monitor-exit(r3)
            if (r5 != 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r7.Y(r0, r5)
        L_0x00b4:
            boolean r0 = r8 instanceof ge.p
            if (r0 == 0) goto L_0x00bc
            r0 = r8
            ge.p r0 = (ge.p) r0
            goto L_0x00bd
        L_0x00bc:
            r0 = r4
        L_0x00bd:
            if (r0 != 0) goto L_0x00cb
            ge.o1 r8 = r8.g()
            if (r8 != 0) goto L_0x00c6
            goto L_0x00cc
        L_0x00c6:
            ge.p r4 = r7.X(r8)
            goto L_0x00cc
        L_0x00cb:
            r4 = r0
        L_0x00cc:
            if (r4 == 0) goto L_0x00d7
            boolean r8 = r7.j0(r3, r4, r9)
            if (r8 == 0) goto L_0x00d7
            le.r r8 = a.b.f5s
            goto L_0x00db
        L_0x00d7:
            java.lang.Object r8 = r7.F(r3, r9)
        L_0x00db:
            return r8
        L_0x00dc:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.l1.i0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean j0(b bVar, p pVar, Object obj) {
        while (g1.a.b(pVar.f5435t, false, false, new a(this, bVar, pVar, obj), 1, (Object) null) == p1.f5437a) {
            pVar = X(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    public final pd.f minusKey(f.b<?> bVar) {
        return f.a.C0191a.b(this, bVar);
    }

    public final pd.f plus(pd.f fVar) {
        return f.a.C0191a.c(this, fVar);
    }

    public final boolean r(Object obj, o1 o1Var, k1 k1Var) {
        int w6;
        c cVar = new c(k1Var, this, obj);
        do {
            w6 = o1Var.q().w(k1Var, o1Var, cVar);
            if (w6 == 1) {
                return true;
            }
        } while (w6 != 2);
        return false;
    }

    public void s(Object obj) {
    }

    public final boolean start() {
        int e02;
        do {
            e02 = e0(L());
            if (e02 == 0) {
                return false;
            }
        } while (e02 != 1);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(pd.d<? super md.m> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.L()
            boolean r1 = r0 instanceof ge.b1
            r2 = 1
            if (r1 != 0) goto L_0x000b
            r0 = 0
            goto L_0x0012
        L_0x000b:
            int r0 = r3.e0(r0)
            if (r0 < 0) goto L_0x0000
            r0 = r2
        L_0x0012:
            if (r0 != 0) goto L_0x001e
            pd.f r4 = r4.getContext()
            ad.c.G(r4)
            md.m r4 = md.m.f8555a
            return r4
        L_0x001e:
            ge.l r0 = new ge.l
            pd.d r4 = ad.c.Y(r4)
            r0.<init>(r4, r2)
            r0.u()
            ge.t1 r4 = new ge.t1
            r4.<init>(r0)
            ge.q0 r4 = r3.Q(r4)
            y.c.w(r0, r4)
            java.lang.Object r4 = r0.t()
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            if (r4 != r0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            md.m r4 = md.m.f8555a
        L_0x0041:
            if (r4 != r0) goto L_0x0044
            return r4
        L_0x0044:
            md.m r4 = md.m.f8555a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.l1.t(pd.d):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(W() + MessageFormatter.DELIM_START + g0(L()) + MessageFormatter.DELIM_STOP);
        sb2.append('@');
        sb2.append(g0.o(this));
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ef, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00c5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u(java.lang.Object r10) {
        /*
            r9 = this;
            le.r r0 = a.b.f4c
            boolean r1 = r9.I()
            r2 = 1
            if (r1 == 0) goto L_0x0038
        L_0x0009:
            java.lang.Object r0 = r9.L()
            boolean r1 = r0 instanceof ge.b1
            if (r1 == 0) goto L_0x0031
            boolean r1 = r0 instanceof ge.l1.b
            if (r1 == 0) goto L_0x001f
            r1 = r0
            ge.l1$b r1 = (ge.l1.b) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x001f
            goto L_0x0031
        L_0x001f:
            ge.t r1 = new ge.t
            java.lang.Throwable r3 = r9.D(r10)
            r1.<init>(r3)
            java.lang.Object r0 = r9.i0(r0, r1)
            le.r r1 = a.b.f6t
            if (r0 == r1) goto L_0x0009
            goto L_0x0033
        L_0x0031:
            le.r r0 = a.b.f4c
        L_0x0033:
            le.r r1 = a.b.f5s
            if (r0 != r1) goto L_0x0038
            return r2
        L_0x0038:
            le.r r1 = a.b.f4c
            r3 = 0
            if (r0 != r1) goto L_0x00f0
            r0 = 0
            r1 = r0
        L_0x003f:
            java.lang.Object r4 = r9.L()
            boolean r5 = r4 instanceof ge.l1.b
            if (r5 == 0) goto L_0x008b
            monitor-enter(r4)
            r5 = r4
            ge.l1$b r5 = (ge.l1.b) r5     // Catch:{ all -> 0x0088 }
            boolean r5 = r5.h()     // Catch:{ all -> 0x0088 }
            if (r5 == 0) goto L_0x0056
            le.r r10 = a.b.f7u     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            goto L_0x00ef
        L_0x0056:
            r5 = r4
            ge.l1$b r5 = (ge.l1.b) r5     // Catch:{ all -> 0x0088 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0088 }
            if (r10 != 0) goto L_0x0061
            if (r5 != 0) goto L_0x006d
        L_0x0061:
            if (r1 != 0) goto L_0x0067
            java.lang.Throwable r1 = r9.D(r10)     // Catch:{ all -> 0x0088 }
        L_0x0067:
            r10 = r4
            ge.l1$b r10 = (ge.l1.b) r10     // Catch:{ all -> 0x0088 }
            r10.b(r1)     // Catch:{ all -> 0x0088 }
        L_0x006d:
            r10 = r4
            ge.l1$b r10 = (ge.l1.b) r10     // Catch:{ all -> 0x0088 }
            java.lang.Throwable r10 = r10.d()     // Catch:{ all -> 0x0088 }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x0079
            r0 = r10
        L_0x0079:
            monitor-exit(r4)
            if (r0 != 0) goto L_0x007d
            goto L_0x0084
        L_0x007d:
            ge.l1$b r4 = (ge.l1.b) r4
            ge.o1 r10 = r4.f5421a
            r9.Y(r10, r0)
        L_0x0084:
            le.r r10 = a.b.f4c
            goto L_0x00ef
        L_0x0088:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
        L_0x008b:
            boolean r5 = r4 instanceof ge.b1
            if (r5 == 0) goto L_0x00ed
            if (r1 != 0) goto L_0x0095
            java.lang.Throwable r1 = r9.D(r10)
        L_0x0095:
            r5 = r4
            ge.b1 r5 = (ge.b1) r5
            boolean r6 = r5.a()
            if (r6 == 0) goto L_0x00c8
            ge.o1 r6 = r9.J(r5)
            if (r6 != 0) goto L_0x00a5
            goto L_0x00bd
        L_0x00a5:
            ge.l1$b r7 = new ge.l1$b
            r7.<init>(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f5416a
        L_0x00ac:
            boolean r4 = r8.compareAndSet(r9, r5, r7)
            if (r4 == 0) goto L_0x00b4
            r4 = r2
            goto L_0x00bb
        L_0x00b4:
            java.lang.Object r4 = r8.get(r9)
            if (r4 == r5) goto L_0x00ac
            r4 = r3
        L_0x00bb:
            if (r4 != 0) goto L_0x00bf
        L_0x00bd:
            r4 = r3
            goto L_0x00c3
        L_0x00bf:
            r9.Y(r6, r1)
            r4 = r2
        L_0x00c3:
            if (r4 == 0) goto L_0x003f
            le.r r10 = a.b.f4c
            goto L_0x00ef
        L_0x00c8:
            ge.t r5 = new ge.t
            r5.<init>(r1)
            java.lang.Object r5 = r9.i0(r4, r5)
            le.r r6 = a.b.f4c
            if (r5 == r6) goto L_0x00dd
            le.r r4 = a.b.f6t
            if (r5 != r4) goto L_0x00db
            goto L_0x003f
        L_0x00db:
            r0 = r5
            goto L_0x00f0
        L_0x00dd:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = e6.e.a0(r0, r4)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00ed:
            le.r r10 = a.b.f7u
        L_0x00ef:
            r0 = r10
        L_0x00f0:
            le.r r10 = a.b.f4c
            if (r0 != r10) goto L_0x00f5
            goto L_0x0103
        L_0x00f5:
            le.r r10 = a.b.f5s
            if (r0 != r10) goto L_0x00fa
            goto L_0x0103
        L_0x00fa:
            le.r r10 = a.b.f7u
            if (r0 != r10) goto L_0x0100
            r2 = r3
            goto L_0x0103
        L_0x0100:
            r9.s(r0)
        L_0x0103:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.l1.u(java.lang.Object):boolean");
    }

    public void v(Throwable th2) {
        u(th2);
    }

    public final boolean x(Throwable th2) {
        if (U()) {
            return true;
        }
        boolean z = th2 instanceof CancellationException;
        o oVar = (o) this._parentHandle;
        if (oVar == null || oVar == p1.f5437a) {
            return z;
        }
        if (oVar.l(th2) || z) {
            return true;
        }
        return false;
    }

    public final ee.d<g1> y() {
        return new ee.h(new d(this, (pd.d<? super d>) null));
    }

    public String z() {
        return "Job was cancelled";
    }
}
