package tg;

import mg.a;

public final class b extends a implements Cloneable {
    public b() {
        super(new a(256));
    }

    public final Object clone() throws CloneNotSupportedException {
        b bVar = (b) super.clone();
        bVar.f11607a = new a((a) this.f11607a);
        return bVar;
    }
}
