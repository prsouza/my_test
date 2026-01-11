package w;

import java.util.Iterator;
import w.f;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f12514m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f12508e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f12508e = f.a.VERTICAL_DIMENSION;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final void d(int i) {
        if (!this.f12511j) {
            this.f12511j = true;
            this.g = i;
            Iterator it = this.f12512k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }
}
