package wb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import e6.e;
import io.nodle.map_marker.MarkerView;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public float f12623a;

    /* renamed from: b  reason: collision with root package name */
    public float f12624b;

    /* renamed from: c  reason: collision with root package name */
    public float f12625c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f12626d;

    /* renamed from: e  reason: collision with root package name */
    public float f12627e;

    /* renamed from: f  reason: collision with root package name */
    public float f12628f;
    public float g;

    /* renamed from: h  reason: collision with root package name */
    public float f12629h;
    public double i;

    /* renamed from: j  reason: collision with root package name */
    public float f12630j = 200.0f;

    /* renamed from: k  reason: collision with root package name */
    public double f12631k = 1.0d;

    /* renamed from: l  reason: collision with root package name */
    public double f12632l = 1.0d;

    /* renamed from: m  reason: collision with root package name */
    public double f12633m = 1.0d;

    /* renamed from: n  reason: collision with root package name */
    public double f12634n;

    /* renamed from: o  reason: collision with root package name */
    public int f12635o = 255;

    /* renamed from: p  reason: collision with root package name */
    public int f12636p;

    /* renamed from: q  reason: collision with root package name */
    public final Bitmap[] f12637q;

    /* renamed from: r  reason: collision with root package name */
    public final Paint f12638r;

    /* renamed from: s  reason: collision with root package name */
    public final Paint f12639s;

    /* renamed from: t  reason: collision with root package name */
    public Long f12640t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12641u;

    public b(Context context, float f10, float f11, float f12, Bitmap bitmap) {
        this.f12623a = f10;
        this.f12624b = f11;
        this.f12625c = f12;
        this.f12626d = bitmap;
        float f13 = f12 / ((float) 2);
        this.f12627e = f10 - f13;
        this.f12628f = f11 - f13;
        this.g = f10 + f13;
        this.f12629h = f13 + f11;
        int i10 = (int) f12;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i10, false);
        e.C(createScaledBitmap, "createScaledBitmap(bitma…t(), size.toInt(), false)");
        Bitmap bitmap2 = this.f12626d;
        int i11 = (int) this.f12625c;
        Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, i11, i11, false);
        e.C(createScaledBitmap2, "createScaledBitmap(bitma…t(), size.toInt(), false)");
        float f14 = this.f12625c / 2.0f;
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, f14, f14);
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap2, 0, 0, createScaledBitmap2.getWidth(), createScaledBitmap2.getHeight(), matrix, true);
        e.C(createBitmap, "createBitmap(this, 0, 0,…th, height, matrix, true)");
        this.f12637q = new Bitmap[]{createScaledBitmap, createBitmap};
        this.f12638r = new Paint();
        Paint paint = new Paint();
        this.f12639s = paint;
        paint.setColor(Color.argb(0, 0, 60, 44));
    }

    public final void a(Canvas canvas) {
        if (this.f12641u) {
            MarkerView.a aVar = MarkerView.f6841t;
            MarkerView.f6843v.add(this);
            return;
        }
        if (this.f12640t == null) {
            float f10 = this.f12623a;
            float f11 = this.f12625c / ((float) 2);
            float pow = ((float) Math.pow(this.i, 4.0d)) * f11;
            this.f12627e = f10 - pow;
            float f12 = this.f12624b;
            this.f12628f = f12 - pow;
            this.g = pow + f10;
            this.f12629h = pow + f12;
            double d10 = this.i;
            if (d10 < 1.0d) {
                this.i = d10 + ((double) 0.05f);
            } else {
                this.f12627e = f10 - f11;
                this.f12628f = f12 - f11;
                this.g = f10 + f11;
                this.f12629h = f11 + f12;
                this.f12640t = Long.valueOf(System.currentTimeMillis());
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            Long l10 = this.f12640t;
            e.B(l10);
            if (currentTimeMillis - l10.longValue() > 500) {
                float f13 = this.f12630j;
                MarkerView.a aVar2 = MarkerView.f6841t;
                float f14 = MarkerView.f6842u;
                float f15 = (((float) 1000) * f14) + f13;
                this.f12630j = f15;
                this.f12624b = (f15 * ((float) -1) * f14) + this.f12624b;
                this.f12633m = this.f12632l;
                this.f12632l = this.f12631k;
                double cos = (Math.cos(this.f12634n) / ((double) 2)) + 0.5d;
                this.f12631k = cos;
                this.f12634n = (6.283185307179586d / ((double) 15)) + this.f12634n;
                double d11 = this.f12633m;
                double d12 = this.f12632l;
                if (d11 - d12 > Utils.DOUBLE_EPSILON && d12 - cos < Utils.DOUBLE_EPSILON) {
                    this.f12636p++;
                }
                double d13 = (double) this.f12623a;
                float f16 = this.f12625c / 2.0f;
                double d14 = ((double) f16) * cos;
                this.f12627e = (float) (d13 - d14);
                float f17 = this.f12624b;
                this.f12628f = f17 - f16;
                this.g = (float) (d14 + d13);
                this.f12629h = f16 + f17;
                this.f12639s.setAlpha(255 - ((int) (((double) 255) * cos)));
                int i10 = this.f12635o - 5;
                this.f12635o = i10;
                if (i10 <= 0) {
                    this.f12641u = true;
                } else {
                    this.f12638r.setAlpha(i10);
                }
            }
        }
        RectF rectF = new RectF(this.f12627e, this.f12628f, this.g, this.f12629h);
        if (canvas != null) {
            canvas.drawBitmap(this.f12637q[this.f12636p % 2], (Rect) null, rectF, this.f12638r);
        }
        if (canvas != null) {
            canvas.drawRoundRect(rectF, (this.g - this.f12627e) + ((float) 10), this.f12625c, this.f12639s);
        }
    }
}
