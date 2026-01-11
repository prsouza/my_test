package je;

import ke.h;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

public final class q<T> implements f<T> {

    @e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public q f7242a;

        /* renamed from: b  reason: collision with root package name */
        public h f7243b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f7244c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ q<T> f7245s;

        /* renamed from: t  reason: collision with root package name */
        public int f7246t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(q<T> qVar, d<? super a> dVar) {
            super(dVar);
            this.f7245s = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7244c = obj;
            this.f7246t |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f7245s.b(this);
        }
    }

    public final Object a(T t10, d<? super m> dVar) {
        throw null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(pd.d<? super md.m> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof je.q.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            je.q$a r0 = (je.q.a) r0
            int r1 = r0.f7246t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7246t = r1
            goto L_0x0018
        L_0x0013:
            je.q$a r0 = new je.q$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f7244c
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r1 = r0.f7246t
            r2 = 1
            if (r1 == 0) goto L_0x0042
            if (r1 == r2) goto L_0x0034
            r0 = 2
            if (r1 != r0) goto L_0x002c
            l6.b1.w(r5)
        L_0x0029:
            md.m r5 = md.m.f8555a
            return r5
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0034:
            ke.h r1 = r0.f7243b
            je.q r0 = r0.f7242a
            l6.b1.w(r5)     // Catch:{ all -> 0x0056 }
            r1.releaseIntercepted()
            java.util.Objects.requireNonNull(r0)
            goto L_0x0029
        L_0x0042:
            l6.b1.w(r5)
            ke.h r1 = new ke.h
            pd.f r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.f7242a = r4     // Catch:{ all -> 0x0056 }
            r0.f7243b = r1     // Catch:{ all -> 0x0056 }
            r0.f7246t = r2     // Catch:{ all -> 0x0056 }
            throw r3     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r5 = move-exception
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: je.q.b(pd.d):java.lang.Object");
    }
}
