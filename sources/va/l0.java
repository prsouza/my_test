package va;

import android.text.Spanned;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import e6.e;
import eb.a;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import io.nodle.sdk.android.Nodle;
import java.util.Arrays;
import za.d;

public final class l0 extends k0 implements a.C0072a {
    public static final SparseIntArray Q;
    public final TextView M;
    public final Button N;
    public final a O;
    public long P = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.optionsRecyclerView, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l0(androidx.databinding.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = Q
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r6, r7, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r1 = 1
            r3 = r0[r1]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r4 = 4
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5.<init>(r6, r7, r3, r4)
            r3 = -1
            r5.P = r3
            r6 = 0
            r6 = r0[r6]
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r6.setTag(r2)
            r6 = 2
            r6 = r0[r6]
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.M = r6
            r6.setTag(r2)
            r6 = 3
            r6 = r0[r6]
            android.widget.Button r6 = (android.widget.Button) r6
            r5.N = r6
            r6.setTag(r2)
            android.widget.LinearLayout r6 = r5.I
            r6.setTag(r2)
            android.widget.TextView r6 = r5.J
            r6.setTag(r2)
            r6 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r7.setTag(r6, r5)
            eb.a r6 = new eb.a
            r6.<init>(r5, r1)
            r5.O = r6
            r5.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.l0.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        OptionsViewModel optionsViewModel = this.K;
        if (optionsViewModel != null) {
            optionsViewModel.i(OptionsViewModel.a.SHARE_APP);
        }
    }

    public final void c() {
        long j10;
        Spanned spanned;
        String str;
        Spanned spanned2;
        synchronized (this) {
            j10 = this.P;
            this.P = 0;
        }
        OptionsViewModel optionsViewModel = this.K;
        int i = ((j10 & 7) > 0 ? 1 : ((j10 & 7) == 0 ? 0 : -1));
        int i10 = 0;
        if (i != 0) {
            if ((j10 & 6) == 0 || optionsViewModel == null) {
                str = null;
                spanned2 = null;
            } else {
                spanned2 = optionsViewModel.B;
                String string = optionsViewModel.f6806s.getString(R.string.version);
                e.C(string, "app.getString(R.string.version)");
                d dVar = d.f14195a;
                e.C(optionsViewModel.f2082c, "getApplication()");
                str = String.format(string, Arrays.copyOf(new Object[]{"3.0.59", Nodle.Nodle().getVersion()}, 2));
                e.C(str, "format(format, *args)");
            }
            LiveData<Boolean> liveData = optionsViewModel != null ? optionsViewModel.f6811x : null;
            t(0, liveData);
            boolean q10 = ViewDataBinding.q(liveData != null ? liveData.d() : null);
            if (i != 0) {
                j10 |= q10 ? 16 : 8;
            }
            if (!q10) {
                i10 = 8;
            }
            spanned = spanned2;
        } else {
            str = null;
            spanned = null;
        }
        if ((j10 & 6) != 0) {
            u0.a.a(this.M, spanned);
            u0.a.a(this.J, str);
        }
        if ((4 & j10) != 0) {
            this.N.setOnClickListener(this.O);
        }
        if ((j10 & 7) != 0) {
            this.I.setVisibility(i10);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.P != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.P = 4;
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
            this.P |= 1;
        }
        return true;
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
            this.P |= 2;
        }
        b(3);
        o();
    }
}
