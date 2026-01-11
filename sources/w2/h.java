package w2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b3.c;
import o2.l;
import o2.p;
import p2.a;

public final class h extends b {
    public final a A;
    public final float[] B;
    public final Path C;
    public final e D;
    public r2.a<ColorFilter, ColorFilter> E;
    public final RectF z = new RectF();

    public h(l lVar, e eVar) {
        super(lVar, eVar);
        a aVar = new a();
        this.A = aVar;
        this.B = new float[8];
        this.C = new Path();
        this.D = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f12593l);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        RectF rectF2 = this.z;
        e eVar = this.D;
        rectF2.set(0.0f, 0.0f, (float) eVar.f12591j, (float) eVar.f12592k);
        this.f12568m.mapRect(this.z);
        rectF.set(this.z);
    }

    public final <T> void f(T t10, c cVar) {
        super.f(t10, cVar);
        if (t10 != p.C) {
            return;
        }
        if (cVar == null) {
            this.E = null;
        } else {
            this.E = new r2.p(cVar, null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [r2.p, r2.a<android.graphics.ColorFilter, android.graphics.ColorFilter>] */
    public final void j(Canvas canvas, Matrix matrix, int i) {
        int i10;
        int alpha = Color.alpha(this.D.f12593l);
        if (alpha != 0) {
            r2.a<Integer, Integer> aVar = this.f12577v.f10557j;
            if (aVar == null) {
                i10 = 100;
            } else {
                i10 = aVar.f().intValue();
            }
            int i11 = (int) ((((((float) alpha) / 255.0f) * ((float) i10)) / 100.0f) * (((float) i) / 255.0f) * 255.0f);
            this.A.setAlpha(i11);
            ? r02 = this.E;
            if (r02 != 0) {
                this.A.setColorFilter((ColorFilter) r02.f());
            }
            if (i11 > 0) {
                float[] fArr = this.B;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                e eVar = this.D;
                float f10 = (float) eVar.f12591j;
                fArr[2] = f10;
                fArr[3] = 0.0f;
                fArr[4] = f10;
                float f11 = (float) eVar.f12592k;
                fArr[5] = f11;
                fArr[6] = 0.0f;
                fArr[7] = f11;
                matrix.mapPoints(fArr);
                this.C.reset();
                Path path = this.C;
                float[] fArr2 = this.B;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.C;
                float[] fArr3 = this.B;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.C;
                float[] fArr4 = this.B;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.C;
                float[] fArr5 = this.B;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.C;
                float[] fArr6 = this.B;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.C.close();
                canvas.drawPath(this.C, this.A);
            }
        }
    }
}
