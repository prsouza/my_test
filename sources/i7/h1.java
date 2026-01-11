package i7;

import i7.t;
import java.util.Map;

public final class h1 extends i1<t.b<Object>, Object> {
    public h1(int i) {
        super(i);
    }

    public final void h() {
        if (!this.f6284s) {
            for (int i = 0; i < e(); i++) {
                ((t.b) d(i).getKey()).f();
            }
            for (Map.Entry key : f()) {
                ((t.b) key.getKey()).f();
            }
        }
        super.h();
    }
}
