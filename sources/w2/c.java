package w2;

import a3.g;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o2.f;
import o2.l;
import o2.p;
import s.d;
import t2.e;
import u2.b;
import w2.b;

public final class c extends b {
    public final List<b> A = new ArrayList();
    public final RectF B = new RectF();
    public final RectF C = new RectF();
    public Paint D = new Paint();
    public r2.a<Float, Float> z;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12583a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                w2.e$b[] r0 = w2.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12583a = r0
                w2.e$b r1 = w2.e.b.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12583a     // Catch:{ NoSuchFieldError -> 0x001d }
                w2.e$b r1 = w2.e.b.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w2.c.a.<clinit>():void");
        }
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.util.List<w2.b>, java.util.ArrayList] */
    public c(l lVar, e eVar, List<e> list, f fVar) {
        super(lVar, eVar);
        b bVar;
        b bVar2;
        b bVar3 = eVar.f12600s;
        if (bVar3 != null) {
            r2.a<Float, Float> a10 = bVar3.a();
            this.z = a10;
            d(a10);
            this.z.a(this);
        } else {
            this.z = null;
        }
        d dVar = new d(fVar.i.size());
        int size = list.size() - 1;
        b bVar4 = null;
        while (true) {
            if (size >= 0) {
                e eVar2 = list.get(size);
                switch (b.a.f12581a[eVar2.f12588e.ordinal()]) {
                    case 1:
                        bVar2 = new g(lVar, eVar2);
                        break;
                    case 2:
                        bVar2 = new c(lVar, eVar2, fVar.f9199c.get(eVar2.g), fVar);
                        break;
                    case 3:
                        bVar2 = new h(lVar, eVar2);
                        break;
                    case 4:
                        bVar2 = new d(lVar, eVar2);
                        break;
                    case 5:
                        bVar2 = new f(lVar, eVar2);
                        break;
                    case 6:
                        bVar2 = new i(lVar, eVar2);
                        break;
                    default:
                        StringBuilder d10 = a.a.d("Unknown layer type ");
                        d10.append(eVar2.f12588e);
                        a3.c.b(d10.toString());
                        bVar2 = null;
                        break;
                }
                if (bVar2 != null) {
                    dVar.i(bVar2.f12570o.f12587d, bVar2);
                    if (bVar4 != null) {
                        bVar4.f12573r = bVar2;
                        bVar4 = null;
                    } else {
                        this.A.add(0, bVar2);
                        int i = a.f12583a[eVar2.f12602u.ordinal()];
                        if (i == 1 || i == 2) {
                            bVar4 = bVar2;
                        }
                    }
                }
                size--;
            } else {
                for (int i10 = 0; i10 < dVar.j(); i10++) {
                    b bVar5 = (b) dVar.g(dVar.h(i10), null);
                    if (!(bVar5 == null || (bVar = (b) dVar.g(bVar5.f12570o.f12589f, null)) == null)) {
                        bVar5.f12574s = bVar;
                    }
                }
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.List<w2.b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<w2.b>, java.util.ArrayList] */
    public final void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        for (int size = this.A.size() - 1; size >= 0; size--) {
            this.B.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) this.A.get(size)).a(this.B, this.f12568m, true);
            rectF.union(this.B);
        }
    }

    public final <T> void f(T t10, b3.c cVar) {
        super.f(t10, cVar);
        if (t10 != p.A) {
            return;
        }
        if (cVar == null) {
            r2.a<Float, Float> aVar = this.z;
            if (aVar != null) {
                aVar.j((b3.c) null);
                return;
            }
            return;
        }
        r2.p pVar = new r2.p(cVar, null);
        this.z = pVar;
        pVar.a(this);
        d(this.z);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<w2.b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.List<w2.b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.util.List<w2.b>, java.util.ArrayList] */
    public final void j(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.C;
        e eVar = this.f12570o;
        rectF.set(0.0f, 0.0f, (float) eVar.f12596o, (float) eVar.f12597p);
        matrix.mapRect(this.C);
        boolean z10 = this.f12569n.H && this.A.size() > 1 && i != 255;
        if (z10) {
            this.D.setAlpha(i);
            RectF rectF2 = this.C;
            Paint paint = this.D;
            ThreadLocal<PathMeasure> threadLocal = g.f50a;
            canvas.saveLayer(rectF2, paint);
            ad.c.E();
        } else {
            canvas.save();
        }
        if (z10) {
            i = 255;
        }
        for (int size = this.A.size() - 1; size >= 0; size--) {
            if (!this.C.isEmpty() ? canvas.clipRect(this.C) : true) {
                ((b) this.A.get(size)).e(canvas, matrix, i);
            }
        }
        canvas.restore();
        ad.c.E();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<w2.b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<w2.b>, java.util.ArrayList] */
    public final void o(e eVar, int i, List<e> list, e eVar2) {
        for (int i10 = 0; i10 < this.A.size(); i10++) {
            ((b) this.A.get(i10)).g(eVar, i, list, eVar2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<w2.b>, java.util.ArrayList] */
    public final void p(boolean z10) {
        if (z10 && this.f12580y == null) {
            this.f12580y = new p2.a();
        }
        this.f12579x = z10;
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((b) it.next()).p(z10);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<w2.b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<w2.b>, java.util.ArrayList] */
    public final void q(float f10) {
        super.q(f10);
        r2.a<Float, Float> aVar = this.z;
        if (aVar != null) {
            f fVar = this.f12569n.f9228b;
            f10 = ((aVar.f().floatValue() * this.f12570o.f12585b.f9207m) - this.f12570o.f12585b.f9205k) / ((fVar.f9206l - fVar.f9205k) + 0.01f);
        }
        if (this.z == null) {
            e eVar = this.f12570o;
            float f11 = eVar.f12595n;
            f fVar2 = eVar.f12585b;
            f10 -= f11 / (fVar2.f9206l - fVar2.f9205k);
        }
        float f12 = this.f12570o.f12594m;
        if (f12 != 0.0f) {
            f10 /= f12;
        }
        int size = this.A.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((b) this.A.get(size)).q(f10);
            } else {
                return;
            }
        }
    }
}
