package tg;

import mg.i;

public final class e extends a implements Cloneable {
    public e() {
        super(new i(256));
    }

    public final Object clone() {
        a aVar = (a) super.clone();
        aVar.f11607a = new i((i) this.f11607a);
        return aVar;
    }
}
