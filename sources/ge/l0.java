package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import le.q;
import pd.d;
import pd.f;

public final class l0<T> extends q<T> {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5415s = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public l0(f fVar, d<? super T> dVar) {
        super(fVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k0(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f5415s
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            pd.d<T> r0 = r4.f8264c
            pd.d r0 = ad.c.Y(r0)
            java.lang.Object r5 = ad.c.j0(r5)
            r1 = 0
            aa.b.e0(r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.l0.k0(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n0() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f5415s
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.L()
            java.lang.Object r0 = a.b.R0(r0)
            boolean r1 = r0 instanceof ge.t
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            ge.t r0 = (ge.t) r0
            java.lang.Throwable r0 = r0.f5447a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.l0.n0():java.lang.Object");
    }

    public final void s(Object obj) {
        k0(obj);
    }
}
