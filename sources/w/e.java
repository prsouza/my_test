package w;

import a.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import v.e;
import v.f;
import v.g;
import v.i;
import w.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public f f12497a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12498b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12499c = true;

    /* renamed from: d  reason: collision with root package name */
    public f f12500d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f12501e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.C0243b f12502f;
    public b.a g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<m> f12503h;

    public e(f fVar) {
        new ArrayList();
        this.f12502f = null;
        this.g = new b.a();
        this.f12503h = new ArrayList<>();
        this.f12497a = fVar;
        this.f12500d = fVar;
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r11v9, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v4, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final void a(f fVar, int i, int i10, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f12507d;
        if (pVar.f12531c == null) {
            f fVar3 = this.f12497a;
            if (pVar != fVar3.f12055d && pVar != fVar3.f12057e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.f12531c = mVar;
                mVar.f12519b.add(pVar);
                Iterator it = pVar.f12535h.f12512k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i, 0, fVar2, arrayList, mVar);
                    }
                }
                Iterator it2 = pVar.i.f12512k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).f12520k.f12512k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = pVar.f12535h.f12513l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i, 0, fVar2, arrayList, mVar);
                }
                Iterator it5 = pVar.i.f12513l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i, 1, fVar2, arrayList, mVar);
                }
                if (i == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).f12520k.f12513l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028e, code lost:
        r4 = r0.U;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(v.f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<v.e> r1 = r0.f12108r0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0345
            java.lang.Object r2 = r1.next()
            v.e r2 = (v.e) r2
            v.e$b[] r3 = r2.U
            r4 = 0
            r5 = r3[r4]
            r9 = 1
            r3 = r3[r9]
            int r6 = r2.f12064i0
            r7 = 8
            if (r6 != r7) goto L_0x0025
            r2.f12050a = r9
            goto L_0x0008
        L_0x0025:
            float r6 = r2.f12086w
            r10 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r8 = 2
            if (r7 >= 0) goto L_0x0034
            v.e$b r7 = v.e.b.MATCH_CONSTRAINT
            if (r5 != r7) goto L_0x0034
            r2.f12081r = r8
        L_0x0034:
            float r7 = r2.z
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0040
            v.e$b r11 = v.e.b.MATCH_CONSTRAINT
            if (r3 != r11) goto L_0x0040
            r2.f12082s = r8
        L_0x0040:
            float r11 = r2.Y
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            r12 = 3
            if (r11 <= 0) goto L_0x0074
            v.e$b r11 = v.e.b.MATCH_CONSTRAINT
            if (r5 != r11) goto L_0x0057
            v.e$b r13 = v.e.b.WRAP_CONTENT
            if (r3 == r13) goto L_0x0054
            v.e$b r13 = v.e.b.FIXED
            if (r3 != r13) goto L_0x0057
        L_0x0054:
            r2.f12081r = r12
            goto L_0x0074
        L_0x0057:
            if (r3 != r11) goto L_0x0064
            v.e$b r13 = v.e.b.WRAP_CONTENT
            if (r5 == r13) goto L_0x0061
            v.e$b r13 = v.e.b.FIXED
            if (r5 != r13) goto L_0x0064
        L_0x0061:
            r2.f12082s = r12
            goto L_0x0074
        L_0x0064:
            if (r5 != r11) goto L_0x0074
            if (r3 != r11) goto L_0x0074
            int r11 = r2.f12081r
            if (r11 != 0) goto L_0x006e
            r2.f12081r = r12
        L_0x006e:
            int r11 = r2.f12082s
            if (r11 != 0) goto L_0x0074
            r2.f12082s = r12
        L_0x0074:
            v.e$b r11 = v.e.b.MATCH_CONSTRAINT
            if (r5 != r11) goto L_0x008a
            int r13 = r2.f12081r
            if (r13 != r9) goto L_0x008a
            v.d r13 = r2.J
            v.d r13 = r13.f12047f
            if (r13 == 0) goto L_0x0088
            v.d r13 = r2.L
            v.d r13 = r13.f12047f
            if (r13 != 0) goto L_0x008a
        L_0x0088:
            v.e$b r5 = v.e.b.WRAP_CONTENT
        L_0x008a:
            if (r3 != r11) goto L_0x009e
            int r13 = r2.f12082s
            if (r13 != r9) goto L_0x009e
            v.d r13 = r2.K
            v.d r13 = r13.f12047f
            if (r13 == 0) goto L_0x009c
            v.d r13 = r2.M
            v.d r13 = r13.f12047f
            if (r13 != 0) goto L_0x009e
        L_0x009c:
            v.e$b r3 = v.e.b.WRAP_CONTENT
        L_0x009e:
            r13 = r3
            w.l r3 = r2.f12055d
            r3.f12532d = r5
            int r14 = r2.f12081r
            r3.f12529a = r14
            w.n r3 = r2.f12057e
            r3.f12532d = r13
            int r15 = r2.f12082s
            r3.f12529a = r15
            v.e$b r3 = v.e.b.MATCH_PARENT
            if (r5 == r3) goto L_0x00bb
            v.e$b r10 = v.e.b.FIXED
            if (r5 == r10) goto L_0x00bb
            v.e$b r10 = v.e.b.WRAP_CONTENT
            if (r5 != r10) goto L_0x00c7
        L_0x00bb:
            if (r13 == r3) goto L_0x02f2
            v.e$b r10 = v.e.b.FIXED
            if (r13 == r10) goto L_0x02f2
            v.e$b r10 = v.e.b.WRAP_CONTENT
            if (r13 != r10) goto L_0x00c7
            goto L_0x02f2
        L_0x00c7:
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r11) goto L_0x019d
            v.e$b r8 = v.e.b.WRAP_CONTENT
            if (r13 == r8) goto L_0x00d3
            v.e$b r4 = v.e.b.FIXED
            if (r13 != r4) goto L_0x019d
        L_0x00d3:
            if (r14 != r12) goto L_0x010f
            if (r13 != r8) goto L_0x00e2
            r6 = 0
            r11 = 0
            r3 = r16
            r4 = r2
            r5 = r8
            r7 = r8
            r8 = r11
            r3.f(r4, r5, r6, r7, r8)
        L_0x00e2:
            int r8 = r2.k()
            float r3 = (float) r8
            float r4 = r2.Y
            float r3 = r3 * r4
            float r3 = r3 + r10
            int r6 = (int) r3
            v.e$b r7 = v.e.b.FIXED
            r3 = r16
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r4 = r2.r()
            r3.d(r4)
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r4 = r2.k()
            r3.d(r4)
            r2.f12050a = r9
            goto L_0x0008
        L_0x010f:
            if (r14 != r9) goto L_0x0128
            r6 = 0
            r9 = 0
            r3 = r16
            r4 = r2
            r5 = r8
            r7 = r13
            r8 = r9
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r2 = r2.r()
            r3.f12514m = r2
            goto L_0x0008
        L_0x0128:
            r4 = 2
            if (r14 != r4) goto L_0x0167
            v.e$b[] r4 = r0.U
            r8 = 0
            r12 = r4[r8]
            v.e$b r9 = v.e.b.FIXED
            if (r12 == r9) goto L_0x0138
            r4 = r4[r8]
            if (r4 != r3) goto L_0x019d
        L_0x0138:
            int r3 = r17.r()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r10
            int r6 = (int) r6
            int r8 = r2.k()
            r3 = r16
            r4 = r2
            r5 = r9
            r7 = r13
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r4 = r2.r()
            r3.d(r4)
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r4 = r2.k()
            r3.d(r4)
            r4 = 1
            r2.f12050a = r4
            goto L_0x0008
        L_0x0167:
            r4 = r9
            v.d[] r9 = r2.R
            r12 = 0
            r10 = r9[r12]
            v.d r10 = r10.f12047f
            if (r10 == 0) goto L_0x0177
            r9 = r9[r4]
            v.d r4 = r9.f12047f
            if (r4 != 0) goto L_0x019d
        L_0x0177:
            r6 = 0
            r9 = 0
            r3 = r16
            r4 = r2
            r5 = r8
            r7 = r13
            r8 = r9
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r4 = r2.r()
            r3.d(r4)
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r4 = r2.k()
            r3.d(r4)
            r3 = 1
            r2.f12050a = r3
            goto L_0x0008
        L_0x019d:
            if (r13 != r11) goto L_0x027f
            v.e$b r8 = v.e.b.WRAP_CONTENT
            if (r5 == r8) goto L_0x01a7
            v.e$b r4 = v.e.b.FIXED
            if (r5 != r4) goto L_0x027f
        L_0x01a7:
            r4 = 3
            if (r15 != r4) goto L_0x01f0
            if (r5 != r8) goto L_0x01b7
            r6 = 0
            r9 = 0
            r3 = r16
            r4 = r2
            r5 = r8
            r7 = r8
            r8 = r9
            r3.f(r4, r5, r6, r7, r8)
        L_0x01b7:
            int r6 = r2.r()
            float r3 = r2.Y
            int r4 = r2.Z
            r5 = -1
            if (r4 != r5) goto L_0x01c6
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c6:
            float r4 = (float) r6
            float r4 = r4 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r3
            int r8 = (int) r4
            v.e$b r7 = v.e.b.FIXED
            r3 = r16
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r4 = r2.r()
            r3.d(r4)
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r4 = r2.k()
            r3.d(r4)
            r4 = 1
            r2.f12050a = r4
            goto L_0x0008
        L_0x01f0:
            r4 = 1
            if (r15 != r4) goto L_0x0209
            r6 = 0
            r9 = 0
            r3 = r16
            r4 = r2
            r7 = r8
            r8 = r9
            r3.f(r4, r5, r6, r7, r8)
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r2 = r2.k()
            r3.f12514m = r2
            goto L_0x0008
        L_0x0209:
            r4 = 2
            if (r15 != r4) goto L_0x0249
            v.e$b[] r4 = r0.U
            r8 = 1
            r9 = r4[r8]
            v.e$b r10 = v.e.b.FIXED
            if (r9 == r10) goto L_0x0219
            r4 = r4[r8]
            if (r4 != r3) goto L_0x027f
        L_0x0219:
            int r6 = r2.r()
            int r3 = r17.k()
            float r3 = (float) r3
            float r7 = r7 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r3
            int r8 = (int) r7
            r3 = r16
            r4 = r2
            r7 = r10
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r4 = r2.r()
            r3.d(r4)
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r4 = r2.k()
            r3.d(r4)
            r3 = 1
            r2.f12050a = r3
            goto L_0x0008
        L_0x0249:
            v.d[] r3 = r2.R
            r4 = 2
            r9 = r3[r4]
            v.d r4 = r9.f12047f
            if (r4 == 0) goto L_0x0259
            r4 = 3
            r3 = r3[r4]
            v.d r3 = r3.f12047f
            if (r3 != 0) goto L_0x027f
        L_0x0259:
            r6 = 0
            r9 = 0
            r3 = r16
            r4 = r2
            r5 = r8
            r7 = r13
            r8 = r9
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r4 = r2.r()
            r3.d(r4)
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r4 = r2.k()
            r3.d(r4)
            r3 = 1
            r2.f12050a = r3
            goto L_0x0008
        L_0x027f:
            r3 = 1
            if (r5 != r11) goto L_0x0008
            if (r13 != r11) goto L_0x0008
            if (r14 == r3) goto L_0x02d1
            if (r15 != r3) goto L_0x0289
            goto L_0x02d1
        L_0x0289:
            r4 = 2
            if (r15 != r4) goto L_0x0008
            if (r14 != r4) goto L_0x0008
            v.e$b[] r4 = r0.U
            r5 = 0
            r5 = r4[r5]
            v.e$b r8 = v.e.b.FIXED
            if (r5 != r8) goto L_0x0008
            r4 = r4[r3]
            if (r4 != r8) goto L_0x0008
            int r3 = r17.r()
            float r3 = (float) r3
            float r6 = r6 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r3
            int r6 = (int) r6
            int r4 = r17.k()
            float r4 = (float) r4
            float r7 = r7 * r4
            float r7 = r7 + r3
            int r9 = (int) r7
            r3 = r16
            r4 = r2
            r5 = r8
            r7 = r8
            r8 = r9
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r4 = r2.r()
            r3.d(r4)
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r4 = r2.k()
            r3.d(r4)
            r3 = 1
            r2.f12050a = r3
            goto L_0x0008
        L_0x02d1:
            v.e$b r7 = v.e.b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r16
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r4 = r2.r()
            r3.f12514m = r4
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r2 = r2.k()
            r3.f12514m = r2
            goto L_0x0008
        L_0x02f2:
            int r4 = r2.r()
            if (r5 != r3) goto L_0x0308
            int r4 = r17.r()
            v.d r5 = r2.J
            int r5 = r5.g
            int r4 = r4 - r5
            v.d r5 = r2.L
            int r5 = r5.g
            int r4 = r4 - r5
            v.e$b r5 = v.e.b.FIXED
        L_0x0308:
            r6 = r4
            int r4 = r2.k()
            if (r13 != r3) goto L_0x0322
            int r3 = r17.k()
            v.d r4 = r2.K
            int r4 = r4.g
            int r3 = r3 - r4
            v.d r4 = r2.M
            int r4 = r4.g
            int r3 = r3 - r4
            v.e$b r4 = v.e.b.FIXED
            r8 = r3
            r7 = r4
            goto L_0x0324
        L_0x0322:
            r8 = r4
            r7 = r13
        L_0x0324:
            r3 = r16
            r4 = r2
            r3.f(r4, r5, r6, r7, r8)
            w.l r3 = r2.f12055d
            w.g r3 = r3.f12533e
            int r4 = r2.r()
            r3.d(r4)
            w.n r3 = r2.f12057e
            w.g r3 = r3.f12533e
            int r4 = r2.k()
            r3.d(r4)
            r3 = 1
            r2.f12050a = r3
            goto L_0x0008
        L_0x0345:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.b(v.f):void");
    }

    public final void c() {
        ArrayList<p> arrayList = this.f12501e;
        arrayList.clear();
        this.f12500d.f12055d.f();
        this.f12500d.f12057e.f();
        arrayList.add(this.f12500d.f12055d);
        arrayList.add(this.f12500d.f12057e);
        Iterator<v.e> it = this.f12500d.f12108r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            v.e next = it.next();
            if (next instanceof g) {
                arrayList.add(new j(next));
            } else {
                if (next.y()) {
                    if (next.f12052b == null) {
                        next.f12052b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f12052b);
                } else {
                    arrayList.add(next.f12055d);
                }
                if (next.z()) {
                    if (next.f12053c == null) {
                        next.f12053c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f12053c);
                } else {
                    arrayList.add(next.f12057e);
                }
                if (next instanceof i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f12530b != this.f12500d) {
                next2.d();
            }
        }
        this.f12503h.clear();
        e(this.f12497a.f12055d, 0, this.f12503h);
        e(this.f12497a.f12057e, 1, this.f12503h);
        this.f12498b = false;
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r11v5, types: [java.util.List<w.f>, java.util.ArrayList] */
    public final int d(f fVar, int i) {
        float f10;
        e eVar = this;
        f fVar2 = fVar;
        int i10 = i;
        int size = eVar.f12503h.size();
        long j10 = 0;
        int i11 = 0;
        long j11 = 0;
        while (i11 < size) {
            m mVar = eVar.f12503h.get(i11);
            p pVar = mVar.f12518a;
            if (pVar instanceof c) {
                if (((c) pVar).f12534f != i10) {
                    j10 = Math.max(j10, j11);
                    i11++;
                    j11 = 0;
                    eVar = this;
                    fVar2 = fVar;
                }
            } else if (i10 == 0) {
                if (!(pVar instanceof l)) {
                    j10 = Math.max(j10, j11);
                    i11++;
                    j11 = 0;
                    eVar = this;
                    fVar2 = fVar;
                }
            } else if (!(pVar instanceof n)) {
                j10 = Math.max(j10, j11);
                i11++;
                j11 = 0;
                eVar = this;
                fVar2 = fVar;
            }
            f fVar3 = (i10 == 0 ? fVar2.f12055d : fVar2.f12057e).f12535h;
            f fVar4 = (i10 == 0 ? fVar2.f12055d : fVar2.f12057e).i;
            boolean contains = pVar.f12535h.f12513l.contains(fVar3);
            boolean contains2 = mVar.f12518a.i.f12513l.contains(fVar4);
            long j12 = mVar.f12518a.j();
            if (!contains || !contains2) {
                if (contains) {
                    f fVar5 = mVar.f12518a.f12535h;
                    j11 = Math.max(mVar.b(fVar5, (long) fVar5.f12509f), ((long) mVar.f12518a.f12535h.f12509f) + j12);
                } else if (contains2) {
                    f fVar6 = mVar.f12518a.i;
                    j11 = Math.max(-mVar.a(fVar6, (long) fVar6.f12509f), ((long) (-mVar.f12518a.i.f12509f)) + j12);
                } else {
                    p pVar2 = mVar.f12518a;
                    j11 = (pVar2.j() + ((long) pVar2.f12535h.f12509f)) - ((long) mVar.f12518a.i.f12509f);
                }
                j10 = Math.max(j10, j11);
                i11++;
                j11 = 0;
                eVar = this;
                fVar2 = fVar;
            } else {
                long b10 = mVar.b(mVar.f12518a.f12535h, j11);
                long a10 = mVar.a(mVar.f12518a.i, j11);
                long j13 = b10 - j12;
                p pVar3 = mVar.f12518a;
                int i12 = pVar3.i.f12509f;
                if (j13 >= ((long) (-i12))) {
                    j13 += (long) i12;
                }
                long j14 = (long) pVar3.f12535h.f12509f;
                long j15 = ((-a10) - j12) - j14;
                if (j15 >= j14) {
                    j15 -= j14;
                }
                v.e eVar2 = pVar3.f12530b;
                Objects.requireNonNull(eVar2);
                if (i10 == 0) {
                    f10 = eVar2.f12060f0;
                } else {
                    f10 = i10 == 1 ? eVar2.f12061g0 : -1.0f;
                }
                float f11 = (float) (f10 > 0.0f ? (long) ((((float) j13) / (1.0f - f10)) + (((float) j15) / f10)) : 0);
                long a11 = ((long) ((f11 * f10) + 0.5f)) + j12 + ((long) a.a(1.0f, f10, f11, 0.5f));
                p pVar4 = mVar.f12518a;
                j11 = (((long) pVar4.f12535h.f12509f) + a11) - ((long) pVar4.i.f12509f);
                j10 = Math.max(j10, j11);
                i11++;
                j11 = 0;
                eVar = this;
                fVar2 = fVar;
            }
        }
        return (int) j10;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r11v3, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final void e(p pVar, int i, ArrayList<m> arrayList) {
        Iterator it = pVar.f12535h.f12512k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i, 0, pVar.i, arrayList, (m) null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f12535h, i, 0, pVar.i, arrayList, (m) null);
            }
        }
        Iterator it2 = pVar.i.f12512k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i, 1, pVar.f12535h, arrayList, (m) null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).i, i, 1, pVar.f12535h, arrayList, (m) null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((n) pVar).f12520k.f12512k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, 2, (f) null, arrayList, (m) null);
                }
            }
        }
    }

    public final void f(v.e eVar, e.b bVar, int i, e.b bVar2, int i10) {
        b.a aVar = this.g;
        aVar.f12487a = bVar;
        aVar.f12488b = bVar2;
        aVar.f12489c = i;
        aVar.f12490d = i10;
        ((ConstraintLayout.c) this.f12502f).b(eVar, aVar);
        eVar.Q(this.g.f12491e);
        eVar.L(this.g.f12492f);
        b.a aVar2 = this.g;
        eVar.E = aVar2.f12493h;
        eVar.I(aVar2.g);
    }

    public final void g() {
        a aVar;
        Iterator<v.e> it = this.f12497a.f12108r0.iterator();
        while (it.hasNext()) {
            v.e next = it.next();
            if (!next.f12050a) {
                e.b[] bVarArr = next.U;
                boolean z = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i = next.f12081r;
                int i10 = next.f12082s;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z10 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i10 == 1)) {
                    z = true;
                }
                g gVar = next.f12055d.f12533e;
                boolean z11 = gVar.f12511j;
                g gVar2 = next.f12057e.f12533e;
                boolean z12 = gVar2.f12511j;
                if (z11 && z12) {
                    e.b bVar4 = e.b.FIXED;
                    f(next, bVar4, gVar.g, bVar4, gVar2.g);
                    next.f12050a = true;
                } else if (z11 && z) {
                    f(next, e.b.FIXED, gVar.g, bVar3, gVar2.g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f12057e.f12533e.f12514m = next.k();
                    } else {
                        next.f12057e.f12533e.d(next.k());
                        next.f12050a = true;
                    }
                } else if (z12 && z10) {
                    f(next, bVar3, gVar.g, e.b.FIXED, gVar2.g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f12055d.f12533e.f12514m = next.r();
                    } else {
                        next.f12055d.f12533e.d(next.r());
                        next.f12050a = true;
                    }
                }
                if (next.f12050a && (aVar = next.f12057e.f12521l) != null) {
                    aVar.d(next.f12054c0);
                }
            }
        }
    }
}
