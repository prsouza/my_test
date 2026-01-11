package w;

import java.util.ArrayList;
import v.d;
import v.e;
import v.g;

public final class i {
    public static o a(e eVar, int i, ArrayList<o> arrayList, o oVar) {
        int i10;
        int i11;
        if (i == 0) {
            i10 = eVar.f12078p0;
        } else {
            i10 = eVar.f12080q0;
        }
        int i12 = 0;
        if (i10 != -1 && (oVar == null || i10 != oVar.f12525b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i13);
                if (oVar2.f12525b == i10) {
                    if (oVar != null) {
                        oVar.d(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i10 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (eVar instanceof v.i) {
                v.i iVar = (v.i) eVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= iVar.f12106s0) {
                        i11 = -1;
                        break;
                    }
                    e eVar2 = iVar.f12105r0[i14];
                    if ((i == 0 && (i11 = eVar2.f12078p0) != -1) || (i == 1 && (i11 = eVar2.f12080q0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i15);
                        if (oVar3.f12525b == i11) {
                            oVar = oVar3;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof g) {
                g gVar = (g) eVar;
                d dVar = gVar.f12101u0;
                if (gVar.f12102v0 == 0) {
                    i12 = 1;
                }
                dVar.b(i12, arrayList, oVar);
            }
            if (i == 0) {
                eVar.f12078p0 = oVar.f12525b;
                eVar.J.b(i, arrayList, oVar);
                eVar.L.b(i, arrayList, oVar);
            } else {
                eVar.f12080q0 = oVar.f12525b;
                eVar.K.b(i, arrayList, oVar);
                eVar.N.b(i, arrayList, oVar);
                eVar.M.b(i, arrayList, oVar);
            }
            eVar.Q.b(i, arrayList, oVar);
        }
        return oVar;
    }

    public static o b(ArrayList<o> arrayList, int i) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = arrayList.get(i10);
            if (i == oVar.f12525b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = v.e.b.WRAP_CONTENT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(v.e.b r5, v.e.b r6, v.e.b r7, v.e.b r8) {
        /*
            v.e$b r0 = v.e.b.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            v.e$b r3 = v.e.b.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            v.e$b r4 = v.e.b.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r1
            goto L_0x0014
        L_0x0013:
            r5 = r2
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            v.e$b r7 = v.e.b.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            v.e$b r0 = v.e.b.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = r1
            goto L_0x0024
        L_0x0023:
            r6 = r2
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w.i.c(v.e$b, v.e$b, v.e$b, v.e$b):boolean");
    }
}
