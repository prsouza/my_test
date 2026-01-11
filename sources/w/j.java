package w;

import v.e;
import v.g;

public final class j extends p {
    public j(e eVar) {
        super(eVar);
        eVar.f12055d.f();
        eVar.f12057e.f();
        this.f12534f = ((g) eVar).f12102v0;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<w.f>, java.util.ArrayList] */
    public final void a(d dVar) {
        f fVar = this.f12535h;
        if (fVar.f12506c && !fVar.f12511j) {
            this.f12535h.d((int) ((((float) ((f) fVar.f12513l.get(0)).g) * ((g) this.f12530b).f12098r0) + 0.5f));
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v31, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v46, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v17, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v54, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v21, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v63, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final void d() {
        e eVar = this.f12530b;
        g gVar = (g) eVar;
        int i = gVar.f12099s0;
        int i10 = gVar.f12100t0;
        if (gVar.f12102v0 == 1) {
            if (i != -1) {
                this.f12535h.f12513l.add(eVar.V.f12055d.f12535h);
                this.f12530b.V.f12055d.f12535h.f12512k.add(this.f12535h);
                this.f12535h.f12509f = i;
            } else if (i10 != -1) {
                this.f12535h.f12513l.add(eVar.V.f12055d.i);
                this.f12530b.V.f12055d.i.f12512k.add(this.f12535h);
                this.f12535h.f12509f = -i10;
            } else {
                f fVar = this.f12535h;
                fVar.f12505b = true;
                fVar.f12513l.add(eVar.V.f12055d.i);
                this.f12530b.V.f12055d.i.f12512k.add(this.f12535h);
            }
            m(this.f12530b.f12055d.f12535h);
            m(this.f12530b.f12055d.i);
            return;
        }
        if (i != -1) {
            this.f12535h.f12513l.add(eVar.V.f12057e.f12535h);
            this.f12530b.V.f12057e.f12535h.f12512k.add(this.f12535h);
            this.f12535h.f12509f = i;
        } else if (i10 != -1) {
            this.f12535h.f12513l.add(eVar.V.f12057e.i);
            this.f12530b.V.f12057e.i.f12512k.add(this.f12535h);
            this.f12535h.f12509f = -i10;
        } else {
            f fVar2 = this.f12535h;
            fVar2.f12505b = true;
            fVar2.f12513l.add(eVar.V.f12057e.i);
            this.f12530b.V.f12057e.i.f12512k.add(this.f12535h);
        }
        m(this.f12530b.f12057e.f12535h);
        m(this.f12530b.f12057e.i);
    }

    public final void e() {
        e eVar = this.f12530b;
        if (((g) eVar).f12102v0 == 1) {
            eVar.f12051a0 = this.f12535h.g;
        } else {
            eVar.b0 = this.f12535h.g;
        }
    }

    public final void f() {
        this.f12535h.c();
    }

    public final boolean k() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<w.f>, java.util.ArrayList] */
    public final void m(f fVar) {
        this.f12535h.f12512k.add(fVar);
        fVar.f12513l.add(this.f12535h);
    }
}
