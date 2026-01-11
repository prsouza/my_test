package y3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import c4.b;
import c4.j;
import com.bumptech.glide.g;
import g3.f;
import g3.h;
import g3.l;
import java.util.Map;
import java.util.Objects;
import p3.l;
import y3.a;

public abstract class a<T extends a<T>> implements Cloneable {
    public f A = b4.a.f2864b;
    public boolean B;
    public boolean C = true;
    public Drawable D;
    public int E;
    public h F = new h();
    public Map<Class<?>, l<?>> G = new b();
    public Class<?> H = Object.class;
    public boolean I;
    public Resources.Theme J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N = true;
    public boolean O;

    /* renamed from: a  reason: collision with root package name */
    public int f13425a;

    /* renamed from: b  reason: collision with root package name */
    public float f13426b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public i3.l f13427c = i3.l.f6086c;

    /* renamed from: s  reason: collision with root package name */
    public g f13428s = g.NORMAL;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f13429t;

    /* renamed from: u  reason: collision with root package name */
    public int f13430u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f13431v;

    /* renamed from: w  reason: collision with root package name */
    public int f13432w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f13433x = true;

    /* renamed from: y  reason: collision with root package name */
    public int f13434y = -1;
    public int z = -1;

    public static boolean h(int i, int i10) {
        return (i & i10) != 0;
    }

    /* JADX WARNING: type inference failed for: r0v45, types: [java.util.Map<java.lang.Class<?>, g3.l<?>>, c4.b] */
    /* JADX WARNING: type inference failed for: r0v51, types: [s.a, java.util.Map<java.lang.Class<?>, g3.l<?>>] */
    public T a(a<?> aVar) {
        if (this.K) {
            return clone().a(aVar);
        }
        if (h(aVar.f13425a, 2)) {
            this.f13426b = aVar.f13426b;
        }
        if (h(aVar.f13425a, 262144)) {
            this.L = aVar.L;
        }
        if (h(aVar.f13425a, 1048576)) {
            this.O = aVar.O;
        }
        if (h(aVar.f13425a, 4)) {
            this.f13427c = aVar.f13427c;
        }
        if (h(aVar.f13425a, 8)) {
            this.f13428s = aVar.f13428s;
        }
        if (h(aVar.f13425a, 16)) {
            this.f13429t = aVar.f13429t;
            this.f13430u = 0;
            this.f13425a &= -33;
        }
        if (h(aVar.f13425a, 32)) {
            this.f13430u = aVar.f13430u;
            this.f13429t = null;
            this.f13425a &= -17;
        }
        if (h(aVar.f13425a, 64)) {
            this.f13431v = aVar.f13431v;
            this.f13432w = 0;
            this.f13425a &= -129;
        }
        if (h(aVar.f13425a, 128)) {
            this.f13432w = aVar.f13432w;
            this.f13431v = null;
            this.f13425a &= -65;
        }
        if (h(aVar.f13425a, 256)) {
            this.f13433x = aVar.f13433x;
        }
        if (h(aVar.f13425a, 512)) {
            this.z = aVar.z;
            this.f13434y = aVar.f13434y;
        }
        if (h(aVar.f13425a, 1024)) {
            this.A = aVar.A;
        }
        if (h(aVar.f13425a, LZ4Constants.HASH_TABLE_SIZE)) {
            this.H = aVar.H;
        }
        if (h(aVar.f13425a, LZ4Constants.HASH_TABLE_SIZE_64K)) {
            this.D = aVar.D;
            this.E = 0;
            this.f13425a &= -16385;
        }
        if (h(aVar.f13425a, 16384)) {
            this.E = aVar.E;
            this.D = null;
            this.f13425a &= -8193;
        }
        if (h(aVar.f13425a, LZ4Constants.HASH_TABLE_SIZE_HC)) {
            this.J = aVar.J;
        }
        if (h(aVar.f13425a, LZ4Constants.MAX_DISTANCE)) {
            this.C = aVar.C;
        }
        if (h(aVar.f13425a, 131072)) {
            this.B = aVar.B;
        }
        if (h(aVar.f13425a, 2048)) {
            this.G.putAll(aVar.G);
            this.N = aVar.N;
        }
        if (h(aVar.f13425a, 524288)) {
            this.M = aVar.M;
        }
        if (!this.C) {
            this.G.clear();
            this.B = false;
            this.f13425a = this.f13425a & -2049 & -131073;
            this.N = true;
        }
        this.f13425a |= aVar.f13425a;
        this.F.d(aVar.F);
        l();
        return this;
    }

    public final T b() {
        if (!this.I || this.K) {
            this.K = true;
            this.I = true;
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: c */
    public T clone() {
        try {
            T t10 = (a) super.clone();
            h hVar = new h();
            t10.F = hVar;
            hVar.d(this.F);
            b bVar = new b();
            t10.G = bVar;
            bVar.putAll(this.G);
            t10.I = false;
            t10.K = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final T d(Class<?> cls) {
        if (this.K) {
            return clone().d(cls);
        }
        this.H = cls;
        this.f13425a |= LZ4Constants.HASH_TABLE_SIZE;
        l();
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [java.util.Map<java.lang.Class<?>, g3.l<?>>, s.g] */
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.f13426b, this.f13426b) == 0 && this.f13430u == aVar.f13430u && j.b(this.f13429t, aVar.f13429t) && this.f13432w == aVar.f13432w && j.b(this.f13431v, aVar.f13431v) && this.E == aVar.E && j.b(this.D, aVar.D) && this.f13433x == aVar.f13433x && this.f13434y == aVar.f13434y && this.z == aVar.z && this.B == aVar.B && this.C == aVar.C && this.L == aVar.L && this.M == aVar.M && this.f13427c.equals(aVar.f13427c) && this.f13428s == aVar.f13428s && this.F.equals(aVar.F) && this.G.equals(aVar.G) && this.H.equals(aVar.H) && j.b(this.A, aVar.A) && j.b(this.J, aVar.J);
        }
    }

    public final T g(i3.l lVar) {
        if (this.K) {
            return clone().g(lVar);
        }
        this.f13427c = lVar;
        this.f13425a |= 4;
        l();
        return this;
    }

    public final int hashCode() {
        float f10 = this.f13426b;
        char[] cArr = j.f3244a;
        return j.g(this.J, j.g(this.A, j.g(this.H, j.g(this.G, j.g(this.F, j.g(this.f13428s, j.g(this.f13427c, (((((((((((((j.g(this.D, (j.g(this.f13431v, (j.g(this.f13429t, ((Float.floatToIntBits(f10) + 527) * 31) + this.f13430u) * 31) + this.f13432w) * 31) + this.E) * 31) + (this.f13433x ? 1 : 0)) * 31) + this.f13434y) * 31) + this.z) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0))))))));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [g3.l, g3.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T i(p3.l r2, g3.l<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.K
            if (r0 == 0) goto L_0x000d
            y3.a r0 = r1.clone()
            y3.a r2 = r0.i(r2, r3)
            return r2
        L_0x000d:
            g3.g<p3.l> r0 = p3.l.f9604f
            r1.m(r0, r2)
            r2 = 0
            y3.a r2 = r1.q(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.a.i(p3.l, g3.l):y3.a");
    }

    public final T j(int i, int i10) {
        if (this.K) {
            return clone().j(i, i10);
        }
        this.z = i;
        this.f13434y = i10;
        this.f13425a |= 512;
        l();
        return this;
    }

    public final T k(g gVar) {
        if (this.K) {
            return clone().k(gVar);
        }
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f13428s = gVar;
        this.f13425a |= 8;
        l();
        return this;
    }

    public final T l() {
        if (!this.I) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [c4.b, s.a<g3.g<?>, java.lang.Object>] */
    public final <Y> T m(g3.g<Y> gVar, Y y10) {
        if (this.K) {
            return clone().m(gVar, y10);
        }
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.F.f5237b.put(gVar, y10);
        l();
        return this;
    }

    public final T n(f fVar) {
        if (this.K) {
            return clone().n(fVar);
        }
        this.A = fVar;
        this.f13425a |= 1024;
        l();
        return this;
    }

    public final a o() {
        if (this.K) {
            return clone().o();
        }
        this.f13433x = false;
        this.f13425a |= 256;
        l();
        return this;
    }

    public final a p(l lVar) {
        l.c cVar = p3.l.f9599a;
        if (this.K) {
            return clone().p(lVar);
        }
        m(p3.l.f9604f, cVar);
        return q(lVar, true);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [g3.l, g3.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T q(g3.l<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.K
            if (r0 == 0) goto L_0x000d
            y3.a r0 = r2.clone()
            y3.a r3 = r0.q(r3, r4)
            return r3
        L_0x000d:
            p3.o r0 = new p3.o
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.r(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.r(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.r(r1, r0, r4)
            java.lang.Class<t3.c> r0 = t3.c.class
            t3.e r1 = new t3.e
            r1.<init>(r3)
            r2.r(r0, r1, r4)
            r2.l()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.a.q(g3.l, boolean):y3.a");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map<java.lang.Class<?>, g3.l<?>>, c4.b] */
    public final <Y> T r(Class<Y> cls, g3.l<Y> lVar, boolean z10) {
        if (this.K) {
            return clone().r(cls, lVar, z10);
        }
        Objects.requireNonNull(lVar, "Argument must not be null");
        this.G.put(cls, lVar);
        this.C = true;
        int i = this.f13425a | 2048 | LZ4Constants.MAX_DISTANCE;
        this.f13425a = i;
        this.N = false;
        if (z10) {
            this.f13425a = i | 131072;
            this.B = true;
        }
        l();
        return this;
    }

    public final a u() {
        if (this.K) {
            return clone().u();
        }
        this.O = true;
        this.f13425a |= 1048576;
        l();
        return this;
    }
}
