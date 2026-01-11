package w;

import java.util.Iterator;
import v.a;
import v.e;
import w.f;

public final class k extends p {
    public k(e eVar) {
        super(eVar);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<w.f>, java.util.ArrayList] */
    public final void a(d dVar) {
        a aVar = (a) this.f12530b;
        int i = aVar.f12023t0;
        Iterator it = this.f12535h.f12513l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i == 0 || i == 2) {
            this.f12535h.d(i11 + aVar.f12025v0);
        } else {
            this.f12535h.d(i10 + aVar.f12025v0);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v13, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v15, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v19, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.util.List<w.f>, java.util.ArrayList] */
    public final void d() {
        e eVar = this.f12530b;
        if (eVar instanceof a) {
            f fVar = this.f12535h;
            fVar.f12505b = true;
            a aVar = (a) eVar;
            int i = aVar.f12023t0;
            boolean z = aVar.f12024u0;
            int i10 = 0;
            if (i == 0) {
                fVar.f12508e = f.a.LEFT;
                while (i10 < aVar.f12106s0) {
                    e eVar2 = aVar.f12105r0[i10];
                    if (z || eVar2.f12064i0 != 8) {
                        f fVar2 = eVar2.f12055d.f12535h;
                        fVar2.f12512k.add(this.f12535h);
                        this.f12535h.f12513l.add(fVar2);
                    }
                    i10++;
                }
                m(this.f12530b.f12055d.f12535h);
                m(this.f12530b.f12055d.i);
            } else if (i == 1) {
                fVar.f12508e = f.a.RIGHT;
                while (i10 < aVar.f12106s0) {
                    e eVar3 = aVar.f12105r0[i10];
                    if (z || eVar3.f12064i0 != 8) {
                        f fVar3 = eVar3.f12055d.i;
                        fVar3.f12512k.add(this.f12535h);
                        this.f12535h.f12513l.add(fVar3);
                    }
                    i10++;
                }
                m(this.f12530b.f12055d.f12535h);
                m(this.f12530b.f12055d.i);
            } else if (i == 2) {
                fVar.f12508e = f.a.TOP;
                while (i10 < aVar.f12106s0) {
                    e eVar4 = aVar.f12105r0[i10];
                    if (z || eVar4.f12064i0 != 8) {
                        f fVar4 = eVar4.f12057e.f12535h;
                        fVar4.f12512k.add(this.f12535h);
                        this.f12535h.f12513l.add(fVar4);
                    }
                    i10++;
                }
                m(this.f12530b.f12057e.f12535h);
                m(this.f12530b.f12057e.i);
            } else if (i == 3) {
                fVar.f12508e = f.a.BOTTOM;
                while (i10 < aVar.f12106s0) {
                    e eVar5 = aVar.f12105r0[i10];
                    if (z || eVar5.f12064i0 != 8) {
                        f fVar5 = eVar5.f12057e.i;
                        fVar5.f12512k.add(this.f12535h);
                        this.f12535h.f12513l.add(fVar5);
                    }
                    i10++;
                }
                m(this.f12530b.f12057e.f12535h);
                m(this.f12530b.f12057e.i);
            }
        }
    }

    public final void e() {
        e eVar = this.f12530b;
        if (eVar instanceof a) {
            int i = ((a) eVar).f12023t0;
            if (i == 0 || i == 1) {
                eVar.f12051a0 = this.f12535h.g;
            } else {
                eVar.b0 = this.f12535h.g;
            }
        }
    }

    public final void f() {
        this.f12531c = null;
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
