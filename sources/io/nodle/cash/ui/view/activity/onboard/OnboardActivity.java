package io.nodle.cash.ui.view.activity.onboard;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.k0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import e6.e;
import h1.d0;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OnboardViewModel;
import java.util.LinkedHashMap;
import java.util.Objects;
import jb.d;
import ub.f;
import va.i;
import yd.h;
import yd.v;

public final class OnboardActivity extends d {
    public static final /* synthetic */ int C = 0;
    public mb.b A;
    public final k0<OnboardViewModel.a> B = new d0(this, 7);

    /* renamed from: y  reason: collision with root package name */
    public final String f6733y = "OnboardActivity";
    public final v0 z = new v0(v.a(OnboardViewModel.class), new c(this), new b(this));

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6734a;

        static {
            int[] iArr = new int[OnboardViewModel.a.values().length];
            iArr[OnboardViewModel.a.LOAD_FRAGMENT.ordinal()] = 1;
            iArr[OnboardViewModel.a.LOAD_IMPORT.ordinal()] = 2;
            iArr[OnboardViewModel.a.ONBOARD_COMPLETE.ordinal()] = 3;
            f6734a = iArr;
        }
    }

    public static final class b extends h implements xd.a<w0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6735b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f6735b = componentActivity;
        }

        public final Object c() {
            return this.f6735b.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends h implements xd.a<x0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6736b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f6736b = componentActivity;
        }

        public final Object c() {
            x0 viewModelStore = this.f6736b.getViewModelStore();
            e.C(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public OnboardActivity() {
        new LinkedHashMap();
    }

    public final OnboardViewModel k() {
        return (OnboardViewModel) this.z.a();
    }

    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        OnboardViewModel k10 = k();
        Objects.requireNonNull(k10);
        if (i == 100 && i10 == -1) {
            k10.i(f.d(intent != null ? intent.getStringExtra("EXTRA_MNEMONICS") : null));
            return;
        }
        k10.f6802w = OnboardViewModel.b.values()[k10.f6802w.ordinal() - 1];
        k10.k();
        k10.f6804y.j(Boolean.FALSE);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k().z.e(this, this.B);
        ViewDataBinding d10 = androidx.databinding.f.d(this, R.layout.activity_onboard);
        e.C(d10, "setContentView(this, R.layout.activity_onboard)");
        i iVar = (i) d10;
        iVar.r(this);
        iVar.v(k());
        k().k();
    }
}
