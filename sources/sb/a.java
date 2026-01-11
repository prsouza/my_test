package sb;

import android.content.DialogInterface;
import de.h;
import e6.e;
import gb.i;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import je.o;
import ri.a;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11046a;

    public /* synthetic */ a(e eVar) {
        this.f11046a = eVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Object value;
        e eVar = this.f11046a;
        h<Object>[] hVarArr = e.f11050w;
        e.D(eVar, "this$0");
        TransactViewModel transactViewModel = eVar.f11051t;
        if (transactViewModel != null) {
            String obj = eVar.c().f12422b.getText().toString();
            e.D(obj, "pk5Text");
            transactViewModel.B.f11037b = za.h.f14215a.e(obj);
            o oVar = transactViewModel.f6819y;
            do {
                value = oVar.getValue();
            } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, transactViewModel.B.f11037b, (String) null, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4091)));
            a.C0210a aVar = ri.a.f10801a;
            String str = transactViewModel.f6816v;
            e.C(str, "TAG");
            aVar.e(str);
            aVar.a(a8.a.c("Set payInfo.toAccount: ", transactViewModel.B.f11037b), new Object[0]);
            transactViewModel.m();
            return;
        }
        e.c0("viewModel");
        throw null;
    }
}
