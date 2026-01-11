package q0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public abstract class a implements View.OnTouchListener {
    public static final int F = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    public final C0194a f10075a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f10076b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public final View f10077c;

    /* renamed from: s  reason: collision with root package name */
    public b f10078s;

    /* renamed from: t  reason: collision with root package name */
    public float[] f10079t = {0.0f, 0.0f};

    /* renamed from: u  reason: collision with root package name */
    public float[] f10080u = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: v  reason: collision with root package name */
    public int f10081v;

    /* renamed from: w  reason: collision with root package name */
    public int f10082w;

    /* renamed from: x  reason: collision with root package name */
    public float[] f10083x = {0.0f, 0.0f};

    /* renamed from: y  reason: collision with root package name */
    public float[] f10084y = {0.0f, 0.0f};
    public float[] z = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q0.a$a  reason: collision with other inner class name */
    public static class C0194a {

        /* renamed from: a  reason: collision with root package name */
        public int f10085a;

        /* renamed from: b  reason: collision with root package name */
        public int f10086b;

        /* renamed from: c  reason: collision with root package name */
        public float f10087c;

        /* renamed from: d  reason: collision with root package name */
        public float f10088d;

        /* renamed from: e  reason: collision with root package name */
        public long f10089e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f10090f = 0;
        public long g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f10091h;
        public int i;

        public final float a(long j10) {
            long j11 = this.f10089e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.g;
            if (j12 < 0 || j10 < j12) {
                return a.b(((float) (j10 - j11)) / ((float) this.f10085a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f10091h;
            return (a.b(((float) (j10 - j12)) / ((float) this.i), 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            a aVar = a.this;
            if (aVar.D) {
                if (aVar.B) {
                    aVar.B = false;
                    C0194a aVar2 = aVar.f10075a;
                    Objects.requireNonNull(aVar2);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f10089e = currentAnimationTimeMillis;
                    aVar2.g = -1;
                    aVar2.f10090f = currentAnimationTimeMillis;
                    aVar2.f10091h = 0.5f;
                }
                C0194a aVar3 = a.this.f10075a;
                if ((aVar3.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.g + ((long) aVar3.i)) || !a.this.e()) {
                    a.this.D = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.C) {
                    aVar4.C = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.f10077c.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f10090f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f10090f = currentAnimationTimeMillis2;
                    ((d) a.this).G.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar3.f10090f)) * ((a10 * 4.0f) + (-4.0f * a10 * a10)) * aVar3.f10088d));
                    View view = a.this.f10077c;
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    x.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0194a aVar = new C0194a();
        this.f10075a = aVar;
        this.f10077c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.z;
        float f11 = ((float) ((int) ((1575.0f * f10) + 0.5f))) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f10084y;
        float f12 = ((float) ((int) ((f10 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f10081v = 1;
        float[] fArr3 = this.f10080u;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f10079t;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f10083x;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f10082w = F;
        aVar.f10085a = 500;
        aVar.f10086b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f10079t
            r0 = r0[r4]
            float[] r1 = r3.f10080u
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            android.view.animation.AccelerateInterpolator r6 = r3.f10076b
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002f
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            android.view.animation.AccelerateInterpolator r6 = r3.f10076b
            float r5 = r6.getInterpolation(r5)
        L_0x002f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003e
            return r2
        L_0x003e:
            float[] r0 = r3.f10083x
            r0 = r0[r4]
            float[] r1 = r3.f10084y
            r1 = r1[r4]
            float[] r2 = r3.z
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0053
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L_0x0053:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i = this.f10081v;
        if (i == 0 || i == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                return (!this.D || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    public final void d() {
        int i = 0;
        if (this.B) {
            this.D = false;
            return;
        }
        C0194a aVar = this.f10075a;
        Objects.requireNonNull(aVar);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (currentAnimationTimeMillis - aVar.f10089e);
        int i11 = aVar.f10086b;
        if (i10 > i11) {
            i = i11;
        } else if (i10 >= 0) {
            i = i10;
        }
        aVar.i = i;
        aVar.f10091h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r9 = this;
            q0.a$a r0 = r9.f10075a
            float r1 = r0.f10088d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f10087c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            q0.d r4 = (q0.d) r4
            android.widget.ListView r4 = r4.G
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = r3
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.E
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007f
        L_0x0016:
            r5.d()
            goto L_0x007f
        L_0x001a:
            r5.C = r2
            r5.A = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f10077c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f10077c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            q0.a$a r7 = r5.f10075a
            r7.f10087c = r0
            r7.f10088d = r6
            boolean r6 = r5.D
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x007f
            q0.a$b r6 = r5.f10078s
            if (r6 != 0) goto L_0x0061
            q0.a$b r6 = new q0.a$b
            r6.<init>()
            r5.f10078s = r6
        L_0x0061:
            r5.D = r2
            r5.B = r2
            boolean r6 = r5.A
            if (r6 != 0) goto L_0x0078
            int r6 = r5.f10082w
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.f10077c
            q0.a$b r0 = r5.f10078s
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, n0.a0> r6 = n0.x.f8842a
            n0.x.d.n(r7, r0, r3)
            goto L_0x007d
        L_0x0078:
            q0.a$b r6 = r5.f10078s
            r6.run()
        L_0x007d:
            r5.A = r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
