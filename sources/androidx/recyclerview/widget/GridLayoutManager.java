package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.Arrays;
import java.util.Objects;
import net.jpountz.lz4.LZ4FrameOutputStream;
import o0.b;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean G = false;
    public int H = -1;
    public int[] I;
    public View[] J;
    public final SparseIntArray K = new SparseIntArray();
    public final SparseIntArray L = new SparseIntArray();
    public a M = new a();
    public final Rect N = new Rect();

    public static final class a extends c {
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f2235a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f2236b = new SparseIntArray();

        public final int a(int i, int i10) {
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i; i13++) {
                i11++;
                if (i11 == i10) {
                    i12++;
                    i11 = 0;
                } else if (i11 > i10) {
                    i12++;
                    i11 = 1;
                }
            }
            return i11 + 1 > i10 ? i12 + 1 : i12;
        }

        public final void b() {
            this.f2236b.clear();
        }

        public final void c() {
            this.f2235a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
        w1(RecyclerView.n.O(context, attributeSet, i, i10).f2360b);
    }

    public final void A0(Rect rect, int i, int i10) {
        int i11;
        int i12;
        if (this.I == null) {
            super.A0(rect, i, i10);
        }
        int L2 = L() + K();
        int J2 = J() + M();
        if (this.f2237r == 1) {
            i12 = RecyclerView.n.h(i10, rect.height() + J2, H());
            int[] iArr = this.I;
            i11 = RecyclerView.n.h(i, iArr[iArr.length - 1] + L2, I());
        } else {
            i11 = RecyclerView.n.h(i, rect.width() + L2, I());
            int[] iArr2 = this.I;
            i12 = RecyclerView.n.h(i10, iArr2[iArr2.length - 1] + J2, H());
        }
        z0(i11, i12);
    }

    public final boolean I0() {
        return this.B == null && !this.G;
    }

    public final void K0(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.n.c cVar2) {
        int i = this.H;
        for (int i10 = 0; i10 < this.H && cVar.b(yVar) && i > 0; i10++) {
            ((m.b) cVar2).a(cVar.f2257d, Math.max(0, cVar.g));
            Objects.requireNonNull(this.M);
            i--;
            cVar.f2257d += cVar.f2258e;
        }
    }

    public final int P(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2237r == 0) {
            return this.H;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return r1(tVar, yVar, yVar.b() - 1) + 1;
    }

    public final View X0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z, boolean z10) {
        int i;
        int x10 = x();
        int i10 = -1;
        if (z10) {
            i = x() - 1;
            x10 = -1;
        } else {
            i = 0;
            i10 = 1;
        }
        int b10 = yVar.b();
        P0();
        int k10 = this.f2239t.k();
        int g = this.f2239t.g();
        View view = null;
        View view2 = null;
        while (i != x10) {
            View w6 = w(i);
            int N2 = N(w6);
            if (N2 >= 0 && N2 < b10 && s1(tVar, yVar, N2) == 0) {
                if (((RecyclerView.o) w6.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = w6;
                    }
                } else if (this.f2239t.e(w6) < g && this.f2239t.b(w6) >= k10) {
                    return w6;
                } else {
                    if (view == null) {
                        view = w6;
                    }
                }
            }
            i += i10;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cb, code lost:
        if (r13 == (r2 > r15)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fb, code lost:
        if (r13 == (r2 > r9)) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Y(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.t r25, androidx.recyclerview.widget.RecyclerView.y r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.r(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f2233e
            int r5 = r5.f2234f
            int r5 = r5 + r6
            android.view.View r7 = super.Y(r23, r24, r25, r26)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r24
            int r7 = r0.O0(r7)
            r8 = 1
            if (r7 != r8) goto L_0x002b
            r7 = r8
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f2242w
            if (r7 == r10) goto L_0x0032
            r7 = r8
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r22.x()
            int r7 = r7 - r8
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r22.x()
            r11 = r7
            r12 = r8
            r7 = 0
        L_0x0045:
            int r13 = r0.f2237r
            if (r13 != r8) goto L_0x0051
            boolean r13 = r22.c1()
            if (r13 == 0) goto L_0x0051
            r13 = r8
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.r1(r1, r2, r7)
            r9 = r10
            r15 = r9
            r16 = r12
            r8 = 0
            r12 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x013f
            r17 = r11
            int r11 = r0.r1(r1, r2, r10)
            android.view.View r1 = r0.w(r10)
            if (r1 != r3) goto L_0x006e
            goto L_0x013f
        L_0x006e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0084
            if (r11 == r14) goto L_0x0084
            if (r4 == 0) goto L_0x007a
            goto L_0x013f
        L_0x007a:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = 1
            goto L_0x012f
        L_0x0084:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.b) r11
            int r2 = r11.f2233e
            r18 = r3
            int r3 = r11.f2234f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009c
            if (r2 != r6) goto L_0x009c
            if (r3 != r5) goto L_0x009c
            return r1
        L_0x009c:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a4
            if (r4 == 0) goto L_0x00ac
        L_0x00a4:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00af
            if (r7 != 0) goto L_0x00af
        L_0x00ac:
            r21 = r7
            goto L_0x00cd
        L_0x00af:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d3
            if (r7 <= r8) goto L_0x00c4
            goto L_0x00cd
        L_0x00c4:
            if (r7 != r8) goto L_0x0100
            if (r2 <= r15) goto L_0x00ca
            r7 = 1
            goto L_0x00cb
        L_0x00ca:
            r7 = 0
        L_0x00cb:
            if (r13 != r7) goto L_0x0100
        L_0x00cd:
            r19 = r8
            r7 = 1
            r20 = 1
            goto L_0x0105
        L_0x00d3:
            if (r4 != 0) goto L_0x0100
            r19 = r8
            androidx.recyclerview.widget.b0 r8 = r0.f2346e
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00e9
            androidx.recyclerview.widget.b0 r8 = r0.f2347f
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00e9
            r8 = 1
            goto L_0x00ea
        L_0x00e9:
            r8 = 0
        L_0x00ea:
            r20 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0104
            if (r7 <= r12) goto L_0x00f3
            goto L_0x00fd
        L_0x00f3:
            if (r7 != r12) goto L_0x0104
            if (r2 <= r9) goto L_0x00fa
            r7 = r20
            goto L_0x00fb
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            if (r13 != r7) goto L_0x0104
        L_0x00fd:
            r7 = r20
            goto L_0x0105
        L_0x0100:
            r19 = r8
            r20 = 1
        L_0x0104:
            r7 = 0
        L_0x0105:
            if (r7 == 0) goto L_0x012f
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L_0x011e
            int r4 = r11.f2233e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r8 = r3 - r2
            r15 = r4
            r7 = r21
            r4 = r1
            goto L_0x0133
        L_0x011e:
            int r7 = r11.f2233e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r9 = r7
            r8 = r19
            r7 = r1
            goto L_0x0133
        L_0x012f:
            r8 = r19
            r7 = r21
        L_0x0133:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            goto L_0x005e
        L_0x013f:
            r21 = r7
            if (r4 == 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r4 = r21
        L_0x0146:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Y(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    public final void b0(RecyclerView.t tVar, RecyclerView.y yVar, View view, o0.b bVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            a0(view, bVar);
            return;
        }
        b bVar2 = (b) layoutParams;
        int r12 = r1(tVar, yVar, bVar2.a());
        if (this.f2237r == 0) {
            bVar.q(b.c.a(bVar2.f2233e, bVar2.f2234f, r12, 1, false));
        } else {
            bVar.q(b.c.a(r12, 1, bVar2.f2233e, bVar2.f2234f, false));
        }
    }

    public final void c0(int i, int i10) {
        this.M.c();
        this.M.b();
    }

    public final void d0() {
        this.M.c();
        this.M.b();
    }

    public final void d1(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z;
        View c10;
        RecyclerView.t tVar2 = tVar;
        RecyclerView.y yVar2 = yVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int j10 = this.f2239t.j();
        boolean z10 = j10 != 1073741824;
        int i27 = x() > 0 ? this.I[this.H] : 0;
        if (z10) {
            x1();
        }
        boolean z11 = cVar2.f2258e == 1;
        int i28 = this.H;
        if (!z11) {
            i28 = s1(tVar2, yVar2, cVar2.f2257d) + t1(tVar2, yVar2, cVar2.f2257d);
        }
        int i29 = 0;
        while (i29 < this.H && cVar2.b(yVar2) && i28 > 0) {
            int i30 = cVar2.f2257d;
            int t12 = t1(tVar2, yVar2, i30);
            if (t12 <= this.H) {
                i28 -= t12;
                if (i28 < 0 || (c10 = cVar2.c(tVar2)) == null) {
                    break;
                }
                this.J[i29] = c10;
                i29++;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Item at position ");
                sb2.append(i30);
                sb2.append(" requires ");
                sb2.append(t12);
                sb2.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(d.c(sb2, this.H, " spans."));
            }
        }
        if (i29 == 0) {
            bVar2.f2251b = true;
            return;
        }
        if (z11) {
            i = 1;
            i10 = i29;
            i11 = 0;
        } else {
            i11 = i29 - 1;
            i10 = -1;
            i = -1;
        }
        int i31 = 0;
        while (i11 != i10) {
            View view = this.J[i11];
            b bVar3 = (b) view.getLayoutParams();
            int t13 = t1(tVar2, yVar2, N(view));
            bVar3.f2234f = t13;
            bVar3.f2233e = i31;
            i31 += t13;
            i11 += i;
        }
        float f10 = 0.0f;
        int i32 = 0;
        for (int i33 = 0; i33 < i29; i33++) {
            View view2 = this.J[i33];
            if (cVar2.f2262k != null) {
                z = false;
                if (z11) {
                    c(view2, -1, true);
                } else {
                    c(view2, 0, true);
                }
            } else if (z11) {
                b(view2);
                z = false;
            } else {
                z = false;
                c(view2, 0, false);
            }
            Rect rect = this.N;
            RecyclerView recyclerView = this.f2343b;
            if (recyclerView == null) {
                rect.set(z ? 1 : 0, z, z, z);
            } else {
                rect.set(recyclerView.L(view2));
            }
            u1(view2, j10, z);
            int c11 = this.f2239t.c(view2);
            if (c11 > i32) {
                i32 = c11;
            }
            float d10 = (((float) this.f2239t.d(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f2234f);
            if (d10 > f10) {
                f10 = d10;
            }
        }
        if (z10) {
            o1(Math.max(Math.round(f10 * ((float) this.H)), i27));
            i32 = 0;
            for (int i34 = 0; i34 < i29; i34++) {
                View view3 = this.J[i34];
                u1(view3, 1073741824, true);
                int c12 = this.f2239t.c(view3);
                if (c12 > i32) {
                    i32 = c12;
                }
            }
        }
        for (int i35 = 0; i35 < i29; i35++) {
            View view4 = this.J[i35];
            if (this.f2239t.c(view4) != i32) {
                b bVar4 = (b) view4.getLayoutParams();
                Rect rect2 = bVar4.f2364b;
                int i36 = rect2.top + rect2.bottom + bVar4.topMargin + bVar4.bottomMargin;
                int i37 = rect2.left + rect2.right + bVar4.leftMargin + bVar4.rightMargin;
                int q12 = q1(bVar4.f2233e, bVar4.f2234f);
                if (this.f2237r == 1) {
                    i26 = RecyclerView.n.y(q12, 1073741824, i37, bVar4.width, false);
                    i25 = View.MeasureSpec.makeMeasureSpec(i32 - i36, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i32 - i37, 1073741824);
                    i25 = RecyclerView.n.y(q12, 1073741824, i36, bVar4.height, false);
                    i26 = makeMeasureSpec;
                }
                v1(view4, i26, i25, true);
            }
        }
        bVar2.f2250a = i32;
        if (this.f2237r == 1) {
            if (cVar2.f2259f == -1) {
                i24 = cVar2.f2255b;
                i23 = i24 - i32;
            } else {
                int i38 = cVar2.f2255b;
                i23 = i38;
                i24 = i32 + i38;
            }
            i13 = i23;
            i14 = 0;
            i12 = i24;
            i15 = 0;
        } else {
            if (cVar2.f2259f == -1) {
                i15 = cVar2.f2255b;
                i22 = i15 - i32;
            } else {
                int i39 = cVar2.f2255b;
                i22 = i39;
                i15 = i32 + i39;
            }
            i14 = i22;
            i13 = 0;
            i12 = 0;
        }
        int i40 = 0;
        while (i40 < i29) {
            View view5 = this.J[i40];
            b bVar5 = (b) view5.getLayoutParams();
            if (this.f2237r == 1) {
                if (c1()) {
                    i21 = K() + this.I[this.H - bVar5.f2233e];
                    i20 = i21 - this.f2239t.d(view5);
                } else {
                    i20 = this.I[bVar5.f2233e] + K();
                    i21 = this.f2239t.d(view5) + i20;
                }
                i18 = i20;
                i17 = i13;
                i16 = i12;
                i19 = i21;
            } else {
                int M2 = M() + this.I[bVar5.f2233e];
                i19 = i15;
                i18 = i14;
                i17 = M2;
                i16 = this.f2239t.d(view5) + M2;
            }
            T(view5, i18, i17, i19, i16);
            if (bVar5.c() || bVar5.b()) {
                bVar2.f2252c = true;
            }
            bVar2.f2253d |= view5.hasFocusable();
            i40++;
            i15 = i19;
            i14 = i18;
            i13 = i17;
            i12 = i16;
        }
        Arrays.fill(this.J, (Object) null);
    }

    public final void e0(int i, int i10) {
        this.M.c();
        this.M.b();
    }

    public final void e1(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i) {
        x1();
        if (yVar.b() > 0 && !yVar.g) {
            boolean z = i == 1;
            int s12 = s1(tVar, yVar, aVar.f2246b);
            if (z) {
                while (s12 > 0) {
                    int i10 = aVar.f2246b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    aVar.f2246b = i11;
                    s12 = s1(tVar, yVar, i11);
                }
            } else {
                int b10 = yVar.b() - 1;
                int i12 = aVar.f2246b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int s13 = s1(tVar, yVar, i13);
                    if (s13 <= s12) {
                        break;
                    }
                    i12 = i13;
                    s12 = s13;
                }
                aVar.f2246b = i12;
            }
        }
        p1();
    }

    public final void f0(int i, int i10) {
        this.M.c();
        this.M.b();
    }

    public final boolean g(RecyclerView.o oVar) {
        return oVar instanceof b;
    }

    public final void g0(int i, int i10) {
        this.M.c();
        this.M.b();
    }

    public final void h0(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (yVar.g) {
            int x10 = x();
            for (int i = 0; i < x10; i++) {
                b bVar = (b) w(i).getLayoutParams();
                int a10 = bVar.a();
                this.K.put(a10, bVar.f2234f);
                this.L.put(a10, bVar.f2233e);
            }
        }
        super.h0(tVar, yVar);
        this.K.clear();
        this.L.clear();
    }

    public final void i0() {
        this.B = null;
        this.z = -1;
        this.A = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        this.C.d();
        this.G = false;
    }

    public final void k1(boolean z) {
        if (!z) {
            d((String) null);
            if (this.f2243x) {
                this.f2243x = false;
                t0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int l(RecyclerView.y yVar) {
        return M0(yVar);
    }

    public final int m(RecyclerView.y yVar) {
        return N0(yVar);
    }

    public final int o(RecyclerView.y yVar) {
        return M0(yVar);
    }

    public final void o1(int i) {
        int i10;
        int[] iArr = this.I;
        int i11 = this.H;
        if (!(iArr != null && iArr.length == i11 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i11 + 1)];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i / i11;
        int i14 = i % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.I = iArr;
    }

    public final int p(RecyclerView.y yVar) {
        return N0(yVar);
    }

    public final void p1() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    public final int q1(int i, int i10) {
        if (this.f2237r != 1 || !c1()) {
            int[] iArr = this.I;
            return iArr[i10 + i] - iArr[i];
        }
        int[] iArr2 = this.I;
        int i11 = this.H;
        return iArr2[i11 - i] - iArr2[(i11 - i) - i10];
    }

    public final int r1(RecyclerView.t tVar, RecyclerView.y yVar, int i) {
        if (!yVar.g) {
            return this.M.a(i, this.H);
        }
        int c10 = tVar.c(i);
        if (c10 != -1) {
            return this.M.a(c10, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int s1(RecyclerView.t tVar, RecyclerView.y yVar, int i) {
        if (!yVar.g) {
            a aVar = this.M;
            int i10 = this.H;
            Objects.requireNonNull(aVar);
            return i % i10;
        }
        int i11 = this.L.get(i, -1);
        if (i11 != -1) {
            return i11;
        }
        int c10 = tVar.c(i);
        if (c10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        a aVar2 = this.M;
        int i12 = this.H;
        Objects.requireNonNull(aVar2);
        return c10 % i12;
    }

    public final RecyclerView.o t() {
        if (this.f2237r == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public final int t1(RecyclerView.t tVar, RecyclerView.y yVar, int i) {
        if (!yVar.g) {
            Objects.requireNonNull(this.M);
            return 1;
        }
        int i10 = this.K.get(i, -1);
        if (i10 != -1) {
            return i10;
        }
        if (tVar.c(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        Objects.requireNonNull(this.M);
        return 1;
    }

    public final RecyclerView.o u(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public final int u0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        x1();
        p1();
        if (this.f2237r == 1) {
            return 0;
        }
        return i1(i, tVar, yVar);
    }

    public final void u1(View view, int i, boolean z) {
        int i10;
        int i11;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2364b;
        int i12 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i13 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int q12 = q1(bVar.f2233e, bVar.f2234f);
        if (this.f2237r == 1) {
            i10 = RecyclerView.n.y(q12, i, i13, bVar.width, false);
            i11 = RecyclerView.n.y(this.f2239t.l(), this.f2354o, i12, bVar.height, true);
        } else {
            int y10 = RecyclerView.n.y(q12, i, i12, bVar.height, false);
            int y11 = RecyclerView.n.y(this.f2239t.l(), this.f2353n, i13, bVar.width, true);
            i11 = y10;
            i10 = y11;
        }
        v1(view, i10, i11, z);
    }

    public final RecyclerView.o v(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public final void v1(View view, int i, int i10, boolean z) {
        boolean z10;
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        if (z) {
            z10 = F0(view, i, i10, oVar);
        } else {
            z10 = D0(view, i, i10, oVar);
        }
        if (z10) {
            view.measure(i, i10);
        }
    }

    public final int w0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        x1();
        p1();
        if (this.f2237r == 0) {
            return 0;
        }
        return i1(i, tVar, yVar);
    }

    public final void w1(int i) {
        if (i != this.H) {
            this.G = true;
            if (i >= 1) {
                this.H = i;
                this.M.c();
                t0();
                return;
            }
            throw new IllegalArgumentException(b9.m.b("Span count should be at least 1. Provided ", i));
        }
    }

    public final void x1() {
        int i;
        int i10;
        if (this.f2237r == 1) {
            i10 = this.f2355p - L();
            i = K();
        } else {
            i10 = this.f2356q - J();
            i = M();
        }
        o1(i10 - i);
    }

    public final int z(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2237r == 1) {
            return this.H;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return r1(tVar, yVar, yVar.b() - 1) + 1;
    }

    public static class b extends RecyclerView.o {

        /* renamed from: e  reason: collision with root package name */
        public int f2233e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2234f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i, int i10) {
            super(i, i10);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i, int i10, boolean z) {
        super(1);
        w1(i);
    }

    public GridLayoutManager(Context context, int i) {
        super(1);
        w1(i);
    }
}
