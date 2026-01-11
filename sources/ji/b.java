package ji;

import com.github.mikephil.charting.BuildConfig;
import zb.b0;
import zb.d0;
import zb.n;
import zb.r;

public final class b extends r<b, a> implements b0 {

    /* renamed from: y  reason: collision with root package name */
    public static final b f7267y;
    public static volatile d0<b> z;

    /* renamed from: s  reason: collision with root package name */
    public int f7268s = 0;

    /* renamed from: t  reason: collision with root package name */
    public Object f7269t;

    /* renamed from: u  reason: collision with root package name */
    public String f7270u = BuildConfig.FLAVOR;

    /* renamed from: v  reason: collision with root package name */
    public String f7271v = BuildConfig.FLAVOR;

    /* renamed from: w  reason: collision with root package name */
    public String f7272w = BuildConfig.FLAVOR;

    /* renamed from: x  reason: collision with root package name */
    public String f7273x = BuildConfig.FLAVOR;

    public static final class a extends r.a<b, a> implements b0 {
        public a() {
            super(b.f7267y);
        }
    }

    static {
        b bVar = new b();
        f7267y = bVar;
        bVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (!this.f7270u.isEmpty()) {
            i10 = 0 + n.u2(1, this.f7270u);
        }
        if (!this.f7271v.isEmpty()) {
            i10 += n.u2(2, this.f7271v);
        }
        if (!this.f7272w.isEmpty()) {
            i10 += n.u2(3, this.f7272w);
        }
        if (!this.f7273x.isEmpty()) {
            i10 += n.u2(4, this.f7273x);
        }
        if (this.f7268s == 5) {
            i10 += n.w2(5, (d) this.f7269t);
        }
        if (this.f7268s == 6) {
            i10 += n.w2(6, (k) this.f7269t);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        if (!this.f7270u.isEmpty()) {
            nVar.G2(1, this.f7270u);
        }
        if (!this.f7271v.isEmpty()) {
            nVar.G2(2, this.f7271v);
        }
        if (!this.f7272w.isEmpty()) {
            nVar.G2(3, this.f7272w);
        }
        if (!this.f7273x.isEmpty()) {
            nVar.G2(4, this.f7273x);
        }
        if (this.f7268s == 5) {
            nVar.I2(5, (d) this.f7269t);
        }
        if (this.f7268s == 6) {
            nVar.I2(6, (k) this.f7269t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0191, code lost:
        if (r7.f7268s == 6) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0196, code lost:
        if (r7.f7268s == 5) goto L_0x0198;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(zb.r.h r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = this;
            int r8 = r8.ordinal()
            r0 = 0
            r1 = 6
            r2 = 5
            r3 = 0
            r4 = 1
            switch(r8) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x0107;
                case 2: goto L_0x003d;
                case 3: goto L_0x003c;
                case 4: goto L_0x0036;
                case 5: goto L_0x0030;
                case 6: goto L_0x0104;
                case 7: goto L_0x0012;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            r8.<init>()
            throw r8
        L_0x0012:
            zb.d0<ji.b> r8 = z
            if (r8 != 0) goto L_0x002d
            java.lang.Class<ji.b> r8 = ji.b.class
            monitor-enter(r8)
            zb.d0<ji.b> r9 = z     // Catch:{ all -> 0x0027 }
            if (r9 != 0) goto L_0x0029
            zb.r$b r9 = new zb.r$b     // Catch:{ all -> 0x0027 }
            ji.b r10 = f7267y     // Catch:{ all -> 0x0027 }
            r9.<init>(r10)     // Catch:{ all -> 0x0027 }
            z = r9     // Catch:{ all -> 0x0027 }
            goto L_0x0029
        L_0x0027:
            r9 = move-exception
            goto L_0x002b
        L_0x0029:
            monitor-exit(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x002d
        L_0x002b:
            monitor-exit(r8)     // Catch:{ all -> 0x0027 }
            throw r9
        L_0x002d:
            zb.d0<ji.b> r8 = z
            return r8
        L_0x0030:
            ji.b$a r8 = new ji.b$a
            r8.<init>()
            return r8
        L_0x0036:
            ji.b r8 = new ji.b
            r8.<init>()
            return r8
        L_0x003c:
            return r0
        L_0x003d:
            zb.m r9 = (zb.m) r9
            zb.p r10 = (zb.p) r10
        L_0x0041:
            if (r3 != 0) goto L_0x0104
            int r8 = r9.r()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            if (r8 == 0) goto L_0x00eb
            r5 = 10
            if (r8 == r5) goto L_0x00e3
            r5 = 18
            if (r8 == r5) goto L_0x00db
            r5 = 26
            if (r8 == r5) goto L_0x00d3
            r5 = 34
            if (r8 == r5) goto L_0x00cb
            r5 = 42
            if (r8 == r5) goto L_0x009e
            r5 = 50
            if (r8 == r5) goto L_0x0072
            boolean r8 = r9.i(r8)     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            if (r8 != 0) goto L_0x0041
            goto L_0x00eb
        L_0x0069:
            r8 = move-exception
            goto L_0x0103
        L_0x006c:
            r8 = move-exception
            goto L_0x00ee
        L_0x006f:
            r8 = move-exception
            goto L_0x00fd
        L_0x0072:
            int r8 = r7.f7268s     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            if (r8 != r1) goto L_0x0081
            java.lang.Object r8 = r7.f7269t     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            ji.k r8 = (ji.k) r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            zb.r$a r8 = r8.c()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            ji.k$a r8 = (ji.k.a) r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            goto L_0x0082
        L_0x0081:
            r8 = r0
        L_0x0082:
            ji.k r5 = ji.k.f7323v     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            zb.d0 r5 = r5.o()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            zb.a0 r5 = r9.b(r5, r10)     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r7.f7269t = r5     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            if (r8 == 0) goto L_0x009b
            ji.k r5 = (ji.k) r5     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r8.h(r5)     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            zb.r r8 = r8.j()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r7.f7269t = r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
        L_0x009b:
            r7.f7268s = r1     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            goto L_0x0041
        L_0x009e:
            int r8 = r7.f7268s     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            if (r8 != r2) goto L_0x00ad
            java.lang.Object r8 = r7.f7269t     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            ji.d r8 = (ji.d) r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            zb.r$a r8 = r8.c()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            ji.d$a r8 = (ji.d.a) r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            goto L_0x00ae
        L_0x00ad:
            r8 = r0
        L_0x00ae:
            ji.d r5 = ji.d.f7281t     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            zb.d0 r5 = r5.o()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            zb.a0 r5 = r9.b(r5, r10)     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r7.f7269t = r5     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            if (r8 == 0) goto L_0x00c7
            ji.d r5 = (ji.d) r5     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r8.h(r5)     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            zb.r r8 = r8.j()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r7.f7269t = r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
        L_0x00c7:
            r7.f7268s = r2     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            goto L_0x0041
        L_0x00cb:
            java.lang.String r8 = r9.q()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r7.f7273x = r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            goto L_0x0041
        L_0x00d3:
            java.lang.String r8 = r9.q()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r7.f7272w = r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            goto L_0x0041
        L_0x00db:
            java.lang.String r8 = r9.q()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r7.f7271v = r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            goto L_0x0041
        L_0x00e3:
            java.lang.String r8 = r9.q()     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            r7.f7270u = r8     // Catch:{ u -> 0x006f, IOException -> 0x006c }
            goto L_0x0041
        L_0x00eb:
            r3 = r4
            goto L_0x0041
        L_0x00ee:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ all -> 0x0069 }
            zb.u r10 = new zb.u     // Catch:{ all -> 0x0069 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0069 }
            r10.<init>(r8)     // Catch:{ all -> 0x0069 }
            r9.<init>(r10)     // Catch:{ all -> 0x0069 }
            throw r9     // Catch:{ all -> 0x0069 }
        L_0x00fd:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ all -> 0x0069 }
            r9.<init>(r8)     // Catch:{ all -> 0x0069 }
            throw r9     // Catch:{ all -> 0x0069 }
        L_0x0103:
            throw r8
        L_0x0104:
            ji.b r8 = f7267y
            return r8
        L_0x0107:
            zb.r$i r9 = (zb.r.i) r9
            ji.b r10 = (ji.b) r10
            java.lang.String r8 = r7.f7270u
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r4
            java.lang.String r0 = r7.f7270u
            java.lang.String r5 = r10.f7270u
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r4
            java.lang.String r6 = r10.f7270u
            java.lang.String r8 = r9.o(r8, r0, r5, r6)
            r7.f7270u = r8
            java.lang.String r8 = r7.f7271v
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r4
            java.lang.String r0 = r7.f7271v
            java.lang.String r5 = r10.f7271v
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r4
            java.lang.String r6 = r10.f7271v
            java.lang.String r8 = r9.o(r8, r0, r5, r6)
            r7.f7271v = r8
            java.lang.String r8 = r7.f7272w
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r4
            java.lang.String r0 = r7.f7272w
            java.lang.String r5 = r10.f7272w
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r4
            java.lang.String r6 = r10.f7272w
            java.lang.String r8 = r9.o(r8, r0, r5, r6)
            r7.f7272w = r8
            java.lang.String r8 = r7.f7273x
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r4
            java.lang.String r0 = r7.f7273x
            java.lang.String r5 = r10.f7273x
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r4
            java.lang.String r6 = r10.f7273x
            java.lang.String r8 = r9.o(r8, r0, r5, r6)
            r7.f7273x = r8
            int r8 = r10.f7268s
            r0 = 2
            if (r8 == 0) goto L_0x017a
            if (r8 == r2) goto L_0x0178
            if (r8 == r1) goto L_0x0176
            r8 = r3
            goto L_0x017b
        L_0x0176:
            r8 = r0
            goto L_0x017b
        L_0x0178:
            r8 = r4
            goto L_0x017b
        L_0x017a:
            r8 = 3
        L_0x017b:
            int r8 = aa.b.d(r8)
            if (r8 == 0) goto L_0x0194
            if (r8 == r4) goto L_0x018f
            if (r8 == r0) goto L_0x0186
            goto L_0x01a3
        L_0x0186:
            int r8 = r7.f7268s
            if (r8 == 0) goto L_0x018b
            r3 = r4
        L_0x018b:
            r9.b(r3)
            goto L_0x01a3
        L_0x018f:
            int r8 = r7.f7268s
            if (r8 != r1) goto L_0x0199
            goto L_0x0198
        L_0x0194:
            int r8 = r7.f7268s
            if (r8 != r2) goto L_0x0199
        L_0x0198:
            r3 = r4
        L_0x0199:
            java.lang.Object r8 = r7.f7269t
            java.lang.Object r0 = r10.f7269t
            java.lang.Object r8 = r9.c(r3, r8, r0)
            r7.f7269t = r8
        L_0x01a3:
            zb.r$g r8 = zb.r.g.f14366a
            if (r9 != r8) goto L_0x01ad
            int r8 = r10.f7268s
            if (r8 == 0) goto L_0x01ad
            r7.f7268s = r8
        L_0x01ad:
            return r7
        L_0x01ae:
            ji.b r8 = f7267y
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.b.g(zb.r$h, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
