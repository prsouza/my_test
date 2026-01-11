package w;

import java.util.ArrayList;
import java.util.Iterator;
import v.d;
import v.e;
import v.f;

public final class c extends p {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<p> f12495k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public int f12496l;

    public c(e eVar, int i) {
        super(eVar);
        e eVar2;
        Object obj;
        int i10;
        Object obj2;
        this.f12534f = i;
        e eVar3 = this.f12530b;
        e m10 = eVar3.m(i);
        while (true) {
            e eVar4 = m10;
            eVar2 = eVar3;
            eVar3 = eVar4;
            if (eVar3 == null) {
                break;
            }
            m10 = eVar3.m(this.f12534f);
        }
        this.f12530b = eVar2;
        ArrayList<p> arrayList = this.f12495k;
        int i11 = this.f12534f;
        if (i11 == 0) {
            obj = eVar2.f12055d;
        } else {
            obj = i11 == 1 ? eVar2.f12057e : null;
        }
        arrayList.add(obj);
        e l10 = eVar2.l(this.f12534f);
        while (l10 != null) {
            ArrayList<p> arrayList2 = this.f12495k;
            int i12 = this.f12534f;
            if (i12 == 0) {
                obj2 = l10.f12055d;
            } else {
                obj2 = i12 == 1 ? l10.f12057e : null;
            }
            arrayList2.add(obj2);
            l10 = l10.l(this.f12534f);
        }
        Iterator<p> it = this.f12495k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i13 = this.f12534f;
            if (i13 == 0) {
                next.f12530b.f12052b = this;
            } else if (i13 == 1) {
                next.f12530b.f12053c = this;
            }
        }
        if ((this.f12534f == 0 && ((f) this.f12530b.V).f12095w0) && this.f12495k.size() > 1) {
            ArrayList<p> arrayList3 = this.f12495k;
            this.f12530b = arrayList3.get(arrayList3.size() - 1).f12530b;
        }
        if (this.f12534f == 0) {
            i10 = this.f12530b.f12068k0;
        } else {
            i10 = this.f12530b.f12070l0;
        }
        this.f12496l = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(w.d r26) {
        /*
            r25 = this;
            r0 = r25
            w.f r1 = r0.f12535h
            boolean r2 = r1.f12511j
            if (r2 == 0) goto L_0x03ee
            w.f r2 = r0.i
            boolean r3 = r2.f12511j
            if (r3 != 0) goto L_0x0010
            goto L_0x03ee
        L_0x0010:
            v.e r3 = r0.f12530b
            v.e r3 = r3.V
            boolean r4 = r3 instanceof v.f
            if (r4 == 0) goto L_0x001d
            v.f r3 = (v.f) r3
            boolean r3 = r3.f12095w0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r2 = r2.g
            int r1 = r1.g
            int r2 = r2 - r1
            java.util.ArrayList<w.p> r1 = r0.f12495k
            int r1 = r1.size()
            r4 = 0
        L_0x002a:
            r7 = 8
            if (r4 >= r1) goto L_0x003f
            java.util.ArrayList<w.p> r8 = r0.f12495k
            java.lang.Object r8 = r8.get(r4)
            w.p r8 = (w.p) r8
            v.e r8 = r8.f12530b
            int r8 = r8.f12064i0
            if (r8 != r7) goto L_0x0040
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003f:
            r4 = -1
        L_0x0040:
            int r8 = r1 + -1
            r9 = r8
        L_0x0043:
            if (r9 < 0) goto L_0x0056
            java.util.ArrayList<w.p> r10 = r0.f12495k
            java.lang.Object r10 = r10.get(r9)
            w.p r10 = (w.p) r10
            v.e r10 = r10.f12530b
            int r10 = r10.f12064i0
            if (r10 != r7) goto L_0x0057
            int r9 = r9 + -1
            goto L_0x0043
        L_0x0056:
            r9 = -1
        L_0x0057:
            r10 = 0
        L_0x0058:
            r12 = 2
            if (r10 >= r12) goto L_0x00f7
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0063:
            if (r14 >= r1) goto L_0x00e7
            java.util.ArrayList<w.p> r6 = r0.f12495k
            java.lang.Object r6 = r6.get(r14)
            w.p r6 = (w.p) r6
            v.e r5 = r6.f12530b
            int r12 = r5.f12064i0
            if (r12 != r7) goto L_0x0075
            goto L_0x00e0
        L_0x0075:
            int r17 = r17 + 1
            if (r14 <= 0) goto L_0x0080
            if (r14 < r4) goto L_0x0080
            w.f r12 = r6.f12535h
            int r12 = r12.f12509f
            int r15 = r15 + r12
        L_0x0080:
            w.g r12 = r6.f12533e
            int r7 = r12.g
            v.e$b r11 = r6.f12532d
            v.e$b r13 = v.e.b.MATCH_CONSTRAINT
            if (r11 == r13) goto L_0x008c
            r11 = 1
            goto L_0x008d
        L_0x008c:
            r11 = 0
        L_0x008d:
            if (r11 == 0) goto L_0x00ab
            int r12 = r0.f12534f
            if (r12 != 0) goto L_0x009c
            w.l r13 = r5.f12055d
            w.g r13 = r13.f12533e
            boolean r13 = r13.f12511j
            if (r13 != 0) goto L_0x009c
            return
        L_0x009c:
            r13 = 1
            if (r12 != r13) goto L_0x00a8
            w.n r12 = r5.f12057e
            w.g r12 = r12.f12533e
            boolean r12 = r12.f12511j
            if (r12 != 0) goto L_0x00a8
            return
        L_0x00a8:
            r20 = r7
            goto L_0x00c1
        L_0x00ab:
            r20 = r7
            r13 = 1
            int r7 = r6.f12529a
            if (r7 != r13) goto L_0x00b9
            if (r10 != 0) goto L_0x00b9
            int r7 = r12.f12514m
            int r16 = r16 + 1
            goto L_0x00bf
        L_0x00b9:
            boolean r7 = r12.f12511j
            if (r7 == 0) goto L_0x00c1
            r7 = r20
        L_0x00bf:
            r11 = 1
            goto L_0x00c3
        L_0x00c1:
            r7 = r20
        L_0x00c3:
            if (r11 != 0) goto L_0x00d5
            int r16 = r16 + 1
            float[] r5 = r5.f12072m0
            int r7 = r0.f12534f
            r5 = r5[r7]
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x00d6
            float r18 = r18 + r5
            goto L_0x00d6
        L_0x00d5:
            int r15 = r15 + r7
        L_0x00d6:
            if (r14 >= r8) goto L_0x00e0
            if (r14 >= r9) goto L_0x00e0
            w.f r5 = r6.i
            int r5 = r5.f12509f
            int r5 = -r5
            int r15 = r15 + r5
        L_0x00e0:
            int r14 = r14 + 1
            r7 = 8
            r12 = 2
            goto L_0x0063
        L_0x00e7:
            if (r15 < r2) goto L_0x00f2
            if (r16 != 0) goto L_0x00ec
            goto L_0x00f2
        L_0x00ec:
            int r10 = r10 + 1
            r7 = 8
            goto L_0x0058
        L_0x00f2:
            r5 = r16
            r6 = r17
            goto L_0x00fc
        L_0x00f7:
            r5 = 0
            r6 = 0
            r15 = 0
            r18 = 0
        L_0x00fc:
            w.f r7 = r0.f12535h
            int r7 = r7.g
            if (r3 == 0) goto L_0x0106
            w.f r7 = r0.i
            int r7 = r7.g
        L_0x0106:
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r2) goto L_0x0117
            r11 = 1073741824(0x40000000, float:2.0)
            int r12 = r15 - r2
            float r12 = (float) r12
            float r12 = r12 / r11
            float r12 = r12 + r10
            int r11 = (int) r12
            if (r3 == 0) goto L_0x0116
            int r7 = r7 + r11
            goto L_0x0117
        L_0x0116:
            int r7 = r7 - r11
        L_0x0117:
            if (r5 <= 0) goto L_0x01f8
            int r11 = r2 - r15
            float r11 = (float) r11
            float r12 = (float) r5
            float r12 = r11 / r12
            float r12 = r12 + r10
            int r12 = (int) r12
            r13 = 0
            r14 = 0
        L_0x0123:
            if (r13 >= r1) goto L_0x01ac
            java.util.ArrayList<w.p> r10 = r0.f12495k
            java.lang.Object r10 = r10.get(r13)
            w.p r10 = (w.p) r10
            r17 = r12
            v.e r12 = r10.f12530b
            r20 = r15
            int r15 = r12.f12064i0
            r21 = r7
            r7 = 8
            if (r15 != r7) goto L_0x013c
            goto L_0x0194
        L_0x013c:
            v.e$b r7 = r10.f12532d
            v.e$b r15 = v.e.b.MATCH_CONSTRAINT
            if (r7 != r15) goto L_0x0194
            w.g r7 = r10.f12533e
            boolean r15 = r7.f12511j
            if (r15 != 0) goto L_0x0194
            r15 = 0
            int r19 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r19 <= 0) goto L_0x015d
            float[] r15 = r12.f12072m0
            r22 = r3
            int r3 = r0.f12534f
            r3 = r15[r3]
            float r3 = r3 * r11
            float r3 = r3 / r18
            r15 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r15
            int r3 = (int) r3
            goto L_0x0161
        L_0x015d:
            r22 = r3
            r3 = r17
        L_0x0161:
            int r15 = r0.f12534f
            if (r15 != 0) goto L_0x016a
            int r15 = r12.f12085v
            int r12 = r12.f12084u
            goto L_0x016e
        L_0x016a:
            int r15 = r12.f12088y
            int r12 = r12.f12087x
        L_0x016e:
            r23 = r11
            int r11 = r10.f12529a
            r24 = r6
            r6 = 1
            if (r11 != r6) goto L_0x017e
            int r6 = r7.f12514m
            int r6 = java.lang.Math.min(r3, r6)
            goto L_0x017f
        L_0x017e:
            r6 = r3
        L_0x017f:
            int r6 = java.lang.Math.max(r12, r6)
            if (r15 <= 0) goto L_0x0189
            int r6 = java.lang.Math.min(r15, r6)
        L_0x0189:
            if (r6 == r3) goto L_0x018e
            int r14 = r14 + 1
            r3 = r6
        L_0x018e:
            w.g r6 = r10.f12533e
            r6.d(r3)
            goto L_0x019a
        L_0x0194:
            r22 = r3
            r24 = r6
            r23 = r11
        L_0x019a:
            int r13 = r13 + 1
            r12 = r17
            r15 = r20
            r7 = r21
            r3 = r22
            r11 = r23
            r6 = r24
            r10 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0123
        L_0x01ac:
            r22 = r3
            r24 = r6
            r21 = r7
            r20 = r15
            if (r14 <= 0) goto L_0x01e9
            int r5 = r5 - r14
            r3 = 0
            r6 = 0
        L_0x01b9:
            if (r3 >= r1) goto L_0x01e7
            java.util.ArrayList<w.p> r7 = r0.f12495k
            java.lang.Object r7 = r7.get(r3)
            w.p r7 = (w.p) r7
            v.e r10 = r7.f12530b
            int r10 = r10.f12064i0
            r11 = 8
            if (r10 != r11) goto L_0x01cc
            goto L_0x01e4
        L_0x01cc:
            if (r3 <= 0) goto L_0x01d5
            if (r3 < r4) goto L_0x01d5
            w.f r10 = r7.f12535h
            int r10 = r10.f12509f
            int r6 = r6 + r10
        L_0x01d5:
            w.g r10 = r7.f12533e
            int r10 = r10.g
            int r6 = r6 + r10
            if (r3 >= r8) goto L_0x01e4
            if (r3 >= r9) goto L_0x01e4
            w.f r7 = r7.i
            int r7 = r7.f12509f
            int r7 = -r7
            int r6 = r6 + r7
        L_0x01e4:
            int r3 = r3 + 1
            goto L_0x01b9
        L_0x01e7:
            r15 = r6
            goto L_0x01eb
        L_0x01e9:
            r15 = r20
        L_0x01eb:
            int r3 = r0.f12496l
            r6 = 2
            if (r3 != r6) goto L_0x01f6
            if (r14 != 0) goto L_0x01f6
            r3 = 0
            r0.f12496l = r3
            goto L_0x0202
        L_0x01f6:
            r3 = 0
            goto L_0x0202
        L_0x01f8:
            r22 = r3
            r24 = r6
            r21 = r7
            r20 = r15
            r3 = 0
            r6 = 2
        L_0x0202:
            if (r15 <= r2) goto L_0x0206
            r0.f12496l = r6
        L_0x0206:
            if (r24 <= 0) goto L_0x020e
            if (r5 != 0) goto L_0x020e
            if (r4 != r9) goto L_0x020e
            r0.f12496l = r6
        L_0x020e:
            int r6 = r0.f12496l
            r7 = 1
            if (r6 != r7) goto L_0x02b0
            r10 = r24
            if (r10 <= r7) goto L_0x021c
            int r2 = r2 - r15
            r6 = -1
            int r6 = r6 + r10
            int r2 = r2 / r6
            goto L_0x0223
        L_0x021c:
            if (r10 != r7) goto L_0x0222
            int r2 = r2 - r15
            r6 = 2
            int r2 = r2 / r6
            goto L_0x0223
        L_0x0222:
            r2 = r3
        L_0x0223:
            if (r5 <= 0) goto L_0x0226
            r2 = r3
        L_0x0226:
            r5 = r3
            r7 = r21
        L_0x0229:
            if (r5 >= r1) goto L_0x03ee
            if (r22 == 0) goto L_0x0232
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x0233
        L_0x0232:
            r3 = r5
        L_0x0233:
            java.util.ArrayList<w.p> r6 = r0.f12495k
            java.lang.Object r3 = r6.get(r3)
            w.p r3 = (w.p) r3
            v.e r6 = r3.f12530b
            int r6 = r6.f12064i0
            r10 = 8
            if (r6 != r10) goto L_0x024e
            w.f r6 = r3.f12535h
            r6.d(r7)
            w.f r3 = r3.i
            r3.d(r7)
            goto L_0x02ac
        L_0x024e:
            if (r5 <= 0) goto L_0x0255
            if (r22 == 0) goto L_0x0254
            int r7 = r7 - r2
            goto L_0x0255
        L_0x0254:
            int r7 = r7 + r2
        L_0x0255:
            if (r5 <= 0) goto L_0x0266
            if (r5 < r4) goto L_0x0266
            if (r22 == 0) goto L_0x0261
            w.f r6 = r3.f12535h
            int r6 = r6.f12509f
            int r7 = r7 - r6
            goto L_0x0266
        L_0x0261:
            w.f r6 = r3.f12535h
            int r6 = r6.f12509f
            int r7 = r7 + r6
        L_0x0266:
            if (r22 == 0) goto L_0x026e
            w.f r6 = r3.i
            r6.d(r7)
            goto L_0x0273
        L_0x026e:
            w.f r6 = r3.f12535h
            r6.d(r7)
        L_0x0273:
            w.g r6 = r3.f12533e
            int r10 = r6.g
            v.e$b r11 = r3.f12532d
            v.e$b r12 = v.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0284
            int r11 = r3.f12529a
            r12 = 1
            if (r11 != r12) goto L_0x0284
            int r10 = r6.f12514m
        L_0x0284:
            if (r22 == 0) goto L_0x0288
            int r7 = r7 - r10
            goto L_0x0289
        L_0x0288:
            int r7 = r7 + r10
        L_0x0289:
            if (r22 == 0) goto L_0x0291
            w.f r6 = r3.f12535h
            r6.d(r7)
            goto L_0x0296
        L_0x0291:
            w.f r6 = r3.i
            r6.d(r7)
        L_0x0296:
            r6 = 1
            r3.g = r6
            if (r5 >= r8) goto L_0x02ac
            if (r5 >= r9) goto L_0x02ac
            if (r22 == 0) goto L_0x02a6
            w.f r3 = r3.i
            int r3 = r3.f12509f
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x02ac
        L_0x02a6:
            w.f r3 = r3.i
            int r3 = r3.f12509f
            int r3 = -r3
            int r7 = r7 + r3
        L_0x02ac:
            int r5 = r5 + 1
            goto L_0x0229
        L_0x02b0:
            r10 = r24
            if (r6 != 0) goto L_0x0345
            int r2 = r2 - r15
            r6 = 1
            int r7 = r10 + 1
            int r2 = r2 / r7
            if (r5 <= 0) goto L_0x02bc
            r2 = r3
        L_0x02bc:
            r5 = r3
            r7 = r21
        L_0x02bf:
            if (r5 >= r1) goto L_0x03ee
            if (r22 == 0) goto L_0x02c8
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x02c9
        L_0x02c8:
            r3 = r5
        L_0x02c9:
            java.util.ArrayList<w.p> r6 = r0.f12495k
            java.lang.Object r3 = r6.get(r3)
            w.p r3 = (w.p) r3
            v.e r6 = r3.f12530b
            int r6 = r6.f12064i0
            r10 = 8
            if (r6 != r10) goto L_0x02e4
            w.f r6 = r3.f12535h
            r6.d(r7)
            w.f r3 = r3.i
            r3.d(r7)
            goto L_0x0341
        L_0x02e4:
            if (r22 == 0) goto L_0x02e8
            int r7 = r7 - r2
            goto L_0x02e9
        L_0x02e8:
            int r7 = r7 + r2
        L_0x02e9:
            if (r5 <= 0) goto L_0x02fa
            if (r5 < r4) goto L_0x02fa
            if (r22 == 0) goto L_0x02f5
            w.f r6 = r3.f12535h
            int r6 = r6.f12509f
            int r7 = r7 - r6
            goto L_0x02fa
        L_0x02f5:
            w.f r6 = r3.f12535h
            int r6 = r6.f12509f
            int r7 = r7 + r6
        L_0x02fa:
            if (r22 == 0) goto L_0x0302
            w.f r6 = r3.i
            r6.d(r7)
            goto L_0x0307
        L_0x0302:
            w.f r6 = r3.f12535h
            r6.d(r7)
        L_0x0307:
            w.g r6 = r3.f12533e
            int r10 = r6.g
            v.e$b r11 = r3.f12532d
            v.e$b r12 = v.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x031c
            int r11 = r3.f12529a
            r12 = 1
            if (r11 != r12) goto L_0x031c
            int r6 = r6.f12514m
            int r10 = java.lang.Math.min(r10, r6)
        L_0x031c:
            if (r22 == 0) goto L_0x0320
            int r7 = r7 - r10
            goto L_0x0321
        L_0x0320:
            int r7 = r7 + r10
        L_0x0321:
            if (r22 == 0) goto L_0x0329
            w.f r6 = r3.f12535h
            r6.d(r7)
            goto L_0x032e
        L_0x0329:
            w.f r6 = r3.i
            r6.d(r7)
        L_0x032e:
            if (r5 >= r8) goto L_0x0341
            if (r5 >= r9) goto L_0x0341
            if (r22 == 0) goto L_0x033b
            w.f r3 = r3.i
            int r3 = r3.f12509f
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x0341
        L_0x033b:
            w.f r3 = r3.i
            int r3 = r3.f12509f
            int r3 = -r3
            int r7 = r7 + r3
        L_0x0341:
            int r5 = r5 + 1
            goto L_0x02bf
        L_0x0345:
            r7 = 2
            if (r6 != r7) goto L_0x03ee
            int r6 = r0.f12534f
            if (r6 != 0) goto L_0x0351
            v.e r6 = r0.f12530b
            float r6 = r6.f12060f0
            goto L_0x0355
        L_0x0351:
            v.e r6 = r0.f12530b
            float r6 = r6.f12061g0
        L_0x0355:
            if (r22 == 0) goto L_0x035b
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r7 - r6
        L_0x035b:
            int r2 = r2 - r15
            float r2 = (float) r2
            float r2 = r2 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r6
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0366
            if (r5 <= 0) goto L_0x0367
        L_0x0366:
            r2 = r3
        L_0x0367:
            if (r22 == 0) goto L_0x036c
            int r7 = r21 - r2
            goto L_0x036e
        L_0x036c:
            int r7 = r21 + r2
        L_0x036e:
            r5 = r3
        L_0x036f:
            if (r5 >= r1) goto L_0x03ee
            if (r22 == 0) goto L_0x0378
            int r2 = r5 + 1
            int r2 = r1 - r2
            goto L_0x0379
        L_0x0378:
            r2 = r5
        L_0x0379:
            java.util.ArrayList<w.p> r3 = r0.f12495k
            java.lang.Object r2 = r3.get(r2)
            w.p r2 = (w.p) r2
            v.e r3 = r2.f12530b
            int r3 = r3.f12064i0
            r6 = 8
            if (r3 != r6) goto L_0x0395
            w.f r3 = r2.f12535h
            r3.d(r7)
            w.f r2 = r2.i
            r2.d(r7)
            r12 = 1
            goto L_0x03eb
        L_0x0395:
            if (r5 <= 0) goto L_0x03a6
            if (r5 < r4) goto L_0x03a6
            if (r22 == 0) goto L_0x03a1
            w.f r3 = r2.f12535h
            int r3 = r3.f12509f
            int r7 = r7 - r3
            goto L_0x03a6
        L_0x03a1:
            w.f r3 = r2.f12535h
            int r3 = r3.f12509f
            int r7 = r7 + r3
        L_0x03a6:
            if (r22 == 0) goto L_0x03ae
            w.f r3 = r2.i
            r3.d(r7)
            goto L_0x03b3
        L_0x03ae:
            w.f r3 = r2.f12535h
            r3.d(r7)
        L_0x03b3:
            w.g r3 = r2.f12533e
            int r10 = r3.g
            v.e$b r11 = r2.f12532d
            v.e$b r12 = v.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03c5
            int r11 = r2.f12529a
            r12 = 1
            if (r11 != r12) goto L_0x03c6
            int r10 = r3.f12514m
            goto L_0x03c6
        L_0x03c5:
            r12 = 1
        L_0x03c6:
            if (r22 == 0) goto L_0x03ca
            int r7 = r7 - r10
            goto L_0x03cb
        L_0x03ca:
            int r7 = r7 + r10
        L_0x03cb:
            if (r22 == 0) goto L_0x03d3
            w.f r3 = r2.f12535h
            r3.d(r7)
            goto L_0x03d8
        L_0x03d3:
            w.f r3 = r2.i
            r3.d(r7)
        L_0x03d8:
            if (r5 >= r8) goto L_0x03eb
            if (r5 >= r9) goto L_0x03eb
            if (r22 == 0) goto L_0x03e5
            w.f r2 = r2.i
            int r2 = r2.f12509f
            int r2 = -r2
            int r7 = r7 - r2
            goto L_0x03eb
        L_0x03e5:
            w.f r2 = r2.i
            int r2 = r2.f12509f
            int r2 = -r2
            int r7 = r7 + r2
        L_0x03eb:
            int r5 = r5 + 1
            goto L_0x036f
        L_0x03ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.a(w.d):void");
    }

    public final void d() {
        Iterator<p> it = this.f12495k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f12495k.size();
        if (size >= 1) {
            e eVar = this.f12495k.get(0).f12530b;
            e eVar2 = this.f12495k.get(size - 1).f12530b;
            if (this.f12534f == 0) {
                d dVar = eVar.J;
                d dVar2 = eVar2.L;
                f i = i(dVar, 0);
                int d10 = dVar.d();
                e m10 = m();
                if (m10 != null) {
                    d10 = m10.J.d();
                }
                if (i != null) {
                    b(this.f12535h, i, d10);
                }
                f i10 = i(dVar2, 0);
                int d11 = dVar2.d();
                e n10 = n();
                if (n10 != null) {
                    d11 = n10.L.d();
                }
                if (i10 != null) {
                    b(this.i, i10, -d11);
                }
            } else {
                d dVar3 = eVar.K;
                d dVar4 = eVar2.M;
                f i11 = i(dVar3, 1);
                int d12 = dVar3.d();
                e m11 = m();
                if (m11 != null) {
                    d12 = m11.K.d();
                }
                if (i11 != null) {
                    b(this.f12535h, i11, d12);
                }
                f i12 = i(dVar4, 1);
                int d13 = dVar4.d();
                e n11 = n();
                if (n11 != null) {
                    d13 = n11.M.d();
                }
                if (i12 != null) {
                    b(this.i, i12, -d13);
                }
            }
            this.f12535h.f12504a = this;
            this.i.f12504a = this;
        }
    }

    public final void e() {
        for (int i = 0; i < this.f12495k.size(); i++) {
            this.f12495k.get(i).e();
        }
    }

    public final void f() {
        this.f12531c = null;
        Iterator<p> it = this.f12495k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public final long j() {
        int size = this.f12495k.size();
        long j10 = 0;
        for (int i = 0; i < size; i++) {
            p pVar = this.f12495k.get(i);
            j10 = ((long) pVar.i.f12509f) + pVar.j() + j10 + ((long) pVar.f12535h.f12509f);
        }
        return j10;
    }

    public final boolean k() {
        int size = this.f12495k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f12495k.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final e m() {
        for (int i = 0; i < this.f12495k.size(); i++) {
            e eVar = this.f12495k.get(i).f12530b;
            if (eVar.f12064i0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final e n() {
        for (int size = this.f12495k.size() - 1; size >= 0; size--) {
            e eVar = this.f12495k.get(size).f12530b;
            if (eVar.f12064i0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f12534f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f12495k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
