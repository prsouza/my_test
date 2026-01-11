package sb;

import android.view.View;
import de.h;
import e6.e;
import gb.i;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import je.o;
import ri.a;
import ub.f;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11049a;

    public /* synthetic */ d(e eVar) {
        this.f11049a = eVar;
    }

    public final void onClick(View view) {
        String str;
        boolean z;
        e eVar = this.f11049a;
        h<Object>[] hVarArr = e.f11050w;
        e.D(eVar, "this$0");
        e.C(view, "it");
        f.a(view);
        TransactViewModel transactViewModel = eVar.f11051t;
        if (transactViewModel != null) {
            String obj = eVar.c().f12422b.getText().toString();
            e.D(obj, "text");
            a.f10801a.a(a8.a.c("Transact Account: ", obj), new Object[0]);
            o oVar = transactViewModel.f6819y;
            while (true) {
                Object value = oVar.getValue();
                str = obj;
                if (oVar.g(value, i.a((i) value, (String) null, (String) null, obj, (String) null, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4091))) {
                    break;
                }
                obj = str;
            }
            za.h hVar = za.h.f14215a;
            try {
                gd.a aVar = gd.a.f5360c;
                gd.a.a(str);
                z = true;
            } catch (Exception e10) {
                e10.printStackTrace();
                z = false;
            }
            if (!z) {
                transactViewModel.n(R.string.invalidPkError, 3000L);
                return;
            }
            za.h hVar2 = za.h.f14215a;
            String str2 = str;
            if (e.r(hVar2.e(str2), transactViewModel.B.f11036a)) {
                transactViewModel.n(R.string.ownAccountError, 5000L);
            } else if (!e.r(str2, hVar2.e(str2))) {
                transactViewModel.l(TransactViewModel.a.SHOW_PK4_ALERT);
            } else {
                transactViewModel.B.f11037b = str2;
                a.f10801a.a(a8.a.c("Set payInfo.toAccount: ", str2), new Object[0]);
                transactViewModel.m();
            }
        } else {
            e.c0("viewModel");
            throw null;
        }
    }
}
