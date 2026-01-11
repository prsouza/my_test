package o2;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import t2.c;
import t2.d;
import t2.h;
import w2.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final t f9197a = new t();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f9198b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<e>> f9199c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, m> f9200d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, c> f9201e;

    /* renamed from: f  reason: collision with root package name */
    public List<h> f9202f;
    public s.h<d> g;

    /* renamed from: h  reason: collision with root package name */
    public s.d<e> f9203h;
    public List<e> i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f9204j;

    /* renamed from: k  reason: collision with root package name */
    public float f9205k;

    /* renamed from: l  reason: collision with root package name */
    public float f9206l;

    /* renamed from: m  reason: collision with root package name */
    public float f9207m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9208n;

    /* renamed from: o  reason: collision with root package name */
    public int f9209o = 0;

    public final void a(String str) {
        a3.c.b(str);
        this.f9198b.add(str);
    }

    public final float b() {
        return (float) ((long) (((this.f9206l - this.f9205k) / this.f9207m) * 1000.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r3.substring(0, r3.length() - 1).equalsIgnoreCase(r7) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t2.h c(java.lang.String r7) {
        /*
            r6 = this;
            java.util.List<t2.h> r0 = r6.f9202f
            r0.size()
            r0 = 0
            r1 = r0
        L_0x0007:
            java.util.List<t2.h> r2 = r6.f9202f
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0044
            java.util.List<t2.h> r2 = r6.f9202f
            java.lang.Object r2 = r2.get(r1)
            t2.h r2 = (t2.h) r2
            java.lang.String r3 = r2.f11277a
            boolean r3 = r3.equalsIgnoreCase(r7)
            r4 = 1
            if (r3 == 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.lang.String r3 = r2.f11277a
            java.lang.String r5 = "\r"
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r2.f11277a
            int r5 = r3.length()
            int r5 = r5 - r4
            java.lang.String r3 = r3.substring(r0, r5)
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = r0
        L_0x003e:
            if (r4 == 0) goto L_0x0041
            return r2
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0044:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.f.c(java.lang.String):t2.h");
    }

    public final e d(long j10) {
        return this.f9203h.g(j10, null);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (e a10 : this.i) {
            sb2.append(a10.a("\t"));
        }
        return sb2.toString();
    }
}
