package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public final class w implements a.C0020a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2592a;

    public w(RecyclerView recyclerView) {
        this.f2592a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i = bVar.f2451a;
        if (i == 1) {
            this.f2592a.B.c0(bVar.f2452b, bVar.f2454d);
        } else if (i == 2) {
            this.f2592a.B.f0(bVar.f2452b, bVar.f2454d);
        } else if (i == 4) {
            this.f2592a.B.g0(bVar.f2452b, bVar.f2454d);
        } else if (i == 8) {
            this.f2592a.B.e0(bVar.f2452b, bVar.f2454d);
        }
    }

    public final RecyclerView.b0 b(int i) {
        RecyclerView recyclerView = this.f2592a;
        int h10 = recyclerView.f2289t.h();
        int i10 = 0;
        RecyclerView.b0 b0Var = null;
        while (true) {
            if (i10 >= h10) {
                break;
            }
            RecyclerView.b0 K = RecyclerView.K(recyclerView.f2289t.g(i10));
            if (K != null && !K.l() && K.f2313c == i) {
                if (!recyclerView.f2289t.k(K.f2311a)) {
                    b0Var = K;
                    break;
                }
                b0Var = K;
            }
            i10++;
        }
        if (b0Var != null && !this.f2592a.f2289t.k(b0Var.f2311a)) {
            return b0Var;
        }
        return null;
    }

    public final void c(int i, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f2592a;
        int h10 = recyclerView.f2289t.h();
        int i13 = i10 + i;
        for (int i14 = 0; i14 < h10; i14++) {
            View g = recyclerView.f2289t.g(i14);
            RecyclerView.b0 K = RecyclerView.K(g);
            if (K != null && !K.t() && (i12 = K.f2313c) >= i && i12 < i13) {
                K.b(2);
                K.a(obj);
                ((RecyclerView.o) g.getLayoutParams()).f2365c = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2269b;
        int size = tVar.f2375c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.b0 b0Var = tVar.f2375c.get(size);
                if (b0Var != null && (i11 = b0Var.f2313c) >= i && i11 < i13) {
                    b0Var.b(2);
                    tVar.f(size);
                }
            } else {
                this.f2592a.z0 = true;
                return;
            }
        }
    }

    public final void d(int i, int i10) {
        RecyclerView recyclerView = this.f2592a;
        int h10 = recyclerView.f2289t.h();
        for (int i11 = 0; i11 < h10; i11++) {
            RecyclerView.b0 K = RecyclerView.K(recyclerView.f2289t.g(i11));
            if (K != null && !K.t() && K.f2313c >= i) {
                K.p(i10, false);
                recyclerView.f2294v0.f2400f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2269b;
        int size = tVar.f2375c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.b0 b0Var = tVar.f2375c.get(i12);
            if (b0Var != null && b0Var.f2313c >= i) {
                b0Var.p(i10, false);
            }
        }
        recyclerView.requestLayout();
        this.f2592a.f2300y0 = true;
    }

    public final void e(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.f2592a;
        int h10 = recyclerView.f2289t.h();
        int i18 = -1;
        if (i < i10) {
            i13 = i;
            i12 = i10;
            i11 = -1;
        } else {
            i12 = i;
            i13 = i10;
            i11 = 1;
        }
        for (int i19 = 0; i19 < h10; i19++) {
            RecyclerView.b0 K = RecyclerView.K(recyclerView.f2289t.g(i19));
            if (K != null && (i17 = K.f2313c) >= i13 && i17 <= i12) {
                if (i17 == i) {
                    K.p(i10 - i, false);
                } else {
                    K.p(i11, false);
                }
                recyclerView.f2294v0.f2400f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2269b;
        if (i < i10) {
            i15 = i;
            i14 = i10;
        } else {
            i14 = i;
            i15 = i10;
            i18 = 1;
        }
        int size = tVar.f2375c.size();
        for (int i20 = 0; i20 < size; i20++) {
            RecyclerView.b0 b0Var = tVar.f2375c.get(i20);
            if (b0Var != null && (i16 = b0Var.f2313c) >= i15 && i16 <= i14) {
                if (i16 == i) {
                    b0Var.p(i10 - i, false);
                } else {
                    b0Var.p(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f2592a.f2300y0 = true;
    }
}
