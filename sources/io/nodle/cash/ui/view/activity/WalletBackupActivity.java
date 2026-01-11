package io.nodle.cash.ui.view.activity;

import a5.l;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.k0;
import androidx.lifecycle.w0;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;
import java.util.LinkedHashMap;
import va.m;

public final class WalletBackupActivity extends hb.a {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f6722y = 0;

    /* renamed from: v  reason: collision with root package name */
    public final String f6723v = "WalletBackupActivity";

    /* renamed from: w  reason: collision with root package name */
    public WalletBackupViewModel f6724w;

    /* renamed from: x  reason: collision with root package name */
    public final k0<WalletBackupViewModel.a> f6725x = new l(this);

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6726a;

        static {
            int[] iArr = new int[WalletBackupViewModel.a.values().length];
            iArr[WalletBackupViewModel.a.GOTO_INFO.ordinal()] = 1;
            iArr[WalletBackupViewModel.a.GOTO_PHRASE.ordinal()] = 2;
            iArr[WalletBackupViewModel.a.GOTO_VERIFY.ordinal()] = 3;
            iArr[WalletBackupViewModel.a.FINISH.ordinal()] = 4;
            f6726a = iArr;
        }
    }

    public WalletBackupActivity() {
        new LinkedHashMap();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WalletBackupViewModel walletBackupViewModel = (WalletBackupViewModel) new w0(this).a(WalletBackupViewModel.class);
        this.f6724w = walletBackupViewModel;
        LiveData<WalletBackupViewModel.a> liveData = walletBackupViewModel.J;
        if (liveData != null) {
            liveData.e(this, this.f6725x);
        }
        WalletBackupViewModel walletBackupViewModel2 = this.f6724w;
        if (walletBackupViewModel2 != null) {
            getLifecycle().a(walletBackupViewModel2);
        }
        ViewDataBinding d10 = f.d(this, R.layout.activity_wallet_backup);
        e.C(d10, "setContentView(this, R.l…t.activity_wallet_backup)");
        m mVar = (m) d10;
        mVar.r(this);
        mVar.v(this.f6724w);
    }

    public final void onDestroy() {
        LiveData<WalletBackupViewModel.a> liveData;
        super.onDestroy();
        WalletBackupViewModel walletBackupViewModel = this.f6724w;
        if (walletBackupViewModel != null && (liveData = walletBackupViewModel.J) != null) {
            liveData.i(this.f6725x);
        }
    }
}
