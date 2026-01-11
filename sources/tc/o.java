package tc;

import a.b;
import e6.e;
import java.util.List;
import qc.d;
import rc.c;

public final class o extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(d dVar, d dVar2) {
        super("Result", (List<c.a<d>>) b.o0(new c.a("Ok", dVar), new c.a("Err", dVar2)));
        e.D(dVar, "ok");
        e.D(dVar2, "err");
    }
}
