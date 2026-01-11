package mb;

import android.view.View;
import androidx.fragment.app.Fragment;
import de.h;
import e6.e;
import gb.i;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import je.o;
import mb.c;
import sa.b;
import sb.n;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8527a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f8528b;

    public /* synthetic */ f(Fragment fragment, int i) {
        this.f8527a = i;
        this.f8528b = fragment;
    }

    public final void onClick(View view) {
        Object value;
        switch (this.f8527a) {
            case 0:
                c cVar = (c) this.f8528b;
                e.D(cVar, "this$0");
                c.b bVar = cVar.f8520s;
                if (bVar != null) {
                    bVar.c();
                    return;
                }
                return;
            default:
                n nVar = (n) this.f8528b;
                h<Object>[] hVarArr = n.f11085w;
                e.D(nVar, "this$0");
                TransactViewModel transactViewModel = nVar.f11086t;
                if (transactViewModel != null) {
                    b bVar2 = transactViewModel.B;
                    String str = ((i) transactViewModel.f6819y.getValue()).f5333d;
                    e.D(str, "nodl");
                    BigDecimal bigDecimal = new BigDecimal(str);
                    BigDecimal pow = BigDecimal.TEN.pow(11);
                    e.C(pow, "TEN.pow(AMOUNT_MAX_DECIMALS)");
                    BigDecimal multiply = bigDecimal.multiply(pow);
                    e.C(multiply, "this.multiply(other)");
                    BigInteger bigInteger = multiply.toBigInteger();
                    e.C(bigInteger, "nodl.toBigDecimal() * Bi…DECIMALS)).toBigInteger()");
                    Objects.requireNonNull(bVar2);
                    bVar2.f11038c = bigInteger;
                    BigInteger bigInteger2 = transactViewModel.B.f11038c;
                    boolean z = false;
                    if (bigInteger2.compareTo(transactViewModel.A) > 0) {
                        transactViewModel.o(gb.h.UPPER_LIMIT);
                    } else {
                        BigInteger valueOf = BigInteger.valueOf(0);
                        e.C(valueOf, "valueOf(this.toLong())");
                        if (bigInteger2.compareTo(valueOf) <= 0) {
                            transactViewModel.o(gb.h.LOWER_LIMIT);
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        o oVar = transactViewModel.f6819y;
                        do {
                            value = oVar.getValue();
                        } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, (String) null, "...", "...", false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4047)));
                        transactViewModel.m();
                        return;
                    }
                    return;
                }
                e.c0("viewModel");
                throw null;
        }
    }
}
