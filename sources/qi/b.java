package qi;

import bc.f;
import di.a;
import di.c;
import ge.d0;
import java.util.HashSet;
import java.util.List;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.sdk.core.actions.blescan.BlePassKt$getListOfBleRecords$2$1$1", f = "BlePass.kt", l = {283, 181}, m = "invokeSuspend")
public final class b extends i implements p<d0, d<? super m>, Object> {
    public int A;
    public final /* synthetic */ a B;
    public final /* synthetic */ c C;
    public final /* synthetic */ ne.b D;
    public final /* synthetic */ HashSet<String> E;
    public final /* synthetic */ oi.a F;
    public final /* synthetic */ f G;
    public final /* synthetic */ int H;
    public final /* synthetic */ List<c> I;

    /* renamed from: a  reason: collision with root package name */
    public String f10488a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f10489b;

    /* renamed from: c  reason: collision with root package name */
    public ne.b f10490c;

    /* renamed from: s  reason: collision with root package name */
    public Object f10491s;

    /* renamed from: t  reason: collision with root package name */
    public Object f10492t;

    /* renamed from: u  reason: collision with root package name */
    public Object f10493u;

    /* renamed from: v  reason: collision with root package name */
    public Object f10494v;

    /* renamed from: w  reason: collision with root package name */
    public c f10495w;

    /* renamed from: x  reason: collision with root package name */
    public List f10496x;

    /* renamed from: y  reason: collision with root package name */
    public long f10497y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, c cVar, ne.b bVar, HashSet<String> hashSet, oi.a aVar2, f fVar, int i, List<c> list, d<? super b> dVar) {
        super(2, dVar);
        this.B = aVar;
        this.C = cVar;
        this.D = bVar;
        this.E = hashSet;
        this.F = aVar2;
        this.G = fVar;
        this.H = i;
        this.I = list;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: type inference failed for: r9v13, types: [yb.b, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015b A[Catch:{ all -> 0x01d8, all -> 0x01d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015d A[Catch:{ all -> 0x01d8, all -> 0x01d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ae A[Catch:{ all -> 0x01d8, all -> 0x01d5 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r2 = r1.A
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0069
            if (r2 == r5) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            int r0 = r1.z
            long r2 = r1.f10497y
            java.lang.Object r5 = r1.f10494v
            ji.l r5 = (ji.l) r5
            java.lang.Object r6 = r1.f10493u
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.f10492t
            di.c r7 = (di.c) r7
            java.lang.Object r8 = r1.f10491s
            di.a r8 = (di.a) r8
            ne.b r9 = r1.f10490c
            byte[] r10 = r1.f10489b
            java.lang.String r11 = r1.f10488a
            l6.b1.w(r19)     // Catch:{ all -> 0x002e }
            goto L_0x013d
        L_0x002e:
            r0 = move-exception
            goto L_0x01f1
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0039:
            int r2 = r1.z
            long r5 = r1.f10497y
            java.util.List r7 = r1.f10496x
            di.c r8 = r1.f10495w
            java.lang.Object r9 = r1.f10494v
            di.a r9 = (di.a) r9
            java.lang.Object r10 = r1.f10493u
            bc.f r10 = (bc.f) r10
            java.lang.Object r11 = r1.f10492t
            oi.a r11 = (oi.a) r11
            java.lang.Object r12 = r1.f10491s
            java.util.HashSet r12 = (java.util.HashSet) r12
            ne.b r13 = r1.f10490c
            byte[] r14 = r1.f10489b
            java.lang.String r15 = r1.f10488a
            l6.b1.w(r19)
            r17 = r14
            r14 = r2
            r2 = r5
            r6 = r7
            r7 = r8
            r8 = r9
            r5 = r10
            r9 = r13
            r10 = r17
            r13 = r12
            r12 = r11
            r11 = r15
            goto L_0x00bf
        L_0x0069:
            l6.b1.w(r19)
            di.a r2 = r1.B
            java.lang.String r2 = r2.a()
            di.c r6 = r1.C
            byte[] r6 = r6.b()
            if (r6 != 0) goto L_0x007c
            r6 = r4
            goto L_0x0080
        L_0x007c:
            byte[] r6 = bf.c.c(r6)
        L_0x0080:
            long r7 = java.lang.System.currentTimeMillis()
            ne.b r9 = r1.D
            java.util.HashSet<java.lang.String> r12 = r1.E
            oi.a r11 = r1.F
            bc.f r10 = r1.G
            di.a r13 = r1.B
            int r14 = r1.H
            di.c r15 = r1.C
            java.util.List<qi.c> r3 = r1.I
            r1.f10488a = r2
            r1.f10489b = r6
            r1.f10490c = r9
            r1.f10491s = r12
            r1.f10492t = r11
            r1.f10493u = r10
            r1.f10494v = r13
            r1.f10495w = r15
            r1.f10496x = r3
            r1.f10497y = r7
            r1.z = r14
            r1.A = r5
            java.lang.Object r5 = r9.b(r4, r1)
            if (r5 != r0) goto L_0x00b3
            return r0
        L_0x00b3:
            r5 = r10
            r10 = r6
            r6 = r3
            r17 = r11
            r11 = r2
            r2 = r7
            r8 = r13
            r7 = r15
            r13 = r12
            r12 = r17
        L_0x00bf:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ef }
            r15.<init>()     // Catch:{ all -> 0x01ef }
            r15.append(r11)     // Catch:{ all -> 0x01ef }
            if (r10 != 0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            bf.c$a r4 = bf.c.a.f3000b     // Catch:{ all -> 0x01eb }
            java.lang.String r4 = nd.f.M(r10, r4)     // Catch:{ all -> 0x01eb }
        L_0x00d0:
            r15.append(r4)     // Catch:{ all -> 0x01e8 }
            r4 = 10000(0x2710, float:1.4013E-41)
            r19 = r9
            r16 = r10
            long r9 = (long) r4
            long r9 = r2 / r9
            r15.append(r9)     // Catch:{ all -> 0x01e4 }
            java.lang.String r4 = r15.toString()     // Catch:{ all -> 0x01e4 }
            boolean r4 = r13.add(r4)     // Catch:{ all -> 0x01e4 }
            if (r4 == 0) goto L_0x01da
            ze.f r4 = r12.f9452c     // Catch:{ all -> 0x01e4 }
            hf.f r4 = (hf.f) r4     // Catch:{ all -> 0x01e4 }
            ze.e r4 = r4.e()     // Catch:{ all -> 0x01e4 }
            io.nodle.sdk.SdkMetricType r9 = io.nodle.sdk.SdkMetricType.BleScanCount     // Catch:{ all -> 0x01e4 }
            int r9 = r9.getId()     // Catch:{ all -> 0x01e4 }
            r4.d(r9)     // Catch:{ all -> 0x01e4 }
            ji.l r5 = xi.a.d(r12, r5)     // Catch:{ all -> 0x01e4 }
            je.h<xb.b> r4 = r12.f9457j     // Catch:{ all -> 0x01e4 }
            yb.b r9 = new yb.b     // Catch:{ all -> 0x01e4 }
            java.lang.String r10 = r8.a()     // Catch:{ all -> 0x01e4 }
            r7.b()     // Catch:{ all -> 0x01e4 }
            java.util.Map r12 = r7.c()     // Catch:{ all -> 0x01e4 }
            java.util.List r13 = r7.a()     // Catch:{ all -> 0x01e4 }
            xb.c r15 = xb.c.BlePayloadEvent     // Catch:{ all -> 0x01e4 }
            r9.<init>(r10, r12, r13, r15)     // Catch:{ all -> 0x01e4 }
            r1.f10488a = r11     // Catch:{ all -> 0x01e4 }
            r10 = r16
            r1.f10489b = r10     // Catch:{ all -> 0x01e4 }
            r13 = r19
            r1.f10490c = r13     // Catch:{ all -> 0x01d8 }
            r1.f10491s = r8     // Catch:{ all -> 0x01d8 }
            r1.f10492t = r7     // Catch:{ all -> 0x01d8 }
            r1.f10493u = r6     // Catch:{ all -> 0x01d8 }
            r1.f10494v = r5     // Catch:{ all -> 0x01d8 }
            r12 = 0
            r1.f10495w = r12     // Catch:{ all -> 0x01d8 }
            r1.f10496x = r12     // Catch:{ all -> 0x01d8 }
            r1.f10497y = r2     // Catch:{ all -> 0x01d8 }
            r1.z = r14     // Catch:{ all -> 0x01d8 }
            r12 = 2
            r1.A = r12     // Catch:{ all -> 0x01d8 }
            java.lang.Object r4 = r4.a(r9, r1)     // Catch:{ all -> 0x01d8 }
            if (r4 != r0) goto L_0x013b
            return r0
        L_0x013b:
            r9 = r13
            r0 = r14
        L_0x013d:
            org.slf4j.Logger r4 = qi.a.f10453a     // Catch:{ all -> 0x01d5 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d5 }
            r12.<init>()     // Catch:{ all -> 0x01d5 }
            java.lang.String r13 = "scanned item: "
            r12.append(r13)     // Catch:{ all -> 0x01d5 }
            java.lang.String r13 = r8.a()     // Catch:{ all -> 0x01d5 }
            r12.append(r13)     // Catch:{ all -> 0x01d5 }
            java.lang.String r13 = " - "
            r12.append(r13)     // Catch:{ all -> 0x01d5 }
            byte[] r13 = r7.b()     // Catch:{ all -> 0x01d5 }
            if (r13 != 0) goto L_0x015d
            r13 = 0
            goto L_0x0167
        L_0x015d:
            byte[] r13 = bf.c.c(r13)     // Catch:{ all -> 0x01d5 }
            bf.c$a r14 = bf.c.a.f3000b     // Catch:{ all -> 0x01d5 }
            java.lang.String r13 = nd.f.M(r13, r14)     // Catch:{ all -> 0x01d5 }
        L_0x0167:
            r12.append(r13)     // Catch:{ all -> 0x01d5 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01d5 }
            r4.debug(r12)     // Catch:{ all -> 0x01d5 }
            qi.c r4 = new qi.c     // Catch:{ all -> 0x01d5 }
            ji.c r12 = ji.c.f7274x     // Catch:{ all -> 0x01d5 }
            zb.r$a r12 = r12.c()     // Catch:{ all -> 0x01d5 }
            ji.c$a r12 = (ji.c.a) r12     // Catch:{ all -> 0x01d5 }
            r12.k()     // Catch:{ all -> 0x01d5 }
            MessageType r13 = r12.f14359b     // Catch:{ all -> 0x01d5 }
            ji.c r13 = (ji.c) r13     // Catch:{ all -> 0x01d5 }
            r13.f7276s = r2     // Catch:{ all -> 0x01d5 }
            r12.k()     // Catch:{ all -> 0x01d5 }
            MessageType r2 = r12.f14359b     // Catch:{ all -> 0x01d5 }
            ji.c r2 = (ji.c) r2     // Catch:{ all -> 0x01d5 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x01d5 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x01d5 }
            r2.f7277t = r5     // Catch:{ all -> 0x01d5 }
            r12.k()     // Catch:{ all -> 0x01d5 }
            MessageType r2 = r12.f14359b     // Catch:{ all -> 0x01d5 }
            ji.c r2 = (ji.c) r2     // Catch:{ all -> 0x01d5 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x01d5 }
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x01d5 }
            r2.f7278u = r11     // Catch:{ all -> 0x01d5 }
            r12.k()     // Catch:{ all -> 0x01d5 }
            MessageType r2 = r12.f14359b     // Catch:{ all -> 0x01d5 }
            ji.c r2 = (ji.c) r2     // Catch:{ all -> 0x01d5 }
            r2.f7279v = r0     // Catch:{ all -> 0x01d5 }
            r0 = 0
            if (r10 != 0) goto L_0x01b0
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x01d5 }
        L_0x01b0:
            int r2 = r10.length     // Catch:{ all -> 0x01d5 }
            zb.h$d r3 = new zb.h$d     // Catch:{ all -> 0x01d5 }
            zb.h$b r5 = zb.h.f14305c     // Catch:{ all -> 0x01d5 }
            byte[] r0 = r5.a(r10, r0, r2)     // Catch:{ all -> 0x01d5 }
            r3.<init>(r0)     // Catch:{ all -> 0x01d5 }
            r12.k()     // Catch:{ all -> 0x01d5 }
            MessageType r0 = r12.f14359b     // Catch:{ all -> 0x01d5 }
            ji.c r0 = (ji.c) r0     // Catch:{ all -> 0x01d5 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x01d5 }
            r0.f7280w = r3     // Catch:{ all -> 0x01d5 }
            zb.r r0 = r12.i()     // Catch:{ all -> 0x01d5 }
            ji.c r0 = (ji.c) r0     // Catch:{ all -> 0x01d5 }
            r4.<init>(r8, r7, r0)     // Catch:{ all -> 0x01d5 }
            r6.add(r4)     // Catch:{ all -> 0x01d5 }
            goto L_0x01dd
        L_0x01d5:
            r0 = move-exception
        L_0x01d6:
            r2 = 0
            goto L_0x01f2
        L_0x01d8:
            r0 = move-exception
            goto L_0x01ed
        L_0x01da:
            r13 = r19
            r9 = r13
        L_0x01dd:
            md.m r0 = md.m.f8555a     // Catch:{ all -> 0x01d5 }
            r2 = 0
            r9.a(r2)
            return r0
        L_0x01e4:
            r0 = move-exception
            r13 = r19
            goto L_0x01ed
        L_0x01e8:
            r0 = move-exception
            r13 = r9
            goto L_0x01d6
        L_0x01eb:
            r0 = move-exception
            r13 = r9
        L_0x01ed:
            r9 = r13
            goto L_0x01d6
        L_0x01ef:
            r0 = move-exception
            r13 = r9
        L_0x01f1:
            r2 = r4
        L_0x01f2:
            r9.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
