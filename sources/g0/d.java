package g0;

import android.graphics.Path;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.location.LocationRequest;

public final class d {
    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            if (aVarArr[i].f5208a != aVarArr2[i].f5208a || aVarArr[i].f5209b.length != aVarArr2[i].f5209b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i10 = i - 0;
                int min = Math.min(i10, length - 0);
                float[] fArr2 = new float[i10];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r13 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097 A[Catch:{ NumberFormatException -> 0x00bc }, LOOP:3: B:25:0x006c->B:45:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g0.d.a[] c(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        L_0x000f:
            int r5 = r17.length()
            if (r4 >= r5) goto L_0x00e3
        L_0x0015:
            int r5 = r17.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r4 >= r5) goto L_0x0039
            char r5 = r0.charAt(r4)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0031
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0036
        L_0x0031:
            if (r5 == r7) goto L_0x0036
            if (r5 == r6) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0039:
            java.lang.String r2 = r0.substring(r2, r4)
            java.lang.String r2 = r2.trim()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00d9
            char r5 = r2.charAt(r3)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00cb
            char r5 = r2.charAt(r3)
            r8 = 90
            if (r5 != r8) goto L_0x0059
            goto L_0x00cb
        L_0x0059:
            int r5 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            float[] r5 = new float[r5]     // Catch:{ NumberFormatException -> 0x00bc }
            int r8 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            r9 = 1
            r10 = r9
            r9 = r3
        L_0x0066:
            if (r10 >= r8) goto L_0x00b1
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r10
        L_0x006c:
            int r15 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            if (r14 >= r15) goto L_0x009a
            char r15 = r2.charAt(r14)     // Catch:{ NumberFormatException -> 0x00bc }
            r7 = 32
            if (r15 == r7) goto L_0x0090
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008e
            if (r15 == r7) goto L_0x008e
            switch(r15) {
                case 44: goto L_0x0092;
                case 45: goto L_0x0088;
                case 46: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ NumberFormatException -> 0x00bc }
        L_0x0083:
            goto L_0x0093
        L_0x0084:
            if (r12 != 0) goto L_0x008c
            r12 = 1
            goto L_0x0093
        L_0x0088:
            if (r14 == r10) goto L_0x0093
            if (r13 != 0) goto L_0x0093
        L_0x008c:
            r11 = 1
            goto L_0x0092
        L_0x008e:
            r13 = 1
            goto L_0x0094
        L_0x0090:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0092:
            r9 = 1
        L_0x0093:
            r13 = 0
        L_0x0094:
            if (r9 == 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            int r14 = r14 + 1
            goto L_0x006c
        L_0x009a:
            if (r10 >= r14) goto L_0x00a9
            int r9 = r3 + 1
            java.lang.String r10 = r2.substring(r10, r14)     // Catch:{ NumberFormatException -> 0x00bc }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x00bc }
            r5[r3] = r10     // Catch:{ NumberFormatException -> 0x00bc }
            r3 = r9
        L_0x00a9:
            if (r11 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            int r14 = r14 + 1
        L_0x00ae:
            r10 = r14
            r9 = 0
            goto L_0x0066
        L_0x00b1:
            float[] r3 = b(r5, r3)     // Catch:{ NumberFormatException -> 0x00bc }
            r5 = 0
            r16 = r5
            r5 = r3
            r3 = r16
            goto L_0x00cd
        L_0x00bc:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "error in parsing \""
            java.lang.String r4 = "\""
            java.lang.String r2 = androidx.fragment.app.o.c(r3, r2, r4)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r5 = new float[r3]
        L_0x00cd:
            char r2 = r2.charAt(r3)
            g0.d$a r3 = new g0.d$a
            r3.<init>(r2, r5)
            r1.add(r3)
        L_0x00d9:
            int r2 = r4 + 1
            r3 = 0
            r16 = r4
            r4 = r2
            r2 = r16
            goto L_0x000f
        L_0x00e3:
            int r4 = r4 - r2
            r3 = 1
            if (r4 != r3) goto L_0x00fc
            int r3 = r17.length()
            if (r2 >= r3) goto L_0x00fc
            char r0 = r0.charAt(r2)
            r2 = 0
            float[] r2 = new float[r2]
            g0.d$a r3 = new g0.d$a
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00fc:
            int r0 = r1.size()
            g0.d$a[] r0 = new g0.d.a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            g0.d$a[] r0 = (g0.d.a[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.d.c(java.lang.String):g0.d$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c10 = c(str);
        if (c10 == null) {
            return null;
        }
        try {
            a.b(c10, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException(a8.a.c("Error in parsing ", str), e10);
        }
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = new a(aVarArr[i]);
        }
        return aVarArr2;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public char f5208a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f5209b;

        public a(char c10, float[] fArr) {
            this.f5208a = c10;
            this.f5209b = fArr;
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z, boolean z10) {
            double d10;
            double d11;
            float f17 = f10;
            float f18 = f12;
            float f19 = f14;
            boolean z11 = z10;
            double radians = Math.toRadians((double) f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = (double) f17;
            double d13 = (double) f11;
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = (double) f19;
            double d17 = d14 / d16;
            double d18 = radians;
            double d19 = (double) f15;
            double d20 = ((d13 * cos) + (((double) (-f17)) * sin)) / d19;
            double d21 = d13;
            double d22 = (double) f13;
            double d23 = ((d22 * sin) + (((double) f18) * cos)) / d16;
            double d24 = ((d22 * cos) + (((double) (-f18)) * sin)) / d19;
            double d25 = d17 - d23;
            double d26 = d20 - d24;
            double d27 = (d17 + d23) / 2.0d;
            double d28 = (d20 + d24) / 2.0d;
            double d29 = sin;
            double d30 = (d26 * d26) + (d25 * d25);
            if (d30 == Utils.DOUBLE_EPSILON) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d31 = (1.0d / d30) - 0.25d;
            if (d31 < Utils.DOUBLE_EPSILON) {
                Log.w("PathParser", "Points are too far apart " + d30);
                float sqrt = (float) (Math.sqrt(d30) / 1.99999d);
                a(path, f10, f11, f12, f13, f19 * sqrt, f15 * sqrt, f16, z, z10);
                return;
            }
            double sqrt2 = Math.sqrt(d31);
            double d32 = d25 * sqrt2;
            double d33 = sqrt2 * d26;
            if (z == z11) {
                d11 = d27 - d33;
                d10 = d28 + d32;
            } else {
                d11 = d27 + d33;
                d10 = d28 - d32;
            }
            double atan2 = Math.atan2(d20 - d10, d17 - d11);
            double atan22 = Math.atan2(d24 - d10, d23 - d11) - atan2;
            int i = (atan22 > Utils.DOUBLE_EPSILON ? 1 : (atan22 == Utils.DOUBLE_EPSILON ? 0 : -1));
            if (z11 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d34 = d11 * d16;
            double d35 = d10 * d19;
            double d36 = (d34 * cos) - (d35 * d29);
            double d37 = (d35 * cos) + (d34 * d29);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d38 = -d16;
            double d39 = d38 * cos2;
            double d40 = d19 * sin2;
            double d41 = (d39 * sin3) - (d40 * cos3);
            double d42 = d38 * sin2;
            double d43 = d19 * cos2;
            double d44 = (cos3 * d43) + (sin3 * d42);
            double d45 = d43;
            double d46 = atan22 / ((double) ceil);
            int i10 = 0;
            while (i10 < ceil) {
                double d47 = atan2 + d46;
                double sin4 = Math.sin(d47);
                double cos4 = Math.cos(d47);
                double d48 = d46;
                double d49 = (((d16 * cos2) * cos4) + d36) - (d40 * sin4);
                double d50 = d45;
                double d51 = d36;
                double d52 = (d50 * sin4) + (d16 * sin2 * cos4) + d37;
                double d53 = (d39 * sin4) - (d40 * cos4);
                double d54 = (cos4 * d50) + (sin4 * d42);
                double d55 = d47 - atan2;
                double tan = Math.tan(d55 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d55)) / 3.0d;
                double d56 = d47;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d41 * sqrt3) + d15), (float) ((d44 * sqrt3) + d21), (float) (d49 - (sqrt3 * d53)), (float) (d52 - (sqrt3 * d54)), (float) d49, (float) d52);
                i10++;
                atan2 = d56;
                d42 = d42;
                cos2 = cos2;
                ceil = ceil;
                d44 = d54;
                d16 = d16;
                d41 = d53;
                d15 = d49;
                d21 = d52;
                d36 = d51;
                d46 = d48;
                d45 = d50;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i;
            float f10;
            float f11;
            int i10;
            int i11;
            float[] fArr;
            char c10;
            int i12;
            float[] fArr2;
            char c11;
            int i13;
            float f12;
            float f13;
            float f14;
            float f15;
            int i14;
            float f16;
            float f17;
            int i15;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            float f30;
            float f31;
            float f32;
            a[] aVarArr2 = aVarArr;
            Path path2 = path;
            int i16 = 6;
            float[] fArr3 = new float[6];
            char c12 = 'm';
            int i17 = 0;
            char c13 = 'm';
            int i18 = 0;
            while (i18 < aVarArr2.length) {
                char c14 = aVarArr2[i18].f5208a;
                float[] fArr4 = aVarArr2[i18].f5209b;
                float f33 = fArr3[i17];
                float f34 = fArr3[1];
                float f35 = fArr3[2];
                float f36 = fArr3[3];
                float f37 = fArr3[4];
                float f38 = fArr3[5];
                switch (c14) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = i16;
                        break;
                    case 'H':
                    case 'V':
                    case LocationRequest.PRIORITY_LOW_POWER:
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path2.moveTo(f37, f38);
                        f33 = f37;
                        f35 = f33;
                        f34 = f38;
                        f36 = f34;
                        break;
                }
                i = 2;
                float f39 = f37;
                float f40 = f38;
                float f41 = f33;
                float f42 = f34;
                int i19 = i17;
                while (i19 < fArr4.length) {
                    if (c14 != 'A') {
                        if (c14 != 'C') {
                            if (c14 == 'H') {
                                i10 = i19;
                                fArr = fArr4;
                                c10 = c14;
                                i11 = i18;
                                int i20 = i10 + 0;
                                path2.lineTo(fArr[i20], f42);
                                f41 = fArr[i20];
                            } else if (c14 == 'Q') {
                                i14 = i19;
                                fArr = fArr4;
                                c10 = c14;
                                i11 = i18;
                                int i21 = i14 + 0;
                                int i22 = i14 + 1;
                                int i23 = i14 + 2;
                                int i24 = i14 + 3;
                                path2.quadTo(fArr[i21], fArr[i22], fArr[i23], fArr[i24]);
                                f15 = fArr[i21];
                                f14 = fArr[i22];
                                f41 = fArr[i23];
                                f42 = fArr[i24];
                            } else if (c14 == 'V') {
                                i10 = i19;
                                fArr = fArr4;
                                c10 = c14;
                                i11 = i18;
                                int i25 = i10 + 0;
                                path2.lineTo(f41, fArr[i25]);
                                f42 = fArr[i25];
                            } else if (c14 != 'a') {
                                if (c14 != 'c') {
                                    if (c14 == 'h') {
                                        i10 = i19;
                                        float f43 = f42;
                                        int i26 = i10 + 0;
                                        path2.rLineTo(fArr4[i26], 0.0f);
                                        f41 += fArr4[i26];
                                    } else if (c14 != 'q') {
                                        if (c14 == 'v') {
                                            i10 = i19;
                                            f23 = f42;
                                            float f44 = f41;
                                            int i27 = i10 + 0;
                                            path2.rLineTo(0.0f, fArr4[i27]);
                                            f24 = fArr4[i27];
                                        } else if (c14 != 'L') {
                                            if (c14 == 'M') {
                                                i10 = i19;
                                                int i28 = i10 + 0;
                                                float f45 = fArr4[i28];
                                                int i29 = i10 + 1;
                                                float f46 = fArr4[i29];
                                                if (i10 > 0) {
                                                    path2.lineTo(fArr4[i28], fArr4[i29]);
                                                    f41 = f45;
                                                    f42 = f46;
                                                } else {
                                                    path2.moveTo(fArr4[i28], fArr4[i29]);
                                                    f39 = f45;
                                                    f40 = f46;
                                                }
                                            } else if (c14 == 'S') {
                                                i15 = i19;
                                                float f47 = f42;
                                                float f48 = f41;
                                                if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                    f25 = (f47 * 2.0f) - f10;
                                                    f26 = (f48 * 2.0f) - f11;
                                                } else {
                                                    f26 = f48;
                                                    f25 = f47;
                                                }
                                                int i30 = i15 + 0;
                                                int i31 = i15 + 1;
                                                int i32 = i15 + 2;
                                                int i33 = i15 + 3;
                                                path.cubicTo(f26, f25, fArr4[i30], fArr4[i31], fArr4[i32], fArr4[i33]);
                                                float f49 = fArr4[i30];
                                                float f50 = fArr4[i31];
                                                f17 = fArr4[i32];
                                                f16 = fArr4[i33];
                                                f11 = f49;
                                                f10 = f50;
                                                f41 = f17;
                                                f42 = f16;
                                            } else if (c14 == 'T') {
                                                i10 = i19;
                                                float f51 = f42;
                                                float f52 = f41;
                                                if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                    f27 = (f52 * 2.0f) - f11;
                                                    f28 = (f51 * 2.0f) - f10;
                                                } else {
                                                    f27 = f52;
                                                    f28 = f51;
                                                }
                                                int i34 = i10 + 0;
                                                int i35 = i10 + 1;
                                                path2.quadTo(f27, f28, fArr4[i34], fArr4[i35]);
                                                f10 = f28;
                                                f11 = f27;
                                                fArr = fArr4;
                                                c10 = c14;
                                                i11 = i18;
                                                f41 = fArr4[i34];
                                                f42 = fArr4[i35];
                                            } else if (c14 == 'l') {
                                                i10 = i19;
                                                f23 = f42;
                                                int i36 = i10 + 0;
                                                int i37 = i10 + 1;
                                                path2.rLineTo(fArr4[i36], fArr4[i37]);
                                                f41 += fArr4[i36];
                                                f24 = fArr4[i37];
                                            } else if (c14 == c12) {
                                                i10 = i19;
                                                int i38 = i10 + 0;
                                                f41 += fArr4[i38];
                                                int i39 = i10 + 1;
                                                f42 += fArr4[i39];
                                                if (i10 > 0) {
                                                    path2.rLineTo(fArr4[i38], fArr4[i39]);
                                                } else {
                                                    path2.rMoveTo(fArr4[i38], fArr4[i39]);
                                                    f40 = f42;
                                                    f39 = f41;
                                                }
                                            } else if (c14 != 's') {
                                                if (c14 == 't') {
                                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                        f31 = f41 - f11;
                                                        f32 = f42 - f10;
                                                    } else {
                                                        f32 = 0.0f;
                                                        f31 = 0;
                                                    }
                                                    int i40 = i19 + 0;
                                                    int i41 = i19 + 1;
                                                    path2.rQuadTo(f31, f32, fArr4[i40], fArr4[i41]);
                                                    float f53 = f31 + f41;
                                                    float f54 = f32 + f42;
                                                    f41 += fArr4[i40];
                                                    f42 += fArr4[i41];
                                                    f10 = f54;
                                                    f11 = f53;
                                                }
                                                i10 = i19;
                                            } else {
                                                if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                    f29 = f42 - f10;
                                                    f30 = f41 - f11;
                                                } else {
                                                    f30 = 0.0f;
                                                    f29 = 0.0f;
                                                }
                                                int i42 = i19 + 0;
                                                int i43 = i19 + 1;
                                                int i44 = i19 + 2;
                                                int i45 = i19 + 3;
                                                i15 = i19;
                                                f18 = f42;
                                                float f55 = f41;
                                                path.rCubicTo(f30, f29, fArr4[i42], fArr4[i43], fArr4[i44], fArr4[i45]);
                                                f21 = fArr4[i42] + f55;
                                                f20 = fArr4[i43] + f18;
                                                f19 = f55 + fArr4[i44];
                                                f22 = fArr4[i45];
                                            }
                                            f41 = f39;
                                            f42 = f40;
                                        } else {
                                            i10 = i19;
                                            int i46 = i10 + 0;
                                            int i47 = i10 + 1;
                                            path2.lineTo(fArr4[i46], fArr4[i47]);
                                            f41 = fArr4[i46];
                                            f42 = fArr4[i47];
                                        }
                                        f42 = f23 + f24;
                                    } else {
                                        i15 = i19;
                                        f18 = f42;
                                        float f56 = f41;
                                        int i48 = i15 + 0;
                                        int i49 = i15 + 1;
                                        int i50 = i15 + 2;
                                        int i51 = i15 + 3;
                                        path2.rQuadTo(fArr4[i48], fArr4[i49], fArr4[i50], fArr4[i51]);
                                        f21 = fArr4[i48] + f56;
                                        f20 = fArr4[i49] + f18;
                                        float f57 = f56 + fArr4[i50];
                                        float f58 = fArr4[i51];
                                        f19 = f57;
                                        f22 = f58;
                                    }
                                    fArr = fArr4;
                                    c10 = c14;
                                    i11 = i18;
                                } else {
                                    i15 = i19;
                                    f18 = f42;
                                    float f59 = f41;
                                    int i52 = i15 + 2;
                                    int i53 = i15 + 3;
                                    int i54 = i15 + 4;
                                    int i55 = i15 + 5;
                                    path.rCubicTo(fArr4[i15 + 0], fArr4[i15 + 1], fArr4[i52], fArr4[i53], fArr4[i54], fArr4[i55]);
                                    f21 = fArr4[i52] + f59;
                                    f20 = fArr4[i53] + f18;
                                    f19 = f59 + fArr4[i54];
                                    f22 = fArr4[i55];
                                }
                                f16 = f18 + f22;
                                f11 = f21;
                                f10 = f20;
                                f17 = f19;
                                f41 = f17;
                                f42 = f16;
                                fArr = fArr4;
                                c10 = c14;
                                i11 = i18;
                            } else {
                                i12 = i19;
                                float f60 = f42;
                                float f61 = f41;
                                int i56 = i12 + 5;
                                float f62 = fArr4[i56] + f61;
                                int i57 = i12 + 6;
                                float f63 = fArr4[i57] + f60;
                                float f64 = fArr4[i12 + 0];
                                float f65 = fArr4[i12 + 1];
                                float f66 = fArr4[i12 + 2];
                                boolean z = fArr4[i12 + 3] != 0.0f;
                                boolean z10 = fArr4[i12 + 4] != 0.0f;
                                fArr2 = fArr4;
                                float f67 = f66;
                                c11 = c14;
                                i13 = i18;
                                a(path, f61, f60, f62, f63, f64, f65, f67, z, z10);
                                f12 = f61 + fArr2[i56];
                                f13 = f60 + fArr2[i57];
                            }
                            i19 = i10 + i;
                            c13 = c10;
                            c14 = c13;
                            fArr4 = fArr;
                            i18 = i11;
                            c12 = 'm';
                            i17 = 0;
                            a[] aVarArr3 = aVarArr;
                        } else {
                            i14 = i19;
                            fArr = fArr4;
                            c10 = c14;
                            i11 = i18;
                            int i58 = i14 + 2;
                            int i59 = i14 + 3;
                            int i60 = i14 + 4;
                            int i61 = i14 + 5;
                            path.cubicTo(fArr[i14 + 0], fArr[i14 + 1], fArr[i58], fArr[i59], fArr[i60], fArr[i61]);
                            float f68 = fArr[i60];
                            float f69 = fArr[i61];
                            f15 = fArr[i58];
                            f41 = f68;
                            f42 = f69;
                            f14 = fArr[i59];
                        }
                        f11 = f15;
                        f10 = f14;
                        i19 = i10 + i;
                        c13 = c10;
                        c14 = c13;
                        fArr4 = fArr;
                        i18 = i11;
                        c12 = 'm';
                        i17 = 0;
                        a[] aVarArr32 = aVarArr;
                    } else {
                        i12 = i19;
                        fArr2 = fArr4;
                        c11 = c14;
                        i13 = i18;
                        int i62 = i12 + 5;
                        int i63 = i12 + 6;
                        a(path, f41, f42, fArr2[i62], fArr2[i63], fArr2[i12 + 0], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f, fArr2[i12 + 4] != 0.0f);
                        f12 = fArr2[i62];
                        f13 = fArr2[i63];
                    }
                    f10 = f42;
                    f11 = f41;
                    i19 = i10 + i;
                    c13 = c10;
                    c14 = c13;
                    fArr4 = fArr;
                    i18 = i11;
                    c12 = 'm';
                    i17 = 0;
                    a[] aVarArr322 = aVarArr;
                }
                int i64 = i18;
                fArr3[i17] = f41;
                fArr3[1] = f42;
                fArr3[2] = f11;
                fArr3[3] = f10;
                fArr3[4] = f39;
                fArr3[5] = f40;
                i18 = i64 + 1;
                i16 = 6;
                c12 = 'm';
                c13 = aVarArr[i64].f5208a;
                aVarArr2 = aVarArr;
            }
        }

        public a(a aVar) {
            this.f5208a = aVar.f5208a;
            float[] fArr = aVar.f5209b;
            this.f5209b = d.b(fArr, fArr.length);
        }
    }
}
