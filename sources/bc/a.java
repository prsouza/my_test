package bc;

import ge.d0;
import io.nodle.sdk.NodleContext;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

public abstract class a implements b {

    @e(c = "io.nodle.sdk.location.LocationEngine", f = "LocationSpi.kt", l = {32}, m = "getLocationFix$suspendImpl")
    /* renamed from: bc.a$a  reason: collision with other inner class name */
    public static final class C0032a extends c {

        /* renamed from: a  reason: collision with root package name */
        public f f2952a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f2953b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f2954c;

        /* renamed from: s  reason: collision with root package name */
        public int f2955s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0032a(a aVar, d<? super C0032a> dVar) {
            super(dVar);
            this.f2954c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2953b = obj;
            this.f2955s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.c(this.f2954c, (NodleContext) null, 0, (d0) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object c(bc.a r3, io.nodle.sdk.NodleContext r4, long r5, ge.d0 r7, pd.d r8) {
        /*
            boolean r7 = r8 instanceof bc.a.C0032a
            if (r7 == 0) goto L_0x0013
            r7 = r8
            bc.a$a r7 = (bc.a.C0032a) r7
            int r0 = r7.f2955s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r7.f2955s = r0
            goto L_0x0018
        L_0x0013:
            bc.a$a r7 = new bc.a$a
            r7.<init>(r3, r8)
        L_0x0018:
            java.lang.Object r8 = r7.f2953b
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r7.f2955s
            r2 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            bc.f r3 = r7.f2952a
            l6.b1.w(r8)
            goto L_0x0046
        L_0x0029:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0031:
            l6.b1.w(r8)
            bc.f r3 = r3.a(r4)
            if (r3 != 0) goto L_0x003b
            goto L_0x004c
        L_0x003b:
            r7.f2952a = r3
            r7.f2955s = r2
            java.lang.Object r4 = r3.b(r5, r7)
            if (r4 != r0) goto L_0x0046
            return r0
        L_0x0046:
            bc.i r4 = r3.a()
            if (r4 != 0) goto L_0x004e
        L_0x004c:
            r4 = 0
            goto L_0x0051
        L_0x004e:
            r3.stop()
        L_0x0051:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.a.c(bc.a, io.nodle.sdk.NodleContext, long, ge.d0, pd.d):java.lang.Object");
    }

    public final Object b(NodleContext nodleContext, long j10, d0 d0Var, d<? super i> dVar) {
        return c(this, nodleContext, j10, d0Var, dVar);
    }
}
