package ee;

import ad.c;
import e6.e;
import java.util.Iterator;
import xd.p;

public final class h implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f4823a;

    public h(p pVar) {
        this.f4823a = pVar;
    }

    public final Iterator<Object> iterator() {
        p pVar = this.f4823a;
        e.D(pVar, "block");
        e eVar = new e();
        eVar.f4822c = c.C(pVar, eVar, eVar);
        return eVar;
    }
}
