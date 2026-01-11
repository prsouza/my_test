package fe;

import a.b;
import a8.a;
import c3.k;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.m;
import xd.l;

public class g extends b {
    public static final l S0() {
        if (BuildConfig.FLAVOR.length() == 0) {
            return e.f5102b;
        }
        return new f();
    }

    public static final String T0(String str) {
        Comparable comparable;
        e.D(str, "<this>");
        List<String> p12 = o.p1(str);
        ArrayList arrayList = new ArrayList();
        for (T next : p12) {
            if (true ^ k.Z0((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(nd.g.S0(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (!k.t0(str2.charAt(i))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int size = (p12.size() * 0) + str.length();
        l S0 = S0();
        int c02 = b.c0(p12);
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        for (T next2 : p12) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                String str3 = (String) next2;
                if ((i10 == 0 || i10 == c02) && k.Z0(str3)) {
                    str3 = null;
                } else {
                    e.D(str3, "<this>");
                    if (intValue >= 0) {
                        int length2 = str3.length();
                        if (intValue <= length2) {
                            length2 = intValue;
                        }
                        String substring = str3.substring(length2);
                        e.C(substring, "this as java.lang.String).substring(startIndex)");
                        String str4 = (String) S0.k(substring);
                        if (str4 != null) {
                            str3 = str4;
                        }
                    } else {
                        throw new IllegalArgumentException(a.b("Requested character count ", intValue, " is less than zero.").toString());
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i10 = i11;
            } else {
                b.N0();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder(size);
        Appendable unused = m.Z0(arrayList3, sb2, "\n", BuildConfig.FLAVOR, BuildConfig.FLAVOR, -1, "...", (l) null);
        String sb3 = sb2.toString();
        e.C(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String U0(java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            e6.e.D(r13, r0)
            java.lang.String r0 = "|"
            boolean r1 = fe.k.Z0(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00a5
            java.util.List r1 = fe.o.p1(r13)
            int r13 = r13.length()
            int r2 = r1.size()
            r3 = 0
            int r2 = r2 * r3
            int r2 = r2 + r13
            xd.l r13 = S0()
            int r4 = a.b.c0(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
            r6 = r3
        L_0x0030:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0093
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            r9 = 0
            if (r6 < 0) goto L_0x008f
            java.lang.String r7 = (java.lang.String) r7
            if (r6 == 0) goto L_0x0045
            if (r6 != r4) goto L_0x004c
        L_0x0045:
            boolean r6 = fe.k.Z0(r7)
            if (r6 == 0) goto L_0x004c
            goto L_0x0088
        L_0x004c:
            int r6 = r7.length()
            r10 = r3
        L_0x0051:
            r11 = -1
            if (r10 >= r6) goto L_0x0064
            char r12 = r7.charAt(r10)
            boolean r12 = c3.k.t0(r12)
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x0061
            goto L_0x0065
        L_0x0061:
            int r10 = r10 + 1
            goto L_0x0051
        L_0x0064:
            r10 = r11
        L_0x0065:
            if (r10 != r11) goto L_0x0068
            goto L_0x007c
        L_0x0068:
            boolean r6 = fe.k.c1(r7, r0, r10, r3)
            if (r6 == 0) goto L_0x007c
            int r6 = r0.length()
            int r6 = r6 + r10
            java.lang.String r9 = r7.substring(r6)
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            e6.e.C(r9, r6)
        L_0x007c:
            if (r9 == 0) goto L_0x0087
            java.lang.Object r6 = r13.k(r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x0088
        L_0x0087:
            r9 = r7
        L_0x0088:
            if (r9 == 0) goto L_0x008d
            r5.add(r9)
        L_0x008d:
            r6 = r8
            goto L_0x0030
        L_0x008f:
            a.b.N0()
            throw r9
        L_0x0093:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r2)
            java.lang.Appendable unused = nd.m.Z0(r5, r13, "\n", com.github.mikephil.charting.BuildConfig.FLAVOR, com.github.mikephil.charting.BuildConfig.FLAVOR, -1, "...", (xd.l) null)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            e6.e.C(r13, r0)
            return r13
        L_0x00a5:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: fe.g.U0(java.lang.String):java.lang.String");
    }
}
