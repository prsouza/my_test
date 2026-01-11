package xa;

import android.app.Activity;
import androidx.lifecycle.j0;
import ge.d0;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.domain.Permissions$enableLocation$3", f = "Permissions.kt", l = {154}, m = "invokeSuspend")
public final class b extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public long f13156a;

    /* renamed from: b  reason: collision with root package name */
    public long f13157b;

    /* renamed from: c  reason: collision with root package name */
    public int f13158c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Activity f13159s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ j0<Boolean> f13160t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Activity activity, j0<Boolean> j0Var, d<? super b> dVar) {
        super(2, dVar);
        this.f13159s = activity;
        this.f13160t = j0Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f13159s, this.f13160t, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r11.f13158c
            r2 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            long r3 = r11.f13157b
            long r5 = r11.f13156a
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
            r12.f13156a = r5
            r12.f13157b = r3
            r12.f13158c = r2
            java.lang.Object r1 = c3.k.f0(r5, r12)
            if (r1 != r0) goto L_0x0038
            return r0
        L_0x0038:
            android.app.Activity r1 = r12.f13159s
            boolean r1 = ad.c.a0(r1)
            if (r1 == 0) goto L_0x0048
            androidx.lifecycle.j0<java.lang.Boolean> r12 = r12.f13160t
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
        throw new UnsupportedOperationException("Method not decompiled: xa.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
