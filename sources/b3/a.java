package b3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import o2.f;
import org.slf4j.helpers.MessageFormatter;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f f2844a;

    /* renamed from: b  reason: collision with root package name */
    public final T f2845b;

    /* renamed from: c  reason: collision with root package name */
    public T f2846c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f2847d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2848e;

    /* renamed from: f  reason: collision with root package name */
    public Float f2849f;
    public float g;

    /* renamed from: h  reason: collision with root package name */
    public float f2850h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f2851j;

    /* renamed from: k  reason: collision with root package name */
    public float f2852k;

    /* renamed from: l  reason: collision with root package name */
    public float f2853l;

    /* renamed from: m  reason: collision with root package name */
    public PointF f2854m;

    /* renamed from: n  reason: collision with root package name */
    public PointF f2855n;

    public a(f fVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.g = -3987645.8f;
        this.f2850h = -3987645.8f;
        this.i = 784923401;
        this.f2851j = 784923401;
        this.f2852k = Float.MIN_VALUE;
        this.f2853l = Float.MIN_VALUE;
        this.f2854m = null;
        this.f2855n = null;
        this.f2844a = fVar;
        this.f2845b = t10;
        this.f2846c = t11;
        this.f2847d = interpolator;
        this.f2848e = f10;
        this.f2849f = f11;
    }

    public final float a() {
        if (this.f2844a == null) {
            return 1.0f;
        }
        if (this.f2853l == Float.MIN_VALUE) {
            if (this.f2849f == null) {
                this.f2853l = 1.0f;
            } else {
                float b10 = b();
                float floatValue = this.f2849f.floatValue() - this.f2848e;
                f fVar = this.f2844a;
                this.f2853l = (floatValue / (fVar.f9206l - fVar.f9205k)) + b10;
            }
        }
        return this.f2853l;
    }

    public final float b() {
        f fVar = this.f2844a;
        if (fVar == null) {
            return 0.0f;
        }
        if (this.f2852k == Float.MIN_VALUE) {
            float f10 = this.f2848e;
            float f11 = fVar.f9205k;
            this.f2852k = (f10 - f11) / (fVar.f9206l - f11);
        }
        return this.f2852k;
    }

    public final boolean c() {
        return this.f2847d == null;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Keyframe{startValue=");
        d10.append(this.f2845b);
        d10.append(", endValue=");
        d10.append(this.f2846c);
        d10.append(", startFrame=");
        d10.append(this.f2848e);
        d10.append(", endFrame=");
        d10.append(this.f2849f);
        d10.append(", interpolator=");
        d10.append(this.f2847d);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }

    public a(T t10) {
        this.g = -3987645.8f;
        this.f2850h = -3987645.8f;
        this.i = 784923401;
        this.f2851j = 784923401;
        this.f2852k = Float.MIN_VALUE;
        this.f2853l = Float.MIN_VALUE;
        this.f2854m = null;
        this.f2855n = null;
        this.f2844a = null;
        this.f2845b = t10;
        this.f2846c = t10;
        this.f2847d = null;
        this.f2848e = Float.MIN_VALUE;
        this.f2849f = Float.valueOf(Float.MAX_VALUE);
    }
}
