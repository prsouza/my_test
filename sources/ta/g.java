package ta;

import db.c;
import io.nodle.cash.data.remote.api.SubscanApi;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.e;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final SubscanApi f11455a;

    /* renamed from: b  reason: collision with root package name */
    public final c f11456b;

    @e(c = "io.nodle.cash.data.remote.SubscanDataSource", f = "SubscanDataSource.kt", l = {15}, m = "getLastTransactions")
    public static final class a extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f11457a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g f11458b;

        /* renamed from: c  reason: collision with root package name */
        public int f11459c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, d<? super a> dVar) {
            super(dVar);
            this.f11458b = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11457a = obj;
            this.f11459c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f11458b.a((String) null, 0, 0, this);
        }
    }

    public g(SubscanApi subscanApi, c cVar) {
        this.f11455a = subscanApi;
        this.f11456b = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r6 = r6.getTransfers();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, int r7, int r8, pd.d<? super java.util.List<io.nodle.cash.data.remote.api.response.TransferApiModel>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ta.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ta.g$a r0 = (ta.g.a) r0
            int r1 = r0.f11459c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11459c = r1
            goto L_0x0018
        L_0x0013:
            ta.g$a r0 = new ta.g$a
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f11457a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f11459c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            l6.b1.w(r9)
            goto L_0x0048
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            l6.b1.w(r9)
            io.nodle.cash.data.remote.api.SubscanApi r9 = r5.f11455a
            db.c r2 = r5.f11456b
            java.lang.String r2 = r2.d()
            io.nodle.cash.data.remote.api.request.SubscanTransfersRequest r4 = new io.nodle.cash.data.remote.api.request.SubscanTransfersRequest
            r4.<init>(r7, r8, r6)
            r0.f11459c = r3
            java.lang.Object r9 = r9.getTransfers(r2, r4, r0)
            if (r9 != r1) goto L_0x0048
            return r1
        L_0x0048:
            io.nodle.cash.data.remote.api.response.SubscanTransfersResponse r9 = (io.nodle.cash.data.remote.api.response.SubscanTransfersResponse) r9
            io.nodle.cash.data.remote.api.response.SubscanTransfersResponse$Data r6 = r9.getData()
            if (r6 == 0) goto L_0x0056
            java.util.List r6 = r6.getTransfers()
            if (r6 != 0) goto L_0x0058
        L_0x0056:
            nd.o r6 = nd.o.f8966a
        L_0x0058:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.g.a(java.lang.String, int, int, pd.d):java.lang.Object");
    }
}
