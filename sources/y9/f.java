package y9;

import io.nodle.sdk.NodleContext;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;
import xd.q;

public final class f {

    @e(c = "io.nodle.sdk.android.bluetooth.scanner.BluetoothScannerKt", f = "BluetoothScanner.kt", l = {29}, m = "doScanCycle")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public e f13566a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f13567b;

        /* renamed from: c  reason: collision with root package name */
        public int f13568c;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13567b = obj;
            this.f13568c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return f.a((NodleContext) null, 0, (q<? super di.a, ? super Integer, ? super di.c, m>) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(io.nodle.sdk.NodleContext r4, long r5, xd.q<? super di.a, ? super java.lang.Integer, ? super di.c, md.m> r7, pd.d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof y9.f.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            y9.f$a r0 = (y9.f.a) r0
            int r1 = r0.f13568c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13568c = r1
            goto L_0x0018
        L_0x0013:
            y9.f$a r0 = new y9.f$a
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f13567b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f13568c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            y9.e r4 = r0.f13566a
            l6.b1.w(r8)     // Catch:{ all -> 0x0055 }
            goto L_0x004f
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            l6.b1.w(r8)
            y9.d r8 = new y9.d     // Catch:{ Exception -> 0x003e }
            r8.<init>()     // Catch:{ Exception -> 0x003e }
            y9.e r4 = r8.a(r4, r7)     // Catch:{ Exception -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            if (r4 != 0) goto L_0x0044
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0044:
            r0.f13566a = r4     // Catch:{ all -> 0x0055 }
            r0.f13568c = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r5 = c3.k.f0(r5, r0)     // Catch:{ all -> 0x0055 }
            if (r5 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4.stop()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L_0x0055:
            r5 = move-exception
            r4.stop()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.f.a(io.nodle.sdk.NodleContext, long, xd.q, pd.d):java.lang.Object");
    }
}
