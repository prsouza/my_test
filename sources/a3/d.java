package a3;

import ad.c;
import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import o2.f;

public final class d extends a implements Choreographer.FrameCallback {

    /* renamed from: c  reason: collision with root package name */
    public float f40c = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    public boolean f41s = false;

    /* renamed from: t  reason: collision with root package name */
    public long f42t = 0;

    /* renamed from: u  reason: collision with root package name */
    public float f43u = 0.0f;

    /* renamed from: v  reason: collision with root package name */
    public int f44v = 0;

    /* renamed from: w  reason: collision with root package name */
    public float f45w = -2.14748365E9f;

    /* renamed from: x  reason: collision with root package name */
    public float f46x = 2.14748365E9f;

    /* renamed from: y  reason: collision with root package name */
    public f f47y;
    public boolean z = false;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void cancel() {
        Iterator it = this.f37b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        l();
    }

    public final void d() {
        l();
        a(j());
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void doFrame(long j10) {
        k();
        f fVar = this.f47y;
        if (fVar != null && this.z) {
            long j11 = this.f42t;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float abs = ((float) j12) / ((1.0E9f / fVar.f9207m) / Math.abs(this.f40c));
            float f10 = this.f43u;
            if (j()) {
                abs = -abs;
            }
            float f11 = f10 + abs;
            this.f43u = f11;
            float i = i();
            float h10 = h();
            PointF pointF = f.f49a;
            boolean z10 = !(f11 >= i && f11 <= h10);
            this.f43u = f.b(this.f43u, i(), h());
            this.f42t = j10;
            c();
            if (z10) {
                if (getRepeatCount() == -1 || this.f44v < getRepeatCount()) {
                    Iterator it = this.f37b.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f44v++;
                    if (getRepeatMode() == 2) {
                        this.f41s = !this.f41s;
                        this.f40c = -this.f40c;
                    } else {
                        this.f43u = j() ? h() : i();
                    }
                    this.f42t = j10;
                } else {
                    this.f43u = this.f40c < 0.0f ? i() : h();
                    l();
                    a(j());
                }
            }
            if (this.f47y != null) {
                float f12 = this.f43u;
                if (f12 < this.f45w || f12 > this.f46x) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f45w), Float.valueOf(this.f46x), Float.valueOf(this.f43u)}));
                }
            }
            c.E();
        }
    }

    public final float g() {
        f fVar = this.f47y;
        if (fVar == null) {
            return 0.0f;
        }
        float f10 = this.f43u;
        float f11 = fVar.f9205k;
        return (f10 - f11) / (fVar.f9206l - f11);
    }

    public final float getAnimatedFraction() {
        float i;
        float h10;
        float i10;
        if (this.f47y == null) {
            return 0.0f;
        }
        if (j()) {
            i = h() - this.f43u;
            h10 = h();
            i10 = i();
        } else {
            i = this.f43u - i();
            h10 = h();
            i10 = i();
        }
        return i / (h10 - i10);
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(g());
    }

    public final long getDuration() {
        f fVar = this.f47y;
        if (fVar == null) {
            return 0;
        }
        return (long) fVar.b();
    }

    public final float h() {
        f fVar = this.f47y;
        if (fVar == null) {
            return 0.0f;
        }
        float f10 = this.f46x;
        return f10 == 2.14748365E9f ? fVar.f9206l : f10;
    }

    public final float i() {
        f fVar = this.f47y;
        if (fVar == null) {
            return 0.0f;
        }
        float f10 = this.f45w;
        return f10 == -2.14748365E9f ? fVar.f9205k : f10;
    }

    public final boolean isRunning() {
        return this.z;
    }

    public final boolean j() {
        return this.f40c < 0.0f;
    }

    public final void k() {
        if (this.z) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void l() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.z = false;
    }

    public final void m(float f10) {
        if (this.f43u != f10) {
            this.f43u = f.b(f10, i(), h());
            this.f42t = 0;
            c();
        }
    }

    public final void n(float f10, float f11) {
        float f12;
        float f13;
        if (f10 <= f11) {
            f fVar = this.f47y;
            if (fVar == null) {
                f12 = -3.4028235E38f;
            } else {
                f12 = fVar.f9205k;
            }
            if (fVar == null) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = fVar.f9206l;
            }
            this.f45w = f.b(f10, f12, f13);
            this.f46x = f.b(f11, f12, f13);
            m((float) ((int) f.b(this.f43u, f10, f11)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f10), Float.valueOf(f11)}));
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f41s) {
            this.f41s = false;
            this.f40c = -this.f40c;
        }
    }
}
