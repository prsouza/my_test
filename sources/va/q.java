package va;

import android.view.View;
import eb.a;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;

public final class q extends p implements a.C0072a {
    public final a O;
    public final a P;
    public long Q = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(androidx.databinding.e r12, android.view.View r13) {
        /*
            r11 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r12, r13, r0, r1, r1)
            r2 = 4
            r2 = r0[r2]
            r6 = r2
            android.widget.Button r6 = (android.widget.Button) r6
            r2 = 2
            r3 = r0[r2]
            r7 = r3
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3 = 3
            r3 = r0[r3]
            r8 = r3
            android.widget.Button r8 = (android.widget.Button) r8
            r10 = 1
            r3 = r0[r10]
            r9 = r3
            android.widget.TextView r9 = (android.widget.TextView) r9
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r11.Q = r3
            android.widget.Button r12 = r11.I
            r12.setTag(r1)
            r12 = 0
            r12 = r0[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r12.setTag(r1)
            android.widget.TextView r12 = r11.J
            r12.setTag(r1)
            android.widget.Button r12 = r11.K
            r12.setTag(r1)
            android.widget.TextView r12 = r11.L
            r12.setTag(r1)
            r12 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r13.setTag(r12, r11)
            eb.a r12 = new eb.a
            r12.<init>(r11, r2)
            r11.O = r12
            eb.a r12 = new eb.a
            r12.<init>(r11, r10)
            r11.P = r12
            r11.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.q.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            WalletBackupViewModel walletBackupViewModel = this.M;
            if (walletBackupViewModel != null) {
                z = true;
            }
            if (z) {
                walletBackupViewModel.i(WalletBackupViewModel.a.GOTO_PHRASE);
            }
        } else if (i == 2) {
            WalletBackupViewModel walletBackupViewModel2 = this.M;
            if (walletBackupViewModel2 != null) {
                z = true;
            }
            if (z) {
                walletBackupViewModel2.i(WalletBackupViewModel.a.FINISH);
            }
        }
    }

    public final void c() {
        long j10;
        int i;
        String str;
        boolean z;
        String str2;
        long j11;
        long j12;
        synchronized (this) {
            j10 = this.Q;
            this.Q = 0;
        }
        WalletBackupViewModel walletBackupViewModel = this.M;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str3 = null;
        int i11 = 0;
        if (i10 != 0) {
            tb.a aVar = walletBackupViewModel != null ? walletBackupViewModel.z : null;
            if (aVar != null) {
                str3 = aVar.f11462a;
                z = aVar.f11464c;
                str2 = aVar.f11463b;
            } else {
                str2 = null;
                z = false;
            }
            if (i10 != 0) {
                if (z) {
                    j12 = j10 | 8;
                    j11 = 32;
                } else {
                    j12 = j10 | 4;
                    j11 = 16;
                }
                j10 = j12 | j11;
            }
            int i12 = z ? 8 : 0;
            if (!z) {
                i11 = 8;
            }
            i = i11;
            i11 = i12;
            String str4 = str3;
            str3 = str2;
            str = str4;
        } else {
            str = null;
            i = 0;
        }
        if ((2 & j10) != 0) {
            this.I.setOnClickListener(this.O);
            this.K.setOnClickListener(this.P);
        }
        if ((j10 & 3) != 0) {
            this.I.setVisibility(i11);
            u0.a.a(this.J, str3);
            this.K.setVisibility(i);
            u0.a.a(this.L, str);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.Q != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.Q = 2;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        return false;
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((WalletBackupViewModel) obj);
        return true;
    }

    public final void v(WalletBackupViewModel walletBackupViewModel) {
        this.M = walletBackupViewModel;
        synchronized (this) {
            this.Q |= 1;
        }
        b(3);
        o();
    }
}
