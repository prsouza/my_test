package w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public p f12504a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12505b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12506c = false;

    /* renamed from: d  reason: collision with root package name */
    public p f12507d;

    /* renamed from: e  reason: collision with root package name */
    public a f12508e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    public int f12509f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f12510h = 1;
    public g i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12511j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f12512k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<f> f12513l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f12507d = pVar;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<w.f>, java.util.ArrayList] */
    public final void a(d dVar) {
        Iterator it = this.f12513l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f12511j) {
                return;
            }
        }
        this.f12506c = true;
        p pVar = this.f12504a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f12505b) {
            this.f12507d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        Iterator it2 = this.f12513l.iterator();
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f12511j) {
            g gVar = this.i;
            if (gVar != null) {
                if (gVar.f12511j) {
                    this.f12509f = this.f12510h * gVar.g;
                } else {
                    return;
                }
            }
            d(fVar.g + this.f12509f);
        }
        p pVar2 = this.f12504a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final void b(d dVar) {
        this.f12512k.add(dVar);
        if (this.f12511j) {
            dVar.a(dVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final void c() {
        this.f12513l.clear();
        this.f12512k.clear();
        this.f12511j = false;
        this.g = 0;
        this.f12506c = false;
        this.f12505b = false;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<w.d>, java.util.ArrayList] */
    public void d(int i10) {
        if (!this.f12511j) {
            this.f12511j = true;
            this.g = i10;
            Iterator it = this.f12512k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12507d.f12530b.f12066j0);
        sb2.append(":");
        sb2.append(this.f12508e);
        sb2.append("(");
        sb2.append(this.f12511j ? Integer.valueOf(this.g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f12513l.size());
        sb2.append(":d=");
        sb2.append(this.f12512k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
