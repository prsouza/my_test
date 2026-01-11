package je;

import ie.n;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import pd.h;
import rd.c;
import rd.e;
import xd.p;

public final class b<T> extends d<T> {

    /* renamed from: t  reason: collision with root package name */
    public final p<n<? super T>, d<? super m>, Object> f7195t;

    @e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public n f7196a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f7197b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b<T> f7198c;

        /* renamed from: s  reason: collision with root package name */
        public int f7199s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, d<? super a> dVar) {
            super(dVar);
            this.f7198c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7197b = obj;
            this.f7199s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f7198c.d((n) null, this);
        }
    }

    public b(p pVar) {
        super(pVar, h.f9881a, -2, ie.d.SUSPEND);
        this.f7195t = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(ie.n<? super T> r5, pd.d<? super md.m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof je.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            je.b$a r0 = (je.b.a) r0
            int r1 = r0.f7199s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7199s = r1
            goto L_0x0018
        L_0x0013:
            je.b$a r0 = new je.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f7197b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f7199s
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            ie.n r5 = r0.f7196a
            l6.b1.w(r6)
            goto L_0x0046
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            l6.b1.w(r6)
            r0.f7196a = r5
            r0.f7199s = r3
            xd.p<ie.n<? super T>, pd.d<? super md.m>, java.lang.Object> r6 = r4.f7203s
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            md.m r6 = md.m.f8555a
        L_0x0043:
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x004f
            md.m r5 = md.m.f8555a
            return r5
        L_0x004f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: je.b.d(ie.n, pd.d):java.lang.Object");
    }
}
