package ab;

import android.util.Log;
import androidx.lifecycle.j0;
import ge.d0;
import ge.g;
import ge.g0;
import ge.o0;
import l6.b1;
import md.m;
import ne.c;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import pd.f;
import rd.e;
import rd.i;
import xd.p;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f279a = new k();

    /* renamed from: b  reason: collision with root package name */
    public static final c f280b = ((c) g0.i());

    /* renamed from: c  reason: collision with root package name */
    public static final j0<i> f281c = new j0<>();

    /* renamed from: d  reason: collision with root package name */
    public static i f282d;

    @e(c = "io.nodle.cash.domain.manager.NoticeManager", f = "NoticeManager.kt", l = {40}, m = "addNotice")
    public static final class a extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public k f283a;

        /* renamed from: b  reason: collision with root package name */
        public i f284b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f285c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ k f286s;

        /* renamed from: t  reason: collision with root package name */
        public int f287t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(k kVar, d<? super a> dVar) {
            super(dVar);
            this.f286s = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f285c = obj;
            this.f287t |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f286s.a((i) null, this);
        }
    }

    @e(c = "io.nodle.cash.domain.manager.NoticeManager$notice$1", f = "NoticeManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f288a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i iVar, d<? super b> dVar) {
            super(2, dVar);
            this.f288a = iVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f288a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = m.f8555a;
            ((b) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
            return mVar;
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            b1.w(obj);
            k kVar = k.f279a;
            k.f281c.k(this.f288a);
            return m.f8555a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(ab.i r5, pd.d<? super md.m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ab.k.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ab.k$a r0 = (ab.k.a) r0
            int r1 = r0.f287t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f287t = r1
            goto L_0x0018
        L_0x0013:
            ab.k$a r0 = new ab.k$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f285c
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f287t
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            ab.i r5 = r0.f284b
            ab.k r0 = r0.f283a
            l6.b1.w(r6)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            l6.b1.w(r6)
            ne.c r6 = f280b
            r0.f283a = r4
            r0.f284b = r5
            r0.f287t = r3
            r2 = 0
            java.lang.Object r6 = ((ne.c) r6).b((java.lang.Object) null, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r0 = r4
        L_0x0047:
            r0.b(r5)
            md.m r5 = md.m.f8555a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.k.a(ab.i, pd.d):java.lang.Object");
    }

    public final void b(i iVar) {
        f282d = iVar;
        Log.d("k", "Notice: " + iVar);
        g.b(c3.k.j(o0.f5433a), (f) null, new b(iVar, (d<? super b>) null), 3);
    }
}
