package b;

import zb.b0;
import zb.d0;
import zb.n;
import zb.r;

public final class j extends r<j, a> implements b0 {

    /* renamed from: u  reason: collision with root package name */
    public static final j f2791u;

    /* renamed from: v  reason: collision with root package name */
    public static volatile d0<j> f2792v;

    /* renamed from: s  reason: collision with root package name */
    public int f2793s = 0;

    /* renamed from: t  reason: collision with root package name */
    public Object f2794t;

    public static final class a extends r.a<j, a> implements b0 {
        public a() {
            super(j.f2791u);
        }
    }

    static {
        j jVar = new j();
        f2791u = jVar;
        jVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (this.f2793s == 2) {
            i10 = 0 + n.w2(2, (d) this.f2794t);
        }
        if (this.f2793s == 3) {
            i10 += n.w2(3, (a) this.f2794t);
        }
        if (this.f2793s == 4) {
            i10 += n.w2(4, (c) this.f2794t);
        }
        if (this.f2793s == 5) {
            i10 += n.w2(5, (b) this.f2794t);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        if (this.f2793s == 2) {
            nVar.I2(2, (d) this.f2794t);
        }
        if (this.f2793s == 3) {
            nVar.I2(3, (a) this.f2794t);
        }
        if (this.f2793s == 4) {
            nVar.I2(4, (c) this.f2794t);
        }
        if (this.f2793s == 5) {
            nVar.I2(5, (b) this.f2794t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0168, code lost:
        if (r8.f2793s == 5) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x016d, code lost:
        if (r8.f2793s == 4) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0172, code lost:
        if (r8.f2793s == 3) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0177, code lost:
        if (r8.f2793s == 2) goto L_0x0179;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(zb.r.h r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            int r9 = r9.ordinal()
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r9) {
                case 0: goto L_0x018f;
                case 1: goto L_0x0133;
                case 2: goto L_0x003d;
                case 3: goto L_0x003c;
                case 4: goto L_0x0036;
                case 5: goto L_0x0030;
                case 6: goto L_0x0130;
                case 7: goto L_0x0014;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            r9.<init>()
            throw r9
        L_0x0014:
            zb.d0<b.j> r9 = f2792v
            if (r9 != 0) goto L_0x002d
            java.lang.Class<b.j> r9 = b.j.class
            monitor-enter(r9)
            zb.d0<b.j> r10 = f2792v     // Catch:{ all -> 0x002a }
            if (r10 != 0) goto L_0x0028
            zb.r$b r10 = new zb.r$b     // Catch:{ all -> 0x002a }
            b.j r11 = f2791u     // Catch:{ all -> 0x002a }
            r10.<init>(r11)     // Catch:{ all -> 0x002a }
            f2792v = r10     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r9)     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x002a }
            throw r10
        L_0x002d:
            zb.d0<b.j> r9 = f2792v
            return r9
        L_0x0030:
            b.j$a r9 = new b.j$a
            r9.<init>()
            return r9
        L_0x0036:
            b.j r9 = new b.j
            r9.<init>()
            return r9
        L_0x003c:
            return r2
        L_0x003d:
            zb.m r10 = (zb.m) r10
            zb.p r11 = (zb.p) r11
        L_0x0041:
            if (r0 != 0) goto L_0x0130
            int r9 = r10.r()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 == 0) goto L_0x0113
            r7 = 18
            if (r9 == r7) goto L_0x00e6
            r7 = 26
            if (r9 == r7) goto L_0x00b9
            r7 = 34
            if (r9 == r7) goto L_0x008d
            r7 = 42
            if (r9 == r7) goto L_0x0061
            boolean r9 = r10.i(r9)     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 != 0) goto L_0x0041
            goto L_0x0113
        L_0x0061:
            int r9 = r8.f2793s     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 != r3) goto L_0x0070
            java.lang.Object r9 = r8.f2794t     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            b.b r9 = (b.b) r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.r$a r9 = r9.c()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            b.b$a r9 = (b.b.a) r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            goto L_0x0071
        L_0x0070:
            r9 = r2
        L_0x0071:
            b.b r7 = b.b.f2755v     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.d0 r7 = r7.o()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.a0 r7 = r10.b(r7, r11)     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r8.f2794t = r7     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 == 0) goto L_0x008a
            b.b r7 = (b.b) r7     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r9.h(r7)     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.r r9 = r9.j()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r8.f2794t = r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
        L_0x008a:
            r8.f2793s = r3     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            goto L_0x0041
        L_0x008d:
            int r9 = r8.f2793s     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 != r4) goto L_0x009c
            java.lang.Object r9 = r8.f2794t     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            b.c r9 = (b.c) r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.r$a r9 = r9.c()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            b.c$a r9 = (b.c.a) r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            goto L_0x009d
        L_0x009c:
            r9 = r2
        L_0x009d:
            b.c r7 = b.c.f2760u     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.d0 r7 = r7.o()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.a0 r7 = r10.b(r7, r11)     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r8.f2794t = r7     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 == 0) goto L_0x00b6
            b.c r7 = (b.c) r7     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r9.h(r7)     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.r r9 = r9.j()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r8.f2794t = r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
        L_0x00b6:
            r8.f2793s = r4     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            goto L_0x0041
        L_0x00b9:
            int r9 = r8.f2793s     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 != r5) goto L_0x00c8
            java.lang.Object r9 = r8.f2794t     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            b.a r9 = (b.a) r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.r$a r9 = r9.c()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            b.a$a r9 = (b.a.C0028a) r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            goto L_0x00c9
        L_0x00c8:
            r9 = r2
        L_0x00c9:
            b.a r7 = b.a.f2751u     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.d0 r7 = r7.o()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.a0 r7 = r10.b(r7, r11)     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r8.f2794t = r7     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 == 0) goto L_0x00e2
            b.a r7 = (b.a) r7     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r9.h(r7)     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.r r9 = r9.j()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r8.f2794t = r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
        L_0x00e2:
            r8.f2793s = r5     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            goto L_0x0041
        L_0x00e6:
            int r9 = r8.f2793s     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 != r6) goto L_0x00f5
            java.lang.Object r9 = r8.f2794t     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            b.d r9 = (b.d) r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.r$a r9 = r9.c()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            b.d$a r9 = (b.d.a) r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            goto L_0x00f6
        L_0x00f5:
            r9 = r2
        L_0x00f6:
            b.d r7 = b.d.f2764t     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.d0 r7 = r7.o()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.a0 r7 = r10.b(r7, r11)     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r8.f2794t = r7     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            if (r9 == 0) goto L_0x010f
            b.d r7 = (b.d) r7     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r9.h(r7)     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            zb.r r9 = r9.j()     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            r8.f2794t = r9     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
        L_0x010f:
            r8.f2793s = r6     // Catch:{ u -> 0x0128, IOException -> 0x0118 }
            goto L_0x0041
        L_0x0113:
            r0 = r1
            goto L_0x0041
        L_0x0116:
            r9 = move-exception
            goto L_0x012f
        L_0x0118:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ all -> 0x0116 }
            zb.u r11 = new zb.u     // Catch:{ all -> 0x0116 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x0116 }
            r11.<init>(r9)     // Catch:{ all -> 0x0116 }
            r10.<init>(r11)     // Catch:{ all -> 0x0116 }
            throw r10     // Catch:{ all -> 0x0116 }
        L_0x0128:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ all -> 0x0116 }
            r10.<init>(r9)     // Catch:{ all -> 0x0116 }
            throw r10     // Catch:{ all -> 0x0116 }
        L_0x012f:
            throw r9
        L_0x0130:
            b.j r9 = f2791u
            return r9
        L_0x0133:
            zb.r$i r10 = (zb.r.i) r10
            b.j r11 = (b.j) r11
            int r9 = r11.f2793s
            if (r9 == 0) goto L_0x014d
            if (r9 == r6) goto L_0x014b
            if (r9 == r5) goto L_0x0149
            if (r9 == r4) goto L_0x0147
            if (r9 == r3) goto L_0x0145
            r9 = r0
            goto L_0x014e
        L_0x0145:
            r9 = r4
            goto L_0x014e
        L_0x0147:
            r9 = r5
            goto L_0x014e
        L_0x0149:
            r9 = r6
            goto L_0x014e
        L_0x014b:
            r9 = r1
            goto L_0x014e
        L_0x014d:
            r9 = r3
        L_0x014e:
            int r9 = aa.b.d(r9)
            if (r9 == 0) goto L_0x0175
            if (r9 == r1) goto L_0x0170
            if (r9 == r6) goto L_0x016b
            if (r9 == r5) goto L_0x0166
            if (r9 == r4) goto L_0x015d
            goto L_0x0184
        L_0x015d:
            int r9 = r8.f2793s
            if (r9 == 0) goto L_0x0162
            r0 = r1
        L_0x0162:
            r10.b(r0)
            goto L_0x0184
        L_0x0166:
            int r9 = r8.f2793s
            if (r9 != r3) goto L_0x017a
            goto L_0x0179
        L_0x016b:
            int r9 = r8.f2793s
            if (r9 != r4) goto L_0x017a
            goto L_0x0179
        L_0x0170:
            int r9 = r8.f2793s
            if (r9 != r5) goto L_0x017a
            goto L_0x0179
        L_0x0175:
            int r9 = r8.f2793s
            if (r9 != r6) goto L_0x017a
        L_0x0179:
            r0 = r1
        L_0x017a:
            java.lang.Object r9 = r8.f2794t
            java.lang.Object r1 = r11.f2794t
            java.lang.Object r9 = r10.c(r0, r9, r1)
            r8.f2794t = r9
        L_0x0184:
            zb.r$g r9 = zb.r.g.f14366a
            if (r10 != r9) goto L_0x018e
            int r9 = r11.f2793s
            if (r9 == 0) goto L_0x018e
            r8.f2793s = r9
        L_0x018e:
            return r8
        L_0x018f:
            b.j r9 = f2791u
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.g(zb.r$h, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final b r() {
        return this.f2793s == 5 ? (b) this.f2794t : b.f2755v;
    }
}
