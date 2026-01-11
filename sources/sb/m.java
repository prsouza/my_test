package sb;

import e6.e;
import gb.i;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import je.o;
import ri.a;
import xd.l;
import yd.h;

public final class m extends h implements l<String, md.m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f11084b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(1);
        this.f11084b = nVar;
    }

    public final Object k(Object obj) {
        o oVar;
        Object value;
        String str = (String) obj;
        e.D(str, "it");
        a.C0210a aVar = a.f10801a;
        aVar.a(a8.a.c("Keypad clickListener: ", str), new Object[0]);
        TransactViewModel transactViewModel = this.f11084b.f11086t;
        if (transactViewModel != null) {
            aVar.a(a8.a.c("Keypad numStr: ", str), new Object[0]);
            String str2 = ((i) transactViewModel.f6819y.getValue()).f5333d;
            boolean z = true;
            if (!e.r(str, "<") && fe.o.g1(str2, ".") && ((String) fe.o.y1(str2, new String[]{"."}).get(1)).length() >= 11) {
                return md.m.f8555a;
            }
            int hashCode = str.hashCode();
            if (hashCode != 48) {
                if (hashCode != 60) {
                    if (hashCode == 8226 && str.equals("•")) {
                        if (!fe.o.g1(str2, ".")) {
                            str = str2 + ".";
                            aVar.a("Keypad input: " + str, new Object[0]);
                            oVar = transactViewModel.f6819y;
                            do {
                                value = oVar.getValue();
                            } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, str, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4087)));
                            return md.m.f8555a;
                        }
                        str = str2;
                        aVar.a("Keypad input: " + str, new Object[0]);
                        oVar = transactViewModel.f6819y;
                        do {
                            value = oVar.getValue();
                        } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, str, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4087)));
                        return md.m.f8555a;
                    }
                } else if (str.equals("<")) {
                    if (str2.length() > 0) {
                        str = str2.substring(0, str2.length() - 1);
                        e.C(str, "this as java.lang.String…ing(startIndex, endIndex)");
                        if (str.length() != 0) {
                            z = false;
                        }
                        if (z) {
                            str = transactViewModel.f6817w;
                        }
                        aVar.a("Keypad input: " + str, new Object[0]);
                        oVar = transactViewModel.f6819y;
                        do {
                            value = oVar.getValue();
                        } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, str, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4087)));
                        return md.m.f8555a;
                    }
                    str = str2;
                    aVar.a("Keypad input: " + str, new Object[0]);
                    oVar = transactViewModel.f6819y;
                    do {
                        value = oVar.getValue();
                    } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, str, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4087)));
                    return md.m.f8555a;
                }
            } else if (str.equals("0")) {
                if (!str2.equals(transactViewModel.f6817w)) {
                    str = str2 + str;
                    aVar.a("Keypad input: " + str, new Object[0]);
                    oVar = transactViewModel.f6819y;
                    do {
                        value = oVar.getValue();
                    } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, str, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4087)));
                    return md.m.f8555a;
                }
                str = str2;
                aVar.a("Keypad input: " + str, new Object[0]);
                oVar = transactViewModel.f6819y;
                do {
                    value = oVar.getValue();
                } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, str, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4087)));
                return md.m.f8555a;
            }
            if (!str2.equals(transactViewModel.f6817w)) {
                str = str2 + str;
            }
            aVar.a("Keypad input: " + str, new Object[0]);
            oVar = transactViewModel.f6819y;
            do {
                value = oVar.getValue();
            } while (!oVar.g(value, i.a((i) value, (String) null, (String) null, (String) null, str, (String) null, (String) null, false, false, (gb.h) null, (Integer) null, (Integer) null, (String) null, 4087)));
            return md.m.f8555a;
        }
        e.c0("viewModel");
        throw null;
    }
}
