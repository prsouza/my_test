package va;

import ah.v;
import android.app.Application;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.util.SparseIntArray;
import android.view.View;
import c3.k;
import e6.e;
import eb.a;
import ge.g;
import ge.o0;
import io.nodle.cash.R;
import io.nodle.cash.data.local.b;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import io.nodle.sdk.android.Nodle;
import io.sentry.protocol.App;
import java.util.Objects;
import k1.a;
import pd.f;
import za.d;
import za.h;

public final class d0 extends c0 implements a.C0072a {
    public static final SparseIntArray P;
    public final a M;
    public final a N;
    public long O = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.headerTextView, 3);
        sparseIntArray.put(R.id.detailTextView, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d0(androidx.databinding.e r8, android.view.View r9) {
        /*
            r7 = this;
            android.util.SparseIntArray r0 = P
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r8, r9, r1, r2, r0)
            r1 = 1
            r3 = r0[r1]
            android.widget.Button r3 = (android.widget.Button) r3
            r4 = 4
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4 = 3
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4 = 2
            r5 = r0[r4]
            android.widget.Button r5 = (android.widget.Button) r5
            r7.<init>(r8, r9, r3, r5)
            r5 = -1
            r7.O = r5
            android.widget.Button r8 = r7.I
            r8.setTag(r2)
            android.widget.Button r8 = r7.J
            r8.setTag(r2)
            r8 = 0
            r8 = r0[r8]
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r8.setTag(r2)
            r8 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r9.setTag(r8, r7)
            eb.a r8 = new eb.a
            r8.<init>(r7, r1)
            r7.M = r8
            eb.a r8 = new eb.a
            r8.<init>(r7, r4)
            r7.N = r8
            r7.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.d0.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        boolean z = true;
        if (i == 1) {
            OptionsViewModel optionsViewModel = this.K;
            if (optionsViewModel == null) {
                z = false;
            }
            if (z) {
                optionsViewModel.i(OptionsViewModel.a.GOTO_WALLET_BACKUP);
            }
        } else if (i == 2) {
            OptionsViewModel optionsViewModel2 = this.K;
            if (optionsViewModel2 == null) {
                z = false;
            }
            if (z) {
                Objects.requireNonNull(optionsViewModel2);
                d dVar = d.f14195a;
                Application application = optionsViewModel2.f6806s;
                e.D(application, "cxt");
                dVar.b(application);
                Nodle.Nodle().clear();
                h hVar = h.f14215a;
                h.f14216b = null;
                h.f14217c = null;
                h.f14218d = null;
                Application application2 = optionsViewModel2.f6806s;
                e.D(application2, "context");
                SharedPreferences.Editor edit = ((k1.a) v.Q(application2)).edit();
                for (qa.e key : qa.e.values()) {
                    ((a.b) edit).remove(String.valueOf(key.getKey()));
                }
                ((a.b) edit).apply();
                Application application3 = optionsViewModel2.f6806s;
                e.D(application3, App.TYPE);
                g.b(k.j(o0.f5433a), (f) null, new b(application3, (pd.d<? super b>) null), 3);
                Application application4 = optionsViewModel2.f6806s;
                e.D(application4, "cxt");
                Object systemService = application4.getSystemService("notification");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancelAll();
                optionsViewModel2.i(OptionsViewModel.a.POST_LOGOUT);
            }
        }
    }

    public final void c() {
        long j10;
        synchronized (this) {
            j10 = this.O;
            this.O = 0;
        }
        if ((j10 & 2) != 0) {
            this.I.setOnClickListener(this.M);
            this.J.setOnClickListener(this.N);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.O != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.O = 2;
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
        v((OptionsViewModel) obj);
        return true;
    }

    public final void v(OptionsViewModel optionsViewModel) {
        this.K = optionsViewModel;
        synchronized (this) {
            this.O |= 1;
        }
        b(3);
        o();
    }
}
