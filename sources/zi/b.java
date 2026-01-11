package zi;

import java.util.Iterator;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

public final class b {

    @e(c = "io.nodle.sdk.core.actions.sync.CheckOffloadKt", f = "checkOffload.kt", l = {21, 22}, m = "checkStorageToResumeTransmission")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public oi.a f14484a;

        /* renamed from: b  reason: collision with root package name */
        public Iterator f14485b;

        /* renamed from: c  reason: collision with root package name */
        public si.a f14486c;

        /* renamed from: s  reason: collision with root package name */
        public si.a f14487s;

        /* renamed from: t  reason: collision with root package name */
        public /* synthetic */ Object f14488t;

        /* renamed from: u  reason: collision with root package name */
        public int f14489u;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14488t = obj;
            this.f14489u |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return b.a((oi.a) null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1 A[SYNTHETIC] */
    public static final java.lang.Object a(oi.a r12, pd.d<? super md.m> r13) {
        /*
            boolean r0 = r13 instanceof zi.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            zi.b$a r0 = (zi.b.a) r0
            int r1 = r0.f14489u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14489u = r1
            goto L_0x0018
        L_0x0013:
            zi.b$a r0 = new zi.b$a
            r0.<init>(r13)
        L_0x0018:
            java.lang.Object r13 = r0.f14488t
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14489u
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0047
            if (r2 == r3) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.util.Iterator r12 = r0.f14485b
            oi.a r2 = r0.f14484a
            l6.b1.w(r13)
            goto L_0x006b
        L_0x002e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0036:
            si.a r12 = r0.f14487s
            si.a r2 = r0.f14486c
            java.util.Iterator r5 = r0.f14485b
            oi.a r6 = r0.f14484a
            l6.b1.w(r13)
            r11 = r12
            r13 = r2
            r12 = r5
            r2 = r6
            goto L_0x00cd
        L_0x0047:
            l6.b1.w(r13)
            ze.f r13 = r12.f9452c
            hf.f r13 = (hf.f) r13
            ze.b r13 = r13.b()
            long r5 = java.lang.System.currentTimeMillis()
            r13.d(r5)
            ze.f r13 = r12.f9452c
            hf.f r13 = (hf.f) r13
            ze.b r13 = r13.b()
            java.util.List r13 = r13.a()
            java.util.Iterator r13 = r13.iterator()
            r2 = r12
            r12 = r13
        L_0x006b:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00e1
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            pd.f r5 = r0.getContext()
            ad.c.G(r5)
            ze.f r5 = r2.f9452c
            hf.f r5 = (hf.f) r5
            ze.b r5 = r5.b()
            ze.a r13 = r5.c(r13)
            if (r13 != 0) goto L_0x008d
            goto L_0x006b
        L_0x008d:
            si.a r11 = new si.a
            aj.c r13 = (aj.c) r13
            xe.f r6 = r13.f669k
            long r7 = r13.i
            java.util.List<java.lang.String> r5 = r13.g
            java.util.List r9 = nd.m.l1(r5)
            java.util.List<java.lang.String> r13 = r13.f667h
            java.util.List r10 = nd.m.l1(r13)
            r5 = r11
            r5.<init>(r6, r7, r9, r10)
            java.util.List<java.lang.String> r13 = r11.f11151d
            java.lang.String r5 = "origin_storage"
            r13.add(r5)
            org.slf4j.Logger r13 = r2.f9458k
            java.lang.String r5 = "bundle:"
            java.lang.StringBuilder r5 = a.b.q(r5)
            java.lang.String r6 = " - resume forwarding this bundle"
            c3.k.w(r11, r5, r6, r13)
            c.c r13 = r2.f9454e
            r0.f14484a = r2
            r0.f14485b = r12
            r0.f14486c = r11
            r0.f14487s = r11
            r0.f14489u = r3
            java.lang.Object r13 = jd.a.c(r13, r11, r0)
            if (r13 != r1) goto L_0x00cc
            return r1
        L_0x00cc:
            r13 = r11
        L_0x00cd:
            c.c r5 = r2.f9454e
            r0.f14484a = r2
            r0.f14485b = r12
            r0.f14486c = r13
            r13 = 0
            r0.f14487s = r13
            r0.f14489u = r4
            java.lang.Object r13 = r5.a(r11, r0)
            if (r13 != r1) goto L_0x006b
            return r1
        L_0x00e1:
            md.m r12 = md.m.f8555a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.b.a(oi.a, pd.d):java.lang.Object");
    }
}
