package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

public final class u extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public r f2589c;

    /* renamed from: d  reason: collision with root package name */
    public q f2590d;

    public final int[] a(RecyclerView.n nVar, View view) {
        int[] iArr = new int[2];
        if (nVar.e()) {
            iArr[0] = c(view, e(nVar));
        } else {
            iArr[0] = 0;
        }
        if (nVar.f()) {
            iArr[1] = c(view, f(nVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int c(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public final View d(RecyclerView.n nVar, s sVar) {
        int x10 = nVar.x();
        View view = null;
        if (x10 == 0) {
            return null;
        }
        int l10 = (sVar.l() / 2) + sVar.k();
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i10 = 0; i10 < x10; i10++) {
            View w6 = nVar.w(i10);
            int abs = Math.abs(((sVar.c(w6) / 2) + sVar.e(w6)) - l10);
            if (abs < i) {
                view = w6;
                i = abs;
            }
        }
        return view;
    }

    public final s e(RecyclerView.n nVar) {
        q qVar = this.f2590d;
        if (qVar == null || qVar.f2585a != nVar) {
            this.f2590d = new q(nVar);
        }
        return this.f2590d;
    }

    public final s f(RecyclerView.n nVar) {
        r rVar = this.f2589c;
        if (rVar == null || rVar.f2585a != nVar) {
            this.f2589c = new r(nVar);
        }
        return this.f2589c;
    }
}
