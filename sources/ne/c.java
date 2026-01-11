package ne;

import e6.e;
import ge.g0;
import ge.k;
import ge.q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.g;
import le.n;
import md.m;
import xd.l;
import yd.h;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8975a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    public final class a extends b {

        /* renamed from: u  reason: collision with root package name */
        public final k<m> f8976u;

        /* renamed from: ne.c$a$a  reason: collision with other inner class name */
        public static final class C0170a extends h implements l<Throwable, m> {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ c f8978b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f8979c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0170a(c cVar, a aVar) {
                super(1);
                this.f8978b = cVar;
                this.f8979c = aVar;
            }

            public final Object k(Object obj) {
                Throwable th2 = (Throwable) obj;
                this.f8978b.a(this.f8979c.f8981s);
                return m.f8555a;
            }
        }

        public a(Object obj, k<? super m> kVar) {
            super(obj);
            this.f8976u = kVar;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("LockCont[");
            d10.append(this.f8981s);
            d10.append(", ");
            d10.append(this.f8976u);
            d10.append("] for ");
            d10.append(c.this);
            return d10.toString();
        }

        public final void x() {
            this.f8976u.d();
        }

        public final boolean y() {
            if (b.f8980t.compareAndSet(this, 0, 1) && this.f8976u.q(m.f8555a, new C0170a(c.this, this)) != null) {
                return true;
            }
            return false;
        }
    }

    public abstract class b extends le.h implements q0 {

        /* renamed from: t  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f8980t = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: s  reason: collision with root package name */
        public final Object f8981s;

        public b(Object obj) {
            this.f8981s = obj;
        }

        public final void e() {
            u();
        }

        public abstract void x();

        public abstract boolean y();
    }

    /* renamed from: ne.c$c  reason: collision with other inner class name */
    public static final class C0171c extends g {

        /* renamed from: s  reason: collision with root package name */
        public Object f8982s;

        public C0171c(Object obj) {
            this.f8982s = obj;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("LockedQueue[");
            d10.append(this.f8982s);
            d10.append(']');
            return d10.toString();
        }
    }

    public static final class d extends le.b<c> {

        /* renamed from: b  reason: collision with root package name */
        public final C0171c f8983b;

        public d(C0171c cVar) {
            this.f8983b = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:5:0x000b A[LOOP:0: B:5:0x000b->B:8:0x0016, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                ne.c r3 = (ne.c) r3
                if (r4 != 0) goto L_0x0007
                ne.a r4 = ge.g0.f5397w
                goto L_0x0009
            L_0x0007:
                ne.c$c r4 = r2.f8983b
            L_0x0009:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ne.c.f8975a
            L_0x000b:
                boolean r1 = r0.compareAndSet(r3, r2, r4)
                if (r1 == 0) goto L_0x0012
                goto L_0x0018
            L_0x0012:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == r2) goto L_0x000b
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ne.c.d.b(java.lang.Object, java.lang.Object):void");
        }

        public final Object c(Object obj) {
            c cVar = (c) obj;
            C0171c cVar2 = this.f8983b;
            if (cVar2.o() == cVar2) {
                return null;
            }
            return g0.f5393s;
        }
    }

    public c(boolean z) {
        this._state = z ? g0.f5396v : g0.f5397w;
    }

    public final void a(Object obj) {
        le.h hVar;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof a) {
                if (obj == null) {
                    if (!(((a) obj2).f8974a != g0.f5395u)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    a aVar = (a) obj2;
                    if (!(aVar.f8974a == obj)) {
                        StringBuilder d10 = a.a.d("Mutex is locked by ");
                        d10.append(aVar.f8974a);
                        d10.append(" but expected ");
                        d10.append(obj);
                        throw new IllegalStateException(d10.toString().toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8975a;
                a aVar2 = g0.f5397w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else if (obj2 instanceof n) {
                ((n) obj2).a(this);
            } else if (obj2 instanceof C0171c) {
                if (obj != null) {
                    C0171c cVar = (C0171c) obj2;
                    if (!(cVar.f8982s == obj)) {
                        StringBuilder d11 = a.a.d("Mutex is locked by ");
                        d11.append(cVar.f8982s);
                        d11.append(" but expected ");
                        d11.append(obj);
                        throw new IllegalStateException(d11.toString().toString());
                    }
                }
                C0171c cVar2 = (C0171c) obj2;
                while (true) {
                    hVar = (le.h) cVar2.o();
                    if (hVar == cVar2) {
                        hVar = null;
                        break;
                    } else if (hVar.u()) {
                        break;
                    } else {
                        hVar.r();
                    }
                }
                if (hVar == null) {
                    d dVar = new d(cVar2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8975a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, dVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z && dVar.a(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) hVar;
                    if (bVar.y()) {
                        Object obj3 = bVar.f8981s;
                        if (obj3 == null) {
                            obj3 = g0.f5394t;
                        }
                        cVar2.f8982s = obj3;
                        bVar.x();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(e.a0("Illegal state ", obj2).toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[LOOP:3: B:33:0x0070->B:36:0x007b, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.Object r10, pd.d<? super md.m> r11) {
        /*
            r9 = this;
        L_0x0000:
            java.lang.Object r0 = r9._state
            boolean r1 = r0 instanceof ne.a
            java.lang.String r2 = "Already locked by "
            java.lang.String r3 = "Illegal state "
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0036
            r1 = r0
            ne.a r1 = (ne.a) r1
            java.lang.Object r1 = r1.f8974a
            le.r r6 = ge.g0.f5395u
            if (r1 == r6) goto L_0x0017
        L_0x0015:
            r0 = r4
            goto L_0x0046
        L_0x0017:
            if (r10 != 0) goto L_0x001c
            ne.a r1 = ge.g0.f5396v
            goto L_0x0021
        L_0x001c:
            ne.a r1 = new ne.a
            r1.<init>(r10)
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f8975a
        L_0x0023:
            boolean r7 = r6.compareAndSet(r9, r0, r1)
            if (r7 == 0) goto L_0x002b
            r0 = r5
            goto L_0x0032
        L_0x002b:
            java.lang.Object r7 = r6.get(r9)
            if (r7 == r0) goto L_0x0023
            r0 = r4
        L_0x0032:
            if (r0 == 0) goto L_0x0000
            r0 = r5
            goto L_0x0046
        L_0x0036:
            boolean r1 = r0 instanceof ne.c.C0171c
            if (r1 == 0) goto L_0x0121
            ne.c$c r0 = (ne.c.C0171c) r0
            java.lang.Object r0 = r0.f8982s
            if (r0 == r10) goto L_0x0042
            r0 = r5
            goto L_0x0043
        L_0x0042:
            r0 = r4
        L_0x0043:
            if (r0 == 0) goto L_0x0113
            goto L_0x0015
        L_0x0046:
            if (r0 == 0) goto L_0x004b
            md.m r10 = md.m.f8555a
            return r10
        L_0x004b:
            pd.d r11 = ad.c.Y(r11)
            ge.l r11 = y.c.E(r11)
            ne.c$a r0 = new ne.c$a
            r0.<init>(r10, r11)
        L_0x0058:
            java.lang.Object r1 = r9._state
            boolean r6 = r1 instanceof ne.a
            if (r6 == 0) goto L_0x00a6
            r6 = r1
            ne.a r6 = (ne.a) r6
            java.lang.Object r7 = r6.f8974a
            le.r r8 = ge.g0.f5395u
            if (r7 == r8) goto L_0x007e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f8975a
            ne.c$c r8 = new ne.c$c
            java.lang.Object r6 = r6.f8974a
            r8.<init>(r6)
        L_0x0070:
            boolean r6 = r7.compareAndSet(r9, r1, r8)
            if (r6 == 0) goto L_0x0077
            goto L_0x0058
        L_0x0077:
            java.lang.Object r6 = r7.get(r9)
            if (r6 == r1) goto L_0x0070
            goto L_0x0058
        L_0x007e:
            if (r10 != 0) goto L_0x0083
            ne.a r6 = ge.g0.f5396v
            goto L_0x0088
        L_0x0083:
            ne.a r6 = new ne.a
            r6.<init>(r10)
        L_0x0088:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f8975a
        L_0x008a:
            boolean r8 = r7.compareAndSet(r9, r1, r6)
            if (r8 == 0) goto L_0x0092
            r1 = r5
            goto L_0x0099
        L_0x0092:
            java.lang.Object r8 = r7.get(r9)
            if (r8 == r1) goto L_0x008a
            r1 = r4
        L_0x0099:
            if (r1 == 0) goto L_0x0058
            md.m r0 = md.m.f8555a
            ne.d r1 = new ne.d
            r1.<init>(r9, r10)
            r11.o(r0, r1)
            goto L_0x00db
        L_0x00a6:
            boolean r6 = r1 instanceof ne.c.C0171c
            if (r6 == 0) goto L_0x00fa
            r6 = r1
            ne.c$c r6 = (ne.c.C0171c) r6
            java.lang.Object r7 = r6.f8982s
            if (r7 == r10) goto L_0x00b3
            r7 = r5
            goto L_0x00b4
        L_0x00b3:
            r7 = r4
        L_0x00b4:
            if (r7 == 0) goto L_0x00ec
        L_0x00b6:
            le.h r7 = r6.q()
            boolean r7 = r7.i(r0, r6)
            if (r7 == 0) goto L_0x00b6
            java.lang.Object r6 = r9._state
            if (r6 == r1) goto L_0x00d3
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = ne.c.b.f8980t
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 != 0) goto L_0x00cd
            goto L_0x00d3
        L_0x00cd:
            ne.c$a r0 = new ne.c$a
            r0.<init>(r10, r11)
            goto L_0x0058
        L_0x00d3:
            ge.s1 r10 = new ge.s1
            r10.<init>(r0)
            r11.i(r10)
        L_0x00db:
            java.lang.Object r10 = r11.t()
            qd.a r11 = qd.a.COROUTINE_SUSPENDED
            if (r10 != r11) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            md.m r10 = md.m.f8555a
        L_0x00e6:
            if (r10 != r11) goto L_0x00e9
            return r10
        L_0x00e9:
            md.m r10 = md.m.f8555a
            return r10
        L_0x00ec:
            java.lang.String r10 = e6.e.a0(r2, r10)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L_0x00fa:
            boolean r6 = r1 instanceof le.n
            if (r6 == 0) goto L_0x0105
            le.n r1 = (le.n) r1
            r1.a(r9)
            goto L_0x0058
        L_0x0105:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = e6.e.a0(r3, r1)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0113:
            java.lang.String r10 = e6.e.a0(r2, r10)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L_0x0121:
            boolean r1 = r0 instanceof le.n
            if (r1 == 0) goto L_0x012c
            le.n r0 = (le.n) r0
            r0.a(r9)
            goto L_0x0000
        L_0x012c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = e6.e.a0(r3, r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.c.b(java.lang.Object, pd.d):java.lang.Object");
    }

    public final boolean c() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof a) {
                return ((a) obj).f8974a != g0.f5395u;
            }
            if (obj instanceof C0171c) {
                return true;
            }
            if (obj instanceof n) {
                ((n) obj).a(this);
            } else {
                throw new IllegalStateException(e.a0("Illegal state ", obj).toString());
            }
        }
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof a) {
                StringBuilder d10 = a.a.d("Mutex[");
                d10.append(((a) obj).f8974a);
                d10.append(']');
                return d10.toString();
            } else if (obj instanceof n) {
                ((n) obj).a(this);
            } else if (obj instanceof C0171c) {
                StringBuilder d11 = a.a.d("Mutex[");
                d11.append(((C0171c) obj).f8982s);
                d11.append(']');
                return d11.toString();
            } else {
                throw new IllegalStateException(e.a0("Illegal state ", obj).toString());
            }
        }
    }
}
