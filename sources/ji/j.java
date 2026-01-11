package ji;

import zb.b0;
import zb.d0;
import zb.n;
import zb.r;

public final class j extends r<j, a> implements b0 {

    /* renamed from: u  reason: collision with root package name */
    public static final j f7319u;

    /* renamed from: v  reason: collision with root package name */
    public static volatile d0<j> f7320v;

    /* renamed from: s  reason: collision with root package name */
    public int f7321s = 0;

    /* renamed from: t  reason: collision with root package name */
    public Object f7322t;

    public static final class a extends r.a<j, a> implements b0 {
        public a() {
            super(j.f7319u);
        }
    }

    static {
        j jVar = new j();
        f7319u = jVar;
        jVar.p();
    }

    public static a r() {
        return (a) f7319u.c();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (this.f7321s == 1) {
            i10 = 0 + n.w2(1, (f) this.f7322t);
        }
        if (this.f7321s == 2) {
            i10 += n.w2(2, (e) this.f7322t);
        }
        if (this.f7321s == 3) {
            i10 += n.w2(3, (i) this.f7322t);
        }
        if (this.f7321s == 4) {
            i10 += n.w2(4, (g) this.f7322t);
        }
        if (this.f7321s == 5) {
            i10 += n.w2(5, (h) this.f7322t);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        if (this.f7321s == 1) {
            nVar.I2(1, (f) this.f7322t);
        }
        if (this.f7321s == 2) {
            nVar.I2(2, (e) this.f7322t);
        }
        if (this.f7321s == 3) {
            nVar.I2(3, (i) this.f7322t);
        }
        if (this.f7321s == 4) {
            nVar.I2(4, (g) this.f7322t);
        }
        if (this.f7321s == 5) {
            nVar.I2(5, (h) this.f7322t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01a7, code lost:
        if (r8.f7321s == 5) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ac, code lost:
        if (r8.f7321s == 4) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b1, code lost:
        if (r8.f7321s == 3) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01b6, code lost:
        if (r8.f7321s == 2) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01bb, code lost:
        if (r8.f7321s == 1) goto L_0x01bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(zb.r.h r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            int r9 = r9.ordinal()
            r0 = 0
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r9) {
                case 0: goto L_0x01d3;
                case 1: goto L_0x016c;
                case 2: goto L_0x003f;
                case 3: goto L_0x003e;
                case 4: goto L_0x0038;
                case 5: goto L_0x0032;
                case 6: goto L_0x0169;
                case 7: goto L_0x0014;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            r9.<init>()
            throw r9
        L_0x0014:
            zb.d0<ji.j> r9 = f7320v
            if (r9 != 0) goto L_0x002f
            java.lang.Class<ji.j> r9 = ji.j.class
            monitor-enter(r9)
            zb.d0<ji.j> r10 = f7320v     // Catch:{ all -> 0x0029 }
            if (r10 != 0) goto L_0x002b
            zb.r$b r10 = new zb.r$b     // Catch:{ all -> 0x0029 }
            ji.j r11 = f7319u     // Catch:{ all -> 0x0029 }
            r10.<init>(r11)     // Catch:{ all -> 0x0029 }
            f7320v = r10     // Catch:{ all -> 0x0029 }
            goto L_0x002b
        L_0x0029:
            r10 = move-exception
            goto L_0x002d
        L_0x002b:
            monitor-exit(r9)     // Catch:{ all -> 0x0029 }
            goto L_0x002f
        L_0x002d:
            monitor-exit(r9)     // Catch:{ all -> 0x0029 }
            throw r10
        L_0x002f:
            zb.d0<ji.j> r9 = f7320v
            return r9
        L_0x0032:
            ji.j$a r9 = new ji.j$a
            r9.<init>()
            return r9
        L_0x0038:
            ji.j r9 = new ji.j
            r9.<init>()
            return r9
        L_0x003e:
            return r1
        L_0x003f:
            zb.m r10 = (zb.m) r10
            zb.p r11 = (zb.p) r11
        L_0x0043:
            if (r0 != 0) goto L_0x0169
            int r9 = r10.r()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 == 0) goto L_0x0150
            r7 = 10
            if (r9 == r7) goto L_0x0123
            r7 = 18
            if (r9 == r7) goto L_0x00f6
            r7 = 26
            if (r9 == r7) goto L_0x00c9
            r7 = 34
            if (r9 == r7) goto L_0x009c
            r7 = 42
            if (r9 == r7) goto L_0x0070
            boolean r9 = r10.i(r9)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 != 0) goto L_0x0043
            goto L_0x0150
        L_0x0067:
            r9 = move-exception
            goto L_0x0168
        L_0x006a:
            r9 = move-exception
            goto L_0x0153
        L_0x006d:
            r9 = move-exception
            goto L_0x0162
        L_0x0070:
            int r9 = r8.f7321s     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 != r2) goto L_0x007f
            java.lang.Object r9 = r8.f7322t     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.h r9 = (ji.h) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r$a r9 = r9.c()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.h$a r9 = (ji.h.a) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x0080
        L_0x007f:
            r9 = r1
        L_0x0080:
            ji.h r7 = ji.h.B     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.d0 r7 = r7.o()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.a0 r7 = r10.b(r7, r11)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 == 0) goto L_0x0099
            ji.h r7 = (ji.h) r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r9.h(r7)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r r9 = r9.j()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
        L_0x0099:
            r8.f7321s = r2     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x0043
        L_0x009c:
            int r9 = r8.f7321s     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 != r3) goto L_0x00ab
            java.lang.Object r9 = r8.f7322t     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.g r9 = (ji.g) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r$a r9 = r9.c()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.g$a r9 = (ji.g.a) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x00ac
        L_0x00ab:
            r9 = r1
        L_0x00ac:
            ji.g r7 = ji.g.B     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.d0 r7 = r7.o()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.a0 r7 = r10.b(r7, r11)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 == 0) goto L_0x00c5
            ji.g r7 = (ji.g) r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r9.h(r7)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r r9 = r9.j()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
        L_0x00c5:
            r8.f7321s = r3     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x0043
        L_0x00c9:
            int r9 = r8.f7321s     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 != r4) goto L_0x00d8
            java.lang.Object r9 = r8.f7322t     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.i r9 = (ji.i) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r$a r9 = r9.c()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.i$a r9 = (ji.i.a) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x00d9
        L_0x00d8:
            r9 = r1
        L_0x00d9:
            ji.i r7 = ji.i.A     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.d0 r7 = r7.o()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.a0 r7 = r10.b(r7, r11)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 == 0) goto L_0x00f2
            ji.i r7 = (ji.i) r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r9.h(r7)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r r9 = r9.j()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
        L_0x00f2:
            r8.f7321s = r4     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x0043
        L_0x00f6:
            int r9 = r8.f7321s     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 != r5) goto L_0x0105
            java.lang.Object r9 = r8.f7322t     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.e r9 = (ji.e) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r$a r9 = r9.c()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.e$a r9 = (ji.e.a) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x0106
        L_0x0105:
            r9 = r1
        L_0x0106:
            ji.e r7 = ji.e.f7284y     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.d0 r7 = r7.o()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.a0 r7 = r10.b(r7, r11)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 == 0) goto L_0x011f
            ji.e r7 = (ji.e) r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r9.h(r7)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r r9 = r9.j()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
        L_0x011f:
            r8.f7321s = r5     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x0043
        L_0x0123:
            int r9 = r8.f7321s     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 != r6) goto L_0x0132
            java.lang.Object r9 = r8.f7322t     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.f r9 = (ji.f) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r$a r9 = r9.c()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            ji.f$a r9 = (ji.f.a) r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x0133
        L_0x0132:
            r9 = r1
        L_0x0133:
            ji.f r7 = ji.f.A     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.d0 r7 = r7.o()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.a0 r7 = r10.b(r7, r11)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            if (r9 == 0) goto L_0x014c
            ji.f r7 = (ji.f) r7     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r9.h(r7)     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            zb.r r9 = r9.j()     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            r8.f7322t = r9     // Catch:{ u -> 0x006d, IOException -> 0x006a }
        L_0x014c:
            r8.f7321s = r6     // Catch:{ u -> 0x006d, IOException -> 0x006a }
            goto L_0x0043
        L_0x0150:
            r0 = r6
            goto L_0x0043
        L_0x0153:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ all -> 0x0067 }
            zb.u r11 = new zb.u     // Catch:{ all -> 0x0067 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x0067 }
            r11.<init>(r9)     // Catch:{ all -> 0x0067 }
            r10.<init>(r11)     // Catch:{ all -> 0x0067 }
            throw r10     // Catch:{ all -> 0x0067 }
        L_0x0162:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ all -> 0x0067 }
            r10.<init>(r9)     // Catch:{ all -> 0x0067 }
            throw r10     // Catch:{ all -> 0x0067 }
        L_0x0168:
            throw r9
        L_0x0169:
            ji.j r9 = f7319u
            return r9
        L_0x016c:
            zb.r$i r10 = (zb.r.i) r10
            ji.j r11 = (ji.j) r11
            int r9 = r11.f7321s
            if (r9 == 0) goto L_0x018a
            if (r9 == r6) goto L_0x0188
            if (r9 == r5) goto L_0x0186
            if (r9 == r4) goto L_0x0184
            if (r9 == r3) goto L_0x0182
            if (r9 == r2) goto L_0x0180
            r9 = r0
            goto L_0x018b
        L_0x0180:
            r9 = r2
            goto L_0x018b
        L_0x0182:
            r9 = r3
            goto L_0x018b
        L_0x0184:
            r9 = r4
            goto L_0x018b
        L_0x0186:
            r9 = r5
            goto L_0x018b
        L_0x0188:
            r9 = r6
            goto L_0x018b
        L_0x018a:
            r9 = 6
        L_0x018b:
            int r9 = aa.b.d(r9)
            if (r9 == 0) goto L_0x01b9
            if (r9 == r6) goto L_0x01b4
            if (r9 == r5) goto L_0x01af
            if (r9 == r4) goto L_0x01aa
            if (r9 == r3) goto L_0x01a5
            if (r9 == r2) goto L_0x019c
            goto L_0x01c8
        L_0x019c:
            int r9 = r8.f7321s
            if (r9 == 0) goto L_0x01a1
            r0 = r6
        L_0x01a1:
            r10.b(r0)
            goto L_0x01c8
        L_0x01a5:
            int r9 = r8.f7321s
            if (r9 != r2) goto L_0x01be
            goto L_0x01bd
        L_0x01aa:
            int r9 = r8.f7321s
            if (r9 != r3) goto L_0x01be
            goto L_0x01bd
        L_0x01af:
            int r9 = r8.f7321s
            if (r9 != r4) goto L_0x01be
            goto L_0x01bd
        L_0x01b4:
            int r9 = r8.f7321s
            if (r9 != r5) goto L_0x01be
            goto L_0x01bd
        L_0x01b9:
            int r9 = r8.f7321s
            if (r9 != r6) goto L_0x01be
        L_0x01bd:
            r0 = r6
        L_0x01be:
            java.lang.Object r9 = r8.f7322t
            java.lang.Object r1 = r11.f7322t
            java.lang.Object r9 = r10.c(r0, r9, r1)
            r8.f7322t = r9
        L_0x01c8:
            zb.r$g r9 = zb.r.g.f14366a
            if (r10 != r9) goto L_0x01d2
            int r9 = r11.f7321s
            if (r9 == 0) goto L_0x01d2
            r8.f7321s = r9
        L_0x01d2:
            return r8
        L_0x01d3:
            ji.j r9 = f7319u
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.j.g(zb.r$h, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
