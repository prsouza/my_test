package t0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class c {

    /* renamed from: w  reason: collision with root package name */
    public static final a f11216w = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f11217a;

    /* renamed from: b  reason: collision with root package name */
    public int f11218b;

    /* renamed from: c  reason: collision with root package name */
    public int f11219c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f11220d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f11221e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f11222f;
    public float[] g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f11223h;
    public int[] i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f11224j;

    /* renamed from: k  reason: collision with root package name */
    public int f11225k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f11226l;

    /* renamed from: m  reason: collision with root package name */
    public float f11227m;

    /* renamed from: n  reason: collision with root package name */
    public float f11228n;

    /* renamed from: o  reason: collision with root package name */
    public int f11229o;

    /* renamed from: p  reason: collision with root package name */
    public final int f11230p;

    /* renamed from: q  reason: collision with root package name */
    public OverScroller f11231q;

    /* renamed from: r  reason: collision with root package name */
    public final C0221c f11232r;

    /* renamed from: s  reason: collision with root package name */
    public View f11233s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11234t;

    /* renamed from: u  reason: collision with root package name */
    public final ViewGroup f11235u;

    /* renamed from: v  reason: collision with root package name */
    public final b f11236v = new b();

    public class a implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c.this.s(0);
        }
    }

    /* renamed from: t0.c$c  reason: collision with other inner class name */
    public static abstract class C0221c {
        public abstract int a(View view, int i);

        public abstract int b(View view, int i);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(View view, int i) {
        }

        public abstract void f(int i);

        public abstract void g(View view, int i, int i10);

        public abstract void h(View view, float f10, float f11);

        public abstract boolean i(View view, int i);
    }

    public c(Context context, ViewGroup viewGroup, C0221c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f11235u = viewGroup;
            this.f11232r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f11230p = i10;
            this.f11229o = i10;
            this.f11218b = viewConfiguration.getScaledTouchSlop();
            this.f11227m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f11228n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f11231q = new OverScroller(context, f11216w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void a() {
        this.f11219c = -1;
        float[] fArr = this.f11220d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f11221e, 0.0f);
            Arrays.fill(this.f11222f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.f11223h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f11224j, 0);
            this.f11225k = 0;
        }
        VelocityTracker velocityTracker = this.f11226l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11226l = null;
        }
    }

    public final void b(View view, int i10) {
        if (view.getParent() == this.f11235u) {
            this.f11233s = view;
            this.f11219c = i10;
            this.f11232r.e(view, i10);
            s(1);
            return;
        }
        StringBuilder d10 = a.a.d("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        d10.append(this.f11235u);
        d10.append(")");
        throw new IllegalArgumentException(d10.toString());
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f11223h[i10] & i11) != i11 || (0 & i11) == 0 || (this.f11224j[i10] & i11) == i11 || (this.i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f11218b;
        if (abs <= ((float) i12) && abs2 <= ((float) i12)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.f11232r);
        }
        if ((this.i[i10] & i11) != 0 || abs <= ((float) this.f11218b)) {
            return false;
        }
        return true;
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z = this.f11232r.c(view) > 0;
        boolean z10 = this.f11232r.d() > 0;
        if (z && z10) {
            float f12 = f11 * f11;
            int i10 = this.f11218b;
            if (f12 + (f10 * f10) > ((float) (i10 * i10))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f10) > ((float) this.f11218b)) {
                return true;
            }
            return false;
        } else if (!z10 || Math.abs(f11) <= ((float) this.f11218b)) {
            return false;
        } else {
            return true;
        }
    }

    public final float e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final void f(int i10) {
        if (this.f11220d != null && l(i10)) {
            this.f11220d[i10] = 0.0f;
            this.f11221e[i10] = 0.0f;
            this.f11222f[i10] = 0.0f;
            this.g[i10] = 0.0f;
            this.f11223h[i10] = 0;
            this.i[i10] = 0;
            this.f11224j[i10] = 0;
            this.f11225k = (~(1 << i10)) & this.f11225k;
        }
    }

    public final int g(int i10, int i11, int i12) {
        int i13;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f11235u.getWidth();
        float f10 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i10)) / ((float) width)) - 0.5f) * 0.47123894f))) * f10) + f10;
        int abs = Math.abs(i11);
        if (abs > 0) {
            i13 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i13 = (int) (((((float) Math.abs(i10)) / ((float) i12)) + 1.0f) * 256.0f);
        }
        return Math.min(i13, 600);
    }

    public final boolean h() {
        if (this.f11217a == 2) {
            boolean computeScrollOffset = this.f11231q.computeScrollOffset();
            int currX = this.f11231q.getCurrX();
            int currY = this.f11231q.getCurrY();
            int left = currX - this.f11233s.getLeft();
            int top = currY - this.f11233s.getTop();
            if (left != 0) {
                View view = this.f11233s;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f11233s;
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f11232r.g(this.f11233s, currX, currY);
            }
            if (computeScrollOffset && currX == this.f11231q.getFinalX() && currY == this.f11231q.getFinalY()) {
                this.f11231q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f11235u.post(this.f11236v);
            }
        }
        if (this.f11217a == 2) {
            return true;
        }
        return false;
    }

    public final void i(float f10, float f11) {
        this.f11234t = true;
        this.f11232r.h(this.f11233s, f10, f11);
        this.f11234t = false;
        if (this.f11217a == 1) {
            s(0);
        }
    }

    public final View j(int i10, int i11) {
        for (int childCount = this.f11235u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f11235u;
            Objects.requireNonNull(this.f11232r);
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean k(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f11233s.getLeft();
        int top = this.f11233s.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f11231q.abortAnimation();
            s(0);
            return false;
        }
        View view = this.f11233s;
        int i16 = (int) this.f11228n;
        int i17 = (int) this.f11227m;
        int abs = Math.abs(i12);
        if (abs < i16) {
            i12 = 0;
        } else if (abs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int i18 = (int) this.f11228n;
        int i19 = (int) this.f11227m;
        int abs2 = Math.abs(i13);
        if (abs2 < i18) {
            i13 = 0;
        } else if (abs2 > i19) {
            i13 = i13 > 0 ? i19 : -i19;
        }
        int abs3 = Math.abs(i14);
        int abs4 = Math.abs(i15);
        int abs5 = Math.abs(i12);
        int abs6 = Math.abs(i13);
        int i20 = abs5 + abs6;
        int i21 = abs3 + abs4;
        if (i12 != 0) {
            f10 = (float) abs5;
            f11 = (float) i20;
        } else {
            f10 = (float) abs3;
            f11 = (float) i21;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f13 = (float) abs6;
            f12 = (float) i20;
        } else {
            f13 = (float) abs4;
            f12 = (float) i21;
        }
        this.f11231q.startScroll(left, top, i14, i15, (int) ((((float) g(i15, i13, this.f11232r.d())) * (f13 / f12)) + (((float) g(i14, i12, this.f11232r.c(view))) * f14)));
        s(2);
        return true;
    }

    public final boolean l(int i10) {
        return ((1 << i10) & this.f11225k) != 0;
    }

    public final boolean m(int i10) {
        if (l(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void n(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f11226l == null) {
            this.f11226l = VelocityTracker.obtain();
        }
        this.f11226l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View j10 = j((int) x10, (int) y10);
            q(x10, y10, pointerId);
            w(j10, pointerId);
            if ((this.f11223h[pointerId] & 0) != 0) {
                Objects.requireNonNull(this.f11232r);
            }
        } else if (actionMasked == 1) {
            if (this.f11217a == 1) {
                o();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f11217a == 1) {
                    i(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                q(x11, y11, pointerId2);
                if (this.f11217a == 0) {
                    w(j((int) x11, (int) y11), pointerId2);
                    if ((this.f11223h[pointerId2] & 0) != 0) {
                        Objects.requireNonNull(this.f11232r);
                        return;
                    }
                    return;
                }
                int i12 = (int) x11;
                int i13 = (int) y11;
                View view = this.f11233s;
                if (view != null && i12 >= view.getLeft() && i12 < view.getRight() && i13 >= view.getTop() && i13 < view.getBottom()) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    w(this.f11233s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f11217a == 1 && pointerId3 == this.f11219c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i11 >= pointerCount) {
                            i10 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i11);
                        if (pointerId4 != this.f11219c) {
                            View j11 = j((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                            View view2 = this.f11233s;
                            if (j11 == view2 && w(view2, pointerId4)) {
                                i10 = this.f11219c;
                                break;
                            }
                        }
                        i11++;
                    }
                    if (i10 == -1) {
                        o();
                    }
                }
                f(pointerId3);
            }
        } else if (this.f11217a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i11 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i11);
                if (m(pointerId5)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f11220d[pointerId5];
                    float f11 = y12 - this.f11221e[pointerId5];
                    p(f10, f11, pointerId5);
                    if (this.f11217a != 1) {
                        View j12 = j((int) x12, (int) y12);
                        if (d(j12, f10, f11) && w(j12, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            r(motionEvent);
        } else if (m(this.f11219c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f11219c);
            float x13 = motionEvent.getX(findPointerIndex);
            float y13 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f11222f;
            int i14 = this.f11219c;
            int i15 = (int) (x13 - fArr[i14]);
            int i16 = (int) (y13 - this.g[i14]);
            int left = this.f11233s.getLeft() + i15;
            int top = this.f11233s.getTop() + i16;
            int left2 = this.f11233s.getLeft();
            int top2 = this.f11233s.getTop();
            if (i15 != 0) {
                left = this.f11232r.a(this.f11233s, left);
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                this.f11233s.offsetLeftAndRight(left - left2);
            }
            if (i16 != 0) {
                top = this.f11232r.b(this.f11233s, top);
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                this.f11233s.offsetTopAndBottom(top - top2);
            }
            if (!(i15 == 0 && i16 == 0)) {
                this.f11232r.g(this.f11233s, left, top);
            }
            r(motionEvent);
        }
    }

    public final void o() {
        this.f11226l.computeCurrentVelocity(1000, this.f11227m);
        i(e(this.f11226l.getXVelocity(this.f11219c), this.f11228n, this.f11227m), e(this.f11226l.getYVelocity(this.f11219c), this.f11228n, this.f11227m));
    }

    public final void p(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c10 |= true;
        }
        if (c(f10, f11, i10, 2)) {
            c10 |= true;
        }
        if (c(f11, f10, i10, 8)) {
            c10 |= true;
        }
        if (c10) {
            int[] iArr = this.i;
            iArr[i10] = iArr[i10] | c10;
            Objects.requireNonNull(this.f11232r);
        }
    }

    public final void q(float f10, float f11, int i10) {
        float[] fArr = this.f11220d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f11221e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f11222f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f11223h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f11224j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f11220d = fArr2;
            this.f11221e = fArr3;
            this.f11222f = fArr4;
            this.g = fArr5;
            this.f11223h = iArr;
            this.i = iArr2;
            this.f11224j = iArr3;
        }
        float[] fArr9 = this.f11220d;
        this.f11222f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f11221e;
        this.g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f11223h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        if (i13 < this.f11235u.getLeft() + this.f11229o) {
            i11 = 1;
        }
        if (i14 < this.f11235u.getTop() + this.f11229o) {
            i11 |= 4;
        }
        if (i13 > this.f11235u.getRight() - this.f11229o) {
            i11 |= 2;
        }
        if (i14 > this.f11235u.getBottom() - this.f11229o) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f11225k |= 1 << i10;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (m(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f11222f[pointerId] = x10;
                this.g[pointerId] = y10;
            }
        }
    }

    public final void s(int i10) {
        this.f11235u.removeCallbacks(this.f11236v);
        if (this.f11217a != i10) {
            this.f11217a = i10;
            this.f11232r.f(i10);
            if (this.f11217a == 0) {
                this.f11233s = null;
            }
        }
    }

    public final boolean t(int i10, int i11) {
        if (this.f11234t) {
            return k(i10, i11, (int) this.f11226l.getXVelocity(this.f11219c), (int) this.f11226l.getYVelocity(this.f11219c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        if (r12 != r11) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f11226l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f11226l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f11226l
            r4.addMovement(r1)
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0102
            if (r2 == r5) goto L_0x00fd
            if (r2 == r4) goto L_0x006f
            r7 = 3
            if (r2 == r7) goto L_0x00fd
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r4 = 6
            if (r2 == r4) goto L_0x0034
            goto L_0x0100
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.f(r1)
            goto L_0x0100
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.q(r7, r1, r2)
            int r3 = r0.f11217a
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.f11223h
            r1 = r1[r2]
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0100
            t0.c$c r1 = r0.f11232r
            java.util.Objects.requireNonNull(r1)
            goto L_0x0100
        L_0x005e:
            if (r3 != r4) goto L_0x0100
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.j(r3, r1)
            android.view.View r3 = r0.f11233s
            if (r1 != r3) goto L_0x0100
            r0.w(r1, r2)
            goto L_0x0100
        L_0x006f:
            float[] r2 = r0.f11220d
            if (r2 == 0) goto L_0x0100
            float[] r2 = r0.f11221e
            if (r2 != 0) goto L_0x0079
            goto L_0x0100
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = r6
        L_0x007e:
            if (r3 >= r2) goto L_0x00f9
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f5
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f11220d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f11221e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.j(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r5
            goto L_0x00b1
        L_0x00b0:
            r8 = r6
        L_0x00b1:
            if (r8 == 0) goto L_0x00e4
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            t0.c$c r13 = r0.f11232r
            int r12 = r13.a(r7, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r14 = r14 + r13
            t0.c$c r15 = r0.f11232r
            int r14 = r15.b(r7, r14)
            t0.c$c r15 = r0.f11232r
            int r15 = r15.c(r7)
            t0.c$c r6 = r0.f11232r
            int r6 = r6.d()
            if (r15 == 0) goto L_0x00dd
            if (r15 <= 0) goto L_0x00e4
            if (r12 != r11) goto L_0x00e4
        L_0x00dd:
            if (r6 == 0) goto L_0x00f9
            if (r6 <= 0) goto L_0x00e4
            if (r14 != r13) goto L_0x00e4
            goto L_0x00f9
        L_0x00e4:
            r0.p(r9, r10, r4)
            int r6 = r0.f11217a
            if (r6 != r5) goto L_0x00ec
            goto L_0x00f9
        L_0x00ec:
            if (r8 == 0) goto L_0x00f5
            boolean r4 = r0.w(r7, r4)
            if (r4 == 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r3 = r3 + 1
            r6 = 0
            goto L_0x007e
        L_0x00f9:
            r16.r(r17)
            goto L_0x0100
        L_0x00fd:
            r16.a()
        L_0x0100:
            r2 = 0
            goto L_0x0130
        L_0x0102:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.q(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.j(r2, r3)
            android.view.View r3 = r0.f11233s
            if (r2 != r3) goto L_0x0123
            int r3 = r0.f11217a
            if (r3 != r4) goto L_0x0123
            r0.w(r2, r1)
        L_0x0123:
            int[] r2 = r0.f11223h
            r1 = r2[r1]
            r2 = 0
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0130
            t0.c$c r1 = r0.f11232r
            java.util.Objects.requireNonNull(r1)
        L_0x0130:
            int r1 = r0.f11217a
            if (r1 != r5) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r5 = r2
        L_0x0136:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.u(android.view.MotionEvent):boolean");
    }

    public final boolean v(View view, int i10, int i11) {
        this.f11233s = view;
        this.f11219c = -1;
        boolean k10 = k(i10, i11, 0, 0);
        if (!k10 && this.f11217a == 0 && this.f11233s != null) {
            this.f11233s = null;
        }
        return k10;
    }

    public final boolean w(View view, int i10) {
        if (view == this.f11233s && this.f11219c == i10) {
            return true;
        }
        if (view == null || !this.f11232r.i(view, i10)) {
            return false;
        }
        this.f11219c = i10;
        b(view, i10);
        return true;
    }
}
