package i7;

public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6351a;

    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i) throws a0 {
            if (!d(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !d(b12) && !d(b13)) {
                    byte b14 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i] = (char) ((b14 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((b14 & 1023) + 56320);
                    return;
                }
            }
            throw a0.c();
        }

        public static void b(byte b10, byte b11, char[] cArr, int i) throws a0 {
            if (b10 < -62 || d(b11)) {
                throw a0.c();
            }
            cArr[i] = (char) (((b10 & 31) << 6) | (b11 & 63));
        }

        public static void c(byte b10, byte b11, byte b12, char[] cArr, int i) throws a0 {
            if (d(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || d(b12)))) {
                throw a0.c();
            }
            cArr[i] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static boolean d(byte b10) {
            return b10 > -65;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i, int i10) throws a0;

        public abstract int b(CharSequence charSequence, byte[] bArr, int i, int i10);

        public abstract int c(byte[] bArr, int i, int i10);
    }

    public static final class c extends b {
        public final String a(byte[] bArr, int i, int i10) throws a0 {
            if ((i | i10 | ((bArr.length - i) - i10)) >= 0) {
                int i11 = i + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (r13 < i11) {
                    byte b10 = bArr[r13];
                    if (!(b10 >= 0)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i12] = (char) b10;
                    i12++;
                }
                int i13 = i12;
                while (r13 < i11) {
                    int i14 = r13 + 1;
                    byte b11 = bArr[r13];
                    if (b11 >= 0) {
                        int i15 = i13 + 1;
                        cArr[i13] = (char) b11;
                        while (i14 < i11) {
                            byte b12 = bArr[i14];
                            if (!(b12 >= 0)) {
                                break;
                            }
                            i14++;
                            cArr[i15] = (char) b12;
                            i15++;
                        }
                        r13 = i14;
                        i13 = i15;
                    } else {
                        if (!(b11 < -32)) {
                            if (b11 < -16) {
                                if (i14 < i11 - 1) {
                                    int i16 = i14 + 1;
                                    a.c(b11, bArr[i14], bArr[i16], cArr, i13);
                                    r13 = i16 + 1;
                                    i13++;
                                } else {
                                    throw a0.c();
                                }
                            } else if (i14 < i11 - 2) {
                                int i17 = i14 + 1;
                                byte b13 = bArr[i14];
                                int i18 = i17 + 1;
                                a.a(b11, b13, bArr[i17], bArr[i18], cArr, i13);
                                r13 = i18 + 1;
                                i13 = i13 + 1 + 1;
                            } else {
                                throw a0.c();
                            }
                        } else if (i14 < i11) {
                            a.b(b11, bArr[i14], cArr, i13);
                            r13 = i14 + 1;
                            i13++;
                        } else {
                            throw a0.c();
                        }
                    }
                }
                return new String(cArr, 0, i13);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i10)}));
        }

        public final int b(CharSequence charSequence, byte[] bArr, int i, int i10) {
            int i11;
            int i12;
            int i13;
            char charAt;
            int length = charSequence.length();
            int i14 = i10 + i;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i) < i14 && (charAt = charSequence.charAt(i15)) < 128) {
                bArr[i13] = (byte) charAt;
                i15++;
            }
            if (i15 == length) {
                return i + length;
            }
            int i16 = i + i15;
            while (i15 < length) {
                char charAt2 = charSequence.charAt(i15);
                if (charAt2 < 128 && i16 < i14) {
                    i12 = i16 + 1;
                    bArr[i16] = (byte) charAt2;
                } else if (charAt2 < 2048 && i16 <= i14 - 2) {
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) ((charAt2 >>> 6) | 960);
                    i16 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 & '?') | 128);
                    i15++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i16 <= i14 - 3) {
                    int i18 = i16 + 1;
                    bArr[i16] = (byte) ((charAt2 >>> 12) | 480);
                    int i19 = i18 + 1;
                    bArr[i18] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i12 = i19 + 1;
                    bArr[i19] = (byte) ((charAt2 & '?') | 128);
                } else if (i16 <= i14 - 4) {
                    int i20 = i15 + 1;
                    if (i20 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i20);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i21 = i16 + 1;
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            int i22 = i21 + 1;
                            bArr[i21] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i23 = i22 + 1;
                            bArr[i22] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 = i23 + 1;
                            bArr[i23] = (byte) ((codePoint & 63) | 128);
                            i15 = i20;
                            i15++;
                        } else {
                            i15 = i20;
                        }
                    }
                    throw new d(i15 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i11 = i15 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i11)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i16);
                } else {
                    throw new d(i15, length);
                }
                i16 = i12;
                i15++;
            }
            return i16;
        }

        public final int c(byte[] bArr, int i, int i10) {
            while (r7 < i10 && bArr[r7] >= 0) {
                i = r7 + 1;
            }
            if (r7 < i10) {
                while (r7 < i10) {
                    int i11 = r7 + 1;
                    byte b10 = bArr[r7];
                    if (b10 < 0) {
                        if (b10 < -32) {
                            if (i11 >= i10) {
                                return b10;
                            }
                            if (b10 >= -62) {
                                r7 = i11 + 1;
                                if (bArr[i11] > -65) {
                                }
                            }
                        } else if (b10 < -16) {
                            if (i11 >= i10 - 1) {
                                return q1.c(bArr, i11, i10);
                            }
                            int i12 = i11 + 1;
                            byte b11 = bArr[i11];
                            if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                                r7 = i12 + 1;
                                if (bArr[i12] > -65) {
                                }
                            }
                        } else if (i11 >= i10 - 2) {
                            return q1.c(bArr, i11, i10);
                        } else {
                            int i13 = i11 + 1;
                            byte b12 = bArr[i11];
                            if (b12 <= -65) {
                                if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                                    int i14 = i13 + 1;
                                    if (bArr[i13] <= -65) {
                                        i11 = i14 + 1;
                                        if (bArr[i14] > -65) {
                                        }
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    r7 = i11;
                }
            }
            return 0;
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i, int i10) {
            super(androidx.activity.result.d.b("Unpaired surrogate at index ", i, " of ", i10));
        }
    }

    public static final class e extends b {
        public static int d(byte[] bArr, int i, long j10, int i10) {
            if (i10 == 0) {
                b bVar = q1.f6351a;
                if (i > -12) {
                    return -1;
                }
                return i;
            } else if (i10 == 1) {
                return q1.a(i, p1.i(bArr, j10));
            } else {
                if (i10 == 2) {
                    return q1.b(i, p1.i(bArr, j10), p1.i(bArr, j10 + 1));
                }
                throw new AssertionError();
            }
        }

        public final String a(byte[] bArr, int i, int i10) throws a0 {
            if ((i | i10 | ((bArr.length - i) - i10)) >= 0) {
                int i11 = i + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (r13 < i11) {
                    byte i13 = p1.i(bArr, (long) r13);
                    if (!(i13 >= 0)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i12] = (char) i13;
                    i12++;
                }
                int i14 = i12;
                while (r13 < i11) {
                    int i15 = r13 + 1;
                    byte i16 = p1.i(bArr, (long) r13);
                    if (i16 >= 0) {
                        int i17 = i14 + 1;
                        cArr[i14] = (char) i16;
                        while (i15 < i11) {
                            byte i18 = p1.i(bArr, (long) i15);
                            if (!(i18 >= 0)) {
                                break;
                            }
                            i15++;
                            cArr[i17] = (char) i18;
                            i17++;
                        }
                        r13 = i15;
                        i14 = i17;
                    } else {
                        if (!(i16 < -32)) {
                            if (i16 < -16) {
                                if (i15 < i11 - 1) {
                                    int i19 = i15 + 1;
                                    a.c(i16, p1.i(bArr, (long) i15), p1.i(bArr, (long) i19), cArr, i14);
                                    r13 = i19 + 1;
                                    i14++;
                                } else {
                                    throw a0.c();
                                }
                            } else if (i15 < i11 - 2) {
                                int i20 = i15 + 1;
                                byte i21 = p1.i(bArr, (long) i15);
                                int i22 = i20 + 1;
                                a.a(i16, i21, p1.i(bArr, (long) i20), p1.i(bArr, (long) i22), cArr, i14);
                                r13 = i22 + 1;
                                i14 = i14 + 1 + 1;
                            } else {
                                throw a0.c();
                            }
                        } else if (i15 < i11) {
                            a.b(i16, p1.i(bArr, (long) i15), cArr, i14);
                            r13 = i15 + 1;
                            i14++;
                        } else {
                            throw a0.c();
                        }
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i10)}));
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00f3, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v4 long) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int b(java.lang.CharSequence r20, byte[] r21, int r22, int r23) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                r3 = r23
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r20.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0135
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0135
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                i7.p1.q(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0133
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0048
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x0048
                long r14 = r4 + r11
                byte r13 = (byte) r13
                i7.p1.q(r1, r4, r13)
                r4 = r14
                goto L_0x00f3
            L_0x0048:
                r3 = 2048(0x800, float:2.87E-42)
                if (r13 >= r3) goto L_0x0071
                r14 = 2
                long r14 = r6 - r14
                int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r3 > 0) goto L_0x0071
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                i7.p1.q(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                i7.p1.q(r1, r14, r5)
            L_0x0068:
                r5 = 128(0x80, float:1.794E-43)
                r17 = r3
                r3 = r5
                r4 = r17
                goto L_0x00f3
            L_0x0071:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007b
                if (r3 >= r13) goto L_0x00a6
            L_0x007b:
                r15 = 3
                long r15 = r6 - r15
                int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r15 > 0) goto L_0x00a6
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                i7.p1.q(r1, r4, r3)
                long r11 = r11 + r14
                int r3 = r13 >>> 6
                r3 = r3 & 63
                r3 = r3 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                i7.p1.q(r1, r14, r3)
                r3 = 1
                long r3 = r3 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                i7.p1.q(r1, r11, r5)
                r11 = 1
                goto L_0x0068
            L_0x00a6:
                r11 = 4
                long r11 = r6 - r11
                int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r11 > 0) goto L_0x0100
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x00f8
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x00f7
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                i7.p1.q(r1, r4, r15)
                long r11 = r11 + r13
                int r4 = r2 >>> 12
                r4 = r4 & 63
                r5 = 128(0x80, float:1.794E-43)
                r4 = r4 | 128(0x80, float:1.794E-43)
                byte r4 = (byte) r4
                i7.p1.q(r1, r13, r4)
                r13 = 1
                long r13 = r13 + r11
                int r4 = r2 >>> 6
                r4 = r4 & 63
                r4 = r4 | r5
                byte r4 = (byte) r4
                i7.p1.q(r1, r11, r4)
                r11 = 1
                long r15 = r13 + r11
                r2 = r2 & 63
                r2 = r2 | r5
                byte r2 = (byte) r2
                i7.p1.q(r1, r13, r2)
                r2 = r3
                r3 = r5
                r4 = r15
            L_0x00f3:
                int r2 = r2 + 1
                goto L_0x0033
            L_0x00f7:
                r2 = r3
            L_0x00f8:
                i7.q1$d r0 = new i7.q1$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x0100:
                if (r14 > r13) goto L_0x0118
                if (r13 > r3) goto L_0x0118
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0112
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0118
            L_0x0112:
                i7.q1$d r0 = new i7.q1$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0118:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0133:
                int r0 = (int) r4
                return r0
            L_0x0135:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = a.a.d(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.q1.e.b(java.lang.CharSequence, byte[], int, int):int");
        }

        public final int c(byte[] bArr, int i, int i10) {
            int i11;
            long j10;
            byte[] bArr2 = bArr;
            int i12 = i;
            int i13 = i10;
            if ((i12 | i13 | (bArr2.length - i13)) >= 0) {
                long j11 = (long) i12;
                int i14 = (int) (((long) i13) - j11);
                if (i14 >= 16) {
                    long j12 = j11;
                    i11 = 0;
                    while (true) {
                        if (i11 >= i14) {
                            i11 = i14;
                            break;
                        }
                        long j13 = j12 + 1;
                        if (p1.i(bArr2, j12) < 0) {
                            break;
                        }
                        i11++;
                        j12 = j13;
                    }
                } else {
                    i11 = 0;
                }
                int i15 = i14 - i11;
                long j14 = j11 + ((long) i11);
                while (true) {
                    byte b10 = 0;
                    while (true) {
                        if (i15 <= 0) {
                            break;
                        }
                        long j15 = j14 + 1;
                        b10 = p1.i(bArr2, j14);
                        if (b10 < 0) {
                            j14 = j15;
                            break;
                        }
                        i15--;
                        j14 = j15;
                    }
                    if (i15 == 0) {
                        return 0;
                    }
                    int i16 = i15 - 1;
                    if (b10 >= -32) {
                        if (b10 >= -16) {
                            if (i16 >= 3) {
                                i15 = i16 - 3;
                                long j16 = j14 + 1;
                                byte i17 = p1.i(bArr2, j14);
                                if (i17 > -65) {
                                    break;
                                }
                                if ((((i17 + 112) + (b10 << 28)) >> 30) != 0) {
                                    break;
                                }
                                long j17 = j16 + 1;
                                if (p1.i(bArr2, j16) > -65) {
                                    break;
                                }
                                j10 = j17 + 1;
                                if (p1.i(bArr2, j17) > -65) {
                                    break;
                                }
                            } else {
                                return d(bArr2, b10, j14, i16);
                            }
                        } else if (i16 >= 2) {
                            i15 = i16 - 2;
                            long j18 = j14 + 1;
                            byte i18 = p1.i(bArr2, j14);
                            if (i18 > -65 || ((b10 == -32 && i18 < -96) || (b10 == -19 && i18 >= -96))) {
                                break;
                            }
                            j14 = j18 + 1;
                            if (p1.i(bArr2, j18) > -65) {
                                break;
                            }
                        } else {
                            return d(bArr2, b10, j14, i16);
                        }
                    } else if (i16 != 0) {
                        i15 = i16 - 1;
                        if (b10 < -62) {
                            break;
                        }
                        j10 = j14 + 1;
                        if (p1.i(bArr2, j14) > -65) {
                            break;
                        }
                    } else {
                        return b10;
                    }
                    j14 = j10;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i), Integer.valueOf(i10)}));
        }
    }

    static {
        b bVar;
        if (!(p1.f6348f && p1.f6347e) || d.a()) {
            bVar = new c();
        } else {
            bVar = new e();
        }
        f6351a = bVar;
    }

    public static int a(int i, int i10) {
        if (i > -12 || i10 > -65) {
            return -1;
        }
        return i ^ (i10 << 8);
    }

    public static int b(int i, int i10, int i11) {
        if (i > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i ^ (i10 << 8)) ^ (i11 << 16);
    }

    public static int c(byte[] bArr, int i, int i10) {
        byte b10 = bArr[i - 1];
        int i11 = i10 - i;
        if (i11 == 0) {
            if (b10 > -12) {
                b10 = -1;
            }
            return b10;
        } else if (i11 == 1) {
            byte b11 = bArr[i];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return b10 ^ (b11 << 8);
        } else if (i11 == 2) {
            byte b12 = bArr[i];
            byte b13 = bArr[i + 1];
            if (b10 > -12 || b12 > -65 || b13 > -65) {
                return -1;
            }
            return ((b12 << 8) ^ b10) ^ (b13 << 16);
        } else {
            throw new AssertionError();
        }
    }

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new d(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        StringBuilder d10 = a.a.d("UTF-8 length does not fit in int: ");
        d10.append(((long) i11) + 4294967296L);
        throw new IllegalArgumentException(d10.toString());
    }

    public static boolean e(byte[] bArr, int i, int i10) {
        return f6351a.c(bArr, i, i10) == 0;
    }
}
