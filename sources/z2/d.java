package z2;

import a.a;
import java.io.EOFException;
import java.io.IOException;
import uf.e;
import uf.h;
import uf.i;
import uf.v;
import z2.c;

public final class d extends c {
    public static final i A;
    public static final i B;
    public static final i C;
    public static final i D;

    /* renamed from: u  reason: collision with root package name */
    public final h f13777u;

    /* renamed from: v  reason: collision with root package name */
    public final e f13778v;

    /* renamed from: w  reason: collision with root package name */
    public int f13779w = 0;

    /* renamed from: x  reason: collision with root package name */
    public long f13780x;

    /* renamed from: y  reason: collision with root package name */
    public int f13781y;
    public String z;

    static {
        i.a aVar = i.f11956t;
        A = aVar.b("'\\");
        B = aVar.b("\"\\");
        C = aVar.b("{}[]:, \n\t\r\f/\\;#=");
        D = aVar.b("\n\r");
        aVar.b("*/");
    }

    public d(h hVar) {
        this.f13777u = hVar;
        this.f13778v = ((v) hVar).f11989a;
        R(6);
    }

    public final char A0() throws IOException {
        int i;
        int i10;
        if (this.f13777u.v(1)) {
            byte readByte = this.f13778v.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                StringBuilder d10 = a.d("Invalid escape sequence: \\");
                d10.append((char) readByte);
                b0(d10.toString());
                throw null;
            } else if (this.f13777u.v(4)) {
                char c10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    byte y10 = this.f13778v.y((long) i11);
                    char c11 = (char) (c10 << 4);
                    if (y10 < 48 || y10 > 57) {
                        if (y10 >= 97 && y10 <= 102) {
                            i10 = y10 - 97;
                        } else if (y10 < 65 || y10 > 70) {
                            StringBuilder d11 = a.d("\\u");
                            d11.append(this.f13778v.a0(4));
                            b0(d11.toString());
                            throw null;
                        } else {
                            i10 = y10 - 65;
                        }
                        i = i10 + 10;
                    } else {
                        i = y10 - 48;
                    }
                    c10 = (char) (i + c11);
                }
                this.f13778v.skip(4);
                return c10;
            } else {
                StringBuilder d12 = a.d("Unterminated escape sequence at path ");
                d12.append(getPath());
                throw new EOFException(d12.toString());
            }
        } else {
            b0("Unterminated escape sequence");
            throw null;
        }
    }

    public final String B() throws IOException {
        String str;
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 14) {
            str = z0();
        } else if (i == 13) {
            str = y0(B);
        } else if (i == 12) {
            str = y0(A);
        } else if (i == 15) {
            str = this.z;
        } else {
            StringBuilder d10 = a.d("Expected a name but was ");
            d10.append(O());
            d10.append(" at path ");
            d10.append(getPath());
            throw new a(d10.toString());
        }
        this.f13779w = 0;
        this.f13773c[this.f13771a - 1] = str;
        return str;
    }

    public final void B0(i iVar) throws IOException {
        while (true) {
            long d02 = this.f13777u.d0(iVar);
            if (d02 == -1) {
                b0("Unterminated string");
                throw null;
            } else if (this.f13778v.y(d02) == 92) {
                this.f13778v.skip(d02 + 1);
                A0();
            } else {
                this.f13778v.skip(d02 + 1);
                return;
            }
        }
    }

    public final void C0() throws IOException {
        long d02 = this.f13777u.d0(C);
        e eVar = this.f13778v;
        if (d02 == -1) {
            d02 = eVar.f11952b;
        }
        eVar.skip(d02);
    }

    public final String E() throws IOException {
        String str;
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 10) {
            str = z0();
        } else if (i == 9) {
            str = y0(B);
        } else if (i == 8) {
            str = y0(A);
        } else if (i == 11) {
            str = this.z;
            this.z = null;
        } else if (i == 16) {
            str = Long.toString(this.f13780x);
        } else if (i == 17) {
            str = this.f13778v.a0((long) this.f13781y);
        } else {
            StringBuilder d10 = a.d("Expected a string but was ");
            d10.append(O());
            d10.append(" at path ");
            d10.append(getPath());
            throw new a(d10.toString());
        }
        this.f13779w = 0;
        int[] iArr = this.f13774s;
        int i10 = this.f13771a - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final c.b O() throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        switch (i) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int S(c.a aVar) throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return v0(this.z, aVar);
        }
        int l10 = this.f13777u.l(aVar.f13776b);
        if (l10 != -1) {
            this.f13779w = 0;
            this.f13773c[this.f13771a - 1] = aVar.f13775a[l10];
            return l10;
        }
        String str = this.f13773c[this.f13771a - 1];
        String B2 = B();
        int v02 = v0(B2, aVar);
        if (v02 == -1) {
            this.f13779w = 15;
            this.z = B2;
            this.f13773c[this.f13771a - 1] = str;
        }
        return v02;
    }

    public final void T() throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 14) {
            C0();
        } else if (i == 13) {
            B0(B);
        } else if (i == 12) {
            B0(A);
        } else if (i != 15) {
            StringBuilder d10 = a.d("Expected a name but was ");
            d10.append(O());
            d10.append(" at path ");
            d10.append(getPath());
            throw new a(d10.toString());
        }
        this.f13779w = 0;
        this.f13773c[this.f13771a - 1] = "null";
    }

    public final void a() throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 3) {
            R(1);
            this.f13774s[this.f13771a - 1] = 0;
            this.f13779w = 0;
            return;
        }
        StringBuilder d10 = a.d("Expected BEGIN_ARRAY but was ");
        d10.append(O());
        d10.append(" at path ");
        d10.append(getPath());
        throw new a(d10.toString());
    }

    public final void a0() throws IOException {
        int i = 0;
        do {
            int i10 = this.f13779w;
            if (i10 == 0) {
                i10 = p0();
            }
            if (i10 == 3) {
                R(1);
            } else if (i10 == 1) {
                R(3);
            } else {
                if (i10 == 4) {
                    i--;
                    if (i >= 0) {
                        this.f13771a--;
                    } else {
                        StringBuilder d10 = a.d("Expected a value but was ");
                        d10.append(O());
                        d10.append(" at path ");
                        d10.append(getPath());
                        throw new a(d10.toString());
                    }
                } else if (i10 == 2) {
                    i--;
                    if (i >= 0) {
                        this.f13771a--;
                    } else {
                        StringBuilder d11 = a.d("Expected a value but was ");
                        d11.append(O());
                        d11.append(" at path ");
                        d11.append(getPath());
                        throw new a(d11.toString());
                    }
                } else if (i10 == 14 || i10 == 10) {
                    C0();
                } else if (i10 == 9 || i10 == 13) {
                    B0(B);
                } else if (i10 == 8 || i10 == 12) {
                    B0(A);
                } else if (i10 == 17) {
                    this.f13778v.skip((long) this.f13781y);
                } else if (i10 == 18) {
                    StringBuilder d12 = a.d("Expected a value but was ");
                    d12.append(O());
                    d12.append(" at path ");
                    d12.append(getPath());
                    throw new a(d12.toString());
                }
                this.f13779w = 0;
            }
            i++;
            this.f13779w = 0;
        } while (i != 0);
        int[] iArr = this.f13774s;
        int i11 = this.f13771a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f13773c[i11 - 1] = "null";
    }

    public final void c() throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 1) {
            R(3);
            this.f13779w = 0;
            return;
        }
        StringBuilder d10 = a.d("Expected BEGIN_OBJECT but was ");
        d10.append(O());
        d10.append(" at path ");
        d10.append(getPath());
        throw new a(d10.toString());
    }

    public final void close() throws IOException {
        this.f13779w = 0;
        this.f13772b[0] = 8;
        this.f13771a = 1;
        this.f13778v.a();
        this.f13777u.close();
    }

    public final void e() throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 4) {
            int i10 = this.f13771a - 1;
            this.f13771a = i10;
            int[] iArr = this.f13774s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.f13779w = 0;
            return;
        }
        StringBuilder d10 = a.d("Expected END_ARRAY but was ");
        d10.append(O());
        d10.append(" at path ");
        d10.append(getPath());
        throw new a(d10.toString());
    }

    public final void f() throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 2) {
            int i10 = this.f13771a - 1;
            this.f13771a = i10;
            this.f13773c[i10] = null;
            int[] iArr = this.f13774s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.f13779w = 0;
            return;
        }
        StringBuilder d10 = a.d("Expected END_OBJECT but was ");
        d10.append(O());
        d10.append(" at path ");
        d10.append(getPath());
        throw new a(d10.toString());
    }

    public final void f0() throws IOException {
        b0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ab, code lost:
        if (w0(r2) != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ad, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01ae, code lost:
        if (r5 != r2) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01b0, code lost:
        if (r6 == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01b6, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b8, code lost:
        if (r9 == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01be, code lost:
        if (r7 != 0) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01c0, code lost:
        if (r9 != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c2, code lost:
        if (r9 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c5, code lost:
        r7 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c6, code lost:
        r0.f13780x = r7;
        r0.f13778v.skip((long) r1);
        r14 = 16;
        r0.f13779w = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01d3, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01d4, code lost:
        if (r5 == r2) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d6, code lost:
        if (r5 == 4) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d9, code lost:
        if (r5 != 7) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01db, code lost:
        r0.f13781y = r1;
        r14 = 17;
        r0.f13779w = 17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0124 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int p0() throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f13772b
            int r2 = r0.f13771a
            int r3 = r2 + -1
            r3 = r1[r3]
            r5 = 34
            r6 = 93
            r7 = 59
            r8 = 44
            r9 = 3
            r10 = 7
            r11 = 6
            r12 = 5
            r13 = 2
            r14 = 0
            r15 = 4
            r16 = 0
            r4 = 1
            if (r3 != r4) goto L_0x0022
            int r2 = r2 - r4
            r1[r2] = r13
            goto L_0x0082
        L_0x0022:
            if (r3 != r13) goto L_0x0040
            int r1 = r0.x0(r4)
            uf.e r2 = r0.f13778v
            r2.readByte()
            if (r1 == r8) goto L_0x0082
            if (r1 == r7) goto L_0x003c
            if (r1 != r6) goto L_0x0036
            r0.f13779w = r15
            return r15
        L_0x0036:
            java.lang.String r1 = "Unterminated array"
            r0.b0(r1)
            throw r16
        L_0x003c:
            r17.f0()
            throw r16
        L_0x0040:
            if (r3 == r9) goto L_0x0269
            if (r3 != r12) goto L_0x0046
            goto L_0x0269
        L_0x0046:
            if (r3 != r15) goto L_0x0066
            int r2 = r2 - r4
            r1[r2] = r12
            int r1 = r0.x0(r4)
            uf.e r2 = r0.f13778v
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x0082
            r2 = 61
            if (r1 == r2) goto L_0x0062
            java.lang.String r1 = "Expected ':'"
            r0.b0(r1)
            throw r16
        L_0x0062:
            r17.f0()
            throw r16
        L_0x0066:
            if (r3 != r11) goto L_0x006c
            int r2 = r2 - r4
            r1[r2] = r10
            goto L_0x0082
        L_0x006c:
            if (r3 != r10) goto L_0x007e
            int r1 = r0.x0(r14)
            r2 = -1
            if (r1 != r2) goto L_0x007a
            r1 = 18
            r0.f13779w = r1
            return r1
        L_0x007a:
            r17.f0()
            throw r16
        L_0x007e:
            r1 = 8
            if (r3 == r1) goto L_0x0261
        L_0x0082:
            int r1 = r0.x0(r4)
            if (r1 == r5) goto L_0x0257
            r2 = 39
            if (r1 == r2) goto L_0x0253
            if (r1 == r8) goto L_0x0243
            if (r1 == r7) goto L_0x0243
            r2 = 91
            if (r1 == r2) goto L_0x023a
            if (r1 == r6) goto L_0x0230
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0228
            uf.e r1 = r0.f13778v
            r2 = 0
            byte r1 = r1.y(r2)
            r5 = 116(0x74, float:1.63E-43)
            if (r1 == r5) goto L_0x00cc
            r5 = 84
            if (r1 != r5) goto L_0x00ab
            goto L_0x00cc
        L_0x00ab:
            r5 = 102(0x66, float:1.43E-43)
            if (r1 == r5) goto L_0x00c6
            r5 = 70
            if (r1 != r5) goto L_0x00b4
            goto L_0x00c6
        L_0x00b4:
            r5 = 110(0x6e, float:1.54E-43)
            if (r1 == r5) goto L_0x00c0
            r5 = 78
            if (r1 != r5) goto L_0x00bd
            goto L_0x00c0
        L_0x00bd:
            r6 = r14
            goto L_0x0122
        L_0x00c0:
            java.lang.String r1 = "null"
            java.lang.String r5 = "NULL"
            r6 = r10
            goto L_0x00d1
        L_0x00c6:
            java.lang.String r1 = "false"
            java.lang.String r5 = "FALSE"
            r6 = r11
            goto L_0x00d1
        L_0x00cc:
            java.lang.String r1 = "true"
            java.lang.String r5 = "TRUE"
            r6 = r12
        L_0x00d1:
            int r7 = r1.length()
            r8 = r4
        L_0x00d6:
            if (r8 >= r7) goto L_0x0101
            uf.h r14 = r0.f13777u
            int r10 = r8 + 1
            long r11 = (long) r10
            boolean r11 = r14.v(r11)
            if (r11 != 0) goto L_0x00e5
        L_0x00e3:
            r6 = 0
            goto L_0x0122
        L_0x00e5:
            uf.e r11 = r0.f13778v
            r14 = r10
            long r9 = (long) r8
            byte r9 = r11.y(r9)
            char r10 = r1.charAt(r8)
            if (r9 == r10) goto L_0x00fa
            char r8 = r5.charAt(r8)
            if (r9 == r8) goto L_0x00fa
            goto L_0x00e3
        L_0x00fa:
            r8 = r14
            r9 = 3
            r10 = 7
            r11 = 6
            r12 = 5
            r14 = 0
            goto L_0x00d6
        L_0x0101:
            uf.h r1 = r0.f13777u
            int r5 = r7 + 1
            long r8 = (long) r5
            boolean r1 = r1.v(r8)
            if (r1 == 0) goto L_0x011a
            uf.e r1 = r0.f13778v
            long r8 = (long) r7
            byte r1 = r1.y(r8)
            boolean r1 = r0.w0(r1)
            if (r1 == 0) goto L_0x011a
            goto L_0x00e3
        L_0x011a:
            uf.e r1 = r0.f13778v
            long r7 = (long) r7
            r1.skip(r7)
            r0.f13779w = r6
        L_0x0122:
            if (r6 == 0) goto L_0x0125
            return r6
        L_0x0125:
            r7 = r2
            r6 = r4
            r1 = 0
            r5 = 0
            r9 = 0
        L_0x012a:
            uf.h r10 = r0.f13777u
            int r11 = r1 + 1
            long r2 = (long) r11
            boolean r2 = r10.v(r2)
            if (r2 != 0) goto L_0x0138
            r2 = r13
            goto L_0x01ae
        L_0x0138:
            uf.e r2 = r0.f13778v
            long r12 = (long) r1
            byte r2 = r2.y(r12)
            r12 = 43
            if (r2 == r12) goto L_0x01ff
            r12 = 69
            if (r2 == r12) goto L_0x01f5
            r12 = 101(0x65, float:1.42E-43)
            if (r2 == r12) goto L_0x01f5
            r12 = 45
            if (r2 == r12) goto L_0x01e9
            r12 = 46
            if (r2 == r12) goto L_0x01e2
            r12 = 48
            if (r2 < r12) goto L_0x01a7
            r12 = 57
            if (r2 <= r12) goto L_0x015c
            goto L_0x01a7
        L_0x015c:
            if (r5 == r4) goto L_0x019d
            if (r5 != 0) goto L_0x0161
            goto L_0x019d
        L_0x0161:
            r1 = 2
            if (r5 != r1) goto L_0x018b
            r12 = 0
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x016c
            goto L_0x020c
        L_0x016c:
            r12 = 10
            long r12 = r12 * r7
            int r2 = r2 + -48
            long r1 = (long) r2
            long r12 = r12 - r1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0185
            if (r1 != 0) goto L_0x0183
            int r1 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r1 = 0
            goto L_0x0186
        L_0x0185:
            r1 = r4
        L_0x0186:
            r1 = r1 & r6
            r6 = r1
            r7 = r12
            r3 = 6
            goto L_0x01a4
        L_0x018b:
            r1 = 3
            if (r5 != r1) goto L_0x0193
            r5 = r15
            r2 = 7
            r3 = 6
            goto L_0x0206
        L_0x0193:
            r1 = 5
            r3 = 6
            if (r5 == r1) goto L_0x0199
            if (r5 != r3) goto L_0x01a4
        L_0x0199:
            r2 = 7
            r5 = 7
            goto L_0x0206
        L_0x019d:
            r3 = 6
            int r2 = r2 + -48
            int r1 = -r2
            long r1 = (long) r1
            r7 = r1
            r5 = 2
        L_0x01a4:
            r2 = 7
            goto L_0x0206
        L_0x01a7:
            boolean r2 = r0.w0(r2)
            if (r2 != 0) goto L_0x020c
            r2 = 2
        L_0x01ae:
            if (r5 != r2) goto L_0x01d4
            if (r6 == 0) goto L_0x01d3
            r2 = -9223372036854775808
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x01ba
            if (r9 == 0) goto L_0x01d3
        L_0x01ba:
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x01c2
            if (r9 != 0) goto L_0x01d3
        L_0x01c2:
            if (r9 == 0) goto L_0x01c5
            goto L_0x01c6
        L_0x01c5:
            long r7 = -r7
        L_0x01c6:
            r0.f13780x = r7
            uf.e r2 = r0.f13778v
            long r3 = (long) r1
            r2.skip(r3)
            r14 = 16
            r0.f13779w = r14
            goto L_0x020d
        L_0x01d3:
            r2 = 2
        L_0x01d4:
            if (r5 == r2) goto L_0x01db
            if (r5 == r15) goto L_0x01db
            r2 = 7
            if (r5 != r2) goto L_0x020c
        L_0x01db:
            r0.f13781y = r1
            r14 = 17
            r0.f13779w = r14
            goto L_0x020d
        L_0x01e2:
            r1 = 2
            r2 = 7
            r3 = 6
            if (r5 != r1) goto L_0x020c
            r1 = 3
            goto L_0x0205
        L_0x01e9:
            r1 = 2
            r2 = 7
            r3 = 6
            if (r5 != 0) goto L_0x01f1
            r5 = r4
            r9 = r5
            goto L_0x0206
        L_0x01f1:
            r13 = 5
            if (r5 != r13) goto L_0x020c
            goto L_0x0204
        L_0x01f5:
            r1 = 2
            r2 = 7
            r3 = 6
            r13 = 5
            if (r5 == r1) goto L_0x01fd
            if (r5 != r15) goto L_0x020c
        L_0x01fd:
            r5 = r13
            goto L_0x0206
        L_0x01ff:
            r2 = 7
            r3 = 6
            r13 = 5
            if (r5 != r13) goto L_0x020c
        L_0x0204:
            r1 = r3
        L_0x0205:
            r5 = r1
        L_0x0206:
            r1 = r11
            r2 = 0
            r13 = 2
            goto L_0x012a
        L_0x020c:
            r14 = 0
        L_0x020d:
            if (r14 == 0) goto L_0x0210
            return r14
        L_0x0210:
            uf.e r1 = r0.f13778v
            r2 = 0
            byte r1 = r1.y(r2)
            boolean r1 = r0.w0(r1)
            if (r1 != 0) goto L_0x0224
            java.lang.String r1 = "Expected value"
            r0.b0(r1)
            throw r16
        L_0x0224:
            r17.f0()
            throw r16
        L_0x0228:
            uf.e r1 = r0.f13778v
            r1.readByte()
            r0.f13779w = r4
            return r4
        L_0x0230:
            if (r3 != r4) goto L_0x0243
            uf.e r1 = r0.f13778v
            r1.readByte()
            r0.f13779w = r15
            return r15
        L_0x023a:
            uf.e r1 = r0.f13778v
            r1.readByte()
            r1 = 3
            r0.f13779w = r1
            return r1
        L_0x0243:
            if (r3 == r4) goto L_0x024f
            r1 = 2
            if (r3 != r1) goto L_0x0249
            goto L_0x024f
        L_0x0249:
            java.lang.String r1 = "Unexpected value"
            r0.b0(r1)
            throw r16
        L_0x024f:
            r17.f0()
            throw r16
        L_0x0253:
            r17.f0()
            throw r16
        L_0x0257:
            uf.e r1 = r0.f13778v
            r1.readByte()
            r1 = 9
            r0.f13779w = r1
            return r1
        L_0x0261:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0269:
            int r2 = r2 - r4
            r1[r2] = r15
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x028e
            int r2 = r0.x0(r4)
            uf.e r6 = r0.f13778v
            r6.readByte()
            if (r2 == r8) goto L_0x028e
            if (r2 == r7) goto L_0x028a
            if (r2 != r1) goto L_0x0284
            r1 = 2
            r0.f13779w = r1
            return r1
        L_0x0284:
            java.lang.String r1 = "Unterminated object"
            r0.b0(r1)
            throw r16
        L_0x028a:
            r17.f0()
            throw r16
        L_0x028e:
            int r2 = r0.x0(r4)
            if (r2 == r5) goto L_0x02b9
            r4 = 39
            if (r2 == r4) goto L_0x02b0
            if (r2 != r1) goto L_0x02ac
            r1 = 5
            if (r3 == r1) goto L_0x02a6
            uf.e r1 = r0.f13778v
            r1.readByte()
            r1 = 2
            r0.f13779w = r1
            return r1
        L_0x02a6:
            java.lang.String r1 = "Expected name"
            r0.b0(r1)
            throw r16
        L_0x02ac:
            r17.f0()
            throw r16
        L_0x02b0:
            uf.e r1 = r0.f13778v
            r1.readByte()
            r17.f0()
            throw r16
        L_0x02b9:
            uf.e r1 = r0.f13778v
            r1.readByte()
            r1 = 13
            r0.f13779w = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.d.p0():int");
    }

    public final boolean s() throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    public final boolean t() throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 5) {
            this.f13779w = 0;
            int[] iArr = this.f13774s;
            int i10 = this.f13771a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        } else if (i == 6) {
            this.f13779w = 0;
            int[] iArr2 = this.f13774s;
            int i11 = this.f13771a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        } else {
            StringBuilder d10 = a.d("Expected a boolean but was ");
            d10.append(O());
            d10.append(" at path ");
            d10.append(getPath());
            throw new a(d10.toString());
        }
    }

    public final String toString() {
        StringBuilder d10 = a.d("JsonReader(");
        d10.append(this.f13777u);
        d10.append(")");
        return d10.toString();
    }

    public final int v0(String str, c.a aVar) {
        int length = aVar.f13775a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f13775a[i])) {
                this.f13779w = 0;
                this.f13773c[this.f13771a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final double w() throws IOException {
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 16) {
            this.f13779w = 0;
            int[] iArr = this.f13774s;
            int i10 = this.f13771a - 1;
            iArr[i10] = iArr[i10] + 1;
            return (double) this.f13780x;
        }
        if (i == 17) {
            this.z = this.f13778v.a0((long) this.f13781y);
        } else if (i == 9) {
            this.z = y0(B);
        } else if (i == 8) {
            this.z = y0(A);
        } else if (i == 10) {
            this.z = z0();
        } else if (i != 11) {
            StringBuilder d10 = a.d("Expected a double but was ");
            d10.append(O());
            d10.append(" at path ");
            d10.append(getPath());
            throw new a(d10.toString());
        }
        this.f13779w = 11;
        try {
            double parseDouble = Double.parseDouble(this.z);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.z = null;
            this.f13779w = 0;
            int[] iArr2 = this.f13774s;
            int i11 = this.f13771a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder d11 = a.d("Expected a double but was ");
            d11.append(this.z);
            d11.append(" at path ");
            d11.append(getPath());
            throw new a(d11.toString());
        }
    }

    public final boolean w0(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f0();
        throw null;
    }

    public final int x0(boolean z10) throws IOException {
        int i = 0;
        while (true) {
            int i10 = i + 1;
            if (this.f13777u.v((long) i10)) {
                byte y10 = this.f13778v.y((long) i);
                if (y10 == 10 || y10 == 32 || y10 == 13 || y10 == 9) {
                    i = i10;
                } else {
                    this.f13778v.skip((long) (i10 - 1));
                    if (y10 == 47) {
                        if (!this.f13777u.v(2)) {
                            return y10;
                        }
                        f0();
                        throw null;
                    } else if (y10 != 35) {
                        return y10;
                    } else {
                        f0();
                        throw null;
                    }
                }
            } else if (!z10) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final int y() throws IOException {
        String str;
        int i = this.f13779w;
        if (i == 0) {
            i = p0();
        }
        if (i == 16) {
            long j10 = this.f13780x;
            int i10 = (int) j10;
            if (j10 == ((long) i10)) {
                this.f13779w = 0;
                int[] iArr = this.f13774s;
                int i11 = this.f13771a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            StringBuilder d10 = a.d("Expected an int but was ");
            d10.append(this.f13780x);
            d10.append(" at path ");
            d10.append(getPath());
            throw new a(d10.toString());
        }
        if (i == 17) {
            this.z = this.f13778v.a0((long) this.f13781y);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = y0(B);
            } else {
                str = y0(A);
            }
            this.z = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f13779w = 0;
                int[] iArr2 = this.f13774s;
                int i12 = this.f13771a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder d11 = a.d("Expected an int but was ");
            d11.append(O());
            d11.append(" at path ");
            d11.append(getPath());
            throw new a(d11.toString());
        }
        this.f13779w = 11;
        try {
            double parseDouble = Double.parseDouble(this.z);
            int i13 = (int) parseDouble;
            if (((double) i13) == parseDouble) {
                this.z = null;
                this.f13779w = 0;
                int[] iArr3 = this.f13774s;
                int i14 = this.f13771a - 1;
                iArr3[i14] = iArr3[i14] + 1;
                return i13;
            }
            StringBuilder d12 = a.d("Expected an int but was ");
            d12.append(this.z);
            d12.append(" at path ");
            d12.append(getPath());
            throw new a(d12.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder d13 = a.d("Expected an int but was ");
            d13.append(this.z);
            d13.append(" at path ");
            d13.append(getPath());
            throw new a(d13.toString());
        }
    }

    public final String y0(i iVar) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long d02 = this.f13777u.d0(iVar);
            if (d02 == -1) {
                b0("Unterminated string");
                throw null;
            } else if (this.f13778v.y(d02) == 92) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f13778v.a0(d02));
                this.f13778v.readByte();
                sb2.append(A0());
            } else if (sb2 == null) {
                String a02 = this.f13778v.a0(d02);
                this.f13778v.readByte();
                return a02;
            } else {
                sb2.append(this.f13778v.a0(d02));
                this.f13778v.readByte();
                return sb2.toString();
            }
        }
    }

    public final String z0() throws IOException {
        long d02 = this.f13777u.d0(C);
        return d02 != -1 ? this.f13778v.a0(d02) : this.f13778v.T();
    }
}
