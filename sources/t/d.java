package t;

import java.util.Arrays;
import java.util.Objects;
import t.g;

public final class d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f11169p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f11170q = 1000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11171a;

    /* renamed from: b  reason: collision with root package name */
    public int f11172b;

    /* renamed from: c  reason: collision with root package name */
    public f f11173c;

    /* renamed from: d  reason: collision with root package name */
    public int f11174d;

    /* renamed from: e  reason: collision with root package name */
    public int f11175e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f11176f;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f11177h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f11178j;

    /* renamed from: k  reason: collision with root package name */
    public int f11179k;

    /* renamed from: l  reason: collision with root package name */
    public final c f11180l;

    /* renamed from: m  reason: collision with root package name */
    public g[] f11181m;

    /* renamed from: n  reason: collision with root package name */
    public int f11182n;

    /* renamed from: o  reason: collision with root package name */
    public b f11183o;

    public interface a {
        g a(boolean[] zArr);
    }

    public d() {
        this.f11171a = false;
        this.f11172b = 0;
        this.f11174d = 32;
        this.f11175e = 32;
        this.f11176f = null;
        this.g = false;
        this.f11177h = new boolean[32];
        this.i = 1;
        this.f11178j = 0;
        this.f11179k = 32;
        this.f11181m = new g[f11170q];
        this.f11182n = 0;
        this.f11176f = new b[32];
        t();
        c cVar = new c();
        this.f11180l = cVar;
        this.f11173c = new f(cVar);
        this.f11183o = new b(cVar);
    }

    public final g a(g.a aVar, String str) {
        g gVar = (g) ((e) this.f11180l.f11167c).a();
        if (gVar == null) {
            gVar = new g(aVar);
            gVar.f11198x = aVar;
        } else {
            gVar.h();
            gVar.f11198x = aVar;
        }
        int i10 = this.f11182n;
        int i11 = f11170q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f11170q = i12;
            this.f11181m = (g[]) Arrays.copyOf(this.f11181m, i12);
        }
        g[] gVarArr = this.f11181m;
        int i13 = this.f11182n;
        this.f11182n = i13 + 1;
        gVarArr[i13] = gVar;
        return gVar;
    }

    public final void b(g gVar, g gVar2, int i10, float f10, g gVar3, g gVar4, int i11, int i12) {
        b m10 = m();
        if (gVar2 == gVar3) {
            m10.f11163d.d(gVar, 1.0f);
            m10.f11163d.d(gVar4, 1.0f);
            m10.f11163d.d(gVar2, -2.0f);
        } else if (f10 == 0.5f) {
            m10.f11163d.d(gVar, 1.0f);
            m10.f11163d.d(gVar2, -1.0f);
            m10.f11163d.d(gVar3, -1.0f);
            m10.f11163d.d(gVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                m10.f11161b = (float) ((-i10) + i11);
            }
        } else if (f10 <= 0.0f) {
            m10.f11163d.d(gVar, -1.0f);
            m10.f11163d.d(gVar2, 1.0f);
            m10.f11161b = (float) i10;
        } else if (f10 >= 1.0f) {
            m10.f11163d.d(gVar4, -1.0f);
            m10.f11163d.d(gVar3, 1.0f);
            m10.f11161b = (float) (-i11);
        } else {
            float f11 = 1.0f - f10;
            m10.f11163d.d(gVar, f11 * 1.0f);
            m10.f11163d.d(gVar2, f11 * -1.0f);
            m10.f11163d.d(gVar3, -1.0f * f10);
            m10.f11163d.d(gVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                m10.f11161b = (((float) i11) * f10) + (((float) (-i10)) * f11);
            }
        }
        if (i12 != 8) {
            m10.b(this, i12);
        }
        c(m10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r4.A <= 1) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        if (r4.A <= 1) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e7, code lost:
        if (r4.A <= 1) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f0, code lost:
        if (r4.A <= 1) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(t.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f11178j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f11179k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.f11175e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.p()
        L_0x0016:
            boolean r2 = r1.f11164e
            if (r2 != 0) goto L_0x01c3
            t.b[] r2 = r0.f11176f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0073
            t.b$a r6 = r1.f11163d
            int r6 = r6.f()
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x0044
            t.b$a r8 = r1.f11163d
            t.g r8 = r8.h(r7)
            int r9 = r8.f11192c
            if (r9 != r5) goto L_0x003c
            boolean r9 = r8.f11195u
            if (r9 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList<t.g> r9 = r1.f11162c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            java.util.ArrayList<t.g> r6 = r1.f11162c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0071
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006b
            java.util.ArrayList<t.g> r8 = r1.f11162c
            java.lang.Object r8 = r8.get(r7)
            t.g r8 = (t.g) r8
            boolean r9 = r8.f11195u
            if (r9 == 0) goto L_0x005f
            r1.j(r0, r8, r3)
            goto L_0x0068
        L_0x005f:
            t.b[] r9 = r0.f11176f
            int r8 = r8.f11192c
            r8 = r9[r8]
            r1.k(r0, r8, r3)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            java.util.ArrayList<t.g> r6 = r1.f11162c
            r6.clear()
            goto L_0x0022
        L_0x0071:
            r2 = r3
            goto L_0x0022
        L_0x0073:
            t.g r2 = r1.f11160a
            if (r2 == 0) goto L_0x0083
            t.b$a r2 = r1.f11163d
            int r2 = r2.f()
            if (r2 != 0) goto L_0x0083
            r1.f11164e = r3
            r0.f11171a = r3
        L_0x0083:
            boolean r2 = r17.g()
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.f11161b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f11161b = r2
            t.b$a r2 = r1.f11163d
            r2.k()
        L_0x009b:
            t.b$a r2 = r1.f11163d
            int r2 = r2.f()
            r11 = r6
            r13 = r11
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
        L_0x00a8:
            if (r8 >= r2) goto L_0x0107
            t.b$a r15 = r1.f11163d
            float r15 = r15.a(r8)
            t.b$a r4 = r1.f11163d
            t.g r4 = r4.h(r8)
            t.g$a r5 = r4.f11198x
            t.g$a r7 = t.g.a.UNRESTRICTED
            if (r5 != r7) goto L_0x00dd
            if (r9 != 0) goto L_0x00c3
            int r5 = r4.A
            if (r5 > r3) goto L_0x00cc
            goto L_0x00d9
        L_0x00c3:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ce
            int r5 = r4.A
            if (r5 > r3) goto L_0x00cc
            goto L_0x00d9
        L_0x00cc:
            r12 = 0
            goto L_0x00da
        L_0x00ce:
            if (r12 != 0) goto L_0x0103
            int r5 = r4.A
            if (r5 > r3) goto L_0x00d6
            r5 = r3
            goto L_0x00d7
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            if (r5 == 0) goto L_0x0103
        L_0x00d9:
            r12 = r3
        L_0x00da:
            r9 = r4
            r11 = r15
            goto L_0x0103
        L_0x00dd:
            if (r9 != 0) goto L_0x0103
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0103
            if (r10 != 0) goto L_0x00ea
            int r5 = r4.A
            if (r5 > r3) goto L_0x00f3
            goto L_0x0100
        L_0x00ea:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f5
            int r5 = r4.A
            if (r5 > r3) goto L_0x00f3
            goto L_0x0100
        L_0x00f3:
            r14 = 0
            goto L_0x0101
        L_0x00f5:
            if (r14 != 0) goto L_0x0103
            int r5 = r4.A
            if (r5 > r3) goto L_0x00fd
            r5 = r3
            goto L_0x00fe
        L_0x00fd:
            r5 = 0
        L_0x00fe:
            if (r5 == 0) goto L_0x0103
        L_0x0100:
            r14 = r3
        L_0x0101:
            r10 = r4
            r13 = r15
        L_0x0103:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a8
        L_0x0107:
            if (r9 == 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r9 = r10
        L_0x010b:
            if (r9 != 0) goto L_0x010f
            r2 = r3
            goto L_0x0113
        L_0x010f:
            r1.i(r9)
            r2 = 0
        L_0x0113:
            t.b$a r4 = r1.f11163d
            int r4 = r4.f()
            if (r4 != 0) goto L_0x011d
            r1.f11164e = r3
        L_0x011d:
            if (r2 == 0) goto L_0x01ab
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.f11175e
            if (r2 < r4) goto L_0x0129
            r16.p()
        L_0x0129:
            t.g$a r2 = t.g.a.SLACK
            r4 = 0
            t.g r2 = r0.a(r2, r4)
            int r4 = r0.f11172b
            int r4 = r4 + r3
            r0.f11172b = r4
            int r5 = r0.i
            int r5 = r5 + r3
            r0.i = r5
            r2.f11191b = r4
            t.c r5 = r0.f11180l
            java.lang.Object r5 = r5.f11168d
            t.g[] r5 = (t.g[]) r5
            r5[r4] = r2
            r1.f11160a = r2
            int r4 = r0.f11178j
            r16.i(r17)
            int r5 = r0.f11178j
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x01ab
            t.b r4 = r0.f11183o
            java.util.Objects.requireNonNull(r4)
            r5 = 0
            r4.f11160a = r5
            t.b$a r5 = r4.f11163d
            r5.clear()
            r5 = 0
        L_0x015e:
            t.b$a r7 = r1.f11163d
            int r7 = r7.f()
            if (r5 >= r7) goto L_0x017a
            t.b$a r7 = r1.f11163d
            t.g r7 = r7.h(r5)
            t.b$a r8 = r1.f11163d
            float r8 = r8.a(r5)
            t.b$a r9 = r4.f11163d
            r9.j(r7, r8, r3)
            int r5 = r5 + 1
            goto L_0x015e
        L_0x017a:
            t.b r4 = r0.f11183o
            r0.s(r4)
            int r4 = r2.f11192c
            r5 = -1
            if (r4 != r5) goto L_0x01a9
            t.g r4 = r1.f11160a
            if (r4 != r2) goto L_0x0192
            r4 = 0
            t.g r2 = r1.h(r4, r2)
            if (r2 == 0) goto L_0x0192
            r1.i(r2)
        L_0x0192:
            boolean r2 = r1.f11164e
            if (r2 != 0) goto L_0x019b
            t.g r2 = r1.f11160a
            r2.k(r0, r1)
        L_0x019b:
            t.c r2 = r0.f11180l
            java.lang.Object r2 = r2.f11166b
            t.e r2 = (t.e) r2
            r2.b(r1)
            int r2 = r0.f11178j
            int r2 = r2 - r3
            r0.f11178j = r2
        L_0x01a9:
            r2 = r3
            goto L_0x01ac
        L_0x01ab:
            r2 = 0
        L_0x01ac:
            t.g r4 = r1.f11160a
            if (r4 == 0) goto L_0x01bd
            t.g$a r4 = r4.f11198x
            t.g$a r5 = t.g.a.UNRESTRICTED
            if (r4 == r5) goto L_0x01be
            float r4 = r1.f11161b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01bd
            goto L_0x01be
        L_0x01bd:
            r3 = 0
        L_0x01be:
            if (r3 != 0) goto L_0x01c1
            return
        L_0x01c1:
            r4 = r2
            goto L_0x01c4
        L_0x01c3:
            r4 = 0
        L_0x01c4:
            if (r4 != 0) goto L_0x01c9
            r16.i(r17)
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d.c(t.b):void");
    }

    public final b d(g gVar, g gVar2, int i10, int i11) {
        if (i11 == 8 && gVar2.f11195u && gVar.f11192c == -1) {
            gVar.i(this, gVar2.f11194t + ((float) i10));
            return null;
        }
        b m10 = m();
        boolean z = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z = true;
            }
            m10.f11161b = (float) i10;
        }
        if (!z) {
            m10.f11163d.d(gVar, -1.0f);
            m10.f11163d.d(gVar2, 1.0f);
        } else {
            m10.f11163d.d(gVar, 1.0f);
            m10.f11163d.d(gVar2, -1.0f);
        }
        if (i11 != 8) {
            m10.b(this, i11);
        }
        c(m10);
        return m10;
    }

    public final void e(g gVar, int i10) {
        int i11 = gVar.f11192c;
        if (i11 == -1) {
            gVar.i(this, (float) i10);
            for (int i12 = 0; i12 < this.f11172b + 1; i12++) {
                g gVar2 = ((g[]) this.f11180l.f11168d)[i12];
            }
        } else if (i11 != -1) {
            b bVar = this.f11176f[i11];
            if (bVar.f11164e) {
                bVar.f11161b = (float) i10;
            } else if (bVar.f11163d.f() == 0) {
                bVar.f11164e = true;
                bVar.f11161b = (float) i10;
            } else {
                b m10 = m();
                if (i10 < 0) {
                    m10.f11161b = (float) (i10 * -1);
                    m10.f11163d.d(gVar, 1.0f);
                } else {
                    m10.f11161b = (float) i10;
                    m10.f11163d.d(gVar, -1.0f);
                }
                c(m10);
            }
        } else {
            b m11 = m();
            m11.f11160a = gVar;
            float f10 = (float) i10;
            gVar.f11194t = f10;
            m11.f11161b = f10;
            m11.f11164e = true;
            c(m11);
        }
    }

    public final void f(g gVar, g gVar2, int i10, int i11) {
        b m10 = m();
        g n10 = n();
        n10.f11193s = 0;
        m10.d(gVar, gVar2, n10, i10);
        if (i11 != 8) {
            m10.f11163d.d(k(i11, (String) null), (float) ((int) (m10.f11163d.e(n10) * -1.0f)));
        }
        c(m10);
    }

    public final void g(g gVar, g gVar2, int i10, int i11) {
        b m10 = m();
        g n10 = n();
        n10.f11193s = 0;
        m10.e(gVar, gVar2, n10, i10);
        if (i11 != 8) {
            m10.f11163d.d(k(i11, (String) null), (float) ((int) (m10.f11163d.e(n10) * -1.0f)));
        }
        c(m10);
    }

    public final void h(g gVar, g gVar2, g gVar3, g gVar4, float f10) {
        b m10 = m();
        m10.c(gVar, gVar2, gVar3, gVar4, f10);
        c(m10);
    }

    public final void i(b bVar) {
        int i10;
        if (bVar.f11164e) {
            bVar.f11160a.i(this, bVar.f11161b);
        } else {
            b[] bVarArr = this.f11176f;
            int i11 = this.f11178j;
            bVarArr[i11] = bVar;
            g gVar = bVar.f11160a;
            gVar.f11192c = i11;
            this.f11178j = i11 + 1;
            gVar.k(this, bVar);
        }
        if (this.f11171a) {
            int i12 = 0;
            while (i12 < this.f11178j) {
                if (this.f11176f[i12] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f11176f;
                if (bVarArr2[i12] != null && bVarArr2[i12].f11164e) {
                    b bVar2 = bVarArr2[i12];
                    bVar2.f11160a.i(this, bVar2.f11161b);
                    ((e) this.f11180l.f11166b).b(bVar2);
                    this.f11176f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f11178j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr3 = this.f11176f;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f11160a.f11192c == i13) {
                            bVarArr3[i15].f11160a.f11192c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f11176f[i14] = null;
                    }
                    this.f11178j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f11171a = false;
        }
    }

    public final void j() {
        for (int i10 = 0; i10 < this.f11178j; i10++) {
            b bVar = this.f11176f[i10];
            bVar.f11160a.f11194t = bVar.f11161b;
        }
    }

    public final g k(int i10, String str) {
        if (this.i + 1 >= this.f11175e) {
            p();
        }
        g a10 = a(g.a.ERROR, str);
        int i11 = this.f11172b + 1;
        this.f11172b = i11;
        this.i++;
        a10.f11191b = i11;
        a10.f11193s = i10;
        ((g[]) this.f11180l.f11168d)[i11] = a10;
        f fVar = this.f11173c;
        fVar.i.f11188a = a10;
        Arrays.fill(a10.f11197w, 0.0f);
        a10.f11197w[a10.f11193s] = 1.0f;
        fVar.l(a10);
        return a10;
    }

    public final g l(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f11175e) {
            p();
        }
        if (obj instanceof v.d) {
            v.d dVar = (v.d) obj;
            gVar = dVar.i;
            if (gVar == null) {
                dVar.i();
                gVar = dVar.i;
            }
            int i10 = gVar.f11191b;
            if (i10 == -1 || i10 > this.f11172b || ((g[]) this.f11180l.f11168d)[i10] == null) {
                if (i10 != -1) {
                    gVar.h();
                }
                int i11 = this.f11172b + 1;
                this.f11172b = i11;
                this.i++;
                gVar.f11191b = i11;
                gVar.f11198x = g.a.UNRESTRICTED;
                ((g[]) this.f11180l.f11168d)[i11] = gVar;
            }
        }
        return gVar;
    }

    public final b m() {
        b bVar = (b) ((e) this.f11180l.f11166b).a();
        if (bVar == null) {
            return new b(this.f11180l);
        }
        bVar.f11160a = null;
        bVar.f11163d.clear();
        bVar.f11161b = 0.0f;
        bVar.f11164e = false;
        return bVar;
    }

    public final g n() {
        if (this.i + 1 >= this.f11175e) {
            p();
        }
        g a10 = a(g.a.SLACK, (String) null);
        int i10 = this.f11172b + 1;
        this.f11172b = i10;
        this.i++;
        a10.f11191b = i10;
        ((g[]) this.f11180l.f11168d)[i10] = a10;
        return a10;
    }

    public final int o(Object obj) {
        g gVar = ((v.d) obj).i;
        if (gVar != null) {
            return (int) (gVar.f11194t + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i10 = this.f11174d * 2;
        this.f11174d = i10;
        this.f11176f = (b[]) Arrays.copyOf(this.f11176f, i10);
        c cVar = this.f11180l;
        cVar.f11168d = (g[]) Arrays.copyOf((g[]) cVar.f11168d, this.f11174d);
        int i11 = this.f11174d;
        this.f11177h = new boolean[i11];
        this.f11175e = i11;
        this.f11179k = i11;
    }

    public final void q() throws Exception {
        f fVar = this.f11173c;
        boolean z = true;
        if (fVar.f11187h == 0) {
            j();
        } else if (this.g) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f11178j) {
                    break;
                } else if (!this.f11176f[i10].f11164e) {
                    z = false;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z) {
                r(this.f11173c);
            } else {
                j();
            }
        } else {
            r(fVar);
        }
    }

    public final void r(a aVar) throws Exception {
        float f10;
        int i10;
        boolean z;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 >= this.f11178j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f11176f;
            if (bVarArr[i11].f11160a.f11198x != g.a.UNRESTRICTED && bVarArr[i11].f11161b < 0.0f) {
                z = true;
                break;
            }
            i11++;
        }
        if (z) {
            boolean z10 = false;
            int i12 = 0;
            while (!z10) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (i15 < this.f11178j) {
                    b bVar = this.f11176f[i15];
                    if (bVar.f11160a.f11198x != g.a.UNRESTRICTED && !bVar.f11164e && bVar.f11161b < f10) {
                        int f12 = bVar.f11163d.f();
                        int i17 = 0;
                        while (i17 < f12) {
                            g h10 = bVar.f11163d.h(i17);
                            float e10 = bVar.f11163d.e(h10);
                            if (e10 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f13 = h10.f11196v[i18] / e10;
                                    if ((f13 < f11 && i18 == i16) || i18 > i16) {
                                        i14 = h10.f11191b;
                                        i16 = i18;
                                        f11 = f13;
                                        i13 = i15;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i15++;
                    f10 = 0.0f;
                }
                if (i13 != -1) {
                    b bVar2 = this.f11176f[i13];
                    bVar2.f11160a.f11192c = -1;
                    bVar2.i(((g[]) this.f11180l.f11168d)[i14]);
                    g gVar = bVar2.f11160a;
                    gVar.f11192c = i13;
                    gVar.k(this, bVar2);
                } else {
                    z10 = true;
                }
                if (i12 > this.i / 2) {
                    z10 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        for (int i10 = 0; i10 < this.i; i10++) {
            this.f11177h[i10] = false;
        }
        boolean z = false;
        int i11 = 0;
        while (!z) {
            i11++;
            if (i11 >= this.i * 2) {
                return i11;
            }
            g gVar = ((b) aVar).f11160a;
            if (gVar != null) {
                this.f11177h[gVar.f11191b] = true;
            }
            g a10 = aVar.a(this.f11177h);
            if (a10 != null) {
                boolean[] zArr = this.f11177h;
                int i12 = a10.f11191b;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (a10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f11178j; i14++) {
                    b bVar = this.f11176f[i14];
                    if (bVar.f11160a.f11198x != g.a.UNRESTRICTED && !bVar.f11164e && bVar.f11163d.g(a10)) {
                        float e10 = bVar.f11163d.e(a10);
                        if (e10 < 0.0f) {
                            float f11 = (-bVar.f11161b) / e10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar2 = this.f11176f[i13];
                    bVar2.f11160a.f11192c = -1;
                    bVar2.i(a10);
                    g gVar2 = bVar2.f11160a;
                    gVar2.f11192c = i13;
                    gVar2.k(this, bVar2);
                }
            } else {
                z = true;
            }
        }
        return i11;
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f11178j; i10++) {
            b bVar = this.f11176f[i10];
            if (bVar != null) {
                ((e) this.f11180l.f11166b).b(bVar);
            }
            this.f11176f[i10] = null;
        }
    }

    public final void u() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f11180l;
            g[] gVarArr = (g[]) cVar.f11168d;
            if (i10 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i10];
            if (gVar != null) {
                gVar.h();
            }
            i10++;
        }
        e eVar = (e) cVar.f11167c;
        g[] gVarArr2 = this.f11181m;
        int i11 = this.f11182n;
        Objects.requireNonNull(eVar);
        if (i11 > gVarArr2.length) {
            i11 = gVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            g gVar2 = gVarArr2[i12];
            int i13 = eVar.f11184a;
            Object[] objArr = (Object[]) eVar.f11185b;
            if (i13 < objArr.length) {
                objArr[i13] = gVar2;
                eVar.f11184a = i13 + 1;
            }
        }
        this.f11182n = 0;
        Arrays.fill((g[]) this.f11180l.f11168d, (Object) null);
        this.f11172b = 0;
        f fVar = this.f11173c;
        fVar.f11187h = 0;
        fVar.f11161b = 0.0f;
        this.i = 1;
        for (int i14 = 0; i14 < this.f11178j; i14++) {
            b[] bVarArr = this.f11176f;
            if (bVarArr[i14] != null) {
                Objects.requireNonNull(bVarArr[i14]);
            }
        }
        t();
        this.f11178j = 0;
        this.f11183o = new b(this.f11180l);
    }
}
