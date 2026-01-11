package i7;

import c3.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i7.i;
import java.util.List;
import java.util.Map;

public final class s0 {
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
        if (obj instanceof List) {
            for (Object b10 : (List) obj) {
                b(sb2, i, str, b10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b11 : ((Map) obj).entrySet()) {
                b(sb2, i, str, b11);
            }
        } else {
            sb2.append(10);
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                i.f fVar = i.f6271b;
                sb2.append(k.l0(new i.f(((String) obj).getBytes(z.f6396a))));
                sb2.append('\"');
            } else if (obj instanceof i) {
                sb2.append(": \"");
                sb2.append(k.l0((i) obj));
                sb2.append('\"');
            } else if (obj instanceof x) {
                sb2.append(" {");
                c((x) obj, sb2, i + 2);
                sb2.append("\n");
                while (i10 < i) {
                    sb2.append(' ');
                    i10++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i12 = i + 2;
                b(sb2, i12, "key", entry.getKey());
                b(sb2, i12, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
                sb2.append("\n");
                while (i10 < i) {
                    sb2.append(' ');
                    i10++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01cd, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01de, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f0, code lost:
        if (((java.lang.Double) r4).doubleValue() == com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x0224;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(i7.q0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
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
            r4 = 3
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00c0
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00c0
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00c0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00c0
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00c0
            java.lang.String r3 = a(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = i7.x.r(r9, r13, r4)
            b(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00c0:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0123
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0123
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0123
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0123
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0123
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0123
            java.lang.String r4 = a(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = i7.x.r(r3, r13, r6)
            b(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0123:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "set"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L_0x013e
            goto L_0x004d
        L_0x013e:
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x0163
            java.lang.StringBuilder r3 = a.a.d(r7)
            int r4 = r6.length()
            int r4 = r4 + -5
            java.lang.String r4 = r6.substring(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L_0x0163
            goto L_0x004d
        L_0x0163:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.substring(r5, r10)
            java.lang.String r4 = r4.toLowerCase()
            r3.append(r4)
            java.lang.String r4 = r6.substring(r10)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "has"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = i7.x.r(r4, r13, r8)
            if (r6 != 0) goto L_0x022c
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01c2
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r10
            goto L_0x0227
        L_0x01c2:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01d0
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x0226
            goto L_0x0224
        L_0x01d0:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x01e1
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0226
            goto L_0x0224
        L_0x01e1:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x01f3
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0226
            goto L_0x0224
        L_0x01f3:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x01fe
            java.lang.String r6 = ""
            boolean r6 = r4.equals(r6)
            goto L_0x0227
        L_0x01fe:
            boolean r6 = r4 instanceof i7.i
            if (r6 == 0) goto L_0x0209
            i7.i$f r6 = i7.i.f6271b
            boolean r6 = r4.equals(r6)
            goto L_0x0227
        L_0x0209:
            boolean r6 = r4 instanceof i7.q0
            if (r6 == 0) goto L_0x0217
            r6 = r4
            i7.q0 r6 = (i7.q0) r6
            i7.q0 r6 = r6.c()
            if (r4 != r6) goto L_0x0226
            goto L_0x0224
        L_0x0217:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x0226
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x0226
        L_0x0224:
            r6 = r10
            goto L_0x0227
        L_0x0226:
            r6 = r5
        L_0x0227:
            if (r6 != 0) goto L_0x022a
            goto L_0x0238
        L_0x022a:
            r10 = r5
            goto L_0x0238
        L_0x022c:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = i7.x.r(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x0238:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = a(r3)
            b(r14, r15, r3, r4)
            goto L_0x004d
        L_0x0243:
            boolean r0 = r13 instanceof i7.x.c
            if (r0 == 0) goto L_0x026f
            r0 = r13
            i7.x$c r0 = (i7.x.c) r0
            i7.t<i7.x$d> r0 = r0.extensions
            java.util.Iterator r0 = r0.k()
        L_0x0250:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x026f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            i7.x$d r2 = (i7.x.d) r2
            java.util.Objects.requireNonNull(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "[0]"
            b(r14, r15, r2, r1)
            goto L_0x0250
        L_0x026f:
            i7.x r13 = (i7.x) r13
            i7.m1 r13 = r13.unknownFields
            if (r13 == 0) goto L_0x028c
        L_0x0275:
            int r0 = r13.f6325a
            if (r5 >= r0) goto L_0x028c
            int[] r0 = r13.f6326b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f6327c
            r1 = r1[r5]
            b(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L_0x0275
        L_0x028c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.s0.c(i7.q0, java.lang.StringBuilder, int):void");
    }
}
