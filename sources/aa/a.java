package aa;

import ah.v;
import android.support.v4.media.b;
import c3.k;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class a implements Closeable {
    public static final char[] E = ")]}'\n".toCharArray();
    public int[] A;
    public int B;
    public String[] C;
    public int[] D;

    /* renamed from: a  reason: collision with root package name */
    public final Reader f179a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f180b = false;

    /* renamed from: c  reason: collision with root package name */
    public final char[] f181c = new char[1024];

    /* renamed from: s  reason: collision with root package name */
    public int f182s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f183t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f184u = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f185v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f186w = 0;

    /* renamed from: x  reason: collision with root package name */
    public long f187x;

    /* renamed from: y  reason: collision with root package name */
    public int f188y;
    public String z;

    /* renamed from: aa.a$a  reason: collision with other inner class name */
    public class C0001a extends b {
    }

    static {
        b.f729b = new C0001a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.A = iArr;
        this.B = 1;
        iArr[0] = 6;
        this.C = new String[32];
        this.D = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f179a = reader;
    }

    public int A0() {
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void B() {
        if (!this.f180b) {
            c("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    public final char B0() {
        int i;
        int i10;
        if (this.f182s != this.f183t || s(1)) {
            char[] cArr = this.f181c;
            int i11 = this.f182s;
            int i12 = i11 + 1;
            this.f182s = i12;
            char c10 = cArr[i11];
            if (c10 == 10) {
                this.f184u++;
                this.f185v = i12;
            } else if (!(c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\')) {
                if (c10 == 'b') {
                    return 8;
                }
                if (c10 == 'f') {
                    return 12;
                }
                if (c10 == 'n') {
                    return 10;
                }
                if (c10 == 'r') {
                    return 13;
                }
                if (c10 == 't') {
                    return 9;
                }
                if (c10 != 'u') {
                    c("Invalid escape sequence");
                    throw null;
                } else if (i12 + 4 <= this.f183t || s(4)) {
                    char c11 = 0;
                    int i13 = this.f182s;
                    int i14 = i13 + 4;
                    while (i13 < i14) {
                        char c12 = this.f181c[i13];
                        char c13 = (char) (c11 << 4);
                        if (c12 < '0' || c12 > '9') {
                            if (c12 >= 'a' && c12 <= 'f') {
                                i = c12 - 'a';
                            } else if (c12 < 'A' || c12 > 'F') {
                                StringBuilder q10 = a.b.q("\\u");
                                q10.append(new String(this.f181c, this.f182s, 4));
                                throw new NumberFormatException(q10.toString());
                            } else {
                                i = c12 - 'A';
                            }
                            i10 = i + 10;
                        } else {
                            i10 = c12 - '0';
                        }
                        c11 = (char) (i10 + c13);
                        i13++;
                    }
                    this.f182s += 4;
                    return c11;
                } else {
                    c("Unterminated escape sequence");
                    throw null;
                }
            }
            return c10;
        }
        c("Unterminated escape sequence");
        throw null;
    }

    public final void C0() {
        char c10;
        do {
            if (this.f182s < this.f183t || s(1)) {
                char[] cArr = this.f181c;
                int i = this.f182s;
                int i10 = i + 1;
                this.f182s = i10;
                c10 = cArr[i];
                if (c10 == 10) {
                    this.f184u++;
                    this.f185v = i10;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    public void D0() {
        int i;
        char c10;
        int i10 = 0;
        do {
            int i11 = this.f186w;
            if (i11 == 0) {
                i11 = O();
            }
            if (i11 == 3) {
                y(1);
            } else if (i11 == 1) {
                y(3);
            } else if (i11 == 4 || i11 == 2) {
                this.B--;
                i10--;
                this.f186w = 0;
            } else if (i11 == 14 || i11 == 10) {
                while (true) {
                    i = 0;
                    while (true) {
                        int i12 = this.f182s + i;
                        if (i12 < this.f183t) {
                            char c11 = this.f181c[i12];
                            if (!(c11 == 9 || c11 == 10 || c11 == 12 || c11 == 13 || c11 == ' ')) {
                                if (c11 != '#') {
                                    if (c11 != ',') {
                                        if (!(c11 == '/' || c11 == '=')) {
                                            if (!(c11 == '{' || c11 == '}' || c11 == ':')) {
                                                if (c11 != ';') {
                                                    switch (c11) {
                                                        case '[':
                                                        case ']':
                                                            break;
                                                        case '\\':
                                                            break;
                                                        default:
                                                            i++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f182s = i12;
                            if (!s(1)) {
                            }
                        }
                    }
                }
                B();
                this.f182s += i;
                this.f186w = 0;
            } else {
                if (i11 == 8 || i11 == 12) {
                    c10 = '\'';
                } else if (i11 == 9 || i11 == 13) {
                    c10 = '\"';
                } else {
                    if (i11 == 16) {
                        this.f182s += this.f188y;
                    }
                    this.f186w = 0;
                }
                E(c10);
                this.f186w = 0;
            }
            i10++;
            this.f186w = 0;
        } while (i10 != 0);
        int[] iArr = this.D;
        int i13 = this.B - 1;
        iArr[i13] = iArr[i13] + 1;
        this.C[i13] = "null";
    }

    public final void E(char c10) {
        char[] cArr = this.f181c;
        while (true) {
            int i = this.f182s;
            int i10 = this.f183t;
            while (true) {
                if (i < i10) {
                    int i11 = i + 1;
                    char c11 = cArr[i];
                    if (c11 == c10) {
                        this.f182s = i11;
                        return;
                    } else if (c11 == '\\') {
                        this.f182s = i11;
                        B0();
                        break;
                    } else {
                        if (c11 == 10) {
                            this.f184u++;
                            this.f185v = i11;
                        }
                        i = i11;
                    }
                } else {
                    this.f182s = i;
                    if (!s(1)) {
                        c("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0208, code lost:
        if (f(r15) != false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x020a, code lost:
        if (r5 != 2) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x020c, code lost:
        if (r17 == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0212, code lost:
        if (r13 != Long.MIN_VALUE) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0214, code lost:
        if (r16 == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0218, code lost:
        if (r13 != 0) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x021a, code lost:
        if (r16 != false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x021c, code lost:
        if (r16 == false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x021f, code lost:
        r13 = -r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0220, code lost:
        r0.f187x = r13;
        r0.f182s += r7;
        r0.f186w = 15;
        r15 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x022e, code lost:
        if (r5 == 2) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0231, code lost:
        if (r5 == 4) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0234, code lost:
        if (r5 != 7) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0236, code lost:
        r0.f188y = r7;
        r0.f186w = 16;
        r15 = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0171 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int O() {
        /*
            r21 = this;
            r0 = r21
            int[] r1 = r0.A
            int r2 = r0.B
            r3 = 1
            int r2 = r2 - r3
            r4 = r1[r2]
            r5 = 93
            r9 = 59
            r10 = 44
            r11 = 6
            r12 = 3
            r13 = 7
            r14 = 0
            r15 = 0
            r6 = 5
            r7 = 4
            r8 = 2
            if (r4 != r3) goto L_0x001e
            r1[r2] = r8
            goto L_0x00ce
        L_0x001e:
            if (r4 != r8) goto L_0x0038
            int r1 = r0.a(r3)
            if (r1 == r10) goto L_0x00ce
            if (r1 == r9) goto L_0x0033
            if (r1 != r5) goto L_0x002d
            r0.f186w = r7
            return r7
        L_0x002d:
            java.lang.String r1 = "Unterminated array"
            r0.c(r1)
            throw r14
        L_0x0033:
            r21.B()
            goto L_0x00ce
        L_0x0038:
            if (r4 == r12) goto L_0x02c5
            if (r4 != r6) goto L_0x003e
            goto L_0x02c5
        L_0x003e:
            if (r4 != r7) goto L_0x0071
            r1[r2] = r6
            int r1 = r0.a(r3)
            r2 = 58
            if (r1 == r2) goto L_0x00ce
            r2 = 61
            if (r1 != r2) goto L_0x006b
            r21.B()
            int r1 = r0.f182s
            int r2 = r0.f183t
            if (r1 < r2) goto L_0x005d
            boolean r1 = r0.s(r3)
            if (r1 == 0) goto L_0x00ce
        L_0x005d:
            char[] r1 = r0.f181c
            int r2 = r0.f182s
            char r1 = r1[r2]
            r7 = 62
            if (r1 != r7) goto L_0x00ce
            int r2 = r2 + r3
            r0.f182s = r2
            goto L_0x00ce
        L_0x006b:
            java.lang.String r1 = "Expected ':'"
            r0.c(r1)
            throw r14
        L_0x0071:
            if (r4 != r11) goto L_0x00b3
            boolean r1 = r0.f180b
            if (r1 == 0) goto L_0x00ab
            r0.a(r3)
            int r1 = r0.f182s
            int r1 = r1 - r3
            r0.f182s = r1
            char[] r2 = E
            int r7 = r2.length
            int r1 = r1 + r7
            int r7 = r0.f183t
            if (r1 <= r7) goto L_0x008f
            int r1 = r2.length
            boolean r1 = r0.s(r1)
            if (r1 != 0) goto L_0x008f
            goto L_0x00ab
        L_0x008f:
            r1 = r15
        L_0x0090:
            char[] r2 = E
            int r7 = r2.length
            if (r1 >= r7) goto L_0x00a5
            char[] r7 = r0.f181c
            int r14 = r0.f182s
            int r14 = r14 + r1
            char r7 = r7[r14]
            char r2 = r2[r1]
            if (r7 == r2) goto L_0x00a1
            goto L_0x00ab
        L_0x00a1:
            int r1 = r1 + 1
            r14 = 0
            goto L_0x0090
        L_0x00a5:
            int r1 = r0.f182s
            int r2 = r2.length
            int r1 = r1 + r2
            r0.f182s = r1
        L_0x00ab:
            int[] r1 = r0.A
            int r2 = r0.B
            int r2 = r2 - r3
            r1[r2] = r13
            goto L_0x00ce
        L_0x00b3:
            if (r4 != r13) goto L_0x00ca
            int r1 = r0.a(r15)
            r2 = -1
            if (r1 != r2) goto L_0x00c1
            r1 = 17
            r0.f186w = r1
            return r1
        L_0x00c1:
            r21.B()
            int r1 = r0.f182s
            int r1 = r1 - r3
            r0.f182s = r1
            goto L_0x00ce
        L_0x00ca:
            r1 = 8
            if (r4 == r1) goto L_0x02bd
        L_0x00ce:
            int r1 = r0.a(r3)
            r2 = 34
            if (r1 == r2) goto L_0x02b8
            r2 = 39
            if (r1 == r2) goto L_0x02b0
            if (r1 == r10) goto L_0x0297
            if (r1 == r9) goto L_0x0297
            r2 = 91
            if (r1 == r2) goto L_0x0294
            if (r1 == r5) goto L_0x028d
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0289
            int r1 = r0.f182s
            int r1 = r1 - r3
            r0.f182s = r1
            char[] r2 = r0.f181c
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x0117
            r2 = 84
            if (r1 != r2) goto L_0x00fa
            goto L_0x0117
        L_0x00fa:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0111
            r2 = 70
            if (r1 != r2) goto L_0x0103
            goto L_0x0111
        L_0x0103:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x010b
            r2 = 78
            if (r1 != r2) goto L_0x0166
        L_0x010b:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r4 = r13
            goto L_0x011c
        L_0x0111:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r4 = r11
            goto L_0x011c
        L_0x0117:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r4 = r6
        L_0x011c:
            int r5 = r1.length()
            r7 = r3
        L_0x0121:
            if (r7 >= r5) goto L_0x014a
            int r9 = r0.f182s
            int r9 = r9 + r7
            int r10 = r0.f183t
            if (r9 < r10) goto L_0x0133
            int r9 = r7 + 1
            boolean r9 = r0.s(r9)
            if (r9 != 0) goto L_0x0133
            goto L_0x0166
        L_0x0133:
            char[] r9 = r0.f181c
            int r10 = r0.f182s
            int r10 = r10 + r7
            char r9 = r9[r10]
            char r10 = r1.charAt(r7)
            if (r9 == r10) goto L_0x0147
            char r10 = r2.charAt(r7)
            if (r9 == r10) goto L_0x0147
            goto L_0x0166
        L_0x0147:
            int r7 = r7 + 1
            goto L_0x0121
        L_0x014a:
            int r1 = r0.f182s
            int r1 = r1 + r5
            int r2 = r0.f183t
            if (r1 < r2) goto L_0x0159
            int r1 = r5 + 1
            boolean r1 = r0.s(r1)
            if (r1 == 0) goto L_0x0168
        L_0x0159:
            char[] r1 = r0.f181c
            int r2 = r0.f182s
            int r2 = r2 + r5
            char r1 = r1[r2]
            boolean r1 = r0.f(r1)
            if (r1 == 0) goto L_0x0168
        L_0x0166:
            r4 = r15
            goto L_0x016f
        L_0x0168:
            int r1 = r0.f182s
            int r1 = r1 + r5
            r0.f182s = r1
            r0.f186w = r4
        L_0x016f:
            if (r4 == 0) goto L_0x0172
            return r4
        L_0x0172:
            char[] r1 = r0.f181c
            int r2 = r0.f182s
            int r4 = r0.f183t
            r9 = 0
            r17 = r3
            r13 = r9
            r5 = r15
            r7 = r5
            r16 = r7
        L_0x0181:
            int r15 = r2 + r7
            if (r15 != r4) goto L_0x0198
            int r2 = r1.length
            if (r7 != r2) goto L_0x018a
            goto L_0x026a
        L_0x018a:
            int r2 = r7 + 1
            boolean r2 = r0.s(r2)
            if (r2 != 0) goto L_0x0194
            goto L_0x020a
        L_0x0194:
            int r2 = r0.f182s
            int r4 = r0.f183t
        L_0x0198:
            int r15 = r2 + r7
            char r15 = r1[r15]
            r11 = 43
            if (r15 == r11) goto L_0x025c
            r11 = 69
            if (r15 == r11) goto L_0x0252
            r11 = 101(0x65, float:1.42E-43)
            if (r15 == r11) goto L_0x0252
            r11 = 45
            if (r15 == r11) goto L_0x0246
            r11 = 46
            if (r15 == r11) goto L_0x023f
            r11 = 48
            if (r15 < r11) goto L_0x0204
            r11 = 57
            if (r15 <= r11) goto L_0x01b9
            goto L_0x0204
        L_0x01b9:
            if (r5 == r3) goto L_0x01fa
            if (r5 != 0) goto L_0x01be
            goto L_0x01fa
        L_0x01be:
            if (r5 != r8) goto L_0x01eb
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x01c6
            goto L_0x026a
        L_0x01c6:
            r18 = 10
            long r18 = r18 * r13
            int r15 = r15 + -48
            r20 = r4
            long r3 = (long) r15
            long r18 = r18 - r3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x01e3
            if (r3 != 0) goto L_0x01e1
            int r3 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x01e1
            goto L_0x01e3
        L_0x01e1:
            r3 = 0
            goto L_0x01e4
        L_0x01e3:
            r3 = 1
        L_0x01e4:
            r17 = r17 & r3
            r13 = r18
            r3 = 6
            goto L_0x0262
        L_0x01eb:
            r20 = r4
            r3 = 6
            if (r5 != r12) goto L_0x01f3
            r5 = 4
            goto L_0x0262
        L_0x01f3:
            if (r5 == r6) goto L_0x01f7
            if (r5 != r3) goto L_0x0262
        L_0x01f7:
            r5 = 7
            goto L_0x0262
        L_0x01fa:
            r20 = r4
            r3 = 6
            int r15 = r15 + -48
            int r4 = -r15
            long r13 = (long) r4
            r5 = r8
            goto L_0x0262
        L_0x0204:
            boolean r1 = r0.f(r15)
            if (r1 != 0) goto L_0x026a
        L_0x020a:
            if (r5 != r8) goto L_0x022e
            if (r17 == 0) goto L_0x022e
            r1 = -9223372036854775808
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0216
            if (r16 == 0) goto L_0x022e
        L_0x0216:
            int r1 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x021c
            if (r16 != 0) goto L_0x022e
        L_0x021c:
            if (r16 == 0) goto L_0x021f
            goto L_0x0220
        L_0x021f:
            long r13 = -r13
        L_0x0220:
            r0.f187x = r13
            int r1 = r0.f182s
            int r1 = r1 + r7
            r0.f182s = r1
            r1 = 15
            r0.f186w = r1
            r15 = 15
            goto L_0x026b
        L_0x022e:
            if (r5 == r8) goto L_0x0236
            r1 = 4
            if (r5 == r1) goto L_0x0236
            r1 = 7
            if (r5 != r1) goto L_0x026a
        L_0x0236:
            r0.f188y = r7
            r1 = 16
            r0.f186w = r1
            r15 = 16
            goto L_0x026b
        L_0x023f:
            r20 = r4
            r3 = 6
            if (r5 != r8) goto L_0x026a
            r5 = r12
            goto L_0x0262
        L_0x0246:
            r20 = r4
            r3 = 6
            if (r5 != 0) goto L_0x024f
            r5 = 1
            r16 = 1
            goto L_0x0262
        L_0x024f:
            if (r5 != r6) goto L_0x026a
            goto L_0x0261
        L_0x0252:
            r20 = r4
            r3 = 6
            if (r5 == r8) goto L_0x025a
            r4 = 4
            if (r5 != r4) goto L_0x026a
        L_0x025a:
            r5 = r6
            goto L_0x0262
        L_0x025c:
            r20 = r4
            r3 = 6
            if (r5 != r6) goto L_0x026a
        L_0x0261:
            r5 = r3
        L_0x0262:
            int r7 = r7 + 1
            r11 = r3
            r4 = r20
            r3 = 1
            goto L_0x0181
        L_0x026a:
            r15 = 0
        L_0x026b:
            if (r15 == 0) goto L_0x026e
            return r15
        L_0x026e:
            char[] r1 = r0.f181c
            int r2 = r0.f182s
            char r1 = r1[r2]
            boolean r1 = r0.f(r1)
            if (r1 == 0) goto L_0x0282
            r21.B()
            r1 = 10
            r0.f186w = r1
            return r1
        L_0x0282:
            java.lang.String r1 = "Expected value"
            r0.c(r1)
            r1 = 0
            throw r1
        L_0x0289:
            r1 = r3
            r0.f186w = r1
            return r1
        L_0x028d:
            r1 = r3
            if (r4 != r1) goto L_0x0298
            r2 = 4
            r0.f186w = r2
            return r2
        L_0x0294:
            r0.f186w = r12
            return r12
        L_0x0297:
            r1 = r3
        L_0x0298:
            if (r4 == r1) goto L_0x02a4
            if (r4 != r8) goto L_0x029d
            goto L_0x02a4
        L_0x029d:
            java.lang.String r1 = "Unexpected value"
            r0.c(r1)
            r1 = 0
            throw r1
        L_0x02a4:
            r21.B()
            int r2 = r0.f182s
            int r2 = r2 - r1
            r0.f182s = r2
            r1 = 7
            r0.f186w = r1
            return r1
        L_0x02b0:
            r21.B()
            r1 = 8
            r0.f186w = r1
            return r1
        L_0x02b8:
            r1 = 9
            r0.f186w = r1
            return r1
        L_0x02bd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02c5:
            r3 = r7
            r1[r2] = r3
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 != r6) goto L_0x02e4
            r2 = 1
            int r3 = r0.a(r2)
            if (r3 == r10) goto L_0x02e4
            if (r3 == r9) goto L_0x02e1
            if (r3 != r1) goto L_0x02da
            r0.f186w = r8
            return r8
        L_0x02da:
            java.lang.String r1 = "Unterminated object"
            r0.c(r1)
            r1 = 0
            throw r1
        L_0x02e1:
            r21.B()
        L_0x02e4:
            r2 = 1
            int r3 = r0.a(r2)
            r5 = 34
            if (r3 == r5) goto L_0x0320
            r5 = 39
            if (r3 == r5) goto L_0x0318
            java.lang.String r5 = "Expected name"
            if (r3 == r1) goto L_0x030e
            r21.B()
            int r1 = r0.f182s
            int r1 = r1 - r2
            r0.f182s = r1
            char r1 = (char) r3
            boolean r1 = r0.f(r1)
            if (r1 == 0) goto L_0x0309
            r1 = 14
            r0.f186w = r1
            return r1
        L_0x0309:
            r0.c(r5)
            r1 = 0
            throw r1
        L_0x030e:
            r1 = 0
            if (r4 == r6) goto L_0x0314
            r0.f186w = r8
            return r8
        L_0x0314:
            r0.c(r5)
            throw r1
        L_0x0318:
            r21.B()
            r1 = 12
            r0.f186w = r1
            return r1
        L_0x0320:
            r1 = 13
            r0.f186w = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.a.O():int");
    }

    public void R() {
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 4) {
            int i10 = this.B - 1;
            this.B = i10;
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.f186w = 0;
            return;
        }
        StringBuilder q10 = a.b.q("Expected END_ARRAY but was ");
        q10.append(v.h(A0()));
        throw new IllegalStateException(k.o(this, q10));
    }

    public void S() {
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 2) {
            int i10 = this.B - 1;
            this.B = i10;
            this.C[i10] = null;
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.f186w = 0;
            return;
        }
        StringBuilder q10 = a.b.q("Expected END_OBJECT but was ");
        q10.append(v.h(A0()));
        throw new IllegalStateException(k.o(this, q10));
    }

    public String T() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i = this.B;
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = this.A[i10];
            if (i11 == 1 || i11 == 2) {
                sb2.append('[');
                sb2.append(this.D[i10]);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String[] strArr = this.C;
                if (strArr[i10] != null) {
                    sb2.append(strArr[i10]);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r4 == '/') goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(boolean r10) {
        /*
            r9 = this;
            char[] r0 = r9.f181c
        L_0x0002:
            int r1 = r9.f182s
            int r2 = r9.f183t
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0029
            r9.f182s = r1
            boolean r1 = r9.s(r3)
            if (r1 != 0) goto L_0x0025
            if (r10 != 0) goto L_0x0015
            r10 = -1
            return r10
        L_0x0015:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            java.lang.StringBuilder r0 = a.b.q(r0)
            java.lang.String r0 = c3.k.o(r9, r0)
            r10.<init>(r0)
            throw r10
        L_0x0025:
            int r1 = r9.f182s
            int r2 = r9.f183t
        L_0x0029:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x003a
            int r1 = r9.f184u
            int r1 = r1 + r3
            r9.f184u = r1
            r9.f185v = r4
            goto L_0x00d8
        L_0x003a:
            r6 = 32
            if (r1 == r6) goto L_0x00d8
            r6 = 13
            if (r1 == r6) goto L_0x00d8
            r6 = 9
            if (r1 != r6) goto L_0x0048
            goto L_0x00d8
        L_0x0048:
            r6 = 47
            if (r1 != r6) goto L_0x00c5
            r9.f182s = r4
            r7 = 2
            if (r4 != r2) goto L_0x0061
            int r4 = r4 + -1
            r9.f182s = r4
            boolean r2 = r9.s(r7)
            int r4 = r9.f182s
            int r4 = r4 + r3
            r9.f182s = r4
            if (r2 != 0) goto L_0x0061
            return r1
        L_0x0061:
            r9.B()
            int r2 = r9.f182s
            char r4 = r0[r2]
            r8 = 42
            if (r4 == r8) goto L_0x0077
            if (r4 == r6) goto L_0x006f
            return r1
        L_0x006f:
            int r2 = r2 + 1
            r9.f182s = r2
            r9.C0()
            goto L_0x0002
        L_0x0077:
            int r2 = r2 + 1
            r9.f182s = r2
        L_0x007b:
            int r1 = r9.f182s
            int r1 = r1 + r7
            int r2 = r9.f183t
            r4 = 0
            if (r1 <= r2) goto L_0x008c
            boolean r1 = r9.s(r7)
            if (r1 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r3 = r4
            goto L_0x00b8
        L_0x008c:
            char[] r1 = r9.f181c
            int r2 = r9.f182s
            char r1 = r1[r2]
            if (r1 != r5) goto L_0x009e
            int r1 = r9.f184u
            int r1 = r1 + r3
            r9.f184u = r1
            int r2 = r2 + 1
            r9.f185v = r2
            goto L_0x00af
        L_0x009e:
            if (r4 >= r7) goto L_0x00b8
            char[] r1 = r9.f181c
            int r2 = r9.f182s
            int r2 = r2 + r4
            char r1 = r1[r2]
            java.lang.String r2 = "*/"
            char r2 = r2.charAt(r4)
            if (r1 == r2) goto L_0x00b5
        L_0x00af:
            int r1 = r9.f182s
            int r1 = r1 + r3
            r9.f182s = r1
            goto L_0x007b
        L_0x00b5:
            int r4 = r4 + 1
            goto L_0x009e
        L_0x00b8:
            if (r3 == 0) goto L_0x00be
            int r1 = r9.f182s
            int r1 = r1 + r7
            goto L_0x00d3
        L_0x00be:
            java.lang.String r10 = "Unterminated comment"
            r9.c(r10)
            r10 = 0
            throw r10
        L_0x00c5:
            r2 = 35
            r9.f182s = r4
            if (r1 != r2) goto L_0x00d7
            r9.B()
            r9.C0()
            int r1 = r9.f182s
        L_0x00d3:
            int r2 = r9.f183t
            goto L_0x0006
        L_0x00d7:
            return r1
        L_0x00d8:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.a.a(boolean):int");
    }

    public boolean a0() {
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public boolean b0() {
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 5) {
            this.f186w = 0;
            int[] iArr = this.D;
            int i10 = this.B - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        } else if (i == 6) {
            this.f186w = 0;
            int[] iArr2 = this.D;
            int i11 = this.B - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        } else {
            StringBuilder q10 = a.b.q("Expected a boolean but was ");
            q10.append(v.h(A0()));
            throw new IllegalStateException(k.o(this, q10));
        }
    }

    public final IOException c(String str) {
        throw new d(k.o(this, a.b.q(str)));
    }

    public void close() {
        this.f186w = 0;
        this.A[0] = 8;
        this.B = 1;
        this.f179a.close();
    }

    public void e() {
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 3) {
            y(1);
            this.D[this.B - 1] = 0;
            this.f186w = 0;
            return;
        }
        StringBuilder q10 = a.b.q("Expected BEGIN_ARRAY but was ");
        q10.append(v.h(A0()));
        throw new IllegalStateException(k.o(this, q10));
    }

    public final boolean f(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        B();
        return false;
    }

    public double f0() {
        String str;
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 15) {
            this.f186w = 0;
            int[] iArr = this.D;
            int i10 = this.B - 1;
            iArr[i10] = iArr[i10] + 1;
            return (double) this.f187x;
        }
        if (i == 16) {
            this.z = new String(this.f181c, this.f182s, this.f188y);
            this.f182s += this.f188y;
        } else {
            if (i == 8 || i == 9) {
                str = t(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = z0();
            } else if (i != 11) {
                StringBuilder q10 = a.b.q("Expected a double but was ");
                q10.append(v.h(A0()));
                throw new IllegalStateException(k.o(this, q10));
            }
            this.z = str;
        }
        this.f186w = 11;
        double parseDouble = Double.parseDouble(this.z);
        if (this.f180b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.z = null;
            this.f186w = 0;
            int[] iArr2 = this.D;
            int i11 = this.B - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        throw new d(k.o(this, sb2));
    }

    public int p0() {
        String t10;
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 15) {
            long j10 = this.f187x;
            int i10 = (int) j10;
            if (j10 == ((long) i10)) {
                this.f186w = 0;
                int[] iArr = this.D;
                int i11 = this.B - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            StringBuilder q10 = a.b.q("Expected an int but was ");
            q10.append(this.f187x);
            throw new NumberFormatException(k.o(this, q10));
        }
        if (i == 16) {
            this.z = new String(this.f181c, this.f182s, this.f188y);
            this.f182s += this.f188y;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                t10 = z0();
            } else {
                t10 = t(i == 8 ? '\'' : '\"');
            }
            this.z = t10;
            try {
                int parseInt = Integer.parseInt(this.z);
                this.f186w = 0;
                int[] iArr2 = this.D;
                int i12 = this.B - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder q11 = a.b.q("Expected an int but was ");
            q11.append(v.h(A0()));
            throw new IllegalStateException(k.o(this, q11));
        }
        this.f186w = 11;
        double parseDouble = Double.parseDouble(this.z);
        int i13 = (int) parseDouble;
        if (((double) i13) == parseDouble) {
            this.z = null;
            this.f186w = 0;
            int[] iArr3 = this.D;
            int i14 = this.B - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        }
        StringBuilder q12 = a.b.q("Expected an int but was ");
        q12.append(this.z);
        throw new NumberFormatException(k.o(this, q12));
    }

    public final boolean s(int i) {
        int i10;
        int i11;
        char[] cArr = this.f181c;
        int i12 = this.f185v;
        int i13 = this.f182s;
        this.f185v = i12 - i13;
        int i14 = this.f183t;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f183t = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f183t = 0;
        }
        this.f182s = 0;
        do {
            Reader reader = this.f179a;
            int i16 = this.f183t;
            int read = reader.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.f183t + read;
            this.f183t = i10;
            if (this.f184u == 0 && (i11 = this.f185v) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f182s++;
                this.f185v = i11 + 1;
                i++;
                continue;
            }
        } while (i10 < i);
        return true;
    }

    public final String t(char c10) {
        char[] cArr = this.f181c;
        StringBuilder sb2 = null;
        do {
            int i = this.f182s;
            int i10 = this.f183t;
            int i11 = i;
            while (i < i10) {
                int i12 = i + 1;
                char c11 = cArr[i];
                if (c11 == c10) {
                    this.f182s = i12;
                    int i13 = (i12 - i11) - 1;
                    if (sb2 == null) {
                        return new String(cArr, i11, i13);
                    }
                    sb2.append(cArr, i11, i13);
                    return sb2.toString();
                } else if (c11 == '\\') {
                    this.f182s = i12;
                    int i14 = (i12 - i11) - 1;
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i14 + 1) * 2, 16));
                    }
                    sb2.append(cArr, i11, i14);
                    sb2.append(B0());
                    i11 = this.f182s;
                    i10 = this.f183t;
                    i = i11;
                } else {
                    if (c11 == 10) {
                        this.f184u++;
                        this.f185v = i12;
                    }
                    i = i12;
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i - i11) * 2, 16));
            }
            sb2.append(cArr, i11, i - i11);
            this.f182s = i;
        } while (s(1));
        c("Unterminated string");
        throw null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        return k.o(this, sb2);
    }

    public long v0() {
        String t10;
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 15) {
            this.f186w = 0;
            int[] iArr = this.D;
            int i10 = this.B - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f187x;
        }
        if (i == 16) {
            this.z = new String(this.f181c, this.f182s, this.f188y);
            this.f182s += this.f188y;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                t10 = z0();
            } else {
                t10 = t(i == 8 ? '\'' : '\"');
            }
            this.z = t10;
            try {
                long parseLong = Long.parseLong(this.z);
                this.f186w = 0;
                int[] iArr2 = this.D;
                int i11 = this.B - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder q10 = a.b.q("Expected a long but was ");
            q10.append(v.h(A0()));
            throw new IllegalStateException(k.o(this, q10));
        }
        this.f186w = 11;
        double parseDouble = Double.parseDouble(this.z);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.z = null;
            this.f186w = 0;
            int[] iArr3 = this.D;
            int i12 = this.B - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return j10;
        }
        StringBuilder q11 = a.b.q("Expected a long but was ");
        q11.append(this.z);
        throw new NumberFormatException(k.o(this, q11));
    }

    public void w() {
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 1) {
            y(3);
            this.f186w = 0;
            return;
        }
        StringBuilder q10 = a.b.q("Expected BEGIN_OBJECT but was ");
        q10.append(v.h(A0()));
        throw new IllegalStateException(k.o(this, q10));
    }

    public String w0() {
        String str;
        char c10;
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 14) {
            str = z0();
        } else {
            if (i == 12) {
                c10 = '\'';
            } else if (i == 13) {
                c10 = '\"';
            } else {
                StringBuilder q10 = a.b.q("Expected a name but was ");
                q10.append(v.h(A0()));
                throw new IllegalStateException(k.o(this, q10));
            }
            str = t(c10);
        }
        this.f186w = 0;
        this.C[this.B - 1] = str;
        return str;
    }

    public void x0() {
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 7) {
            this.f186w = 0;
            int[] iArr = this.D;
            int i10 = this.B - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        StringBuilder q10 = a.b.q("Expected null but was ");
        q10.append(v.h(A0()));
        throw new IllegalStateException(k.o(this, q10));
    }

    public final void y(int i) {
        int i10 = this.B;
        int[] iArr = this.A;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.A = Arrays.copyOf(iArr, i11);
            this.D = Arrays.copyOf(this.D, i11);
            this.C = (String[]) Arrays.copyOf(this.C, i11);
        }
        int[] iArr2 = this.A;
        int i12 = this.B;
        this.B = i12 + 1;
        iArr2[i12] = i;
    }

    public String y0() {
        String str;
        char c10;
        int i = this.f186w;
        if (i == 0) {
            i = O();
        }
        if (i == 10) {
            str = z0();
        } else {
            if (i == 8) {
                c10 = '\'';
            } else if (i == 9) {
                c10 = '\"';
            } else if (i == 11) {
                str = this.z;
                this.z = null;
            } else if (i == 15) {
                str = Long.toString(this.f187x);
            } else if (i == 16) {
                str = new String(this.f181c, this.f182s, this.f188y);
                this.f182s += this.f188y;
            } else {
                StringBuilder q10 = a.b.q("Expected a string but was ");
                q10.append(v.h(A0()));
                throw new IllegalStateException(k.o(this, q10));
            }
            str = t(c10);
        }
        this.f186w = 0;
        int[] iArr = this.D;
        int i10 = this.B - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        B();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String z0() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r0
        L_0x0003:
            int r3 = r5.f182s
            int r3 = r3 + r2
            int r4 = r5.f183t
            if (r3 >= r4) goto L_0x004c
            char[] r4 = r5.f181c
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005a
            r4 = 10
            if (r3 == r4) goto L_0x005a
            r4 = 12
            if (r3 == r4) goto L_0x005a
            r4 = 13
            if (r3 == r4) goto L_0x005a
            r4 = 32
            if (r3 == r4) goto L_0x005a
            r4 = 35
            if (r3 == r4) goto L_0x0048
            r4 = 44
            if (r3 == r4) goto L_0x005a
            r4 = 47
            if (r3 == r4) goto L_0x0048
            r4 = 61
            if (r3 == r4) goto L_0x0048
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 58
            if (r3 == r4) goto L_0x005a
            r4 = 59
            if (r3 == r4) goto L_0x0048
            switch(r3) {
                case 91: goto L_0x005a;
                case 92: goto L_0x0048;
                case 93: goto L_0x005a;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0048:
            r5.B()
            goto L_0x005a
        L_0x004c:
            char[] r3 = r5.f181c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005c
            int r3 = r2 + 1
            boolean r3 = r5.s(r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0003
        L_0x005a:
            r0 = r2
            goto L_0x007c
        L_0x005c:
            if (r1 != 0) goto L_0x0069
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x0069:
            char[] r3 = r5.f181c
            int r4 = r5.f182s
            r1.append(r3, r4, r2)
            int r3 = r5.f182s
            int r3 = r3 + r2
            r5.f182s = r3
            r2 = 1
            boolean r2 = r5.s(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007c:
            if (r1 != 0) goto L_0x0088
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.f181c
            int r3 = r5.f182s
            r1.<init>(r2, r3, r0)
            goto L_0x0093
        L_0x0088:
            char[] r2 = r5.f181c
            int r3 = r5.f182s
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0093:
            int r2 = r5.f182s
            int r2 = r2 + r0
            r5.f182s = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.a.z0():java.lang.String");
    }
}
