package io.nodle.cash.ui.viewmodel;

import ah.v;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import bb.g;
import c3.k;
import com.google.gson.Gson;
import gb.h;
import gb.i;
import ge.d0;
import ge.o0;
import io.nodle.cash.data.local.CashDatabase;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import je.n;
import je.o;
import l6.b1;
import md.m;
import pd.d;
import qa.f;
import rd.e;
import ri.a;
import tb.s;
import xd.p;

public final class TransactViewModel extends androidx.lifecycle.b {
    public final BigInteger A;
    public sa.b B;
    public boolean C;
    public final j0<a> D;
    public final LiveData<a> E;
    public j0<xa.c> F;
    public final LiveData<xa.c> G;

    /* renamed from: s  reason: collision with root package name */
    public final Context f6813s;

    /* renamed from: t  reason: collision with root package name */
    public final String f6814t;

    /* renamed from: u  reason: collision with root package name */
    public final f f6815u;

    /* renamed from: v  reason: collision with root package name */
    public final String f6816v = "TransactViewModel";

    /* renamed from: w  reason: collision with root package name */
    public final String f6817w = "0";

    /* renamed from: x  reason: collision with root package name */
    public final int f6818x = 48;

    /* renamed from: y  reason: collision with root package name */
    public final o f6819y;
    public final n<i> z;

    public enum a {
        NONE,
        GET_AMOUNT,
        GET_TARGET_ACCOUNT,
        GET_CONFIRMATION,
        CANCEL,
        SHOW_PK4_ALERT
    }

    @e(c = "io.nodle.cash.ui.viewmodel.TransactViewModel$showAddressError$2$1", f = "TransactViewModel.kt", l = {399}, m = "invokeSuspend")
    public static final class b extends rd.i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6820a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f6821b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ TransactViewModel f6822c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(long j10, TransactViewModel transactViewModel, d<? super b> dVar) {
            super(2, dVar);
            this.f6821b = j10;
            this.f6822c = transactViewModel;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f6821b, this.f6822c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f6820a;
            if (i == 0) {
                b1.w(obj);
                long j10 = this.f6821b;
                this.f6820a = 1;
                if (k.f0(j10, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o oVar = this.f6822c.f6819y;
            do {
                value = oVar.getValue();
            } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (h) null, (Integer) null, (Integer) null, (String) null, 3583)));
            return m.f8555a;
        }
    }

    @e(c = "io.nodle.cash.ui.viewmodel.TransactViewModel$showAmountError$2", f = "TransactViewModel.kt", l = {383}, m = "invokeSuspend")
    public static final class c extends rd.i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6823a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TransactViewModel f6824b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(TransactViewModel transactViewModel, d<? super c> dVar) {
            super(2, dVar);
            this.f6824b = transactViewModel;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new c(this.f6824b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f6823a;
            if (i == 0) {
                b1.w(obj);
                this.f6823a = 1;
                if (k.f0(50, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o oVar = this.f6824b.f6819y;
            do {
                value = oVar.getValue();
            } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, h.NONE, (Integer) null, (Integer) null, (String) null, 3839)));
            return m.f8555a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TransactViewModel(android.content.Context r19, java.lang.String r20, qa.f r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r1
            android.app.Application r3 = (android.app.Application) r3
            r0.<init>(r3)
            r0.f6813s = r1
            r1 = r20
            r0.f6814t = r1
            r0.f6815u = r2
            java.lang.String r1 = "TransactViewModel"
            r0.f6816v = r1
            java.lang.String r1 = "0"
            r0.f6817w = r1
            r1 = 48
            r0.f6818x = r1
            gb.i r1 = new gb.i
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 4095(0xfff, float:5.738E-42)
            r17 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            je.o r3 = new je.o
            r3.<init>(r1)
            r0.f6819y = r3
            je.i r1 = new je.i
            r1.<init>(r3)
            r0.z = r1
            qa.e r1 = qa.e.NODLE_AMOUNT
            java.lang.String r1 = r2.c(r1)
            if (r1 == 0) goto L_0x0052
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1)
            goto L_0x0054
        L_0x0052:
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
        L_0x0054:
            r0.A = r2
            sa.b r1 = new sa.b
            r1.<init>()
            r0.B = r1
            androidx.lifecycle.j0 r1 = new androidx.lifecycle.j0
            io.nodle.cash.ui.viewmodel.TransactViewModel$a r2 = io.nodle.cash.ui.viewmodel.TransactViewModel.a.NONE
            r1.<init>(r2)
            r0.D = r1
            r0.E = r1
            androidx.lifecycle.j0 r1 = new androidx.lifecycle.j0
            xa.c r2 = new xa.c
            r2.<init>()
            r1.<init>(r2)
            r0.F = r1
            r0.G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.viewmodel.TransactViewModel.<init>(android.content.Context, java.lang.String, qa.f):void");
    }

    public static final Object i(TransactViewModel transactViewModel, String str, d dVar) {
        sa.b bVar = transactViewModel.B;
        Objects.requireNonNull(bVar);
        e6.e.D(str, "<set-?>");
        bVar.f11044x = str;
        transactViewModel.B.e(g.TRANSFER);
        sa.b bVar2 = transactViewModel.B;
        bVar2.A = true;
        bVar2.f11045y = System.currentTimeMillis();
        Context context = transactViewModel.f6813s;
        e6.e.D(context, "context");
        Gson gson = new Gson();
        String K = v.K("vip_whitelist");
        try {
            Type type = new db.f().getType();
            e6.e.C(type, "object : TypeToken<ArrayList<String>>() {}.type");
            Collection collection = (List) gson.fromJson(K, type);
            if (collection == null) {
                collection = nd.o.f8966a;
            }
            new HashSet(collection);
        } catch (Exception unused) {
        }
        Object e10 = CashDatabase.f6682n.a(context).s().e(transactViewModel.B, dVar);
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        if (e10 != aVar) {
            e10 = m.f8555a;
        }
        return e10 == aVar ? e10 : m.f8555a;
    }

    public static final void j(TransactViewModel transactViewModel, int i, String str) {
        Object value;
        o oVar = transactViewModel.f6819y;
        do {
            value = oVar.getValue();
        } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (h) null, (Integer) null, Integer.valueOf(i), str, 1023)));
    }

    public final void k() {
        Object value;
        o oVar = this.f6819y;
        do {
            value = oVar.getValue();
        } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, h.NONE, (Integer) null, (Integer) null, (String) null, 2303)));
    }

    public final void l(a aVar) {
        e6.e.D(aVar, "action");
        this.D.j(aVar);
    }

    public final void m() {
        a.C0210a aVar = ri.a.f10801a;
        aVar.a(androidx.fragment.app.m.c("getTransactDetailsFromUser: ", this.f6819y.getValue()), new Object[0]);
        if (e6.e.r(this.B.f11038c, BigInteger.ZERO)) {
            l(a.GET_AMOUNT);
            return;
        }
        String str = this.B.f11037b;
        if (str == null || str.length() == 0) {
            l(a.GET_TARGET_ACCOUNT);
        } else if (!this.C) {
            l(a.GET_CONFIRMATION);
            sa.b bVar = this.B;
            aVar.a("getTransactionFees " + bVar, new Object[0]);
            ge.g.b(jc.b.y(this), (pd.f) null, new s(this, (d<? super s>) null), 3);
        } else {
            l(a.CANCEL);
        }
    }

    public final void n(int i, Long l10) {
        Object value;
        o oVar = this.f6819y;
        do {
            value = oVar.getValue();
        } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (h) null, Integer.valueOf(i), (Integer) null, (String) null, 3583)));
        if (l10 != null) {
            ge.g.b(jc.b.y(this), o0.f5433a, new b(l10.longValue(), this, (d<? super b>) null), 2);
        }
    }

    public final void o(h hVar) {
        Object value;
        o oVar = this.f6819y;
        do {
            value = oVar.getValue();
        } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, hVar, (Integer) null, (Integer) null, (String) null, 3839)));
        ge.g.b(jc.b.y(this), o0.f5433a, new c(this, (d<? super c>) null), 2);
    }
}
