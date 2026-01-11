package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import n.f;

public abstract class n0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f1339a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1340b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1341c;

    /* renamed from: s  reason: collision with root package name */
    public final View f1342s;

    /* renamed from: t  reason: collision with root package name */
    public a f1343t;

    /* renamed from: u  reason: collision with root package name */
    public b f1344u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1345v;

    /* renamed from: w  reason: collision with root package name */
    public int f1346w;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f1347x = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            ViewParent parent = n0.this.f1342s.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            n0 n0Var = n0.this;
            n0Var.a();
            View view = n0Var.f1342s;
            if (view.isEnabled() && !view.isLongClickable() && n0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                n0Var.f1345v = true;
            }
        }
    }

    public n0(View view) {
        this.f1342s = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1339a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1340b = tapTimeout;
        this.f1341c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f1344u;
        if (bVar != null) {
            this.f1342s.removeCallbacks(bVar);
        }
        a aVar = this.f1343t;
        if (aVar != null) {
            this.f1342s.removeCallbacks(aVar);
        }
    }

    public abstract f b();

    public abstract boolean c();

    public boolean d() {
        f b10 = b();
        if (b10 == null || !b10.b()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r4 != 3) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.f1345v
            r0 = 3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x0071
            android.view.View r3 = r11.f1342s
            n.f r4 = r11.b()
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.b()
            if (r5 != 0) goto L_0x0016
            goto L_0x0061
        L_0x0016:
            android.widget.ListView r4 = r4.g()
            androidx.appcompat.widget.l0 r4 = (androidx.appcompat.widget.l0) r4
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0025
            goto L_0x0061
        L_0x0025:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f1347x
            r3.getLocationOnScreen(r6)
            r3 = r6[r2]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f1347x
            r4.getLocationOnScreen(r3)
            r6 = r3[r2]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f1346w
            boolean r3 = r4.b(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r1) goto L_0x005a
            if (r13 == r0) goto L_0x005a
            r13 = r1
            goto L_0x005b
        L_0x005a:
            r13 = r2
        L_0x005b:
            if (r3 == 0) goto L_0x0061
            if (r13 == 0) goto L_0x0061
            r13 = r1
            goto L_0x0062
        L_0x0061:
            r13 = r2
        L_0x0062:
            if (r13 != 0) goto L_0x006e
            boolean r13 = r11.d()
            if (r13 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r13 = r2
            goto L_0x0127
        L_0x006e:
            r13 = r1
            goto L_0x0127
        L_0x0071:
            android.view.View r3 = r11.f1342s
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x007b
            goto L_0x0104
        L_0x007b:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d8
            if (r4 == r1) goto L_0x00d4
            r5 = 2
            if (r4 == r5) goto L_0x008a
            if (r4 == r0) goto L_0x00d4
            goto L_0x0104
        L_0x008a:
            int r0 = r11.f1346w
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0104
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f1339a
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c5
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c5
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c5
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c5
            r13 = r1
            goto L_0x00c6
        L_0x00c5:
            r13 = r2
        L_0x00c6:
            if (r13 != 0) goto L_0x0104
            r11.a()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r1)
            r13 = r1
            goto L_0x0105
        L_0x00d4:
            r11.a()
            goto L_0x0104
        L_0x00d8:
            int r13 = r13.getPointerId(r2)
            r11.f1346w = r13
            androidx.appcompat.widget.n0$a r13 = r11.f1343t
            if (r13 != 0) goto L_0x00e9
            androidx.appcompat.widget.n0$a r13 = new androidx.appcompat.widget.n0$a
            r13.<init>()
            r11.f1343t = r13
        L_0x00e9:
            androidx.appcompat.widget.n0$a r13 = r11.f1343t
            int r0 = r11.f1340b
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            androidx.appcompat.widget.n0$b r13 = r11.f1344u
            if (r13 != 0) goto L_0x00fc
            androidx.appcompat.widget.n0$b r13 = new androidx.appcompat.widget.n0$b
            r13.<init>()
            r11.f1344u = r13
        L_0x00fc:
            androidx.appcompat.widget.n0$b r13 = r11.f1344u
            int r0 = r11.f1341c
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
        L_0x0104:
            r13 = r2
        L_0x0105:
            if (r13 == 0) goto L_0x010f
            boolean r13 = r11.c()
            if (r13 == 0) goto L_0x010f
            r13 = r1
            goto L_0x0110
        L_0x010f:
            r13 = r2
        L_0x0110:
            if (r13 == 0) goto L_0x0127
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f1342s
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0127:
            r11.f1345v = r13
            if (r13 != 0) goto L_0x012f
            if (r12 == 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r1 = r2
        L_0x012f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f1345v = false;
        this.f1346w = -1;
        a aVar = this.f1343t;
        if (aVar != null) {
            this.f1342s.removeCallbacks(aVar);
        }
    }
}
