package qc;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10405a;

    /* renamed from: b  reason: collision with root package name */
    public a<?, ?> f10406b;

    public d(a<?, ?> aVar) {
        this.f10406b = aVar;
    }

    public final boolean a() {
        if (this.f10405a) {
            return true;
        }
        this.f10405a = true;
        a<?, ?> aVar = this.f10406b;
        boolean d10 = aVar != null ? aVar.d() : false;
        this.f10405a = false;
        return d10;
    }

    public final a<?, ?> b() {
        a<?, ?> aVar = this.f10406b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("TypeReference is null");
    }
}
