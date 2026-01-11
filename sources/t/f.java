package t;

import b9.m;
import com.github.mikephil.charting.BuildConfig;
import java.util.Arrays;
import java.util.Comparator;
import t.b;

public final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public g[] f11186f = new g[128];
    public g[] g = new g[128];

    /* renamed from: h  reason: collision with root package name */
    public int f11187h = 0;
    public b i = new b();

    public class a implements Comparator<g> {
        public final int compare(Object obj, Object obj2) {
            return ((g) obj).f11191b - ((g) obj2).f11191b;
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public g f11188a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f11188a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder d10 = a.a.d(str);
                    d10.append(this.f11188a.f11197w[i]);
                    d10.append(" ");
                    str = d10.toString();
                }
            }
            StringBuilder c10 = m.c(str, "] ");
            c10.append(this.f11188a);
            return c10.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r9 < r8) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t.g a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0004:
            int r4 = r11.f11187h
            if (r2 >= r4) goto L_0x0057
            t.g[] r4 = r11.f11186f
            r5 = r4[r2]
            int r6 = r5.f11191b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            t.f$b r6 = r11.i
            r6.f11188a = r5
            r5 = 8
            r7 = 1
            if (r3 != r0) goto L_0x0036
        L_0x001c:
            if (r5 < 0) goto L_0x0032
            t.g r4 = r6.f11188a
            float[] r4 = r4.f11197w
            r4 = r4[r5]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0032:
            r7 = r1
        L_0x0033:
            if (r7 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r4 = r4[r3]
        L_0x0038:
            if (r5 < 0) goto L_0x0050
            float[] r8 = r4.f11197w
            r8 = r8[r5]
            t.g r9 = r6.f11188a
            float[] r9 = r9.f11197w
            r9 = r9[r5]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004b
            int r5 = r5 + -1
            goto L_0x0038
        L_0x004b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r7 = r1
        L_0x0051:
            if (r7 == 0) goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            if (r3 != r0) goto L_0x005b
            r12 = 0
            return r12
        L_0x005b:
            t.g[] r12 = r11.f11186f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t.f.a(boolean[]):t.g");
    }

    public final boolean g() {
        return this.f11187h == 0;
    }

    public final void k(d dVar, b bVar, boolean z) {
        b bVar2 = bVar;
        g gVar = bVar2.f11160a;
        if (gVar != null) {
            b.a aVar = bVar2.f11163d;
            int f10 = aVar.f();
            for (int i10 = 0; i10 < f10; i10++) {
                g h10 = aVar.h(i10);
                float a10 = aVar.a(i10);
                b bVar3 = this.i;
                bVar3.f11188a = h10;
                boolean z10 = true;
                if (h10.f11190a) {
                    for (int i11 = 0; i11 < 9; i11++) {
                        float[] fArr = bVar3.f11188a.f11197w;
                        fArr[i11] = (gVar.f11197w[i11] * a10) + fArr[i11];
                        if (Math.abs(fArr[i11]) < 1.0E-4f) {
                            bVar3.f11188a.f11197w[i11] = 0.0f;
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        f.this.m(bVar3.f11188a);
                    }
                    z10 = false;
                } else {
                    for (int i12 = 0; i12 < 9; i12++) {
                        float f11 = gVar.f11197w[i12];
                        if (f11 != 0.0f) {
                            float f12 = f11 * a10;
                            if (Math.abs(f12) < 1.0E-4f) {
                                f12 = 0.0f;
                            }
                            bVar3.f11188a.f11197w[i12] = f12;
                        } else {
                            bVar3.f11188a.f11197w[i12] = 0.0f;
                        }
                    }
                }
                if (z10) {
                    l(h10);
                }
                this.f11161b = (bVar2.f11161b * a10) + this.f11161b;
            }
            m(gVar);
        }
    }

    public final void l(g gVar) {
        int i10;
        int i11 = this.f11187h + 1;
        g[] gVarArr = this.f11186f;
        if (i11 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f11186f = gVarArr2;
            this.g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f11186f;
        int i12 = this.f11187h;
        gVarArr3[i12] = gVar;
        int i13 = i12 + 1;
        this.f11187h = i13;
        if (i13 > 1 && gVarArr3[i13 - 1].f11191b > gVar.f11191b) {
            int i14 = 0;
            while (true) {
                i10 = this.f11187h;
                if (i14 >= i10) {
                    break;
                }
                this.g[i14] = this.f11186f[i14];
                i14++;
            }
            Arrays.sort(this.g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f11187h; i15++) {
                this.f11186f[i15] = this.g[i15];
            }
        }
        gVar.f11190a = true;
        gVar.d(this);
    }

    public final void m(g gVar) {
        int i10 = 0;
        while (i10 < this.f11187h) {
            if (this.f11186f[i10] == gVar) {
                while (true) {
                    int i11 = this.f11187h;
                    if (i10 < i11 - 1) {
                        g[] gVarArr = this.f11186f;
                        int i12 = i10 + 1;
                        gVarArr[i10] = gVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f11187h = i11 - 1;
                        gVar.f11190a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public final String toString() {
        StringBuilder c10 = m.c(BuildConfig.FLAVOR, " goal -> (");
        c10.append(this.f11161b);
        c10.append(") : ");
        String sb2 = c10.toString();
        for (int i10 = 0; i10 < this.f11187h; i10++) {
            this.i.f11188a = this.f11186f[i10];
            StringBuilder d10 = a.a.d(sb2);
            d10.append(this.i);
            d10.append(" ");
            sb2 = d10.toString();
        }
        return sb2;
    }
}
