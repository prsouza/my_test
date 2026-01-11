package io.nodle.cash.ui.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import c3.k;
import ge.d0;
import ge.g;
import ge.g0;
import ge.o0;
import l6.b1;
import le.d;
import md.m;
import ne.c;
import pd.f;
import rd.e;
import rd.i;
import xd.p;

public final class NodleService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6698a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final c f6699b = ((c) g0.i());

    /* renamed from: c  reason: collision with root package name */
    public static final d f6700c = ((d) k.j(o0.f5433a.plus(ad.c.b())));

    public static final class a {

        @e(c = "io.nodle.cash.ui.service.NodleService$Companion$startService$1", f = "NodleService.kt", l = {34, 38, 38}, m = "invokeSuspend")
        /* renamed from: io.nodle.cash.ui.service.NodleService$a$a  reason: collision with other inner class name */
        public static final class C0115a extends i implements p<d0, pd.d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public Throwable f6701a;

            /* renamed from: b  reason: collision with root package name */
            public int f6702b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Context f6703c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0115a(Context context, pd.d<? super C0115a> dVar) {
                super(2, dVar);
                this.f6703c = context;
            }

            public final pd.d<m> create(Object obj, pd.d<?> dVar) {
                return new C0115a(this.f6703c, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0115a) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    qd.a r0 = qd.a.COROUTINE_SUSPENDED
                    int r1 = r9.f6702b
                    r2 = 0
                    r3 = 6000(0x1770, double:2.9644E-320)
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L_0x0028
                    if (r1 == r7) goto L_0x0024
                    if (r1 == r6) goto L_0x0020
                    if (r1 != r5) goto L_0x0018
                    java.lang.Throwable r0 = r9.f6701a
                    l6.b1.w(r10)
                    goto L_0x0074
                L_0x0018:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L_0x0020:
                    l6.b1.w(r10)
                    goto L_0x0059
                L_0x0024:
                    l6.b1.w(r10)     // Catch:{ all -> 0x0067 }
                    goto L_0x0036
                L_0x0028:
                    l6.b1.w(r10)
                    ne.c r10 = io.nodle.cash.ui.service.NodleService.f6699b     // Catch:{ all -> 0x0067 }
                    r9.f6702b = r7     // Catch:{ all -> 0x0067 }
                    java.lang.Object r10 = ((ne.c) r10).b((java.lang.Object) null, r9)     // Catch:{ all -> 0x0067 }
                    if (r10 != r0) goto L_0x0036
                    return r0
                L_0x0036:
                    android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x0067 }
                    android.content.Context r1 = r9.f6703c     // Catch:{ all -> 0x0067 }
                    java.lang.Class<io.nodle.cash.ui.service.NodleService> r7 = io.nodle.cash.ui.service.NodleService.class
                    r10.<init>(r1, r7)     // Catch:{ all -> 0x0067 }
                    android.content.Context r1 = r9.f6703c     // Catch:{ all -> 0x0067 }
                    java.lang.Object r7 = d0.a.f4256a     // Catch:{ all -> 0x0067 }
                    int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0067 }
                    r8 = 26
                    if (r7 < r8) goto L_0x004d
                    d0.a.e.a(r1, r10)     // Catch:{ all -> 0x0067 }
                    goto L_0x0050
                L_0x004d:
                    r1.startService(r10)     // Catch:{ all -> 0x0067 }
                L_0x0050:
                    r9.f6702b = r6
                    java.lang.Object r10 = c3.k.f0(r3, r9)
                    if (r10 != r0) goto L_0x0059
                    return r0
                L_0x0059:
                    ne.c r10 = io.nodle.cash.ui.service.NodleService.f6699b
                    boolean r0 = r10.c()
                    if (r0 == 0) goto L_0x0064
                    r10.a(r2)
                L_0x0064:
                    md.m r10 = md.m.f8555a
                    return r10
                L_0x0067:
                    r10 = move-exception
                    r9.f6701a = r10
                    r9.f6702b = r5
                    java.lang.Object r1 = c3.k.f0(r3, r9)
                    if (r1 != r0) goto L_0x0073
                    return r0
                L_0x0073:
                    r0 = r10
                L_0x0074:
                    ne.c r10 = io.nodle.cash.ui.service.NodleService.f6699b
                    boolean r1 = r10.c()
                    if (r1 == 0) goto L_0x007f
                    r10.a(r2)
                L_0x007f:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.service.NodleService.a.C0115a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public final void a(Context context) {
            g.b(NodleService.f6700c, (f) null, new C0115a(context, (pd.d<? super C0115a>) null), 3);
        }
    }

    @e(c = "io.nodle.cash.ui.service.NodleService$onStartCommand$1", f = "NodleService.kt", l = {76}, m = "invokeSuspend")
    public static final class b extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6704a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NodleService f6705b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(NodleService nodleService, pd.d<? super b> dVar) {
            super(2, dVar);
            this.f6705b = nodleService;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new b(this.f6705b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f6704a;
            if (i == 0 || i == 1) {
                b1.w(obj);
                do {
                    Context applicationContext = this.f6705b.getApplicationContext();
                    e6.e.C(applicationContext, "applicationContext");
                    if (ad.c.Q(applicationContext)) {
                        this.f6704a = 1;
                    } else {
                        za.d dVar = za.d.f14195a;
                        Context applicationContext2 = this.f6705b.getApplicationContext();
                        e6.e.C(applicationContext2, "applicationContext");
                        dVar.b(applicationContext2);
                        return m.f8555a;
                    }
                } while (k.f0(1000, this) != aVar);
                return aVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        Class<NodleService> cls = NodleService.class;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        Log.d("NodleService", "onCreate ");
        Context applicationContext = getApplicationContext();
        e6.e.C(applicationContext, "applicationContext");
        Context applicationContext2 = getApplicationContext();
        e6.e.C(applicationContext2, "applicationContext");
        startForeground(9999, cb.c.a(applicationContext, ad.c.K(applicationContext2)));
        c cVar = f6699b;
        if (cVar.c()) {
            cVar.a((Object) null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        Log.d("NodleService", "onDestroy ");
    }

    public final int onStartCommand(Intent intent, int i, int i10) {
        Log.d("NodleService", "onStartCommand");
        za.d dVar = za.d.f14195a;
        Context applicationContext = getApplicationContext();
        e6.e.C(applicationContext, "applicationContext");
        if (!dVar.c(applicationContext)) {
            Context applicationContext2 = getApplicationContext();
            e6.e.C(applicationContext2, "applicationContext");
            dVar.b(applicationContext2);
        }
        g.b(k.j(o0.f5433a), (f) null, new b(this, (pd.d<? super b>) null), 3);
        return 1;
    }
}
