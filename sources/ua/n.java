package ua;

import ge.d0;
import ge.g1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.data.repository.TransactionsRepository2$getRemoteTransactions$2", f = "TransactionsRepository2.kt", l = {80, 81, 82}, m = "invokeSuspend")
public final class n extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public g1 f11880a;

    /* renamed from: b  reason: collision with root package name */
    public int f11881b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f11882c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f11883s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(l lVar, long j10, d<? super n> dVar) {
        super(2, dVar);
        this.f11882c = lVar;
        this.f11883s = j10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new n(this.f11882c, this.f11883s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r10.f11881b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r5) goto L_0x0022
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            l6.b1.w(r11)
            goto L_0x0080
        L_0x0014:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001c:
            ge.g1 r1 = r10.f11880a
            l6.b1.w(r11)
            goto L_0x006c
        L_0x0022:
            l6.b1.w(r11)
            goto L_0x0053
        L_0x0026:
            l6.b1.w(r11)
            ua.l r11 = r10.f11882c
            ah.v r11 = r11.f11857e
            java.util.Objects.requireNonNull(r11)
            long r6 = java.lang.System.currentTimeMillis()
            ua.l r11 = r10.f11882c
            int r1 = r11.f11861k
            long r8 = (long) r1
            long r6 = r6 - r8
            long r8 = r10.f11883s
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0043
            md.m r11 = md.m.f8555a
            return r11
        L_0x0043:
            r10.f11881b = r5
            le.d r1 = r11.f11862l
            ua.p r6 = new ua.p
            r6.<init>(r11, r8, r2)
            ge.g1 r11 = ge.g.b(r1, r2, r6, r3)
            if (r11 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r1 = r11
            ge.g1 r1 = (ge.g1) r1
            ua.l r11 = r10.f11882c
            long r6 = r10.f11883s
            r10.f11880a = r1
            r10.f11881b = r4
            le.d r8 = r11.f11862l
            ua.o r9 = new ua.o
            r9.<init>(r11, r6, r2)
            ge.g1 r11 = ge.g.b(r8, r2, r9, r3)
            if (r11 != r0) goto L_0x006c
            return r0
        L_0x006c:
            ge.g1 r11 = (ge.g1) r11
            ge.g1[] r4 = new ge.g1[r4]
            r6 = 0
            r4[r6] = r1
            r4[r5] = r11
            r10.f11880a = r2
            r10.f11881b = r3
            java.lang.Object r11 = ge.c.b(r4, r10)
            if (r11 != r0) goto L_0x0080
            return r0
        L_0x0080:
            md.m r11 = md.m.f8555a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
