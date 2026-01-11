package io.nodle.cash.ui.view.activity;

import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.k0;
import androidx.lifecycle.w0;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import java.util.LinkedHashMap;
import rb.d;
import rb.g;
import va.k;

public final class OptionsActivity extends hb.a {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public final String f6717v = "OptionsActivity";

    /* renamed from: w  reason: collision with root package name */
    public OptionsViewModel f6718w;

    /* renamed from: x  reason: collision with root package name */
    public d f6719x;

    /* renamed from: y  reason: collision with root package name */
    public g f6720y;
    public final k0<OptionsViewModel.a> z = new t7.a(this);

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6721a;

        static {
            int[] iArr = new int[OptionsViewModel.a.values().length];
            iArr[OptionsViewModel.a.GOTO_SETTINGS.ordinal()] = 1;
            iArr[OptionsViewModel.a.GOTO_WALLET_BACKUP.ordinal()] = 2;
            iArr[OptionsViewModel.a.GOTO_PRIVACY.ordinal()] = 3;
            iArr[OptionsViewModel.a.GOTO_INFO.ordinal()] = 4;
            iArr[OptionsViewModel.a.SHARE_APP.ordinal()] = 5;
            iArr[OptionsViewModel.a.OPTIMIZE_BATTERY.ordinal()] = 6;
            iArr[OptionsViewModel.a.GOTO_LOGOUT.ordinal()] = 7;
            iArr[OptionsViewModel.a.POST_LOGOUT.ordinal()] = 8;
            iArr[OptionsViewModel.a.GOTO_BACK.ordinal()] = 9;
            f6721a = iArr;
        }
    }

    public OptionsActivity() {
        new LinkedHashMap();
    }

    public final void onBackPressed() {
        OptionsViewModel optionsViewModel;
        super.onBackPressed();
        g gVar = this.f6720y;
        boolean z10 = true;
        if (gVar != null && gVar.isVisible()) {
            OptionsViewModel optionsViewModel2 = this.f6718w;
            if (optionsViewModel2 != null) {
                String string = getString(R.string.settingsPrivacyAnalytics);
                e.C(string, "getString(R.string.settingsPrivacyAnalytics)");
                optionsViewModel2.f6809v.j(string);
                return;
            }
            return;
        }
        d dVar = this.f6719x;
        if (dVar == null || !dVar.isVisible()) {
            z10 = false;
        }
        if (z10 && (optionsViewModel = this.f6718w) != null) {
            String string2 = getString(R.string.titleOptions);
            e.C(string2, "getString(R.string.titleOptions)");
            optionsViewModel.f6809v.j(string2);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OptionsViewModel optionsViewModel = (OptionsViewModel) new w0(this).a(OptionsViewModel.class);
        this.f6718w = optionsViewModel;
        LiveData<OptionsViewModel.a> liveData = optionsViewModel.z;
        if (liveData != null) {
            liveData.e(this, this.z);
        }
        OptionsViewModel optionsViewModel2 = this.f6718w;
        if (optionsViewModel2 != null) {
            getLifecycle().a(optionsViewModel2);
        }
        ViewDataBinding d10 = f.d(this, R.layout.activity_options);
        e.C(d10, "setContentView(this, R.layout.activity_options)");
        k kVar = (k) d10;
        kVar.r(this);
        kVar.v(this.f6718w);
    }

    public final void onDestroy() {
        LiveData<OptionsViewModel.a> liveData;
        super.onDestroy();
        OptionsViewModel optionsViewModel = this.f6718w;
        if (optionsViewModel != null && (liveData = optionsViewModel.z) != null) {
            liveData.i(this.z);
        }
    }
}
