package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import c4.j;
import i3.l;
import i3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import v3.n;
import y3.b;
import y3.c;
import y3.d;
import y3.e;
import y3.f;
import z3.h;

public final class i<TranscodeType> extends y3.a<i<TranscodeType>> {
    public final Context P;
    public final j Q;
    public final Class<TranscodeType> R;
    public final d S;
    public k<?, ? super TranscodeType> T;
    public Object U;
    public List<e<TranscodeType>> V;
    public i<TranscodeType> W;
    public i<TranscodeType> X;
    public boolean Y = true;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f3534a0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3535a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f3536b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.g[] r0 = com.bumptech.glide.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3536b = r0
                r1 = 1
                com.bumptech.glide.g r2 = com.bumptech.glide.g.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3536b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.g r3 = com.bumptech.glide.g.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3536b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.g r4 = com.bumptech.glide.g.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3536b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.g r5 = com.bumptech.glide.g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f3535a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f3535a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f3535a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f3535a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f3535a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f3535a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f3535a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f3535a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.i.a.<clinit>():void");
        }
    }

    static {
        f fVar = (f) ((f) ((f) new f().g(l.f6085b)).k(g.LOW)).o();
    }

    public i(b bVar, j jVar, Class<TranscodeType> cls, Context context) {
        f fVar;
        this.Q = jVar;
        this.R = cls;
        this.P = context;
        d dVar = jVar.f3537a.f3495c;
        k<?, ?> kVar = dVar.f3521f.get(cls);
        if (kVar == null) {
            for (Map.Entry next : dVar.f3521f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (k) next.getValue();
                }
            }
        }
        this.T = kVar == null ? d.f3515k : kVar;
        this.S = bVar.f3495c;
        Iterator<e<Object>> it = jVar.f3545x.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
        synchronized (jVar) {
            fVar = jVar.f3546y;
        }
        a(fVar);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.List<y3.c>, java.util.ArrayList] */
    public final <Y extends h<TranscodeType>> h A(h hVar, y3.a aVar) {
        Objects.requireNonNull(hVar, "Argument must not be null");
        if (this.Z) {
            c x10 = x(new Object(), hVar, (d) null, this.T, aVar.f13428s, aVar.z, aVar.f13434y, aVar);
            c request = hVar.getRequest();
            if (x10.b(request)) {
                if (!(!aVar.f13433x && request.j())) {
                    Objects.requireNonNull(request, "Argument must not be null");
                    if (!request.isRunning()) {
                        request.i();
                    }
                    return hVar;
                }
            }
            this.Q.h(hVar);
            hVar.e(x10);
            j jVar = this.Q;
            synchronized (jVar) {
                jVar.f3542u.f12291a.add(hVar);
                n nVar = jVar.f3540s;
                nVar.f12281a.add(x10);
                if (!nVar.f12283c) {
                    x10.i();
                } else {
                    x10.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    nVar.f12282b.add(x10);
                }
            }
            return hVar;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final i<TranscodeType> B(Object obj) {
        if (this.K) {
            return clone().B(obj);
        }
        this.U = obj;
        this.Z = true;
        l();
        return this;
    }

    public final c C(Object obj, h hVar, y3.a aVar, d dVar, k kVar, g gVar, int i, int i10) {
        Context context = this.P;
        d dVar2 = this.S;
        Object obj2 = this.U;
        Class<TranscodeType> cls = this.R;
        List<e<TranscodeType>> list = this.V;
        m mVar = dVar2.g;
        Objects.requireNonNull(kVar);
        return new y3.h(context, dVar2, obj, obj2, cls, aVar, i, i10, gVar, hVar, list, dVar, mVar);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<y3.e<TranscodeType>>, java.util.ArrayList] */
    public final i<TranscodeType> v(e<TranscodeType> eVar) {
        if (this.K) {
            return clone().v(eVar);
        }
        if (eVar != null) {
            if (this.V == null) {
                this.V = new ArrayList();
            }
            this.V.add(eVar);
        }
        l();
        return this;
    }

    /* renamed from: w */
    public final i<TranscodeType> a(y3.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (i) super.a(aVar);
    }

    public final c x(Object obj, h hVar, d dVar, k kVar, g gVar, int i, int i10, y3.a aVar) {
        b bVar;
        b bVar2;
        y3.i iVar;
        int i11;
        int i12;
        g gVar2;
        int i13;
        int i14;
        Object obj2 = obj;
        y3.a aVar2 = aVar;
        if (this.X != null) {
            bVar2 = new b(obj2, dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        i<TranscodeType> iVar2 = this.W;
        if (iVar2 == null) {
            iVar = C(obj, hVar, aVar, bVar2, kVar, gVar, i, i10);
        } else if (!this.f3534a0) {
            k<?, ? super TranscodeType> kVar2 = iVar2.Y ? kVar : iVar2.T;
            if (y3.a.h(iVar2.f13425a, 8)) {
                gVar2 = this.W.f13428s;
                g gVar3 = gVar;
            } else {
                gVar2 = z(gVar);
            }
            g gVar4 = gVar2;
            i<TranscodeType> iVar3 = this.W;
            int i15 = iVar3.z;
            int i16 = iVar3.f13434y;
            if (j.j(i, i10)) {
                i<TranscodeType> iVar4 = this.W;
                if (!j.j(iVar4.z, iVar4.f13434y)) {
                    i14 = aVar2.z;
                    i13 = aVar2.f13434y;
                    y3.i iVar5 = new y3.i(obj2, bVar2);
                    Object obj3 = obj;
                    h hVar2 = hVar;
                    y3.i iVar6 = iVar5;
                    c C = C(obj3, hVar2, aVar, iVar5, kVar, gVar, i, i10);
                    this.f3534a0 = true;
                    i<TranscodeType> iVar7 = this.W;
                    c x10 = iVar7.x(obj3, hVar2, iVar6, kVar2, gVar4, i14, i13, iVar7);
                    this.f3534a0 = false;
                    y3.i iVar8 = iVar6;
                    iVar8.f13466c = C;
                    iVar8.f13467d = x10;
                    iVar = iVar8;
                }
            }
            i13 = i16;
            i14 = i15;
            y3.i iVar52 = new y3.i(obj2, bVar2);
            Object obj32 = obj;
            h hVar22 = hVar;
            y3.i iVar62 = iVar52;
            c C2 = C(obj32, hVar22, aVar, iVar52, kVar, gVar, i, i10);
            this.f3534a0 = true;
            i<TranscodeType> iVar72 = this.W;
            c x102 = iVar72.x(obj32, hVar22, iVar62, kVar2, gVar4, i14, i13, iVar72);
            this.f3534a0 = false;
            y3.i iVar82 = iVar62;
            iVar82.f13466c = C2;
            iVar82.f13467d = x102;
            iVar = iVar82;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return iVar;
        }
        i<TranscodeType> iVar9 = this.X;
        int i17 = iVar9.z;
        int i18 = iVar9.f13434y;
        if (j.j(i, i10)) {
            i<TranscodeType> iVar10 = this.X;
            if (!j.j(iVar10.z, iVar10.f13434y)) {
                i12 = aVar2.z;
                i11 = aVar2.f13434y;
                i<TranscodeType> iVar11 = this.X;
                c x11 = iVar11.x(obj, hVar, bVar, iVar11.T, iVar11.f13428s, i12, i11, iVar11);
                bVar.f13437c = iVar;
                bVar.f13438d = x11;
                return bVar;
            }
        }
        i11 = i18;
        i12 = i17;
        i<TranscodeType> iVar112 = this.X;
        c x112 = iVar112.x(obj, hVar, bVar, iVar112.T, iVar112.f13428s, i12, i11, iVar112);
        bVar.f13437c = iVar;
        bVar.f13438d = x112;
        return bVar;
    }

    /* renamed from: y */
    public final i<TranscodeType> clone() {
        i<TranscodeType> iVar = (i) super.clone();
        iVar.T = iVar.T.a();
        if (iVar.V != null) {
            iVar.V = new ArrayList(iVar.V);
        }
        i<TranscodeType> iVar2 = iVar.W;
        if (iVar2 != null) {
            iVar.W = iVar2.clone();
        }
        i<TranscodeType> iVar3 = iVar.X;
        if (iVar3 != null) {
            iVar.X = iVar3.clone();
        }
        return iVar;
    }

    public final g z(g gVar) {
        int i = a.f3536b[gVar.ordinal()];
        if (i == 1) {
            return g.NORMAL;
        }
        if (i == 2) {
            return g.HIGH;
        }
        if (i == 3 || i == 4) {
            return g.IMMEDIATE;
        }
        StringBuilder d10 = a.a.d("unknown priority: ");
        d10.append(this.f13428s);
        throw new IllegalArgumentException(d10.toString());
    }
}
