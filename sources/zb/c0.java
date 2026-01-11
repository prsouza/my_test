package zb;

import c3.k;
import java.util.List;
import zb.h;

public final class c0 {
    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static final void b(StringBuilder sb2, int i, String str, Object obj) {
        String str2;
        String str3;
        if (obj instanceof List) {
            for (Object b10 : (List) obj) {
                b(sb2, i, str, b10);
            }
            return;
        }
        sb2.append(10);
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            h.d dVar = h.f14304b;
            str2 = k.q(new h.d(((String) obj).getBytes(t.f14377a)));
        } else if (obj instanceof h) {
            sb2.append(": \"");
            str2 = k.q((h) obj);
        } else {
            if (obj instanceof r) {
                sb2.append(" {");
                c((r) obj, sb2, i + 2);
                sb2.append("\n");
                for (int i11 = 0; i11 < i; i11++) {
                    sb2.append(' ');
                }
                str3 = "}";
            } else {
                sb2.append(": ");
                str3 = obj.toString();
            }
            sb2.append(str3);
            return;
        }
        sb2.append(str2);
        sb2.append('\"');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0160, code lost:
        if (((java.lang.Integer) r9).intValue() == 0) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0171, code lost:
        if (((java.lang.Float) r9).floatValue() == 0.0f) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0183, code lost:
        if (((java.lang.Double) r9).doubleValue() == com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x01b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(zb.a0 r12, java.lang.StringBuilder r13, int r14) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r12.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01d4
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ""
            java.lang.String r3 = r3.replaceFirst(r7, r4)
            java.lang.String r6 = "List"
            boolean r6 = r3.endsWith(r6)
            r8 = 1
            if (r6 == 0) goto L_0x00b6
            java.lang.String r6 = "OrBuilderList"
            boolean r6 = r3.endsWith(r6)
            if (r6 != 0) goto L_0x00b6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r3.substring(r5, r8)
            java.lang.String r9 = r9.toLowerCase()
            r6.append(r9)
            int r9 = r3.length()
            int r9 = r9 + -4
            java.lang.String r9 = r3.substring(r8, r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r0.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00b6
            java.lang.String r3 = a(r6)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = zb.r.f(r9, r12, r4)
            b(r13, r14, r3, r4)
            goto L_0x004d
        L_0x00b6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "set"
            r6.append(r9)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L_0x00d1
            goto L_0x004d
        L_0x00d1:
            java.lang.String r6 = "Bytes"
            boolean r6 = r3.endsWith(r6)
            if (r6 == 0) goto L_0x00f6
            java.lang.StringBuilder r6 = a.b.q(r7)
            int r9 = r3.length()
            int r9 = r9 + -5
            java.lang.String r9 = r3.substring(r5, r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L_0x00f6
            goto L_0x004d
        L_0x00f6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r3.substring(r5, r8)
            java.lang.String r9 = r9.toLowerCase()
            r6.append(r9)
            java.lang.String r9 = r3.substring(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r0.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "has"
            r10.append(r11)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r9 == 0) goto L_0x004d
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Object r9 = zb.r.f(r9, r12, r10)
            if (r3 != 0) goto L_0x01bd
            boolean r3 = r9 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x0155
            r3 = r9
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r3 = r3 ^ r8
            goto L_0x01b8
        L_0x0155:
            boolean r3 = r9 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0163
            r3 = r9
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b5
        L_0x0163:
            boolean r3 = r9 instanceof java.lang.Float
            if (r3 == 0) goto L_0x0174
            r3 = r9
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b5
        L_0x0174:
            boolean r3 = r9 instanceof java.lang.Double
            if (r3 == 0) goto L_0x0186
            r3 = r9
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r10 = 0
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b5
        L_0x0186:
            boolean r3 = r9 instanceof java.lang.String
            if (r3 == 0) goto L_0x018f
            boolean r3 = r9.equals(r4)
            goto L_0x01b8
        L_0x018f:
            boolean r3 = r9 instanceof zb.h
            if (r3 == 0) goto L_0x019a
            zb.h$d r3 = zb.h.f14304b
            boolean r3 = r9.equals(r3)
            goto L_0x01b8
        L_0x019a:
            boolean r3 = r9 instanceof zb.a0
            if (r3 == 0) goto L_0x01a8
            r3 = r9
            zb.a0 r3 = (zb.a0) r3
            zb.a0 r3 = r3.b()
            if (r9 != r3) goto L_0x01b7
            goto L_0x01b5
        L_0x01a8:
            boolean r3 = r9 instanceof java.lang.Enum
            if (r3 == 0) goto L_0x01b7
            r3 = r9
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r3 = r3.ordinal()
            if (r3 != 0) goto L_0x01b7
        L_0x01b5:
            r3 = r8
            goto L_0x01b8
        L_0x01b7:
            r3 = r5
        L_0x01b8:
            if (r3 != 0) goto L_0x01bb
            goto L_0x01c9
        L_0x01bb:
            r8 = r5
            goto L_0x01c9
        L_0x01bd:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r3 = zb.r.f(r3, r12, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r8 = r3.booleanValue()
        L_0x01c9:
            if (r8 == 0) goto L_0x004d
            java.lang.String r3 = a(r6)
            b(r13, r14, r3, r9)
            goto L_0x004d
        L_0x01d4:
            boolean r0 = r12 instanceof zb.r.d
            if (r0 == 0) goto L_0x022e
            r0 = r12
            zb.r$d r0 = (zb.r.d) r0
            zb.q<zb.r$e> r0 = r0.f14364s
            boolean r1 = r0.f14355c
            if (r1 == 0) goto L_0x01f3
            zb.v$b r1 = new zb.v$b
            zb.g0<FieldDescriptorType, java.lang.Object> r0 = r0.f14353a
            java.util.Set r0 = r0.entrySet()
            zb.g0$d r0 = (zb.g0.d) r0
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            goto L_0x01ff
        L_0x01f3:
            zb.g0<FieldDescriptorType, java.lang.Object> r0 = r0.f14353a
            java.util.Set r0 = r0.entrySet()
            zb.g0$d r0 = (zb.g0.d) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x01ff:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x022e
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.String r2 = "["
            java.lang.StringBuilder r2 = a.b.q(r2)
            java.lang.Object r3 = r0.getKey()
            zb.r$e r3 = (zb.r.e) r3
            java.util.Objects.requireNonNull(r3)
            r2.append(r5)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.getValue()
            b(r13, r14, r2, r0)
            goto L_0x01ff
        L_0x022e:
            zb.r r12 = (zb.r) r12
            zb.c r12 = r12.f14356b
            if (r12 == 0) goto L_0x024c
        L_0x0234:
            int r0 = r12.f14274a
            if (r5 >= r0) goto L_0x024c
            int[] r0 = r12.f14275b
            r0 = r0[r5]
            int r0 = r0 >>> 3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r12.f14276c
            r1 = r1[r5]
            b(r13, r14, r0, r1)
            int r5 = r5 + 1
            goto L_0x0234
        L_0x024c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.c0.c(zb.a0, java.lang.StringBuilder, int):void");
    }
}
