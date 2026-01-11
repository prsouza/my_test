package va;

import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import e6.e;
import eb.a;
import ge.g;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;
import jc.b;
import pd.d;
import pd.f;

public final class u extends t implements a.C0072a {
    public static final SparseIntArray O;
    public final TextView L;
    public final a M;
    public long N = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.titleTextView, 3);
        sparseIntArray.put(R.id.verifyMessageTextView, 4);
        sparseIntArray.put(R.id.verifyContainerLayout, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(androidx.databinding.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = O
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r6, r7, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 2
            r1 = r0[r1]
            android.widget.Button r1 = (android.widget.Button) r1
            r3 = 5
            r3 = r0[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3 = 4
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.N = r3
            r6 = 0
            r6 = r0[r6]
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r6.setTag(r2)
            r6 = 1
            r0 = r0[r6]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.L = r0
            r0.setTag(r2)
            android.widget.Button r0 = r5.I
            r0.setTag(r2)
            r0 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r7.setTag(r0, r5)
            eb.a r7 = new eb.a
            r7.<init>(r5, r6)
            r5.M = r7
            r5.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.u.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        WalletBackupViewModel walletBackupViewModel = this.J;
        boolean z = true;
        if (walletBackupViewModel != null) {
            Log.d(walletBackupViewModel.f6825s, "Verify: " + walletBackupViewModel.f6831y);
            int[] iArr = walletBackupViewModel.f6830x;
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                int i11 = iArr[i10];
                if (!e.r(walletBackupViewModel.f6831y.get(Integer.valueOf(i11)), walletBackupViewModel.f6827u.get(i11))) {
                    z = false;
                    break;
                }
                i10++;
            }
            Log.d(walletBackupViewModel.f6825s, "Verify isSuccess: " + z);
            if (z) {
                String string = walletBackupViewModel.f6826t.getString(R.string.backupComplete);
                e.C(string, "app.getString(R.string.backupComplete)");
                String string2 = walletBackupViewModel.f6826t.getString(R.string.backupCompleteMessage);
                e.C(string2, "app.getString(R.string.backupCompleteMessage)");
                walletBackupViewModel.z = new tb.a(string, string2, false);
                walletBackupViewModel.E.j(WalletBackupViewModel.a.GOTO_INFO);
                return;
            }
            walletBackupViewModel.D.j(0);
            g.b(b.y(walletBackupViewModel), (f) null, new tb.u(walletBackupViewModel, (d<? super tb.u>) null), 3);
        }
    }

    public final void c() {
        long j10;
        synchronized (this) {
            j10 = this.N;
            this.N = 0;
        }
        WalletBackupViewModel walletBackupViewModel = this.J;
        int i = ((7 & j10) > 0 ? 1 : ((7 & j10) == 0 ? 0 : -1));
        int i10 = 0;
        if (i != 0) {
            Integer num = null;
            LiveData<Integer> liveData = walletBackupViewModel != null ? walletBackupViewModel.I : null;
            t(0, liveData);
            if (liveData != null) {
                num = liveData.d();
            }
            i10 = ViewDataBinding.p(num);
        }
        if (i != 0) {
            this.L.setVisibility(i10);
        }
        if ((j10 & 4) != 0) {
            this.I.setOnClickListener(this.M);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.N != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.N = 4;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        if (i != 0) {
            return false;
        }
        LiveData liveData = (LiveData) obj;
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.N |= 1;
        }
        return true;
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((WalletBackupViewModel) obj);
        return true;
    }

    public final void v(WalletBackupViewModel walletBackupViewModel) {
        this.J = walletBackupViewModel;
        synchronized (this) {
            this.N |= 2;
        }
        b(3);
        o();
    }
}
