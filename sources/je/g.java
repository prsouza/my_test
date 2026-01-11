package je;

import ie.p;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

public final /* synthetic */ class g {

    @e(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends c {

        /* renamed from: a  reason: collision with root package name */
        public f f7204a;

        /* renamed from: b  reason: collision with root package name */
        public p f7205b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f7206c;

        /* renamed from: s  reason: collision with root package name */
        public /* synthetic */ Object f7207s;

        /* renamed from: t  reason: collision with root package name */
        public int f7208t;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f7207s = obj;
            this.f7208t |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return g.a((f) null, (p) null, false, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[SYNTHETIC, Splitter:B:41:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object a(je.f<? super T> r7, ie.p<? extends T> r8, boolean r9, pd.d<? super md.m> r10) {
        /*
            boolean r0 = r10 instanceof je.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            je.g$a r0 = (je.g.a) r0
            int r1 = r0.f7208t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7208t = r1
            goto L_0x0018
        L_0x0013:
            je.g$a r0 = new je.g$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f7207s
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f7208t
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003c
            if (r2 != r5) goto L_0x0034
            boolean r7 = r0.f7206c
            ie.p r8 = r0.f7205b
            je.f r9 = r0.f7204a
            l6.b1.w(r10)     // Catch:{ all -> 0x0093 }
        L_0x0030:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x0051
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            boolean r7 = r0.f7206c
            ie.p r8 = r0.f7205b
            je.f r9 = r0.f7204a
            l6.b1.w(r10)     // Catch:{ all -> 0x0093 }
            ie.g r10 = (ie.g) r10     // Catch:{ all -> 0x0093 }
            java.lang.Object r10 = r10.f6435a     // Catch:{ all -> 0x0093 }
            goto L_0x0063
        L_0x004a:
            l6.b1.w(r10)
            boolean r10 = r7 instanceof je.r
            if (r10 != 0) goto L_0x00bd
        L_0x0051:
            r0.f7204a = r7     // Catch:{ all -> 0x00b1 }
            r0.f7205b = r8     // Catch:{ all -> 0x00b1 }
            r0.f7206c = r9     // Catch:{ all -> 0x00b1 }
            r0.f7208t = r4     // Catch:{ all -> 0x00b1 }
            java.lang.Object r10 = r8.p(r0)     // Catch:{ all -> 0x00b1 }
            if (r10 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x0063:
            boolean r2 = r10 instanceof ie.g.a     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x0080
            boolean r9 = r10 instanceof ie.g.a     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x006e
            ie.g$a r10 = (ie.g.a) r10     // Catch:{ all -> 0x0093 }
            goto L_0x006f
        L_0x006e:
            r10 = r3
        L_0x006f:
            if (r10 != 0) goto L_0x0073
            r9 = r3
            goto L_0x0075
        L_0x0073:
            java.lang.Throwable r9 = r10.f6436a     // Catch:{ all -> 0x0093 }
        L_0x0075:
            if (r9 != 0) goto L_0x007f
            if (r7 == 0) goto L_0x007c
            c3.k.N(r8, r3)
        L_0x007c:
            md.m r7 = md.m.f8555a
            return r7
        L_0x007f:
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x0080:
            boolean r2 = r10 instanceof ie.g.b     // Catch:{ all -> 0x0093 }
            if (r2 != 0) goto L_0x0095
            r0.f7204a = r9     // Catch:{ all -> 0x0093 }
            r0.f7205b = r8     // Catch:{ all -> 0x0093 }
            r0.f7206c = r7     // Catch:{ all -> 0x0093 }
            r0.f7208t = r5     // Catch:{ all -> 0x0093 }
            java.lang.Object r10 = r9.a(r10, r0)     // Catch:{ all -> 0x0093 }
            if (r10 != r1) goto L_0x0030
            return r1
        L_0x0093:
            r9 = move-exception
            goto L_0x00b5
        L_0x0095:
            boolean r9 = r10 instanceof ie.g.a     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x00a1
            r9 = r10
            ie.g$a r9 = (ie.g.a) r9     // Catch:{ all -> 0x0093 }
            java.lang.Throwable r9 = r9.f6436a     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x00a1
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x00a1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = "Trying to call 'getOrThrow' on a failed channel result: "
            java.lang.String r10 = e6.e.a0(r0, r10)     // Catch:{ all -> 0x0093 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0093 }
            r9.<init>(r10)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x00b1:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x00b5:
            throw r9     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r10 = move-exception
            if (r7 == 0) goto L_0x00bc
            c3.k.N(r8, r9)
        L_0x00bc:
            throw r10
        L_0x00bd:
            je.r r7 = (je.r) r7
            java.util.Objects.requireNonNull(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: je.g.a(je.f, ie.p, boolean, pd.d):java.lang.Object");
    }
}
