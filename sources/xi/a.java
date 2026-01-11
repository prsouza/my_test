package xi;

import aa.b;
import bc.f;
import bc.i;
import ge.d0;
import ji.l;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pd.d;
import rd.c;
import rd.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f13296a;

    @e(c = "io.nodle.sdk.core.actions.location.FixKt", f = "fix.kt", l = {43}, m = "getLocationFix")
    /* renamed from: xi.a$a  reason: collision with other inner class name */
    public static final class C0255a extends c {

        /* renamed from: a  reason: collision with root package name */
        public oi.a f13297a;

        /* renamed from: b  reason: collision with root package name */
        public l f13298b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f13299c;

        /* renamed from: s  reason: collision with root package name */
        public int f13300s;

        public C0255a(d<? super C0255a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13299c = obj;
            this.f13300s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.b((oi.a) null, (d0) null, this);
        }
    }

    static {
        Logger logger = LoggerFactory.getLogger("Location");
        e6.e.C(logger, "getLogger(\"Location\")");
        f13296a = logger;
    }

    public static final long a(oi.a aVar) {
        e6.e.D(aVar, "<this>");
        return (long) ((Number) ((a9.c) aVar.f9450a.getSdkConfig()).a("location.fix-timeout-msec", Float.valueOf(15000.0f))).floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(oi.a r11, ge.d0 r12, pd.d<? super ji.l> r13) {
        /*
            boolean r0 = r13 instanceof xi.a.C0255a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            xi.a$a r0 = (xi.a.C0255a) r0
            int r1 = r0.f13300s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13300s = r1
            goto L_0x0018
        L_0x0013:
            xi.a$a r0 = new xi.a$a
            r0.<init>(r13)
        L_0x0018:
            r6 = r0
            java.lang.Object r13 = r6.f13299c
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r6.f13300s
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            ji.l r11 = r6.f13298b
            oi.a r12 = r6.f13297a
            l6.b1.w(r13)
            r10 = r13
            r13 = r11
            r11 = r12
            r12 = r10
            goto L_0x00b1
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            l6.b1.w(r13)
            ze.f r13 = r11.f9452c
            hf.f r13 = (hf.f) r13
            ze.d r13 = r13.d()
            ze.c r13 = r13.a()
            if (r13 != 0) goto L_0x004d
            r13 = r7
            goto L_0x0053
        L_0x004d:
            aj.f r13 = (aj.f) r13
            ji.l r13 = r13.a()
        L_0x0053:
            if (r13 != 0) goto L_0x0059
            ji.l r13 = aa.b.f()
        L_0x0059:
            long r3 = java.lang.System.currentTimeMillis()
            long r8 = r13.f7330s
            long r3 = r3 - r8
            io.nodle.sdk.NodleContext r1 = r11.f9450a
            m2.a r1 = r1.getSdkConfig()
            r5 = 1189765120(0x46ea6000, float:30000.0)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            a9.c r1 = (a9.c) r1
            java.lang.String r8 = "location.min-interval-msec"
            java.lang.Object r1 = r1.a(r8, r5)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            long r8 = (long) r1
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0090
            org.slf4j.Logger r11 = f13296a
            java.lang.String r12 = c(r13)
            java.lang.String r0 = "get saved location: "
            java.lang.String r12 = e6.e.a0(r0, r12)
            r11.debug(r12)
            return r13
        L_0x0090:
            org.slf4j.Logger r1 = f13296a
            java.lang.String r3 = "waiting for location fix..."
            r1.debug(r3)
            bc.b r1 = bc.g.b()
            io.nodle.sdk.NodleContext r3 = r11.f9450a
            long r4 = a(r11)
            r6.f13297a = r11
            r6.f13298b = r13
            r6.f13300s = r2
            r2 = r3
            r3 = r4
            r5 = r12
            java.lang.Object r12 = r1.b(r2, r3, r5, r6)
            if (r12 != r0) goto L_0x00b1
            return r0
        L_0x00b1:
            bc.i r12 = (bc.i) r12
            if (r12 != 0) goto L_0x00b6
            goto L_0x00e4
        L_0x00b6:
            ji.l r7 = aa.b.h(r12)
            org.slf4j.Logger r12 = f13296a
            java.lang.String r0 = c(r7)
            java.lang.String r1 = "fresh location: "
            java.lang.String r0 = e6.e.a0(r1, r0)
            r12.debug(r0)
            ze.f r12 = r11.f9452c
            hf.f r12 = (hf.f) r12
            ze.d r12 = r12.d()
            ze.f r11 = r11.f9452c
            hf.f r11 = (hf.f) r11
            md.h r11 = r11.f5955h
            java.lang.Object r11 = r11.a()
            hf.d r11 = (hf.d) r11
            ze.c r11 = r11.a(r7)
            r12.b(r11)
        L_0x00e4:
            if (r7 != 0) goto L_0x00f6
            org.slf4j.Logger r11 = f13296a
            java.lang.String r12 = c(r13)
            java.lang.String r0 = "location timeout, last known location: "
            java.lang.String r12 = e6.e.a0(r0, r12)
            r11.debug(r12)
            goto L_0x00f7
        L_0x00f6:
            r13 = r7
        L_0x00f7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: xi.a.b(oi.a, ge.d0, pd.d):java.lang.Object");
    }

    public static final String c(l lVar) {
        e6.e.D(lVar, "<this>");
        return '(' + lVar.f7331t + ", " + lVar.f7332u + ", " + lVar.f7333v + ", " + lVar.f7330s + ')';
    }

    public static final l d(oi.a aVar, f fVar) {
        l lVar;
        e6.e.D(fVar, "engine");
        i a10 = fVar.a();
        l lVar2 = null;
        if (a10 == null) {
            lVar = null;
        } else {
            lVar = b.h(a10);
            f13296a.debug(e6.e.a0("fresh location: ", c(lVar)));
            ((hf.f) aVar.f9452c).d().b(((hf.d) ((hf.f) aVar.f9452c).f5955h.a()).a(lVar));
        }
        if (lVar == null) {
            ze.c a11 = ((hf.f) aVar.f9452c).d().a();
            if (a11 != null) {
                lVar2 = ((aj.f) a11).a();
            }
            lVar = lVar2 == null ? b.f() : lVar2;
            f13296a.debug(e6.e.a0("last known location: ", c(lVar)));
        }
        return lVar;
    }
}
