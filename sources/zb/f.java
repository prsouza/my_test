package zb;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14284a = (e.f14280c && e.f14279b ? new d() : new b());

    public static abstract class a {
        public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i10);

        public abstract int b(byte[] bArr, int i, int i10);
    }

    public static final class b extends a {
        public final int a(CharSequence charSequence, byte[] bArr, int i, int i10) {
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
                    throw new c(i15 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i11 = i15 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i11)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i16);
                } else {
                    throw new c(i15, length);
                }
                i16 = i12;
                i15++;
            }
            return i16;
        }

        public final int b(byte[] bArr, int i, int i10) {
            while (r7 < i10 && bArr[r7] >= 0) {
                i = r7 + 1;
            }
            if (r7 < i10) {
                while (r7 < i10) {
                    int i11 = r7 + 1;
                    byte b10 = bArr[r7];
                    if (b10 < 0) {
                        if (b10 >= -32) {
                            if (b10 < -16) {
                                if (i11 < i10 - 1) {
                                    int i12 = i11 + 1;
                                    byte b11 = bArr[i11];
                                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                                        r7 = i12 + 1;
                                        if (bArr[i12] > -65) {
                                        }
                                    }
                                }
                            } else if (i11 < i10 - 2) {
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
                            return f.d(bArr, i11, i10);
                        } else if (i11 >= i10) {
                            return b10;
                        } else {
                            if (b10 >= -62) {
                                r7 = i11 + 1;
                                if (bArr[i11] > -65) {
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

    public static class c extends IllegalArgumentException {
        public c(int i, int i10) {
            super(androidx.activity.result.d.b("Unpaired surrogate at index ", i, " of ", i10));
        }
    }

    public static final class d extends a {
        public static int c(byte[] bArr, int i, long j10, int i10) {
            if (i10 == 0) {
                a aVar = f.f14284a;
                if (i > -12) {
                    return -1;
                }
                return i;
            } else if (i10 == 1) {
                return f.a(i, e.a(bArr, j10));
            } else {
                if (i10 == 2) {
                    return f.b(i, e.a(bArr, j10), e.a(bArr, j10 + 1));
                }
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[LOOP:1: B:14:0x0039->B:38:0x0102, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x0032, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x0032, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v4 long) = (r4v3 long), (r4v6 long) binds: [B:10:0x0032, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x0032, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                r2 = r24
                r3 = r25
                long r4 = zb.e.f14281d
                long r6 = (long) r2
                long r4 = r4 + r6
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r22.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x014c
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x014c
                r2 = 0
            L_0x001d:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x0032
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0032
                long r11 = r11 + r4
                byte r3 = (byte) r13
                zb.e.d(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001d
            L_0x0032:
                if (r2 != r8) goto L_0x0039
                long r0 = zb.e.f14281d
            L_0x0036:
                long r4 = r4 - r0
                int r0 = (int) r4
                return r0
            L_0x0039:
                if (r2 >= r8) goto L_0x0148
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0050
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x0050
                long r14 = r4 + r11
                byte r13 = (byte) r13
                zb.e.d(r1, r4, r13)
                r4 = r11
                r12 = r14
                r11 = r3
                goto L_0x0102
            L_0x0050:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x007a
                r14 = 2
                long r14 = r6 - r14
                int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r14 > 0) goto L_0x007a
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                zb.e.d(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                zb.e.d(r1, r14, r5)
                r19 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r19
                goto L_0x0102
            L_0x007a:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x0084
                if (r3 >= r13) goto L_0x00b5
            L_0x0084:
                r15 = 3
                long r15 = r6 - r15
                int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r15 > 0) goto L_0x00b5
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                zb.e.d(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                zb.e.d(r1, r14, r5)
                r14 = 1
                long r17 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                zb.e.d(r1, r3, r5)
                r12 = r17
                r4 = 1
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x0102
            L_0x00b5:
                r11 = 4
                long r11 = r6 - r11
                int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r11 > 0) goto L_0x0115
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x010d
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x010c
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                zb.e.d(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                zb.e.d(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                zb.e.d(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                zb.e.d(r1, r14, r2)
                r2 = r3
            L_0x0102:
                int r2 = r2 + 1
                r3 = r11
                r19 = r4
                r4 = r12
                r11 = r19
                goto L_0x0039
            L_0x010c:
                r2 = r3
            L_0x010d:
                zb.f$c r0 = new zb.f$c
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x0115:
                if (r14 > r13) goto L_0x012d
                if (r13 > r3) goto L_0x012d
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0127
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x012d
            L_0x0127:
                zb.f$c r0 = new zb.f$c
                r0.<init>(r2, r8)
                throw r0
            L_0x012d:
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
            L_0x0148:
                long r0 = zb.e.f14281d
                goto L_0x0036
            L_0x014c:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = a.b.q(r10)
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
            throw new UnsupportedOperationException("Method not decompiled: zb.f.d.a(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00dc, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int b(byte[] r22, int r23, int r24) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                r2 = r24
                r3 = r1 | r2
                int r4 = r0.length
                int r4 = r4 - r2
                r3 = r3 | r4
                r6 = 2
                if (r3 < 0) goto L_0x00de
                long r7 = zb.e.f14281d
                long r9 = (long) r1
                long r9 = r9 + r7
                long r1 = (long) r2
                long r7 = r7 + r1
                r1 = -62
                r2 = -16
                r3 = 16
                r11 = 8
                r12 = -96
                r13 = -32
                r14 = -65
                r15 = 1
                long r7 = r7 - r9
                int r7 = (int) r7
                if (r7 >= r3) goto L_0x002a
                r3 = 0
                goto L_0x005e
            L_0x002a:
                int r3 = (int) r9
                r3 = r3 & 7
                r8 = r3
                r4 = r9
            L_0x002f:
                if (r8 <= 0) goto L_0x0040
                long r17 = r4 + r15
                byte r4 = zb.e.a(r0, r4)
                if (r4 >= 0) goto L_0x003b
                int r3 = r3 - r8
                goto L_0x005e
            L_0x003b:
                int r8 = r8 + -1
                r4 = r17
                goto L_0x002f
            L_0x0040:
                int r3 = r7 - r3
            L_0x0042:
                if (r3 < r11) goto L_0x005c
                long r17 = zb.e.e(r0, r4)
                r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r17 = r17 & r19
                r19 = 0
                int r8 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
                if (r8 != 0) goto L_0x005c
                r17 = 8
                long r4 = r4 + r17
                int r3 = r3 + -8
                goto L_0x0042
            L_0x005c:
                int r3 = r7 - r3
            L_0x005e:
                int r7 = r7 - r3
                long r3 = (long) r3
                long r9 = r9 + r3
            L_0x0061:
                r3 = 0
            L_0x0062:
                if (r7 <= 0) goto L_0x0073
                long r3 = r9 + r15
                byte r5 = zb.e.a(r0, r9)
                if (r5 < 0) goto L_0x0071
                int r7 = r7 + -1
                r9 = r3
                r3 = r5
                goto L_0x0062
            L_0x0071:
                r9 = r3
                r3 = r5
            L_0x0073:
                if (r7 != 0) goto L_0x0078
                r5 = 0
                goto L_0x00dd
            L_0x0078:
                int r7 = r7 + -1
                if (r3 >= r13) goto L_0x008f
                if (r7 != 0) goto L_0x0080
                r5 = r3
                goto L_0x00dd
            L_0x0080:
                int r7 = r7 + -1
                if (r3 < r1) goto L_0x00dc
                long r3 = r9 + r15
                byte r5 = zb.e.a(r0, r9)
                if (r5 <= r14) goto L_0x008d
                goto L_0x00dc
            L_0x008d:
                r9 = r3
                goto L_0x0061
            L_0x008f:
                if (r3 >= r2) goto L_0x00b1
                if (r7 >= r6) goto L_0x0094
                goto L_0x00b4
            L_0x0094:
                int r7 = r7 + -2
                long r4 = r9 + r15
                byte r8 = zb.e.a(r0, r9)
                if (r8 > r14) goto L_0x00dc
                if (r3 != r13) goto L_0x00a2
                if (r8 < r12) goto L_0x00dc
            L_0x00a2:
                r9 = -19
                if (r3 != r9) goto L_0x00a8
                if (r8 >= r12) goto L_0x00dc
            L_0x00a8:
                long r9 = r4 + r15
                byte r3 = zb.e.a(r0, r4)
                if (r3 <= r14) goto L_0x0061
                goto L_0x00dc
            L_0x00b1:
                r4 = 3
                if (r7 >= r4) goto L_0x00b9
            L_0x00b4:
                int r5 = c(r0, r3, r9, r7)
                goto L_0x00dd
            L_0x00b9:
                int r7 = r7 + -3
                long r4 = r9 + r15
                byte r8 = zb.e.a(r0, r9)
                if (r8 > r14) goto L_0x00dc
                int r3 = r3 << 28
                int r8 = r8 + 112
                int r8 = r8 + r3
                int r3 = r8 >> 30
                if (r3 != 0) goto L_0x00dc
                long r8 = r4 + r15
                byte r3 = zb.e.a(r0, r4)
                if (r3 > r14) goto L_0x00dc
                long r3 = r8 + r15
                byte r5 = zb.e.a(r0, r8)
                if (r5 <= r14) goto L_0x008d
            L_0x00dc:
                r5 = -1
            L_0x00dd:
                return r5
            L_0x00de:
                java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5 = 0
                r4[r5] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
                r1 = 1
                r4[r1] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
                r4[r6] = r0
                java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r0 = java.lang.String.format(r0, r4)
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: zb.f.d.b(byte[], int, int):int");
        }
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

    public static int c(CharSequence charSequence) {
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
                                throw new c(i10, length2);
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
        StringBuilder q10 = a.b.q("UTF-8 length does not fit in int: ");
        q10.append(((long) i11) + 4294967296L);
        throw new IllegalArgumentException(q10.toString());
    }

    public static int d(byte[] bArr, int i, int i10) {
        byte b10 = bArr[i - 1];
        int i11 = i10 - i;
        if (i11 != 0) {
            if (i11 == 1) {
                return a(b10, bArr[i]);
            }
            if (i11 == 2) {
                return b(b10, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        } else if (b10 > -12) {
            return -1;
        } else {
            return b10;
        }
    }
}
