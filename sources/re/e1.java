package re;

import java.util.ArrayList;
import pe.e;
import qe.a;
import qe.b;

public abstract class e1<Tag> implements b, a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Tag> f10689a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f10690b;

    public final float A() {
        return I(N());
    }

    public final long C(e eVar, int i) {
        e6.e.D(eVar, "descriptor");
        return K(((te.a) this).R(eVar, i));
    }

    public final double D() {
        return H(N());
    }

    public abstract boolean E(Tag tag);

    public abstract byte F(Tag tag);

    public abstract char G(Tag tag);

    public abstract double H(Tag tag);

    public abstract float I(Tag tag);

    public abstract int J(Tag tag);

    public abstract long K(Tag tag);

    public abstract short L(Tag tag);

    public abstract String M(Tag tag);

    public final Tag N() {
        ArrayList<Tag> arrayList = this.f10689a;
        Tag remove = arrayList.remove(a.b.c0(arrayList));
        this.f10690b = true;
        return remove;
    }

    public final long a() {
        return K(N());
    }

    public final boolean b() {
        return E(N());
    }

    public final boolean d(e eVar, int i) {
        e6.e.D(eVar, "descriptor");
        return E(((te.a) this).R(eVar, i));
    }

    public final char f() {
        return G(N());
    }

    public final byte g(e eVar, int i) {
        e6.e.D(eVar, "descriptor");
        return F(((te.a) this).R(eVar, i));
    }

    public final String h(e eVar, int i) {
        e6.e.D(eVar, "descriptor");
        return M(((te.a) this).R(eVar, i));
    }

    public final float i(e eVar, int i) {
        e6.e.D(eVar, "descriptor");
        return I(((te.a) this).R(eVar, i));
    }

    public final void l() {
    }

    public final int o() {
        return J(N());
    }

    public final byte q() {
        return F(N());
    }

    public final char r(e eVar, int i) {
        e6.e.D(eVar, "descriptor");
        return G(((te.a) this).R(eVar, i));
    }

    public final double s(e eVar, int i) {
        e6.e.D(eVar, "descriptor");
        return H(((te.a) this).R(eVar, i));
    }

    public final short t(e eVar, int i) {
        e6.e.D(eVar, "descriptor");
        return L(((te.a) this).R(eVar, i));
    }

    public final <T> Object u(e eVar, int i, oe.a aVar) {
        e6.e.D(eVar, "descriptor");
        e6.e.D(aVar, "deserializer");
        te.a aVar2 = (te.a) this;
        this.f10689a.add(aVar2.R(eVar, i));
        Object D = aa.b.D(aVar2, aVar);
        if (!this.f10690b) {
            N();
        }
        this.f10690b = false;
        return D;
    }

    public final int v(e eVar, int i) {
        e6.e.D(eVar, "descriptor");
        return J(((te.a) this).R(eVar, i));
    }

    public final void w() {
    }

    public final int x(e eVar) {
        e6.e.D(eVar, "enumDescriptor");
        String str = (String) N();
        e6.e.D(str, "tag");
        return jc.b.t(eVar, ((te.a) this).T(str).d());
    }

    public final short y() {
        return L(N());
    }

    public final String z() {
        return M(N());
    }
}
