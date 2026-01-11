package io.nodle.cash.ui.view.activity.transact;

import a5.m;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.k0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import e6.e;
import gb.i;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import je.o;
import kb.d;
import mb.c;
import ri.a;
import x7.m0;
import xa.c;
import yd.h;
import yd.v;

public final class TransactActivity extends d implements c.b {
    public static final /* synthetic */ int C = 0;
    public final k0<TransactViewModel.a> A = new m0(this, 2);
    public final k0<xa.c> B = new m(this, 5);

    /* renamed from: y  reason: collision with root package name */
    public final v0 f6743y = new v0(v.a(TransactViewModel.class), new c(this), new b(this));
    public mb.c z;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6744a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6745b;

        static {
            int[] iArr = new int[TransactViewModel.a.values().length];
            iArr[TransactViewModel.a.GET_AMOUNT.ordinal()] = 1;
            iArr[TransactViewModel.a.GET_TARGET_ACCOUNT.ordinal()] = 2;
            iArr[TransactViewModel.a.GET_CONFIRMATION.ordinal()] = 3;
            iArr[TransactViewModel.a.CANCEL.ordinal()] = 4;
            f6744a = iArr;
            int[] iArr2 = new int[c.b.values().length];
            iArr2[c.b.SHOW.ordinal()] = 1;
            iArr2[c.b.UPDATE.ordinal()] = 2;
            iArr2[c.b.HIDE.ordinal()] = 3;
            f6745b = iArr2;
        }
    }

    public static final class b extends h implements xd.a<w0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6746b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f6746b = componentActivity;
        }

        public final Object c() {
            return this.f6746b.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends h implements xd.a<x0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6747b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f6747b = componentActivity;
        }

        public final Object c() {
            x0 viewModelStore = this.f6747b.getViewModelStore();
            e.C(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public TransactActivity() {
        new LinkedHashMap();
    }

    public final void c() {
        finish();
    }

    public final TransactViewModel k() {
        return (TransactViewModel) this.f6743y.a();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        k().k();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_transact);
        k().E.e(this, this.A);
        k().G.e(this, this.B);
    }

    public final void onDestroy() {
        super.onDestroy();
        k().E.i(this.A);
        k().G.i(this.B);
    }

    public final void onStart() {
        Object value;
        i iVar;
        String format;
        super.onStart();
        Object systemService = getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        boolean z10 = true;
        if (connectivityManager != null) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (!(networkCapabilities != null && networkCapabilities.hasCapability(12)) || !networkCapabilities.hasCapability(16)) {
                z10 = false;
            }
        }
        if (!z10) {
            Toast.makeText(this, R.string.noInternet, 0).show();
        }
        TransactViewModel k10 = k();
        a.C0210a aVar = ri.a.f10801a;
        String str = k10.f6816v;
        e.C(str, "TAG");
        aVar.e(str);
        aVar.a("Transact : ON_START", new Object[0]);
        o oVar = k10.f6819y;
        do {
            value = oVar.getValue();
            iVar = (i) value;
            BigInteger bigInteger = k10.A;
            e.C(bigInteger, "nodleBalance");
            DecimalFormat decimalFormat = new DecimalFormat("0");
            decimalFormat.setMaximumFractionDigits(11);
            decimalFormat.setMinimumFractionDigits(11);
            BigDecimal divide = new BigDecimal(bigInteger).divide(BigDecimal.TEN.pow(11));
            e.C(divide, "rawNodle.toBigDecimal().…pow(AMOUNT_MAX_DECIMALS))");
            format = decimalFormat.format(divide);
            if (format == null) {
                format = "0.00";
            }
        } while (!oVar.g(value, i.a(iVar, format, k10.f6814t, (String) null, (String) null, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4092)));
        k10.B.f11036a = k10.f6814t;
        k10.m();
    }
}
