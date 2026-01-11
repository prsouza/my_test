package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.helpers.MessageFormatter;

public class StaggeredGridLayoutManager extends RecyclerView.n implements RecyclerView.x.b {
    public BitSet A;
    public int B;
    public int C;
    public d D;
    public int E;
    public boolean F;
    public boolean G;
    public e H;
    public final Rect I;
    public final b J;
    public boolean K;
    public int[] L;
    public final a M;

    /* renamed from: r  reason: collision with root package name */
    public int f2407r = -1;

    /* renamed from: s  reason: collision with root package name */
    public f[] f2408s;

    /* renamed from: t  reason: collision with root package name */
    public s f2409t;

    /* renamed from: u  reason: collision with root package name */
    public s f2410u;

    /* renamed from: v  reason: collision with root package name */
    public int f2411v;

    /* renamed from: w  reason: collision with root package name */
    public int f2412w;

    /* renamed from: x  reason: collision with root package name */
    public final n f2413x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2414y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            StaggeredGridLayoutManager.this.K0();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2416a;

        /* renamed from: b  reason: collision with root package name */
        public int f2417b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2418c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2419d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2420e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f2421f;

        public b() {
            b();
        }

        public final void a() {
            int i;
            if (this.f2418c) {
                i = StaggeredGridLayoutManager.this.f2409t.g();
            } else {
                i = StaggeredGridLayoutManager.this.f2409t.k();
            }
            this.f2417b = i;
        }

        public final void b() {
            this.f2416a = -1;
            this.f2417b = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            this.f2418c = false;
            this.f2419d = false;
            this.f2420e = false;
            int[] iArr = this.f2421f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.o {

        /* renamed from: e  reason: collision with root package name */
        public f f2422e;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i, int i10) {
            super(i, i10);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2429a;

        /* renamed from: b  reason: collision with root package name */
        public int f2430b;

        /* renamed from: c  reason: collision with root package name */
        public int f2431c;

        /* renamed from: s  reason: collision with root package name */
        public int[] f2432s;

        /* renamed from: t  reason: collision with root package name */
        public int f2433t;

        /* renamed from: u  reason: collision with root package name */
        public int[] f2434u;

        /* renamed from: v  reason: collision with root package name */
        public List<d.a> f2435v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f2436w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f2437x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f2438y;

        public class a implements Parcelable.Creator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public final Object[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2429a);
            parcel.writeInt(this.f2430b);
            parcel.writeInt(this.f2431c);
            if (this.f2431c > 0) {
                parcel.writeIntArray(this.f2432s);
            }
            parcel.writeInt(this.f2433t);
            if (this.f2433t > 0) {
                parcel.writeIntArray(this.f2434u);
            }
            parcel.writeInt(this.f2436w ? 1 : 0);
            parcel.writeInt(this.f2437x ? 1 : 0);
            parcel.writeInt(this.f2438y ? 1 : 0);
            parcel.writeList(this.f2435v);
        }

        public e(Parcel parcel) {
            this.f2429a = parcel.readInt();
            this.f2430b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2431c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2432s = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2433t = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2434u = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f2436w = parcel.readInt() == 1;
            this.f2437x = parcel.readInt() == 1;
            this.f2438y = parcel.readInt() == 1 ? true : z;
            this.f2435v = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2431c = eVar.f2431c;
            this.f2429a = eVar.f2429a;
            this.f2430b = eVar.f2430b;
            this.f2432s = eVar.f2432s;
            this.f2433t = eVar.f2433t;
            this.f2434u = eVar.f2434u;
            this.f2436w = eVar.f2436w;
            this.f2437x = eVar.f2437x;
            this.f2438y = eVar.f2438y;
            this.f2435v = eVar.f2435v;
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f2439a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2440b = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

        /* renamed from: c  reason: collision with root package name */
        public int f2441c = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

        /* renamed from: d  reason: collision with root package name */
        public int f2442d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f2443e;

        public f(int i) {
            this.f2443e = i;
        }

        public final void a(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f2422e = this;
            this.f2439a.add(view);
            this.f2441c = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            if (this.f2439a.size() == 1) {
                this.f2440b = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            }
            if (cVar.c() || cVar.b()) {
                this.f2442d = StaggeredGridLayoutManager.this.f2409t.c(view) + this.f2442d;
            }
        }

        public final void b() {
            ArrayList<View> arrayList = this.f2439a;
            View view = arrayList.get(arrayList.size() - 1);
            c j10 = j(view);
            this.f2441c = StaggeredGridLayoutManager.this.f2409t.b(view);
            Objects.requireNonNull(j10);
        }

        public final void c() {
            View view = this.f2439a.get(0);
            c j10 = j(view);
            this.f2440b = StaggeredGridLayoutManager.this.f2409t.e(view);
            Objects.requireNonNull(j10);
        }

        public final void d() {
            this.f2439a.clear();
            this.f2440b = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            this.f2441c = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            this.f2442d = 0;
        }

        public final int e() {
            if (StaggeredGridLayoutManager.this.f2414y) {
                return g(this.f2439a.size() - 1, -1);
            }
            return g(0, this.f2439a.size());
        }

        public final int f() {
            if (StaggeredGridLayoutManager.this.f2414y) {
                return g(0, this.f2439a.size());
            }
            return g(this.f2439a.size() - 1, -1);
        }

        public final int g(int i, int i10) {
            int k10 = StaggeredGridLayoutManager.this.f2409t.k();
            int g = StaggeredGridLayoutManager.this.f2409t.g();
            int i11 = i10 > i ? 1 : -1;
            while (i != i10) {
                View view = this.f2439a.get(i);
                int e10 = StaggeredGridLayoutManager.this.f2409t.e(view);
                int b10 = StaggeredGridLayoutManager.this.f2409t.b(view);
                boolean z = false;
                boolean z10 = e10 <= g;
                if (b10 >= k10) {
                    z = true;
                }
                if (z10 && z && (e10 < k10 || b10 > g)) {
                    return StaggeredGridLayoutManager.this.N(view);
                }
                i += i11;
            }
            return -1;
        }

        public final int h(int i) {
            int i10 = this.f2441c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f2439a.size() == 0) {
                return i;
            }
            b();
            return this.f2441c;
        }

        public final View i(int i, int i10) {
            View view = null;
            if (i10 != -1) {
                int size = this.f2439a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2439a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2414y && staggeredGridLayoutManager.N(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2414y && staggeredGridLayoutManager2.N(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2439a.size();
                int i11 = 0;
                while (i11 < size2) {
                    View view3 = this.f2439a.get(i11);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2414y && staggeredGridLayoutManager3.N(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2414y && staggeredGridLayoutManager4.N(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i11++;
                    view = view3;
                }
            }
            return view;
        }

        public final c j(View view) {
            return (c) view.getLayoutParams();
        }

        public final int k(int i) {
            int i10 = this.f2440b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f2439a.size() == 0) {
                return i;
            }
            c();
            return this.f2440b;
        }

        public final void l() {
            int size = this.f2439a.size();
            View remove = this.f2439a.remove(size - 1);
            c j10 = j(remove);
            j10.f2422e = null;
            if (j10.c() || j10.b()) {
                this.f2442d -= StaggeredGridLayoutManager.this.f2409t.c(remove);
            }
            if (size == 1) {
                this.f2440b = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            }
            this.f2441c = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        }

        public final void m() {
            View remove = this.f2439a.remove(0);
            c j10 = j(remove);
            j10.f2422e = null;
            if (this.f2439a.size() == 0) {
                this.f2441c = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            }
            if (j10.c() || j10.b()) {
                this.f2442d -= StaggeredGridLayoutManager.this.f2409t.c(remove);
            }
            this.f2440b = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        }

        public final void n(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f2422e = this;
            this.f2439a.add(0, view);
            this.f2440b = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            if (this.f2439a.size() == 1) {
                this.f2441c = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            }
            if (cVar.c() || cVar.b()) {
                this.f2442d = StaggeredGridLayoutManager.this.f2409t.c(view) + this.f2442d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f2414y = false;
        this.z = false;
        this.B = -1;
        this.C = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        this.D = new d();
        this.E = 2;
        this.I = new Rect();
        this.J = new b();
        this.K = true;
        this.M = new a();
        RecyclerView.n.d O = RecyclerView.n.O(context, attributeSet, i, i10);
        int i11 = O.f2359a;
        if (i11 == 0 || i11 == 1) {
            d((String) null);
            if (i11 != this.f2411v) {
                this.f2411v = i11;
                s sVar = this.f2409t;
                this.f2409t = this.f2410u;
                this.f2410u = sVar;
                t0();
            }
            int i12 = O.f2360b;
            d((String) null);
            if (i12 != this.f2407r) {
                this.D.a();
                t0();
                this.f2407r = i12;
                this.A = new BitSet(this.f2407r);
                this.f2408s = new f[this.f2407r];
                for (int i13 = 0; i13 < this.f2407r; i13++) {
                    this.f2408s[i13] = new f(i13);
                }
                t0();
            }
            boolean z10 = O.f2361c;
            d((String) null);
            e eVar = this.H;
            if (!(eVar == null || eVar.f2436w == z10)) {
                eVar.f2436w = z10;
            }
            this.f2414y = z10;
            t0();
            this.f2413x = new n();
            this.f2409t = s.a(this, this.f2411v);
            this.f2410u = s.a(this, 1 - this.f2411v);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public final void A0(Rect rect, int i, int i10) {
        int i11;
        int i12;
        int L2 = L() + K();
        int J2 = J() + M();
        if (this.f2411v == 1) {
            i12 = RecyclerView.n.h(i10, rect.height() + J2, H());
            i11 = RecyclerView.n.h(i, (this.f2412w * this.f2407r) + L2, I());
        } else {
            i11 = RecyclerView.n.h(i, rect.width() + L2, I());
            i12 = RecyclerView.n.h(i10, (this.f2412w * this.f2407r) + J2, H());
        }
        z0(i11, i12);
    }

    public final void G0(RecyclerView recyclerView, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.f2382a = i;
        H0(oVar);
    }

    public final boolean I0() {
        return this.H == null;
    }

    public final int J0(int i) {
        if (x() != 0) {
            if ((i < T0()) != this.z) {
                return -1;
            }
            return 1;
        } else if (this.z) {
            return 1;
        } else {
            return -1;
        }
    }

    public final boolean K0() {
        int i;
        if (!(x() == 0 || this.E == 0 || !this.i)) {
            if (this.z) {
                i = U0();
                T0();
            } else {
                i = T0();
                U0();
            }
            if (i == 0 && Y0() != null) {
                this.D.a();
                this.f2348h = true;
                t0();
                return true;
            }
        }
        return false;
    }

    public final int L0(RecyclerView.y yVar) {
        if (x() == 0) {
            return 0;
        }
        return y.a(yVar, this.f2409t, Q0(!this.K), P0(!this.K), this, this.K);
    }

    public final int M0(RecyclerView.y yVar) {
        if (x() == 0) {
            return 0;
        }
        return y.b(yVar, this.f2409t, Q0(!this.K), P0(!this.K), this, this.K, this.z);
    }

    public final int N0(RecyclerView.y yVar) {
        if (x() == 0) {
            return 0;
        }
        return y.c(yVar, this.f2409t, Q0(!this.K), P0(!this.K), this, this.K);
    }

    public final int O0(RecyclerView.t tVar, n nVar, RecyclerView.y yVar) {
        int i;
        int i10;
        int i11;
        f fVar;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        RecyclerView.t tVar2 = tVar;
        n nVar2 = nVar;
        int i20 = 0;
        this.A.set(0, this.f2407r, true);
        if (this.f2413x.i) {
            i = nVar2.f2574e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        } else {
            if (nVar2.f2574e == 1) {
                i19 = nVar2.g + nVar2.f2571b;
            } else {
                i19 = nVar2.f2575f - nVar2.f2571b;
            }
            i = i19;
        }
        k1(nVar2.f2574e, i);
        if (this.z) {
            i10 = this.f2409t.g();
        } else {
            i10 = this.f2409t.k();
        }
        int i21 = i10;
        boolean z11 = false;
        while (true) {
            int i22 = nVar2.f2572c;
            int i23 = -1;
            if (((i22 < 0 || i22 >= yVar.b()) ? i20 : 1) == 0 || (!this.f2413x.i && this.A.isEmpty())) {
                int i24 = i20;
            } else {
                View view = tVar2.j(nVar2.f2572c, Long.MAX_VALUE).f2311a;
                nVar2.f2572c += nVar2.f2573d;
                c cVar = (c) view.getLayoutParams();
                int a10 = cVar.a();
                int[] iArr = this.D.f2423a;
                int i25 = (iArr == null || a10 >= iArr.length) ? -1 : iArr[a10];
                if ((i25 == -1 ? 1 : i20) != 0) {
                    if (c1(nVar2.f2574e)) {
                        i17 = this.f2407r - 1;
                        i18 = -1;
                    } else {
                        i23 = this.f2407r;
                        i17 = i20;
                        i18 = 1;
                    }
                    f fVar2 = null;
                    if (nVar2.f2574e == 1) {
                        int k10 = this.f2409t.k();
                        int i26 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        while (i17 != i23) {
                            f fVar3 = this.f2408s[i17];
                            int h10 = fVar3.h(k10);
                            if (h10 < i26) {
                                i26 = h10;
                                fVar2 = fVar3;
                            }
                            i17 += i18;
                        }
                    } else {
                        int g = this.f2409t.g();
                        int i27 = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                        while (i17 != i23) {
                            f fVar4 = this.f2408s[i17];
                            int k11 = fVar4.k(g);
                            if (k11 > i27) {
                                fVar2 = fVar4;
                                i27 = k11;
                            }
                            i17 += i18;
                        }
                    }
                    fVar = fVar2;
                    d dVar = this.D;
                    dVar.b(a10);
                    dVar.f2423a[a10] = fVar.f2443e;
                } else {
                    fVar = this.f2408s[i25];
                }
                f fVar5 = fVar;
                cVar.f2422e = fVar5;
                if (nVar2.f2574e == 1) {
                    b(view);
                    z10 = false;
                } else {
                    z10 = false;
                    c(view, 0, false);
                }
                if (this.f2411v == 1) {
                    a1(view, RecyclerView.n.y(this.f2412w, this.f2353n, z10 ? 1 : 0, cVar.width, z10), RecyclerView.n.y(this.f2356q, this.f2354o, J() + M(), cVar.height, true), z10);
                } else {
                    a1(view, RecyclerView.n.y(this.f2355p, this.f2353n, L() + K(), cVar.width, true), RecyclerView.n.y(this.f2412w, this.f2354o, 0, cVar.height, false), false);
                }
                if (nVar2.f2574e == 1) {
                    int h11 = fVar5.h(i21);
                    i13 = h11;
                    i12 = this.f2409t.c(view) + h11;
                } else {
                    int k12 = fVar5.k(i21);
                    i12 = k12;
                    i13 = k12 - this.f2409t.c(view);
                }
                if (nVar2.f2574e == 1) {
                    cVar.f2422e.a(view);
                } else {
                    cVar.f2422e.n(view);
                }
                if (!Z0() || this.f2411v != 1) {
                    i14 = this.f2410u.k() + (fVar5.f2443e * this.f2412w);
                    i15 = this.f2410u.c(view) + i14;
                } else {
                    i15 = this.f2410u.g() - (((this.f2407r - 1) - fVar5.f2443e) * this.f2412w);
                    i14 = i15 - this.f2410u.c(view);
                }
                int i28 = i15;
                int i29 = i14;
                if (this.f2411v == 1) {
                    T(view, i29, i13, i28, i12);
                } else {
                    T(view, i13, i29, i12, i28);
                }
                m1(fVar5, this.f2413x.f2574e, i);
                e1(tVar2, this.f2413x);
                if (!this.f2413x.f2576h || !view.hasFocusable()) {
                    i16 = 0;
                } else {
                    i16 = 0;
                    this.A.set(fVar5.f2443e, false);
                }
                i20 = i16;
                z11 = true;
            }
        }
        int i242 = i20;
        if (!z11) {
            e1(tVar2, this.f2413x);
        }
        if (this.f2413x.f2574e == -1) {
            i11 = this.f2409t.k() - W0(this.f2409t.k());
        } else {
            i11 = V0(this.f2409t.g()) - this.f2409t.g();
        }
        return i11 > 0 ? Math.min(nVar2.f2571b, i11) : i242;
    }

    public final View P0(boolean z10) {
        int k10 = this.f2409t.k();
        int g = this.f2409t.g();
        View view = null;
        for (int x10 = x() - 1; x10 >= 0; x10--) {
            View w6 = w(x10);
            int e10 = this.f2409t.e(w6);
            int b10 = this.f2409t.b(w6);
            if (b10 > k10 && e10 < g) {
                if (b10 <= g || !z10) {
                    return w6;
                }
                if (view == null) {
                    view = w6;
                }
            }
        }
        return view;
    }

    public final View Q0(boolean z10) {
        int k10 = this.f2409t.k();
        int g = this.f2409t.g();
        int x10 = x();
        View view = null;
        for (int i = 0; i < x10; i++) {
            View w6 = w(i);
            int e10 = this.f2409t.e(w6);
            if (this.f2409t.b(w6) > k10 && e10 < g) {
                if (e10 >= k10 || !z10) {
                    return w6;
                }
                if (view == null) {
                    view = w6;
                }
            }
        }
        return view;
    }

    public final boolean R() {
        return this.E != 0;
    }

    public final void R0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g;
        int V0 = V0(LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
        if (V0 != Integer.MIN_VALUE && (g = this.f2409t.g() - V0) > 0) {
            int i = g - (-i1(-g, tVar, yVar));
            if (z10 && i > 0) {
                this.f2409t.p(i);
            }
        }
    }

    public final void S0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int W0 = W0(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (W0 != Integer.MAX_VALUE && (k10 = W0 - this.f2409t.k()) > 0) {
            int i12 = k10 - i1(k10, tVar, yVar);
            if (z10 && i12 > 0) {
                this.f2409t.p(-i12);
            }
        }
    }

    public final int T0() {
        if (x() == 0) {
            return 0;
        }
        return N(w(0));
    }

    public final void U(int i) {
        super.U(i);
        for (int i10 = 0; i10 < this.f2407r; i10++) {
            f fVar = this.f2408s[i10];
            int i11 = fVar.f2440b;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f2440b = i11 + i;
            }
            int i12 = fVar.f2441c;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2441c = i12 + i;
            }
        }
    }

    public final int U0() {
        int x10 = x();
        if (x10 == 0) {
            return 0;
        }
        return N(w(x10 - 1));
    }

    public final void V(int i) {
        super.V(i);
        for (int i10 = 0; i10 < this.f2407r; i10++) {
            f fVar = this.f2408s[i10];
            int i11 = fVar.f2440b;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f2440b = i11 + i;
            }
            int i12 = fVar.f2441c;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2441c = i12 + i;
            }
        }
    }

    public final int V0(int i) {
        int h10 = this.f2408s[0].h(i);
        for (int i10 = 1; i10 < this.f2407r; i10++) {
            int h11 = this.f2408s[i10].h(i);
            if (h11 > h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    public final void W() {
        this.D.a();
        for (int i = 0; i < this.f2407r; i++) {
            this.f2408s[i].d();
        }
    }

    public final int W0(int i) {
        int k10 = this.f2408s[0].k(i);
        for (int i10 = 1; i10 < this.f2407r; i10++) {
            int k11 = this.f2408s[i10].k(i);
            if (k11 < k10) {
                k10 = k11;
            }
        }
        return k10;
    }

    public final void X(RecyclerView recyclerView) {
        a aVar = this.M;
        RecyclerView recyclerView2 = this.f2343b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(aVar);
        }
        for (int i = 0; i < this.f2407r; i++) {
            this.f2408s[i].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void X0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.z
            if (r0 == 0) goto L_0x0009
            int r0 = r6.U0()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.T0()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.D
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.D
            r7.e(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.z
            if (r7 == 0) goto L_0x004d
            int r7 = r6.T0()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.U0()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.t0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X0(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r8.f2411v == 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r8.f2411v == 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (Z0() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        if (Z0() == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Y(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.t r11, androidx.recyclerview.widget.RecyclerView.y r12) {
        /*
            r8 = this;
            int r0 = r8.x()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.r(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.h1()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r10 == r2) goto L_0x004e
            r4 = 2
            if (r10 == r4) goto L_0x0042
            r4 = 17
            if (r10 == r4) goto L_0x003b
            r4 = 33
            if (r10 == r4) goto L_0x0036
            r4 = 66
            if (r10 == r4) goto L_0x0031
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            int r10 = r8.f2411v
            if (r10 != r2) goto L_0x0040
            goto L_0x0059
        L_0x0031:
            int r10 = r8.f2411v
            if (r10 != 0) goto L_0x0040
            goto L_0x0059
        L_0x0036:
            int r10 = r8.f2411v
            if (r10 != r2) goto L_0x0040
            goto L_0x005b
        L_0x003b:
            int r10 = r8.f2411v
            if (r10 != 0) goto L_0x0040
            goto L_0x005b
        L_0x0040:
            r10 = r0
            goto L_0x005c
        L_0x0042:
            int r10 = r8.f2411v
            if (r10 != r2) goto L_0x0047
            goto L_0x0059
        L_0x0047:
            boolean r10 = r8.Z0()
            if (r10 == 0) goto L_0x0059
            goto L_0x005b
        L_0x004e:
            int r10 = r8.f2411v
            if (r10 != r2) goto L_0x0053
            goto L_0x005b
        L_0x0053:
            boolean r10 = r8.Z0()
            if (r10 == 0) goto L_0x005b
        L_0x0059:
            r10 = r2
            goto L_0x005c
        L_0x005b:
            r10 = r3
        L_0x005c:
            if (r10 != r0) goto L_0x005f
            return r1
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r0
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f2422e
            if (r10 != r2) goto L_0x0071
            int r4 = r8.U0()
            goto L_0x0075
        L_0x0071:
            int r4 = r8.T0()
        L_0x0075:
            r8.l1(r4, r12)
            r8.j1(r10)
            androidx.recyclerview.widget.n r5 = r8.f2413x
            int r6 = r5.f2573d
            int r6 = r6 + r4
            r5.f2572c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.s r7 = r8.f2409t
            int r7 = r7.l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f2571b = r6
            androidx.recyclerview.widget.n r5 = r8.f2413x
            r5.f2576h = r2
            r6 = 0
            r5.f2570a = r6
            r8.O0(r11, r5, r12)
            boolean r11 = r8.z
            r8.F = r11
            android.view.View r11 = r0.i(r4, r10)
            if (r11 == 0) goto L_0x00a7
            if (r11 == r9) goto L_0x00a7
            return r11
        L_0x00a7:
            boolean r11 = r8.c1(r10)
            if (r11 == 0) goto L_0x00c2
            int r11 = r8.f2407r
            int r11 = r11 - r2
        L_0x00b0:
            if (r11 < 0) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2408s
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00bf
            if (r12 == r9) goto L_0x00bf
            return r12
        L_0x00bf:
            int r11 = r11 + -1
            goto L_0x00b0
        L_0x00c2:
            r11 = r6
        L_0x00c3:
            int r12 = r8.f2407r
            if (r11 >= r12) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2408s
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00d4
            if (r12 == r9) goto L_0x00d4
            return r12
        L_0x00d4:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00d7:
            boolean r11 = r8.f2414y
            r11 = r11 ^ r2
            if (r10 != r3) goto L_0x00de
            r12 = r2
            goto L_0x00df
        L_0x00de:
            r12 = r6
        L_0x00df:
            if (r11 != r12) goto L_0x00e3
            r11 = r2
            goto L_0x00e4
        L_0x00e3:
            r11 = r6
        L_0x00e4:
            if (r11 == 0) goto L_0x00eb
            int r12 = r0.e()
            goto L_0x00ef
        L_0x00eb:
            int r12 = r0.f()
        L_0x00ef:
            android.view.View r12 = r8.s(r12)
            if (r12 == 0) goto L_0x00f8
            if (r12 == r9) goto L_0x00f8
            return r12
        L_0x00f8:
            boolean r10 = r8.c1(r10)
            if (r10 == 0) goto L_0x0127
            int r10 = r8.f2407r
            int r10 = r10 - r2
        L_0x0101:
            if (r10 < 0) goto L_0x014a
            int r12 = r0.f2443e
            if (r10 != r12) goto L_0x0108
            goto L_0x0124
        L_0x0108:
            if (r11 == 0) goto L_0x0113
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2408s
            r12 = r12[r10]
            int r12 = r12.e()
            goto L_0x011b
        L_0x0113:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2408s
            r12 = r12[r10]
            int r12 = r12.f()
        L_0x011b:
            android.view.View r12 = r8.s(r12)
            if (r12 == 0) goto L_0x0124
            if (r12 == r9) goto L_0x0124
            return r12
        L_0x0124:
            int r10 = r10 + -1
            goto L_0x0101
        L_0x0127:
            int r10 = r8.f2407r
            if (r6 >= r10) goto L_0x014a
            if (r11 == 0) goto L_0x0136
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f2408s
            r10 = r10[r6]
            int r10 = r10.e()
            goto L_0x013e
        L_0x0136:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f2408s
            r10 = r10[r6]
            int r10 = r10.f()
        L_0x013e:
            android.view.View r10 = r8.s(r10)
            if (r10 == 0) goto L_0x0147
            if (r10 == r9) goto L_0x0147
            return r10
        L_0x0147:
            int r6 = r6 + 1
            goto L_0x0127
        L_0x014a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        if (r10 == r11) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r10 == r11) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Y0() {
        /*
            r12 = this;
            int r0 = r12.x()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2407r
            r2.<init>(r3)
            int r3 = r12.f2407r
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2411v
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.Z0()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.z
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00f4
            android.view.View r7 = r12.w(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2422e
            int r9 = r9.f2443e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2422e
            boolean r10 = r12.z
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x0073
            int r10 = r9.f2441c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.b()
            int r10 = r9.f2441c
        L_0x0056:
            androidx.recyclerview.widget.s r11 = r12.f2409t
            int r11 = r11.g()
            if (r10 >= r11) goto L_0x0096
            java.util.ArrayList<android.view.View> r10 = r9.f2439a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.j(r10)
            java.util.Objects.requireNonNull(r9)
            goto L_0x0094
        L_0x0073:
            int r10 = r9.f2440b
            if (r10 == r11) goto L_0x0078
            goto L_0x007d
        L_0x0078:
            r9.c()
            int r10 = r9.f2440b
        L_0x007d:
            androidx.recyclerview.widget.s r11 = r12.f2409t
            int r11 = r11.k()
            if (r10 <= r11) goto L_0x0096
            java.util.ArrayList<android.view.View> r10 = r9.f2439a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.j(r10)
            java.util.Objects.requireNonNull(r9)
        L_0x0094:
            r9 = r1
            goto L_0x0097
        L_0x0096:
            r9 = r4
        L_0x0097:
            if (r9 == 0) goto L_0x009a
            return r7
        L_0x009a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2422e
            int r9 = r9.f2443e
            r2.clear(r9)
        L_0x00a1:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00f1
            android.view.View r9 = r12.w(r9)
            boolean r10 = r12.z
            if (r10 == 0) goto L_0x00bf
            androidx.recyclerview.widget.s r10 = r12.f2409t
            int r10 = r10.b(r7)
            androidx.recyclerview.widget.s r11 = r12.f2409t
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00bc
            return r7
        L_0x00bc:
            if (r10 != r11) goto L_0x00d2
            goto L_0x00d0
        L_0x00bf:
            androidx.recyclerview.widget.s r10 = r12.f2409t
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.s r11 = r12.f2409t
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x00ce
            return r7
        L_0x00ce:
            if (r10 != r11) goto L_0x00d2
        L_0x00d0:
            r10 = r1
            goto L_0x00d3
        L_0x00d2:
            r10 = r4
        L_0x00d3:
            if (r10 == 0) goto L_0x00f1
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2422e
            int r8 = r8.f2443e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2422e
            int r9 = r9.f2443e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00e8
            r8 = r1
            goto L_0x00e9
        L_0x00e8:
            r8 = r4
        L_0x00e9:
            if (r3 >= 0) goto L_0x00ed
            r9 = r1
            goto L_0x00ee
        L_0x00ed:
            r9 = r4
        L_0x00ee:
            if (r8 == r9) goto L_0x00f1
            return r7
        L_0x00f1:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00f4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y0():android.view.View");
    }

    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (x() > 0) {
            View Q0 = Q0(false);
            View P0 = P0(false);
            if (Q0 != null && P0 != null) {
                int N = N(Q0);
                int N2 = N(P0);
                if (N < N2) {
                    accessibilityEvent.setFromIndex(N);
                    accessibilityEvent.setToIndex(N2);
                    return;
                }
                accessibilityEvent.setFromIndex(N2);
                accessibilityEvent.setToIndex(N);
            }
        }
    }

    public final boolean Z0() {
        return G() == 1;
    }

    public final PointF a(int i) {
        int J0 = J0(i);
        PointF pointF = new PointF();
        if (J0 == 0) {
            return null;
        }
        if (this.f2411v == 0) {
            pointF.x = (float) J0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) J0;
        }
        return pointF;
    }

    public final void a1(View view, int i, int i10, boolean z10) {
        Rect rect = this.I;
        RecyclerView recyclerView = this.f2343b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.L(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i11 = cVar.leftMargin;
        Rect rect2 = this.I;
        int n12 = n1(i, i11 + rect2.left, cVar.rightMargin + rect2.right);
        int i12 = cVar.topMargin;
        Rect rect3 = this.I;
        int n13 = n1(i10, i12 + rect3.top, cVar.bottomMargin + rect3.bottom);
        if (D0(view, n12, n13, cVar)) {
            view.measure(n12, n13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:232:0x040c, code lost:
        if (K0() != false) goto L_0x0410;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b1(androidx.recyclerview.widget.RecyclerView.t r12, androidx.recyclerview.widget.RecyclerView.y r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.J
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.H
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.B
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.b()
            if (r1 != 0) goto L_0x0018
            r11.n0(r12)
            r0.b()
            return
        L_0x0018:
            boolean r1 = r0.f2420e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r11.B
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.H
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01f8
            r0.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.H
            if (r6 == 0) goto L_0x00ba
            int r7 = r6.f2431c
            r8 = 0
            if (r7 <= 0) goto L_0x007d
            int r9 = r11.f2407r
            if (r7 != r9) goto L_0x006f
            r6 = r3
        L_0x003f:
            int r7 = r11.f2407r
            if (r6 >= r7) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f2408s
            r7 = r7[r6]
            r7.d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.H
            int[] r9 = r7.f2432s
            r9 = r9[r6]
            if (r9 == r5) goto L_0x0064
            boolean r7 = r7.f2437x
            if (r7 == 0) goto L_0x005d
            androidx.recyclerview.widget.s r7 = r11.f2409t
            int r7 = r7.g()
            goto L_0x0063
        L_0x005d:
            androidx.recyclerview.widget.s r7 = r11.f2409t
            int r7 = r7.k()
        L_0x0063:
            int r9 = r9 + r7
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f2408s
            r7 = r7[r6]
            r7.f2440b = r9
            r7.f2441c = r9
            int r6 = r6 + 1
            goto L_0x003f
        L_0x006f:
            r6.f2432s = r8
            r6.f2431c = r3
            r6.f2433t = r3
            r6.f2434u = r8
            r6.f2435v = r8
            int r7 = r6.f2430b
            r6.f2429a = r7
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.H
            boolean r7 = r6.f2438y
            r11.G = r7
            boolean r6 = r6.f2436w
            r11.d(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.H
            if (r7 == 0) goto L_0x0092
            boolean r8 = r7.f2436w
            if (r8 == r6) goto L_0x0092
            r7.f2436w = r6
        L_0x0092:
            r11.f2414y = r6
            r11.t0()
            r11.h1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.H
            int r7 = r6.f2429a
            if (r7 == r2) goto L_0x00a7
            r11.B = r7
            boolean r7 = r6.f2437x
            r0.f2418c = r7
            goto L_0x00ab
        L_0x00a7:
            boolean r7 = r11.z
            r0.f2418c = r7
        L_0x00ab:
            int r7 = r6.f2433t
            if (r7 <= r4) goto L_0x00c1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r11.D
            int[] r8 = r6.f2434u
            r7.f2423a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r6 = r6.f2435v
            r7.f2424b = r6
            goto L_0x00c1
        L_0x00ba:
            r11.h1()
            boolean r6 = r11.z
            r0.f2418c = r6
        L_0x00c1:
            boolean r6 = r13.g
            if (r6 != 0) goto L_0x01b5
            int r6 = r11.B
            if (r6 != r2) goto L_0x00cb
            goto L_0x01b5
        L_0x00cb:
            if (r6 < 0) goto L_0x01b1
            int r7 = r13.b()
            if (r6 < r7) goto L_0x00d5
            goto L_0x01b1
        L_0x00d5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.H
            if (r6 == 0) goto L_0x00ea
            int r7 = r6.f2429a
            if (r7 == r2) goto L_0x00ea
            int r6 = r6.f2431c
            if (r6 >= r4) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            r0.f2417b = r5
            int r6 = r11.B
            r0.f2416a = r6
            goto L_0x01af
        L_0x00ea:
            int r6 = r11.B
            android.view.View r6 = r11.s(r6)
            if (r6 == 0) goto L_0x017b
            boolean r7 = r11.z
            if (r7 == 0) goto L_0x00fb
            int r7 = r11.U0()
            goto L_0x00ff
        L_0x00fb:
            int r7 = r11.T0()
        L_0x00ff:
            r0.f2416a = r7
            int r7 = r11.C
            if (r7 == r5) goto L_0x0131
            boolean r7 = r0.f2418c
            if (r7 == 0) goto L_0x011d
            androidx.recyclerview.widget.s r7 = r11.f2409t
            int r7 = r7.g()
            int r8 = r11.C
            int r7 = r7 - r8
            androidx.recyclerview.widget.s r8 = r11.f2409t
            int r6 = r8.b(r6)
            int r7 = r7 - r6
            r0.f2417b = r7
            goto L_0x01af
        L_0x011d:
            androidx.recyclerview.widget.s r7 = r11.f2409t
            int r7 = r7.k()
            int r8 = r11.C
            int r7 = r7 + r8
            androidx.recyclerview.widget.s r8 = r11.f2409t
            int r6 = r8.e(r6)
            int r7 = r7 - r6
            r0.f2417b = r7
            goto L_0x01af
        L_0x0131:
            androidx.recyclerview.widget.s r7 = r11.f2409t
            int r7 = r7.c(r6)
            androidx.recyclerview.widget.s r8 = r11.f2409t
            int r8 = r8.l()
            if (r7 <= r8) goto L_0x0153
            boolean r6 = r0.f2418c
            if (r6 == 0) goto L_0x014a
            androidx.recyclerview.widget.s r6 = r11.f2409t
            int r6 = r6.g()
            goto L_0x0150
        L_0x014a:
            androidx.recyclerview.widget.s r6 = r11.f2409t
            int r6 = r6.k()
        L_0x0150:
            r0.f2417b = r6
            goto L_0x01af
        L_0x0153:
            androidx.recyclerview.widget.s r7 = r11.f2409t
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.s r8 = r11.f2409t
            int r8 = r8.k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x0166
            int r6 = -r7
            r0.f2417b = r6
            goto L_0x01af
        L_0x0166:
            androidx.recyclerview.widget.s r7 = r11.f2409t
            int r7 = r7.g()
            androidx.recyclerview.widget.s r8 = r11.f2409t
            int r6 = r8.b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x0178
            r0.f2417b = r7
            goto L_0x01af
        L_0x0178:
            r0.f2417b = r5
            goto L_0x01af
        L_0x017b:
            int r6 = r11.B
            r0.f2416a = r6
            int r7 = r11.C
            if (r7 != r5) goto L_0x0192
            int r6 = r11.J0(r6)
            if (r6 != r4) goto L_0x018b
            r6 = r4
            goto L_0x018c
        L_0x018b:
            r6 = r3
        L_0x018c:
            r0.f2418c = r6
            r0.a()
            goto L_0x01ad
        L_0x0192:
            boolean r6 = r0.f2418c
            if (r6 == 0) goto L_0x01a2
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r6 = r6.f2409t
            int r6 = r6.g()
            int r6 = r6 - r7
            r0.f2417b = r6
            goto L_0x01ad
        L_0x01a2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r6 = r6.f2409t
            int r6 = r6.k()
            int r6 = r6 + r7
            r0.f2417b = r6
        L_0x01ad:
            r0.f2419d = r4
        L_0x01af:
            r6 = r4
            goto L_0x01b6
        L_0x01b1:
            r11.B = r2
            r11.C = r5
        L_0x01b5:
            r6 = r3
        L_0x01b6:
            if (r6 == 0) goto L_0x01b9
            goto L_0x01f6
        L_0x01b9:
            boolean r6 = r11.F
            if (r6 == 0) goto L_0x01d5
            int r6 = r13.b()
            int r7 = r11.x()
        L_0x01c5:
            int r7 = r7 + r2
            if (r7 < 0) goto L_0x01f1
            android.view.View r8 = r11.w(r7)
            int r8 = r11.N(r8)
            if (r8 < 0) goto L_0x01c5
            if (r8 >= r6) goto L_0x01c5
            goto L_0x01f2
        L_0x01d5:
            int r6 = r13.b()
            int r7 = r11.x()
            r8 = r3
        L_0x01de:
            if (r8 >= r7) goto L_0x01f1
            android.view.View r9 = r11.w(r8)
            int r9 = r11.N(r9)
            if (r9 < 0) goto L_0x01ee
            if (r9 >= r6) goto L_0x01ee
            r8 = r9
            goto L_0x01f2
        L_0x01ee:
            int r8 = r8 + 1
            goto L_0x01de
        L_0x01f1:
            r8 = r3
        L_0x01f2:
            r0.f2416a = r8
            r0.f2417b = r5
        L_0x01f6:
            r0.f2420e = r4
        L_0x01f8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.H
            if (r6 != 0) goto L_0x0215
            int r6 = r11.B
            if (r6 != r2) goto L_0x0215
            boolean r6 = r0.f2418c
            boolean r7 = r11.F
            if (r6 != r7) goto L_0x020e
            boolean r6 = r11.Z0()
            boolean r7 = r11.G
            if (r6 == r7) goto L_0x0215
        L_0x020e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r6 = r11.D
            r6.a()
            r0.f2419d = r4
        L_0x0215:
            int r6 = r11.x()
            if (r6 <= 0) goto L_0x02cd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.H
            if (r6 == 0) goto L_0x0223
            int r6 = r6.f2431c
            if (r6 >= r4) goto L_0x02cd
        L_0x0223:
            boolean r6 = r0.f2419d
            if (r6 == 0) goto L_0x0242
            r1 = r3
        L_0x0228:
            int r6 = r11.f2407r
            if (r1 >= r6) goto L_0x02cd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2408s
            r6 = r6[r1]
            r6.d()
            int r6 = r0.f2417b
            if (r6 == r5) goto L_0x023f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f2408s
            r7 = r7[r1]
            r7.f2440b = r6
            r7.f2441c = r6
        L_0x023f:
            int r1 = r1 + 1
            goto L_0x0228
        L_0x0242:
            if (r1 != 0) goto L_0x0264
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.J
            int[] r1 = r1.f2421f
            if (r1 != 0) goto L_0x024b
            goto L_0x0264
        L_0x024b:
            r1 = r3
        L_0x024c:
            int r6 = r11.f2407r
            if (r1 >= r6) goto L_0x02cd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2408s
            r6 = r6[r1]
            r6.d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.J
            int[] r7 = r7.f2421f
            r7 = r7[r1]
            r6.f2440b = r7
            r6.f2441c = r7
            int r1 = r1 + 1
            goto L_0x024c
        L_0x0264:
            r1 = r3
        L_0x0265:
            int r6 = r11.f2407r
            if (r1 >= r6) goto L_0x02a5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2408s
            r6 = r6[r1]
            boolean r7 = r11.z
            int r8 = r0.f2417b
            if (r7 == 0) goto L_0x0278
            int r9 = r6.h(r5)
            goto L_0x027c
        L_0x0278:
            int r9 = r6.k(r5)
        L_0x027c:
            r6.d()
            if (r9 != r5) goto L_0x0282
            goto L_0x02a2
        L_0x0282:
            if (r7 == 0) goto L_0x028e
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r10 = r10.f2409t
            int r10 = r10.g()
            if (r9 < r10) goto L_0x02a2
        L_0x028e:
            if (r7 != 0) goto L_0x029b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r7 = r7.f2409t
            int r7 = r7.k()
            if (r9 <= r7) goto L_0x029b
            goto L_0x02a2
        L_0x029b:
            if (r8 == r5) goto L_0x029e
            int r9 = r9 + r8
        L_0x029e:
            r6.f2441c = r9
            r6.f2440b = r9
        L_0x02a2:
            int r1 = r1 + 1
            goto L_0x0265
        L_0x02a5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.J
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2408s
            java.util.Objects.requireNonNull(r1)
            int r7 = r6.length
            int[] r8 = r1.f2421f
            if (r8 == 0) goto L_0x02b4
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02bd
        L_0x02b4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f2408s
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f2421f = r8
        L_0x02bd:
            r8 = r3
        L_0x02be:
            if (r8 >= r7) goto L_0x02cd
            int[] r9 = r1.f2421f
            r10 = r6[r8]
            int r10 = r10.k(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02be
        L_0x02cd:
            r11.q(r12)
            androidx.recyclerview.widget.n r1 = r11.f2413x
            r1.f2570a = r3
            androidx.recyclerview.widget.s r1 = r11.f2410u
            int r1 = r1.l()
            int r6 = r11.f2407r
            int r6 = r1 / r6
            r11.f2412w = r6
            androidx.recyclerview.widget.s r6 = r11.f2410u
            int r6 = r6.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r1 = r0.f2416a
            r11.l1(r1, r13)
            boolean r1 = r0.f2418c
            if (r1 == 0) goto L_0x030a
            r11.j1(r2)
            androidx.recyclerview.widget.n r1 = r11.f2413x
            r11.O0(r12, r1, r13)
            r11.j1(r4)
            androidx.recyclerview.widget.n r1 = r11.f2413x
            int r2 = r0.f2416a
            int r6 = r1.f2573d
            int r2 = r2 + r6
            r1.f2572c = r2
            r11.O0(r12, r1, r13)
            goto L_0x0321
        L_0x030a:
            r11.j1(r4)
            androidx.recyclerview.widget.n r1 = r11.f2413x
            r11.O0(r12, r1, r13)
            r11.j1(r2)
            androidx.recyclerview.widget.n r1 = r11.f2413x
            int r2 = r0.f2416a
            int r6 = r1.f2573d
            int r2 = r2 + r6
            r1.f2572c = r2
            r11.O0(r12, r1, r13)
        L_0x0321:
            androidx.recyclerview.widget.s r1 = r11.f2410u
            int r1 = r1.i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x032d
            goto L_0x03cd
        L_0x032d:
            r1 = 0
            int r2 = r11.x()
            r6 = r3
        L_0x0333:
            if (r6 >= r2) goto L_0x0355
            android.view.View r7 = r11.w(r6)
            androidx.recyclerview.widget.s r8 = r11.f2410u
            int r8 = r8.c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0345
            goto L_0x0352
        L_0x0345:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            java.util.Objects.requireNonNull(r7)
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0352:
            int r6 = r6 + 1
            goto L_0x0333
        L_0x0355:
            int r6 = r11.f2412w
            int r7 = r11.f2407r
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.s r7 = r11.f2410u
            int r7 = r7.i()
            if (r7 != r5) goto L_0x0371
            androidx.recyclerview.widget.s r5 = r11.f2410u
            int r5 = r5.l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0371:
            int r5 = r11.f2407r
            int r5 = r1 / r5
            r11.f2412w = r5
            androidx.recyclerview.widget.s r5 = r11.f2410u
            int r5 = r5.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r1 = r11.f2412w
            if (r1 != r6) goto L_0x0385
            goto L_0x03cd
        L_0x0385:
            r1 = r3
        L_0x0386:
            if (r1 >= r2) goto L_0x03cd
            android.view.View r5 = r11.w(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            java.util.Objects.requireNonNull(r7)
            boolean r8 = r11.Z0()
            if (r8 == 0) goto L_0x03b5
            int r8 = r11.f2411v
            if (r8 != r4) goto L_0x03b5
            int r8 = r11.f2407r
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f2422e
            int r7 = r7.f2443e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f2412w
            int r9 = r9 * r10
            int r8 = r8 - r4
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03ca
        L_0x03b5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f2422e
            int r7 = r7.f2443e
            int r8 = r11.f2412w
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f2411v
            if (r9 != r4) goto L_0x03c6
            int r8 = r8 - r7
            r5.offsetLeftAndRight(r8)
            goto L_0x03ca
        L_0x03c6:
            int r8 = r8 - r7
            r5.offsetTopAndBottom(r8)
        L_0x03ca:
            int r1 = r1 + 1
            goto L_0x0386
        L_0x03cd:
            int r1 = r11.x()
            if (r1 <= 0) goto L_0x03e4
            boolean r1 = r11.z
            if (r1 == 0) goto L_0x03de
            r11.R0(r12, r13, r4)
            r11.S0(r12, r13, r3)
            goto L_0x03e4
        L_0x03de:
            r11.S0(r12, r13, r4)
            r11.R0(r12, r13, r3)
        L_0x03e4:
            if (r14 == 0) goto L_0x040f
            boolean r14 = r13.g
            if (r14 != 0) goto L_0x040f
            int r14 = r11.E
            if (r14 == 0) goto L_0x03fc
            int r14 = r11.x()
            if (r14 <= 0) goto L_0x03fc
            android.view.View r14 = r11.Y0()
            if (r14 == 0) goto L_0x03fc
            r14 = r4
            goto L_0x03fd
        L_0x03fc:
            r14 = r3
        L_0x03fd:
            if (r14 == 0) goto L_0x040f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r14 = r11.M
            androidx.recyclerview.widget.RecyclerView r1 = r11.f2343b
            if (r1 == 0) goto L_0x0408
            r1.removeCallbacks(r14)
        L_0x0408:
            boolean r14 = r11.K0()
            if (r14 == 0) goto L_0x040f
            goto L_0x0410
        L_0x040f:
            r4 = r3
        L_0x0410:
            boolean r14 = r13.g
            if (r14 == 0) goto L_0x0419
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.J
            r14.b()
        L_0x0419:
            boolean r14 = r0.f2418c
            r11.F = r14
            boolean r14 = r11.Z0()
            r11.G = r14
            if (r4 == 0) goto L_0x042d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.J
            r14.b()
            r11.b1(r12, r13, r3)
        L_0x042d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b1(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    public final void c0(int i, int i10) {
        X0(i, i10, 1);
    }

    public final boolean c1(int i) {
        if (this.f2411v == 0) {
            if ((i == -1) != this.z) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.z) == Z0()) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        if (this.H == null) {
            super.d(str);
        }
    }

    public final void d0() {
        this.D.a();
        t0();
    }

    public final void d1(int i, RecyclerView.y yVar) {
        int i10;
        int i11;
        if (i > 0) {
            i11 = U0();
            i10 = 1;
        } else {
            i10 = -1;
            i11 = T0();
        }
        this.f2413x.f2570a = true;
        l1(i11, yVar);
        j1(i10);
        n nVar = this.f2413x;
        nVar.f2572c = i11 + nVar.f2573d;
        nVar.f2571b = Math.abs(i);
    }

    public final boolean e() {
        return this.f2411v == 0;
    }

    public final void e0(int i, int i10) {
        X0(i, i10, 8);
    }

    public final void e1(RecyclerView.t tVar, n nVar) {
        int i;
        int i10;
        if (nVar.f2570a && !nVar.i) {
            if (nVar.f2571b != 0) {
                int i11 = 1;
                if (nVar.f2574e == -1) {
                    int i12 = nVar.f2575f;
                    int k10 = this.f2408s[0].k(i12);
                    while (i11 < this.f2407r) {
                        int k11 = this.f2408s[i11].k(i12);
                        if (k11 > k10) {
                            k10 = k11;
                        }
                        i11++;
                    }
                    int i13 = i12 - k10;
                    if (i13 < 0) {
                        i10 = nVar.g;
                    } else {
                        i10 = nVar.g - Math.min(i13, nVar.f2571b);
                    }
                    f1(tVar, i10);
                    return;
                }
                int i14 = nVar.g;
                int h10 = this.f2408s[0].h(i14);
                while (i11 < this.f2407r) {
                    int h11 = this.f2408s[i11].h(i14);
                    if (h11 < h10) {
                        h10 = h11;
                    }
                    i11++;
                }
                int i15 = h10 - nVar.g;
                if (i15 < 0) {
                    i = nVar.f2575f;
                } else {
                    i = Math.min(i15, nVar.f2571b) + nVar.f2575f;
                }
                g1(tVar, i);
            } else if (nVar.f2574e == -1) {
                f1(tVar, nVar.g);
            } else {
                g1(tVar, nVar.f2575f);
            }
        }
    }

    public final boolean f() {
        return this.f2411v == 1;
    }

    public final void f0(int i, int i10) {
        X0(i, i10, 2);
    }

    public final void f1(RecyclerView.t tVar, int i) {
        int x10 = x() - 1;
        while (x10 >= 0) {
            View w6 = w(x10);
            if (this.f2409t.e(w6) >= i && this.f2409t.o(w6) >= i) {
                c cVar = (c) w6.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.f2422e.f2439a.size() != 1) {
                    cVar.f2422e.l();
                    p0(w6, tVar);
                    x10--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean g(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    public final void g0(int i, int i10) {
        X0(i, i10, 4);
    }

    public final void g1(RecyclerView.t tVar, int i) {
        while (x() > 0) {
            View w6 = w(0);
            if (this.f2409t.b(w6) <= i && this.f2409t.n(w6) <= i) {
                c cVar = (c) w6.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.f2422e.f2439a.size() != 1) {
                    cVar.f2422e.m();
                    p0(w6, tVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void h0(RecyclerView.t tVar, RecyclerView.y yVar) {
        b1(tVar, yVar, true);
    }

    public final void h1() {
        if (this.f2411v == 1 || !Z0()) {
            this.z = this.f2414y;
        } else {
            this.z = !this.f2414y;
        }
    }

    public final void i(int i, int i10, RecyclerView.y yVar, RecyclerView.n.c cVar) {
        int i11;
        int i12;
        if (this.f2411v != 0) {
            i = i10;
        }
        if (x() != 0 && i != 0) {
            d1(i, yVar);
            int[] iArr = this.L;
            if (iArr == null || iArr.length < this.f2407r) {
                this.L = new int[this.f2407r];
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f2407r; i14++) {
                n nVar = this.f2413x;
                if (nVar.f2573d == -1) {
                    i12 = nVar.f2575f;
                    i11 = this.f2408s[i14].k(i12);
                } else {
                    i12 = this.f2408s[i14].h(nVar.g);
                    i11 = this.f2413x.g;
                }
                int i15 = i12 - i11;
                if (i15 >= 0) {
                    this.L[i13] = i15;
                    i13++;
                }
            }
            Arrays.sort(this.L, 0, i13);
            int i16 = 0;
            while (i16 < i13) {
                int i17 = this.f2413x.f2572c;
                if (i17 >= 0 && i17 < yVar.b()) {
                    ((m.b) cVar).a(this.f2413x.f2572c, this.L[i16]);
                    n nVar2 = this.f2413x;
                    nVar2.f2572c += nVar2.f2573d;
                    i16++;
                } else {
                    return;
                }
            }
        }
    }

    public final void i0() {
        this.B = -1;
        this.C = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        this.H = null;
        this.J.b();
    }

    public final int i1(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        d1(i, yVar);
        int O0 = O0(tVar, this.f2413x, yVar);
        if (this.f2413x.f2571b >= O0) {
            i = i < 0 ? -O0 : O0;
        }
        this.f2409t.p(-i);
        this.F = this.z;
        n nVar = this.f2413x;
        nVar.f2571b = 0;
        e1(tVar, nVar);
        return i;
    }

    public final void j1(int i) {
        n nVar = this.f2413x;
        nVar.f2574e = i;
        int i10 = 1;
        if (this.z != (i == -1)) {
            i10 = -1;
        }
        nVar.f2573d = i10;
    }

    public final int k(RecyclerView.y yVar) {
        return L0(yVar);
    }

    public final void k0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.H = eVar;
            if (this.B != -1) {
                eVar.f2429a = -1;
                eVar.f2430b = -1;
                eVar.f2432s = null;
                eVar.f2431c = 0;
                eVar.f2433t = 0;
                eVar.f2434u = null;
                eVar.f2435v = null;
            }
            t0();
        }
    }

    public final void k1(int i, int i10) {
        for (int i11 = 0; i11 < this.f2407r; i11++) {
            if (!this.f2408s[i11].f2439a.isEmpty()) {
                m1(this.f2408s[i11], i, i10);
            }
        }
    }

    public final int l(RecyclerView.y yVar) {
        return M0(yVar);
    }

    public final Parcelable l0() {
        int i;
        View view;
        int i10;
        int i11;
        int[] iArr;
        e eVar = this.H;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f2436w = this.f2414y;
        eVar2.f2437x = this.F;
        eVar2.f2438y = this.G;
        d dVar = this.D;
        if (dVar == null || (iArr = dVar.f2423a) == null) {
            eVar2.f2433t = 0;
        } else {
            eVar2.f2434u = iArr;
            eVar2.f2433t = iArr.length;
            eVar2.f2435v = dVar.f2424b;
        }
        int i12 = -1;
        if (x() > 0) {
            if (this.F) {
                i = U0();
            } else {
                i = T0();
            }
            eVar2.f2429a = i;
            if (this.z) {
                view = P0(true);
            } else {
                view = Q0(true);
            }
            if (view != null) {
                i12 = N(view);
            }
            eVar2.f2430b = i12;
            int i13 = this.f2407r;
            eVar2.f2431c = i13;
            eVar2.f2432s = new int[i13];
            for (int i14 = 0; i14 < this.f2407r; i14++) {
                if (this.F) {
                    i10 = this.f2408s[i14].h(LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f2409t.g();
                    } else {
                        eVar2.f2432s[i14] = i10;
                    }
                } else {
                    i10 = this.f2408s[i14].k(LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f2409t.k();
                    } else {
                        eVar2.f2432s[i14] = i10;
                    }
                }
                i10 -= i11;
                eVar2.f2432s[i14] = i10;
            }
        } else {
            eVar2.f2429a = -1;
            eVar2.f2430b = -1;
            eVar2.f2431c = 0;
        }
        return eVar2;
    }

    public final void l1(int i, RecyclerView.y yVar) {
        int i10;
        int i11;
        int i12;
        n nVar = this.f2413x;
        boolean z10 = false;
        nVar.f2571b = 0;
        nVar.f2572c = i;
        RecyclerView.x xVar = this.g;
        if (!(xVar != null && xVar.f2386e) || (i12 = yVar.f2395a) == -1) {
            i11 = 0;
            i10 = 0;
        } else {
            if (this.z == (i12 < i)) {
                i11 = this.f2409t.l();
                i10 = 0;
            } else {
                i10 = this.f2409t.l();
                i11 = 0;
            }
        }
        RecyclerView recyclerView = this.f2343b;
        if (recyclerView != null && recyclerView.f2293v) {
            this.f2413x.f2575f = this.f2409t.k() - i10;
            this.f2413x.g = this.f2409t.g() + i11;
        } else {
            this.f2413x.g = this.f2409t.f() + i11;
            this.f2413x.f2575f = -i10;
        }
        n nVar2 = this.f2413x;
        nVar2.f2576h = false;
        nVar2.f2570a = true;
        if (this.f2409t.i() == 0 && this.f2409t.f() == 0) {
            z10 = true;
        }
        nVar2.i = z10;
    }

    public final int m(RecyclerView.y yVar) {
        return N0(yVar);
    }

    public final void m0(int i) {
        if (i == 0) {
            K0();
        }
    }

    public final void m1(f fVar, int i, int i10) {
        int i11 = fVar.f2442d;
        if (i == -1) {
            int i12 = fVar.f2440b;
            if (i12 == Integer.MIN_VALUE) {
                fVar.c();
                i12 = fVar.f2440b;
            }
            if (i12 + i11 <= i10) {
                this.A.set(fVar.f2443e, false);
                return;
            }
            return;
        }
        int i13 = fVar.f2441c;
        if (i13 == Integer.MIN_VALUE) {
            fVar.b();
            i13 = fVar.f2441c;
        }
        if (i13 - i11 >= i10) {
            this.A.set(fVar.f2443e, false);
        }
    }

    public final int n(RecyclerView.y yVar) {
        return L0(yVar);
    }

    public final int n1(int i, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i10) - i11), mode);
        }
        return i;
    }

    public final int o(RecyclerView.y yVar) {
        return M0(yVar);
    }

    public final int p(RecyclerView.y yVar) {
        return N0(yVar);
    }

    public final RecyclerView.o t() {
        if (this.f2411v == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public final RecyclerView.o u(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final int u0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        return i1(i, tVar, yVar);
    }

    public final RecyclerView.o v(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public final void v0(int i) {
        e eVar = this.H;
        if (!(eVar == null || eVar.f2429a == i)) {
            eVar.f2432s = null;
            eVar.f2431c = 0;
            eVar.f2429a = -1;
            eVar.f2430b = -1;
        }
        this.B = i;
        this.C = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        t0();
    }

    public final int w0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        return i1(i, tVar, yVar);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2423a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f2424b;

        public final void a() {
            int[] iArr = this.f2423a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2424b = null;
        }

        public final void b(int i) {
            int[] iArr = this.f2423a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f2423a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2423a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2423a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final a c(int i) {
            List<a> list = this.f2424b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2424b.get(size);
                if (aVar.f2425a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f2423a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2424b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = r1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f2424b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2424b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f2424b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f2425a
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = r1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2424b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f2424b
                r3.remove(r2)
                int r0 = r0.f2425a
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f2423a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f2423a
                int r5 = r5.length
                return r5
            L_0x0052:
                int r0 = r0 + 1
                int[] r2 = r4.f2423a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.f2423a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.d(int):int");
        }

        public final void e(int i, int i10) {
            int[] iArr = this.f2423a;
            if (iArr != null && i < iArr.length) {
                int i11 = i + i10;
                b(i11);
                int[] iArr2 = this.f2423a;
                System.arraycopy(iArr2, i, iArr2, i11, (iArr2.length - i) - i10);
                Arrays.fill(this.f2423a, i, i11, -1);
                List<a> list = this.f2424b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f2424b.get(size);
                        int i12 = aVar.f2425a;
                        if (i12 >= i) {
                            aVar.f2425a = i12 + i10;
                        }
                    }
                }
            }
        }

        public final void f(int i, int i10) {
            int[] iArr = this.f2423a;
            if (iArr != null && i < iArr.length) {
                int i11 = i + i10;
                b(i11);
                int[] iArr2 = this.f2423a;
                System.arraycopy(iArr2, i11, iArr2, i, (iArr2.length - i) - i10);
                int[] iArr3 = this.f2423a;
                Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
                List<a> list = this.f2424b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f2424b.get(size);
                        int i12 = aVar.f2425a;
                        if (i12 >= i) {
                            if (i12 < i11) {
                                this.f2424b.remove(size);
                            } else {
                                aVar.f2425a = i12 - i10;
                            }
                        }
                    }
                }
            }
        }

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0019a();

            /* renamed from: a  reason: collision with root package name */
            public int f2425a;

            /* renamed from: b  reason: collision with root package name */
            public int f2426b;

            /* renamed from: c  reason: collision with root package name */
            public int[] f2427c;

            /* renamed from: s  reason: collision with root package name */
            public boolean f2428s;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public class C0019a implements Parcelable.Creator<a> {
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                public final Object[] newArray(int i) {
                    return new a[i];
                }
            }

            public a(Parcel parcel) {
                this.f2425a = parcel.readInt();
                this.f2426b = parcel.readInt();
                this.f2428s = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2427c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder d10 = a.a.d("FullSpanItem{mPosition=");
                d10.append(this.f2425a);
                d10.append(", mGapDir=");
                d10.append(this.f2426b);
                d10.append(", mHasUnwantedGapAfter=");
                d10.append(this.f2428s);
                d10.append(", mGapPerSpan=");
                d10.append(Arrays.toString(this.f2427c));
                d10.append(MessageFormatter.DELIM_STOP);
                return d10.toString();
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2425a);
                parcel.writeInt(this.f2426b);
                parcel.writeInt(this.f2428s ? 1 : 0);
                int[] iArr = this.f2427c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2427c);
            }

            public a() {
            }
        }
    }
}
