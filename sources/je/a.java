package je;

import ke.h;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

public abstract class a<T> implements e<T> {

    @e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: je.a$a  reason: collision with other inner class name */
    public static final class C0127a extends c {

        /* renamed from: a  reason: collision with root package name */
        public h f7191a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f7192b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a<T> f7193c;

        /* renamed from: s  reason: collision with root package name */
        public int f7194s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0127a(a<T> aVar, d<? super C0127a> dVar) {
            super(dVar);
            this.f7193c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7192b = obj;
            this.f7194s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f7193c.b((f) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(je.f<? super T> r6, pd.d<? super md.m> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof je.a.C0127a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            je.a$a r0 = (je.a.C0127a) r0
            int r1 = r0.f7194s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7194s = r1
            goto L_0x0018
        L_0x0013:
            je.a$a r0 = new je.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f7192b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f7194s
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            ke.h r6 = r0.f7191a
            l6.b1.w(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x0055
        L_0x0029:
            r7 = move-exception
            goto L_0x005f
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            l6.b1.w(r7)
            ke.h r7 = new ke.h
            pd.f r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f7191a = r7     // Catch:{ all -> 0x005b }
            r0.f7194s = r3     // Catch:{ all -> 0x005b }
            r6 = r5
            je.j r6 = (je.j) r6     // Catch:{ all -> 0x005b }
            xd.p<je.f<? super T>, pd.d<? super md.m>, java.lang.Object> r6 = r6.f7210a     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch:{ all -> 0x005b }
            if (r6 != r1) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            md.m r6 = md.m.f8555a     // Catch:{ all -> 0x005b }
        L_0x0051:
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r6 = r7
        L_0x0055:
            r6.releaseIntercepted()
            md.m r6 = md.m.f8555a
            return r6
        L_0x005b:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x005f:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: je.a.b(je.f, pd.d):java.lang.Object");
    }
}
