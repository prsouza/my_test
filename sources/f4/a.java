package f4;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final C0078a f4977a = new C0078a();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f4978b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4979c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f4980d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f4981e;

    /* renamed from: f  reason: collision with root package name */
    public com.facebook.shimmer.a f4982f;

    /* renamed from: f4.a$a  reason: collision with other inner class name */
    public class C0078a implements ValueAnimator.AnimatorUpdateListener {
        public C0078a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.invalidateSelf();
        }
    }

    public a() {
        Paint paint = new Paint();
        this.f4978b = paint;
        this.f4979c = new Rect();
        this.f4980d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        com.facebook.shimmer.a aVar;
        ValueAnimator valueAnimator = this.f4981e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (aVar = this.f4982f) != null && aVar.f3597o && getCallback() != null) {
            this.f4981e.start();
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r13v1, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r5v5, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r20 = this;
            r0 = r20
            android.graphics.Rect r1 = r20.getBounds()
            int r2 = r1.width()
            int r1 = r1.height()
            if (r2 == 0) goto L_0x008d
            if (r1 == 0) goto L_0x008d
            com.facebook.shimmer.a r3 = r0.f4982f
            if (r3 != 0) goto L_0x0018
            goto L_0x008d
        L_0x0018:
            int r4 = r3.g
            if (r4 <= 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            float r3 = r3.i
            float r2 = (float) r2
            float r3 = r3 * r2
            int r4 = java.lang.Math.round(r3)
        L_0x0025:
            com.facebook.shimmer.a r2 = r0.f4982f
            int r3 = r2.f3591h
            if (r3 <= 0) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            float r2 = r2.f3592j
            float r1 = (float) r1
            float r2 = r2 * r1
            int r3 = java.lang.Math.round(r2)
        L_0x0034:
            com.facebook.shimmer.a r1 = r0.f4982f
            int r2 = r1.f3590f
            r5 = 1
            if (r2 == r5) goto L_0x005f
            int r1 = r1.f3587c
            r2 = 0
            if (r1 == r5) goto L_0x0045
            r6 = 3
            if (r1 != r6) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r5 = r2
        L_0x0045:
            if (r5 == 0) goto L_0x0048
            r4 = r2
        L_0x0048:
            if (r5 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r3 = r2
        L_0x004c:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r6 = 0
            r7 = 0
            float r8 = (float) r4
            float r9 = (float) r3
            com.facebook.shimmer.a r2 = r0.f4982f
            int[] r10 = r2.f3586b
            float[] r11 = r2.f3585a
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0088
        L_0x005f:
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient
            float r2 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r14 = r2 / r5
            float r2 = (float) r3
            float r15 = r2 / r5
            int r2 = java.lang.Math.max(r4, r3)
            double r2 = (double) r2
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.sqrt(r4)
            double r2 = r2 / r4
            float r2 = (float) r2
            com.facebook.shimmer.a r3 = r0.f4982f
            int[] r4 = r3.f3586b
            float[] r3 = r3.f3585a
            android.graphics.Shader$TileMode r19 = android.graphics.Shader.TileMode.CLAMP
            r13 = r1
            r16 = r2
            r17 = r4
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
        L_0x0088:
            android.graphics.Paint r2 = r0.f4978b
            r2.setShader(r1)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.a.b():void");
    }

    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f4982f != null && this.f4978b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians((double) this.f4982f.f3595m));
            float width = (((float) this.f4979c.width()) * tan) + ((float) this.f4979c.height());
            float height = (tan * ((float) this.f4979c.height())) + ((float) this.f4979c.width());
            ValueAnimator valueAnimator = this.f4981e;
            float f12 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f4982f.f3587c;
            if (i != 1) {
                if (i == 2) {
                    f11 = a.a.a(-height, height, animatedFraction, height);
                } else if (i != 3) {
                    float f13 = -height;
                    f11 = a.a.a(height, f13, animatedFraction, f13);
                } else {
                    f10 = a.a.a(-width, width, animatedFraction, width);
                }
                f12 = f11;
                f10 = 0.0f;
            } else {
                float f14 = -width;
                f10 = a.a.a(width, f14, animatedFraction, f14);
            }
            this.f4980d.reset();
            this.f4980d.setRotate(this.f4982f.f3595m, ((float) this.f4979c.width()) / 2.0f, ((float) this.f4979c.height()) / 2.0f);
            this.f4980d.postTranslate(f12, f10);
            this.f4978b.getShader().setLocalMatrix(this.f4980d);
            canvas.drawRect(this.f4979c, this.f4978b);
        }
    }

    public final int getOpacity() {
        com.facebook.shimmer.a aVar = this.f4982f;
        return (aVar == null || (!aVar.f3596n && !aVar.f3598p)) ? -1 : -3;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4979c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
