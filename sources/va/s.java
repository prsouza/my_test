package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import e6.e;
import eb.a;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;
import java.util.Arrays;

public final class s extends r implements a.C0072a {
    public static final SparseIntArray R;
    public final Button M;
    public final Button N;
    public final a O;
    public final a P;
    public long Q = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(R.id.titleTextView, 5);
        sparseIntArray.put(R.id.messageTextView, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(androidx.databinding.e r8, android.view.View r9) {
        /*
            r7 = this;
            android.util.SparseIntArray r0 = R
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r8, r9, r1, r2, r0)
            r1 = 6
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 2
            r3 = r0[r1]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 1
            r5 = r0[r4]
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7.<init>(r8, r9, r3, r5)
            r5 = -1
            r7.Q = r5
            r8 = 0
            r8 = r0[r8]
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r8.setTag(r2)
            r8 = 3
            r8 = r0[r8]
            android.widget.Button r8 = (android.widget.Button) r8
            r7.M = r8
            r8.setTag(r2)
            r8 = 4
            r8 = r0[r8]
            android.widget.Button r8 = (android.widget.Button) r8
            r7.N = r8
            r8.setTag(r2)
            android.widget.TextView r8 = r7.I
            r8.setTag(r2)
            android.widget.TextView r8 = r7.J
            r8.setTag(r2)
            r8 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r9.setTag(r8, r7)
            eb.a r8 = new eb.a
            r8.<init>(r7, r4)
            r7.O = r8
            eb.a r8 = new eb.a
            r8.<init>(r7, r1)
            r7.P = r8
            r7.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.s.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        int i10;
        boolean z = false;
        if (i == 1) {
            WalletBackupViewModel walletBackupViewModel = this.K;
            if ((walletBackupViewModel != null) && (i10 = walletBackupViewModel.f6828v) != 0) {
                if (i10 == walletBackupViewModel.f6827u.size() - 1) {
                    walletBackupViewModel.C.j(walletBackupViewModel.f6826t.getString(R.string.next));
                }
                int i11 = walletBackupViewModel.f6828v - 1;
                walletBackupViewModel.f6828v = i11;
                walletBackupViewModel.A.j(walletBackupViewModel.f6827u.get(i11));
                j0<String> j0Var = walletBackupViewModel.B;
                String string = walletBackupViewModel.f6826t.getString(R.string.wordCount);
                e.C(string, "app.getString(R.string.wordCount)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(walletBackupViewModel.f6828v + 1), Integer.valueOf(walletBackupViewModel.f6827u.size())}, 2));
                e.C(format, "format(format, *args)");
                j0Var.j(format);
            }
        } else if (i == 2) {
            WalletBackupViewModel walletBackupViewModel2 = this.K;
            if (walletBackupViewModel2 != null) {
                z = true;
            }
            if (z) {
                walletBackupViewModel2.j();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.Q     // Catch:{ all -> 0x00a0 }
            r4 = 0
            r1.Q = r4     // Catch:{ all -> 0x00a0 }
            monitor-exit(r17)     // Catch:{ all -> 0x00a0 }
            io.nodle.cash.ui.viewmodel.WalletBackupViewModel r0 = r1.K
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 28
            r9 = 26
            r11 = 25
            r13 = 0
            if (r6 == 0) goto L_0x006a
            long r14 = r2 & r11
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0025
            androidx.lifecycle.LiveData<java.lang.String> r6 = r0.H
            goto L_0x0026
        L_0x0025:
            r6 = r13
        L_0x0026:
            r14 = 0
            r1.t(r14, r6)
            if (r6 == 0) goto L_0x0033
            java.lang.Object r6 = r6.d()
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0034
        L_0x0033:
            r6 = r13
        L_0x0034:
            long r14 = r2 & r9
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x004d
            if (r0 == 0) goto L_0x003f
            androidx.lifecycle.LiveData<java.lang.String> r14 = r0.G
            goto L_0x0040
        L_0x003f:
            r14 = r13
        L_0x0040:
            r15 = 1
            r1.t(r15, r14)
            if (r14 == 0) goto L_0x004d
            java.lang.Object r14 = r14.d()
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x004e
        L_0x004d:
            r14 = r13
        L_0x004e:
            long r15 = r2 & r7
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x0059
            androidx.lifecycle.LiveData<java.lang.String> r0 = r0.F
            goto L_0x005a
        L_0x0059:
            r0 = r13
        L_0x005a:
            r15 = 2
            r1.t(r15, r0)
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r0.d()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
        L_0x0067:
            r0 = r13
            r13 = r6
            goto L_0x006c
        L_0x006a:
            r0 = r13
            r14 = r0
        L_0x006c:
            r15 = 16
            long r15 = r15 & r2
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0081
            android.widget.Button r6 = r1.M
            eb.a r15 = r1.O
            r6.setOnClickListener(r15)
            android.widget.Button r6 = r1.N
            eb.a r15 = r1.P
            r6.setOnClickListener(r15)
        L_0x0081:
            long r11 = r11 & r2
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x008b
            android.widget.Button r6 = r1.N
            u0.a.a(r6, r13)
        L_0x008b:
            long r9 = r9 & r2
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0095
            android.widget.TextView r6 = r1.I
            u0.a.a(r6, r14)
        L_0x0095:
            long r2 = r2 & r7
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x009f
            android.widget.TextView r2 = r1.J
            u0.a.a(r2, r0)
        L_0x009f:
            return
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x00a0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.s.c():void");
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
            this.Q = 16;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        if (i == 0) {
            LiveData liveData = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.Q |= 1;
            }
            return true;
        } else if (i == 1) {
            LiveData liveData2 = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.Q |= 2;
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            LiveData liveData3 = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.Q |= 4;
            }
            return true;
        }
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((WalletBackupViewModel) obj);
        return true;
    }

    public final void v(WalletBackupViewModel walletBackupViewModel) {
        this.K = walletBackupViewModel;
        synchronized (this) {
            this.Q |= 8;
        }
        b(3);
        o();
    }
}
