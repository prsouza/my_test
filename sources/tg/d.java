package tg;

import mg.c;

public final class d extends a implements Cloneable {
    public d() {
        super(new c(256));
    }

    public final Object clone() {
        a aVar = (a) super.clone();
        aVar.f11607a = new c((c) this.f11607a);
        return aVar;
    }
}
