package tb;

import ge.d0;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$observeNodleBalance$1", f = "HomeViewModelV2.kt", l = {149, 155, 162}, m = "invokeSuspend")
public final class j extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11495a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModelV2 f11496b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(HomeViewModelV2 homeViewModelV2, d<? super j> dVar) {
        super(2, dVar);
        this.f11496b = homeViewModelV2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new j(this.f11496b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069 A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r10.f11495a
            r2 = 1
            r3 = 2
            r4 = 3
            if (r1 == 0) goto L_0x002c
            if (r1 == r2) goto L_0x0021
            if (r1 == r3) goto L_0x001b
            if (r1 != r4) goto L_0x0013
            l6.b1.w(r11)
            goto L_0x0043
        L_0x0013:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001b:
            l6.b1.w(r11)     // Catch:{ Exception -> 0x0027 }
            r1 = r0
            r0 = r10
            goto L_0x0084
        L_0x0021:
            l6.b1.w(r11)     // Catch:{ Exception -> 0x0027 }
            r1 = r0
            r0 = r10
            goto L_0x0065
        L_0x0027:
            r11 = move-exception
            r1 = r0
            r0 = r10
            goto L_0x0099
        L_0x002c:
            l6.b1.w(r11)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r11 = r10.f11496b
            java.math.BigInteger r1 = new java.math.BigInteger
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r5 = r10.f11496b
            android.content.Context r5 = r5.f6765s
            qa.e r6 = qa.e.NODLE_AMOUNT
            java.lang.String r5 = ah.v.J(r5, r6)
            r1.<init>(r5)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2.j(r11, r1)
        L_0x0043:
            r11 = r10
        L_0x0044:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r1 = r11.f11496b
            boolean r5 = r1.f6769w
            if (r5 == 0) goto L_0x00b4
            za.h r5 = za.h.f14215a     // Catch:{ Exception -> 0x0094 }
            android.content.Context r5 = r1.f6765s     // Catch:{ Exception -> 0x0094 }
            java.lang.String r1 = r1.f6771y     // Catch:{ Exception -> 0x0094 }
            r11.f11495a = r2     // Catch:{ Exception -> 0x0094 }
            me.b r6 = ge.o0.f5434b     // Catch:{ Exception -> 0x0094 }
            za.i r7 = new za.i     // Catch:{ Exception -> 0x0094 }
            r8 = 0
            r7.<init>(r5, r1, r8)     // Catch:{ Exception -> 0x0094 }
            java.lang.Object r1 = ge.g.d(r6, r7, r11)     // Catch:{ Exception -> 0x0094 }
            if (r1 != r0) goto L_0x0061
            return r0
        L_0x0061:
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
        L_0x0065:
            java.math.BigInteger r11 = (java.math.BigInteger) r11     // Catch:{ Exception -> 0x0092 }
            if (r11 == 0) goto L_0x009c
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r5 = r0.f11496b     // Catch:{ Exception -> 0x0092 }
            android.content.Context r5 = r5.f6765s     // Catch:{ Exception -> 0x0092 }
            qa.e r6 = qa.e.NODLE_AMOUNT     // Catch:{ Exception -> 0x0092 }
            ah.v.f0(r5, r6, r11)     // Catch:{ Exception -> 0x0092 }
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r5 = r0.f11496b     // Catch:{ Exception -> 0x0092 }
            io.nodle.cash.ui.viewmodel.HomeViewModelV2.j(r5, r11)     // Catch:{ Exception -> 0x0092 }
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r11 = r0.f11496b     // Catch:{ Exception -> 0x0092 }
            ua.f r11 = r11.f6770x     // Catch:{ Exception -> 0x0092 }
            r0.f11495a = r3     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r11 = r11.d(r0)     // Catch:{ Exception -> 0x0092 }
            if (r11 != r1) goto L_0x0084
            return r1
        L_0x0084:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ Exception -> 0x0092 }
            boolean r11 = r11.booleanValue()     // Catch:{ Exception -> 0x0092 }
            if (r11 == 0) goto L_0x009c
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r11 = r0.f11496b     // Catch:{ Exception -> 0x0092 }
            r11.n()     // Catch:{ Exception -> 0x0092 }
            goto L_0x009c
        L_0x0092:
            r11 = move-exception
            goto L_0x0099
        L_0x0094:
            r1 = move-exception
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
        L_0x0099:
            r11.printStackTrace()
        L_0x009c:
            r11 = r0
            r0 = r1
            java.lang.String r1 = "balance_call_rate_seconds"
            java.lang.String r1 = ah.v.K(r1)
            long r5 = java.lang.Long.parseLong(r1)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r11.f11495a = r4
            java.lang.Object r1 = c3.k.f0(r5, r11)
            if (r1 != r0) goto L_0x0044
            return r0
        L_0x00b4:
            md.m r11 = md.m.f8555a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
