package zb;

import java.util.Map;
import zb.q;

public final class f0 extends g0<q.a<Object>, Object> {
    public f0(int i) {
        super(i);
    }

    public final void i() {
        if (!this.f14292s) {
            for (int i = 0; i < this.f14290b.size(); i++) {
                ((q.a) d(i).getKey()).b();
            }
            for (Map.Entry key : f()) {
                ((q.a) key.getKey()).b();
            }
        }
        super.i();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((q.a) obj, obj2);
    }
}
