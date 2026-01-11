package tg;

import mg.a;

public final class c extends a implements Cloneable {
    public c() {
        super(new a(512));
    }

    public final Object clone() throws CloneNotSupportedException {
        c cVar = (c) super.clone();
        cVar.f11607a = new a((a) this.f11607a);
        return cVar;
    }
}
