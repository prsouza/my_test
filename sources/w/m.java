package w;

import java.util.ArrayList;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public p f12518a = null;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<p> f12519b = new ArrayList<>();

    public m(p pVar) {
        this.f12518a = pVar;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final long a(f fVar, long j10) {
        p pVar = fVar.f12507d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f12512k.size();
        long j11 = j10;
        for (int i = 0; i < size; i++) {
            d dVar = (d) fVar.f12512k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f12507d != pVar) {
                    j11 = Math.min(j11, a(fVar2, ((long) fVar2.f12509f) + j10));
                }
            }
        }
        if (fVar != pVar.i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, a(pVar.f12535h, j12)), j12 - ((long) pVar.f12535h.f12509f));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final long b(f fVar, long j10) {
        p pVar = fVar.f12507d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f12512k.size();
        long j11 = j10;
        for (int i = 0; i < size; i++) {
            d dVar = (d) fVar.f12512k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f12507d != pVar) {
                    j11 = Math.max(j11, b(fVar2, ((long) fVar2.f12509f) + j10));
                }
            }
        }
        if (fVar != pVar.f12535h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, b(pVar.i, j12)), j12 - ((long) pVar.i.f12509f));
    }
}
