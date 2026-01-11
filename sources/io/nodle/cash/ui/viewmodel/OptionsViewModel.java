package io.nodle.cash.ui.viewmodel;

import ad.c;
import ah.v;
import android.app.Application;
import android.text.Spanned;
import androidx.fragment.app.m;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import e6.e;
import io.nodle.cash.R;
import java.util.Arrays;

public final class OptionsViewModel extends b implements z {
    public qa.a A;
    public Spanned B;

    /* renamed from: s  reason: collision with root package name */
    public final Application f6806s;

    /* renamed from: t  reason: collision with root package name */
    public final j0<Boolean> f6807t = new j0<>(Boolean.valueOf(k()));

    /* renamed from: u  reason: collision with root package name */
    public final j0<Boolean> f6808u = new j0<>(Boolean.valueOf(j()));

    /* renamed from: v  reason: collision with root package name */
    public final j0<String> f6809v;

    /* renamed from: w  reason: collision with root package name */
    public final j0<a> f6810w;

    /* renamed from: x  reason: collision with root package name */
    public final LiveData<Boolean> f6811x;

    /* renamed from: y  reason: collision with root package name */
    public final LiveData<String> f6812y;
    public final LiveData<a> z;

    public enum a {
        NONE,
        GOTO_SETTINGS,
        GOTO_WALLET_BACKUP,
        GOTO_PRIVACY,
        GOTO_INFO,
        GOTO_LOGOUT,
        POST_LOGOUT,
        SHARE_APP,
        OPTIMIZE_BATTERY,
        GOTO_APP_LOCK,
        GOTO_BACK
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionsViewModel(Application application) {
        super(application);
        e.D(application, "application");
        this.f6806s = application;
        j0 j0Var = new j0(Boolean.FALSE);
        j0<String> j0Var2 = new j0<>(application.getString(R.string.titleOptions));
        this.f6809v = j0Var2;
        j0<a> j0Var3 = new j0<>(a.NONE);
        this.f6810w = j0Var3;
        this.f6811x = j0Var;
        this.f6812y = j0Var2;
        this.z = j0Var3;
        Spanned a10 = l0.b.a(application.getString(R.string.referralIntro, new Object[]{v.K("referralRewardAmount")}));
        e.C(a10, "fromHtml(\n            ap…at.FROM_HTML_MODE_LEGACY)");
        this.B = a10;
    }

    @l0(r.b.ON_CREATE)
    private final void onCreate() {
        this.f6810w.j(a.GOTO_SETTINGS);
    }

    public final void i(a aVar) {
        e.D(aVar, "action");
        this.f6810w.j(aVar);
    }

    public final boolean j() {
        Application application = this.f6806s;
        qa.e eVar = qa.e.NOTIFICATION;
        m.g("Notification: ", v.J(application, eVar), "OptionsViewModel");
        return Integer.parseInt(v.J(this.f6806s, eVar)) == 202;
    }

    public final boolean k() {
        Application application = this.f6806s;
        qa.e eVar = qa.e.WIFI_ONLY;
        m.g("Wifi Offloading: ", v.J(application, eVar), "OptionsViewModel");
        return Integer.parseInt(v.J(this.f6806s, eVar)) == 1001;
    }

    public final void l(String str, String str2) {
        String str3;
        String str4;
        e.D(str2, "key");
        if (str == null) {
            if (e.r(str2, this.f6806s.getString(R.string.settingsPrivacyAnalytics))) {
                this.A = (qa.a) c.L(this.f6806s).get(str2);
                this.f6809v.j(str2);
                i(a.GOTO_PRIVACY);
            } else if (e.r(str2, this.f6806s.getString(R.string.privacy))) {
                qa.a aVar = (qa.a) c.L(this.f6806s).get(str2);
                this.A = aVar;
                if (aVar != null) {
                    if (aVar == null || (str4 = aVar.f10326b) == null) {
                        str3 = null;
                    } else {
                        str3 = String.format(str4, Arrays.copyOf(new Object[]{v.J(this.f6806s, qa.e.NODLE_PUBLIC_KEY_4)}, 1));
                        e.C(str3, "format(format, *args)");
                    }
                    aVar.f10326b = str3;
                }
                this.f6809v.j(str2);
                i(a.GOTO_INFO);
            } else {
                this.A = (qa.a) c.L(this.f6806s).get(str2);
                this.f6809v.j(str2);
                i(a.GOTO_INFO);
            }
        } else if (!e.r(str, this.f6806s.getString(R.string.settingsWalletSettings))) {
        } else {
            if (e.r(str2, this.f6806s.getString(R.string.titleBackup))) {
                i(a.GOTO_WALLET_BACKUP);
            } else if (e.r(str2, this.f6806s.getString(R.string.settingsLogout))) {
                i(a.GOTO_LOGOUT);
            }
        }
    }
}
