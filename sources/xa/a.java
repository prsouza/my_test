package xa;

import android.content.Context;
import androidx.lifecycle.j0;
import ge.d0;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.domain.Permissions$enableBluetooth$1", f = "Permissions.kt", l = {55}, m = "invokeSuspend")
public final class a extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public long f13151a;

    /* renamed from: b  reason: collision with root package name */
    public long f13152b;

    /* renamed from: c  reason: collision with root package name */
    public int f13153c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Context f13154s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ j0<Boolean> f13155t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, j0<Boolean> j0Var, d<? super a> dVar) {
        super(2, dVar);
        this.f13154s = context;
        this.f13155t = j0Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f13154s, this.f13155t, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r11.f13153c
            r2 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            long r3 = r11.f13152b
            long r5 = r11.f13151a
            l6.b1.w(r12)
            r12 = r11
            goto L_0x0038
        L_0x0012:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001a:
            l6.b1.w(r12)
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 10000(0x2710, double:4.9407E-320)
            r12 = r11
            r9 = r3
            r3 = r5
            r5 = r9
        L_0x0025:
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x004a
            r12.f13151a = r5
            r12.f13152b = r3
            r12.f13153c = r2
            java.lang.Object r1 = c3.k.f0(r5, r12)
            if (r1 != r0) goto L_0x0038
            return r0
        L_0x0038:
            android.content.Context r1 = r12.f13154s
            boolean r1 = ad.c.Z(r1)
            if (r1 == 0) goto L_0x0048
            androidx.lifecycle.j0<java.lang.Boolean> r12 = r12.f13155t
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r12.k(r0)
            goto L_0x004a
        L_0x0048:
            long r3 = r3 - r5
            goto L_0x0025
        L_0x004a:
            md.m r12 = md.m.f8555a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
