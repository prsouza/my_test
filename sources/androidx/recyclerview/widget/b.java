package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C0021b f2459a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2460b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f2461c = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f2462a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f2463b;

        public final void a(int i) {
            if (i >= 64) {
                a aVar = this.f2463b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.f2462a &= ~(1 << i);
        }

        public final int b(int i) {
            a aVar = this.f2463b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f2462a);
                }
                return Long.bitCount(this.f2462a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f2462a & ((1 << i) - 1));
            } else {
                return Long.bitCount(this.f2462a) + aVar.b(i - 64);
            }
        }

        public final void c() {
            if (this.f2463b == null) {
                this.f2463b = new a();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return (this.f2462a & (1 << i)) != 0;
            }
            c();
            return this.f2463b.d(i - 64);
        }

        public final void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.f2463b.e(i - 64, z);
                return;
            }
            long j10 = this.f2462a;
            boolean z10 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i) - 1;
            this.f2462a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z10 || this.f2463b != null) {
                c();
                this.f2463b.e(0, z10);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f2463b.f(i - 64);
            }
            long j10 = 1 << i;
            long j11 = this.f2462a;
            boolean z = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f2462a = j12;
            long j13 = j10 - 1;
            this.f2462a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f2463b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2463b.f(0);
            }
            return z;
        }

        public final void g() {
            this.f2462a = 0;
            a aVar = this.f2463b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i) {
            if (i >= 64) {
                c();
                this.f2463b.h(i - 64);
                return;
            }
            this.f2462a |= 1 << i;
        }

        public final String toString() {
            if (this.f2463b == null) {
                return Long.toBinaryString(this.f2462a);
            }
            return this.f2463b.toString() + "xx" + Long.toBinaryString(this.f2462a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    public interface C0021b {
    }

    public b(C0021b bVar) {
        this.f2459a = bVar;
    }

    public final void a(View view, int i, boolean z) {
        int i10;
        if (i < 0) {
            i10 = ((v) this.f2459a).b();
        } else {
            i10 = f(i);
        }
        this.f2460b.e(i10, z);
        if (z) {
            i(view);
        }
        v vVar = (v) this.f2459a;
        vVar.f2591a.addView(view, i10);
        Objects.requireNonNull(vVar.f2591a);
        RecyclerView.K(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i10;
        if (i < 0) {
            i10 = ((v) this.f2459a).b();
        } else {
            i10 = f(i);
        }
        this.f2460b.e(i10, z);
        if (z) {
            i(view);
        }
        v vVar = (v) this.f2459a;
        Objects.requireNonNull(vVar);
        RecyclerView.b0 K = RecyclerView.K(view);
        if (K != null) {
            if (K.n() || K.t()) {
                K.f2318j &= -257;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called attach on a child which is not detached: ");
                sb2.append(K);
                throw new IllegalArgumentException(android.support.v4.media.a.c(vVar.f2591a, sb2));
            }
        }
        vVar.f2591a.attachViewToParent(view, i10, layoutParams);
    }

    public final void c(int i) {
        RecyclerView.b0 K;
        int f10 = f(i);
        this.f2460b.f(f10);
        v vVar = (v) this.f2459a;
        View a10 = vVar.a(f10);
        if (!(a10 == null || (K = RecyclerView.K(a10)) == null)) {
            if (!K.n() || K.t()) {
                K.b(256);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("called detach on an already detached child ");
                sb2.append(K);
                throw new IllegalArgumentException(android.support.v4.media.a.c(vVar.f2591a, sb2));
            }
        }
        vVar.f2591a.detachViewFromParent(f10);
    }

    public final View d(int i) {
        return ((v) this.f2459a).a(f(i));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final int e() {
        return ((v) this.f2459a).b() - this.f2461c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int b10 = ((v) this.f2459a).b();
        int i10 = i;
        while (i10 < b10) {
            int b11 = i - (i10 - this.f2460b.b(i10));
            if (b11 == 0) {
                while (this.f2460b.d(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += b11;
        }
        return -1;
    }

    public final View g(int i) {
        return ((v) this.f2459a).a(i);
    }

    public final int h() {
        return ((v) this.f2459a).b();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final void i(View view) {
        this.f2461c.add(view);
        v vVar = (v) this.f2459a;
        Objects.requireNonNull(vVar);
        RecyclerView.b0 K = RecyclerView.K(view);
        if (K != null) {
            RecyclerView recyclerView = vVar.f2591a;
            int i = K.f2325q;
            if (i != -1) {
                K.f2324p = i;
            } else {
                View view2 = K.f2311a;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                K.f2324p = x.d.c(view2);
            }
            recyclerView.f0(K, 4);
        }
    }

    public final int j(View view) {
        int c10 = ((v) this.f2459a).c(view);
        if (c10 != -1 && !this.f2460b.d(c10)) {
            return c10 - this.f2460b.b(c10);
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final boolean k(View view) {
        return this.f2461c.contains(view);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final boolean l(View view) {
        if (!this.f2461c.remove(view)) {
            return false;
        }
        v vVar = (v) this.f2459a;
        Objects.requireNonNull(vVar);
        RecyclerView.b0 K = RecyclerView.K(view);
        if (K == null) {
            return true;
        }
        vVar.f2591a.f0(K, K.f2324p);
        K.f2324p = 0;
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final String toString() {
        return this.f2460b.toString() + ", hidden list:" + this.f2461c.size();
    }
}
