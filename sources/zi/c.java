package zi;

import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.e;

public final class c {

    @e(c = "io.nodle.sdk.core.actions.sync.CheckSyncKt", f = "checkSync.kt", l = {21, 22}, m = "syncBundles")
    public static final class a extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public oi.a f14490a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f14491b;

        /* renamed from: c  reason: collision with root package name */
        public int f14492c;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14491b = obj;
            this.f14492c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return c.a((oi.a) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(oi.a r5, pd.d<? super md.m> r6) {
        /*
            boolean r0 = r6 instanceof zi.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            zi.c$a r0 = (zi.c.a) r0
            int r1 = r0.f14492c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14492c = r1
            goto L_0x0018
        L_0x0013:
            zi.c$a r0 = new zi.c$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f14491b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14492c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            l6.b1.w(r6)
            goto L_0x0052
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            oi.a r5 = r0.f14490a
            l6.b1.w(r6)
            goto L_0x0046
        L_0x0038:
            l6.b1.w(r6)
            r0.f14490a = r5
            r0.f14492c = r4
            java.lang.Object r6 = zi.a.b(r5, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r6 = 0
            r0.f14490a = r6
            r0.f14492c = r3
            java.lang.Object r5 = zi.b.a(r5, r0)
            if (r5 != r1) goto L_0x0052
            return r1
        L_0x0052:
            md.m r5 = md.m.f8555a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.c.a(oi.a, pd.d):java.lang.Object");
    }
}
