package jc;

public final class a extends tg.a implements Cloneable {
    public a() {
        super(new mg.a(128));
    }

    public final Object clone() throws CloneNotSupportedException {
        a aVar = (a) super.clone();
        aVar.f11607a = new mg.a((mg.a) this.f11607a);
        return aVar;
    }
}
