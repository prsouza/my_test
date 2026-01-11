package te;

import a.a;
import a.b;
import androidx.activity.result.d;
import e6.e;
import java.util.Arrays;
import java.util.Objects;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int f11580a;

    /* renamed from: b  reason: collision with root package name */
    public byte f11581b = 12;

    /* renamed from: c  reason: collision with root package name */
    public int f11582c;

    /* renamed from: d  reason: collision with root package name */
    public int f11583d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f11584e;

    /* renamed from: f  reason: collision with root package name */
    public char[] f11585f = new char[16];
    public final String g;

    public h(String str) {
        this.g = str;
        g();
    }

    public static /* synthetic */ Void d(h hVar, String str) {
        hVar.c(str, hVar.f11580a);
        throw null;
    }

    public final void a(char c10) {
        int i = this.f11584e;
        char[] cArr = this.f11585f;
        if (i >= cArr.length) {
            char[] copyOf = Arrays.copyOf(cArr, cArr.length * 2);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f11585f = copyOf;
        }
        char[] cArr2 = this.f11585f;
        int i10 = this.f11584e;
        this.f11584e = i10 + 1;
        cArr2[i10] = c10;
    }

    public final void b(String str, int i, int i10) {
        int i11 = i10 - i;
        int i12 = this.f11584e;
        int i13 = i12 + i11;
        char[] cArr = this.f11585f;
        if (i13 > cArr.length) {
            int length = cArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i13);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f11585f = copyOf;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            this.f11585f[i12 + i14] = str.charAt(i + i14);
        }
        this.f11584e += i11;
    }

    public final Void c(String str, int i) {
        e.D(str, "message");
        throw b.j(i, str, this.g);
    }

    public final int e(String str, int i) {
        if (i < str.length()) {
            char charAt = str.charAt(i);
            if ('0' <= charAt && '9' >= charAt) {
                return charAt - '0';
            }
            char c10 = 'a';
            if ('a' > charAt || 'f' < charAt) {
                c10 = 'A';
                if ('A' > charAt || 'F' < charAt) {
                    c("Invalid toHexChar char '" + charAt + "' in unicode escape", this.f11580a);
                    throw null;
                }
            }
            return (charAt - c10) + 10;
        }
        c("Unexpected EOF during unicode escape", i);
        throw null;
    }

    public final boolean f() {
        byte b10 = this.f11581b;
        return b10 == 0 || b10 == 1 || b10 == 6 || b10 == 8 || b10 == 10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r12 = this;
            java.lang.String r0 = r12.g
            int r1 = r12.f11580a
        L_0x0004:
            int r2 = r0.length()
            r3 = 12
            if (r1 >= r2) goto L_0x0125
            char r2 = r0.charAt(r1)
            byte r2 = te.i.a(r2)
            r4 = 0
            r5 = 4
            r6 = 1
            if (r2 == 0) goto L_0x00e5
            if (r2 == r6) goto L_0x0029
            r3 = 3
            if (r2 == r3) goto L_0x0026
            r12.f11582c = r1
            r12.f11581b = r2
            int r1 = r1 + r6
            r12.f11580a = r1
            return
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0029:
            r12.f11582c = r1
            r12.f11584e = r4
            int r1 = r1 + r6
            int r2 = r0.length()
            java.lang.String r7 = "EOF"
            r8 = 0
            if (r1 >= r2) goto L_0x00e1
            r2 = r1
            r9 = r2
        L_0x0039:
            char r10 = r0.charAt(r2)
            r11 = 34
            if (r10 == r11) goto L_0x00cc
            char r10 = r0.charAt(r2)
            r11 = 92
            if (r10 != r11) goto L_0x00be
            r12.b(r0, r9, r2)
            int r2 = r2 + 1
            int r9 = r0.length()
            if (r2 >= r9) goto L_0x0056
            r9 = r6
            goto L_0x0057
        L_0x0056:
            r9 = r4
        L_0x0057:
            if (r9 == 0) goto L_0x00b8
            int r9 = r2 + 1
            char r2 = r0.charAt(r2)
            r10 = 117(0x75, float:1.64E-43)
            if (r2 != r10) goto L_0x0088
            int r2 = r9 + 1
            int r9 = r12.e(r0, r9)
            int r9 = r9 << r3
            int r10 = r2 + 1
            int r2 = r12.e(r0, r2)
            int r2 = r2 << 8
            int r9 = r9 + r2
            int r2 = r10 + 1
            int r10 = r12.e(r0, r10)
            int r10 = r10 << r5
            int r9 = r9 + r10
            int r10 = r2 + 1
            int r2 = r12.e(r0, r2)
            int r2 = r2 + r9
            char r2 = (char) r2
            r12.a(r2)
            r9 = r10
            goto L_0x009c
        L_0x0088:
            byte[] r11 = te.i.f11586a
            if (r2 >= r10) goto L_0x0091
            char[] r10 = te.b.f11568a
            char r10 = r10[r2]
            goto L_0x0092
        L_0x0091:
            r10 = r4
        L_0x0092:
            if (r10 == 0) goto L_0x0096
            r11 = r6
            goto L_0x0097
        L_0x0096:
            r11 = r4
        L_0x0097:
            if (r11 == 0) goto L_0x009e
            r12.a(r10)
        L_0x009c:
            r2 = r9
            goto L_0x0039
        L_0x009e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid escaped char '"
            r0.append(r1)
            r0.append(r2)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.c(r0, r9)
            throw r8
        L_0x00b8:
            java.lang.String r0 = "Unexpected EOF after escape character"
            r12.c(r0, r2)
            throw r8
        L_0x00be:
            int r2 = r2 + 1
            int r10 = r0.length()
            if (r2 >= r10) goto L_0x00c8
            goto L_0x0039
        L_0x00c8:
            r12.c(r7, r2)
            throw r8
        L_0x00cc:
            if (r9 != r1) goto L_0x00d5
            r12.f11583d = r9
            int r0 = r2 - r9
            r12.f11584e = r0
            goto L_0x00db
        L_0x00d5:
            r12.b(r0, r9, r2)
            r0 = -1
            r12.f11583d = r0
        L_0x00db:
            int r2 = r2 + r6
            r12.f11580a = r2
            r12.f11581b = r6
            return
        L_0x00e1:
            r12.c(r7, r1)
            throw r8
        L_0x00e5:
            r12.f11582c = r1
            r12.f11583d = r1
        L_0x00e9:
            int r2 = r0.length()
            if (r1 >= r2) goto L_0x00fc
            char r2 = r0.charAt(r1)
            byte r2 = te.i.a(r2)
            if (r2 != 0) goto L_0x00fc
            int r1 = r1 + 1
            goto L_0x00e9
        L_0x00fc:
            r12.f11580a = r1
            int r2 = r12.f11583d
            int r1 = r1 - r2
            r12.f11584e = r1
            byte[] r3 = te.i.f11586a
            if (r1 == r5) goto L_0x0108
            goto L_0x0119
        L_0x0108:
            r1 = r4
        L_0x0109:
            if (r1 >= r5) goto L_0x011e
            int r3 = r2 + r1
            char r3 = r0.charAt(r3)
            java.lang.String r7 = "null"
            char r7 = r7.charAt(r1)
            if (r3 == r7) goto L_0x011b
        L_0x0119:
            r6 = r4
            goto L_0x011e
        L_0x011b:
            int r1 = r1 + 1
            goto L_0x0109
        L_0x011e:
            if (r6 == 0) goto L_0x0122
            r4 = 10
        L_0x0122:
            r12.f11581b = r4
            return
        L_0x0125:
            r12.f11582c = r1
            r12.f11581b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te.h.g():void");
    }

    public final String h() {
        byte b10 = this.f11581b;
        if (b10 == 0 || b10 == 1) {
            return i(true);
        }
        c("Expected string or non-null literal", this.f11582c);
        throw null;
    }

    public final String i(boolean z) {
        String str;
        int i = this.f11583d;
        if (i < 0) {
            char[] cArr = this.f11585f;
            int i10 = this.f11584e + 0;
            e.D(cArr, "<this>");
            int length = cArr.length;
            if (i10 > length) {
                throw new IndexOutOfBoundsException("startIndex: " + 0 + ", endIndex: " + i10 + ", size: " + length);
            } else if (i10 >= 0) {
                str = new String(cArr, 0, i10 - 0);
            } else {
                throw new IllegalArgumentException(d.b("startIndex: ", 0, " > endIndex: ", i10));
            }
        } else {
            String str2 = this.g;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            str = str2.substring(i, this.f11584e + i);
            e.C(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (z) {
            g();
        }
        return str;
    }

    public final String j() {
        byte b10 = this.f11581b;
        if (b10 == 1) {
            return i(true);
        }
        if (b10 != 10) {
            c("Expected string literal with quotes.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", this.f11582c);
            throw null;
        }
        c("Expected string literal but 'null' literal was found.\nUse 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.", this.f11582c);
        throw null;
    }

    public final String toString() {
        StringBuilder d10 = a.d("JsonReader(source='");
        d10.append(this.g);
        d10.append("', currentPosition=");
        d10.append(this.f11580a);
        d10.append(", tokenClass=");
        d10.append(this.f11581b);
        d10.append(", tokenPosition=");
        d10.append(this.f11582c);
        d10.append(", offset=");
        d10.append(this.f11583d);
        d10.append(')');
        return d10.toString();
    }
}
