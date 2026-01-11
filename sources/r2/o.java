package r2;

import android.graphics.Matrix;
import android.graphics.PointF;
import b3.c;
import b3.d;
import java.util.Collections;
import o2.p;
import r2.a;
import u2.b;
import u2.e;
import u2.g;
import u2.l;
import u2.m;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f10550a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f10551b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f10552c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f10553d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f10554e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f10555f;
    public a<?, PointF> g;

    /* renamed from: h  reason: collision with root package name */
    public a<d, d> f10556h;
    public a<Float, Float> i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f10557j;

    /* renamed from: k  reason: collision with root package name */
    public c f10558k;

    /* renamed from: l  reason: collision with root package name */
    public c f10559l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f10560m;

    /* renamed from: n  reason: collision with root package name */
    public a<?, Float> f10561n;

    public o(l lVar) {
        a<PointF, PointF> aVar;
        a<PointF, PointF> aVar2;
        a<d, d> aVar3;
        a<Float, Float> aVar4;
        c cVar;
        c cVar2;
        e eVar = lVar.f11670a;
        if (eVar == null) {
            aVar = null;
        } else {
            aVar = eVar.a();
        }
        this.f10555f = aVar;
        m<PointF, PointF> mVar = lVar.f11671b;
        if (mVar == null) {
            aVar2 = null;
        } else {
            aVar2 = mVar.a();
        }
        this.g = aVar2;
        g gVar = lVar.f11672c;
        if (gVar == null) {
            aVar3 = null;
        } else {
            aVar3 = gVar.a();
        }
        this.f10556h = aVar3;
        b bVar = lVar.f11673d;
        if (bVar == null) {
            aVar4 = null;
        } else {
            aVar4 = bVar.a();
        }
        this.i = aVar4;
        b bVar2 = lVar.f11675f;
        if (bVar2 == null) {
            cVar = null;
        } else {
            cVar = (c) bVar2.a();
        }
        this.f10558k = cVar;
        if (cVar != null) {
            this.f10551b = new Matrix();
            this.f10552c = new Matrix();
            this.f10553d = new Matrix();
            this.f10554e = new float[9];
        } else {
            this.f10551b = null;
            this.f10552c = null;
            this.f10553d = null;
            this.f10554e = null;
        }
        b bVar3 = lVar.g;
        if (bVar3 == null) {
            cVar2 = null;
        } else {
            cVar2 = (c) bVar3.a();
        }
        this.f10559l = cVar2;
        u2.d dVar = lVar.f11674e;
        if (dVar != null) {
            this.f10557j = dVar.a();
        }
        b bVar4 = lVar.f11676h;
        if (bVar4 != null) {
            this.f10560m = bVar4.a();
        } else {
            this.f10560m = null;
        }
        b bVar5 = lVar.i;
        if (bVar5 != null) {
            this.f10561n = bVar5.a();
        } else {
            this.f10561n = null;
        }
    }

    public final void a(w2.b bVar) {
        bVar.d(this.f10557j);
        bVar.d(this.f10560m);
        bVar.d(this.f10561n);
        bVar.d(this.f10555f);
        bVar.d(this.g);
        bVar.d(this.f10556h);
        bVar.d(this.i);
        bVar.d(this.f10558k);
        bVar.d(this.f10559l);
    }

    public final void b(a.C0206a aVar) {
        a<Integer, Integer> aVar2 = this.f10557j;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
        a<?, Float> aVar3 = this.f10560m;
        if (aVar3 != null) {
            aVar3.a(aVar);
        }
        a<?, Float> aVar4 = this.f10561n;
        if (aVar4 != null) {
            aVar4.a(aVar);
        }
        a<PointF, PointF> aVar5 = this.f10555f;
        if (aVar5 != null) {
            aVar5.a(aVar);
        }
        a<?, PointF> aVar6 = this.g;
        if (aVar6 != null) {
            aVar6.a(aVar);
        }
        a<d, d> aVar7 = this.f10556h;
        if (aVar7 != null) {
            aVar7.a(aVar);
        }
        a<Float, Float> aVar8 = this.i;
        if (aVar8 != null) {
            aVar8.a(aVar);
        }
        c cVar = this.f10558k;
        if (cVar != null) {
            cVar.a(aVar);
        }
        c cVar2 = this.f10559l;
        if (cVar2 != null) {
            cVar2.a(aVar);
        }
    }

    public final <T> boolean c(T t10, c cVar) {
        c cVar2;
        c cVar3;
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t10 == p.f9273e) {
            a<PointF, PointF> aVar3 = this.f10555f;
            if (aVar3 == null) {
                this.f10555f = new p(cVar, new PointF());
                return true;
            }
            aVar3.j(cVar);
            return true;
        } else if (t10 == p.f9274f) {
            a<?, PointF> aVar4 = this.g;
            if (aVar4 == null) {
                this.g = new p(cVar, new PointF());
                return true;
            }
            aVar4.j(cVar);
            return true;
        } else if (t10 == p.f9277k) {
            a<d, d> aVar5 = this.f10556h;
            if (aVar5 == null) {
                this.f10556h = new p(cVar, new d());
                return true;
            }
            aVar5.j(cVar);
            return true;
        } else if (t10 == p.f9278l) {
            a<Float, Float> aVar6 = this.i;
            if (aVar6 == null) {
                this.i = new p(cVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.j(cVar);
            return true;
        } else if (t10 == p.f9271c) {
            a<Integer, Integer> aVar7 = this.f10557j;
            if (aVar7 == null) {
                this.f10557j = new p(cVar, 100);
                return true;
            }
            aVar7.j(cVar);
            return true;
        } else if (t10 != p.f9291y || (aVar2 = this.f10560m) == null) {
            if (t10 != p.z || (aVar = this.f10561n) == null) {
                if (t10 == p.f9279m && (cVar3 = this.f10558k) != null) {
                    if (cVar3 == null) {
                        this.f10558k = new c(Collections.singletonList(new b3.a(Float.valueOf(0.0f))));
                    }
                    this.f10558k.j(cVar);
                    return true;
                } else if (t10 != p.f9280n || (cVar2 = this.f10559l) == null) {
                    return false;
                } else {
                    if (cVar2 == null) {
                        this.f10559l = new c(Collections.singletonList(new b3.a(Float.valueOf(0.0f))));
                    }
                    this.f10559l.j(cVar);
                    return true;
                }
            } else if (aVar == null) {
                this.f10561n = new p(cVar, 100);
                return true;
            } else {
                aVar.j(cVar);
                return true;
            }
        } else if (aVar2 == null) {
            this.f10560m = new p(cVar, 100);
            return true;
        } else {
            aVar2.j(cVar);
            return true;
        }
    }

    public final void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f10554e[i10] = 0.0f;
        }
    }

    public final Matrix e() {
        float f10;
        this.f10550a.reset();
        a<?, PointF> aVar = this.g;
        if (aVar != null) {
            PointF f11 = aVar.f();
            float f12 = f11.x;
            if (!(f12 == 0.0f && f11.y == 0.0f)) {
                this.f10550a.preTranslate(f12, f11.y);
            }
        }
        a<Float, Float> aVar2 = this.i;
        if (aVar2 != null) {
            if (aVar2 instanceof p) {
                f10 = aVar2.f().floatValue();
            } else {
                f10 = ((c) aVar2).k();
            }
            if (f10 != 0.0f) {
                this.f10550a.preRotate(f10);
            }
        }
        if (this.f10558k != null) {
            c cVar = this.f10559l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.k()) + 90.0f)));
            c cVar2 = this.f10559l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.k()) + 90.0f)));
            d();
            float[] fArr = this.f10554e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f13 = -sin;
            fArr[3] = f13;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f10551b.setValues(fArr);
            d();
            float[] fArr2 = this.f10554e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.f10558k.k()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f10552c.setValues(fArr2);
            d();
            float[] fArr3 = this.f10554e;
            fArr3[0] = cos;
            fArr3[1] = f13;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f10553d.setValues(fArr3);
            this.f10552c.preConcat(this.f10551b);
            this.f10553d.preConcat(this.f10552c);
            this.f10550a.preConcat(this.f10553d);
        }
        a<d, d> aVar3 = this.f10556h;
        if (aVar3 != null) {
            d f14 = aVar3.f();
            float f15 = f14.f2862a;
            if (!(f15 == 1.0f && f14.f2863b == 1.0f)) {
                this.f10550a.preScale(f15, f14.f2863b);
            }
        }
        a<PointF, PointF> aVar4 = this.f10555f;
        if (aVar4 != null) {
            PointF f16 = aVar4.f();
            float f17 = f16.x;
            if (!(f17 == 0.0f && f16.y == 0.0f)) {
                this.f10550a.preTranslate(-f17, -f16.y);
            }
        }
        return this.f10550a;
    }

    public final Matrix f(float f10) {
        a<?, PointF> aVar = this.g;
        PointF pointF = null;
        PointF f11 = aVar == null ? null : aVar.f();
        a<d, d> aVar2 = this.f10556h;
        d f12 = aVar2 == null ? null : aVar2.f();
        this.f10550a.reset();
        if (f11 != null) {
            this.f10550a.preTranslate(f11.x * f10, f11.y * f10);
        }
        if (f12 != null) {
            double d10 = (double) f10;
            this.f10550a.preScale((float) Math.pow((double) f12.f2862a, d10), (float) Math.pow((double) f12.f2863b, d10));
        }
        a<Float, Float> aVar3 = this.i;
        if (aVar3 != null) {
            float floatValue = aVar3.f().floatValue();
            a<PointF, PointF> aVar4 = this.f10555f;
            if (aVar4 != null) {
                pointF = aVar4.f();
            }
            Matrix matrix = this.f10550a;
            float f13 = floatValue * f10;
            float f14 = 0.0f;
            float f15 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f14 = pointF.y;
            }
            matrix.preRotate(f13, f15, f14);
        }
        return this.f10550a;
    }
}
