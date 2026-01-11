package za;

import ah.v;
import android.content.Context;
import ge.d0;
import io.nodle.cash.data.remote.api.SubstrateApi;
import io.nodle.cash.data.remote.api.SubstrateApiKt;
import java.math.BigInteger;
import ki.z;
import l6.b1;
import md.m;
import p002if.b0;
import pd.d;
import rd.e;
import ta.f;
import xd.l;
import xd.p;

@e(c = "io.nodle.cash.domain.helper.SubstrateHelper$getAccountBalance$2", f = "SubstrateHelper.kt", l = {140, 149}, m = "invokeSuspend")
public final class i extends rd.i implements p<d0, d<? super BigInteger>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14267a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f14268b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f14269c;

    @e(c = "io.nodle.cash.domain.helper.SubstrateHelper$getAccountBalance$2$result$1", f = "SubstrateHelper.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends rd.i implements l<d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f14270a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f14271b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, d<? super a> dVar) {
            super(1, dVar);
            this.f14271b = context;
        }

        public final d<m> create(d<?> dVar) {
            return new a(this.f14271b, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f14270a;
            if (i == 0) {
                b1.w(obj);
                SubstrateApi b10 = f.f11451a.b(this.f14271b);
                String K = v.K("nodle_mainnet_public_url");
                String str = h.f14217c;
                e6.e.B(str);
                p002if.z accountBalanceRequestBody = SubstrateApiKt.getAccountBalanceRequestBody(str);
                this.f14270a = 1;
                obj = b10.requestSubstrate(K, accountBalanceRequestBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object k(Object obj) {
            return ((a) create((d) obj)).invokeSuspend(m.f8555a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context, String str, d<? super i> dVar) {
        super(2, dVar);
        this.f14268b = context;
        this.f14269c = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new i(this.f14268b, this.f14269c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "h"
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r9.f14267a
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0025
            if (r2 == r4) goto L_0x001d
            if (r2 != r3) goto L_0x0015
            l6.b1.w(r10)
            goto L_0x00e6
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001d:
            l6.b1.w(r10)     // Catch:{ all -> 0x0022 }
            goto L_0x008d
        L_0x0022:
            r10 = move-exception
            goto L_0x00ce
        L_0x0025:
            l6.b1.w(r10)
            za.h r10 = za.h.f14215a
            java.lang.String r10 = "getAccountBalance ... "
            android.util.Log.d(r0, r10)
            android.content.Context r10 = r9.f14268b
            if (r10 == 0) goto L_0x003a
            java.lang.String r2 = "connectivity"
            java.lang.Object r10 = r10.getSystemService(r2)
            goto L_0x003b
        L_0x003a:
            r10 = r6
        L_0x003b:
            boolean r2 = r10 instanceof android.net.ConnectivityManager
            if (r2 == 0) goto L_0x0042
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            goto L_0x0043
        L_0x0042:
            r10 = r6
        L_0x0043:
            if (r10 != 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            android.net.Network r2 = r10.getActiveNetwork()
            android.net.NetworkCapabilities r10 = r10.getNetworkCapabilities(r2)
            if (r10 == 0) goto L_0x005a
            r2 = 12
            boolean r2 = r10.hasCapability(r2)
            if (r2 != r4) goto L_0x005a
            r2 = r4
            goto L_0x005b
        L_0x005a:
            r2 = r5
        L_0x005b:
            if (r2 == 0) goto L_0x0067
            r2 = 16
            boolean r10 = r10.hasCapability(r2)
            if (r10 == 0) goto L_0x0067
        L_0x0065:
            r10 = r4
            goto L_0x0068
        L_0x0067:
            r10 = r5
        L_0x0068:
            if (r10 != 0) goto L_0x0070
            java.lang.String r10 = "No internet connection!"
            android.util.Log.w(r0, r10)
            return r6
        L_0x0070:
            java.lang.String r10 = za.h.f14217c
            if (r10 == 0) goto L_0x007d
            int r10 = r10.length()
            if (r10 != 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r10 = r5
            goto L_0x007e
        L_0x007d:
            r10 = r4
        L_0x007e:
            if (r10 == 0) goto L_0x00d4
            za.h r10 = za.h.f14215a     // Catch:{ all -> 0x0022 }
            android.content.Context r0 = r9.f14268b     // Catch:{ all -> 0x0022 }
            r9.f14267a = r4     // Catch:{ all -> 0x0022 }
            java.lang.Object r10 = r10.h(r0, r9)     // Catch:{ all -> 0x0022 }
            if (r10 != r1) goto L_0x008d
            return r1
        L_0x008d:
            java.lang.String r0 = r9.f14269c     // Catch:{ all -> 0x0022 }
            r2 = r10
            kc.a r2 = (kc.a) r2     // Catch:{ all -> 0x0022 }
            za.h r7 = za.h.f14215a     // Catch:{ all -> 0x0022 }
            l6.s r7 = r2.f7498b     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = "System"
            bd.f r7 = y.c.P(r7, r8)     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = "Account"
            bd.g r7 = r7.f2980b     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x00ab
            java.util.Map<java.lang.String, bd.h> r7 = r7.f2985a     // Catch:{ all -> 0x0022 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0022 }
            bd.h r7 = (bd.h) r7     // Catch:{ all -> 0x0022 }
            goto L_0x00ac
        L_0x00ab:
            r7 = r6
        L_0x00ac:
            if (r7 == 0) goto L_0x00c8
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0022 }
            gd.a r8 = gd.a.f5360c     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = "$this$toAccountId"
            e6.e.D(r0, r8)     // Catch:{ all -> 0x0022 }
            byte[] r0 = gd.a.a(r0)     // Catch:{ all -> 0x0022 }
            r4[r5] = r0     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = y.c.k0(r7, r2, r4)     // Catch:{ all -> 0x0022 }
            za.h.f14217c = r0     // Catch:{ all -> 0x0022 }
            kc.a r10 = (kc.a) r10     // Catch:{ all -> 0x0022 }
            za.h.f14218d = r10     // Catch:{ all -> 0x0022 }
            goto L_0x00d4
        L_0x00c8:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0022 }
            r10.<init>()     // Catch:{ all -> 0x0022 }
            throw r10     // Catch:{ all -> 0x0022 }
        L_0x00ce:
            ri.a$a r0 = ri.a.f10801a
            r0.c(r10)
            return r6
        L_0x00d4:
            ta.f r10 = ta.f.f11451a
            za.i$a r0 = new za.i$a
            android.content.Context r2 = r9.f14268b
            r0.<init>(r2, r6)
            r9.f14267a = r3
            java.lang.Object r10 = r10.c(r0, r9)
            if (r10 != r1) goto L_0x00e6
            return r1
        L_0x00e6:
            ta.e r10 = (ta.e) r10
            boolean r0 = r10 instanceof ta.h
            if (r0 == 0) goto L_0x0200
            org.json.JSONObject r0 = new org.json.JSONObject
            ta.h r10 = (ta.h) r10
            T r10 = r10.f11461b
            if.b0 r10 = (p002if.b0) r10
            if (r10 == 0) goto L_0x00fb
            java.lang.String r10 = r10.f()
            goto L_0x00fc
        L_0x00fb:
            r10 = r6
        L_0x00fc:
            r0.<init>(r10)
            java.lang.String r10 = "result"
            java.lang.String r10 = r0.getString(r10)
            kc.a r0 = za.h.f14218d
            e6.e.B(r0)
            if (r10 == 0) goto L_0x01ab
            oc.b r1 = r0.f7497a
            java.lang.String r2 = "AccountInfo"
            qc.a r1 = r1.a(r2)
            if (r1 == 0) goto L_0x01a7
            java.lang.Object r10 = ad.c.J(r1, r0, r10)     // Catch:{ all -> 0x011b }
            goto L_0x0120
        L_0x011b:
            r10 = move-exception
            java.lang.Object r10 = l6.b1.k(r10)
        L_0x0120:
            boolean r0 = r10 instanceof md.g.a
            if (r0 == 0) goto L_0x0125
            r10 = r6
        L_0x0125:
            boolean r0 = r10 instanceof rc.g.a
            if (r0 != 0) goto L_0x012a
            r10 = r6
        L_0x012a:
            rc.g$a r10 = (rc.g.a) r10
            if (r10 == 0) goto L_0x01a3
            za.a r0 = new za.a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f10665a
            java.lang.String r2 = "nonce"
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof java.lang.Object
            if (r2 != 0) goto L_0x013d
            r1 = r6
        L_0x013d:
            java.math.BigInteger r1 = a.b.J(r1)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r10.f10665a
            java.lang.String r2 = "data"
            java.lang.Object r10 = r10.get(r2)
            boolean r2 = r10 instanceof rc.g.a
            if (r2 != 0) goto L_0x014e
            r10 = r6
        L_0x014e:
            rc.g$a r10 = (rc.g.a) r10
            if (r10 == 0) goto L_0x019f
            t.c r2 = new t.c
            java.util.Map<java.lang.String, java.lang.Object> r3 = r10.f10665a
            java.lang.String r4 = "free"
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.Object
            if (r4 != 0) goto L_0x0161
            r3 = r6
        L_0x0161:
            java.math.BigInteger r3 = a.b.J(r3)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r10.f10665a
            java.lang.String r7 = "reserved"
            java.lang.Object r4 = r4.get(r7)
            boolean r7 = r4 instanceof java.lang.Object
            if (r7 != 0) goto L_0x0172
            r4 = r6
        L_0x0172:
            java.math.BigInteger r4 = a.b.J(r4)
            java.util.Map<java.lang.String, java.lang.Object> r7 = r10.f10665a
            java.lang.String r8 = "miscFrozen"
            java.lang.Object r7 = r7.get(r8)
            boolean r8 = r7 instanceof java.lang.Object
            if (r8 != 0) goto L_0x0183
            r7 = r6
        L_0x0183:
            java.math.BigInteger r7 = a.b.J(r7)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r10.f10665a
            java.lang.String r8 = "feeFrozen"
            java.lang.Object r10 = r10.get(r8)
            boolean r8 = r10 instanceof java.lang.Object
            if (r8 != 0) goto L_0x0194
            r10 = r6
        L_0x0194:
            java.math.BigInteger r10 = a.b.J(r10)
            r2.<init>(r3, r4, r7, r10)
            r0.<init>(r1, r2)
            goto L_0x01bc
        L_0x019f:
            a.b.k0()
            throw r6
        L_0x01a3:
            a.b.k0()
            throw r6
        L_0x01a7:
            a.b.k0()
            throw r6
        L_0x01ab:
            za.a r0 = new za.a
            java.math.BigInteger r10 = java.math.BigInteger.ZERO
            java.lang.String r1 = "ZERO"
            e6.e.C(r10, r1)
            t.c r1 = new t.c
            r1.<init>(r10, r10, r10, r10)
            r0.<init>(r10, r1)
        L_0x01bc:
            t.c r10 = r0.f14194a
            java.lang.Object r10 = r10.f11165a
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            java.math.BigInteger r1 = za.h.f14216b
            boolean r10 = e6.e.r(r10, r1)
            if (r10 != 0) goto L_0x01f6
            ri.a$a r10 = ri.a.f10801a
            t.c r1 = r0.f14194a
            java.lang.Object r1 = r1.f11165a
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AccountBalance: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r10.a(r1, r2)
            za.h r10 = za.h.f14215a
            t.c r10 = r0.f14194a
            java.lang.Object r10 = r10.f11165a
            r0 = r10
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            za.h.f14216b = r0
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            return r10
        L_0x01f6:
            ri.a$a r10 = ri.a.f10801a
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "AccountBalance: No Change."
            r10.a(r1, r0)
            goto L_0x0208
        L_0x0200:
            boolean r0 = r10 instanceof ta.b
            if (r0 != 0) goto L_0x0222
            boolean r0 = r10 instanceof ta.a
            if (r0 != 0) goto L_0x0209
        L_0x0208:
            return r6
        L_0x0209:
            ri.a$a r0 = ri.a.f10801a
            ta.a r10 = (ta.a) r10
            java.lang.String r10 = r10.f11446b
            java.lang.String r1 = "Error in substrate account balance: "
            java.lang.String r10 = a8.a.c(r1, r10)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0.b(r10, r1)
            za.b r10 = new za.b
            java.lang.String r0 = "Error in substrate account balance."
            r10.<init>(r0)
            throw r10
        L_0x0222:
            ri.a$a r0 = ri.a.f10801a
            ta.b r10 = (ta.b) r10
            java.lang.String r10 = r10.f11449c
            java.lang.String r1 = "Failure in substrate account balance: "
            java.lang.String r10 = a8.a.c(r1, r10)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0.b(r10, r1)
            za.b r10 = new za.b
            java.lang.String r0 = "Failure in substrate account balance."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: za.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
