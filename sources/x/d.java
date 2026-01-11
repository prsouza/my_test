package x;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.l;
import x.e;
import y.a;

public final class d extends ConstraintLayout implements l {

    /* renamed from: e0  reason: collision with root package name */
    public static final /* synthetic */ int f12720e0 = 0;
    public float H;
    public int I;
    public int J;
    public int K;
    public float L;
    public float M;
    public long N;
    public float O;
    public C0248d P;
    public b Q;
    public boolean R;
    public ArrayList<c> S;
    public ArrayList<c> T;
    public CopyOnWriteArrayList<C0248d> U;
    public int V;
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f12721a0;
    public c b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f12722c0;

    /* renamed from: d0  reason: collision with root package name */
    public e f12723d0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            d.this.b0.a();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12725a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                x.d$e[] r0 = x.d.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12725a = r0
                x.d$e r1 = x.d.e.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12725a     // Catch:{ NoSuchFieldError -> 0x001d }
                x.d$e r1 = x.d.e.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12725a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x.d$e r1 = x.d.e.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12725a     // Catch:{ NoSuchFieldError -> 0x0033 }
                x.d$e r1 = x.d.e.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x.d.b.<clinit>():void");
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public float f12726a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f12727b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f12728c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f12729d = -1;

        public c() {
        }

        public final void a() {
            androidx.constraintlayout.widget.c cVar;
            a.C0256a aVar;
            int a10;
            androidx.constraintlayout.widget.c cVar2;
            int i = this.f12728c;
            if (!(i == -1 && this.f12729d == -1)) {
                if (i == -1) {
                    d.this.x(this.f12729d);
                } else {
                    int i10 = this.f12729d;
                    if (i10 == -1) {
                        d dVar = d.this;
                        Objects.requireNonNull(dVar);
                        dVar.setState(e.SETUP);
                        dVar.J = i;
                        dVar.I = -1;
                        dVar.K = -1;
                        y.a aVar2 = dVar.z;
                        if (aVar2 != null) {
                            float f10 = (float) -1;
                            int i11 = aVar2.f13302b;
                            if (i11 == i) {
                                if (i == -1) {
                                    aVar = aVar2.f13304d.valueAt(0);
                                } else {
                                    aVar = aVar2.f13304d.get(i11);
                                }
                                int i12 = aVar2.f13303c;
                                if ((i12 == -1 || !aVar.f13307b.get(i12).a(f10, f10)) && aVar2.f13303c != (a10 = aVar.a(f10, f10))) {
                                    if (a10 == -1) {
                                        cVar2 = null;
                                    } else {
                                        cVar2 = aVar.f13307b.get(a10).f13315f;
                                    }
                                    if (a10 != -1) {
                                        int i13 = aVar.f13307b.get(a10).f13314e;
                                    }
                                    if (cVar2 != null) {
                                        aVar2.f13303c = a10;
                                        cVar2.a(aVar2.f13301a);
                                    }
                                }
                            } else {
                                aVar2.f13302b = i;
                                a.C0256a aVar3 = aVar2.f13304d.get(i);
                                int a11 = aVar3.a(f10, f10);
                                if (a11 == -1) {
                                    cVar = aVar3.f13309d;
                                } else {
                                    cVar = aVar3.f13307b.get(a11).f13315f;
                                }
                                if (a11 != -1) {
                                    int i14 = aVar3.f13307b.get(a11).f13314e;
                                }
                                if (cVar == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f10 + ", " + f10);
                                } else {
                                    aVar2.f13303c = a11;
                                    cVar.a(aVar2.f13301a);
                                }
                            }
                        }
                    } else {
                        d.this.w(i, i10);
                    }
                }
                d.this.setState(e.SETUP);
            }
            if (!Float.isNaN(this.f12727b)) {
                d.this.v(this.f12726a, this.f12727b);
                this.f12726a = Float.NaN;
                this.f12727b = Float.NaN;
                this.f12728c = -1;
                this.f12729d = -1;
            } else if (!Float.isNaN(this.f12726a)) {
                d.this.setProgress(this.f12726a);
            }
        }
    }

    /* renamed from: x.d$d  reason: collision with other inner class name */
    public interface C0248d {
        void a();

        void b();
    }

    public enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public final void dispatchDraw(Canvas canvas) {
        s();
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.J;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public b getDesignTool() {
        if (this.Q == null) {
            this.Q = new b();
        }
        return this.Q;
    }

    public int getEndState() {
        return this.K;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.M;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return this.I;
    }

    public float getTargetPosition() {
        return this.O;
    }

    public Bundle getTransitionState() {
        if (this.b0 == null) {
            this.b0 = new c();
        }
        c cVar = this.b0;
        d dVar = d.this;
        cVar.f12729d = dVar.K;
        cVar.f12728c = dVar.I;
        cVar.f12727b = dVar.getVelocity();
        cVar.f12726a = d.this.getProgress();
        c cVar2 = this.b0;
        Objects.requireNonNull(cVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", cVar2.f12726a);
        bundle.putFloat("motion.velocity", cVar2.f12727b);
        bundle.putInt("motion.StartState", cVar2.f12728c);
        bundle.putInt("motion.EndState", cVar2.f12729d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) 0.0f;
    }

    public float getVelocity() {
        return this.H;
    }

    public final void h(View view, View view2, int i, int i10) {
        getNanoTime();
    }

    public final void i(View view, int i) {
    }

    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public final void j(View view, int i, int i10, int[] iArr, int i11) {
    }

    public final void k(int i) {
        this.z = null;
    }

    public final void m(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        if (i != 0 || i10 != 0) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }
    }

    public final void n(View view, int i, int i10, int i11, int i12, int i13) {
    }

    public final boolean o(View view, View view2, int i, int i10) {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        c cVar = this.b0;
        if (cVar == null) {
            return;
        }
        if (this.f12722c0) {
            post(new a());
        } else {
            cVar.a();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        this.f12721a0 = true;
        try {
            super.onLayout(z, i, i10, i11, i12);
        } finally {
            this.f12721a0 = false;
        }
    }

    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onRtlPropertiesChanged(int i) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof c) {
            c cVar = (c) view;
            if (this.U == null) {
                this.U = new CopyOnWriteArrayList<>();
            }
            this.U.add(cVar);
            if (cVar.f12718x) {
                if (this.S == null) {
                    this.S = new ArrayList<>();
                }
                this.S.add(cVar);
            }
            if (cVar.f12719y) {
                if (this.T == null) {
                    this.T = new ArrayList<>();
                }
                this.T.add(cVar);
            }
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<c> arrayList = this.S;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<c> arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void requestLayout() {
        int i = this.J;
        super.requestLayout();
    }

    public final void s() {
        int i;
        int i10;
        if (this.N == -1) {
            this.N = getNanoTime();
        }
        float f10 = this.M;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.J = -1;
        }
        boolean z = true;
        boolean z10 = false;
        if (this.R) {
            float signum = Math.signum(this.O - f10);
            long nanoTime = getNanoTime();
            float f11 = ((((float) (nanoTime - this.N)) * signum) * 1.0E-9f) / 0.0f;
            float f12 = this.M + f11;
            int i11 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i11 > 0 && f12 >= this.O) || (signum <= 0.0f && f12 <= this.O)) {
                f12 = this.O;
            }
            this.M = f12;
            this.L = f12;
            this.N = nanoTime;
            this.H = f11;
            if (Math.abs(f11) > 1.0E-5f) {
                setState(e.MOVING);
            }
            if ((i11 > 0 && f12 >= this.O) || (signum <= 0.0f && f12 <= this.O)) {
                f12 = this.O;
            }
            int i12 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
            if (i12 >= 0 || f12 <= 0.0f) {
                setState(e.FINISHED);
            }
            int childCount = getChildCount();
            this.R = false;
            getNanoTime();
            if (childCount <= 0) {
                boolean z11 = (i11 > 0 && f12 >= this.O) || (signum <= 0.0f && f12 <= this.O);
                if (!this.R && z11) {
                    setState(e.FINISHED);
                }
                boolean z12 = (!z11) | this.R;
                this.R = z12;
                if (f12 <= 0.0f && (i10 = this.I) != -1 && this.J != i10) {
                    this.J = i10;
                    throw null;
                } else if (((double) f12) < 1.0d || this.J == (i = this.K)) {
                    if (z12) {
                        invalidate();
                    } else if ((i11 > 0 && i12 == 0) || (signum < 0.0f && f12 == 0.0f)) {
                        setState(e.FINISHED);
                    }
                    boolean z13 = this.R;
                } else {
                    this.J = i;
                    throw null;
                }
            } else {
                getChildAt(0);
                throw null;
            }
        }
        float f13 = this.M;
        if (f13 >= 1.0f) {
            int i13 = this.J;
            int i14 = this.K;
            if (i13 == i14) {
                z = false;
            }
            this.J = i14;
        } else {
            if (f13 <= 0.0f) {
                int i15 = this.J;
                int i16 = this.I;
                if (i15 == i16) {
                    z = false;
                }
                this.J = i16;
            }
            if (z10 && !this.f12721a0) {
                requestLayout();
            }
            this.L = this.M;
        }
        z10 = z;
        requestLayout();
        this.L = this.M;
    }

    public void setDebugMode(int i) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f12722c0 = z;
    }

    public void setInteractionEnabled(boolean z) {
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<c> arrayList = this.T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.T.get(i).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<c> arrayList = this.S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.S.get(i).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        int i = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.b0 == null) {
                this.b0 = new c();
            }
            this.b0.f12726a = f10;
        } else if (i <= 0) {
            if (this.M == 1.0f && this.J == this.K) {
                setState(e.MOVING);
            }
            this.J = this.I;
            if (this.M == 0.0f) {
                setState(e.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.M == 0.0f && this.J == this.I) {
                setState(e.MOVING);
            }
            this.J = this.K;
            if (this.M == 1.0f) {
                setState(e.FINISHED);
            }
        } else {
            this.J = -1;
            setState(e.MOVING);
        }
    }

    public void setScene(e eVar) {
        g();
        throw null;
    }

    public void setStartState(int i) {
        if (!super.isAttachedToWindow()) {
            if (this.b0 == null) {
                this.b0 = new c();
            }
            c cVar = this.b0;
            cVar.f12728c = i;
            cVar.f12729d = i;
            return;
        }
        this.J = i;
    }

    public void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar != eVar2 || this.J != -1) {
            e eVar3 = this.f12723d0;
            this.f12723d0 = eVar;
            e eVar4 = e.MOVING;
            if (eVar3 == eVar4 && eVar == eVar4) {
                t();
            }
            int i = b.f12725a[eVar3.ordinal()];
            if (i == 1 || i == 2) {
                if (eVar == eVar4) {
                    t();
                }
                if (eVar == eVar2) {
                    u();
                }
            } else if (i == 3 && eVar == eVar2) {
                u();
            }
        }
    }

    public void setTransition(int i) {
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(C0248d dVar) {
        this.P = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.b0 == null) {
            this.b0 = new c();
        }
        c cVar = this.b0;
        Objects.requireNonNull(cVar);
        cVar.f12726a = bundle.getFloat("motion.progress");
        cVar.f12727b = bundle.getFloat("motion.velocity");
        cVar.f12728c = bundle.getInt("motion.StartState");
        cVar.f12729d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.b0.a();
        }
    }

    public final void t() {
        CopyOnWriteArrayList<C0248d> copyOnWriteArrayList;
        if ((this.P != null || ((copyOnWriteArrayList = this.U) != null && !copyOnWriteArrayList.isEmpty())) && this.W != this.L) {
            if (this.V != -1) {
                C0248d dVar = this.P;
                if (dVar != null) {
                    dVar.b();
                }
                CopyOnWriteArrayList<C0248d> copyOnWriteArrayList2 = this.U;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0248d> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
            }
            this.V = -1;
            this.W = this.L;
            C0248d dVar2 = this.P;
            if (dVar2 != null) {
                dVar2.a();
            }
            CopyOnWriteArrayList<C0248d> copyOnWriteArrayList3 = this.U;
            if (copyOnWriteArrayList3 != null) {
                Iterator<C0248d> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
        }
    }

    public final String toString() {
        Context context = getContext();
        return a.a(context, this.I) + "->" + a.a(context, this.K) + " (pos:" + this.M + " Dpos/Dt:" + this.H;
    }

    public final void u() {
        CopyOnWriteArrayList<C0248d> copyOnWriteArrayList;
        CopyOnWriteArrayList<C0248d> copyOnWriteArrayList2;
        if ((this.P != null || ((copyOnWriteArrayList2 = this.U) != null && !copyOnWriteArrayList2.isEmpty())) && this.V == -1) {
            this.V = this.J;
            throw null;
        } else if (this.P != null || ((copyOnWriteArrayList = this.U) != null && !copyOnWriteArrayList.isEmpty())) {
            throw null;
        }
    }

    public final void v(float f10, float f11) {
        if (!super.isAttachedToWindow()) {
            if (this.b0 == null) {
                this.b0 = new c();
            }
            c cVar = this.b0;
            cVar.f12726a = f10;
            cVar.f12727b = f11;
            return;
        }
        setProgress(f10);
        setState(e.MOVING);
        this.H = f11;
    }

    public final void w(int i, int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.b0 == null) {
                this.b0 = new c();
            }
            c cVar = this.b0;
            cVar.f12728c = i;
            cVar.f12729d = i10;
        }
    }

    public final void x(int i) {
        if (!super.isAttachedToWindow()) {
            if (this.b0 == null) {
                this.b0 = new c();
            }
            this.b0.f12729d = i;
            return;
        }
        int i10 = this.J;
        if (i10 != i && this.I != i && this.K != i) {
            this.K = i;
            if (i10 != -1) {
                w(i10, i);
                this.M = 0.0f;
                return;
            }
            this.O = 1.0f;
            this.L = 0.0f;
            this.M = 0.0f;
            this.N = getNanoTime();
            getNanoTime();
            throw null;
        }
    }
}
