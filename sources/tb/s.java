package tb;

import ge.d0;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import sa.b;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.TransactViewModel$getTransactionFees$1", f = "TransactViewModel.kt", l = {290, 298}, m = "invokeSuspend")
public final class s extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public b f11519a;

    /* renamed from: b  reason: collision with root package name */
    public int f11520b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TransactViewModel f11521c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(TransactViewModel transactViewModel, d<? super s> dVar) {
        super(2, dVar);
        this.f11521c = transactViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new s(this.f11521c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d3 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0185 A[Catch:{ Exception -> 0x0194 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r7 = r25
            java.lang.String r0 = "this.add(other)"
            qd.a r8 = qd.a.COROUTINE_SUSPENDED
            int r1 = r7.f11520b
            r2 = 1
            r9 = 0
            r10 = 2
            if (r1 == 0) goto L_0x002c
            if (r1 == r2) goto L_0x0023
            if (r1 != r10) goto L_0x001b
            sa.b r1 = r7.f11519a
            l6.b1.w(r26)     // Catch:{ Exception -> 0x0194 }
            r2 = r1
            r1 = r26
            goto L_0x00a9
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            sa.b r1 = r7.f11519a
            l6.b1.w(r26)     // Catch:{ Exception -> 0x0194 }
            r11 = r1
            r1 = r26
            goto L_0x008f
        L_0x002c:
            l6.b1.w(r26)
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            je.o r1 = r1.f6819y     // Catch:{ Exception -> 0x0194 }
        L_0x0033:
            java.lang.Object r3 = r1.getValue()     // Catch:{ Exception -> 0x0194 }
            r11 = r3
            gb.i r11 = (gb.i) r11     // Catch:{ Exception -> 0x0194 }
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 3903(0xf3f, float:5.469E-42)
            gb.i r4 = gb.i.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0194 }
            boolean r3 = r1.g(r3, r4)     // Catch:{ Exception -> 0x0194 }
            if (r3 == 0) goto L_0x0033
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            sa.b r11 = r1.B     // Catch:{ Exception -> 0x0194 }
            za.h r3 = za.h.f14215a     // Catch:{ Exception -> 0x0194 }
            android.content.Context r4 = r1.f6813s     // Catch:{ Exception -> 0x0194 }
            qa.f r1 = r1.f6815u     // Catch:{ Exception -> 0x0194 }
            qa.e r5 = qa.e.MNEMONIC     // Catch:{ Exception -> 0x0194 }
            java.lang.String r1 = r1.c(r5)     // Catch:{ Exception -> 0x0194 }
            java.util.List r5 = ub.f.d(r1)     // Catch:{ Exception -> 0x0194 }
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            sa.b r1 = r1.B     // Catch:{ Exception -> 0x0194 }
            java.lang.String r6 = r1.f11037b     // Catch:{ Exception -> 0x0194 }
            e6.e.B(r6)     // Catch:{ Exception -> 0x0194 }
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            sa.b r1 = r1.B     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r12 = r1.f11038c     // Catch:{ Exception -> 0x0194 }
            r7.f11519a = r11     // Catch:{ Exception -> 0x0194 }
            r7.f11520b = r2     // Catch:{ Exception -> 0x0194 }
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r12
            r6 = r25
            java.lang.Object r1 = r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0194 }
            if (r1 != r8) goto L_0x008f
            return r8
        L_0x008f:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0194 }
            r11.d(r1)     // Catch:{ Exception -> 0x0194 }
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            sa.b r2 = r1.B     // Catch:{ Exception -> 0x0194 }
            za.h r3 = za.h.f14215a     // Catch:{ Exception -> 0x0194 }
            android.content.Context r1 = r1.f6813s     // Catch:{ Exception -> 0x0194 }
            java.lang.String r4 = r2.f11044x     // Catch:{ Exception -> 0x0194 }
            r7.f11519a = r2     // Catch:{ Exception -> 0x0194 }
            r7.f11520b = r10     // Catch:{ Exception -> 0x0194 }
            java.lang.Object r1 = r3.k(r1, r4, r7)     // Catch:{ Exception -> 0x0194 }
            if (r1 != r8) goto L_0x00a9
            return r8
        L_0x00a9:
            java.math.BigInteger r1 = (java.math.BigInteger) r1     // Catch:{ Exception -> 0x0194 }
            r2.f11039s = r1     // Catch:{ Exception -> 0x0194 }
            ri.a$a r1 = ri.a.f10801a     // Catch:{ Exception -> 0x0194 }
            io.nodle.cash.ui.viewmodel.TransactViewModel r2 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            sa.b r2 = r2.B     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r2 = r2.f11039s     // Catch:{ Exception -> 0x0194 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0194 }
            r3.<init>()     // Catch:{ Exception -> 0x0194 }
            java.lang.String r4 = "getTransactionFees "
            r3.append(r4)     // Catch:{ Exception -> 0x0194 }
            r3.append(r2)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0194 }
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0194 }
            r1.a(r2, r3)     // Catch:{ Exception -> 0x0194 }
            io.nodle.cash.ui.viewmodel.TransactViewModel r2 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            sa.b r3 = r2.B     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r3 = r3.f11039s     // Catch:{ Exception -> 0x0194 }
            if (r3 == 0) goto L_0x0185
            je.o r1 = r2.f6819y     // Catch:{ Exception -> 0x0194 }
        L_0x00d5:
            java.lang.Object r3 = r1.getValue()     // Catch:{ Exception -> 0x0194 }
            r10 = r3
            gb.i r10 = (gb.i) r10     // Catch:{ Exception -> 0x0194 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            ah.v r4 = ah.v.G     // Catch:{ Exception -> 0x0194 }
            sa.b r5 = r2.B     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r5 = r5.f11039s     // Catch:{ Exception -> 0x0194 }
            e6.e.B(r5)     // Catch:{ Exception -> 0x0194 }
            r6 = 11
            java.lang.String r15 = r4.H(r5, r6)     // Catch:{ Exception -> 0x0194 }
            sa.b r5 = r2.B     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r8 = r5.f11038c     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r5 = r5.f11039s     // Catch:{ Exception -> 0x0194 }
            e6.e.B(r5)     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r5 = r8.add(r5)     // Catch:{ Exception -> 0x0194 }
            e6.e.C(r5, r0)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r16 = r4.H(r5, r6)     // Catch:{ Exception -> 0x0194 }
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 3919(0xf4f, float:5.492E-42)
            gb.i r4 = gb.i.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0194 }
            boolean r3 = r1.g(r3, r4)     // Catch:{ Exception -> 0x0194 }
            if (r3 == 0) goto L_0x00d5
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            sa.b r2 = r1.B     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r2 = r2.f11038c     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r1 = r1.A     // Catch:{ Exception -> 0x0194 }
            int r1 = r2.compareTo(r1)     // Catch:{ Exception -> 0x0194 }
            r2 = 0
            if (r1 <= 0) goto L_0x0134
            io.nodle.cash.ui.viewmodel.TransactViewModel r0 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            r1 = 2131755197(0x7f1000bd, float:1.9141266E38)
            io.nodle.cash.ui.viewmodel.TransactViewModel.j(r0, r1, r2)     // Catch:{ Exception -> 0x0194 }
            goto L_0x01eb
        L_0x0134:
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            sa.b r1 = r1.B     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r3 = r1.f11038c     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r1 = r1.f11039s     // Catch:{ Exception -> 0x0194 }
            e6.e.B(r1)     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r1 = r3.add(r1)     // Catch:{ Exception -> 0x0194 }
            e6.e.C(r1, r0)     // Catch:{ Exception -> 0x0194 }
            io.nodle.cash.ui.viewmodel.TransactViewModel r0 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            java.math.BigInteger r0 = r0.A     // Catch:{ Exception -> 0x0194 }
            int r0 = r1.compareTo(r0)     // Catch:{ Exception -> 0x0194 }
            if (r0 <= 0) goto L_0x015a
            io.nodle.cash.ui.viewmodel.TransactViewModel r0 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            r1 = 2131755198(0x7f1000be, float:1.9141269E38)
            io.nodle.cash.ui.viewmodel.TransactViewModel.j(r0, r1, r2)     // Catch:{ Exception -> 0x0194 }
            goto L_0x01eb
        L_0x015a:
            io.nodle.cash.ui.viewmodel.TransactViewModel r0 = r7.f11521c     // Catch:{ Exception -> 0x0194 }
            je.o r0 = r0.f6819y     // Catch:{ Exception -> 0x0194 }
        L_0x015e:
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x0194 }
            r10 = r1
            gb.i r10 = (gb.i) r10     // Catch:{ Exception -> 0x0194 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 4031(0xfbf, float:5.649E-42)
            gb.i r2 = gb.i.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0194 }
            boolean r1 = r0.g(r1, r2)     // Catch:{ Exception -> 0x0194 }
            if (r1 == 0) goto L_0x015e
            goto L_0x01eb
        L_0x0185:
            java.lang.String r0 = "payInfo.fees == null"
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0194 }
            r1.a(r0, r2)     // Catch:{ Exception -> 0x0194 }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0194 }
            java.lang.String r1 = "Transaction fee is null"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0194 }
            throw r0     // Catch:{ Exception -> 0x0194 }
        L_0x0194:
            r0 = move-exception
            ri.a$a r1 = ri.a.f10801a
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = "pay error"
            r1.a(r3, r2)
            r1.c(r0)
            io.nodle.cash.ui.viewmodel.TransactViewModel r1 = r7.f11521c
            je.o r1 = r1.f6819y
        L_0x01a5:
            java.lang.Object r2 = r1.getValue()
            r8 = r2
            gb.i r8 = (gb.i) r8
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 3967(0xf7f, float:5.559E-42)
            gb.i r3 = gb.i.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r2 = r1.g(r2, r3)
            if (r2 == 0) goto L_0x01a5
            boolean r1 = r0 instanceof za.b
            if (r1 == 0) goto L_0x01da
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "\n["
            java.lang.String r3 = "]"
            java.lang.String r1 = androidx.fragment.app.o.c(r2, r1, r3)
            goto L_0x01dc
        L_0x01da:
            java.lang.String r1 = ""
        L_0x01dc:
            io.nodle.cash.ui.viewmodel.TransactViewModel r2 = r7.f11521c
            r3 = 2131755160(0x7f100098, float:1.9141191E38)
            io.nodle.cash.ui.viewmodel.TransactViewModel.j(r2, r3, r1)
            t7.g r1 = t7.g.a()
            r1.b(r0)
        L_0x01eb:
            md.m r0 = md.m.f8555a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
