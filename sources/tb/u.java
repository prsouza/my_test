package tb;

import c3.k;
import ge.d0;
import ge.g;
import ge.n1;
import ge.o0;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;
import l6.b1;
import le.l;
import md.m;
import me.c;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.WalletBackupViewModel$verify$1", f = "WalletBackupViewModel.kt", l = {126, 127}, m = "invokeSuspend")
public final class u extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11527a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WalletBackupViewModel f11528b;

    @e(c = "io.nodle.cash.ui.viewmodel.WalletBackupViewModel$verify$1$1", f = "WalletBackupViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WalletBackupViewModel f11529a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(WalletBackupViewModel walletBackupViewModel, d<? super a> dVar) {
            super(2, dVar);
            this.f11529a = walletBackupViewModel;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f11529a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = m.f8555a;
            ((a) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
            return mVar;
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            b1.w(obj);
            this.f11529a.D.k(new Integer(8));
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(WalletBackupViewModel walletBackupViewModel, d<? super u> dVar) {
        super(2, dVar);
        this.f11528b = walletBackupViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new u(this.f11528b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f11527a;
        if (i == 0) {
            b1.w(obj);
            this.f11527a = 1;
            if (k.f0(3000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else if (i == 2) {
            b1.w(obj);
            return m.f8555a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c cVar = o0.f5433a;
        n1 n1Var = l.f8259a;
        a aVar2 = new a(this.f11528b, (d<? super a>) null);
        this.f11527a = 2;
        if (g.d(n1Var, aVar2, this) == aVar) {
            return aVar;
        }
        return m.f8555a;
    }
}
