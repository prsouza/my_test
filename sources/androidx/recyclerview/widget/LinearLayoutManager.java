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
import java.util.List;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.helpers.MessageFormatter;

public class LinearLayoutManager extends RecyclerView.n implements RecyclerView.x.b {
    public int A = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
    public d B = null;
    public final a C = new a();
    public final b D = new b();
    public int E = 2;
    public int[] F = new int[2];

    /* renamed from: r  reason: collision with root package name */
    public int f2237r = 1;

    /* renamed from: s  reason: collision with root package name */
    public c f2238s;

    /* renamed from: t  reason: collision with root package name */
    public s f2239t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2240u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2241v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2242w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2243x = false;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2244y = true;
    public int z = -1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public s f2245a;

        /* renamed from: b  reason: collision with root package name */
        public int f2246b;

        /* renamed from: c  reason: collision with root package name */
        public int f2247c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2248d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2249e;

        public a() {
            d();
        }

        public final void a() {
            int i;
            if (this.f2248d) {
                i = this.f2245a.g();
            } else {
                i = this.f2245a.k();
            }
            this.f2247c = i;
        }

        public final void b(View view, int i) {
            if (this.f2248d) {
                this.f2247c = this.f2245a.m() + this.f2245a.b(view);
            } else {
                this.f2247c = this.f2245a.e(view);
            }
            this.f2246b = i;
        }

        public final void c(View view, int i) {
            int m10 = this.f2245a.m();
            if (m10 >= 0) {
                b(view, i);
                return;
            }
            this.f2246b = i;
            if (this.f2248d) {
                int g = (this.f2245a.g() - m10) - this.f2245a.b(view);
                this.f2247c = this.f2245a.g() - g;
                if (g > 0) {
                    int c10 = this.f2247c - this.f2245a.c(view);
                    int k10 = this.f2245a.k();
                    int min = c10 - (Math.min(this.f2245a.e(view) - k10, 0) + k10);
                    if (min < 0) {
                        this.f2247c = Math.min(g, -min) + this.f2247c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e10 = this.f2245a.e(view);
            int k11 = e10 - this.f2245a.k();
            this.f2247c = e10;
            if (k11 > 0) {
                int g8 = (this.f2245a.g() - Math.min(0, (this.f2245a.g() - m10) - this.f2245a.b(view))) - (this.f2245a.c(view) + e10);
                if (g8 < 0) {
                    this.f2247c -= Math.min(k11, -g8);
                }
            }
        }

        public final void d() {
            this.f2246b = -1;
            this.f2247c = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            this.f2248d = false;
            this.f2249e = false;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("AnchorInfo{mPosition=");
            d10.append(this.f2246b);
            d10.append(", mCoordinate=");
            d10.append(this.f2247c);
            d10.append(", mLayoutFromEnd=");
            d10.append(this.f2248d);
            d10.append(", mValid=");
            d10.append(this.f2249e);
            d10.append(MessageFormatter.DELIM_STOP);
            return d10.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2250a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2251b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2252c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2253d;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2254a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f2255b;

        /* renamed from: c  reason: collision with root package name */
        public int f2256c;

        /* renamed from: d  reason: collision with root package name */
        public int f2257d;

        /* renamed from: e  reason: collision with root package name */
        public int f2258e;

        /* renamed from: f  reason: collision with root package name */
        public int f2259f;
        public int g;

        /* renamed from: h  reason: collision with root package name */
        public int f2260h = 0;
        public int i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f2261j;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.b0> f2262k = null;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2263l;

        public final void a(View view) {
            int a10;
            int size = this.f2262k.size();
            View view2 = null;
            int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2262k.get(i11).f2311a;
                RecyclerView.o oVar = (RecyclerView.o) view3.getLayoutParams();
                if (view3 != view && !oVar.c() && (a10 = (oVar.a() - this.f2257d) * this.f2258e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            if (view2 == null) {
                this.f2257d = -1;
            } else {
                this.f2257d = ((RecyclerView.o) view2.getLayoutParams()).a();
            }
        }

        public final boolean b(RecyclerView.y yVar) {
            int i10 = this.f2257d;
            return i10 >= 0 && i10 < yVar.b();
        }

        public final View c(RecyclerView.t tVar) {
            List<RecyclerView.b0> list = this.f2262k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.f2262k.get(i10).f2311a;
                    RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
                    if (!oVar.c() && this.f2257d == oVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = tVar.j(this.f2257d, Long.MAX_VALUE).f2311a;
            this.f2257d += this.f2258e;
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2264a;

        /* renamed from: b  reason: collision with root package name */
        public int f2265b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2266c;

        public class a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public final boolean a() {
            return this.f2264a >= 0;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2264a);
            parcel.writeInt(this.f2265b);
            parcel.writeInt(this.f2266c ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f2264a = parcel.readInt();
            this.f2265b = parcel.readInt();
            this.f2266c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f2264a = dVar.f2264a;
            this.f2265b = dVar.f2265b;
            this.f2266c = dVar.f2266c;
        }
    }

    public LinearLayoutManager(int i) {
        j1(i);
        d((String) null);
        if (this.f2241v) {
            this.f2241v = false;
            t0();
        }
    }

    public final boolean E0() {
        boolean z10;
        if (!(this.f2354o == 1073741824 || this.f2353n == 1073741824)) {
            int x10 = x();
            int i = 0;
            while (true) {
                if (i >= x10) {
                    z10 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = w(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z10 = true;
                    break;
                }
                i++;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public void G0(RecyclerView recyclerView, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.f2382a = i;
        H0(oVar);
    }

    public boolean I0() {
        return this.B == null && this.f2240u == this.f2243x;
    }

    public void J0(RecyclerView.y yVar, int[] iArr) {
        int i;
        int l10 = yVar.f2395a != -1 ? this.f2239t.l() : 0;
        if (this.f2238s.f2259f == -1) {
            i = 0;
        } else {
            i = l10;
            l10 = 0;
        }
        iArr[0] = l10;
        iArr[1] = i;
    }

    public void K0(RecyclerView.y yVar, c cVar, RecyclerView.n.c cVar2) {
        int i = cVar.f2257d;
        if (i >= 0 && i < yVar.b()) {
            ((m.b) cVar2).a(i, Math.max(0, cVar.g));
        }
    }

    public final int L0(RecyclerView.y yVar) {
        if (x() == 0) {
            return 0;
        }
        P0();
        return y.a(yVar, this.f2239t, S0(!this.f2244y), R0(!this.f2244y), this, this.f2244y);
    }

    public final int M0(RecyclerView.y yVar) {
        if (x() == 0) {
            return 0;
        }
        P0();
        return y.b(yVar, this.f2239t, S0(!this.f2244y), R0(!this.f2244y), this, this.f2244y, this.f2242w);
    }

    public final int N0(RecyclerView.y yVar) {
        if (x() == 0) {
            return 0;
        }
        P0();
        return y.c(yVar, this.f2239t, S0(!this.f2244y), R0(!this.f2244y), this, this.f2244y);
    }

    public final int O0(int i) {
        if (i == 1) {
            return (this.f2237r != 1 && c1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2237r != 1 && c1()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        return LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                    }
                    if (this.f2237r == 1) {
                        return 1;
                    }
                    return LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                } else if (this.f2237r == 0) {
                    return 1;
                } else {
                    return LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                }
            } else if (this.f2237r == 1) {
                return -1;
            } else {
                return LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            }
        } else if (this.f2237r == 0) {
            return -1;
        } else {
            return LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        }
    }

    public final void P0() {
        if (this.f2238s == null) {
            this.f2238s = new c();
        }
    }

    public final int Q0(RecyclerView.t tVar, c cVar, RecyclerView.y yVar, boolean z10) {
        int i = cVar.f2256c;
        int i10 = cVar.g;
        if (i10 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i10 + i;
            }
            f1(tVar, cVar);
        }
        int i11 = cVar.f2256c + cVar.f2260h;
        b bVar = this.D;
        while (true) {
            if ((!cVar.f2263l && i11 <= 0) || !cVar.b(yVar)) {
                break;
            }
            bVar.f2250a = 0;
            bVar.f2251b = false;
            bVar.f2252c = false;
            bVar.f2253d = false;
            d1(tVar, yVar, cVar, bVar);
            if (!bVar.f2251b) {
                int i12 = cVar.f2255b;
                int i13 = bVar.f2250a;
                cVar.f2255b = (cVar.f2259f * i13) + i12;
                if (!bVar.f2252c || cVar.f2262k != null || !yVar.g) {
                    cVar.f2256c -= i13;
                    i11 -= i13;
                }
                int i14 = cVar.g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    cVar.g = i15;
                    int i16 = cVar.f2256c;
                    if (i16 < 0) {
                        cVar.g = i15 + i16;
                    }
                    f1(tVar, cVar);
                }
                if (z10 && bVar.f2253d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2256c;
    }

    public final boolean R() {
        return true;
    }

    public final View R0(boolean z10) {
        if (this.f2242w) {
            return W0(0, x(), z10);
        }
        return W0(x() - 1, -1, z10);
    }

    public final View S0(boolean z10) {
        if (this.f2242w) {
            return W0(x() - 1, -1, z10);
        }
        return W0(0, x(), z10);
    }

    public final int T0() {
        View W0 = W0(0, x(), false);
        if (W0 == null) {
            return -1;
        }
        return N(W0);
    }

    public final int U0() {
        View W0 = W0(x() - 1, -1, false);
        if (W0 == null) {
            return -1;
        }
        return N(W0);
    }

    public final View V0(int i, int i10) {
        int i11;
        int i12;
        P0();
        if ((i10 > i ? 1 : i10 < i ? (char) 65535 : 0) == 0) {
            return w(i);
        }
        if (this.f2239t.e(w(i)) < this.f2239t.k()) {
            i12 = 16644;
            i11 = 16388;
        } else {
            i12 = 4161;
            i11 = 4097;
        }
        if (this.f2237r == 0) {
            return this.f2346e.a(i, i10, i12, i11);
        }
        return this.f2347f.a(i, i10, i12, i11);
    }

    public final View W0(int i, int i10, boolean z10) {
        P0();
        int i11 = z10 ? 24579 : 320;
        if (this.f2237r == 0) {
            return this.f2346e.a(i, i10, i11, 320);
        }
        return this.f2347f.a(i, i10, i11, 320);
    }

    public final void X(RecyclerView recyclerView) {
    }

    public View X0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i;
        int i10;
        P0();
        int x10 = x();
        int i11 = -1;
        if (z11) {
            i10 = x() - 1;
            i = -1;
        } else {
            i11 = x10;
            i10 = 0;
            i = 1;
        }
        int b10 = yVar.b();
        int k10 = this.f2239t.k();
        int g = this.f2239t.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i11) {
            View w6 = w(i10);
            int N = N(w6);
            int e10 = this.f2239t.e(w6);
            int b11 = this.f2239t.b(w6);
            if (N >= 0 && N < b10) {
                if (!((RecyclerView.o) w6.getLayoutParams()).c()) {
                    boolean z12 = b11 <= k10 && e10 < k10;
                    boolean z13 = e10 >= g && b11 > g;
                    if (!z12 && !z13) {
                        return w6;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = w6;
                        }
                    } else if (!z12) {
                        if (view != null) {
                        }
                        view = w6;
                    }
                    view2 = w6;
                } else if (view3 == null) {
                    view3 = w6;
                }
            }
            i10 += i;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public View Y(View view, int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        int O0;
        View view2;
        View view3;
        h1();
        if (x() == 0 || (O0 = O0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        P0();
        l1(O0, (int) (((float) this.f2239t.l()) * 0.33333334f), false, yVar);
        c cVar = this.f2238s;
        cVar.g = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        cVar.f2254a = false;
        Q0(tVar, cVar, yVar, true);
        if (O0 == -1) {
            if (this.f2242w) {
                view2 = V0(x() - 1, -1);
            } else {
                view2 = V0(0, x());
            }
        } else if (this.f2242w) {
            view2 = V0(0, x());
        } else {
            view2 = V0(x() - 1, -1);
        }
        if (O0 == -1) {
            view3 = b1();
        } else {
            view3 = a1();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public final int Y0(int i, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g;
        int g8 = this.f2239t.g() - i;
        if (g8 <= 0) {
            return 0;
        }
        int i10 = -i1(-g8, tVar, yVar);
        int i11 = i + i10;
        if (!z10 || (g = this.f2239t.g() - i11) <= 0) {
            return i10;
        }
        this.f2239t.p(g);
        return g + i10;
    }

    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(T0());
            accessibilityEvent.setToIndex(U0());
        }
    }

    public final int Z0(int i, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int k11 = i - this.f2239t.k();
        if (k11 <= 0) {
            return 0;
        }
        int i10 = -i1(k11, tVar, yVar);
        int i11 = i + i10;
        if (!z10 || (k10 = i11 - this.f2239t.k()) <= 0) {
            return i10;
        }
        this.f2239t.p(-k10);
        return i10 - k10;
    }

    public final PointF a(int i) {
        if (x() == 0) {
            return null;
        }
        boolean z10 = false;
        int i10 = 1;
        if (i < N(w(0))) {
            z10 = true;
        }
        if (z10 != this.f2242w) {
            i10 = -1;
        }
        if (this.f2237r == 0) {
            return new PointF((float) i10, 0.0f);
        }
        return new PointF(0.0f, (float) i10);
    }

    public final View a1() {
        return w(this.f2242w ? 0 : x() - 1);
    }

    public final View b1() {
        return w(this.f2242w ? x() - 1 : 0);
    }

    public final boolean c1() {
        return G() == 1;
    }

    public final void d(String str) {
        if (this.B == null) {
            super.d(str);
        }
    }

    public void d1(RecyclerView.t tVar, RecyclerView.y yVar, c cVar, b bVar) {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        View c10 = cVar.c(tVar);
        if (c10 == null) {
            bVar.f2251b = true;
            return;
        }
        RecyclerView.o oVar = (RecyclerView.o) c10.getLayoutParams();
        if (cVar.f2262k == null) {
            if (this.f2242w == (cVar.f2259f == -1)) {
                b(c10);
            } else {
                c(c10, 0, false);
            }
        } else {
            if (this.f2242w == (cVar.f2259f == -1)) {
                c(c10, -1, true);
            } else {
                c(c10, 0, true);
            }
        }
        RecyclerView.o oVar2 = (RecyclerView.o) c10.getLayoutParams();
        Rect L = this.f2343b.L(c10);
        int y10 = RecyclerView.n.y(this.f2355p, this.f2353n, L() + K() + oVar2.leftMargin + oVar2.rightMargin + L.left + L.right + 0, oVar2.width, e());
        int y11 = RecyclerView.n.y(this.f2356q, this.f2354o, J() + M() + oVar2.topMargin + oVar2.bottomMargin + L.top + L.bottom + 0, oVar2.height, f());
        if (D0(c10, y10, y11, oVar2)) {
            c10.measure(y10, y11);
        }
        bVar.f2250a = this.f2239t.c(c10);
        if (this.f2237r == 1) {
            if (c1()) {
                i13 = this.f2355p - L();
                i12 = i13 - this.f2239t.d(c10);
            } else {
                i12 = K();
                i13 = this.f2239t.d(c10) + i12;
            }
            if (cVar.f2259f == -1) {
                int i14 = cVar.f2255b;
                i = i14;
                i10 = i13;
                i11 = i14 - bVar.f2250a;
            } else {
                int i15 = cVar.f2255b;
                i11 = i15;
                i10 = i13;
                i = bVar.f2250a + i15;
            }
        } else {
            int M = M();
            int d10 = this.f2239t.d(c10) + M;
            if (cVar.f2259f == -1) {
                int i16 = cVar.f2255b;
                i10 = i16;
                i11 = M;
                i = d10;
                i12 = i16 - bVar.f2250a;
            } else {
                int i17 = cVar.f2255b;
                i11 = M;
                i10 = bVar.f2250a + i17;
                i = d10;
                i12 = i17;
            }
        }
        T(c10, i12, i11, i10, i);
        if (oVar.c() || oVar.b()) {
            bVar.f2252c = true;
        }
        bVar.f2253d = c10.hasFocusable();
    }

    public final boolean e() {
        return this.f2237r == 0;
    }

    public void e1(RecyclerView.t tVar, RecyclerView.y yVar, a aVar, int i) {
    }

    public final boolean f() {
        return this.f2237r == 1;
    }

    public final void f1(RecyclerView.t tVar, c cVar) {
        if (cVar.f2254a && !cVar.f2263l) {
            int i = cVar.g;
            int i10 = cVar.i;
            if (cVar.f2259f == -1) {
                int x10 = x();
                if (i >= 0) {
                    int f10 = (this.f2239t.f() - i) + i10;
                    if (this.f2242w) {
                        for (int i11 = 0; i11 < x10; i11++) {
                            View w6 = w(i11);
                            if (this.f2239t.e(w6) < f10 || this.f2239t.o(w6) < f10) {
                                g1(tVar, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = x10 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View w10 = w(i13);
                        if (this.f2239t.e(w10) < f10 || this.f2239t.o(w10) < f10) {
                            g1(tVar, i12, i13);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i14 = i - i10;
                int x11 = x();
                if (this.f2242w) {
                    int i15 = x11 - 1;
                    for (int i16 = i15; i16 >= 0; i16--) {
                        View w11 = w(i16);
                        if (this.f2239t.b(w11) > i14 || this.f2239t.n(w11) > i14) {
                            g1(tVar, i15, i16);
                            return;
                        }
                    }
                    return;
                }
                for (int i17 = 0; i17 < x11; i17++) {
                    View w12 = w(i17);
                    if (this.f2239t.b(w12) > i14 || this.f2239t.n(w12) > i14) {
                        g1(tVar, 0, i17);
                        return;
                    }
                }
            }
        }
    }

    public final void g1(RecyclerView.t tVar, int i, int i10) {
        if (i != i10) {
            if (i10 > i) {
                for (int i11 = i10 - 1; i11 >= i; i11--) {
                    q0(i11, tVar);
                }
                return;
            }
            while (i > i10) {
                q0(i, tVar);
                i--;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h0(androidx.recyclerview.widget.RecyclerView.t r17, androidx.recyclerview.widget.RecyclerView.y r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.B
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.z
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x0019
            r16.n0(r17)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.B
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.B
            int r3 = r3.f2264a
            r0.z = r3
        L_0x0029:
            r16.P0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            r5 = 0
            r3.f2254a = r5
            r16.h1()
            android.view.View r3 = r16.F()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.C
            boolean r7 = r6.f2249e
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1
            if (r7 == 0) goto L_0x0073
            int r7 = r0.z
            if (r7 != r4) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.B
            if (r7 == 0) goto L_0x004a
            goto L_0x0073
        L_0x004a:
            if (r3 == 0) goto L_0x0222
            androidx.recyclerview.widget.s r6 = r0.f2239t
            int r6 = r6.e(r3)
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r7 = r7.g()
            if (r6 >= r7) goto L_0x0068
            androidx.recyclerview.widget.s r6 = r0.f2239t
            int r6 = r6.b(r3)
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r7 = r7.k()
            if (r6 > r7) goto L_0x0222
        L_0x0068:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.C
            int r7 = r0.N(r3)
            r6.c(r3, r7)
            goto L_0x0222
        L_0x0073:
            r6.d()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.C
            boolean r6 = r0.f2242w
            boolean r7 = r0.f2243x
            r6 = r6 ^ r7
            r3.f2248d = r6
            boolean r6 = r2.g
            if (r6 != 0) goto L_0x017b
            int r6 = r0.z
            if (r6 != r4) goto L_0x0089
            goto L_0x017b
        L_0x0089:
            if (r6 < 0) goto L_0x0177
            int r7 = r18.b()
            if (r6 < r7) goto L_0x0093
            goto L_0x0177
        L_0x0093:
            int r6 = r0.z
            r3.f2246b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.B
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x00c7
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.B
            boolean r6 = r6.f2266c
            r3.f2248d = r6
            if (r6 == 0) goto L_0x00b8
            androidx.recyclerview.widget.s r6 = r0.f2239t
            int r6 = r6.g()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.B
            int r7 = r7.f2265b
            int r6 = r6 - r7
            r3.f2247c = r6
            goto L_0x0175
        L_0x00b8:
            androidx.recyclerview.widget.s r6 = r0.f2239t
            int r6 = r6.k()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.B
            int r7 = r7.f2265b
            int r6 = r6 + r7
            r3.f2247c = r6
            goto L_0x0175
        L_0x00c7:
            int r6 = r0.A
            if (r6 != r8) goto L_0x0158
            int r6 = r0.z
            android.view.View r6 = r0.s(r6)
            if (r6 == 0) goto L_0x0136
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r7 = r7.c(r6)
            androidx.recyclerview.widget.s r10 = r0.f2239t
            int r10 = r10.l()
            if (r7 <= r10) goto L_0x00e6
            r3.a()
            goto L_0x0175
        L_0x00e6:
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.s r10 = r0.f2239t
            int r10 = r10.k()
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x0101
            androidx.recyclerview.widget.s r6 = r0.f2239t
            int r6 = r6.k()
            r3.f2247c = r6
            r3.f2248d = r5
            goto L_0x0175
        L_0x0101:
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r7 = r7.g()
            androidx.recyclerview.widget.s r10 = r0.f2239t
            int r10 = r10.b(r6)
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x011b
            androidx.recyclerview.widget.s r6 = r0.f2239t
            int r6 = r6.g()
            r3.f2247c = r6
            r3.f2248d = r9
            goto L_0x0175
        L_0x011b:
            boolean r7 = r3.f2248d
            if (r7 == 0) goto L_0x012d
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r6 = r7.b(r6)
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r7 = r7.m()
            int r7 = r7 + r6
            goto L_0x0133
        L_0x012d:
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r7 = r7.e(r6)
        L_0x0133:
            r3.f2247c = r7
            goto L_0x0175
        L_0x0136:
            int r6 = r16.x()
            if (r6 <= 0) goto L_0x0154
            android.view.View r6 = r0.w(r5)
            int r6 = r0.N(r6)
            int r7 = r0.z
            if (r7 >= r6) goto L_0x014a
            r6 = r9
            goto L_0x014b
        L_0x014a:
            r6 = r5
        L_0x014b:
            boolean r7 = r0.f2242w
            if (r6 != r7) goto L_0x0151
            r6 = r9
            goto L_0x0152
        L_0x0151:
            r6 = r5
        L_0x0152:
            r3.f2248d = r6
        L_0x0154:
            r3.a()
            goto L_0x0175
        L_0x0158:
            boolean r6 = r0.f2242w
            r3.f2248d = r6
            if (r6 == 0) goto L_0x016a
            androidx.recyclerview.widget.s r6 = r0.f2239t
            int r6 = r6.g()
            int r7 = r0.A
            int r6 = r6 - r7
            r3.f2247c = r6
            goto L_0x0175
        L_0x016a:
            androidx.recyclerview.widget.s r6 = r0.f2239t
            int r6 = r6.k()
            int r7 = r0.A
            int r6 = r6 + r7
            r3.f2247c = r6
        L_0x0175:
            r6 = r9
            goto L_0x017c
        L_0x0177:
            r0.z = r4
            r0.A = r8
        L_0x017b:
            r6 = r5
        L_0x017c:
            if (r6 == 0) goto L_0x0180
            goto L_0x021e
        L_0x0180:
            int r6 = r16.x()
            if (r6 != 0) goto L_0x0188
            goto L_0x020a
        L_0x0188:
            android.view.View r6 = r16.F()
            if (r6 == 0) goto L_0x01b7
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$o r7 = (androidx.recyclerview.widget.RecyclerView.o) r7
            boolean r10 = r7.c()
            if (r10 != 0) goto L_0x01ac
            int r10 = r7.a()
            if (r10 < 0) goto L_0x01ac
            int r7 = r7.a()
            int r10 = r18.b()
            if (r7 >= r10) goto L_0x01ac
            r7 = r9
            goto L_0x01ad
        L_0x01ac:
            r7 = r5
        L_0x01ad:
            if (r7 == 0) goto L_0x01b7
            int r7 = r0.N(r6)
            r3.c(r6, r7)
            goto L_0x0208
        L_0x01b7:
            boolean r6 = r0.f2240u
            boolean r7 = r0.f2243x
            if (r6 == r7) goto L_0x01be
            goto L_0x020a
        L_0x01be:
            boolean r6 = r3.f2248d
            android.view.View r6 = r0.X0(r1, r2, r6, r7)
            if (r6 == 0) goto L_0x020a
            int r7 = r0.N(r6)
            r3.b(r6, r7)
            boolean r7 = r2.g
            if (r7 != 0) goto L_0x0208
            boolean r7 = r16.I0()
            if (r7 == 0) goto L_0x0208
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.s r10 = r0.f2239t
            int r6 = r10.b(r6)
            androidx.recyclerview.widget.s r10 = r0.f2239t
            int r10 = r10.k()
            androidx.recyclerview.widget.s r11 = r0.f2239t
            int r11 = r11.g()
            if (r6 > r10) goto L_0x01f5
            if (r7 >= r10) goto L_0x01f5
            r12 = r9
            goto L_0x01f6
        L_0x01f5:
            r12 = r5
        L_0x01f6:
            if (r7 < r11) goto L_0x01fc
            if (r6 <= r11) goto L_0x01fc
            r6 = r9
            goto L_0x01fd
        L_0x01fc:
            r6 = r5
        L_0x01fd:
            if (r12 != 0) goto L_0x0201
            if (r6 == 0) goto L_0x0208
        L_0x0201:
            boolean r6 = r3.f2248d
            if (r6 == 0) goto L_0x0206
            r10 = r11
        L_0x0206:
            r3.f2247c = r10
        L_0x0208:
            r6 = r9
            goto L_0x020b
        L_0x020a:
            r6 = r5
        L_0x020b:
            if (r6 == 0) goto L_0x020e
            goto L_0x021e
        L_0x020e:
            r3.a()
            boolean r6 = r0.f2243x
            if (r6 == 0) goto L_0x021b
            int r6 = r18.b()
            int r6 = r6 + r4
            goto L_0x021c
        L_0x021b:
            r6 = r5
        L_0x021c:
            r3.f2246b = r6
        L_0x021e:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.C
            r3.f2249e = r9
        L_0x0222:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            int r6 = r3.f2261j
            if (r6 < 0) goto L_0x022a
            r6 = r9
            goto L_0x022b
        L_0x022a:
            r6 = r4
        L_0x022b:
            r3.f2259f = r6
            int[] r3 = r0.F
            r3[r5] = r5
            r3[r9] = r5
            r0.J0(r2, r3)
            int[] r3 = r0.F
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.s r6 = r0.f2239t
            int r6 = r6.k()
            int r6 = r6 + r3
            int[] r3 = r0.F
            r3 = r3[r9]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.s r7 = r0.f2239t
            int r7 = r7.h()
            int r7 = r7 + r3
            boolean r3 = r2.g
            if (r3 == 0) goto L_0x028f
            int r3 = r0.z
            if (r3 == r4) goto L_0x028f
            int r10 = r0.A
            if (r10 == r8) goto L_0x028f
            android.view.View r3 = r0.s(r3)
            if (r3 == 0) goto L_0x028f
            boolean r8 = r0.f2242w
            if (r8 == 0) goto L_0x027a
            androidx.recyclerview.widget.s r8 = r0.f2239t
            int r8 = r8.g()
            androidx.recyclerview.widget.s r10 = r0.f2239t
            int r3 = r10.b(r3)
            int r8 = r8 - r3
            int r3 = r0.A
            goto L_0x0289
        L_0x027a:
            androidx.recyclerview.widget.s r8 = r0.f2239t
            int r3 = r8.e(r3)
            androidx.recyclerview.widget.s r8 = r0.f2239t
            int r8 = r8.k()
            int r3 = r3 - r8
            int r8 = r0.A
        L_0x0289:
            int r8 = r8 - r3
            if (r8 <= 0) goto L_0x028e
            int r6 = r6 + r8
            goto L_0x028f
        L_0x028e:
            int r7 = r7 - r8
        L_0x028f:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.C
            boolean r8 = r3.f2248d
            if (r8 == 0) goto L_0x029a
            boolean r8 = r0.f2242w
            if (r8 == 0) goto L_0x029e
            goto L_0x02a0
        L_0x029a:
            boolean r8 = r0.f2242w
            if (r8 == 0) goto L_0x02a0
        L_0x029e:
            r8 = r4
            goto L_0x02a1
        L_0x02a0:
            r8 = r9
        L_0x02a1:
            r0.e1(r1, r2, r3, r8)
            r16.q(r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            androidx.recyclerview.widget.s r8 = r0.f2239t
            int r8 = r8.i()
            if (r8 != 0) goto L_0x02bb
            androidx.recyclerview.widget.s r8 = r0.f2239t
            int r8 = r8.f()
            if (r8 != 0) goto L_0x02bb
            r8 = r9
            goto L_0x02bc
        L_0x02bb:
            r8 = r5
        L_0x02bc:
            r3.f2263l = r8
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            java.util.Objects.requireNonNull(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            r3.i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.C
            boolean r8 = r3.f2248d
            if (r8 == 0) goto L_0x0314
            int r8 = r3.f2246b
            int r3 = r3.f2247c
            r0.n1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            r3.f2260h = r6
            r0.Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            int r6 = r3.f2255b
            int r8 = r3.f2257d
            int r3 = r3.f2256c
            if (r3 <= 0) goto L_0x02e6
            int r7 = r7 + r3
        L_0x02e6:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.C
            int r10 = r3.f2246b
            int r3 = r3.f2247c
            r0.m1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            r3.f2260h = r7
            int r7 = r3.f2257d
            int r10 = r3.f2258e
            int r7 = r7 + r10
            r3.f2257d = r7
            r0.Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            int r7 = r3.f2255b
            int r3 = r3.f2256c
            if (r3 <= 0) goto L_0x035a
            r0.n1(r8, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.f2238s
            r6.f2260h = r3
            r0.Q0(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            int r6 = r3.f2255b
            goto L_0x035a
        L_0x0314:
            int r8 = r3.f2246b
            int r3 = r3.f2247c
            r0.m1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            r3.f2260h = r7
            r0.Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            int r7 = r3.f2255b
            int r8 = r3.f2257d
            int r3 = r3.f2256c
            if (r3 <= 0) goto L_0x032d
            int r6 = r6 + r3
        L_0x032d:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.C
            int r10 = r3.f2246b
            int r3 = r3.f2247c
            r0.n1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            r3.f2260h = r6
            int r6 = r3.f2257d
            int r10 = r3.f2258e
            int r6 = r6 + r10
            r3.f2257d = r6
            r0.Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            int r6 = r3.f2255b
            int r3 = r3.f2256c
            if (r3 <= 0) goto L_0x035a
            r0.m1(r8, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.f2238s
            r7.f2260h = r3
            r0.Q0(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2238s
            int r7 = r3.f2255b
        L_0x035a:
            int r3 = r16.x()
            if (r3 <= 0) goto L_0x037e
            boolean r3 = r0.f2242w
            boolean r8 = r0.f2243x
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x0372
            int r3 = r0.Y0(r7, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.Z0(r6, r1, r2, r5)
            goto L_0x037c
        L_0x0372:
            int r3 = r0.Z0(r6, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.Y0(r7, r1, r2, r5)
        L_0x037c:
            int r6 = r6 + r3
            int r7 = r7 + r3
        L_0x037e:
            boolean r3 = r2.f2403k
            if (r3 == 0) goto L_0x041c
            int r3 = r16.x()
            if (r3 == 0) goto L_0x041c
            boolean r3 = r2.g
            if (r3 != 0) goto L_0x041c
            boolean r3 = r16.I0()
            if (r3 != 0) goto L_0x0394
            goto L_0x041c
        L_0x0394:
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r3 = r1.f2376d
            int r8 = r3.size()
            android.view.View r10 = r0.w(r5)
            int r10 = r0.N(r10)
            r11 = r5
            r12 = r11
            r13 = r12
        L_0x03a5:
            if (r11 >= r8) goto L_0x03dd
            java.lang.Object r14 = r3.get(r11)
            androidx.recyclerview.widget.RecyclerView$b0 r14 = (androidx.recyclerview.widget.RecyclerView.b0) r14
            boolean r15 = r14.l()
            if (r15 == 0) goto L_0x03b4
            goto L_0x03d9
        L_0x03b4:
            int r15 = r14.e()
            if (r15 >= r10) goto L_0x03bc
            r15 = r9
            goto L_0x03bd
        L_0x03bc:
            r15 = r5
        L_0x03bd:
            boolean r9 = r0.f2242w
            if (r15 == r9) goto L_0x03c3
            r9 = r4
            goto L_0x03c4
        L_0x03c3:
            r9 = 1
        L_0x03c4:
            if (r9 != r4) goto L_0x03d0
            androidx.recyclerview.widget.s r9 = r0.f2239t
            android.view.View r14 = r14.f2311a
            int r9 = r9.c(r14)
            int r12 = r12 + r9
            goto L_0x03d9
        L_0x03d0:
            androidx.recyclerview.widget.s r9 = r0.f2239t
            android.view.View r14 = r14.f2311a
            int r9 = r9.c(r14)
            int r13 = r13 + r9
        L_0x03d9:
            int r11 = r11 + 1
            r9 = 1
            goto L_0x03a5
        L_0x03dd:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2238s
            r4.f2262k = r3
            r3 = 0
            if (r12 <= 0) goto L_0x03fd
            android.view.View r4 = r16.b1()
            int r4 = r0.N(r4)
            r0.n1(r4, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2238s
            r4.f2260h = r12
            r4.f2256c = r5
            r4.a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2238s
            r0.Q0(r1, r4, r2, r5)
        L_0x03fd:
            if (r13 <= 0) goto L_0x0418
            android.view.View r4 = r16.a1()
            int r4 = r0.N(r4)
            r0.m1(r4, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2238s
            r4.f2260h = r13
            r4.f2256c = r5
            r4.a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2238s
            r0.Q0(r1, r4, r2, r5)
        L_0x0418:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f2238s
            r1.f2262k = r3
        L_0x041c:
            boolean r1 = r2.g
            if (r1 != 0) goto L_0x0429
            androidx.recyclerview.widget.s r1 = r0.f2239t
            int r2 = r1.l()
            r1.f2586b = r2
            goto L_0x042e
        L_0x0429:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.C
            r1.d()
        L_0x042e:
            boolean r1 = r0.f2243x
            r0.f2240u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.h0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    public final void h1() {
        if (this.f2237r == 1 || !c1()) {
            this.f2242w = this.f2241v;
        } else {
            this.f2242w = !this.f2241v;
        }
    }

    public final void i(int i, int i10, RecyclerView.y yVar, RecyclerView.n.c cVar) {
        if (this.f2237r != 0) {
            i = i10;
        }
        if (x() != 0 && i != 0) {
            P0();
            l1(i > 0 ? 1 : -1, Math.abs(i), true, yVar);
            K0(yVar, this.f2238s, cVar);
        }
    }

    public void i0() {
        this.B = null;
        this.z = -1;
        this.A = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        this.C.d();
    }

    public final int i1(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        P0();
        this.f2238s.f2254a = true;
        int i10 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        l1(i10, abs, true, yVar);
        c cVar = this.f2238s;
        int Q0 = Q0(tVar, cVar, yVar, false) + cVar.g;
        if (Q0 < 0) {
            return 0;
        }
        if (abs > Q0) {
            i = i10 * Q0;
        }
        this.f2239t.p(-i);
        this.f2238s.f2261j = i;
        return i;
    }

    public final void j(int i, RecyclerView.n.c cVar) {
        boolean z10;
        int i10;
        d dVar = this.B;
        int i11 = -1;
        if (dVar == null || !dVar.a()) {
            h1();
            z10 = this.f2242w;
            i10 = this.z;
            if (i10 == -1) {
                i10 = z10 ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.B;
            z10 = dVar2.f2266c;
            i10 = dVar2.f2264a;
        }
        if (!z10) {
            i11 = 1;
        }
        for (int i12 = 0; i12 < this.E && i10 >= 0 && i10 < i; i12++) {
            ((m.b) cVar).a(i10, 0);
            i10 += i11;
        }
    }

    public final void j1(int i) {
        if (i == 0 || i == 1) {
            d((String) null);
            if (i != this.f2237r || this.f2239t == null) {
                s a10 = s.a(this, i);
                this.f2239t = a10;
                this.C.f2245a = a10;
                this.f2237r = i;
                t0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(b9.m.b("invalid orientation:", i));
    }

    public final int k(RecyclerView.y yVar) {
        return L0(yVar);
    }

    public final void k0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.B = dVar;
            if (this.z != -1) {
                dVar.f2264a = -1;
            }
            t0();
        }
    }

    public void k1(boolean z10) {
        d((String) null);
        if (this.f2243x != z10) {
            this.f2243x = z10;
            t0();
        }
    }

    public int l(RecyclerView.y yVar) {
        return M0(yVar);
    }

    public final Parcelable l0() {
        d dVar = this.B;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (x() > 0) {
            P0();
            boolean z10 = this.f2240u ^ this.f2242w;
            dVar2.f2266c = z10;
            if (z10) {
                View a12 = a1();
                dVar2.f2265b = this.f2239t.g() - this.f2239t.b(a12);
                dVar2.f2264a = N(a12);
            } else {
                View b12 = b1();
                dVar2.f2264a = N(b12);
                dVar2.f2265b = this.f2239t.e(b12) - this.f2239t.k();
            }
        } else {
            dVar2.f2264a = -1;
        }
        return dVar2;
    }

    public final void l1(int i, int i10, boolean z10, RecyclerView.y yVar) {
        int i11;
        int i12 = 1;
        boolean z11 = false;
        this.f2238s.f2263l = this.f2239t.i() == 0 && this.f2239t.f() == 0;
        this.f2238s.f2259f = i;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        J0(yVar, iArr);
        int max = Math.max(0, this.F[0]);
        int max2 = Math.max(0, this.F[1]);
        if (i == 1) {
            z11 = true;
        }
        c cVar = this.f2238s;
        int i13 = z11 ? max2 : max;
        cVar.f2260h = i13;
        if (!z11) {
            max = max2;
        }
        cVar.i = max;
        if (z11) {
            cVar.f2260h = this.f2239t.h() + i13;
            View a12 = a1();
            c cVar2 = this.f2238s;
            if (this.f2242w) {
                i12 = -1;
            }
            cVar2.f2258e = i12;
            int N = N(a12);
            c cVar3 = this.f2238s;
            cVar2.f2257d = N + cVar3.f2258e;
            cVar3.f2255b = this.f2239t.b(a12);
            i11 = this.f2239t.b(a12) - this.f2239t.g();
        } else {
            View b12 = b1();
            c cVar4 = this.f2238s;
            cVar4.f2260h = this.f2239t.k() + cVar4.f2260h;
            c cVar5 = this.f2238s;
            if (!this.f2242w) {
                i12 = -1;
            }
            cVar5.f2258e = i12;
            int N2 = N(b12);
            c cVar6 = this.f2238s;
            cVar5.f2257d = N2 + cVar6.f2258e;
            cVar6.f2255b = this.f2239t.e(b12);
            i11 = (-this.f2239t.e(b12)) + this.f2239t.k();
        }
        c cVar7 = this.f2238s;
        cVar7.f2256c = i10;
        if (z10) {
            cVar7.f2256c = i10 - i11;
        }
        cVar7.g = i11;
    }

    public int m(RecyclerView.y yVar) {
        return N0(yVar);
    }

    public final void m1(int i, int i10) {
        this.f2238s.f2256c = this.f2239t.g() - i10;
        c cVar = this.f2238s;
        cVar.f2258e = this.f2242w ? -1 : 1;
        cVar.f2257d = i;
        cVar.f2259f = 1;
        cVar.f2255b = i10;
        cVar.g = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
    }

    public final int n(RecyclerView.y yVar) {
        return L0(yVar);
    }

    public final void n1(int i, int i10) {
        this.f2238s.f2256c = i10 - this.f2239t.k();
        c cVar = this.f2238s;
        cVar.f2257d = i;
        cVar.f2258e = this.f2242w ? 1 : -1;
        cVar.f2259f = -1;
        cVar.f2255b = i10;
        cVar.g = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
    }

    public int o(RecyclerView.y yVar) {
        return M0(yVar);
    }

    public int p(RecyclerView.y yVar) {
        return N0(yVar);
    }

    public final View s(int i) {
        int x10 = x();
        if (x10 == 0) {
            return null;
        }
        int N = i - N(w(0));
        if (N >= 0 && N < x10) {
            View w6 = w(N);
            if (N(w6) == i) {
                return w6;
            }
        }
        return super.s(i);
    }

    public RecyclerView.o t() {
        return new RecyclerView.o(-2, -2);
    }

    public int u0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2237r == 1) {
            return 0;
        }
        return i1(i, tVar, yVar);
    }

    public final void v0(int i) {
        this.z = i;
        this.A = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        d dVar = this.B;
        if (dVar != null) {
            dVar.f2264a = -1;
        }
        t0();
    }

    public int w0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2237r == 0) {
            return 0;
        }
        return i1(i, tVar, yVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        RecyclerView.n.d O = RecyclerView.n.O(context, attributeSet, i, i10);
        j1(O.f2359a);
        boolean z10 = O.f2361c;
        d((String) null);
        if (z10 != this.f2241v) {
            this.f2241v = z10;
            t0();
        }
        k1(O.f2362d);
    }
}
