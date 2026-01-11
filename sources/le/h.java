package le;

import e6.e;
import ge.g0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yd.m;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8246a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8247b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8248c;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends b<h> {

        /* renamed from: b  reason: collision with root package name */
        public final h f8249b;

        /* renamed from: c  reason: collision with root package name */
        public h f8250c;

        public a(h hVar) {
            this.f8249b = hVar;
        }

        public final void b(Object obj, Object obj2) {
            h hVar = (h) obj;
            boolean z = true;
            boolean z10 = obj2 == null;
            h hVar2 = z10 ? this.f8249b : this.f8250c;
            if (hVar2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f8246a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(hVar, this, hVar2)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != this) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z && z10) {
                    h hVar3 = this.f8249b;
                    h hVar4 = this.f8250c;
                    e.B(hVar4);
                    hVar3.n(hVar4);
                }
            }
        }
    }

    public /* synthetic */ class b extends m {
        public b(Object obj) {
            super(obj);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<h> cls2 = h.class;
        f8246a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f8247b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f8248c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    public final boolean i(h hVar, h hVar2) {
        boolean z;
        f8247b.lazySet(hVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8246a;
        atomicReferenceFieldUpdater.lazySet(hVar, hVar2);
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, hVar2, hVar)) {
                if (atomicReferenceFieldUpdater.get(this) != hVar2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return false;
        }
        hVar.n(hVar2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r7 = f8246a;
        r4 = ((le.o) r4).f8263a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r7.compareAndSet(r3, r2, r4) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r7.get(r3) == r2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5 != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final le.h m() {
        /*
            r10 = this;
        L_0x0000:
            java.lang.Object r0 = r10._prev
            le.h r0 = (le.h) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L_0x0024
            if (r0 != r2) goto L_0x0010
            return r2
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f8247b
        L_0x0012:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L_0x001a
            r5 = r6
            goto L_0x0020
        L_0x001a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L_0x0012
        L_0x0020:
            if (r5 != 0) goto L_0x0023
            goto L_0x0000
        L_0x0023:
            return r2
        L_0x0024:
            boolean r7 = r10.t()
            if (r7 == 0) goto L_0x002b
            return r1
        L_0x002b:
            if (r4 != 0) goto L_0x002e
            return r2
        L_0x002e:
            boolean r7 = r4 instanceof le.n
            if (r7 == 0) goto L_0x0038
            le.n r4 = (le.n) r4
            r4.a(r2)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r4 instanceof le.o
            if (r7 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f8246a
            le.o r4 = (le.o) r4
            le.h r4 = r4.f8263a
        L_0x0044:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L_0x004c
            r5 = r6
            goto L_0x0052
        L_0x004c:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L_0x0044
        L_0x0052:
            if (r5 != 0) goto L_0x0055
            goto L_0x0000
        L_0x0055:
            r2 = r3
            goto L_0x0006
        L_0x0057:
            java.lang.Object r2 = r2._prev
            le.h r2 = (le.h) r2
            goto L_0x0007
        L_0x005c:
            r3 = r4
            le.h r3 = (le.h) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: le.h.m():le.h");
    }

    public final void n(h hVar) {
        boolean z;
        do {
            h hVar2 = (h) hVar._prev;
            if (o() == hVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8247b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(hVar, hVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != hVar2) {
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
                return;
            }
        } while (!z);
        if (t()) {
            hVar.m();
        }
    }

    public final Object o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public final h p() {
        Object o4 = o();
        h hVar = null;
        o oVar = o4 instanceof o ? (o) o4 : null;
        if (oVar != null) {
            hVar = oVar.f8263a;
        }
        return hVar == null ? (h) o4 : hVar;
    }

    public final h q() {
        h m10 = m();
        if (m10 == null) {
            Object obj = this._prev;
            while (true) {
                m10 = (h) obj;
                if (!m10.t()) {
                    break;
                }
                obj = m10._prev;
            }
        }
        return m10;
    }

    public final void r() {
        ((o) o()).f8263a.s();
    }

    public final void s() {
        h hVar = this;
        while (true) {
            Object o4 = hVar.o();
            if (!(o4 instanceof o)) {
                hVar.m();
                return;
            }
            hVar = ((o) o4).f8263a;
        }
    }

    public boolean t() {
        return o() instanceof o;
    }

    public String toString() {
        return new b(this) + '@' + g0.o(this);
    }

    public boolean u() {
        return v() == null;
    }

    public final h v() {
        h hVar;
        boolean z;
        do {
            Object o4 = o();
            if (!(o4 instanceof o)) {
                if (o4 != this) {
                    hVar = (h) o4;
                    o oVar = (o) hVar._removedRef;
                    if (oVar == null) {
                        oVar = new o(hVar);
                        f8248c.lazySet(hVar, oVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8246a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, o4, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != o4) {
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
                    return (h) o4;
                }
            } else {
                return ((o) o4).f8263a;
            }
        } while (!z);
        hVar.m();
        return null;
    }

    public final int w(h hVar, h hVar2, a aVar) {
        boolean z;
        f8247b.lazySet(hVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8246a;
        atomicReferenceFieldUpdater.lazySet(hVar, hVar2);
        aVar.f8250c = hVar2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, hVar2, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != hVar2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }
}
