package e6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import e6.f;
import java.util.BitSet;
import java.util.Objects;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final k[] f4704a = new k[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f4705b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f4706c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f4707d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f4708e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f4709f = new Path();
    public final k g = new k();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f4710h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f4711j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f4712k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f4713l = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f4714a = new j();
    }

    public interface b {
    }

    public j() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f4704a[i10] = new k();
            this.f4705b[i10] = new Matrix();
            this.f4706c[i10] = new Matrix();
        }
    }

    public final void a(i iVar, float f10, RectF rectF, b bVar, Path path) {
        int i10;
        float f11;
        e eVar;
        c cVar;
        aa.b bVar2;
        i iVar2 = iVar;
        float f12 = f10;
        RectF rectF2 = rectF;
        Path path2 = path;
        path.rewind();
        this.f4708e.rewind();
        this.f4709f.rewind();
        this.f4709f.addRect(rectF2, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            }
            if (i11 == 1) {
                cVar = iVar2.g;
            } else if (i11 == 2) {
                cVar = iVar2.f4690h;
            } else if (i11 != 3) {
                cVar = iVar2.f4689f;
            } else {
                cVar = iVar2.f4688e;
            }
            if (i11 == 1) {
                bVar2 = iVar2.f4686c;
            } else if (i11 == 2) {
                bVar2 = iVar2.f4687d;
            } else if (i11 != 3) {
                bVar2 = iVar2.f4685b;
            } else {
                bVar2 = iVar2.f4684a;
            }
            k kVar = this.f4704a[i11];
            Objects.requireNonNull(bVar2);
            bVar2.F(kVar, f12, cVar.a(rectF2));
            int i12 = i11 + 1;
            float f13 = (float) (i12 * 90);
            this.f4705b[i11].reset();
            PointF pointF = this.f4707d;
            if (i11 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            Matrix matrix = this.f4705b[i11];
            PointF pointF2 = this.f4707d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f4705b[i11].preRotate(f13);
            float[] fArr = this.f4710h;
            k[] kVarArr = this.f4704a;
            fArr[0] = kVarArr[i11].f4717c;
            fArr[1] = kVarArr[i11].f4718d;
            this.f4705b[i11].mapPoints(fArr);
            this.f4706c[i11].reset();
            Matrix matrix2 = this.f4706c[i11];
            float[] fArr2 = this.f4710h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.f4706c[i11].preRotate(f13);
            i11 = i12;
        }
        int i13 = 0;
        for (i10 = 4; i13 < i10; i10 = 4) {
            float[] fArr3 = this.f4710h;
            k[] kVarArr2 = this.f4704a;
            fArr3[0] = kVarArr2[i13].f4715a;
            fArr3[1] = kVarArr2[i13].f4716b;
            this.f4705b[i13].mapPoints(fArr3);
            if (i13 == 0) {
                float[] fArr4 = this.f4710h;
                path2.moveTo(fArr4[0], fArr4[1]);
            } else {
                float[] fArr5 = this.f4710h;
                path2.lineTo(fArr5[0], fArr5[1]);
            }
            this.f4704a[i13].c(this.f4705b[i13], path2);
            if (bVar != null) {
                k kVar2 = this.f4704a[i13];
                Matrix matrix3 = this.f4705b[i13];
                f.a aVar = (f.a) bVar;
                BitSet bitSet = f.this.f4656s;
                Objects.requireNonNull(kVar2);
                bitSet.set(i13, false);
                f.this.f4654b[i13] = kVar2.d(matrix3);
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            float[] fArr6 = this.f4710h;
            k[] kVarArr3 = this.f4704a;
            fArr6[0] = kVarArr3[i13].f4717c;
            fArr6[1] = kVarArr3[i13].f4718d;
            this.f4705b[i13].mapPoints(fArr6);
            float[] fArr7 = this.i;
            k[] kVarArr4 = this.f4704a;
            fArr7[0] = kVarArr4[i15].f4715a;
            fArr7[1] = kVarArr4[i15].f4716b;
            this.f4705b[i15].mapPoints(fArr7);
            float[] fArr8 = this.f4710h;
            float f14 = fArr8[0];
            float[] fArr9 = this.i;
            float max = Math.max(((float) Math.hypot((double) (f14 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f4710h;
            k[] kVarArr5 = this.f4704a;
            fArr10[0] = kVarArr5[i13].f4717c;
            fArr10[1] = kVarArr5[i13].f4718d;
            this.f4705b[i13].mapPoints(fArr10);
            if (i13 == 1 || i13 == 3) {
                f11 = Math.abs(rectF.centerX() - this.f4710h[0]);
            } else {
                f11 = Math.abs(rectF.centerY() - this.f4710h[1]);
            }
            this.g.f(0.0f, 270.0f, 0.0f);
            if (i13 == 1) {
                eVar = iVar2.f4692k;
            } else if (i13 == 2) {
                eVar = iVar2.f4693l;
            } else if (i13 != 3) {
                eVar = iVar2.f4691j;
            } else {
                eVar = iVar2.i;
            }
            eVar.O(max, f11, f12, this.g);
            this.f4711j.reset();
            this.g.c(this.f4706c[i13], this.f4711j);
            if (!this.f4713l || (!b(this.f4711j, i13) && !b(this.f4711j, i15))) {
                this.g.c(this.f4706c[i13], path2);
            } else {
                Path path3 = this.f4711j;
                path3.op(path3, this.f4709f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f4710h;
                k kVar3 = this.g;
                fArr11[0] = kVar3.f4715a;
                fArr11[1] = kVar3.f4716b;
                this.f4706c[i13].mapPoints(fArr11);
                Path path4 = this.f4708e;
                float[] fArr12 = this.f4710h;
                path4.moveTo(fArr12[0], fArr12[1]);
                this.g.c(this.f4706c[i13], this.f4708e);
            }
            if (bVar != null) {
                k kVar4 = this.g;
                Matrix matrix4 = this.f4706c[i13];
                f.a aVar2 = (f.a) bVar;
                Objects.requireNonNull(kVar4);
                f.this.f4656s.set(i13 + 4, false);
                f.this.f4655c[i13] = kVar4.d(matrix4);
            }
            i13 = i14;
        }
        path.close();
        this.f4708e.close();
        if (!this.f4708e.isEmpty()) {
            path2.op(this.f4708e, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        this.f4712k.reset();
        this.f4704a[i10].c(this.f4705b[i10], this.f4712k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f4712k.computeBounds(rectF, true);
        path.op(this.f4712k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }
}
