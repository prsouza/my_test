package t;

import java.util.ArrayList;
import t.d;
import t.g;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public g f11160a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f11161b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<g> f11162c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f11163d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11164e = false;

    public interface a {
        float a(int i);

        float b(b bVar, boolean z);

        float c(g gVar, boolean z);

        void clear();

        void d(g gVar, float f10);

        float e(g gVar);

        int f();

        boolean g(g gVar);

        g h(int i);

        void i(float f10);

        void j(g gVar, float f10, boolean z);

        void k();
    }

    public b() {
    }

    public g a(boolean[] zArr) {
        return h(zArr, (g) null);
    }

    public final b b(d dVar, int i) {
        this.f11163d.d(dVar.k(i, "ep"), 1.0f);
        this.f11163d.d(dVar.k(i, "em"), -1.0f);
        return this;
    }

    public final b c(g gVar, g gVar2, g gVar3, g gVar4, float f10) {
        this.f11163d.d(gVar, -1.0f);
        this.f11163d.d(gVar2, 1.0f);
        this.f11163d.d(gVar3, f10);
        this.f11163d.d(gVar4, -f10);
        return this;
    }

    public final b d(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f11161b = (float) i;
        }
        if (!z) {
            this.f11163d.d(gVar, -1.0f);
            this.f11163d.d(gVar2, 1.0f);
            this.f11163d.d(gVar3, 1.0f);
        } else {
            this.f11163d.d(gVar, 1.0f);
            this.f11163d.d(gVar2, -1.0f);
            this.f11163d.d(gVar3, -1.0f);
        }
        return this;
    }

    public final b e(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f11161b = (float) i;
        }
        if (!z) {
            this.f11163d.d(gVar, -1.0f);
            this.f11163d.d(gVar2, 1.0f);
            this.f11163d.d(gVar3, -1.0f);
        } else {
            this.f11163d.d(gVar, 1.0f);
            this.f11163d.d(gVar2, -1.0f);
            this.f11163d.d(gVar3, 1.0f);
        }
        return this;
    }

    public final b f(g gVar, g gVar2, g gVar3, g gVar4, float f10) {
        this.f11163d.d(gVar3, 0.5f);
        this.f11163d.d(gVar4, 0.5f);
        this.f11163d.d(gVar, -0.5f);
        this.f11163d.d(gVar2, -0.5f);
        this.f11161b = -f10;
        return this;
    }

    public boolean g() {
        return this.f11160a == null && this.f11161b == 0.0f && this.f11163d.f() == 0;
    }

    public final g h(boolean[] zArr, g gVar) {
        g.a aVar;
        int f10 = this.f11163d.f();
        g gVar2 = null;
        float f11 = 0.0f;
        for (int i = 0; i < f10; i++) {
            float a10 = this.f11163d.a(i);
            if (a10 < 0.0f) {
                g h10 = this.f11163d.h(i);
                if ((zArr == null || !zArr[h10.f11191b]) && h10 != gVar && (((aVar = h10.f11198x) == g.a.SLACK || aVar == g.a.ERROR) && a10 < f11)) {
                    f11 = a10;
                    gVar2 = h10;
                }
            }
        }
        return gVar2;
    }

    public final void i(g gVar) {
        g gVar2 = this.f11160a;
        if (gVar2 != null) {
            this.f11163d.d(gVar2, -1.0f);
            this.f11160a.f11192c = -1;
            this.f11160a = null;
        }
        float c10 = this.f11163d.c(gVar, true) * -1.0f;
        this.f11160a = gVar;
        if (c10 != 1.0f) {
            this.f11161b /= c10;
            this.f11163d.i(c10);
        }
    }

    public final void j(d dVar, g gVar, boolean z) {
        if (gVar != null && gVar.f11195u) {
            float e10 = this.f11163d.e(gVar);
            this.f11161b = (gVar.f11194t * e10) + this.f11161b;
            this.f11163d.c(gVar, z);
            if (z) {
                gVar.e(this);
            }
            if (this.f11163d.f() == 0) {
                this.f11164e = true;
                dVar.f11171a = true;
            }
        }
    }

    public void k(d dVar, b bVar, boolean z) {
        float b10 = this.f11163d.b(bVar, z);
        this.f11161b = (bVar.f11161b * b10) + this.f11161b;
        if (z) {
            bVar.f11160a.e(this);
        }
        if (this.f11160a != null && this.f11163d.f() == 0) {
            this.f11164e = true;
            dVar.f11171a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            t.g r0 = r10.f11160a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = a.a.d(r0)
            t.g r1 = r10.f11160a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = a8.a.c(r0, r1)
            float r1 = r10.f11161b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = a.a.d(r0)
            float r1 = r10.f11161b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            t.b$a r5 = r10.f11163d
            int r5 = r5.f()
        L_0x003b:
            if (r3 >= r5) goto L_0x009a
            t.b$a r6 = r10.f11163d
            t.g r6 = r6.h(r3)
            if (r6 != 0) goto L_0x0046
            goto L_0x0097
        L_0x0046:
            t.b$a r7 = r10.f11163d
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0064
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0074
            java.lang.String r1 = "- "
            java.lang.String r0 = a8.a.c(r0, r1)
            goto L_0x0073
        L_0x0064:
            if (r8 <= 0) goto L_0x006d
            java.lang.String r1 = " + "
            java.lang.String r0 = a8.a.c(r0, r1)
            goto L_0x0074
        L_0x006d:
            java.lang.String r1 = " - "
            java.lang.String r0 = a8.a.c(r0, r1)
        L_0x0073:
            float r7 = r7 * r9
        L_0x0074:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = a8.a.c(r0, r6)
            goto L_0x0096
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0096:
            r1 = r4
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x009a:
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = "0.0"
            java.lang.String r0 = a8.a.c(r0, r1)
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.toString():java.lang.String");
    }

    public b(c cVar) {
        this.f11163d = new a(this, cVar);
    }
}
