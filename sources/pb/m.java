package pb;

import ge.d0;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.view.fragment.home.MapFragment$markCoinsForDevices$1", f = "MapFragment.kt", l = {229, 234, 240, 251}, m = "invokeSuspend")
public final class m extends i implements p<d0, d<? super md.m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9861a;

    /* renamed from: b  reason: collision with root package name */
    public int f9862b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f9863c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(j jVar, d<? super m> dVar) {
        super(2, dVar);
        this.f9863c = jVar;
    }

    public final d<md.m> create(Object obj, d<?> dVar) {
        return new m(this.f9863c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((d0) obj, (d) obj2)).invokeSuspend(md.m.f8555a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        r11 = (r11 = r11.getResources()).getDisplayMetrics();
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0148 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f9862b
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r7) goto L_0x0035
            if (r2 == r5) goto L_0x002d
            if (r2 == r4) goto L_0x0025
            if (r2 != r3) goto L_0x001d
            int r2 = r0.f9861a
            l6.b1.w(r18)
            r3 = r0
            goto L_0x017e
        L_0x001d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0025:
            int r2 = r0.f9861a
            l6.b1.w(r18)
            r3 = r0
            goto L_0x0149
        L_0x002d:
            int r2 = r0.f9861a
            l6.b1.w(r18)
            r3 = r0
            goto L_0x00ea
        L_0x0035:
            int r2 = r0.f9861a
            l6.b1.w(r18)
            r3 = r0
            goto L_0x005b
        L_0x003c:
            l6.b1.w(r18)
            r3 = r0
            r2 = r6
        L_0x0041:
            pb.j r4 = r3.f9863c
            boolean r4 = r4.isResumed()
            if (r4 == 0) goto L_0x0194
            r8 = 800(0x320, double:3.953E-321)
            r3.f9861a = r6
            r3.f9862b = r7
            java.lang.Object r4 = c3.k.f0(r8, r3)
            if (r4 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r16 = r6
            r6 = r2
            r2 = r16
        L_0x005b:
            za.d r4 = za.d.f14195a
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r4 = za.d.f14199e
            java.lang.Object r4 = r4.poll()
            if (r4 == 0) goto L_0x0170
            java.lang.String r4 = "NodleHelper"
            java.lang.String r8 = "MARK DEVICE"
            android.util.Log.d(r4, r8)
            int r2 = r2 + 1
            pb.j r4 = r3.f9863c
            boolean r8 = r4.A
            if (r8 == 0) goto L_0x00ea
            r3.f9861a = r2
            r3.f9862b = r5
            yd.r r8 = new yd.r
            r8.<init>()
            float r9 = r4.f9851w
            vb.c r10 = vb.c.f12449a
            int r11 = r4.f9853y
            int r12 = r4.z
            int r10 = r10.a(r11, r12, r6)
            float r10 = (float) r10
            float r9 = r9 + r10
            r8.f13619a = r9
        L_0x008d:
            float r9 = r8.f13619a
            float r10 = r4.D
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r10 = r4.C
            float r10 = (float) r10
            android.content.Context r11 = r4.getContext()
            if (r11 == 0) goto L_0x00ae
            android.content.res.Resources r11 = r11.getResources()
            if (r11 == 0) goto L_0x00ae
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            if (r11 == 0) goto L_0x00ae
            float r11 = r11.density
            goto L_0x00b0
        L_0x00ae:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00b0:
            float r10 = r10 * r11
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x00c6
            float r9 = r4.f9851w
            vb.c r10 = vb.c.f12449a
            int r11 = r4.f9853y
            int r12 = r4.z
            int r10 = r10.a(r11, r12, r6)
            float r10 = (float) r10
            float r9 = r9 + r10
            r8.f13619a = r9
            goto L_0x008d
        L_0x00c6:
            float r9 = r8.f13619a
            r4.D = r9
            float r9 = r4.f9852x
            vb.c r10 = vb.c.f12449a
            int r11 = r4.f9853y
            int r12 = r4.z
            r13 = -1
            int r10 = r10.a(r11, r12, r13)
            float r10 = (float) r10
            float r9 = r9 + r10
            me.c r10 = ge.o0.f5433a
            ge.n1 r10 = le.l.f8259a
            pb.n r11 = new pb.n
            r12 = 0
            r11.<init>(r4, r8, r9, r12)
            java.lang.Object r4 = ge.g.d(r10, r11, r3)
            if (r4 != r1) goto L_0x00ea
            return r1
        L_0x00ea:
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            java.lang.String r8 = "0"
            r4.<init>(r8)
            r8 = 9
            r4.setMaximumFractionDigits(r8)
            r4.setMinimumFractionDigits(r5)
            ab.f r5 = ab.f.f215a
            pb.j r8 = r3.f9863c
            r9 = 2131755149(0x7f10008d, float:1.914117E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            za.d r10 = za.d.f14195a
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0127 }
            java.lang.String r11 = "rewardEstimation"
            java.lang.String r11 = ah.v.K(r11)     // Catch:{ JSONException -> 0x0127 }
            r10.<init>(r11)     // Catch:{ JSONException -> 0x0127 }
            java.lang.String r11 = "basic_price"
            double r10 = r10.getDouble(r11)     // Catch:{ JSONException -> 0x0127 }
            r12 = 10
            double r13 = (double) r12     // Catch:{ JSONException -> 0x0127 }
            double r10 = r10 * r13
            vb.c r13 = vb.c.f12449a     // Catch:{ JSONException -> 0x0127 }
            int r12 = r13.a(r6, r12, r6)     // Catch:{ JSONException -> 0x0127 }
            double r12 = (double) r12
            double r12 = r12 * r10
            r14 = 100
            double r14 = (double) r14
            double r12 = r12 / r14
            double r12 = r12 + r10
            goto L_0x0129
        L_0x0127:
            r12 = 0
        L_0x0129:
            java.lang.String r4 = r4.format(r12)
            if (r4 != 0) goto L_0x0131
            java.lang.String r4 = "0.00"
        L_0x0131:
            r7[r6] = r4
            java.lang.String r4 = r8.getString(r9, r7)
            java.lang.String r7 = "getString(R.string.estim…               ?: \"0.00\")"
            e6.e.C(r4, r7)
            r3.f9861a = r2
            r7 = 3
            r3.f9862b = r7
            r7 = 1
            java.lang.Object r4 = r5.n(r4, r7, r7, r3)
            if (r4 != r1) goto L_0x0149
            return r1
        L_0x0149:
            pb.j r4 = r3.f9863c
            android.content.Context r4 = r4.getContext()
            if (r4 == 0) goto L_0x018c
            qa.e r5 = qa.e.REWARDS_PENDING_DEVICE_COUNT
            java.lang.String r8 = ah.v.J(r4, r5)
            long r8 = java.lang.Long.parseLong(r8)
            r10 = 1
            long r8 = r8 + r10
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            ah.v.f0(r4, r5, r10)
            ab.f r5 = ab.f.f215a
            java.lang.String r4 = r5.g(r4, r8)
            r5.k(r4)
            goto L_0x018c
        L_0x0170:
            r4 = 1000(0x3e8, double:4.94E-321)
            r3.f9861a = r2
            r8 = 4
            r3.f9862b = r8
            java.lang.Object r4 = c3.k.f0(r4, r3)
            if (r4 != r1) goto L_0x017e
            return r1
        L_0x017e:
            za.d r4 = za.d.f14195a
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r4 = za.d.f14199e
            java.lang.Object r4 = r4.poll()
            if (r4 != 0) goto L_0x018c
            if (r2 == 0) goto L_0x018c
            r2 = r6
            goto L_0x0191
        L_0x018c:
            r16 = r6
            r6 = r2
            r2 = r16
        L_0x0191:
            r5 = 2
            goto L_0x0041
        L_0x0194:
            md.m r1 = md.m.f8555a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
