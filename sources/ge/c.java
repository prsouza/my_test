package ge;

import java.util.Collection;
import java.util.Iterator;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.e;

public final class c {

    @e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {54}, m = "joinAll")
    public static final class a extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f5369a;

        /* renamed from: b  reason: collision with root package name */
        public int f5370b;

        /* renamed from: c  reason: collision with root package name */
        public int f5371c;

        /* renamed from: s  reason: collision with root package name */
        public /* synthetic */ Object f5372s;

        /* renamed from: t  reason: collision with root package name */
        public int f5373t;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f5372s = obj;
            this.f5373t |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return c.b((g1[]) null, this);
        }
    }

    @e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {66}, m = "joinAll")
    public static final class b extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public Iterator f5374a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f5375b;

        /* renamed from: c  reason: collision with root package name */
        public int f5376c;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f5375b = obj;
            this.f5376c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return c.a((Collection<? extends g1>) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.util.Collection<? extends ge.g1> r4, pd.d<? super md.m> r5) {
        /*
            boolean r0 = r5 instanceof ge.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ge.c$b r0 = (ge.c.b) r0
            int r1 = r0.f5376c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5376c = r1
            goto L_0x0018
        L_0x0013:
            ge.c$b r0 = new ge.c$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f5375b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f5376c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.util.Iterator r4 = r0.f5374a
            l6.b1.w(r5)
            goto L_0x0038
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            l6.b1.w(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0038:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            ge.g1 r5 = (ge.g1) r5
            r0.f5374a = r4
            r0.f5376c = r3
            java.lang.Object r5 = r5.t(r0)
            if (r5 != r1) goto L_0x0038
            return r1
        L_0x004f:
            md.m r4 = md.m.f8555a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.c.a(java.util.Collection, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(ge.g1[] r5, pd.d<? super md.m> r6) {
        /*
            boolean r0 = r6 instanceof ge.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ge.c$a r0 = (ge.c.a) r0
            int r1 = r0.f5373t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5373t = r1
            goto L_0x0018
        L_0x0013:
            ge.c$a r0 = new ge.c$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f5372s
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f5373t
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r5 = r0.f5371c
            int r2 = r0.f5370b
            java.lang.Object[] r4 = r0.f5369a
            ge.g1[] r4 = (ge.g1[]) r4
            l6.b1.w(r6)
            goto L_0x003e
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            l6.b1.w(r6)
            r2 = 0
            int r6 = r5.length
            r4 = r5
            r5 = r6
        L_0x003e:
            if (r2 >= r5) goto L_0x0053
            r6 = r4[r2]
            int r2 = r2 + 1
            r0.f5369a = r4
            r0.f5370b = r2
            r0.f5371c = r5
            r0.f5373t = r3
            java.lang.Object r6 = r6.t(r0)
            if (r6 != r1) goto L_0x003e
            return r1
        L_0x0053:
            md.m r5 = md.m.f8555a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.c.b(ge.g1[], pd.d):java.lang.Object");
    }
}
