package bf;

import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;
import xd.l;

public final class b {

    @e(c = "io.nodle.sdk.utils.DebugKt", f = "Debug.kt", l = {30}, m = "ignoreException")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f2998a;

        /* renamed from: b  reason: collision with root package name */
        public int f2999b;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2998a = obj;
            this.f2999b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return b.a((l<? super d<Object>, ? extends Object>) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(xd.l<? super pd.d<java.lang.Object>, ? extends java.lang.Object> r4, pd.d<java.lang.Object> r5) {
        /*
            boolean r0 = r5 instanceof bf.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            bf.b$a r0 = (bf.b.a) r0
            int r1 = r0.f2999b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2999b = r1
            goto L_0x0018
        L_0x0013:
            bf.b$a r0 = new bf.b$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f2998a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f2999b
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            l6.b1.w(r5)     // Catch:{ Exception -> 0x003d }
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            l6.b1.w(r5)
            r0.f2999b = r3     // Catch:{ Exception -> 0x003d }
            qi.a$d r4 = (qi.a.d) r4     // Catch:{ Exception -> 0x003d }
            java.lang.Object r5 = r4.k(r0)     // Catch:{ Exception -> 0x003d }
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x003d:
            r4 = move-exception
            r4.printStackTrace()
            md.m r5 = md.m.f8555a
        L_0x0043:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.b.a(xd.l, pd.d):java.lang.Object");
    }

    public static final boolean b(xd.a<m> aVar) {
        try {
            aVar.c();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
