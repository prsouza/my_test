package hb;

import android.util.Log;
import android.view.View;
import androidx.appcompat.app.c;
import d9.g;
import ge.d0;
import h.f;
import h.q;
import h.r;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

public class a extends c {

    /* renamed from: s  reason: collision with root package name */
    public static final C0097a f5902s = new C0097a();

    /* renamed from: t  reason: collision with root package name */
    public static boolean f5903t;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f5904u;

    /* renamed from: b  reason: collision with root package name */
    public final String f5905b = a.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public final long f5906c = 3000;

    /* renamed from: hb.a$a  reason: collision with other inner class name */
    public static final class C0097a {
    }

    @e(c = "io.nodle.cash.ui.view.activity.BaseActivity$onPause$1", f = "BaseActivity.kt", l = {38}, m = "invokeSuspend")
    public static final class b extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f5907a;

        /* renamed from: b  reason: collision with root package name */
        public int f5908b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f5909c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, d<? super b> dVar) {
            super(2, dVar);
            this.f5909c = aVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f5909c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                qd.a r0 = qd.a.COROUTINE_SUSPENDED
                int r1 = r9.f5908b
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0019
                if (r1 != r3) goto L_0x0011
                int r1 = r9.f5907a
                l6.b1.w(r10)
                r10 = r9
                goto L_0x003a
            L_0x0011:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0019:
                l6.b1.w(r10)
                r10 = r9
                r1 = r2
            L_0x001e:
                hb.a$a r4 = hb.a.f5902s
                boolean r4 = hb.a.f5904u
                if (r4 != 0) goto L_0x003d
                long r5 = (long) r1
                hb.a r7 = r10.f5909c
                long r7 = r7.f5906c
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x003d
                r4 = 200(0xc8, double:9.9E-322)
                r10.f5907a = r1
                r10.f5908b = r3
                java.lang.Object r4 = c3.k.f0(r4, r10)
                if (r4 != r0) goto L_0x003a
                return r0
            L_0x003a:
                int r1 = r1 + 200
                goto L_0x001e
            L_0x003d:
                if (r4 != 0) goto L_0x0050
                hb.a r10 = r10.f5909c
                java.lang.String r0 = r10.f5905b
                java.lang.String r1 = "User has exited the app."
                android.util.Log.d(r0, r1)
                za.d r0 = za.d.f14195a
                r0.a(r10)
                hb.a.f5903t = r2
                goto L_0x0059
            L_0x0050:
                hb.a r10 = r10.f5909c
                java.lang.String r10 = r10.f5905b
                java.lang.String r0 = "User still on the app."
                android.util.Log.d(r10, r0)
            L_0x0059:
                md.m r10 = md.m.f8555a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: hb.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a() {
        new LinkedHashMap();
    }

    public final f h() {
        r rVar;
        f h10 = super.h();
        e6.e.C(h10, "super.getDelegate()");
        g gVar = d9.f.f4377a;
        WeakHashMap<c, WeakReference<r>> weakHashMap = d9.f.f4378b;
        WeakReference weakReference = weakHashMap.get(this);
        if (weakReference != null && (rVar = (r) weakReference.get()) != null) {
            return rVar;
        }
        q qVar = new q(h10, this);
        weakHashMap.put(this, new WeakReference(qVar));
        return qVar;
    }

    public void onClickBack(View view) {
        e6.e.D(view, "view");
        onBackPressed();
    }

    public final void onPause() {
        super.onPause();
        f5904u = false;
        ge.g.b(jc.b.u(this), (pd.f) null, new b(this, (d<? super b>) null), 3);
    }

    public final void onResume() {
        super.onResume();
        f5904u = true;
        if (!f5903t) {
            f5903t = true;
            Log.d(this.f5905b, "User has entered the app.");
        }
    }
}
