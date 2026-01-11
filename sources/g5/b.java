package g5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;
import y.c;

public abstract class b<V extends View> extends d<V> {

    /* renamed from: c  reason: collision with root package name */
    public a f5240c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f5241d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5242e;

    /* renamed from: f  reason: collision with root package name */
    public int f5243f = -1;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f5244h = -1;
    public VelocityTracker i;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final CoordinatorLayout f5245a;

        /* renamed from: b  reason: collision with root package name */
        public final V f5246b;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f5245a = coordinatorLayout;
            this.f5246b = v10;
        }

        public final void run() {
            OverScroller overScroller;
            if (this.f5246b != null && (overScroller = b.this.f5241d) != null) {
                if (overScroller.computeScrollOffset()) {
                    b bVar = b.this;
                    bVar.B(this.f5245a, this.f5246b, bVar.f5241d.getCurrY());
                    V v10 = this.f5246b;
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    x.d.m(v10, this);
                    return;
                }
                b.this.z(this.f5245a, this.f5246b);
            }
        }
    }

    public b() {
    }

    public final int A(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return C(coordinatorLayout, v10, y() - i10, i11, i12);
    }

    public final int B(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return C(coordinatorLayout, v10, i10, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public int C(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int s10;
        int s11 = s();
        if (i11 == 0 || s11 < i11 || s11 > i12 || s11 == (s10 = c.s(i10, i11, i12))) {
            return 0;
        }
        u(s10);
        return s11 - s10;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f5244h < 0) {
            this.f5244h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f5242e) {
            int i10 = this.f5243f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.g) > this.f5244h) {
                this.g = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f5243f = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z = v(v10) && coordinatorLayout.p(v10, x10, y11);
            this.f5242e = z;
            if (z) {
                this.g = y11;
                this.f5243f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f5241d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f5241d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r1 = 0
            r3 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x0059
            r4 = 2
            if (r0 == r4) goto L_0x0034
            r2 = 3
            if (r0 == r2) goto L_0x00c0
            r1 = 6
            if (r0 == r1) goto L_0x001a
            goto L_0x0056
        L_0x001a:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0022
            r0 = r8
            goto L_0x0023
        L_0x0022:
            r0 = r9
        L_0x0023:
            int r1 = r7.getPointerId(r0)
            r6.f5243f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.g = r0
            goto L_0x0056
        L_0x0034:
            int r0 = r6.f5243f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r3) goto L_0x003d
            return r9
        L_0x003d:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r1 = r6.g
            int r3 = r1 - r0
            r6.g = r0
            int r4 = r6.w(r2)
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r0.A(r1, r2, r3, r4, r5)
        L_0x0056:
            r0 = r9
            goto L_0x00ce
        L_0x0059:
            android.view.VelocityTracker r0 = r6.i
            if (r0 == 0) goto L_0x00c0
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.i
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r6.i
            int r4 = r6.f5243f
            float r0 = r0.getYVelocity(r4)
            int r4 = r6.x(r2)
            int r4 = -r4
            r18 = 0
            g5.b$a r5 = r6.f5240c
            if (r5 == 0) goto L_0x007f
            r2.removeCallbacks(r5)
            r6.f5240c = r1
        L_0x007f:
            android.widget.OverScroller r5 = r6.f5241d
            if (r5 != 0) goto L_0x008e
            android.widget.OverScroller r5 = new android.widget.OverScroller
            android.content.Context r10 = r21.getContext()
            r5.<init>(r10)
            r6.f5241d = r5
        L_0x008e:
            android.widget.OverScroller r10 = r6.f5241d
            r11 = 0
            int r12 = r19.s()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r17 = r4
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.f5241d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00b9
            g5.b$a r0 = new g5.b$a
            r4 = r20
            r0.<init>(r4, r2)
            r6.f5240c = r0
            java.util.WeakHashMap<android.view.View, n0.a0> r4 = n0.x.f8842a
            n0.x.d.m(r2, r0)
            goto L_0x00be
        L_0x00b9:
            r4 = r20
            r19.z(r20, r21)
        L_0x00be:
            r0 = r8
            goto L_0x00c1
        L_0x00c0:
            r0 = r9
        L_0x00c1:
            r6.f5242e = r9
            r6.f5243f = r3
            android.view.VelocityTracker r2 = r6.i
            if (r2 == 0) goto L_0x00ce
            r2.recycle()
            r6.i = r1
        L_0x00ce:
            android.view.VelocityTracker r1 = r6.i
            if (r1 == 0) goto L_0x00d5
            r1.addMovement(r7)
        L_0x00d5:
            boolean r1 = r6.f5242e
            if (r1 != 0) goto L_0x00dd
            if (r0 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r8 = r9
        L_0x00dd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.b.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean v(V v10) {
        return false;
    }

    public int w(V v10) {
        return -v10.getHeight();
    }

    public int x(V v10) {
        return v10.getHeight();
    }

    public int y() {
        return s();
    }

    public void z(CoordinatorLayout coordinatorLayout, V v10) {
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
