package ua;

import ge.d0;
import java.util.List;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.data.repository.TransactionsRepository2$getSubscanTransactions$2", f = "TransactionsRepository2.kt", l = {111, 113, 116}, m = "invokeSuspend")
public final class o extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public long f11884a;

    /* renamed from: b  reason: collision with root package name */
    public List f11885b;

    /* renamed from: c  reason: collision with root package name */
    public List f11886c;

    /* renamed from: s  reason: collision with root package name */
    public int f11887s;

    /* renamed from: t  reason: collision with root package name */
    public int f11888t;

    /* renamed from: u  reason: collision with root package name */
    public int f11889u;

    /* renamed from: v  reason: collision with root package name */
    public int f11890v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l f11891w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f11892x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(l lVar, long j10, d<? super o> dVar) {
        super(2, dVar);
        this.f11891w = lVar;
        this.f11892x = j10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new o(this.f11891w, this.f11892x, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f11890v
            r3 = 0
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x0035
            if (r2 == r6) goto L_0x0020
            if (r2 != r4) goto L_0x0018
            l6.b1.w(r19)
            goto L_0x0106
        L_0x0018:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0020:
            int r2 = r0.f11889u
            int r7 = r0.f11888t
            int r8 = r0.f11887s
            long r9 = r0.f11884a
            java.util.List r11 = r0.f11885b
            l6.b1.w(r19)
            r12 = r0
        L_0x002e:
            r16 = r9
            r10 = r8
            r8 = r16
            goto L_0x00f7
        L_0x0035:
            int r2 = r0.f11889u
            int r7 = r0.f11888t
            int r8 = r0.f11887s
            long r9 = r0.f11884a
            java.util.List r11 = r0.f11886c
            java.util.List r12 = r0.f11885b
            l6.b1.w(r19)
            r13 = r19
            r14 = r0
            goto L_0x00d2
        L_0x0049:
            l6.b1.w(r19)
            ri.a$a r2 = ri.a.f10801a
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = "Subscan request start"
            r2.a(r9, r8)
            ua.l r8 = r0.f11891w
            ge.g0 r8 = r8.f11858f
            java.util.Objects.requireNonNull(r8)
            r8 = 1653307200000(0x180f0c9d200, double:8.16842289542E-312)
            long r10 = r0.f11892x
            long r8 = java.lang.Math.max(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            ua.l r11 = r0.f11891w
            ah.v r12 = r11.f11857e
            java.util.Objects.requireNonNull(r12)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r8
            r14 = 1000(0x3e8, float:1.401E-42)
            long r14 = (long) r14
            long r12 = r12 / r14
            r14 = 60
            long r14 = (long) r14
            long r12 = r12 / r14
            long r12 = r12 / r14
            r14 = 24
            long r14 = (long) r14
            long r12 = r12 / r14
            r14 = 6
            long r14 = (long) r14
            long r12 = r12 * r14
            int r11 = r11.i
            long r14 = (long) r11
            long r12 = r12 / r14
            r14 = 1
            long r11 = java.lang.Math.max(r14, r12)
            int r11 = (int) r11
            java.lang.String r12 = "Subscan estimated requests number = "
            java.lang.String r12 = b9.m.b(r12, r11)
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r2.a(r12, r13)
            int r2 = r11 * 2
            r12 = r0
            r16 = r11
            r11 = r10
            r10 = r16
        L_0x00a6:
            if (r7 >= r2) goto L_0x00f9
            ua.l r13 = r12.f11891w
            java.util.concurrent.atomic.AtomicInteger r13 = r13.f11863m
            int r13 = r13.get()
            if (r13 <= r7) goto L_0x00f9
            ua.l r13 = r12.f11891w
            int r14 = r13.f11860j
            r12.f11885b = r11
            r12.f11886c = r11
            r12.f11884a = r8
            r12.f11887s = r10
            r12.f11888t = r7
            r12.f11889u = r2
            r12.f11890v = r5
            java.lang.Object r13 = ua.l.a(r13, r7, r8, r14)
            if (r13 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            r14 = r12
            r12 = r11
            r16 = r8
            r8 = r10
            r9 = r16
        L_0x00d2:
            r11.add(r13)
            int r11 = r7 % 5
            r13 = 4
            if (r11 == r13) goto L_0x00de
            int r11 = r8 + -1
            if (r7 != r11) goto L_0x00f3
        L_0x00de:
            r14.f11885b = r12
            r14.f11886c = r3
            r14.f11884a = r9
            r14.f11887s = r8
            r14.f11888t = r7
            r14.f11889u = r2
            r14.f11890v = r6
            java.lang.Object r11 = ge.c.a(r12, r14)
            if (r11 != r1) goto L_0x00f3
            return r1
        L_0x00f3:
            r11 = r12
            r12 = r14
            goto L_0x002e
        L_0x00f7:
            int r7 = r7 + r5
            goto L_0x00a6
        L_0x00f9:
            r12.f11885b = r3
            r12.f11886c = r3
            r12.f11890v = r4
            java.lang.Object r2 = ge.c.a(r11, r12)
            if (r2 != r1) goto L_0x0106
            return r1
        L_0x0106:
            md.m r1 = md.m.f8555a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
