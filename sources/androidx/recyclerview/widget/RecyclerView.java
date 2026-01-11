package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.helpers.MessageFormatter;

public class RecyclerView extends ViewGroup implements n0.i {
    public static final int[] P0 = {16843830};
    public static final Class<?>[] Q0;
    public static final c R0 = new c();
    public f A;
    public l A0;
    public n B;
    public boolean B0;
    public u C;
    public x C0;
    public final List<u> D;
    public i D0;
    public final ArrayList<m> E;
    public final int[] E0;
    public final ArrayList<q> F;
    public n0.j F0;
    public q G;
    public final int[] G0;
    public boolean H;
    public final int[] H0;
    public boolean I;
    public final int[] I0;
    public boolean J;
    public final List<b0> J0;
    public int K;
    public b K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public int M0;
    public boolean N;
    public int N0;
    public int O;
    public final d O0;
    public boolean P;
    public final AccessibilityManager Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public j V;
    public EdgeEffect W;

    /* renamed from: a  reason: collision with root package name */
    public final v f2267a;

    /* renamed from: a0  reason: collision with root package name */
    public EdgeEffect f2268a0;

    /* renamed from: b  reason: collision with root package name */
    public final t f2269b;
    public EdgeEffect b0;

    /* renamed from: c  reason: collision with root package name */
    public w f2270c;

    /* renamed from: c0  reason: collision with root package name */
    public EdgeEffect f2271c0;

    /* renamed from: d0  reason: collision with root package name */
    public k f2272d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2273e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2274f0;

    /* renamed from: g0  reason: collision with root package name */
    public VelocityTracker f2275g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2276h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f2277i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f2278j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f2279k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2280l0;

    /* renamed from: m0  reason: collision with root package name */
    public p f2281m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f2282n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f2283o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f2284p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f2285q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f2286r0;

    /* renamed from: s  reason: collision with root package name */
    public a f2287s;

    /* renamed from: s0  reason: collision with root package name */
    public final a0 f2288s0;

    /* renamed from: t  reason: collision with root package name */
    public b f2289t;

    /* renamed from: t0  reason: collision with root package name */
    public m f2290t0;

    /* renamed from: u  reason: collision with root package name */
    public final c0 f2291u;

    /* renamed from: u0  reason: collision with root package name */
    public m.b f2292u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2293v;

    /* renamed from: v0  reason: collision with root package name */
    public final y f2294v0;

    /* renamed from: w  reason: collision with root package name */
    public final a f2295w;

    /* renamed from: w0  reason: collision with root package name */
    public r f2296w0;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f2297x;

    /* renamed from: x0  reason: collision with root package name */
    public List<r> f2298x0;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f2299y;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f2300y0;
    public final RectF z;
    public boolean z0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.J && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.H) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.M) {
                    recyclerView2.L = true;
                } else {
                    recyclerView2.n();
                }
            }
        }
    }

    public class a0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f2302a;

        /* renamed from: b  reason: collision with root package name */
        public int f2303b;

        /* renamed from: c  reason: collision with root package name */
        public OverScroller f2304c;

        /* renamed from: s  reason: collision with root package name */
        public Interpolator f2305s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f2306t = false;

        /* renamed from: u  reason: collision with root package name */
        public boolean f2307u = false;

        public a0() {
            c cVar = RecyclerView.R0;
            this.f2305s = cVar;
            this.f2304c = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a() {
            if (this.f2306t) {
                this.f2307u = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            x.d.m(recyclerView, this);
        }

        public final void b(int i, int i10, int i11, Interpolator interpolator) {
            if (i11 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i10);
                boolean z = abs > abs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    abs = abs2;
                }
                i11 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            }
            int i12 = i11;
            if (interpolator == null) {
                interpolator = RecyclerView.R0;
            }
            if (this.f2305s != interpolator) {
                this.f2305s = interpolator;
                this.f2304c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2303b = 0;
            this.f2302a = 0;
            RecyclerView.this.setScrollState(2);
            this.f2304c.startScroll(0, 0, i, i10, i12);
            a();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            this.f2304c.abortAnimation();
        }

        public final void run() {
            int i;
            int i10;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.B == null) {
                c();
                return;
            }
            this.f2307u = false;
            this.f2306t = true;
            recyclerView.n();
            OverScroller overScroller = this.f2304c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i11 = currX - this.f2302a;
                int i12 = currY - this.f2303b;
                this.f2302a = currX;
                this.f2303b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.I0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.t(i11, i12, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.I0;
                    i11 -= iArr2[0];
                    i12 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m(i11, i12);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.A != null) {
                    int[] iArr3 = recyclerView3.I0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.d0(i11, i12, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.I0;
                    i = iArr4[0];
                    i10 = iArr4[1];
                    i11 -= i;
                    i12 -= i10;
                    x xVar = recyclerView4.B.g;
                    if (xVar != null && !xVar.f2385d && xVar.f2386e) {
                        int b10 = recyclerView4.f2294v0.b();
                        if (b10 == 0) {
                            xVar.d();
                        } else if (xVar.f2382a >= b10) {
                            xVar.f2382a = b10 - 1;
                            xVar.b(i, i10);
                        } else {
                            xVar.b(i, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.E.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.I0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.u(i, i10, i11, i12, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.I0;
                int i13 = i11 - iArr6[0];
                int i14 = i12 - iArr6[1];
                if (!(i == 0 && i10 == 0)) {
                    recyclerView6.v(i, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i13 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i14 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                x xVar2 = recyclerView7.B.g;
                if ((xVar2 != null && xVar2.f2385d) || !z) {
                    a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    m mVar = recyclerView8.f2290t0;
                    if (mVar != null) {
                        mVar.a(recyclerView8, i, i10);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i15 = i13 < 0 ? -currVelocity : i13 > 0 ? currVelocity : 0;
                        if (i14 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i14 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i15 < 0) {
                            recyclerView9.x();
                            if (recyclerView9.W.isFinished()) {
                                recyclerView9.W.onAbsorb(-i15);
                            }
                        } else if (i15 > 0) {
                            recyclerView9.y();
                            if (recyclerView9.b0.isFinished()) {
                                recyclerView9.b0.onAbsorb(i15);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.z();
                            if (recyclerView9.f2268a0.isFinished()) {
                                recyclerView9.f2268a0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.w();
                            if (recyclerView9.f2271c0.isFinished()) {
                                recyclerView9.f2271c0.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i15 == 0 && currVelocity == 0)) {
                            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
                            x.d.k(recyclerView9);
                        }
                    }
                    int[] iArr7 = RecyclerView.P0;
                    m.b bVar = RecyclerView.this.f2292u0;
                    int[] iArr8 = bVar.f2563c;
                    if (iArr8 != null) {
                        Arrays.fill(iArr8, -1);
                    }
                    bVar.f2564d = 0;
                }
            }
            x xVar3 = RecyclerView.this.B.g;
            if (xVar3 != null && xVar3.f2385d) {
                xVar3.b(0, 0);
            }
            this.f2306t = false;
            if (this.f2307u) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, n0.a0> weakHashMap2 = n0.x.f8842a;
                x.d.m(recyclerView10, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.k0(1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            k kVar = RecyclerView.this.f2272d0;
            if (kVar != null) {
                k kVar2 = (k) kVar;
                boolean z = !kVar2.f2506h.isEmpty();
                boolean z10 = !kVar2.f2507j.isEmpty();
                boolean z11 = !kVar2.f2508k.isEmpty();
                boolean z12 = !kVar2.i.isEmpty();
                if (z || z10 || z12 || z11) {
                    Iterator<b0> it = kVar2.f2506h.iterator();
                    while (it.hasNext()) {
                        b0 next = it.next();
                        View view = next.f2311a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar2.f2514q.add(next);
                        animate.setDuration(kVar2.f2336d).alpha(0.0f).setListener(new f(kVar2, next, animate, view)).start();
                    }
                    kVar2.f2506h.clear();
                    if (z10) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(kVar2.f2507j);
                        kVar2.f2510m.add(arrayList);
                        kVar2.f2507j.clear();
                        c cVar = new c(kVar2, arrayList);
                        if (z) {
                            View view2 = ((k.b) arrayList.get(0)).f2522a.f2311a;
                            long j10 = kVar2.f2336d;
                            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
                            x.d.n(view2, cVar, j10);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z11) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(kVar2.f2508k);
                        kVar2.f2511n.add(arrayList2);
                        kVar2.f2508k.clear();
                        d dVar = new d(kVar2, arrayList2);
                        if (z) {
                            View view3 = ((k.a) arrayList2.get(0)).f2516a.f2311a;
                            long j11 = kVar2.f2336d;
                            WeakHashMap<View, n0.a0> weakHashMap2 = n0.x.f8842a;
                            x.d.n(view3, dVar, j11);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z12) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(kVar2.i);
                        kVar2.f2509l.add(arrayList3);
                        kVar2.i.clear();
                        e eVar = new e(kVar2, arrayList3);
                        if (z || z10 || z11) {
                            long j12 = 0;
                            long j13 = z ? kVar2.f2336d : 0;
                            long j14 = z10 ? kVar2.f2337e : 0;
                            if (z11) {
                                j12 = kVar2.f2338f;
                            }
                            View view4 = ((b0) arrayList3.get(0)).f2311a;
                            WeakHashMap<View, n0.a0> weakHashMap3 = n0.x.f8842a;
                            x.d.n(view4, eVar, Math.max(j14, j12) + j13);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.B0 = false;
        }
    }

    public static abstract class b0 {

        /* renamed from: t  reason: collision with root package name */
        public static final List<Object> f2310t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f2311a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f2312b;

        /* renamed from: c  reason: collision with root package name */
        public int f2313c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f2314d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f2315e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2316f = -1;
        public int g = -1;

        /* renamed from: h  reason: collision with root package name */
        public b0 f2317h = null;
        public b0 i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f2318j;

        /* renamed from: k  reason: collision with root package name */
        public List<Object> f2319k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f2320l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f2321m = 0;

        /* renamed from: n  reason: collision with root package name */
        public t f2322n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2323o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f2324p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f2325q = -1;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f2326r;

        /* renamed from: s  reason: collision with root package name */
        public f<? extends b0> f2327s;

        public b0(View view) {
            if (view != null) {
                this.f2311a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<java.lang.Object>, java.util.ArrayList] */
        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f2318j) == 0) {
                if (this.f2319k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f2319k = arrayList;
                    this.f2320l = Collections.unmodifiableList(arrayList);
                }
                this.f2319k.add(obj);
            }
        }

        public final void b(int i10) {
            this.f2318j = i10 | this.f2318j;
        }

        public final void c() {
            this.f2314d = -1;
            this.g = -1;
        }

        public final void d() {
            this.f2318j &= -33;
        }

        public final int e() {
            int i10 = this.g;
            return i10 == -1 ? this.f2313c : i10;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<java.lang.Object>, java.util.ArrayList] */
        public final List<Object> f() {
            if ((this.f2318j & 1024) != 0) {
                return f2310t;
            }
            ? r02 = this.f2319k;
            if (r02 == 0 || r02.size() == 0) {
                return f2310t;
            }
            return this.f2320l;
        }

        public final boolean g(int i10) {
            return (i10 & this.f2318j) != 0;
        }

        public final boolean h() {
            return (this.f2311a.getParent() == null || this.f2311a.getParent() == this.f2326r) ? false : true;
        }

        public final boolean i() {
            return (this.f2318j & 1) != 0;
        }

        public final boolean j() {
            return (this.f2318j & 4) != 0;
        }

        public final boolean k() {
            if ((this.f2318j & 16) == 0) {
                View view = this.f2311a;
                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
                if (!x.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean l() {
            return (this.f2318j & 8) != 0;
        }

        public final boolean m() {
            return this.f2322n != null;
        }

        public final boolean n() {
            return (this.f2318j & 256) != 0;
        }

        public final boolean o() {
            return (this.f2318j & 2) != 0;
        }

        public final void p(int i10, boolean z) {
            if (this.f2314d == -1) {
                this.f2314d = this.f2313c;
            }
            if (this.g == -1) {
                this.g = this.f2313c;
            }
            if (z) {
                this.g += i10;
            }
            this.f2313c += i10;
            if (this.f2311a.getLayoutParams() != null) {
                ((o) this.f2311a.getLayoutParams()).f2365c = true;
            }
        }

        /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<java.lang.Object>, java.util.ArrayList] */
        public final void q() {
            this.f2318j = 0;
            this.f2313c = -1;
            this.f2314d = -1;
            this.f2315e = -1;
            this.g = -1;
            this.f2321m = 0;
            this.f2317h = null;
            this.i = null;
            ? r22 = this.f2319k;
            if (r22 != 0) {
                r22.clear();
            }
            this.f2318j &= -1025;
            this.f2324p = 0;
            this.f2325q = -1;
            RecyclerView.k(this);
        }

        public final void r(int i10, int i11) {
            this.f2318j = (i10 & i11) | (this.f2318j & (~i11));
        }

        public final void s(boolean z) {
            int i10 = this.f2321m;
            int i11 = z ? i10 - 1 : i10 + 1;
            this.f2321m = i11;
            if (i11 < 0) {
                this.f2321m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i11 == 1) {
                this.f2318j |= 16;
            } else if (z && i11 == 0) {
                this.f2318j &= -17;
            }
        }

        public final boolean t() {
            return (this.f2318j & 128) != 0;
        }

        public final String toString() {
            StringBuilder c10 = b9.m.c(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            c10.append(Integer.toHexString(hashCode()));
            c10.append(" position=");
            c10.append(this.f2313c);
            c10.append(" id=");
            c10.append(this.f2315e);
            c10.append(", oldPos=");
            c10.append(this.f2314d);
            c10.append(", pLpos:");
            c10.append(this.g);
            StringBuilder sb2 = new StringBuilder(c10.toString());
            if (m()) {
                sb2.append(" scrap ");
                sb2.append(this.f2323o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (j()) {
                sb2.append(" invalid");
            }
            if (!i()) {
                sb2.append(" unbound");
            }
            boolean z = true;
            if ((this.f2318j & 2) != 0) {
                sb2.append(" update");
            }
            if (l()) {
                sb2.append(" removed");
            }
            if (t()) {
                sb2.append(" ignored");
            }
            if (n()) {
                sb2.append(" tmpDetached");
            }
            if (!k()) {
                StringBuilder d10 = a.a.d(" not recyclable(");
                d10.append(this.f2321m);
                d10.append(")");
                sb2.append(d10.toString());
            }
            if ((this.f2318j & 512) == 0 && !j()) {
                z = false;
            }
            if (z) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2311a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final void u() {
            this.f2322n.k(this);
        }

        public final boolean v() {
            return (this.f2318j & 32) != 0;
        }
    }

    public class c implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class d {
        public d() {
        }

        public final void a(b0 b0Var, k.c cVar, k.c cVar2) {
            boolean z;
            int i;
            int i10;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            b0Var.s(false);
            z zVar = (z) recyclerView.f2272d0;
            Objects.requireNonNull(zVar);
            if (cVar == null || ((i = cVar.f2339a) == (i10 = cVar2.f2339a) && cVar.f2340b == cVar2.f2340b)) {
                k kVar = (k) zVar;
                kVar.m(b0Var);
                b0Var.f2311a.setAlpha(0.0f);
                kVar.i.add(b0Var);
                z = true;
            } else {
                z = zVar.h(b0Var, i, cVar.f2340b, i10, cVar2.f2340b);
            }
            if (z) {
                recyclerView.V();
            }
        }

        public final void b(b0 b0Var, k.c cVar, k.c cVar2) {
            boolean z;
            RecyclerView.this.f2269b.k(b0Var);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(b0Var);
            b0Var.s(false);
            z zVar = (z) recyclerView.f2272d0;
            Objects.requireNonNull(zVar);
            int i = cVar.f2339a;
            int i10 = cVar.f2340b;
            View view = b0Var.f2311a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f2339a;
            int top = cVar2 == null ? view.getTop() : cVar2.f2340b;
            if (b0Var.l() || (i == left && i10 == top)) {
                k kVar = (k) zVar;
                kVar.m(b0Var);
                kVar.f2506h.add(b0Var);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = zVar.h(b0Var, i, i10, left, top);
            }
            if (z) {
                recyclerView.V();
            }
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2329a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$f$a[] r0 = androidx.recyclerview.widget.RecyclerView.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2329a = r0
                androidx.recyclerview.widget.RecyclerView$f$a r1 = androidx.recyclerview.widget.RecyclerView.f.a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2329a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$f$a r1 = androidx.recyclerview.widget.RecyclerView.f.a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.e.<clinit>():void");
        }
    }

    public static abstract class f<VH extends b0> {

        /* renamed from: a  reason: collision with root package name */
        public final g f2330a = new g();

        /* renamed from: b  reason: collision with root package name */
        public boolean f2331b = false;

        /* renamed from: c  reason: collision with root package name */
        public a f2332c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public abstract int a();

        public long b(int i) {
            return -1;
        }

        public int c(int i) {
            return 0;
        }

        public final void d() {
            this.f2330a.b();
        }

        public final void e(int i) {
            this.f2330a.c(i);
        }

        public void f(RecyclerView recyclerView) {
        }

        public abstract void g(VH vh2, int i);

        public abstract VH h(ViewGroup viewGroup, int i);
    }

    public static class g extends Observable<h> {
        public final boolean a() {
            return !this.mObservers.isEmpty();
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((h) this.mObservers.get(size)).a();
            }
        }

        public final void c(int i) {
            int size = this.mObservers.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((h) this.mObservers.get(size)).b(i);
                } else {
                    return;
                }
            }
        }
    }

    public static abstract class h {
        public void a() {
        }

        public void b(int i) {
        }
    }

    public interface i {
        int a();
    }

    public static class j {
        public final EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class k {

        /* renamed from: a  reason: collision with root package name */
        public b f2333a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f2334b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f2335c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f2336d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f2337e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f2338f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f2339a;

            /* renamed from: b  reason: collision with root package name */
            public int f2340b;

            public final c a(b0 b0Var) {
                View view = b0Var.f2311a;
                this.f2339a = view.getLeft();
                this.f2340b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        public static int b(b0 b0Var) {
            int i;
            int i10 = b0Var.f2318j & 14;
            if (b0Var.j()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int i11 = b0Var.f2314d;
            RecyclerView recyclerView = b0Var.f2326r;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.H(b0Var);
            }
            return (i11 == -1 || i == -1 || i11 == i) ? i10 : i10 | 2048;
        }

        public abstract boolean a(b0 b0Var, b0 b0Var2, c cVar, c cVar2);

        public final void c(b0 b0Var) {
            b bVar = this.f2333a;
            if (bVar != null) {
                l lVar = (l) bVar;
                Objects.requireNonNull(lVar);
                boolean z = true;
                b0Var.s(true);
                if (b0Var.f2317h != null && b0Var.i == null) {
                    b0Var.f2317h = null;
                }
                b0Var.i = null;
                if (!((b0Var.f2318j & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = b0Var.f2311a;
                    recyclerView.h0();
                    b bVar2 = recyclerView.f2289t;
                    int c10 = ((v) bVar2.f2459a).c(view);
                    if (c10 == -1) {
                        bVar2.l(view);
                    } else if (bVar2.f2460b.d(c10)) {
                        bVar2.f2460b.f(c10);
                        bVar2.l(view);
                        ((v) bVar2.f2459a).d(c10);
                    } else {
                        z = false;
                    }
                    if (z) {
                        b0 K = RecyclerView.K(view);
                        recyclerView.f2269b.k(K);
                        recyclerView.f2269b.h(K);
                    }
                    recyclerView.j0(!z);
                    if (!z && b0Var.n()) {
                        RecyclerView.this.removeDetachedView(b0Var.f2311a, false);
                    }
                }
            }
        }

        public final void d() {
            int size = this.f2334b.size();
            for (int i = 0; i < size; i++) {
                this.f2334b.get(i).a();
            }
            this.f2334b.clear();
        }

        public abstract void e(b0 b0Var);

        public abstract void f();

        public abstract boolean g();
    }

    public class l implements k.b {
        public l() {
        }
    }

    public static abstract class m {
        public void d(Canvas canvas, RecyclerView recyclerView) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView, y yVar) {
        }
    }

    public static abstract class n {

        /* renamed from: a  reason: collision with root package name */
        public b f2342a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f2343b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2344c;

        /* renamed from: d  reason: collision with root package name */
        public final b f2345d;

        /* renamed from: e  reason: collision with root package name */
        public b0 f2346e;

        /* renamed from: f  reason: collision with root package name */
        public b0 f2347f;
        public x g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2348h = false;
        public boolean i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2349j = true;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2350k = true;

        /* renamed from: l  reason: collision with root package name */
        public int f2351l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2352m;

        /* renamed from: n  reason: collision with root package name */
        public int f2353n;

        /* renamed from: o  reason: collision with root package name */
        public int f2354o;

        /* renamed from: p  reason: collision with root package name */
        public int f2355p;

        /* renamed from: q  reason: collision with root package name */
        public int f2356q;

        public class a implements b0.b {
            public a() {
            }

            public final int a() {
                n nVar = n.this;
                return nVar.f2355p - nVar.L();
            }

            public final int b(View view) {
                return n.this.C(view) - ((o) view.getLayoutParams()).leftMargin;
            }

            public final View c(int i) {
                return n.this.w(i);
            }

            public final int d() {
                return n.this.K();
            }

            public final int e(View view) {
                return n.this.D(view) + ((o) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements b0.b {
            public b() {
            }

            public final int a() {
                n nVar = n.this;
                return nVar.f2356q - nVar.J();
            }

            public final int b(View view) {
                return n.this.E(view) - ((o) view.getLayoutParams()).topMargin;
            }

            public final View c(int i) {
                return n.this.w(i);
            }

            public final int d() {
                return n.this.M();
            }

            public final int e(View view) {
                return n.this.A(view) + ((o) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f2359a;

            /* renamed from: b  reason: collision with root package name */
            public int f2360b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f2361c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f2362d;
        }

        public n() {
            a aVar = new a();
            this.f2344c = aVar;
            b bVar = new b();
            this.f2345d = bVar;
            this.f2346e = new b0(aVar);
            this.f2347f = new b0(bVar);
        }

        public static d O(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aa.b.A, i10, i11);
            dVar.f2359a = obtainStyledAttributes.getInt(0, 1);
            dVar.f2360b = obtainStyledAttributes.getInt(10, 1);
            dVar.f2361c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f2362d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean S(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        public static int h(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int y(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.y(int, int, int, int, boolean):int");
        }

        public final int A(View view) {
            return view.getBottom() + ((o) view.getLayoutParams()).f2364b.bottom;
        }

        public void A0(Rect rect, int i10, int i11) {
            z0(h(i10, L() + K() + rect.width(), I()), h(i11, J() + M() + rect.height(), H()));
        }

        public final void B(View view, Rect rect) {
            int[] iArr = RecyclerView.P0;
            o oVar = (o) view.getLayoutParams();
            Rect rect2 = oVar.f2364b;
            rect.set((view.getLeft() - rect2.left) - oVar.leftMargin, (view.getTop() - rect2.top) - oVar.topMargin, view.getRight() + rect2.right + oVar.rightMargin, view.getBottom() + rect2.bottom + oVar.bottomMargin);
        }

        public final void B0(int i10, int i11) {
            int x10 = x();
            if (x10 == 0) {
                this.f2343b.o(i10, i11);
                return;
            }
            int i12 = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < x10; i16++) {
                View w6 = w(i16);
                Rect rect = this.f2343b.f2297x;
                B(w6, rect);
                int i17 = rect.left;
                if (i17 < i13) {
                    i13 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i14) {
                    i14 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f2343b.f2297x.set(i13, i14, i12, i15);
            A0(this.f2343b.f2297x, i10, i11);
        }

        public final int C(View view) {
            return view.getLeft() - ((o) view.getLayoutParams()).f2364b.left;
        }

        public final void C0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f2343b = null;
                this.f2342a = null;
                this.f2355p = 0;
                this.f2356q = 0;
            } else {
                this.f2343b = recyclerView;
                this.f2342a = recyclerView.f2289t;
                this.f2355p = recyclerView.getWidth();
                this.f2356q = recyclerView.getHeight();
            }
            this.f2353n = 1073741824;
            this.f2354o = 1073741824;
        }

        public final int D(View view) {
            return view.getRight() + ((o) view.getLayoutParams()).f2364b.right;
        }

        public final boolean D0(View view, int i10, int i11, o oVar) {
            return view.isLayoutRequested() || !this.f2349j || !S(view.getWidth(), i10, oVar.width) || !S(view.getHeight(), i11, oVar.height);
        }

        public final int E(View view) {
            return view.getTop() - ((o) view.getLayoutParams()).f2364b.top;
        }

        public boolean E0() {
            return false;
        }

        public final View F() {
            View focusedChild;
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2342a.k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public final boolean F0(View view, int i10, int i11, o oVar) {
            return !this.f2349j || !S(view.getMeasuredWidth(), i10, oVar.width) || !S(view.getMeasuredHeight(), i11, oVar.height);
        }

        public final int G() {
            RecyclerView recyclerView = this.f2343b;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            return x.e.d(recyclerView);
        }

        public void G0(RecyclerView recyclerView, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final int H() {
            RecyclerView recyclerView = this.f2343b;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            return x.d.d(recyclerView);
        }

        public final void H0(x xVar) {
            x xVar2 = this.g;
            if (!(xVar2 == null || xVar == xVar2 || !xVar2.f2386e)) {
                xVar2.d();
            }
            this.g = xVar;
            RecyclerView recyclerView = this.f2343b;
            recyclerView.f2288s0.c();
            if (xVar.f2388h) {
                StringBuilder d10 = a.a.d("An instance of ");
                d10.append(xVar.getClass().getSimpleName());
                d10.append(" was started more than once. Each instance of");
                d10.append(xVar.getClass().getSimpleName());
                d10.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", d10.toString());
            }
            xVar.f2383b = recyclerView;
            xVar.f2384c = this;
            int i10 = xVar.f2382a;
            if (i10 != -1) {
                recyclerView.f2294v0.f2395a = i10;
                xVar.f2386e = true;
                xVar.f2385d = true;
                xVar.f2387f = recyclerView.B.s(i10);
                xVar.f2383b.f2288s0.a();
                xVar.f2388h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final int I() {
            RecyclerView recyclerView = this.f2343b;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            return x.d.e(recyclerView);
        }

        public boolean I0() {
            return false;
        }

        public final int J() {
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int K() {
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int L() {
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int M() {
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public final int N(View view) {
            return ((o) view.getLayoutParams()).a();
        }

        public int P(t tVar, y yVar) {
            return -1;
        }

        public final void Q(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((o) view.getLayoutParams()).f2364b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.f2343b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f2343b.z;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean R() {
            return false;
        }

        public final void T(View view, int i10, int i11, int i12, int i13) {
            o oVar = (o) view.getLayoutParams();
            Rect rect = oVar.f2364b;
            view.layout(i10 + rect.left + oVar.leftMargin, i11 + rect.top + oVar.topMargin, (i12 - rect.right) - oVar.rightMargin, (i13 - rect.bottom) - oVar.bottomMargin);
        }

        public void U(int i10) {
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2289t.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f2289t.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void V(int i10) {
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2289t.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f2289t.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void W() {
        }

        public void X(RecyclerView recyclerView) {
        }

        public View Y(View view, int i10, t tVar, y yVar) {
            return null;
        }

        public void Z(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2343b;
            t tVar = recyclerView.f2269b;
            y yVar = recyclerView.f2294v0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f2343b.canScrollVertically(-1) && !this.f2343b.canScrollHorizontally(-1) && !this.f2343b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                f fVar = this.f2343b.A;
                if (fVar != null) {
                    accessibilityEvent.setItemCount(fVar.a());
                }
            }
        }

        public final void a0(View view, o0.b bVar) {
            b0 K = RecyclerView.K(view);
            if (K != null && !K.l() && !this.f2342a.k(K.f2311a)) {
                RecyclerView recyclerView = this.f2343b;
                b0(recyclerView.f2269b, recyclerView.f2294v0, view, bVar);
            }
        }

        public final void b(View view) {
            c(view, -1, false);
        }

        public void b0(t tVar, y yVar, View view, o0.b bVar) {
        }

        public final void c(View view, int i10, boolean z) {
            b0 K = RecyclerView.K(view);
            if (z || K.l()) {
                this.f2343b.f2291u.a(K);
            } else {
                this.f2343b.f2291u.e(K);
            }
            o oVar = (o) view.getLayoutParams();
            if (K.v() || K.m()) {
                if (K.m()) {
                    K.u();
                } else {
                    K.d();
                }
                this.f2342a.b(view, i10, view.getLayoutParams(), false);
            } else {
                int i11 = -1;
                if (view.getParent() == this.f2343b) {
                    int j10 = this.f2342a.j(view);
                    if (i10 == -1) {
                        i10 = this.f2342a.e();
                    }
                    if (j10 == -1) {
                        StringBuilder d10 = a.a.d("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        d10.append(this.f2343b.indexOfChild(view));
                        throw new IllegalStateException(android.support.v4.media.a.c(this.f2343b, d10));
                    } else if (j10 != i10) {
                        n nVar = this.f2343b.B;
                        View w6 = nVar.w(j10);
                        if (w6 != null) {
                            nVar.w(j10);
                            nVar.f2342a.c(j10);
                            o oVar2 = (o) w6.getLayoutParams();
                            b0 K2 = RecyclerView.K(w6);
                            if (K2.l()) {
                                nVar.f2343b.f2291u.a(K2);
                            } else {
                                nVar.f2343b.f2291u.e(K2);
                            }
                            nVar.f2342a.b(w6, i10, oVar2, K2.l());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j10 + nVar.f2343b.toString());
                        }
                    }
                } else {
                    this.f2342a.a(view, i10, false);
                    oVar.f2365c = true;
                    x xVar = this.g;
                    if (xVar != null && xVar.f2386e) {
                        Objects.requireNonNull(xVar.f2383b);
                        b0 K3 = RecyclerView.K(view);
                        if (K3 != null) {
                            i11 = K3.e();
                        }
                        if (i11 == xVar.f2382a) {
                            xVar.f2387f = view;
                        }
                    }
                }
            }
            if (oVar.f2366d) {
                K.f2311a.invalidate();
                oVar.f2366d = false;
            }
        }

        public void c0(int i10, int i11) {
        }

        public void d(String str) {
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void d0() {
        }

        public boolean e() {
            return false;
        }

        public void e0(int i10, int i11) {
        }

        public boolean f() {
            return false;
        }

        public void f0(int i10, int i11) {
        }

        public boolean g(o oVar) {
            return oVar != null;
        }

        public void g0(int i10, int i11) {
        }

        public void h0(t tVar, y yVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void i(int i10, int i11, y yVar, c cVar) {
        }

        public void i0() {
        }

        public void j(int i10, c cVar) {
        }

        public final void j0(int i10, int i11) {
            this.f2343b.o(i10, i11);
        }

        public int k(y yVar) {
            return 0;
        }

        public void k0(Parcelable parcelable) {
        }

        public int l(y yVar) {
            return 0;
        }

        public Parcelable l0() {
            return null;
        }

        public int m(y yVar) {
            return 0;
        }

        public void m0(int i10) {
        }

        public int n(y yVar) {
            return 0;
        }

        public final void n0(t tVar) {
            int x10 = x();
            while (true) {
                x10--;
                if (x10 < 0) {
                    return;
                }
                if (!RecyclerView.K(w(x10)).t()) {
                    q0(x10, tVar);
                }
            }
        }

        public int o(y yVar) {
            return 0;
        }

        public final void o0(t tVar) {
            int size = tVar.f2373a.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = tVar.f2373a.get(i10).f2311a;
                b0 K = RecyclerView.K(view);
                if (!K.t()) {
                    K.s(false);
                    if (K.n()) {
                        this.f2343b.removeDetachedView(view, false);
                    }
                    k kVar = this.f2343b.f2272d0;
                    if (kVar != null) {
                        kVar.e(K);
                    }
                    K.s(true);
                    b0 K2 = RecyclerView.K(view);
                    K2.f2322n = null;
                    K2.f2323o = false;
                    K2.d();
                    tVar.h(K2);
                }
            }
            tVar.f2373a.clear();
            ArrayList<b0> arrayList = tVar.f2374b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f2343b.invalidate();
            }
        }

        public int p(y yVar) {
            return 0;
        }

        public final void p0(View view, t tVar) {
            b bVar = this.f2342a;
            int c10 = ((v) bVar.f2459a).c(view);
            if (c10 >= 0) {
                if (bVar.f2460b.f(c10)) {
                    bVar.l(view);
                }
                ((v) bVar.f2459a).d(c10);
            }
            tVar.g(view);
        }

        public final void q(t tVar) {
            int x10 = x();
            while (true) {
                x10--;
                if (x10 >= 0) {
                    View w6 = w(x10);
                    b0 K = RecyclerView.K(w6);
                    if (!K.t()) {
                        if (!K.j() || K.l() || this.f2343b.A.f2331b) {
                            w(x10);
                            this.f2342a.c(x10);
                            tVar.i(w6);
                            this.f2343b.f2291u.e(K);
                        } else {
                            r0(x10);
                            tVar.h(K);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void q0(int i10, t tVar) {
            View w6 = w(i10);
            r0(i10);
            tVar.g(w6);
        }

        public final View r(View view) {
            View C;
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView == null || (C = recyclerView.C(view)) == null || this.f2342a.k(C)) {
                return null;
            }
            return C;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r3.f2342a;
            r4 = r0.f(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void r0(int r4) {
            /*
                r3 = this;
                android.view.View r0 = r3.w(r4)
                if (r0 == 0) goto L_0x0029
                androidx.recyclerview.widget.b r0 = r3.f2342a
                int r4 = r0.f(r4)
                androidx.recyclerview.widget.b$b r1 = r0.f2459a
                androidx.recyclerview.widget.v r1 = (androidx.recyclerview.widget.v) r1
                android.view.View r1 = r1.a(r4)
                if (r1 != 0) goto L_0x0017
                goto L_0x0029
            L_0x0017:
                androidx.recyclerview.widget.b$a r2 = r0.f2460b
                boolean r2 = r2.f(r4)
                if (r2 == 0) goto L_0x0022
                r0.l(r1)
            L_0x0022:
                androidx.recyclerview.widget.b$b r0 = r0.f2459a
                androidx.recyclerview.widget.v r0 = (androidx.recyclerview.widget.v) r0
                r0.d(r4)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.r0(int):void");
        }

        public View s(int i10) {
            int x10 = x();
            for (int i11 = 0; i11 < x10; i11++) {
                View w6 = w(i11);
                b0 K = RecyclerView.K(w6);
                if (K != null && K.e() == i10 && !K.t() && (this.f2343b.f2294v0.g || !K.l())) {
                    return w6;
                }
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
            if (r14 == false) goto L_0x00bb;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean s0(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.K()
                int r2 = r9.M()
                int r3 = r9.f2355p
                int r4 = r9.L()
                int r3 = r3 - r4
                int r4 = r9.f2356q
                int r5 = r9.J()
                int r4 = r4 - r5
                int r5 = r11.getLeft()
                int r6 = r12.left
                int r5 = r5 + r6
                int r6 = r11.getScrollX()
                int r5 = r5 - r6
                int r6 = r11.getTop()
                int r7 = r12.top
                int r6 = r6 + r7
                int r11 = r11.getScrollY()
                int r6 = r6 - r11
                int r11 = r12.width()
                int r11 = r11 + r5
                int r12 = r12.height()
                int r12 = r12 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r11 = r11 - r3
                int r3 = java.lang.Math.max(r1, r11)
                int r12 = r12 - r4
                int r12 = java.lang.Math.max(r1, r12)
                int r4 = r9.G()
                r8 = 1
                if (r4 != r8) goto L_0x005f
                if (r3 == 0) goto L_0x005a
                goto L_0x0067
            L_0x005a:
                int r3 = java.lang.Math.max(r7, r11)
                goto L_0x0067
            L_0x005f:
                if (r7 == 0) goto L_0x0062
                goto L_0x0066
            L_0x0062:
                int r7 = java.lang.Math.min(r5, r3)
            L_0x0066:
                r3 = r7
            L_0x0067:
                if (r2 == 0) goto L_0x006a
                goto L_0x006e
            L_0x006a:
                int r2 = java.lang.Math.min(r6, r12)
            L_0x006e:
                r0[r1] = r3
                r0[r8] = r2
                r11 = r0[r1]
                r12 = r0[r8]
                if (r14 == 0) goto L_0x00b6
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L_0x007f
                goto L_0x00b3
            L_0x007f:
                int r0 = r9.K()
                int r2 = r9.M()
                int r3 = r9.f2355p
                int r4 = r9.L()
                int r3 = r3 - r4
                int r4 = r9.f2356q
                int r5 = r9.J()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r9.f2343b
                android.graphics.Rect r5 = r5.f2297x
                r9.B(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto L_0x00b3
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto L_0x00b3
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto L_0x00b3
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r2) goto L_0x00b1
                goto L_0x00b3
            L_0x00b1:
                r14 = r8
                goto L_0x00b4
            L_0x00b3:
                r14 = r1
            L_0x00b4:
                if (r14 == 0) goto L_0x00bb
            L_0x00b6:
                if (r11 != 0) goto L_0x00bc
                if (r12 == 0) goto L_0x00bb
                goto L_0x00bc
            L_0x00bb:
                return r1
            L_0x00bc:
                if (r13 == 0) goto L_0x00c2
                r10.scrollBy(r11, r12)
                goto L_0x00c5
            L_0x00c2:
                r10.g0(r11, r12, r1)
            L_0x00c5:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.s0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public abstract o t();

        public final void t0() {
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public o u(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public int u0(int i10, t tVar, y yVar) {
            return 0;
        }

        public o v(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof o) {
                return new o((o) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new o((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new o(layoutParams);
        }

        public void v0(int i10) {
        }

        public final View w(int i10) {
            b bVar = this.f2342a;
            if (bVar != null) {
                return bVar.d(i10);
            }
            return null;
        }

        public int w0(int i10, t tVar, y yVar) {
            return 0;
        }

        public final int x() {
            b bVar = this.f2342a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final void x0(RecyclerView recyclerView) {
            y0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void y0(int i10, int i11) {
            this.f2355p = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f2353n = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.P0;
            }
            this.f2356q = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2354o = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.P0;
            }
        }

        public int z(t tVar, y yVar) {
            return -1;
        }

        public final void z0(int i10, int i11) {
            this.f2343b.setMeasuredDimension(i10, i11);
        }
    }

    public static abstract class p {
    }

    public interface q {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);

        void c();
    }

    public static abstract class r {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i10) {
        }
    }

    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f2367a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2368b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<b0> f2369a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f2370b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f2371c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f2372d = 0;
        }

        public final a a(int i) {
            a aVar = this.f2367a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2367a.put(i, aVar2);
            return aVar2;
        }
    }

    public final class t {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<b0> f2373a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b0> f2374b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<b0> f2375c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<b0> f2376d;

        /* renamed from: e  reason: collision with root package name */
        public int f2377e;

        /* renamed from: f  reason: collision with root package name */
        public int f2378f;
        public s g;

        public t() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.f2373a = arrayList;
            this.f2376d = Collections.unmodifiableList(arrayList);
            this.f2377e = 2;
            this.f2378f = 2;
        }

        /* JADX WARNING: type inference failed for: r6v9, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$u>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v5, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$u>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v11, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final void a(b0 b0Var, boolean z) {
            RecyclerView.k(b0Var);
            View view = b0Var.f2311a;
            x xVar = RecyclerView.this.C0;
            if (xVar != null) {
                x.a aVar = xVar.f2594e;
                n0.x.p(view, aVar instanceof x.a ? (n0.a) aVar.f2596e.remove(view) : null);
            }
            if (z) {
                u uVar = RecyclerView.this.C;
                if (uVar != null) {
                    uVar.a();
                }
                int size = RecyclerView.this.D.size();
                for (int i = 0; i < size; i++) {
                    ((u) RecyclerView.this.D.get(i)).a();
                }
                RecyclerView recyclerView = RecyclerView.this;
                f fVar = recyclerView.A;
                if (recyclerView.f2294v0 != null) {
                    recyclerView.f2291u.f(b0Var);
                }
            }
            b0Var.f2327s = null;
            b0Var.f2326r = null;
            s d10 = d();
            Objects.requireNonNull(d10);
            int i10 = b0Var.f2316f;
            ArrayList<b0> arrayList = d10.a(i10).f2369a;
            if (d10.f2367a.get(i10).f2370b > arrayList.size()) {
                b0Var.q();
                arrayList.add(b0Var);
            }
        }

        public final void b() {
            this.f2373a.clear();
            e();
        }

        public final int c(int i) {
            if (i < 0 || i >= RecyclerView.this.f2294v0.b()) {
                StringBuilder d10 = a8.a.d("invalid position ", i, ". State item count is ");
                d10.append(RecyclerView.this.f2294v0.b());
                throw new IndexOutOfBoundsException(android.support.v4.media.a.c(RecyclerView.this, d10));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f2294v0.g) {
                return i;
            }
            return recyclerView.f2287s.f(i, 0);
        }

        public final s d() {
            if (this.g == null) {
                this.g = new s();
            }
            return this.g;
        }

        public final void e() {
            for (int size = this.f2375c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.f2375c.clear();
            int[] iArr = RecyclerView.P0;
            m.b bVar = RecyclerView.this.f2292u0;
            int[] iArr2 = bVar.f2563c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f2564d = 0;
        }

        public final void f(int i) {
            a(this.f2375c.get(i), true);
            this.f2375c.remove(i);
        }

        public final void g(View view) {
            b0 K = RecyclerView.K(view);
            if (K.n()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (K.m()) {
                K.u();
            } else if (K.v()) {
                K.d();
            }
            h(K);
            if (RecyclerView.this.f2272d0 != null && !K.k()) {
                RecyclerView.this.f2272d0.e(K);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(androidx.recyclerview.widget.RecyclerView.b0 r7) {
            /*
                r6 = this;
                boolean r0 = r7.m()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x00d1
                android.view.View r0 = r7.f2311a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00d1
            L_0x0012:
                boolean r0 = r7.n()
                if (r0 != 0) goto L_0x00b8
                boolean r0 = r7.t()
                if (r0 != 0) goto L_0x00a6
                int r0 = r7.f2318j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                android.view.View r0 = r7.f2311a
                java.util.WeakHashMap<android.view.View, n0.a0> r3 = n0.x.f8842a
                boolean r0 = n0.x.d.i(r0)
                if (r0 == 0) goto L_0x0030
                r0 = r2
                goto L_0x0031
            L_0x0030:
                r0 = r1
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r3 = r3.A
                boolean r3 = r7.k()
                if (r3 == 0) goto L_0x0092
                int r3 = r6.f2378f
                if (r3 <= 0) goto L_0x0088
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r7.g(r3)
                if (r3 != 0) goto L_0x0088
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r3 = r6.f2375c
                int r3 = r3.size()
                int r4 = r6.f2378f
                if (r3 < r4) goto L_0x0058
                if (r3 <= 0) goto L_0x0058
                r6.f(r1)
                int r3 = r3 + -1
            L_0x0058:
                int[] r4 = androidx.recyclerview.widget.RecyclerView.P0
                if (r3 <= 0) goto L_0x0081
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.m$b r4 = r4.f2292u0
                int r5 = r7.f2313c
                boolean r4 = r4.c(r5)
                if (r4 != 0) goto L_0x0081
            L_0x0068:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x0080
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r4 = r6.f2375c
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$b0 r4 = (androidx.recyclerview.widget.RecyclerView.b0) r4
                int r4 = r4.f2313c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.m$b r5 = r5.f2292u0
                boolean r4 = r5.c(r4)
                if (r4 != 0) goto L_0x0068
            L_0x0080:
                int r3 = r3 + r2
            L_0x0081:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r4 = r6.f2375c
                r4.add(r3, r7)
                r3 = r2
                goto L_0x0089
            L_0x0088:
                r3 = r1
            L_0x0089:
                if (r3 != 0) goto L_0x008f
                r6.a(r7, r2)
                r1 = r2
            L_0x008f:
                r2 = r1
                r1 = r3
                goto L_0x0093
            L_0x0092:
                r2 = r1
            L_0x0093:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c0 r3 = r3.f2291u
                r3.f(r7)
                if (r1 != 0) goto L_0x00a5
                if (r2 != 0) goto L_0x00a5
                if (r0 == 0) goto L_0x00a5
                r0 = 0
                r7.f2327s = r0
                r7.f2326r = r0
            L_0x00a5:
                return
            L_0x00a6:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = a.a.d(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = android.support.v4.media.a.c(r1, r0)
                r7.<init>(r0)
                throw r7
            L_0x00b8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r7)
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r7 = android.support.v4.media.a.c(r7, r1)
                r0.<init>(r7)
                throw r0
            L_0x00d1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r3 = a.a.d(r3)
                boolean r4 = r7.m()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r7 = r7.f2311a
                android.view.ViewParent r7 = r7.getParent()
                if (r7 == 0) goto L_0x00ee
                r1 = r2
            L_0x00ee:
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r7 = android.support.v4.media.a.c(r7, r3)
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.h(androidx.recyclerview.widget.RecyclerView$b0):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$b0 r5 = androidx.recyclerview.widget.RecyclerView.K(r5)
                r0 = 12
                boolean r0 = r5.g(r0)
                r1 = 0
                if (r0 != 0) goto L_0x0058
                boolean r0 = r5.o()
                if (r0 == 0) goto L_0x0058
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$k r0 = r0.f2272d0
                r2 = 1
                if (r0 == 0) goto L_0x003f
                java.util.List r3 = r5.f()
                androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0039
                boolean r0 = r0.g
                if (r0 == 0) goto L_0x0033
                boolean r0 = r5.j()
                if (r0 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r0 = r1
                goto L_0x0034
            L_0x0033:
                r0 = r2
            L_0x0034:
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r0 = r1
                goto L_0x003a
            L_0x0039:
                r0 = r2
            L_0x003a:
                if (r0 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = r1
                goto L_0x0040
            L_0x003f:
                r0 = r2
            L_0x0040:
                if (r0 == 0) goto L_0x0043
                goto L_0x0058
            L_0x0043:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r4.f2374b
                if (r0 != 0) goto L_0x004e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f2374b = r0
            L_0x004e:
                r5.f2322n = r4
                r5.f2323o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r4.f2374b
                r0.add(r5)
                goto L_0x0088
            L_0x0058:
                boolean r0 = r5.j()
                if (r0 == 0) goto L_0x007f
                boolean r0 = r5.l()
                if (r0 != 0) goto L_0x007f
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r0 = r0.A
                boolean r0 = r0.f2331b
                if (r0 == 0) goto L_0x006d
                goto L_0x007f
            L_0x006d:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = a.a.d(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = android.support.v4.media.a.c(r1, r0)
                r5.<init>(r0)
                throw r5
            L_0x007f:
                r5.f2322n = r4
                r5.f2323o = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r4.f2373a
                r0.add(r5)
            L_0x0088:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.i(android.view.View):void");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        /* JADX WARNING: type inference failed for: r3v27, types: [java.util.List<java.lang.Object>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r8v9, types: [java.util.List<android.view.View>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r10v20, types: [java.util.List<android.view.View>, java.util.ArrayList] */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x02ef, code lost:
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x044f, code lost:
            if (r7.j() == false) goto L_0x0487;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x0485, code lost:
            if ((r10 == 0 || r10 + r8 < r20) == false) goto L_0x0487;
         */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0241  */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x0410  */
        /* JADX WARNING: Removed duplicated region for block: B:214:0x0438  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x043b  */
        /* JADX WARNING: Removed duplicated region for block: B:282:0x0556  */
        /* JADX WARNING: Removed duplicated region for block: B:283:0x0564  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.b0 j(int r19, long r20) {
            /*
                r18 = this;
                r1 = r18
                r0 = r19
                if (r0 < 0) goto L_0x0586
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r2 = r2.f2294v0
                int r2 = r2.b()
                if (r0 >= r2) goto L_0x0586
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r2 = r2.f2294v0
                boolean r2 = r2.g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r1.f2374b
                if (r2 == 0) goto L_0x0086
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0027
                goto L_0x0086
            L_0x0027:
                r6 = r5
            L_0x0028:
                if (r6 >= r2) goto L_0x0045
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r7 = r1.f2374b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$b0 r7 = (androidx.recyclerview.widget.RecyclerView.b0) r7
                boolean r8 = r7.v()
                if (r8 != 0) goto L_0x0042
                int r8 = r7.e()
                if (r8 != r0) goto L_0x0042
                r7.b(r3)
                goto L_0x0087
            L_0x0042:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x0045:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r7 = r6.A
                boolean r7 = r7.f2331b
                if (r7 == 0) goto L_0x0086
                androidx.recyclerview.widget.a r6 = r6.f2287s
                int r6 = r6.f(r0, r5)
                if (r6 <= 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r7 = r7.A
                int r7 = r7.a()
                if (r6 >= r7) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r7 = r7.A
                long r6 = r7.b(r6)
                r8 = r5
            L_0x0068:
                if (r8 >= r2) goto L_0x0086
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r9 = r1.f2374b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$b0 r9 = (androidx.recyclerview.widget.RecyclerView.b0) r9
                boolean r10 = r9.v()
                if (r10 != 0) goto L_0x0083
                long r10 = r9.f2315e
                int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r10 != 0) goto L_0x0083
                r9.b(r3)
                r7 = r9
                goto L_0x0087
            L_0x0083:
                int r8 = r8 + 1
                goto L_0x0068
            L_0x0086:
                r7 = r4
            L_0x0087:
                if (r7 == 0) goto L_0x008c
                r2 = 1
                goto L_0x008d
            L_0x008b:
                r7 = r4
            L_0x008c:
                r2 = r5
            L_0x008d:
                r6 = -1
                if (r7 != 0) goto L_0x023e
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r7 = r1.f2373a
                int r7 = r7.size()
                r8 = r5
            L_0x0097:
                if (r8 >= r7) goto L_0x00c9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r9 = r1.f2373a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$b0 r9 = (androidx.recyclerview.widget.RecyclerView.b0) r9
                boolean r10 = r9.v()
                if (r10 != 0) goto L_0x00c6
                int r10 = r9.e()
                if (r10 != r0) goto L_0x00c6
                boolean r10 = r9.j()
                if (r10 != 0) goto L_0x00c6
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r10 = r10.f2294v0
                boolean r10 = r10.g
                if (r10 != 0) goto L_0x00c1
                boolean r10 = r9.l()
                if (r10 != 0) goto L_0x00c6
            L_0x00c1:
                r9.b(r3)
                goto L_0x01ae
            L_0x00c6:
                int r8 = r8 + 1
                goto L_0x0097
            L_0x00c9:
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r7 = r7.f2289t
                java.util.List<android.view.View> r8 = r7.f2461c
                int r8 = r8.size()
                r9 = r5
            L_0x00d4:
                if (r9 >= r8) goto L_0x00ff
                java.util.List<android.view.View> r10 = r7.f2461c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                androidx.recyclerview.widget.b$b r11 = r7.f2459a
                androidx.recyclerview.widget.v r11 = (androidx.recyclerview.widget.v) r11
                java.util.Objects.requireNonNull(r11)
                androidx.recyclerview.widget.RecyclerView$b0 r11 = androidx.recyclerview.widget.RecyclerView.K(r10)
                int r12 = r11.e()
                if (r12 != r0) goto L_0x00fc
                boolean r12 = r11.j()
                if (r12 != 0) goto L_0x00fc
                boolean r11 = r11.l()
                if (r11 != 0) goto L_0x00fc
                goto L_0x0100
            L_0x00fc:
                int r9 = r9 + 1
                goto L_0x00d4
            L_0x00ff:
                r10 = r4
            L_0x0100:
                if (r10 == 0) goto L_0x0186
                androidx.recyclerview.widget.RecyclerView$b0 r7 = androidx.recyclerview.widget.RecyclerView.K(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r8 = r8.f2289t
                androidx.recyclerview.widget.b$b r9 = r8.f2459a
                androidx.recyclerview.widget.v r9 = (androidx.recyclerview.widget.v) r9
                int r9 = r9.c(r10)
                if (r9 < 0) goto L_0x016f
                androidx.recyclerview.widget.b$a r11 = r8.f2460b
                boolean r11 = r11.d(r9)
                if (r11 == 0) goto L_0x0158
                androidx.recyclerview.widget.b$a r11 = r8.f2460b
                r11.a(r9)
                r8.l(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r8 = r8.f2289t
                int r8 = r8.j(r10)
                if (r8 == r6) goto L_0x013f
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r9 = r9.f2289t
                r9.c(r8)
                r1.i(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.b(r8)
                goto L_0x01b4
            L_0x013f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = android.support.v4.media.a.c(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x0158:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x016f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0186:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r7 = r1.f2375c
                int r7 = r7.size()
                r8 = r5
            L_0x018d:
                if (r8 >= r7) goto L_0x01b3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r9 = r1.f2375c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$b0 r9 = (androidx.recyclerview.widget.RecyclerView.b0) r9
                boolean r10 = r9.j()
                if (r10 != 0) goto L_0x01b0
                int r10 = r9.e()
                if (r10 != r0) goto L_0x01b0
                boolean r10 = r9.h()
                if (r10 != 0) goto L_0x01b0
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r7 = r1.f2375c
                r7.remove(r8)
            L_0x01ae:
                r7 = r9
                goto L_0x01b4
            L_0x01b0:
                int r8 = r8 + 1
                goto L_0x018d
            L_0x01b3:
                r7 = r4
            L_0x01b4:
                if (r7 == 0) goto L_0x023e
                boolean r8 = r7.l()
                if (r8 == 0) goto L_0x01c3
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r8 = r8.f2294v0
                boolean r8 = r8.g
                goto L_0x01fe
            L_0x01c3:
                int r8 = r7.f2313c
                if (r8 < 0) goto L_0x0225
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r9 = r9.A
                int r9 = r9.a()
                if (r8 >= r9) goto L_0x0225
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r9 = r8.f2294v0
                boolean r9 = r9.g
                if (r9 != 0) goto L_0x01e6
                androidx.recyclerview.widget.RecyclerView$f r8 = r8.A
                int r9 = r7.f2313c
                int r8 = r8.c(r9)
                int r9 = r7.f2316f
                if (r8 == r9) goto L_0x01e6
                goto L_0x01fb
            L_0x01e6:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r8 = r8.A
                boolean r9 = r8.f2331b
                if (r9 == 0) goto L_0x01fd
                long r9 = r7.f2315e
                int r11 = r7.f2313c
                long r11 = r8.b(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x01fb
                goto L_0x01fd
            L_0x01fb:
                r8 = r5
                goto L_0x01fe
            L_0x01fd:
                r8 = 1
            L_0x01fe:
                if (r8 != 0) goto L_0x0223
                r8 = 4
                r7.b(r8)
                boolean r8 = r7.m()
                if (r8 == 0) goto L_0x0215
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.f2311a
                r8.removeDetachedView(r9, r5)
                r7.u()
                goto L_0x021e
            L_0x0215:
                boolean r8 = r7.v()
                if (r8 == 0) goto L_0x021e
                r7.d()
            L_0x021e:
                r1.h(r7)
                r7 = r4
                goto L_0x023e
            L_0x0223:
                r2 = 1
                goto L_0x023e
            L_0x0225:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = android.support.v4.media.a.c(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x023e:
                r8 = 2
                if (r7 != 0) goto L_0x03f3
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r11 = r11.f2287s
                int r11 = r11.f(r0, r5)
                if (r11 < 0) goto L_0x03c2
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r12 = r12.A
                int r12 = r12.a()
                if (r11 >= r12) goto L_0x03c2
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r12 = r12.A
                int r12 = r12.c(r11)
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r13 = r13.A
                boolean r14 = r13.f2331b
                if (r14 == 0) goto L_0x02f5
                long r13 = r13.b(r11)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r7 = r1.f2373a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x0270:
                if (r7 < 0) goto L_0x02c1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r15 = r1.f2373a
                java.lang.Object r15 = r15.get(r7)
                androidx.recyclerview.widget.RecyclerView$b0 r15 = (androidx.recyclerview.widget.RecyclerView.b0) r15
                long r9 = r15.f2315e
                int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r9 != 0) goto L_0x02be
                boolean r9 = r15.v()
                if (r9 != 0) goto L_0x02be
                int r9 = r15.f2316f
                if (r12 != r9) goto L_0x02a2
                r15.b(r3)
                boolean r3 = r15.l()
                if (r3 == 0) goto L_0x02a0
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r3 = r3.f2294v0
                boolean r3 = r3.g
                if (r3 != 0) goto L_0x02a0
                r3 = 14
                r15.r(r8, r3)
            L_0x02a0:
                r7 = r15
                goto L_0x02f0
            L_0x02a2:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r9 = r1.f2373a
                r9.remove(r7)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r10 = r15.f2311a
                r9.removeDetachedView(r10, r5)
                android.view.View r9 = r15.f2311a
                androidx.recyclerview.widget.RecyclerView$b0 r9 = androidx.recyclerview.widget.RecyclerView.K(r9)
                r9.f2322n = r4
                r9.f2323o = r5
                r9.d()
                r1.h(r9)
            L_0x02be:
                int r7 = r7 + -1
                goto L_0x0270
            L_0x02c1:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r3 = r1.f2375c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02c8:
                if (r3 < 0) goto L_0x02ef
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r7 = r1.f2375c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$b0 r7 = (androidx.recyclerview.widget.RecyclerView.b0) r7
                long r9 = r7.f2315e
                int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r9 != 0) goto L_0x02ec
                boolean r9 = r7.h()
                if (r9 != 0) goto L_0x02ec
                int r9 = r7.f2316f
                if (r12 != r9) goto L_0x02e8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r9 = r1.f2375c
                r9.remove(r3)
                goto L_0x02f0
            L_0x02e8:
                r1.f(r3)
                goto L_0x02ef
            L_0x02ec:
                int r3 = r3 + -1
                goto L_0x02c8
            L_0x02ef:
                r7 = r4
            L_0x02f0:
                if (r7 == 0) goto L_0x02f5
                r7.f2313c = r11
                r2 = 1
            L_0x02f5:
                if (r7 != 0) goto L_0x0335
                androidx.recyclerview.widget.RecyclerView$s r3 = r18.d()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$s$a> r3 = r3.f2367a
                java.lang.Object r3 = r3.get(r12)
                androidx.recyclerview.widget.RecyclerView$s$a r3 = (androidx.recyclerview.widget.RecyclerView.s.a) r3
                if (r3 == 0) goto L_0x032c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r7 = r3.f2369a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x032c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r3 = r3.f2369a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x0314:
                if (r7 < 0) goto L_0x032c
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$b0 r6 = (androidx.recyclerview.widget.RecyclerView.b0) r6
                boolean r6 = r6.h()
                if (r6 != 0) goto L_0x0329
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$b0 r3 = (androidx.recyclerview.widget.RecyclerView.b0) r3
                goto L_0x032d
            L_0x0329:
                int r7 = r7 + -1
                goto L_0x0314
            L_0x032c:
                r3 = r4
            L_0x032d:
                if (r3 == 0) goto L_0x0334
                r3.q()
                int[] r6 = androidx.recyclerview.widget.RecyclerView.P0
            L_0x0334:
                r7 = r3
            L_0x0335:
                if (r7 != 0) goto L_0x03f3
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
                if (r3 == 0) goto L_0x0360
                androidx.recyclerview.widget.RecyclerView$s r3 = r1.g
                androidx.recyclerview.widget.RecyclerView$s$a r3 = r3.a(r12)
                long r9 = r3.f2371c
                r13 = 0
                int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r3 == 0) goto L_0x035c
                long r9 = r9 + r6
                int r3 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
                if (r3 >= 0) goto L_0x035a
                goto L_0x035c
            L_0x035a:
                r3 = r5
                goto L_0x035d
            L_0x035c:
                r3 = 1
            L_0x035d:
                if (r3 != 0) goto L_0x0360
                return r4
            L_0x0360:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r9 = r3.A
                java.util.Objects.requireNonNull(r9)
                java.lang.String r10 = "RV CreateView"
                int r11 = j0.i.f6985a     // Catch:{ all -> 0x03bb }
                android.os.Trace.beginSection(r10)     // Catch:{ all -> 0x03bb }
                androidx.recyclerview.widget.RecyclerView$b0 r3 = r9.h(r3, r12)     // Catch:{ all -> 0x03bb }
                android.view.View r9 = r3.f2311a     // Catch:{ all -> 0x03bb }
                android.view.ViewParent r9 = r9.getParent()     // Catch:{ all -> 0x03bb }
                if (r9 != 0) goto L_0x03b3
                r3.f2316f = r12     // Catch:{ all -> 0x03bb }
                android.os.Trace.endSection()
                int[] r9 = androidx.recyclerview.widget.RecyclerView.P0
                android.view.View r9 = r3.f2311a
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.F(r9)
                if (r9 == 0) goto L_0x0390
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r9)
                r3.f2312b = r10
            L_0x0390:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                long r9 = r9.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$s r11 = r1.g
                long r9 = r9 - r6
                androidx.recyclerview.widget.RecyclerView$s$a r6 = r11.a(r12)
                long r11 = r6.f2371c
                r13 = 0
                int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r7 != 0) goto L_0x03a6
                goto L_0x03af
            L_0x03a6:
                r13 = 4
                long r11 = r11 / r13
                r16 = 3
                long r11 = r11 * r16
                long r9 = r9 / r13
                long r9 = r9 + r11
            L_0x03af:
                r6.f2371c = r9
                r7 = r3
                goto L_0x03f3
            L_0x03b3:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03bb }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03bb }
                throw r0     // Catch:{ all -> 0x03bb }
            L_0x03bb:
                r0 = move-exception
                int r2 = j0.i.f6985a
                android.os.Trace.endSection()
                throw r0
            L_0x03c2:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "(offset:"
                r3.append(r0)
                r3.append(r11)
                java.lang.String r0 = ").state:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.f2294v0
                int r0 = r0.b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = android.support.v4.media.a.c(r0, r3)
                r2.<init>(r0)
                throw r2
            L_0x03f3:
                if (r2 == 0) goto L_0x042a
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r3 = r3.f2294v0
                boolean r3 = r3.g
                if (r3 != 0) goto L_0x042a
                r3 = 8192(0x2000, float:1.14794E-41)
                boolean r6 = r7.g(r3)
                if (r6 == 0) goto L_0x042a
                r7.r(r5, r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r3 = r3.f2294v0
                boolean r3 = r3.f2402j
                if (r3 == 0) goto L_0x042a
                androidx.recyclerview.widget.RecyclerView.k.b(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$k r3 = r3.f2272d0
                r7.f()
                java.util.Objects.requireNonNull(r3)
                androidx.recyclerview.widget.RecyclerView$k$c r3 = new androidx.recyclerview.widget.RecyclerView$k$c
                r3.<init>()
                r3.a(r7)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r6.Y(r7, r3)
            L_0x042a:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r3 = r3.f2294v0
                boolean r3 = r3.g
                if (r3 == 0) goto L_0x043b
                boolean r3 = r7.i()
                if (r3 == 0) goto L_0x043b
                r7.g = r0
                goto L_0x0487
            L_0x043b:
                boolean r3 = r7.i()
                if (r3 == 0) goto L_0x0451
                int r3 = r7.f2318j
                r3 = r3 & r8
                if (r3 == 0) goto L_0x0448
                r3 = 1
                goto L_0x0449
            L_0x0448:
                r3 = r5
            L_0x0449:
                if (r3 != 0) goto L_0x0451
                boolean r3 = r7.j()
                if (r3 == 0) goto L_0x0487
            L_0x0451:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r3 = r3.f2287s
                int r3 = r3.f(r0, r5)
                r7.f2327s = r4
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r7.f2326r = r4
                int r6 = r7.f2316f
                long r8 = r4.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
                if (r4 == 0) goto L_0x048b
                androidx.recyclerview.widget.RecyclerView$s r4 = r1.g
                androidx.recyclerview.widget.RecyclerView$s$a r4 = r4.a(r6)
                long r10 = r4.f2372d
                r12 = 0
                int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r4 == 0) goto L_0x0484
                long r10 = r10 + r8
                int r4 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
                if (r4 >= 0) goto L_0x0482
                goto L_0x0484
            L_0x0482:
                r4 = r5
                goto L_0x0485
            L_0x0484:
                r4 = 1
            L_0x0485:
                if (r4 != 0) goto L_0x048b
            L_0x0487:
                r0 = 1
                r3 = r5
                goto L_0x054e
            L_0x048b:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r4 = r4.A
                java.util.Objects.requireNonNull(r4)
                androidx.recyclerview.widget.RecyclerView$f<? extends androidx.recyclerview.widget.RecyclerView$b0> r6 = r7.f2327s
                if (r6 != 0) goto L_0x0498
                r6 = 1
                goto L_0x0499
            L_0x0498:
                r6 = r5
            L_0x0499:
                if (r6 == 0) goto L_0x04b4
                r7.f2313c = r3
                boolean r10 = r4.f2331b
                if (r10 == 0) goto L_0x04a7
                long r10 = r4.b(r3)
                r7.f2315e = r10
            L_0x04a7:
                r10 = 519(0x207, float:7.27E-43)
                r11 = 1
                r7.r(r11, r10)
                int r10 = j0.i.f6985a
                java.lang.String r10 = "RV OnBindView"
                android.os.Trace.beginSection(r10)
            L_0x04b4:
                r7.f2327s = r4
                r7.f()
                r4.g(r7, r3)
                if (r6 == 0) goto L_0x04df
                java.util.List<java.lang.Object> r3 = r7.f2319k
                if (r3 == 0) goto L_0x04c5
                r3.clear()
            L_0x04c5:
                int r3 = r7.f2318j
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f2318j = r3
                android.view.View r3 = r7.f2311a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof androidx.recyclerview.widget.RecyclerView.o
                if (r4 == 0) goto L_0x04da
                androidx.recyclerview.widget.RecyclerView$o r3 = (androidx.recyclerview.widget.RecyclerView.o) r3
                r4 = 1
                r3.f2365c = r4
            L_0x04da:
                int r3 = j0.i.f6985a
                android.os.Trace.endSection()
            L_0x04df:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r3 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$s r6 = r1.g
                int r10 = r7.f2316f
                long r3 = r3 - r8
                androidx.recyclerview.widget.RecyclerView$s$a r6 = r6.a(r10)
                long r8 = r6.f2372d
                r10 = 0
                int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r10 != 0) goto L_0x04f7
                goto L_0x04ff
            L_0x04f7:
                r10 = 4
                long r8 = r8 / r10
                r12 = 3
                long r8 = r8 * r12
                long r3 = r3 / r10
                long r3 = r3 + r8
            L_0x04ff:
                r6.f2372d = r3
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.accessibility.AccessibilityManager r3 = r3.Q
                if (r3 == 0) goto L_0x050f
                boolean r3 = r3.isEnabled()
                if (r3 == 0) goto L_0x050f
                r3 = 1
                goto L_0x0510
            L_0x050f:
                r3 = r5
            L_0x0510:
                if (r3 == 0) goto L_0x0542
                android.view.View r3 = r7.f2311a
                java.util.WeakHashMap<android.view.View, n0.a0> r4 = n0.x.f8842a
                int r4 = n0.x.d.c(r3)
                r6 = 1
                if (r4 != 0) goto L_0x0520
                n0.x.d.s(r3, r6)
            L_0x0520:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.x r4 = r4.C0
                if (r4 != 0) goto L_0x0527
                goto L_0x0540
            L_0x0527:
                androidx.recyclerview.widget.x$a r4 = r4.f2594e
                boolean r8 = r4 instanceof androidx.recyclerview.widget.x.a
                if (r8 == 0) goto L_0x053d
                java.util.Objects.requireNonNull(r4)
                n0.a r8 = n0.x.e(r3)
                if (r8 == 0) goto L_0x053d
                if (r8 == r4) goto L_0x053d
                java.util.Map<android.view.View, n0.a> r9 = r4.f2596e
                r9.put(r3, r8)
            L_0x053d:
                n0.x.p(r3, r4)
            L_0x0540:
                r3 = r6
                goto L_0x0543
            L_0x0542:
                r3 = 1
            L_0x0543:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r4 = r4.f2294v0
                boolean r4 = r4.g
                if (r4 == 0) goto L_0x054d
                r7.g = r0
            L_0x054d:
                r0 = r3
            L_0x054e:
                android.view.View r4 = r7.f2311a
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                if (r4 != 0) goto L_0x0564
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r4.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$o r4 = (androidx.recyclerview.widget.RecyclerView.o) r4
                android.view.View r6 = r7.f2311a
                r6.setLayoutParams(r4)
                goto L_0x057c
            L_0x0564:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                boolean r6 = r6.checkLayoutParams(r4)
                if (r6 != 0) goto L_0x057a
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r4)
                androidx.recyclerview.widget.RecyclerView$o r4 = (androidx.recyclerview.widget.RecyclerView.o) r4
                android.view.View r6 = r7.f2311a
                r6.setLayoutParams(r4)
                goto L_0x057c
            L_0x057a:
                androidx.recyclerview.widget.RecyclerView$o r4 = (androidx.recyclerview.widget.RecyclerView.o) r4
            L_0x057c:
                r4.f2363a = r7
                if (r2 == 0) goto L_0x0583
                if (r3 == 0) goto L_0x0583
                r5 = r0
            L_0x0583:
                r4.f2366d = r5
                return r7
            L_0x0586:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.f2294v0
                int r0 = r0.b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = android.support.v4.media.a.c(r0, r3)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.j(int, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        public final void k(b0 b0Var) {
            if (b0Var.f2323o) {
                this.f2374b.remove(b0Var);
            } else {
                this.f2373a.remove(b0Var);
            }
            b0Var.f2322n = null;
            b0Var.f2323o = false;
            b0Var.d();
        }

        public final void l() {
            n nVar = RecyclerView.this.B;
            this.f2378f = this.f2377e + (nVar != null ? nVar.f2351l : 0);
            for (int size = this.f2375c.size() - 1; size >= 0 && this.f2375c.size() > this.f2378f; size--) {
                f(size);
            }
        }
    }

    public interface u {
        void a();
    }

    public class v extends h {
        public v() {
        }

        public final void a() {
            RecyclerView.this.i((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2294v0.f2400f = true;
            recyclerView.X(true);
            if (!RecyclerView.this.f2287s.g()) {
                RecyclerView.this.requestLayout();
            }
        }

        public final void b(int i) {
            RecyclerView.this.i((String) null);
            a aVar = RecyclerView.this.f2287s;
            Objects.requireNonNull(aVar);
            aVar.f2446b.add(aVar.h(4, i, 1, (Object) null));
            aVar.f2450f |= 4;
            if (aVar.f2446b.size() == 1) {
                int[] iArr = RecyclerView.P0;
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.I || !recyclerView.H) {
                    recyclerView.P = true;
                    recyclerView.requestLayout();
                    return;
                }
                a aVar2 = recyclerView.f2295w;
                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
                x.d.m(recyclerView, aVar2);
            }
        }
    }

    public static abstract class x {

        /* renamed from: a  reason: collision with root package name */
        public int f2382a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f2383b;

        /* renamed from: c  reason: collision with root package name */
        public n f2384c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2385d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2386e;

        /* renamed from: f  reason: collision with root package name */
        public View f2387f;
        public final a g = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f2388h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f2389a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f2390b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f2391c = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

            /* renamed from: d  reason: collision with root package name */
            public int f2392d = -1;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f2393e = null;

            /* renamed from: f  reason: collision with root package name */
            public boolean f2394f = false;
            public int g = 0;

            public final void a(RecyclerView recyclerView) {
                int i = this.f2392d;
                if (i >= 0) {
                    this.f2392d = -1;
                    recyclerView.P(i);
                    this.f2394f = false;
                } else if (this.f2394f) {
                    Interpolator interpolator = this.f2393e;
                    if (interpolator == null || this.f2391c >= 1) {
                        int i10 = this.f2391c;
                        if (i10 >= 1) {
                            recyclerView.f2288s0.b(this.f2389a, this.f2390b, i10, interpolator);
                            int i11 = this.g + 1;
                            this.g = i11;
                            if (i11 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f2394f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.g = 0;
                }
            }

            public final void b(int i, int i10, int i11, Interpolator interpolator) {
                this.f2389a = i;
                this.f2390b = i10;
                this.f2391c = i11;
                this.f2393e = interpolator;
                this.f2394f = true;
            }
        }

        public interface b {
            PointF a(int i);
        }

        public final PointF a(int i) {
            n nVar = this.f2384c;
            if (nVar instanceof b) {
                return ((b) nVar).a(i);
            }
            StringBuilder d10 = a.a.d("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            d10.append(b.class.getCanonicalName());
            Log.w("RecyclerView", d10.toString());
            return null;
        }

        public final void b(int i, int i10) {
            PointF a10;
            RecyclerView recyclerView = this.f2383b;
            int i11 = -1;
            if (this.f2382a == -1 || recyclerView == null) {
                d();
            }
            if (this.f2385d && this.f2387f == null && this.f2384c != null && (a10 = a(this.f2382a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.d0((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            boolean z = false;
            this.f2385d = false;
            View view = this.f2387f;
            if (view != null) {
                Objects.requireNonNull(this.f2383b);
                b0 K = RecyclerView.K(view);
                if (K != null) {
                    i11 = K.e();
                }
                if (i11 == this.f2382a) {
                    View view2 = this.f2387f;
                    y yVar = recyclerView.f2294v0;
                    c(view2, this.g);
                    this.g.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2387f = null;
                }
            }
            if (this.f2386e) {
                y yVar2 = recyclerView.f2294v0;
                a aVar = this.g;
                o oVar = (o) this;
                if (oVar.f2383b.B.x() == 0) {
                    oVar.d();
                } else {
                    int i12 = oVar.f2582o;
                    int i13 = i12 - i;
                    if (i12 * i13 <= 0) {
                        i13 = 0;
                    }
                    oVar.f2582o = i13;
                    int i14 = oVar.f2583p;
                    int i15 = i14 - i10;
                    if (i14 * i15 <= 0) {
                        i15 = 0;
                    }
                    oVar.f2583p = i15;
                    if (i13 == 0 && i15 == 0) {
                        PointF a11 = oVar.a(oVar.f2382a);
                        if (a11 != null) {
                            float f11 = a11.x;
                            if (!(f11 == 0.0f && a11.y == 0.0f)) {
                                float f12 = a11.y;
                                float sqrt = (float) Math.sqrt((double) ((f12 * f12) + (f11 * f11)));
                                float f13 = a11.x / sqrt;
                                a11.x = f13;
                                float f14 = a11.y / sqrt;
                                a11.y = f14;
                                oVar.f2578k = a11;
                                oVar.f2582o = (int) (f13 * 10000.0f);
                                oVar.f2583p = (int) (f14 * 10000.0f);
                                aVar.b((int) (((float) oVar.f2582o) * 1.2f), (int) (((float) oVar.f2583p) * 1.2f), (int) (((float) oVar.g(10000)) * 1.2f), oVar.i);
                            }
                        }
                        aVar.f2392d = oVar.f2382a;
                        oVar.d();
                    }
                }
                a aVar2 = this.g;
                if (aVar2.f2392d >= 0) {
                    z = true;
                }
                aVar2.a(recyclerView);
                if (z && this.f2386e) {
                    this.f2385d = true;
                    recyclerView.f2288s0.a();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (this.f2386e) {
                this.f2386e = false;
                o oVar = (o) this;
                oVar.f2583p = 0;
                oVar.f2582o = 0;
                oVar.f2578k = null;
                this.f2383b.f2294v0.f2395a = -1;
                this.f2387f = null;
                this.f2382a = -1;
                this.f2385d = false;
                n nVar = this.f2384c;
                if (nVar.g == this) {
                    nVar.g = null;
                }
                this.f2384c = null;
                this.f2383b = null;
            }
        }
    }

    public static class y {

        /* renamed from: a  reason: collision with root package name */
        public int f2395a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f2396b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2397c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2398d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f2399e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2400f = false;
        public boolean g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2401h = false;
        public boolean i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2402j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2403k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f2404l;

        /* renamed from: m  reason: collision with root package name */
        public long f2405m;

        /* renamed from: n  reason: collision with root package name */
        public int f2406n;

        public final void a(int i10) {
            if ((this.f2398d & i10) == 0) {
                StringBuilder d10 = a.a.d("Layout state should be one of ");
                d10.append(Integer.toBinaryString(i10));
                d10.append(" but it is ");
                d10.append(Integer.toBinaryString(this.f2398d));
                throw new IllegalStateException(d10.toString());
            }
        }

        public final int b() {
            if (this.g) {
                return this.f2396b - this.f2397c;
            }
            return this.f2399e;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("State{mTargetPosition=");
            d10.append(this.f2395a);
            d10.append(", mData=");
            d10.append((Object) null);
            d10.append(", mItemCount=");
            d10.append(this.f2399e);
            d10.append(", mIsMeasuring=");
            d10.append(this.i);
            d10.append(", mPreviousLayoutItemCount=");
            d10.append(this.f2396b);
            d10.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            d10.append(this.f2397c);
            d10.append(", mStructureChanged=");
            d10.append(this.f2400f);
            d10.append(", mInPreLayout=");
            d10.append(this.g);
            d10.append(", mRunSimpleAnimations=");
            d10.append(this.f2402j);
            d10.append(", mRunPredictiveAnimations=");
            d10.append(this.f2403k);
            d10.append(MessageFormatter.DELIM_STOP);
            return d10.toString();
        }
    }

    public static abstract class z {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            P0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r0
            r2 = 3
            r1[r2] = r0
            Q0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            R0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static RecyclerView F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView F2 = F(viewGroup.getChildAt(i10));
            if (F2 != null) {
                return F2;
            }
        }
        return null;
    }

    public static b0 K(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).f2363a;
    }

    private n0.j getScrollingChildHelper() {
        if (this.F0 == null) {
            this.F0 = new n0.j(this);
        }
        return this.F0;
    }

    public static void k(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.f2312b;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != b0Var.f2311a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            b0Var.f2312b = null;
        }
    }

    public final String A() {
        StringBuilder d10 = a.a.d(" ");
        d10.append(super.toString());
        d10.append(", adapter:");
        d10.append(this.A);
        d10.append(", layout:");
        d10.append(this.B);
        d10.append(", context:");
        d10.append(getContext());
        return d10.toString();
    }

    public final void B(y yVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f2288s0.f2304c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            Objects.requireNonNull(yVar);
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        Objects.requireNonNull(yVar);
    }

    public final View C(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.F.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar = this.F.get(i10);
            if (!qVar.b(motionEvent) || action == 3) {
                i10++;
            } else {
                this.G = qVar;
                return true;
            }
        }
        return false;
    }

    public final void E(int[] iArr) {
        int e10 = this.f2289t.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i11 = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        for (int i12 = 0; i12 < e10; i12++) {
            b0 K2 = K(this.f2289t.d(i12));
            if (!K2.t()) {
                int e11 = K2.e();
                if (e11 < i10) {
                    i10 = e11;
                }
                if (e11 > i11) {
                    i11 = e11;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final b0 G(int i10) {
        b0 b0Var = null;
        if (this.R) {
            return null;
        }
        int h10 = this.f2289t.h();
        for (int i11 = 0; i11 < h10; i11++) {
            b0 K2 = K(this.f2289t.g(i11));
            if (K2 != null && !K2.l() && H(K2) == i10) {
                if (!this.f2289t.k(K2.f2311a)) {
                    return K2;
                }
                b0Var = K2;
            }
        }
        return b0Var;
    }

    public final int H(b0 b0Var) {
        if (!b0Var.g(524) && b0Var.i()) {
            a aVar = this.f2287s;
            int i10 = b0Var.f2313c;
            int size = aVar.f2446b.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = aVar.f2446b.get(i11);
                int i12 = bVar.f2451a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = bVar.f2452b;
                        if (i13 <= i10) {
                            int i14 = bVar.f2454d;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = bVar.f2452b;
                        if (i15 == i10) {
                            i10 = bVar.f2454d;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (bVar.f2454d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (bVar.f2452b <= i10) {
                    i10 += bVar.f2454d;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long I(b0 b0Var) {
        if (this.A.f2331b) {
            return b0Var.f2315e;
        }
        return (long) b0Var.f2313c;
    }

    public final b0 J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect L(View view) {
        o oVar = (o) view.getLayoutParams();
        if (!oVar.f2365c) {
            return oVar.f2364b;
        }
        if (this.f2294v0.g && (oVar.b() || oVar.f2363a.j())) {
            return oVar.f2364b;
        }
        Rect rect = oVar.f2364b;
        rect.set(0, 0, 0, 0);
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2297x.set(0, 0, 0, 0);
            Rect rect2 = this.f2297x;
            Objects.requireNonNull(this.E.get(i10));
            ((o) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            int i11 = rect.left;
            Rect rect3 = this.f2297x;
            rect.left = i11 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        oVar.f2365c = false;
        return rect;
    }

    public final boolean M() {
        return !this.J || this.R || this.f2287s.g();
    }

    public final void N() {
        this.f2271c0 = null;
        this.f2268a0 = null;
        this.b0 = null;
        this.W = null;
    }

    public final boolean O() {
        return this.T > 0;
    }

    public final void P(int i10) {
        if (this.B != null) {
            setScrollState(2);
            this.B.v0(i10);
            awakenScrollBars();
        }
    }

    public final void Q() {
        int h10 = this.f2289t.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((o) this.f2289t.g(i10).getLayoutParams()).f2365c = true;
        }
        t tVar = this.f2269b;
        int size = tVar.f2375c.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) tVar.f2375c.get(i11).f2311a.getLayoutParams();
            if (oVar != null) {
                oVar.f2365c = true;
            }
        }
    }

    public final void R(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.f2289t.h();
        for (int i13 = 0; i13 < h10; i13++) {
            b0 K2 = K(this.f2289t.g(i13));
            if (K2 != null && !K2.t()) {
                int i14 = K2.f2313c;
                if (i14 >= i12) {
                    K2.p(-i11, z10);
                    this.f2294v0.f2400f = true;
                } else if (i14 >= i10) {
                    K2.b(8);
                    K2.p(-i11, z10);
                    K2.f2313c = i10 - 1;
                    this.f2294v0.f2400f = true;
                }
            }
        }
        t tVar = this.f2269b;
        int size = tVar.f2375c.size();
        while (true) {
            size--;
            if (size >= 0) {
                b0 b0Var = tVar.f2375c.get(size);
                if (b0Var != null) {
                    int i15 = b0Var.f2313c;
                    if (i15 >= i12) {
                        b0Var.p(-i11, z10);
                    } else if (i15 >= i10) {
                        b0Var.b(8);
                        tVar.f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void S() {
        this.T++;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$b0>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$b0>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$b0>, java.util.ArrayList] */
    public final void T(boolean z10) {
        int i10;
        boolean z11 = true;
        int i11 = this.T - 1;
        this.T = i11;
        if (i11 < 1) {
            this.T = 0;
            if (z10) {
                int i12 = this.O;
                this.O = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.Q;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z11 = false;
                    }
                    if (z11) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i12);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.J0.size() - 1; size >= 0; size--) {
                    b0 b0Var = (b0) this.J0.get(size);
                    if (b0Var.f2311a.getParent() == this && !b0Var.t() && (i10 = b0Var.f2325q) != -1) {
                        View view = b0Var.f2311a;
                        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
                        x.d.s(view, i10);
                        b0Var.f2325q = -1;
                    }
                }
                this.J0.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2274f0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2274f0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f2278j0 = x10;
            this.f2276h0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f2279k0 = y10;
            this.f2277i0 = y10;
        }
    }

    public final void V() {
        if (!this.B0 && this.H) {
            b bVar = this.K0;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            x.d.m(this, bVar);
            this.B0 = true;
        }
    }

    public final void W() {
        boolean z10;
        boolean z11 = false;
        if (this.R) {
            a aVar = this.f2287s;
            aVar.l(aVar.f2446b);
            aVar.l(aVar.f2447c);
            aVar.f2450f = 0;
            if (this.S) {
                this.B.d0();
            }
        }
        if (this.f2272d0 != null && this.B.I0()) {
            this.f2287s.j();
        } else {
            this.f2287s.c();
        }
        boolean z12 = this.f2300y0 || this.z0;
        y yVar = this.f2294v0;
        boolean z13 = this.J && this.f2272d0 != null && ((z10 = this.R) || z12 || this.B.f2348h) && (!z10 || this.A.f2331b);
        yVar.f2402j = z13;
        if (z13 && z12 && !this.R) {
            if (this.f2272d0 != null && this.B.I0()) {
                z11 = true;
            }
        }
        yVar.f2403k = z11;
    }

    public final void X(boolean z10) {
        this.S = z10 | this.S;
        this.R = true;
        int h10 = this.f2289t.h();
        for (int i10 = 0; i10 < h10; i10++) {
            b0 K2 = K(this.f2289t.g(i10));
            if (K2 != null && !K2.t()) {
                K2.b(6);
            }
        }
        Q();
        t tVar = this.f2269b;
        int size = tVar.f2375c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = tVar.f2375c.get(i11);
            if (b0Var != null) {
                b0Var.b(6);
                b0Var.a((Object) null);
            }
        }
        f fVar = RecyclerView.this.A;
        if (fVar == null || !fVar.f2331b) {
            tVar.e();
        }
    }

    public final void Y(b0 b0Var, k.c cVar) {
        b0Var.r(0, LZ4Constants.HASH_TABLE_SIZE_64K);
        if (this.f2294v0.f2401h && b0Var.o() && !b0Var.l() && !b0Var.t()) {
            this.f2291u.f2474b.i(I(b0Var), b0Var);
        }
        this.f2291u.c(b0Var, cVar);
    }

    public final void Z() {
        k kVar = this.f2272d0;
        if (kVar != null) {
            kVar.f();
        }
        n nVar = this.B;
        if (nVar != null) {
            nVar.n0(this.f2269b);
            this.B.o0(this.f2269b);
        }
        this.f2269b.b();
    }

    public final void a0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2297x.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f2365c) {
                Rect rect = oVar.f2364b;
                Rect rect2 = this.f2297x;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2297x);
            offsetRectIntoDescendantCoords(view, this.f2297x);
        }
        this.B.s0(this, view, this.f2297x, !this.J, view2 == null);
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        n nVar = this.B;
        if (nVar != null) {
            Objects.requireNonNull(nVar);
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0() {
        VelocityTracker velocityTracker = this.f2275g0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        k0(0);
        EdgeEffect edgeEffect = this.W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2268a0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f2268a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.b0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2271c0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f2271c0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            x.d.k(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r17.n()
            androidx.recyclerview.widget.RecyclerView$f r3 = r0.A
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0023
            int[] r3 = r0.I0
            r3[r5] = r5
            r3[r4] = r5
            r0.d0(r1, r2, r3)
            int[] r3 = r0.I0
            r6 = r3[r5]
            r3 = r3[r4]
            int r7 = r1 - r6
            int r8 = r2 - r3
            goto L_0x0027
        L_0x0023:
            r3 = r5
            r6 = r3
            r7 = r6
            r8 = r7
        L_0x0027:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$m> r9 = r0.E
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0032
            r17.invalidate()
        L_0x0032:
            int[] r15 = r0.I0
            r15[r5] = r5
            r15[r4] = r5
            int[] r14 = r0.G0
            n0.j r9 = r17.getScrollingChildHelper()
            r10 = r6
            r11 = r3
            r12 = r7
            r13 = r8
            r16 = r15
            r15 = r21
            r9.e(r10, r11, r12, r13, r14, r15, r16)
            int[] r9 = r0.I0
            r10 = r9[r5]
            int r7 = r7 - r10
            r10 = r9[r4]
            int r8 = r8 - r10
            r10 = r9[r5]
            if (r10 != 0) goto L_0x005c
            r9 = r9[r4]
            if (r9 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r9 = r5
            goto L_0x005d
        L_0x005c:
            r9 = r4
        L_0x005d:
            int r10 = r0.f2278j0
            int[] r11 = r0.G0
            r12 = r11[r5]
            int r10 = r10 - r12
            r0.f2278j0 = r10
            int r10 = r0.f2279k0
            r12 = r11[r4]
            int r10 = r10 - r12
            r0.f2279k0 = r10
            int[] r10 = r0.H0
            r12 = r10[r5]
            r13 = r11[r5]
            int r12 = r12 + r13
            r10[r5] = r12
            r12 = r10[r4]
            r11 = r11[r4]
            int r12 = r12 + r11
            r10[r4] = r12
            int r10 = r17.getOverScrollMode()
            r11 = 2
            if (r10 == r11) goto L_0x0120
            if (r20 == 0) goto L_0x011d
            r10 = 8194(0x2002, float:1.1482E-41)
            int r11 = r20.getSource()
            r11 = r11 & r10
            if (r11 != r10) goto L_0x0091
            r10 = r4
            goto L_0x0092
        L_0x0091:
            r10 = r5
        L_0x0092:
            if (r10 != 0) goto L_0x011d
            float r10 = r20.getX()
            float r7 = (float) r7
            float r11 = r20.getY()
            float r8 = (float) r8
            r12 = 0
            int r13 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 >= 0) goto L_0x00bd
            r17.x()
            android.widget.EdgeEffect r13 = r0.W
            float r15 = -r7
            int r4 = r17.getWidth()
            float r4 = (float) r4
            float r15 = r15 / r4
            int r4 = r17.getHeight()
            float r4 = (float) r4
            float r11 = r11 / r4
            float r4 = r14 - r11
            r13.onPull(r15, r4)
            goto L_0x00d6
        L_0x00bd:
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d8
            r17.y()
            android.widget.EdgeEffect r4 = r0.b0
            int r13 = r17.getWidth()
            float r13 = (float) r13
            float r13 = r7 / r13
            int r15 = r17.getHeight()
            float r15 = (float) r15
            float r11 = r11 / r15
            r4.onPull(r13, r11)
        L_0x00d6:
            r4 = 1
            goto L_0x00d9
        L_0x00d8:
            r4 = r5
        L_0x00d9:
            int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x00f3
            r17.z()
            android.widget.EdgeEffect r4 = r0.f2268a0
            float r11 = -r8
            int r13 = r17.getHeight()
            float r13 = (float) r13
            float r11 = r11 / r13
            int r13 = r17.getWidth()
            float r13 = (float) r13
            float r10 = r10 / r13
            r4.onPull(r11, r10)
            goto L_0x010d
        L_0x00f3:
            int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x010e
            r17.w()
            android.widget.EdgeEffect r4 = r0.f2271c0
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r11 = r8 / r11
            int r13 = r17.getWidth()
            float r13 = (float) r13
            float r10 = r10 / r13
            float r14 = r14 - r10
            r4.onPull(r11, r14)
        L_0x010d:
            r4 = 1
        L_0x010e:
            if (r4 != 0) goto L_0x0118
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0118
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x011d
        L_0x0118:
            java.util.WeakHashMap<android.view.View, n0.a0> r4 = n0.x.f8842a
            n0.x.d.k(r17)
        L_0x011d:
            r17.m(r18, r19)
        L_0x0120:
            if (r6 != 0) goto L_0x0124
            if (r3 == 0) goto L_0x0127
        L_0x0124:
            r0.v(r6, r3)
        L_0x0127:
            boolean r1 = r17.awakenScrollBars()
            if (r1 != 0) goto L_0x0130
            r17.invalidate()
        L_0x0130:
            if (r9 != 0) goto L_0x0139
            if (r6 != 0) goto L_0x0139
            if (r3 == 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r4 = r5
            goto L_0x013a
        L_0x0139:
            r4 = 1
        L_0x013a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.B.g((o) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        n nVar = this.B;
        if (nVar != null && nVar.e()) {
            return this.B.k(this.f2294v0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        n nVar = this.B;
        if (nVar != null && nVar.e()) {
            return this.B.l(this.f2294v0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        n nVar = this.B;
        if (nVar != null && nVar.e()) {
            return this.B.m(this.f2294v0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        n nVar = this.B;
        if (nVar != null && nVar.f()) {
            return this.B.n(this.f2294v0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        n nVar = this.B;
        if (nVar != null && nVar.f()) {
            return this.B.o(this.f2294v0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        n nVar = this.B;
        if (nVar != null && nVar.f()) {
            return this.B.p(this.f2294v0);
        }
        return 0;
    }

    public final void d0(int i10, int i11, int[] iArr) {
        b0 b0Var;
        h0();
        S();
        int i12 = j0.i.f6985a;
        Trace.beginSection("RV Scroll");
        B(this.f2294v0);
        int u02 = i10 != 0 ? this.B.u0(i10, this.f2269b, this.f2294v0) : 0;
        int w02 = i11 != 0 ? this.B.w0(i11, this.f2269b, this.f2294v0) : 0;
        Trace.endSection();
        int e10 = this.f2289t.e();
        for (int i13 = 0; i13 < e10; i13++) {
            View d10 = this.f2289t.d(i13);
            b0 J2 = J(d10);
            if (!(J2 == null || (b0Var = J2.i) == null)) {
                View view = b0Var.f2311a;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        j0(false);
        if (iArr != null) {
            iArr[0] = u02;
            iArr[1] = w02;
        }
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.E.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.E.get(i10).e(canvas, this, this.f2294v0);
        }
        EdgeEffect edgeEffect = this.W;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2293v ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.W;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2268a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2293v) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2268a0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.b0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2293v ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.b0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2271c0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2293v) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f2271c0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f2272d0 == null || this.E.size() <= 0 || !this.f2272d0.g()) {
            z12 = z10;
        }
        if (z12) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            x.d.k(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(int i10) {
        if (!this.M) {
            l0();
            n nVar = this.B;
            if (nVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            nVar.v0(i10);
            awakenScrollBars();
        }
    }

    public final void f(b0 b0Var) {
        View view = b0Var.f2311a;
        boolean z10 = view.getParent() == this;
        this.f2269b.k(J(view));
        if (b0Var.n()) {
            this.f2289t.b(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f2289t.a(view, -1, true);
        } else {
            b bVar = this.f2289t;
            int c10 = ((v) bVar.f2459a).c(view);
            if (c10 >= 0) {
                bVar.f2460b.h(c10);
                bVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$b0>, java.util.ArrayList] */
    public final boolean f0(b0 b0Var, int i10) {
        if (O()) {
            b0Var.f2325q = i10;
            this.J0.add(b0Var);
            return false;
        }
        View view = b0Var.f2311a;
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
        x.d.s(view, i10);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0166, code lost:
        if (r3 > 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0180, code lost:
        if (r6 > 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0183, code lost:
        if (r3 < 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0186, code lost:
        if (r6 < 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x018e, code lost:
        if ((r6 * r2) <= 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0196, code lost:
        if ((r6 * r2) >= 0) goto L_0x0199;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.B
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.RecyclerView$f r0 = r13.A
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.B
            if (r0 == 0) goto L_0x001b
            boolean r0 = r13.O()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.M
            if (r0 != 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 33
            r5 = 17
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x008d
            if (r15 == r7) goto L_0x002c
            if (r15 != r1) goto L_0x008d
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.B
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0042
            if (r15 != r7) goto L_0x0039
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003a
        L_0x0039:
            r0 = r4
        L_0x003a:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0042
            r0 = r1
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            if (r0 != 0) goto L_0x006d
            androidx.recyclerview.widget.RecyclerView$n r8 = r13.B
            boolean r8 = r8.e()
            if (r8 == 0) goto L_0x006d
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.B
            int r0 = r0.G()
            if (r0 != r1) goto L_0x0057
            r0 = r1
            goto L_0x0058
        L_0x0057:
            r0 = r2
        L_0x0058:
            if (r15 != r7) goto L_0x005c
            r8 = r1
            goto L_0x005d
        L_0x005c:
            r8 = r2
        L_0x005d:
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0063
            r0 = 66
            goto L_0x0064
        L_0x0063:
            r0 = r5
        L_0x0064:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x006c
            r0 = r1
            goto L_0x006d
        L_0x006c:
            r0 = r2
        L_0x006d:
            if (r0 == 0) goto L_0x0088
            r13.n()
            android.view.View r0 = r13.C(r14)
            if (r0 != 0) goto L_0x0079
            return r6
        L_0x0079:
            r13.h0()
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.B
            androidx.recyclerview.widget.RecyclerView$t r8 = r13.f2269b
            androidx.recyclerview.widget.RecyclerView$y r9 = r13.f2294v0
            r0.Y(r14, r15, r8, r9)
            r13.j0(r2)
        L_0x0088:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00b1
        L_0x008d:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00b0
            r13.n()
            android.view.View r0 = r13.C(r14)
            if (r0 != 0) goto L_0x009f
            return r6
        L_0x009f:
            r13.h0()
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.B
            androidx.recyclerview.widget.RecyclerView$t r3 = r13.f2269b
            androidx.recyclerview.widget.RecyclerView$y r8 = r13.f2294v0
            android.view.View r0 = r0.Y(r14, r15, r3, r8)
            r13.j0(r2)
            goto L_0x00b1
        L_0x00b0:
            r0 = r3
        L_0x00b1:
            if (r0 == 0) goto L_0x00c8
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00c8
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c4
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c4:
            r13.a0(r0, r6)
            return r14
        L_0x00c8:
            if (r0 == 0) goto L_0x0199
            if (r0 == r13) goto L_0x0199
            if (r0 != r14) goto L_0x00d0
            goto L_0x0199
        L_0x00d0:
            android.view.View r3 = r13.C(r0)
            if (r3 != 0) goto L_0x00d9
            r1 = r2
            goto L_0x019a
        L_0x00d9:
            if (r14 != 0) goto L_0x00dd
            goto L_0x019a
        L_0x00dd:
            android.view.View r3 = r13.C(r14)
            if (r3 != 0) goto L_0x00e5
            goto L_0x019a
        L_0x00e5:
            android.graphics.Rect r3 = r13.f2297x
            int r6 = r14.getWidth()
            int r8 = r14.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r3 = r13.f2299y
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r2 = r13.f2297x
            r13.offsetDescendantRectToMyCoords(r14, r2)
            android.graphics.Rect r2 = r13.f2299y
            r13.offsetDescendantRectToMyCoords(r0, r2)
            androidx.recyclerview.widget.RecyclerView$n r2 = r13.B
            int r2 = r2.G()
            if (r2 != r1) goto L_0x0113
            r2 = -1
            goto L_0x0114
        L_0x0113:
            r2 = r1
        L_0x0114:
            android.graphics.Rect r3 = r13.f2297x
            int r6 = r3.left
            android.graphics.Rect r8 = r13.f2299y
            int r9 = r8.left
            if (r6 < r9) goto L_0x0122
            int r10 = r3.right
            if (r10 > r9) goto L_0x012a
        L_0x0122:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x012a
            r6 = r1
            goto L_0x0137
        L_0x012a:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0132
            if (r6 < r11) goto L_0x0136
        L_0x0132:
            if (r6 <= r9) goto L_0x0136
            r6 = -1
            goto L_0x0137
        L_0x0136:
            r6 = 0
        L_0x0137:
            int r9 = r3.top
            int r10 = r8.top
            if (r9 < r10) goto L_0x0141
            int r11 = r3.bottom
            if (r11 > r10) goto L_0x0149
        L_0x0141:
            int r11 = r3.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x0149
            r3 = r1
            goto L_0x0156
        L_0x0149:
            int r3 = r3.bottom
            int r8 = r8.bottom
            if (r3 > r8) goto L_0x0151
            if (r9 < r8) goto L_0x0155
        L_0x0151:
            if (r9 <= r10) goto L_0x0155
            r3 = -1
            goto L_0x0156
        L_0x0155:
            r3 = 0
        L_0x0156:
            if (r15 == r1) goto L_0x0191
            if (r15 == r7) goto L_0x0189
            if (r15 == r5) goto L_0x0186
            if (r15 == r4) goto L_0x0183
            r2 = 66
            if (r15 == r2) goto L_0x0180
            r2 = 130(0x82, float:1.82E-43)
            if (r15 != r2) goto L_0x0169
            if (r3 <= 0) goto L_0x0199
            goto L_0x019a
        L_0x0169:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid direction: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = android.support.v4.media.a.c(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x0180:
            if (r6 <= 0) goto L_0x0199
            goto L_0x019a
        L_0x0183:
            if (r3 >= 0) goto L_0x0199
            goto L_0x019a
        L_0x0186:
            if (r6 >= 0) goto L_0x0199
            goto L_0x019a
        L_0x0189:
            if (r3 > 0) goto L_0x019a
            if (r3 != 0) goto L_0x0199
            int r6 = r6 * r2
            if (r6 <= 0) goto L_0x0199
            goto L_0x019a
        L_0x0191:
            if (r3 < 0) goto L_0x019a
            if (r3 != 0) goto L_0x0199
            int r6 = r6 * r2
            if (r6 >= 0) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            r1 = 0
        L_0x019a:
            if (r1 == 0) goto L_0x019d
            goto L_0x01a1
        L_0x019d:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x01a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(m mVar) {
        n nVar = this.B;
        if (nVar != null) {
            nVar.d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.E.isEmpty()) {
            setWillNotDraw(false);
        }
        this.E.add(mVar);
        Q();
        requestLayout();
    }

    public final void g0(int i10, int i11, boolean z10) {
        n nVar = this.B;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.M) {
            int i12 = 0;
            if (!nVar.e()) {
                i10 = 0;
            }
            if (!this.B.f()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (z10) {
                    if (i10 != 0) {
                        i12 = 1;
                    }
                    if (i11 != 0) {
                        i12 |= 2;
                    }
                    i0(i12, 1);
                }
                this.f2288s0.b(i10, i11, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK, (Interpolator) null);
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.B;
        if (nVar != null) {
            return nVar.t();
        }
        throw new IllegalStateException(android.support.v4.media.a.c(this, a.a.d("RecyclerView has no LayoutManager")));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.B;
        if (nVar != null) {
            return nVar.u(getContext(), attributeSet);
        }
        throw new IllegalStateException(android.support.v4.media.a.c(this, a.a.d("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public f getAdapter() {
        return this.A;
    }

    public int getBaseline() {
        n nVar = this.B;
        if (nVar == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(nVar);
        return -1;
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        i iVar = this.D0;
        if (iVar == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        return iVar.a();
    }

    public boolean getClipToPadding() {
        return this.f2293v;
    }

    public x getCompatAccessibilityDelegate() {
        return this.C0;
    }

    public j getEdgeEffectFactory() {
        return this.V;
    }

    public k getItemAnimator() {
        return this.f2272d0;
    }

    public int getItemDecorationCount() {
        return this.E.size();
    }

    public n getLayoutManager() {
        return this.B;
    }

    public int getMaxFlingVelocity() {
        return this.f2283o0;
    }

    public int getMinFlingVelocity() {
        return this.f2282n0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public p getOnFlingListener() {
        return this.f2281m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2286r0;
    }

    public s getRecycledViewPool() {
        return this.f2269b.d();
    }

    public int getScrollState() {
        return this.f2273e0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$r>, java.util.ArrayList] */
    public final void h(r rVar) {
        if (this.f2298x0 == null) {
            this.f2298x0 = new ArrayList();
        }
        this.f2298x0.add(rVar);
    }

    public final void h0() {
        int i10 = this.K + 1;
        this.K = i10;
        if (i10 == 1 && !this.M) {
            this.L = false;
        }
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (O()) {
            if (str == null) {
                throw new IllegalStateException(android.support.v4.media.a.c(this, a.a.d("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.U > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(android.support.v4.media.a.c(this, a.a.d(BuildConfig.FLAVOR))));
        }
    }

    public final boolean i0(int i10, int i11) {
        return getScrollingChildHelper().h(i10, i11);
    }

    public final boolean isAttachedToWindow() {
        return this.H;
    }

    public final boolean isLayoutSuppressed() {
        return this.M;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f8833d;
    }

    public final void j() {
        b0();
        setScrollState(0);
    }

    public final void j0(boolean z10) {
        if (this.K < 1) {
            this.K = 1;
        }
        if (!z10 && !this.M) {
            this.L = false;
        }
        if (this.K == 1) {
            if (z10 && this.L && !this.M && this.B != null && this.A != null) {
                q();
            }
            if (!this.M) {
                this.L = false;
            }
        }
        this.K--;
    }

    public final void k0(int i10) {
        getScrollingChildHelper().i(i10);
    }

    public final void l() {
        int h10 = this.f2289t.h();
        for (int i10 = 0; i10 < h10; i10++) {
            b0 K2 = K(this.f2289t.g(i10));
            if (!K2.t()) {
                K2.c();
            }
        }
        t tVar = this.f2269b;
        int size = tVar.f2375c.size();
        for (int i11 = 0; i11 < size; i11++) {
            tVar.f2375c.get(i11).c();
        }
        int size2 = tVar.f2373a.size();
        for (int i12 = 0; i12 < size2; i12++) {
            tVar.f2373a.get(i12).c();
        }
        ArrayList<b0> arrayList = tVar.f2374b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                tVar.f2374b.get(i13).c();
            }
        }
    }

    public final void l0() {
        x xVar;
        setScrollState(0);
        this.f2288s0.c();
        n nVar = this.B;
        if (nVar != null && (xVar = nVar.g) != null) {
            xVar.d();
        }
    }

    public final void m(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.W;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.W.onRelease();
            z10 = this.W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.b0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.b0.onRelease();
            z10 |= this.b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2268a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f2268a0.onRelease();
            z10 |= this.f2268a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2271c0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f2271c0.onRelease();
            z10 |= this.f2271c0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            x.d.k(this);
        }
    }

    public final void n() {
        if (!this.J || this.R) {
            int i10 = j0.i.f6985a;
            Trace.beginSection("RV FullInvalidate");
            q();
            Trace.endSection();
        } else if (this.f2287s.g()) {
            a aVar = this.f2287s;
            int i11 = aVar.f2450f;
            boolean z10 = false;
            if ((4 & i11) != 0) {
                if (!((11 & i11) != 0)) {
                    int i12 = j0.i.f6985a;
                    Trace.beginSection("RV PartialInvalidate");
                    h0();
                    S();
                    this.f2287s.j();
                    if (!this.L) {
                        int e10 = this.f2289t.e();
                        int i13 = 0;
                        while (true) {
                            if (i13 < e10) {
                                b0 K2 = K(this.f2289t.d(i13));
                                if (K2 != null && !K2.t() && K2.o()) {
                                    z10 = true;
                                    break;
                                }
                                i13++;
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            q();
                        } else {
                            this.f2287s.b();
                        }
                    }
                    j0(true);
                    T(true);
                    Trace.endSection();
                    return;
                }
            }
            if (aVar.g()) {
                int i14 = j0.i.f6985a;
                Trace.beginSection("RV FullInvalidate");
                q();
                Trace.endSection();
            }
        }
    }

    public final void o(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
        setMeasuredDimension(n.h(i10, paddingRight, x.d.e(this)), n.h(i11, getPaddingBottom() + getPaddingTop(), x.d.d(this)));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = 0;
        this.H = true;
        this.J = this.J && !isLayoutRequested();
        n nVar = this.B;
        if (nVar != null) {
            nVar.i = true;
        }
        this.B0 = false;
        ThreadLocal<m> threadLocal = m.f2555t;
        m mVar = threadLocal.get();
        this.f2290t0 = mVar;
        if (mVar == null) {
            this.f2290t0 = new m();
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            Display b10 = x.e.b(this);
            float f10 = 60.0f;
            if (!isInEditMode() && b10 != null) {
                float refreshRate = b10.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f10 = refreshRate;
                }
            }
            m mVar2 = this.f2290t0;
            mVar2.f2559c = (long) (1.0E9f / f10);
            threadLocal.set(mVar2);
        }
        this.f2290t0.f2557a.add(this);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$b0>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v5, types: [m0.c<androidx.recyclerview.widget.c0$a>, m0.d] */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f2272d0;
        if (kVar != null) {
            kVar.f();
        }
        l0();
        this.H = false;
        n nVar = this.B;
        if (nVar != null) {
            nVar.i = false;
            nVar.X(this);
        }
        this.J0.clear();
        removeCallbacks(this.K0);
        Objects.requireNonNull(this.f2291u);
        do {
        } while (c0.a.f2475d.b() != null);
        m mVar = this.f2290t0;
        if (mVar != null) {
            mVar.f2557a.remove(this);
            this.f2290t0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.E.get(i10).d(canvas, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.B
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r13.M
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = r14.getAction()
            r2 = 8
            if (r0 != r2) goto L_0x00d9
            int r0 = r14.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003e
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.B
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x002c
            r0 = 9
            float r0 = r14.getAxisValue(r0)
            float r0 = -r0
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            androidx.recyclerview.widget.RecyclerView$n r3 = r13.B
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x003c
            r3 = 10
            float r3 = r14.getAxisValue(r3)
            goto L_0x0064
        L_0x003c:
            r3 = r2
            goto L_0x0064
        L_0x003e:
            int r0 = r14.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0062
            r0 = 26
            float r0 = r14.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$n r3 = r13.B
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x0057
            float r0 = -r0
            goto L_0x003c
        L_0x0057:
            androidx.recyclerview.widget.RecyclerView$n r3 = r13.B
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x0062
            r3 = r0
            r0 = r2
            goto L_0x0064
        L_0x0062:
            r0 = r2
            r3 = r0
        L_0x0064:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x006c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00d9
        L_0x006c:
            float r2 = r13.f2284p0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r13.f2285q0
            float r0 = r0 * r3
            int r0 = (int) r0
            androidx.recyclerview.widget.RecyclerView$n r3 = r13.B
            if (r3 != 0) goto L_0x0081
            java.lang.String r14 = "RecyclerView"
            java.lang.String r0 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r14, r0)
            goto L_0x00d9
        L_0x0081:
            boolean r4 = r13.M
            if (r4 == 0) goto L_0x0086
            goto L_0x00d9
        L_0x0086:
            int[] r4 = r13.I0
            r4[r1] = r1
            r5 = 1
            r4[r5] = r1
            boolean r3 = r3.e()
            androidx.recyclerview.widget.RecyclerView$n r4 = r13.B
            boolean r4 = r4.f()
            if (r4 == 0) goto L_0x009c
            r6 = r3 | 2
            goto L_0x009d
        L_0x009c:
            r6 = r3
        L_0x009d:
            r13.i0(r6, r5)
            if (r3 == 0) goto L_0x00a4
            r8 = r2
            goto L_0x00a5
        L_0x00a4:
            r8 = r1
        L_0x00a5:
            if (r4 == 0) goto L_0x00a9
            r9 = r0
            goto L_0x00aa
        L_0x00a9:
            r9 = r1
        L_0x00aa:
            int[] r10 = r13.I0
            int[] r11 = r13.G0
            r12 = 1
            r7 = r13
            boolean r6 = r7.t(r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x00be
            int[] r6 = r13.I0
            r7 = r6[r1]
            int r2 = r2 - r7
            r6 = r6[r5]
            int r0 = r0 - r6
        L_0x00be:
            if (r3 == 0) goto L_0x00c2
            r3 = r2
            goto L_0x00c3
        L_0x00c2:
            r3 = r1
        L_0x00c3:
            if (r4 == 0) goto L_0x00c7
            r4 = r0
            goto L_0x00c8
        L_0x00c7:
            r4 = r1
        L_0x00c8:
            r13.c0(r3, r4, r14, r5)
            androidx.recyclerview.widget.m r14 = r13.f2290t0
            if (r14 == 0) goto L_0x00d6
            if (r2 != 0) goto L_0x00d3
            if (r0 == 0) goto L_0x00d6
        L_0x00d3:
            r14.a(r13, r2, r0)
        L_0x00d6:
            r13.k0(r5)
        L_0x00d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.M) {
            return false;
        }
        this.G = null;
        if (D(motionEvent)) {
            j();
            return true;
        }
        n nVar = this.B;
        if (nVar == null) {
            return false;
        }
        boolean e10 = nVar.e();
        boolean f10 = this.B.f();
        if (this.f2275g0 == null) {
            this.f2275g0 = VelocityTracker.obtain();
        }
        this.f2275g0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.N) {
                this.N = false;
            }
            this.f2274f0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f2278j0 = x10;
            this.f2276h0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f2279k0 = y10;
            this.f2277i0 = y10;
            if (this.f2273e0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                k0(1);
            }
            int[] iArr = this.H0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f10) {
                e10 |= true;
            }
            i0(e10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f2275g0.clear();
            k0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2274f0);
            if (findPointerIndex < 0) {
                StringBuilder d10 = a.a.d("Error processing scroll; pointer index for id ");
                d10.append(this.f2274f0);
                d10.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", d10.toString());
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2273e0 != 1) {
                int i10 = x11 - this.f2276h0;
                int i11 = y11 - this.f2277i0;
                if (!e10 || Math.abs(i10) <= this.f2280l0) {
                    z10 = false;
                } else {
                    this.f2278j0 = x11;
                    z10 = true;
                }
                if (f10 && Math.abs(i11) > this.f2280l0) {
                    this.f2279k0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5) {
            this.f2274f0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2278j0 = x12;
            this.f2276h0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2279k0 = y12;
            this.f2277i0 = y12;
        } else if (actionMasked == 6) {
            U(motionEvent);
        }
        if (this.f2273e0 == 1) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = j0.i.f6985a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.J = true;
    }

    public final void onMeasure(int i10, int i11) {
        n nVar = this.B;
        if (nVar == null) {
            o(i10, i11);
            return;
        }
        boolean z10 = false;
        if (nVar.R()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.B.j0(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.L0 = z10;
            if (!z10 && this.A != null) {
                if (this.f2294v0.f2398d == 1) {
                    r();
                }
                this.B.y0(i10, i11);
                this.f2294v0.i = true;
                s();
                this.B.B0(i10, i11);
                if (this.B.E0()) {
                    this.B.y0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f2294v0.i = true;
                    s();
                    this.B.B0(i10, i11);
                }
                this.M0 = getMeasuredWidth();
                this.N0 = getMeasuredHeight();
            }
        } else if (this.I) {
            this.B.j0(i10, i11);
        } else {
            if (this.P) {
                h0();
                S();
                W();
                T(true);
                y yVar = this.f2294v0;
                if (yVar.f2403k) {
                    yVar.g = true;
                } else {
                    this.f2287s.c();
                    this.f2294v0.g = false;
                }
                this.P = false;
                j0(false);
            } else if (this.f2294v0.f2403k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            f fVar = this.A;
            if (fVar != null) {
                this.f2294v0.f2399e = fVar.a();
            } else {
                this.f2294v0.f2399e = 0;
            }
            h0();
            this.B.j0(i10, i11);
            j0(false);
            this.f2294v0.g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        this.f2270c = wVar;
        super.onRestoreInstanceState(wVar.f10849a);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        w wVar = new w(super.onSaveInstanceState());
        w wVar2 = this.f2270c;
        if (wVar2 != null) {
            wVar.f2381c = wVar2.f2381c;
        } else {
            n nVar = this.B;
            if (nVar != null) {
                wVar.f2381c = nVar.l0();
            } else {
                wVar.f2381c = null;
            }
        }
        return wVar;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0342, code lost:
        if (r3 < r8) goto L_0x0345;
     */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            boolean r0 = r6.M
            r8 = 0
            if (r0 != 0) goto L_0x0407
            boolean r0 = r6.N
            if (r0 == 0) goto L_0x000f
            goto L_0x0407
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$q r0 = r6.G
            r1 = 3
            r2 = 0
            r9 = 1
            if (r0 != 0) goto L_0x0023
            int r0 = r21.getAction()
            if (r0 != 0) goto L_0x001e
            r0 = r8
            goto L_0x0031
        L_0x001e:
            boolean r0 = r20.D(r21)
            goto L_0x0031
        L_0x0023:
            r0.a(r7)
            int r0 = r21.getAction()
            if (r0 == r1) goto L_0x002e
            if (r0 != r9) goto L_0x0030
        L_0x002e:
            r6.G = r2
        L_0x0030:
            r0 = r9
        L_0x0031:
            if (r0 == 0) goto L_0x0037
            r20.j()
            return r9
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.B
            if (r0 != 0) goto L_0x003c
            return r8
        L_0x003c:
            boolean r10 = r0.e()
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.B
            boolean r11 = r0.f()
            android.view.VelocityTracker r0 = r6.f2275g0
            if (r0 != 0) goto L_0x0050
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f2275g0 = r0
        L_0x0050:
            int r0 = r21.getActionMasked()
            int r3 = r21.getActionIndex()
            if (r0 != 0) goto L_0x0060
            int[] r4 = r6.H0
            r4[r9] = r8
            r4[r8] = r8
        L_0x0060:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r21)
            int[] r4 = r6.H0
            r5 = r4[r8]
            float r5 = (float) r5
            r4 = r4[r9]
            float r4 = (float) r4
            r12.offsetLocation(r5, r4)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x03d0
            java.lang.String r5 = "RecyclerView"
            r13 = 2
            if (r0 == r9) goto L_0x018d
            if (r0 == r13) goto L_0x00aa
            if (r0 == r1) goto L_0x00a5
            r1 = 5
            if (r0 == r1) goto L_0x0089
            r1 = 6
            if (r0 == r1) goto L_0x0084
            goto L_0x0188
        L_0x0084:
            r20.U(r21)
            goto L_0x0188
        L_0x0089:
            int r0 = r7.getPointerId(r3)
            r6.f2274f0 = r0
            float r0 = r7.getX(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f2278j0 = r0
            r6.f2276h0 = r0
            float r0 = r7.getY(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f2279k0 = r0
            r6.f2277i0 = r0
            goto L_0x0188
        L_0x00a5:
            r20.j()
            goto L_0x0188
        L_0x00aa:
            int r0 = r6.f2274f0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00ca
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r0 = a.a.d(r0)
            int r1 = r6.f2274f0
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r5, r0)
            return r8
        L_0x00ca:
            float r1 = r7.getX(r0)
            float r1 = r1 + r4
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r4
            int r14 = (int) r0
            int r0 = r6.f2278j0
            int r0 = r0 - r13
            int r1 = r6.f2279k0
            int r1 = r1 - r14
            int r2 = r6.f2273e0
            if (r2 == r9) goto L_0x0113
            if (r10 == 0) goto L_0x00f7
            if (r0 <= 0) goto L_0x00ec
            int r2 = r6.f2280l0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00f3
        L_0x00ec:
            int r2 = r6.f2280l0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00f3:
            if (r0 == 0) goto L_0x00f7
            r2 = r9
            goto L_0x00f8
        L_0x00f7:
            r2 = r8
        L_0x00f8:
            if (r11 == 0) goto L_0x010e
            if (r1 <= 0) goto L_0x0104
            int r3 = r6.f2280l0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x010b
        L_0x0104:
            int r3 = r6.f2280l0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x010b:
            if (r1 == 0) goto L_0x010e
            r2 = r9
        L_0x010e:
            if (r2 == 0) goto L_0x0113
            r6.setScrollState(r9)
        L_0x0113:
            r15 = r0
            r16 = r1
            int r0 = r6.f2273e0
            if (r0 != r9) goto L_0x0188
            int[] r3 = r6.I0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0124
            r1 = r15
            goto L_0x0125
        L_0x0124:
            r1 = r8
        L_0x0125:
            if (r11 == 0) goto L_0x012a
            r2 = r16
            goto L_0x012b
        L_0x012a:
            r2 = r8
        L_0x012b:
            int[] r4 = r6.G0
            r5 = 0
            r0 = r20
            boolean r0 = r0.t(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0158
            int[] r0 = r6.I0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.H0
            r1 = r0[r8]
            int[] r2 = r6.G0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r20.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0158:
            r0 = r16
            int[] r1 = r6.G0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f2278j0 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f2279k0 = r14
            if (r10 == 0) goto L_0x016a
            r1 = r15
            goto L_0x016b
        L_0x016a:
            r1 = r8
        L_0x016b:
            if (r11 == 0) goto L_0x016f
            r2 = r0
            goto L_0x0170
        L_0x016f:
            r2 = r8
        L_0x0170:
            boolean r1 = r6.c0(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x017d
            android.view.ViewParent r1 = r20.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x017d:
            androidx.recyclerview.widget.m r1 = r6.f2290t0
            if (r1 == 0) goto L_0x0188
            if (r15 != 0) goto L_0x0185
            if (r0 == 0) goto L_0x0188
        L_0x0185:
            r1.a(r6, r15, r0)
        L_0x0188:
            r5 = r6
            r16 = r12
            goto L_0x03f5
        L_0x018d:
            android.view.VelocityTracker r0 = r6.f2275g0
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f2275g0
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r6.f2283o0
            float r3 = (float) r3
            r0.computeCurrentVelocity(r1, r3)
            r0 = 0
            if (r10 == 0) goto L_0x01a9
            android.view.VelocityTracker r1 = r6.f2275g0
            int r3 = r6.f2274f0
            float r1 = r1.getXVelocity(r3)
            float r1 = -r1
            goto L_0x01aa
        L_0x01a9:
            r1 = r0
        L_0x01aa:
            if (r11 == 0) goto L_0x01b6
            android.view.VelocityTracker r3 = r6.f2275g0
            int r4 = r6.f2274f0
            float r3 = r3.getYVelocity(r4)
            float r3 = -r3
            goto L_0x01b7
        L_0x01b6:
            r3 = r0
        L_0x01b7:
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x01c5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c0
            goto L_0x01c5
        L_0x01c0:
            r5 = r6
            r16 = r12
            goto L_0x03c8
        L_0x01c5:
            int r0 = (int) r1
            int r1 = (int) r3
            androidx.recyclerview.widget.RecyclerView$n r3 = r6.B
            if (r3 != 0) goto L_0x01d1
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r5, r0)
            goto L_0x01fa
        L_0x01d1:
            boolean r4 = r6.M
            if (r4 == 0) goto L_0x01d6
            goto L_0x01fa
        L_0x01d6:
            boolean r3 = r3.e()
            androidx.recyclerview.widget.RecyclerView$n r4 = r6.B
            boolean r4 = r4.f()
            if (r3 == 0) goto L_0x01ea
            int r5 = java.lang.Math.abs(r0)
            int r7 = r6.f2282n0
            if (r5 >= r7) goto L_0x01eb
        L_0x01ea:
            r0 = r8
        L_0x01eb:
            if (r4 == 0) goto L_0x01f5
            int r5 = java.lang.Math.abs(r1)
            int r7 = r6.f2282n0
            if (r5 >= r7) goto L_0x01f6
        L_0x01f5:
            r1 = r8
        L_0x01f6:
            if (r0 != 0) goto L_0x01ff
            if (r1 != 0) goto L_0x01ff
        L_0x01fa:
            r5 = r6
            r16 = r12
            goto L_0x03c5
        L_0x01ff:
            float r5 = (float) r0
            float r7 = (float) r1
            boolean r10 = r6.dispatchNestedPreFling(r5, r7)
            if (r10 != 0) goto L_0x03c1
            if (r3 != 0) goto L_0x020d
            if (r4 == 0) goto L_0x020c
            goto L_0x020d
        L_0x020c:
            r9 = r8
        L_0x020d:
            r6.dispatchNestedFling(r5, r7, r9)
            androidx.recyclerview.widget.RecyclerView$p r5 = r6.f2281m0
            if (r5 == 0) goto L_0x035b
            androidx.recyclerview.widget.a0 r5 = (androidx.recyclerview.widget.a0) r5
            androidx.recyclerview.widget.RecyclerView r7 = r5.f2455a
            androidx.recyclerview.widget.RecyclerView$n r7 = r7.getLayoutManager()
            if (r7 != 0) goto L_0x021f
            goto L_0x0227
        L_0x021f:
            androidx.recyclerview.widget.RecyclerView r10 = r5.f2455a
            androidx.recyclerview.widget.RecyclerView$f r10 = r10.getAdapter()
            if (r10 != 0) goto L_0x022f
        L_0x0227:
            r21 = r3
            r18 = r4
            r16 = r12
            goto L_0x0355
        L_0x022f:
            androidx.recyclerview.widget.RecyclerView r10 = r5.f2455a
            int r10 = r10.getMinFlingVelocity()
            int r11 = java.lang.Math.abs(r1)
            if (r11 > r10) goto L_0x024a
            int r11 = java.lang.Math.abs(r0)
            if (r11 <= r10) goto L_0x0242
            goto L_0x024a
        L_0x0242:
            r21 = r3
            r18 = r4
            r16 = r12
            goto L_0x0354
        L_0x024a:
            boolean r10 = r7 instanceof androidx.recyclerview.widget.RecyclerView.x.b
            if (r10 != 0) goto L_0x024f
            goto L_0x0261
        L_0x024f:
            androidx.recyclerview.widget.u r5 = (androidx.recyclerview.widget.u) r5
            if (r10 != 0) goto L_0x0254
            goto L_0x025f
        L_0x0254:
            androidx.recyclerview.widget.t r2 = new androidx.recyclerview.widget.t
            androidx.recyclerview.widget.RecyclerView r11 = r5.f2455a
            android.content.Context r11 = r11.getContext()
            r2.<init>(r5, r11)
        L_0x025f:
            if (r2 != 0) goto L_0x0269
        L_0x0261:
            r21 = r3
            r18 = r4
            r16 = r12
            goto L_0x0350
        L_0x0269:
            androidx.recyclerview.widget.RecyclerView r11 = r7.f2343b
            if (r11 == 0) goto L_0x0272
            androidx.recyclerview.widget.RecyclerView$f r11 = r11.getAdapter()
            goto L_0x0273
        L_0x0272:
            r11 = 0
        L_0x0273:
            if (r11 == 0) goto L_0x0279
            int r8 = r11.a()
        L_0x0279:
            if (r8 != 0) goto L_0x027c
            goto L_0x0295
        L_0x027c:
            boolean r11 = r7.f()
            if (r11 == 0) goto L_0x0287
            androidx.recyclerview.widget.s r11 = r5.f(r7)
            goto L_0x0293
        L_0x0287:
            boolean r11 = r7.e()
            if (r11 == 0) goto L_0x0292
            androidx.recyclerview.widget.s r11 = r5.e(r7)
            goto L_0x0293
        L_0x0292:
            r11 = 0
        L_0x0293:
            if (r11 != 0) goto L_0x029d
        L_0x0295:
            r21 = r3
            r18 = r4
            r16 = r12
            goto L_0x0344
        L_0x029d:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            int r15 = r7.x()
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = r3
            r6 = r17
            r3 = r18
            r19 = r16
            r16 = r12
            r12 = r19
        L_0x02b8:
            if (r12 >= r15) goto L_0x02de
            r17 = r15
            android.view.View r15 = r7.w(r12)
            if (r15 != 0) goto L_0x02c5
            r18 = r4
            goto L_0x02d7
        L_0x02c5:
            r18 = r4
            int r4 = r5.c(r15, r11)
            if (r4 > 0) goto L_0x02d1
            if (r4 <= r13) goto L_0x02d1
            r13 = r4
            r6 = r15
        L_0x02d1:
            if (r4 < 0) goto L_0x02d7
            if (r4 >= r14) goto L_0x02d7
            r14 = r4
            r3 = r15
        L_0x02d7:
            int r12 = r12 + 1
            r15 = r17
            r4 = r18
            goto L_0x02b8
        L_0x02de:
            r18 = r4
            boolean r4 = r7.e()
            if (r4 == 0) goto L_0x02e9
            if (r0 <= 0) goto L_0x02ed
            goto L_0x02eb
        L_0x02e9:
            if (r1 <= 0) goto L_0x02ed
        L_0x02eb:
            r4 = 1
            goto L_0x02ee
        L_0x02ed:
            r4 = 0
        L_0x02ee:
            if (r4 == 0) goto L_0x02f7
            if (r3 == 0) goto L_0x02f7
            int r3 = r7.N(r3)
            goto L_0x0345
        L_0x02f7:
            if (r4 != 0) goto L_0x0300
            if (r6 == 0) goto L_0x0300
            int r3 = r7.N(r6)
            goto L_0x0345
        L_0x0300:
            if (r4 == 0) goto L_0x0303
            goto L_0x0304
        L_0x0303:
            r6 = r3
        L_0x0304:
            if (r6 != 0) goto L_0x0307
            goto L_0x0344
        L_0x0307:
            int r3 = r7.N(r6)
            androidx.recyclerview.widget.RecyclerView r5 = r7.f2343b
            if (r5 == 0) goto L_0x0314
            androidx.recyclerview.widget.RecyclerView$f r5 = r5.getAdapter()
            goto L_0x0315
        L_0x0314:
            r5 = 0
        L_0x0315:
            if (r5 == 0) goto L_0x031c
            int r5 = r5.a()
            goto L_0x031d
        L_0x031c:
            r5 = 0
        L_0x031d:
            if (r10 == 0) goto L_0x0339
            r6 = r7
            androidx.recyclerview.widget.RecyclerView$x$b r6 = (androidx.recyclerview.widget.RecyclerView.x.b) r6
            int r5 = r5 + -1
            android.graphics.PointF r5 = r6.a(r5)
            if (r5 == 0) goto L_0x0339
            float r6 = r5.x
            r10 = 0
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x0337
            float r5 = r5.y
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0339
        L_0x0337:
            r5 = 1
            goto L_0x033a
        L_0x0339:
            r5 = 0
        L_0x033a:
            if (r5 != r4) goto L_0x033e
            r4 = -1
            goto L_0x033f
        L_0x033e:
            r4 = 1
        L_0x033f:
            int r3 = r3 + r4
            if (r3 < 0) goto L_0x0344
            if (r3 < r8) goto L_0x0345
        L_0x0344:
            r3 = -1
        L_0x0345:
            r4 = -1
            if (r3 != r4) goto L_0x034a
            r8 = 0
            goto L_0x0350
        L_0x034a:
            r2.f2382a = r3
            r7.H0(r2)
            r8 = 1
        L_0x0350:
            if (r8 == 0) goto L_0x0354
            r8 = 1
            goto L_0x0355
        L_0x0354:
            r8 = 0
        L_0x0355:
            if (r8 == 0) goto L_0x0361
            r8 = 1
            r5 = r20
            goto L_0x03c5
        L_0x035b:
            r21 = r3
            r18 = r4
            r16 = r12
        L_0x0361:
            if (r9 == 0) goto L_0x03be
            if (r18 == 0) goto L_0x0368
            r3 = r21 | 2
            goto L_0x036a
        L_0x0368:
            r3 = r21
        L_0x036a:
            r2 = 1
            r5 = r20
            r5.i0(r3, r2)
            int r2 = r5.f2283o0
            int r3 = -r2
            int r0 = java.lang.Math.min(r0, r2)
            int r9 = java.lang.Math.max(r3, r0)
            int r0 = r5.f2283o0
            int r2 = -r0
            int r0 = java.lang.Math.min(r1, r0)
            int r10 = java.lang.Math.max(r2, r0)
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r5.f2288s0
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            r2 = 2
            r1.setScrollState(r2)
            r1 = 0
            r0.f2303b = r1
            r0.f2302a = r1
            android.view.animation.Interpolator r1 = r0.f2305s
            androidx.recyclerview.widget.RecyclerView$c r2 = R0
            if (r1 == r2) goto L_0x03a8
            r0.f2305s = r2
            android.widget.OverScroller r1 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r2)
            r0.f2304c = r1
        L_0x03a8:
            android.widget.OverScroller r6 = r0.f2304c
            r7 = 0
            r8 = 0
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.a()
            r8 = 1
            goto L_0x03c5
        L_0x03be:
            r5 = r20
            goto L_0x03c4
        L_0x03c1:
            r5 = r6
            r16 = r12
        L_0x03c4:
            r8 = 0
        L_0x03c5:
            if (r8 != 0) goto L_0x03cb
            r8 = 0
        L_0x03c8:
            r5.setScrollState(r8)
        L_0x03cb:
            r20.b0()
            r0 = 1
            goto L_0x03f6
        L_0x03d0:
            r5 = r6
            r16 = r12
            int r0 = r7.getPointerId(r8)
            r5.f2274f0 = r0
            float r0 = r21.getX()
            float r0 = r0 + r4
            int r0 = (int) r0
            r5.f2278j0 = r0
            r5.f2276h0 = r0
            float r0 = r21.getY()
            float r0 = r0 + r4
            int r0 = (int) r0
            r5.f2279k0 = r0
            r5.f2277i0 = r0
            if (r11 == 0) goto L_0x03f1
            r10 = r10 | 2
        L_0x03f1:
            r8 = 0
            r5.i0(r10, r8)
        L_0x03f5:
            r0 = r8
        L_0x03f6:
            if (r0 != 0) goto L_0x0400
            android.view.VelocityTracker r0 = r5.f2275g0
            r1 = r16
            r0.addMovement(r1)
            goto L_0x0402
        L_0x0400:
            r1 = r16
        L_0x0402:
            r1.recycle()
            r0 = 1
            return r0
        L_0x0407:
            r5 = r6
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        b0 K2 = K(view);
        f fVar = this.A;
        if (fVar != null && K2 != null) {
            Objects.requireNonNull(fVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0341, code lost:
        if (r15.f2289t.k(getFocusedChild()) == false) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03ca, code lost:
        r5 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r15 = this;
            androidx.recyclerview.widget.RecyclerView$f r0 = r15.A
            java.lang.String r1 = "RecyclerView"
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "No adapter attached; skipping layout"
            android.util.Log.w(r1, r0)
            return
        L_0x000c:
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "No layout manager attached; skipping layout"
            android.util.Log.e(r1, r0)
            return
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView$y r0 = r15.f2294v0
            r2 = 0
            r0.i = r2
            boolean r0 = r15.L0
            r3 = 1
            if (r0 == 0) goto L_0x0032
            int r0 = r15.M0
            int r4 = r15.getWidth()
            if (r0 != r4) goto L_0x0030
            int r0 = r15.N0
            int r4 = r15.getHeight()
            if (r0 == r4) goto L_0x0032
        L_0x0030:
            r0 = r3
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            r15.M0 = r2
            r15.N0 = r2
            r15.L0 = r2
            androidx.recyclerview.widget.RecyclerView$y r4 = r15.f2294v0
            int r4 = r4.f2398d
            if (r4 != r3) goto L_0x004b
            r15.r()
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            r0.x0(r15)
            r15.s()
            goto L_0x0087
        L_0x004b:
            androidx.recyclerview.widget.a r4 = r15.f2287s
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r4.f2447c
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x005f
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r4 = r4.f2446b
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x005f
            r4 = r3
            goto L_0x0060
        L_0x005f:
            r4 = r2
        L_0x0060:
            if (r4 != 0) goto L_0x007f
            if (r0 != 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            int r0 = r0.f2355p
            int r4 = r15.getWidth()
            if (r0 != r4) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            int r0 = r0.f2356q
            int r4 = r15.getHeight()
            if (r0 == r4) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            r0.x0(r15)
            goto L_0x0087
        L_0x007f:
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            r0.x0(r15)
            r15.s()
        L_0x0087:
            androidx.recyclerview.widget.RecyclerView$y r0 = r15.f2294v0
            r4 = 4
            r0.a(r4)
            r15.h0()
            r15.S()
            androidx.recyclerview.widget.RecyclerView$y r0 = r15.f2294v0
            r0.f2398d = r3
            boolean r0 = r0.f2402j
            r5 = 0
            if (r0 == 0) goto L_0x02a7
            androidx.recyclerview.widget.b r0 = r15.f2289t
            int r0 = r0.e()
            int r0 = r0 - r3
        L_0x00a3:
            if (r0 < 0) goto L_0x01df
            androidx.recyclerview.widget.b r6 = r15.f2289t
            android.view.View r6 = r6.d(r0)
            androidx.recyclerview.widget.RecyclerView$b0 r6 = K(r6)
            boolean r7 = r6.t()
            if (r7 == 0) goto L_0x00b7
            goto L_0x01da
        L_0x00b7:
            long r7 = r15.I(r6)
            androidx.recyclerview.widget.RecyclerView$k r9 = r15.f2272d0
            java.util.Objects.requireNonNull(r9)
            androidx.recyclerview.widget.RecyclerView$k$c r9 = new androidx.recyclerview.widget.RecyclerView$k$c
            r9.<init>()
            r9.a(r6)
            androidx.recyclerview.widget.c0 r10 = r15.f2291u
            s.d<androidx.recyclerview.widget.RecyclerView$b0> r10 = r10.f2474b
            java.lang.Object r10 = r10.g(r7, r5)
            androidx.recyclerview.widget.RecyclerView$b0 r10 = (androidx.recyclerview.widget.RecyclerView.b0) r10
            if (r10 == 0) goto L_0x01d5
            boolean r11 = r10.t()
            if (r11 != 0) goto L_0x01d5
            androidx.recyclerview.widget.c0 r11 = r15.f2291u
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r11 = r11.f2473a
            java.lang.Object r11 = r11.getOrDefault(r10, r5)
            androidx.recyclerview.widget.c0$a r11 = (androidx.recyclerview.widget.c0.a) r11
            if (r11 == 0) goto L_0x00ed
            int r11 = r11.f2476a
            r11 = r11 & r3
            if (r11 == 0) goto L_0x00ed
            r11 = r3
            goto L_0x00ee
        L_0x00ed:
            r11 = r2
        L_0x00ee:
            androidx.recyclerview.widget.c0 r12 = r15.f2291u
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r12 = r12.f2473a
            java.lang.Object r12 = r12.getOrDefault(r6, r5)
            androidx.recyclerview.widget.c0$a r12 = (androidx.recyclerview.widget.c0.a) r12
            if (r12 == 0) goto L_0x0101
            int r12 = r12.f2476a
            r12 = r12 & r3
            if (r12 == 0) goto L_0x0101
            r12 = r3
            goto L_0x0102
        L_0x0101:
            r12 = r2
        L_0x0102:
            if (r11 == 0) goto L_0x010d
            if (r10 != r6) goto L_0x010d
            androidx.recyclerview.widget.c0 r4 = r15.f2291u
            r4.b(r6, r9)
            goto L_0x01da
        L_0x010d:
            androidx.recyclerview.widget.c0 r13 = r15.f2291u
            androidx.recyclerview.widget.RecyclerView$k$c r4 = r13.d(r10, r4)
            androidx.recyclerview.widget.c0 r13 = r15.f2291u
            r13.b(r6, r9)
            androidx.recyclerview.widget.c0 r9 = r15.f2291u
            r13 = 8
            androidx.recyclerview.widget.RecyclerView$k$c r9 = r9.d(r6, r13)
            if (r4 != 0) goto L_0x01ab
            androidx.recyclerview.widget.b r4 = r15.f2289t
            int r4 = r4.e()
            r9 = r2
        L_0x0129:
            if (r9 >= r4) goto L_0x0187
            androidx.recyclerview.widget.b r11 = r15.f2289t
            android.view.View r11 = r11.d(r9)
            androidx.recyclerview.widget.RecyclerView$b0 r11 = K(r11)
            if (r11 != r6) goto L_0x0138
            goto L_0x0184
        L_0x0138:
            long r12 = r15.I(r11)
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x0184
            androidx.recyclerview.widget.RecyclerView$f r0 = r15.A
            java.lang.String r1 = " \n View Holder 2:"
            if (r0 == 0) goto L_0x0167
            boolean r0 = r0.f2331b
            if (r0 == 0) goto L_0x0167
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = android.support.v4.media.a.c(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x0167:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = android.support.v4.media.a.c(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x0184:
            int r9 = r9 + 1
            goto L_0x0129
        L_0x0187:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r4.append(r7)
            r4.append(r10)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r4.append(r7)
            r4.append(r6)
            java.lang.String r6 = r15.A()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r1, r4)
            goto L_0x01da
        L_0x01ab:
            r10.s(r2)
            if (r11 == 0) goto L_0x01b3
            r15.f(r10)
        L_0x01b3:
            if (r10 == r6) goto L_0x01c9
            if (r12 == 0) goto L_0x01ba
            r15.f(r6)
        L_0x01ba:
            r10.f2317h = r6
            r15.f(r10)
            androidx.recyclerview.widget.RecyclerView$t r7 = r15.f2269b
            r7.k(r10)
            r6.s(r2)
            r6.i = r10
        L_0x01c9:
            androidx.recyclerview.widget.RecyclerView$k r7 = r15.f2272d0
            boolean r4 = r7.a(r10, r6, r4, r9)
            if (r4 == 0) goto L_0x01da
            r15.V()
            goto L_0x01da
        L_0x01d5:
            androidx.recyclerview.widget.c0 r4 = r15.f2291u
            r4.b(r6, r9)
        L_0x01da:
            int r0 = r0 + -1
            r4 = 4
            goto L_0x00a3
        L_0x01df:
            androidx.recyclerview.widget.c0 r0 = r15.f2291u
            androidx.recyclerview.widget.RecyclerView$d r1 = r15.O0
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r4 = r0.f2473a
            int r4 = r4.f10843c
        L_0x01e7:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x02a7
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r6 = r0.f2473a
            java.lang.Object r6 = r6.i(r4)
            r8 = r6
            androidx.recyclerview.widget.RecyclerView$b0 r8 = (androidx.recyclerview.widget.RecyclerView.b0) r8
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r6 = r0.f2473a
            java.lang.Object r6 = r6.k(r4)
            androidx.recyclerview.widget.c0$a r6 = (androidx.recyclerview.widget.c0.a) r6
            int r7 = r6.f2476a
            r9 = r7 & 3
            r10 = 3
            if (r9 != r10) goto L_0x0210
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$n r9 = r7.B
            android.view.View r8 = r8.f2311a
            androidx.recyclerview.widget.RecyclerView$t r7 = r7.f2269b
            r9.p0(r8, r7)
            goto L_0x02a2
        L_0x0210:
            r9 = r7 & 1
            if (r9 == 0) goto L_0x022c
            androidx.recyclerview.widget.RecyclerView$k$c r7 = r6.f2477b
            if (r7 != 0) goto L_0x0225
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$n r9 = r7.B
            android.view.View r8 = r8.f2311a
            androidx.recyclerview.widget.RecyclerView$t r7 = r7.f2269b
            r9.p0(r8, r7)
            goto L_0x02a2
        L_0x0225:
            androidx.recyclerview.widget.RecyclerView$k$c r9 = r6.f2478c
            r1.b(r8, r7, r9)
            goto L_0x02a2
        L_0x022c:
            r9 = r7 & 14
            r10 = 14
            if (r9 != r10) goto L_0x023b
            androidx.recyclerview.widget.RecyclerView$k$c r7 = r6.f2477b
            androidx.recyclerview.widget.RecyclerView$k$c r9 = r6.f2478c
            r1.a(r8, r7, r9)
            goto L_0x02a2
        L_0x023b:
            r9 = r7 & 12
            r10 = 12
            if (r9 != r10) goto L_0x028d
            androidx.recyclerview.widget.RecyclerView$k$c r7 = r6.f2477b
            androidx.recyclerview.widget.RecyclerView$k$c r9 = r6.f2478c
            java.util.Objects.requireNonNull(r1)
            r8.s(r2)
            androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
            boolean r11 = r10.R
            if (r11 == 0) goto L_0x025f
            androidx.recyclerview.widget.RecyclerView$k r10 = r10.f2272d0
            boolean r7 = r10.a(r8, r8, r7, r9)
            if (r7 == 0) goto L_0x02a2
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            r7.V()
            goto L_0x02a2
        L_0x025f:
            androidx.recyclerview.widget.RecyclerView$k r10 = r10.f2272d0
            androidx.recyclerview.widget.z r10 = (androidx.recyclerview.widget.z) r10
            java.util.Objects.requireNonNull(r10)
            int r11 = r7.f2339a
            int r12 = r9.f2339a
            if (r11 != r12) goto L_0x0278
            int r13 = r7.f2340b
            int r14 = r9.f2340b
            if (r13 == r14) goto L_0x0273
            goto L_0x0278
        L_0x0273:
            r10.c(r8)
            r7 = r2
            goto L_0x0285
        L_0x0278:
            int r13 = r7.f2340b
            int r14 = r9.f2340b
            r7 = r10
            r9 = r11
            r10 = r13
            r11 = r12
            r12 = r14
            boolean r7 = r7.h(r8, r9, r10, r11, r12)
        L_0x0285:
            if (r7 == 0) goto L_0x02a2
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            r7.V()
            goto L_0x02a2
        L_0x028d:
            r9 = r7 & 4
            if (r9 == 0) goto L_0x0297
            androidx.recyclerview.widget.RecyclerView$k$c r7 = r6.f2477b
            r1.b(r8, r7, r5)
            goto L_0x02a2
        L_0x0297:
            r7 = r7 & 8
            if (r7 == 0) goto L_0x02a2
            androidx.recyclerview.widget.RecyclerView$k$c r7 = r6.f2477b
            androidx.recyclerview.widget.RecyclerView$k$c r9 = r6.f2478c
            r1.a(r8, r7, r9)
        L_0x02a2:
            androidx.recyclerview.widget.c0.a.b(r6)
            goto L_0x01e7
        L_0x02a7:
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            androidx.recyclerview.widget.RecyclerView$t r1 = r15.f2269b
            r0.o0(r1)
            androidx.recyclerview.widget.RecyclerView$y r0 = r15.f2294v0
            int r1 = r0.f2399e
            r0.f2396b = r1
            r15.R = r2
            r15.S = r2
            r0.f2402j = r2
            r0.f2403k = r2
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            r0.f2348h = r2
            androidx.recyclerview.widget.RecyclerView$t r0 = r15.f2269b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r0.f2374b
            if (r0 == 0) goto L_0x02c9
            r0.clear()
        L_0x02c9:
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            boolean r1 = r0.f2352m
            if (r1 == 0) goto L_0x02d8
            r0.f2351l = r2
            r0.f2352m = r2
            androidx.recyclerview.widget.RecyclerView$t r0 = r15.f2269b
            r0.l()
        L_0x02d8:
            androidx.recyclerview.widget.RecyclerView$n r0 = r15.B
            r0.i0()
            r15.T(r3)
            r15.j0(r2)
            androidx.recyclerview.widget.c0 r0 = r15.f2291u
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r1 = r0.f2473a
            r1.clear()
            s.d<androidx.recyclerview.widget.RecyclerView$b0> r0 = r0.f2474b
            r0.b()
            int[] r0 = r15.E0
            r1 = r0[r2]
            r4 = r0[r3]
            r15.E(r0)
            int[] r0 = r15.E0
            r6 = r0[r2]
            if (r6 != r1) goto L_0x0304
            r0 = r0[r3]
            if (r0 == r4) goto L_0x0303
            goto L_0x0304
        L_0x0303:
            r3 = r2
        L_0x0304:
            if (r3 == 0) goto L_0x0309
            r15.v(r2, r2)
        L_0x0309:
            boolean r0 = r15.f2286r0
            r3 = -1
            if (r0 == 0) goto L_0x0404
            androidx.recyclerview.widget.RecyclerView$f r0 = r15.A
            if (r0 == 0) goto L_0x0404
            boolean r0 = r15.hasFocus()
            if (r0 == 0) goto L_0x0404
            int r0 = r15.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x0404
            int r0 = r15.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0331
            boolean r0 = r15.isFocused()
            if (r0 == 0) goto L_0x0331
            goto L_0x0404
        L_0x0331:
            boolean r0 = r15.isFocused()
            if (r0 != 0) goto L_0x0345
            android.view.View r0 = r15.getFocusedChild()
            androidx.recyclerview.widget.b r1 = r15.f2289t
            boolean r0 = r1.k(r0)
            if (r0 != 0) goto L_0x0345
            goto L_0x0404
        L_0x0345:
            androidx.recyclerview.widget.RecyclerView$y r0 = r15.f2294v0
            long r0 = r0.f2405m
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0389
            androidx.recyclerview.widget.RecyclerView$f r6 = r15.A
            boolean r6 = r6.f2331b
            if (r6 == 0) goto L_0x0389
            if (r6 != 0) goto L_0x0357
            r8 = r5
            goto L_0x0387
        L_0x0357:
            androidx.recyclerview.widget.b r6 = r15.f2289t
            int r6 = r6.h()
            r7 = r2
            r8 = r5
        L_0x035f:
            if (r7 >= r6) goto L_0x0387
            androidx.recyclerview.widget.b r9 = r15.f2289t
            android.view.View r9 = r9.g(r7)
            androidx.recyclerview.widget.RecyclerView$b0 r9 = K(r9)
            if (r9 == 0) goto L_0x0384
            boolean r10 = r9.l()
            if (r10 != 0) goto L_0x0384
            long r10 = r9.f2315e
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x0384
            androidx.recyclerview.widget.b r8 = r15.f2289t
            android.view.View r10 = r9.f2311a
            boolean r8 = r8.k(r10)
            if (r8 == 0) goto L_0x038a
            r8 = r9
        L_0x0384:
            int r7 = r7 + 1
            goto L_0x035f
        L_0x0387:
            r9 = r8
            goto L_0x038a
        L_0x0389:
            r9 = r5
        L_0x038a:
            if (r9 == 0) goto L_0x03a2
            androidx.recyclerview.widget.b r0 = r15.f2289t
            android.view.View r1 = r9.f2311a
            boolean r0 = r0.k(r1)
            if (r0 != 0) goto L_0x03a2
            android.view.View r0 = r9.f2311a
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x039f
            goto L_0x03a2
        L_0x039f:
            android.view.View r5 = r9.f2311a
            goto L_0x03e9
        L_0x03a2:
            androidx.recyclerview.widget.b r0 = r15.f2289t
            int r0 = r0.e()
            if (r0 <= 0) goto L_0x03e9
            androidx.recyclerview.widget.RecyclerView$y r0 = r15.f2294v0
            int r1 = r0.f2404l
            r6 = -1
            if (r1 == r6) goto L_0x03b2
            r2 = r1
        L_0x03b2:
            int r0 = r0.b()
            r1 = r2
        L_0x03b7:
            if (r1 >= r0) goto L_0x03cf
            androidx.recyclerview.widget.RecyclerView$b0 r6 = r15.G(r1)
            if (r6 != 0) goto L_0x03c0
            goto L_0x03cf
        L_0x03c0:
            android.view.View r7 = r6.f2311a
            boolean r7 = r7.hasFocusable()
            if (r7 == 0) goto L_0x03cc
            android.view.View r0 = r6.f2311a
        L_0x03ca:
            r5 = r0
            goto L_0x03e9
        L_0x03cc:
            int r1 = r1 + 1
            goto L_0x03b7
        L_0x03cf:
            int r0 = java.lang.Math.min(r0, r2)
        L_0x03d3:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x03e9
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r15.G(r0)
            if (r1 != 0) goto L_0x03de
            goto L_0x03e9
        L_0x03de:
            android.view.View r2 = r1.f2311a
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L_0x03d3
            android.view.View r0 = r1.f2311a
            goto L_0x03ca
        L_0x03e9:
            if (r5 == 0) goto L_0x0404
            androidx.recyclerview.widget.RecyclerView$y r0 = r15.f2294v0
            int r0 = r0.f2406n
            long r1 = (long) r0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0401
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x0401
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x0401
            r5 = r0
        L_0x0401:
            r5.requestFocus()
        L_0x0404:
            androidx.recyclerview.widget.RecyclerView$y r0 = r15.f2294v0
            r0.f2405m = r3
            r1 = -1
            r0.f2404l = r1
            r0.f2406n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            r1 = 1
            r0.a(r1)
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            r10.B(r0)
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            r2 = 0
            r0.i = r2
            r10.h0()
            androidx.recyclerview.widget.c0 r0 = r10.f2291u
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r3 = r0.f2473a
            r3.clear()
            s.d<androidx.recyclerview.widget.RecyclerView$b0> r0 = r0.f2474b
            r0.b()
            r10.S()
            r10.W()
            boolean r0 = r10.f2286r0
            r3 = 0
            if (r0 == 0) goto L_0x0039
            boolean r0 = r10.hasFocus()
            if (r0 == 0) goto L_0x0039
            androidx.recyclerview.widget.RecyclerView$f r0 = r10.A
            if (r0 == 0) goto L_0x0039
            android.view.View r0 = r10.getFocusedChild()
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            if (r0 != 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            android.view.View r0 = r10.C(r0)
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r0 = r3
            goto L_0x0049
        L_0x0045:
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r10.J(r0)
        L_0x0049:
            r4 = -1
            r6 = -1
            if (r0 != 0) goto L_0x0057
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            r0.f2405m = r4
            r0.f2404l = r6
            r0.f2406n = r6
            goto L_0x00a8
        L_0x0057:
            androidx.recyclerview.widget.RecyclerView$y r7 = r10.f2294v0
            androidx.recyclerview.widget.RecyclerView$f r8 = r10.A
            boolean r8 = r8.f2331b
            if (r8 == 0) goto L_0x0061
            long r4 = r0.f2315e
        L_0x0061:
            r7.f2405m = r4
            boolean r4 = r10.R
            if (r4 == 0) goto L_0x0068
            goto L_0x0075
        L_0x0068:
            boolean r4 = r0.l()
            if (r4 == 0) goto L_0x0071
            int r4 = r0.f2314d
            goto L_0x007b
        L_0x0071:
            androidx.recyclerview.widget.RecyclerView r4 = r0.f2326r
            if (r4 != 0) goto L_0x0077
        L_0x0075:
            r4 = r6
            goto L_0x007b
        L_0x0077:
            int r4 = r4.H(r0)
        L_0x007b:
            r7.f2404l = r4
            androidx.recyclerview.widget.RecyclerView$y r4 = r10.f2294v0
            android.view.View r0 = r0.f2311a
            int r5 = r0.getId()
        L_0x0085:
            boolean r7 = r0.isFocused()
            if (r7 != 0) goto L_0x00a6
            boolean r7 = r0 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00a6
            boolean r7 = r0.hasFocus()
            if (r7 == 0) goto L_0x00a6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.getFocusedChild()
            int r7 = r0.getId()
            if (r7 == r6) goto L_0x0085
            int r5 = r0.getId()
            goto L_0x0085
        L_0x00a6:
            r4.f2406n = r5
        L_0x00a8:
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            boolean r4 = r0.f2402j
            if (r4 == 0) goto L_0x00b4
            boolean r4 = r10.z0
            if (r4 == 0) goto L_0x00b4
            r4 = r1
            goto L_0x00b5
        L_0x00b4:
            r4 = r2
        L_0x00b5:
            r0.f2401h = r4
            r10.z0 = r2
            r10.f2300y0 = r2
            boolean r4 = r0.f2403k
            r0.g = r4
            androidx.recyclerview.widget.RecyclerView$f r4 = r10.A
            int r4 = r4.a()
            r0.f2399e = r4
            int[] r0 = r10.E0
            r10.E(r0)
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            boolean r0 = r0.f2402j
            if (r0 == 0) goto L_0x013c
            androidx.recyclerview.widget.b r0 = r10.f2289t
            int r0 = r0.e()
            r4 = r2
        L_0x00d9:
            if (r4 >= r0) goto L_0x013c
            androidx.recyclerview.widget.b r5 = r10.f2289t
            android.view.View r5 = r5.d(r4)
            androidx.recyclerview.widget.RecyclerView$b0 r5 = K(r5)
            boolean r7 = r5.t()
            if (r7 != 0) goto L_0x0139
            boolean r7 = r5.j()
            if (r7 == 0) goto L_0x00f8
            androidx.recyclerview.widget.RecyclerView$f r7 = r10.A
            boolean r7 = r7.f2331b
            if (r7 != 0) goto L_0x00f8
            goto L_0x0139
        L_0x00f8:
            androidx.recyclerview.widget.RecyclerView$k r7 = r10.f2272d0
            androidx.recyclerview.widget.RecyclerView.k.b(r5)
            r5.f()
            java.util.Objects.requireNonNull(r7)
            androidx.recyclerview.widget.RecyclerView$k$c r7 = new androidx.recyclerview.widget.RecyclerView$k$c
            r7.<init>()
            r7.a(r5)
            androidx.recyclerview.widget.c0 r8 = r10.f2291u
            r8.c(r5, r7)
            androidx.recyclerview.widget.RecyclerView$y r7 = r10.f2294v0
            boolean r7 = r7.f2401h
            if (r7 == 0) goto L_0x0139
            boolean r7 = r5.o()
            if (r7 == 0) goto L_0x0139
            boolean r7 = r5.l()
            if (r7 != 0) goto L_0x0139
            boolean r7 = r5.t()
            if (r7 != 0) goto L_0x0139
            boolean r7 = r5.j()
            if (r7 != 0) goto L_0x0139
            long r7 = r10.I(r5)
            androidx.recyclerview.widget.c0 r9 = r10.f2291u
            s.d<androidx.recyclerview.widget.RecyclerView$b0> r9 = r9.f2474b
            r9.i(r7, r5)
        L_0x0139:
            int r4 = r4 + 1
            goto L_0x00d9
        L_0x013c:
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            boolean r0 = r0.f2403k
            r4 = 2
            if (r0 == 0) goto L_0x01eb
            androidx.recyclerview.widget.b r0 = r10.f2289t
            int r0 = r0.h()
            r5 = r2
        L_0x014a:
            if (r5 >= r0) goto L_0x0167
            androidx.recyclerview.widget.b r7 = r10.f2289t
            android.view.View r7 = r7.g(r5)
            androidx.recyclerview.widget.RecyclerView$b0 r7 = K(r7)
            boolean r8 = r7.t()
            if (r8 != 0) goto L_0x0164
            int r8 = r7.f2314d
            if (r8 != r6) goto L_0x0164
            int r8 = r7.f2313c
            r7.f2314d = r8
        L_0x0164:
            int r5 = r5 + 1
            goto L_0x014a
        L_0x0167:
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            boolean r5 = r0.f2400f
            r0.f2400f = r2
            androidx.recyclerview.widget.RecyclerView$n r6 = r10.B
            androidx.recyclerview.widget.RecyclerView$t r7 = r10.f2269b
            r6.h0(r7, r0)
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            r0.f2400f = r5
            r0 = r2
        L_0x0179:
            androidx.recyclerview.widget.b r5 = r10.f2289t
            int r5 = r5.e()
            if (r0 >= r5) goto L_0x01e7
            androidx.recyclerview.widget.b r5 = r10.f2289t
            android.view.View r5 = r5.d(r0)
            androidx.recyclerview.widget.RecyclerView$b0 r5 = K(r5)
            boolean r6 = r5.t()
            if (r6 == 0) goto L_0x0192
            goto L_0x01e4
        L_0x0192:
            androidx.recyclerview.widget.c0 r6 = r10.f2291u
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r6 = r6.f2473a
            java.lang.Object r6 = r6.getOrDefault(r5, r3)
            androidx.recyclerview.widget.c0$a r6 = (androidx.recyclerview.widget.c0.a) r6
            if (r6 == 0) goto L_0x01a6
            int r6 = r6.f2476a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x01a6
            r6 = r1
            goto L_0x01a7
        L_0x01a6:
            r6 = r2
        L_0x01a7:
            if (r6 != 0) goto L_0x01e4
            androidx.recyclerview.widget.RecyclerView.k.b(r5)
            r6 = 8192(0x2000, float:1.14794E-41)
            boolean r6 = r5.g(r6)
            androidx.recyclerview.widget.RecyclerView$k r7 = r10.f2272d0
            r5.f()
            java.util.Objects.requireNonNull(r7)
            androidx.recyclerview.widget.RecyclerView$k$c r7 = new androidx.recyclerview.widget.RecyclerView$k$c
            r7.<init>()
            r7.a(r5)
            if (r6 == 0) goto L_0x01c8
            r10.Y(r5, r7)
            goto L_0x01e4
        L_0x01c8:
            androidx.recyclerview.widget.c0 r6 = r10.f2291u
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r8 = r6.f2473a
            java.lang.Object r8 = r8.getOrDefault(r5, r3)
            androidx.recyclerview.widget.c0$a r8 = (androidx.recyclerview.widget.c0.a) r8
            if (r8 != 0) goto L_0x01dd
            androidx.recyclerview.widget.c0$a r8 = androidx.recyclerview.widget.c0.a.a()
            s.g<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.c0$a> r6 = r6.f2473a
            r6.put(r5, r8)
        L_0x01dd:
            int r5 = r8.f2476a
            r5 = r5 | r4
            r8.f2476a = r5
            r8.f2477b = r7
        L_0x01e4:
            int r0 = r0 + 1
            goto L_0x0179
        L_0x01e7:
            r10.l()
            goto L_0x01ee
        L_0x01eb:
            r10.l()
        L_0x01ee:
            r10.T(r1)
            r10.j0(r2)
            androidx.recyclerview.widget.RecyclerView$y r0 = r10.f2294v0
            r0.f2398d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r():void");
    }

    public final void removeDetachedView(View view, boolean z10) {
        b0 K2 = K(view);
        if (K2 != null) {
            if (K2.n()) {
                K2.f2318j &= -257;
            } else if (!K2.t()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(K2);
                throw new IllegalArgumentException(android.support.v4.media.a.c(this, sb2));
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z10);
    }

    public final void requestChildFocus(View view, View view2) {
        x xVar = this.B.g;
        boolean z10 = true;
        if (!(xVar != null && xVar.f2386e) && !O()) {
            z10 = false;
        }
        if (!z10 && view2 != null) {
            a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.B.s0(this, view, rect, z10, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).c();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void requestLayout() {
        if (this.K != 0 || this.M) {
            this.L = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        h0();
        S();
        this.f2294v0.a(6);
        this.f2287s.c();
        this.f2294v0.f2399e = this.A.a();
        this.f2294v0.f2397c = 0;
        if (this.f2270c != null) {
            f fVar = this.A;
            Objects.requireNonNull(fVar);
            int i10 = e.f2329a[fVar.f2332c.ordinal()];
            if (i10 != 1 && (i10 != 2 || fVar.a() > 0)) {
                Parcelable parcelable = this.f2270c.f2381c;
                if (parcelable != null) {
                    this.B.k0(parcelable);
                }
                this.f2270c = null;
            }
        }
        y yVar = this.f2294v0;
        yVar.g = false;
        this.B.h0(this.f2269b, yVar);
        y yVar2 = this.f2294v0;
        yVar2.f2400f = false;
        yVar2.f2402j = yVar2.f2402j && this.f2272d0 != null;
        yVar2.f2398d = 4;
        T(true);
        j0(false);
    }

    public final void scrollBy(int i10, int i11) {
        n nVar = this.B;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.M) {
            boolean e10 = nVar.e();
            boolean f10 = this.B.f();
            if (e10 || f10) {
                if (!e10) {
                    i10 = 0;
                }
                if (!f10) {
                    i11 = 0;
                }
                c0(i10, i11, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (O()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i10 = contentChangeTypes;
            }
            this.O |= i10;
            i10 = 1;
        }
        if (i10 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(x xVar) {
        this.C0 = xVar;
        n0.x.p(this, xVar);
    }

    public void setAdapter(f fVar) {
        setLayoutFrozen(false);
        f fVar2 = this.A;
        if (fVar2 != null) {
            fVar2.f2330a.unregisterObserver(this.f2267a);
            Objects.requireNonNull(this.A);
        }
        Z();
        a aVar = this.f2287s;
        aVar.l(aVar.f2446b);
        aVar.l(aVar.f2447c);
        aVar.f2450f = 0;
        f fVar3 = this.A;
        this.A = fVar;
        if (fVar != null) {
            fVar.f2330a.registerObserver(this.f2267a);
            fVar.f(this);
        }
        n nVar = this.B;
        if (nVar != null) {
            nVar.W();
        }
        t tVar = this.f2269b;
        f fVar4 = this.A;
        tVar.b();
        s d10 = tVar.d();
        Objects.requireNonNull(d10);
        if (fVar3 != null) {
            d10.f2368b--;
        }
        if (d10.f2368b == 0) {
            for (int i10 = 0; i10 < d10.f2367a.size(); i10++) {
                d10.f2367a.valueAt(i10).f2369a.clear();
            }
        }
        if (fVar4 != null) {
            d10.f2368b++;
        }
        this.f2294v0.f2400f = true;
        X(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i iVar) {
        if (iVar != this.D0) {
            this.D0 = iVar;
            setChildrenDrawingOrderEnabled(iVar != null);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2293v) {
            N();
        }
        this.f2293v = z10;
        super.setClipToPadding(z10);
        if (this.J) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j jVar) {
        Objects.requireNonNull(jVar);
        this.V = jVar;
        N();
    }

    public void setHasFixedSize(boolean z10) {
        this.I = z10;
    }

    public void setItemAnimator(k kVar) {
        k kVar2 = this.f2272d0;
        if (kVar2 != null) {
            kVar2.f();
            this.f2272d0.f2333a = null;
        }
        this.f2272d0 = kVar;
        if (kVar != null) {
            kVar.f2333a = this.A0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        t tVar = this.f2269b;
        tVar.f2377e = i10;
        tVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public void setLayoutManager(n nVar) {
        if (nVar != this.B) {
            l0();
            if (this.B != null) {
                k kVar = this.f2272d0;
                if (kVar != null) {
                    kVar.f();
                }
                this.B.n0(this.f2269b);
                this.B.o0(this.f2269b);
                this.f2269b.b();
                if (this.H) {
                    n nVar2 = this.B;
                    nVar2.i = false;
                    nVar2.X(this);
                }
                this.B.C0((RecyclerView) null);
                this.B = null;
            } else {
                this.f2269b.b();
            }
            b bVar = this.f2289t;
            b.a aVar = bVar.f2460b;
            aVar.f2462a = 0;
            b.a aVar2 = aVar.f2463b;
            if (aVar2 != null) {
                aVar2.g();
            }
            int size = bVar.f2461c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                v vVar = (v) bVar.f2459a;
                Objects.requireNonNull(vVar);
                b0 K2 = K((View) bVar.f2461c.get(size));
                if (K2 != null) {
                    vVar.f2591a.f0(K2, K2.f2324p);
                    K2.f2324p = 0;
                }
                bVar.f2461c.remove(size);
            }
            v vVar2 = (v) bVar.f2459a;
            int b10 = vVar2.b();
            for (int i10 = 0; i10 < b10; i10++) {
                View a10 = vVar2.a(i10);
                vVar2.f2591a.p(a10);
                a10.clearAnimation();
            }
            vVar2.f2591a.removeAllViews();
            this.B = nVar;
            if (nVar != null) {
                if (nVar.f2343b == null) {
                    nVar.C0(this);
                    if (this.H) {
                        this.B.i = true;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("LayoutManager ");
                    sb2.append(nVar);
                    sb2.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(android.support.v4.media.a.c(nVar.f2343b, sb2));
                }
            }
            this.f2269b.l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        n0.j scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f8833d) {
            View view = scrollingChildHelper.f8832c;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
            x.i.z(view);
        }
        scrollingChildHelper.f8833d = z10;
    }

    public void setOnFlingListener(p pVar) {
        this.f2281m0 = pVar;
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.f2296w0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2286r0 = z10;
    }

    public void setRecycledViewPool(s sVar) {
        t tVar = this.f2269b;
        s sVar2 = tVar.g;
        if (sVar2 != null) {
            sVar2.f2368b--;
        }
        tVar.g = sVar;
        if (sVar != null && RecyclerView.this.getAdapter() != null) {
            tVar.g.f2368b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(u uVar) {
        this.C = uVar;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$r>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$r>, java.util.ArrayList] */
    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        x xVar;
        if (i10 != this.f2273e0) {
            this.f2273e0 = i10;
            if (i10 != 2) {
                this.f2288s0.c();
                n nVar = this.B;
                if (!(nVar == null || (xVar = nVar.g) == null)) {
                    xVar.d();
                }
            }
            n nVar2 = this.B;
            if (nVar2 != null) {
                nVar2.m0(i10);
            }
            r rVar = this.f2296w0;
            if (rVar != null) {
                rVar.a(this, i10);
            }
            ? r02 = this.f2298x0;
            if (r02 != 0) {
                int size = r02.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((r) this.f2298x0.get(size)).a(this, i10);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.f2280l0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f2280l0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(z zVar) {
        Objects.requireNonNull(this.f2269b);
    }

    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().h(i10, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public final void suppressLayout(boolean z10) {
        if (z10 != this.M) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.M = false;
                if (!(!this.L || this.B == null || this.A == null)) {
                    requestLayout();
                }
                this.L = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.M = true;
            this.N = true;
            l0();
        }
    }

    public final boolean t(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    public final void u(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, (int[]) null, 1, iArr2);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$r>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$r>, java.util.ArrayList] */
    public final void v(int i10, int i11) {
        this.U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        r rVar = this.f2296w0;
        if (rVar != null) {
            rVar.b(this, i10, i11);
        }
        ? r02 = this.f2298x0;
        if (r02 != 0) {
            int size = r02.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((r) this.f2298x0.get(size)).b(this, i10, i11);
            }
        }
        this.U--;
    }

    public final void w() {
        if (this.f2271c0 == null) {
            EdgeEffect a10 = this.V.a(this);
            this.f2271c0 = a10;
            if (this.f2293v) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void x() {
        if (this.W == null) {
            EdgeEffect a10 = this.V.a(this);
            this.W = a10;
            if (this.f2293v) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void y() {
        if (this.b0 == null) {
            EdgeEffect a10 = this.V.a(this);
            this.b0 = a10;
            if (this.f2293v) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void z() {
        if (this.f2268a0 == null) {
            EdgeEffect a10 = this.V.a(this);
            this.f2268a0 = a10;
            if (this.f2293v) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        this.f2267a = new v();
        this.f2269b = new t();
        this.f2291u = new c0();
        this.f2295w = new a();
        this.f2297x = new Rect();
        this.f2299y = new Rect();
        this.z = new RectF();
        this.D = new ArrayList();
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.K = 0;
        this.R = false;
        this.S = false;
        this.T = 0;
        this.U = 0;
        this.V = new j();
        this.f2272d0 = new k();
        this.f2273e0 = 0;
        this.f2274f0 = -1;
        this.f2284p0 = Float.MIN_VALUE;
        this.f2285q0 = Float.MIN_VALUE;
        this.f2286r0 = true;
        this.f2288s0 = new a0();
        this.f2292u0 = new m.b();
        this.f2294v0 = new y();
        this.f2300y0 = false;
        this.z0 = false;
        this.A0 = new l();
        this.B0 = false;
        char c10 = 2;
        this.E0 = new int[2];
        this.G0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new ArrayList();
        this.K0 = new b();
        this.M0 = 0;
        this.N0 = 0;
        this.O0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2280l0 = viewConfiguration.getScaledTouchSlop();
        this.f2284p0 = n0.z.b(viewConfiguration, context2);
        this.f2285q0 = n0.z.d(viewConfiguration, context2);
        this.f2282n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2283o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2272d0.f2333a = this.A0;
        this.f2287s = new a(new w(this));
        this.f2289t = new b(new v(this));
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f8842a;
        int i12 = Build.VERSION.SDK_INT;
        if ((i12 >= 26 ? x.l.b(this) : 0) == 0 && i12 >= 26) {
            x.l.l(this, 8);
        }
        if (x.d.c(this) == 0) {
            x.d.s(this, 1);
        }
        this.Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new x(this));
        int[] iArr = aa.b.A;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        n0.x.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2293v = obtainStyledAttributes.getBoolean(1, true);
        int i13 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(android.support.v4.media.a.c(this, a.a.d("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            new l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            i13 = 4;
            c10 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(n.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(Q0);
                        Object[] objArr2 = new Object[i13];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c10] = Integer.valueOf(i10);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        noSuchMethodException = e10;
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((n) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e16);
                }
            }
        }
        int[] iArr2 = P0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i11, 0);
        n0.x.o(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    public static class w extends s0.a {
        public static final Parcelable.Creator<w> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Parcelable f2381c;

        public class a implements Parcelable.ClassLoaderCreator<w> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new w(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new w[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new w(parcel, (ClassLoader) null);
            }
        }

        public w(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2381c = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeParcelable(this.f2381c, 0);
        }

        public w(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public b0 f2363a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f2364b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f2365c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2366d = false;

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int a() {
            return this.f2363a.e();
        }

        public final boolean b() {
            return this.f2363a.o();
        }

        public final boolean c() {
            return this.f2363a.l();
        }

        public o(int i, int i10) {
            super(i, i10);
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public o(o oVar) {
            super(oVar);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.B;
        if (nVar != null) {
            return nVar.v(layoutParams);
        }
        throw new IllegalStateException(android.support.v4.media.a.c(this, a.a.d("RecyclerView has no LayoutManager")));
    }
}
