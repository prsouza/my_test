package w2;

import com.github.mikephil.charting.BuildConfig;
import java.util.List;
import java.util.Locale;
import o2.f;
import u2.j;
import u2.k;
import u2.l;
import v2.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<v2.b> f12584a;

    /* renamed from: b  reason: collision with root package name */
    public final f f12585b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12586c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12587d;

    /* renamed from: e  reason: collision with root package name */
    public final a f12588e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12589f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final List<g> f12590h;
    public final l i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12591j;

    /* renamed from: k  reason: collision with root package name */
    public final int f12592k;

    /* renamed from: l  reason: collision with root package name */
    public final int f12593l;

    /* renamed from: m  reason: collision with root package name */
    public final float f12594m;

    /* renamed from: n  reason: collision with root package name */
    public final float f12595n;

    /* renamed from: o  reason: collision with root package name */
    public final int f12596o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12597p;

    /* renamed from: q  reason: collision with root package name */
    public final j f12598q;

    /* renamed from: r  reason: collision with root package name */
    public final k f12599r;

    /* renamed from: s  reason: collision with root package name */
    public final u2.b f12600s;

    /* renamed from: t  reason: collision with root package name */
    public final List<b3.a<Float>> f12601t;

    /* renamed from: u  reason: collision with root package name */
    public final b f12602u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f12603v;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<v2.b> list, f fVar, String str, long j10, a aVar, long j11, String str2, List<g> list2, l lVar, int i10, int i11, int i12, float f10, float f11, int i13, int i14, j jVar, k kVar, List<b3.a<Float>> list3, b bVar, u2.b bVar2, boolean z) {
        this.f12584a = list;
        this.f12585b = fVar;
        this.f12586c = str;
        this.f12587d = j10;
        this.f12588e = aVar;
        this.f12589f = j11;
        this.g = str2;
        this.f12590h = list2;
        this.i = lVar;
        this.f12591j = i10;
        this.f12592k = i11;
        this.f12593l = i12;
        this.f12594m = f10;
        this.f12595n = f11;
        this.f12596o = i13;
        this.f12597p = i14;
        this.f12598q = jVar;
        this.f12599r = kVar;
        this.f12601t = list3;
        this.f12602u = bVar;
        this.f12600s = bVar2;
        this.f12603v = z;
    }

    public final String a(String str) {
        StringBuilder d10 = a.a.d(str);
        d10.append(this.f12586c);
        d10.append("\n");
        e d11 = this.f12585b.d(this.f12589f);
        if (d11 != null) {
            d10.append("\t\tParents: ");
            d10.append(d11.f12586c);
            e d12 = this.f12585b.d(d11.f12589f);
            while (d12 != null) {
                d10.append("->");
                d10.append(d12.f12586c);
                d12 = this.f12585b.d(d12.f12589f);
            }
            d10.append(str);
            d10.append("\n");
        }
        if (!this.f12590h.isEmpty()) {
            d10.append(str);
            d10.append("\tMasks: ");
            d10.append(this.f12590h.size());
            d10.append("\n");
        }
        if (!(this.f12591j == 0 || this.f12592k == 0)) {
            d10.append(str);
            d10.append("\tBackground: ");
            d10.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f12591j), Integer.valueOf(this.f12592k), Integer.valueOf(this.f12593l)}));
        }
        if (!this.f12584a.isEmpty()) {
            d10.append(str);
            d10.append("\tShapes:\n");
            for (v2.b next : this.f12584a) {
                d10.append(str);
                d10.append("\t\t");
                d10.append(next);
                d10.append("\n");
            }
        }
        return d10.toString();
    }

    public final String toString() {
        return a(BuildConfig.FLAVOR);
    }
}
