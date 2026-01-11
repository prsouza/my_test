package e6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class k {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f4715a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f4716b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f4717c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f4718d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f4719e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f4720f;
    public final List<f> g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<g> f4721h = new ArrayList();

    public class a extends g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List f4722b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Matrix f4723c;

        public a(List list, Matrix matrix) {
            this.f4722b = list;
            this.f4723c = matrix;
        }

        public final void a(Matrix matrix, d6.a aVar, int i, Canvas canvas) {
            for (g a10 : this.f4722b) {
                a10.a(this.f4723c, aVar, i, canvas);
            }
        }
    }

    public static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        public final d f4724b;

        public b(d dVar) {
            this.f4724b = dVar;
        }

        public final void a(Matrix matrix, d6.a aVar, int i, Canvas canvas) {
            d6.a aVar2 = aVar;
            int i10 = i;
            Canvas canvas2 = canvas;
            d dVar = this.f4724b;
            float f10 = dVar.f4733f;
            float f11 = dVar.g;
            d dVar2 = this.f4724b;
            RectF rectF = new RectF(dVar2.f4729b, dVar2.f4730c, dVar2.f4731d, dVar2.f4732e);
            boolean z = f11 < 0.0f;
            Path path = aVar2.g;
            if (z) {
                int[] iArr = d6.a.f4341k;
                iArr[0] = 0;
                iArr[1] = aVar2.f4348f;
                iArr[2] = aVar2.f4347e;
                iArr[3] = aVar2.f4346d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = (float) (-i10);
                rectF.inset(f12, f12);
                int[] iArr2 = d6.a.f4341k;
                iArr2[0] = 0;
                iArr2[1] = aVar2.f4346d;
                iArr2[2] = aVar2.f4347e;
                iArr2[3] = aVar2.f4348f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f13 = 1.0f - (((float) i10) / width);
                float[] fArr = d6.a.f4342l;
                fArr[1] = f13;
                fArr[2] = ((1.0f - f13) / 2.0f) + f13;
                aVar2.f4344b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, d6.a.f4341k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f4349h);
                }
                canvas.drawArc(rectF, f10, f11, true, aVar2.f4344b);
                canvas.restore();
            }
        }
    }

    public static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        public final e f4725b;

        /* renamed from: c  reason: collision with root package name */
        public final float f4726c;

        /* renamed from: d  reason: collision with root package name */
        public final float f4727d;

        public c(e eVar, float f10, float f11) {
            this.f4725b = eVar;
            this.f4726c = f10;
            this.f4727d = f11;
        }

        public final void a(Matrix matrix, d6.a aVar, int i, Canvas canvas) {
            e eVar = this.f4725b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (eVar.f4735c - this.f4727d), (double) (eVar.f4734b - this.f4726c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4726c, this.f4727d);
            matrix2.preRotate(b());
            Objects.requireNonNull(aVar);
            rectF.bottom += (float) i;
            rectF.offset(0.0f, (float) (-i));
            int[] iArr = d6.a.i;
            iArr[0] = aVar.f4348f;
            iArr[1] = aVar.f4347e;
            iArr[2] = aVar.f4346d;
            Paint paint = aVar.f4345c;
            float f10 = rectF.left;
            paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, d6.a.f4340j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f4345c);
            canvas.restore();
        }

        public final float b() {
            e eVar = this.f4725b;
            return (float) Math.toDegrees(Math.atan((double) ((eVar.f4735c - this.f4727d) / (eVar.f4734b - this.f4726c))));
        }
    }

    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f4728h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f4729b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f4730c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f4731d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f4732e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f4733f;
        @Deprecated
        public float g;

        public d(float f10, float f11, float f12, float f13) {
            this.f4729b = f10;
            this.f4730c = f11;
            this.f4731d = f12;
            this.f4732e = f13;
        }

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4736a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f4728h;
            rectF.set(this.f4729b, this.f4730c, this.f4731d, this.f4732e);
            path.arcTo(rectF, this.f4733f, this.g, false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        public float f4734b;

        /* renamed from: c  reason: collision with root package name */
        public float f4735c;

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4736a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4734b, this.f4735c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f4736a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f4737a = new Matrix();

        public abstract void a(Matrix matrix, d6.a aVar, int i, Canvas canvas);
    }

    public k() {
        f(0.0f, 270.0f, 0.0f);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<e6.k$f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.List<e6.k$g>, java.util.ArrayList] */
    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.f4733f = f14;
        dVar.g = f15;
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z = f15 < 0.0f;
        if (z) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        float f17 = z ? (180.0f + f16) % 360.0f : f16;
        b(f14);
        this.f4721h.add(bVar);
        this.f4719e = f17;
        double d10 = (double) f16;
        this.f4717c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f4718d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<e6.k$g>, java.util.ArrayList] */
    public final void b(float f10) {
        float f11 = this.f4719e;
        if (f11 != f10) {
            float f12 = ((f10 - f11) + 360.0f) % 360.0f;
            if (f12 <= 180.0f) {
                float f13 = this.f4717c;
                float f14 = this.f4718d;
                d dVar = new d(f13, f14, f13, f14);
                dVar.f4733f = this.f4719e;
                dVar.g = f12;
                this.f4721h.add(new b(dVar));
                this.f4719e = f10;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<e6.k$f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<e6.k$f>, java.util.ArrayList] */
    public final void c(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ((f) this.g.get(i)).a(matrix, path);
        }
    }

    public final g d(Matrix matrix) {
        b(this.f4720f);
        return new a(new ArrayList(this.f4721h), new Matrix(matrix));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<e6.k$f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<e6.k$g>, java.util.ArrayList] */
    public final void e(float f10, float f11) {
        e eVar = new e();
        eVar.f4734b = f10;
        eVar.f4735c = f11;
        this.g.add(eVar);
        c cVar = new c(eVar, this.f4717c, this.f4718d);
        b(cVar.b() + 270.0f);
        this.f4721h.add(cVar);
        this.f4719e = cVar.b() + 270.0f;
        this.f4717c = f10;
        this.f4718d = f11;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<e6.k$f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List<e6.k$g>, java.util.ArrayList] */
    public final void f(float f10, float f11, float f12) {
        this.f4715a = 0.0f;
        this.f4716b = f10;
        this.f4717c = 0.0f;
        this.f4718d = f10;
        this.f4719e = f11;
        this.f4720f = (f11 + f12) % 360.0f;
        this.g.clear();
        this.f4721h.clear();
    }
}
