package tb;

import ge.d0;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xa.c;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.TransactViewModel$performTransfer$1", f = "TransactViewModel.kt", l = {349, 351, 352, 360}, m = "invokeSuspend")
public final class t extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public Object f11522a;

    /* renamed from: b  reason: collision with root package name */
    public int f11523b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TransactViewModel f11524c;

    @e(c = "io.nodle.cash.ui.viewmodel.TransactViewModel$performTransfer$1$1$1", f = "TransactViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TransactViewModel f11525a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(TransactViewModel transactViewModel, d<? super a> dVar) {
            super(2, dVar);
            this.f11525a = transactViewModel;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f11525a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = m.f8555a;
            ((a) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
            return mVar;
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            b1.w(obj);
            TransactViewModel transactViewModel = this.f11525a;
            transactViewModel.C = true;
            transactViewModel.F.k(new c(c.b.HIDE, R.string.paymentSuccess, c.a.SUCCESS));
            ri.a.f10801a.a("performTransfer SUCCESS", new Object[0]);
            return m.f8555a;
        }
    }

    @e(c = "io.nodle.cash.ui.viewmodel.TransactViewModel$performTransfer$1$2", f = "TransactViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class b extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TransactViewModel f11526a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(TransactViewModel transactViewModel, d<? super b> dVar) {
            super(2, dVar);
            this.f11526a = transactViewModel;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f11526a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = m.f8555a;
            ((b) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
            return mVar;
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            b1.w(obj);
            this.f11526a.F.k(new c(c.b.HIDE, R.string.somethingWrong, c.a.FAILURE));
            ri.a.f10801a.a("performTransfer FAILURE", new Object[0]);
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(TransactViewModel transactViewModel, d<? super t> dVar) {
        super(2, dVar);
        this.f11524c = transactViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new t(this.f11524c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r8.f11523b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0036
            if (r1 == r5) goto L_0x0030
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            java.lang.Object r0 = r8.f11522a
            java.lang.Exception r0 = (java.lang.Exception) r0
            l6.b1.w(r9)
            goto L_0x008b
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0024:
            l6.b1.w(r9)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0092
        L_0x0028:
            java.lang.Object r1 = r8.f11522a
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = (io.nodle.cash.ui.viewmodel.TransactViewModel) r1
            l6.b1.w(r9)     // Catch:{ Exception -> 0x0034 }
            goto L_0x005b
        L_0x0030:
            l6.b1.w(r9)     // Catch:{ Exception -> 0x0034 }
            goto L_0x004c
        L_0x0034:
            r9 = move-exception
            goto L_0x006f
        L_0x0036:
            l6.b1.w(r9)
            za.h r9 = za.h.f14215a     // Catch:{ Exception -> 0x0034 }
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r8.f11524c     // Catch:{ Exception -> 0x0034 }
            android.content.Context r7 = r1.f6813s     // Catch:{ Exception -> 0x0034 }
            sa.b r1 = r1.B     // Catch:{ Exception -> 0x0034 }
            java.lang.String r1 = r1.f11044x     // Catch:{ Exception -> 0x0034 }
            r8.f11523b = r5     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r9 = r9.l(r7, r1, r8)     // Catch:{ Exception -> 0x0034 }
            if (r9 != r0) goto L_0x004c
            return r0
        L_0x004c:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0034 }
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r8.f11524c     // Catch:{ Exception -> 0x0034 }
            r8.f11522a = r1     // Catch:{ Exception -> 0x0034 }
            r8.f11523b = r4     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r9 = io.nodle.cash.ui.viewmodel.TransactViewModel.i(r1, r9, r8)     // Catch:{ Exception -> 0x0034 }
            if (r9 != r0) goto L_0x005b
            return r0
        L_0x005b:
            me.c r9 = ge.o0.f5433a     // Catch:{ Exception -> 0x0034 }
            ge.n1 r9 = le.l.f8259a     // Catch:{ Exception -> 0x0034 }
            tb.t$a r4 = new tb.t$a     // Catch:{ Exception -> 0x0034 }
            r4.<init>(r1, r6)     // Catch:{ Exception -> 0x0034 }
            r8.f11522a = r6     // Catch:{ Exception -> 0x0034 }
            r8.f11523b = r3     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r9 = ge.g.d(r9, r4, r8)     // Catch:{ Exception -> 0x0034 }
            if (r9 != r0) goto L_0x0092
            return r0
        L_0x006f:
            ri.a$a r1 = ri.a.f10801a
            r1.c(r9)
            me.c r1 = ge.o0.f5433a
            ge.n1 r1 = le.l.f8259a
            tb.t$b r3 = new tb.t$b
            io.nodle.cash.ui.viewmodel.TransactViewModel r4 = r8.f11524c
            r3.<init>(r4, r6)
            r8.f11522a = r9
            r8.f11523b = r2
            java.lang.Object r1 = ge.g.d(r1, r3, r8)
            if (r1 != r0) goto L_0x008a
            return r0
        L_0x008a:
            r0 = r9
        L_0x008b:
            t7.g r9 = t7.g.a()
            r9.b(r0)
        L_0x0092:
            md.m r9 = md.m.f8555a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
