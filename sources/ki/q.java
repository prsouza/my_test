package ki;

import ad.c;
import l6.b1;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.e;

public final class q {

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f7619a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Exception f7620b;

        public a(d dVar, Exception exc) {
            this.f7619a = dVar;
            this.f7620b = exc;
        }

        public final void run() {
            c.Y(this.f7619a).resumeWith(b1.k(this.f7620b));
        }
    }

    @e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    public static final class b extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f7621a;

        /* renamed from: b  reason: collision with root package name */
        public int f7622b;

        /* renamed from: c  reason: collision with root package name */
        public Exception f7623c;

        public b(d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f7621a = obj;
            this.f7622b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return q.a((Exception) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.lang.Exception r4, pd.d<?> r5) {
        /*
            boolean r0 = r5 instanceof ki.q.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ki.q$b r0 = (ki.q.b) r0
            int r1 = r0.f7622b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7622b = r1
            goto L_0x0018
        L_0x0013:
            ki.q$b r0 = new ki.q$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f7621a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f7622b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            l6.b1.w(r5)
            md.m r4 = md.m.f8555a
            return r4
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            l6.b1.w(r5)
            r0.f7623c = r4
            r0.f7622b = r3
            me.c r5 = ge.o0.f5433a
            pd.f r2 = r0.getContext()
            ki.q$a r3 = new ki.q$a
            r3.<init>(r0, r4)
            r5.p0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.q.a(java.lang.Exception, pd.d):java.lang.Object");
    }
}
