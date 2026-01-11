package ob;

import android.view.View;
import androidx.fragment.app.Fragment;
import c3.k;
import de.h;
import e6.e;
import ge.g;
import ge.o0;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import java.math.BigInteger;
import pd.d;
import pd.f;
import ri.a;
import sa.b;
import sb.q;
import tb.t;
import xa.c;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9400a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f9401b;

    public /* synthetic */ c(Fragment fragment, int i) {
        this.f9400a = i;
        this.f9401b = fragment;
    }

    public final void onClick(View view) {
        switch (this.f9400a) {
            case 0:
                h hVar = (h) this.f9401b;
                int i = h.f9409s;
                e.D(hVar, "this$0");
                g.b(k.j(o0.f5433a), (f) null, new g(hVar, (d<? super g>) null), 3);
                return;
            default:
                q qVar = (q) this.f9401b;
                h<Object>[] hVarArr = q.f11092w;
                e.D(qVar, "this$0");
                TransactViewModel transactViewModel = qVar.f11093t;
                if (transactViewModel != null) {
                    a.C0210a aVar = a.f10801a;
                    b bVar = transactViewModel.B;
                    aVar.a("performTransfer " + bVar, new Object[0]);
                    BigInteger bigInteger = transactViewModel.A;
                    e.C(bigInteger, "nodleBalance");
                    BigInteger subtract = bigInteger.subtract(transactViewModel.B.f11038c);
                    e.C(subtract, "this.subtract(other)");
                    BigInteger bigInteger2 = transactViewModel.B.f11039s;
                    e.B(bigInteger2);
                    BigInteger subtract2 = subtract.subtract(bigInteger2);
                    e.C(subtract2, "this.subtract(other)");
                    aVar.a("performTransfer Current Balance: " + bigInteger + "  Expected Balance: " + subtract2, new Object[0]);
                    transactViewModel.C = false;
                    transactViewModel.F.k(new xa.c(c.b.SHOW));
                    g.b(jc.b.y(transactViewModel), (f) null, new t(transactViewModel, (d<? super t>) null), 3);
                    return;
                }
                e.c0("viewModel");
                throw null;
        }
    }
}
