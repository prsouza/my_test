package nf;

import fe.k;
import jf.c;
import p002if.a0;
import uf.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final i f9009a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f9010b;

    static {
        i.a aVar = i.f11956t;
        f9009a = aVar.b("\"\\");
        f9010b = aVar.b("\t ,=");
    }

    public static final boolean a(a0 a0Var) {
        if (e6.e.r(a0Var.f6452a.f6628c, "HEAD")) {
            return false;
        }
        int i = a0Var.f6455s;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && c.k(a0Var) == -1 && !k.Y0("chunked", a0.a(a0Var, "Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0202, code lost:
        if (jf.c.f7255f.a(r0) == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0207, code lost:
        if (r18 == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021c, code lost:
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.g.a(r3) == null) goto L_0x021e;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0263 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(p002if.k r36, p002if.r r37, p002if.q r38) {
        /*
            r1 = r36
            r2 = r37
            r0 = r38
            java.lang.String r3 = "$this$receiveHeaders"
            e6.e.D(r1, r3)
            java.lang.String r3 = "url"
            e6.e.D(r2, r3)
            java.lang.String r3 = "headers"
            e6.e.D(r0, r3)
            a.b r3 = p002if.k.f6540h
            if (r1 != r3) goto L_0x001a
            return
        L_0x001a:
            if.j$a r3 = p002if.j.f6532n
            java.lang.String[] r4 = r0.f6560a
            int r4 = r4.length
            r5 = 2
            int r4 = r4 / r5
            r7 = 0
            r8 = r7
            r9 = 0
        L_0x0024:
            if (r8 >= r4) goto L_0x0043
            java.lang.String r10 = r0.e(r8)
            java.lang.String r11 = "Set-Cookie"
            boolean r10 = fe.k.Y0(r11, r10)
            if (r10 == 0) goto L_0x0040
            if (r9 != 0) goto L_0x0039
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
        L_0x0039:
            java.lang.String r10 = r0.h(r8)
            r9.add(r10)
        L_0x0040:
            int r8 = r8 + 1
            goto L_0x0024
        L_0x0043:
            if (r9 == 0) goto L_0x004f
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)
            java.lang.String r4 = "Collections.unmodifiableList(result)"
            e6.e.C(r0, r4)
            goto L_0x0051
        L_0x004f:
            nd.o r0 = nd.o.f8966a
        L_0x0051:
            r4 = r0
            int r5 = r4.size()
            r8 = r7
            r9 = 0
        L_0x0058:
            if (r8 >= r5) goto L_0x026a
            java.lang.Object r0 = r4.get(r8)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = "setCookie"
            e6.e.D(r10, r0)
            long r11 = java.lang.System.currentTimeMillis()
            byte[] r0 = jf.c.f7250a
            int r0 = r10.length()
            r13 = 59
            int r0 = jf.c.f(r10, r13, r7, r0)
            r14 = 61
            int r15 = jf.c.f(r10, r14, r7, r0)
            if (r15 != r0) goto L_0x0083
        L_0x007e:
            r35 = r3
            r10 = r7
            goto L_0x0255
        L_0x0083:
            java.lang.String r17 = jf.c.z(r10, r7, r15)
            int r16 = r17.length()
            r18 = 1
            if (r16 != 0) goto L_0x0092
            r16 = r18
            goto L_0x0094
        L_0x0092:
            r16 = r7
        L_0x0094:
            if (r16 != 0) goto L_0x007e
            int r6 = jf.c.m(r17)
            r7 = -1
            if (r6 == r7) goto L_0x009e
            goto L_0x00aa
        L_0x009e:
            int r15 = r15 + 1
            java.lang.String r6 = jf.c.z(r10, r15, r0)
            int r15 = jf.c.m(r6)
            if (r15 == r7) goto L_0x00ae
        L_0x00aa:
            r35 = r3
            goto L_0x021e
        L_0x00ae:
            int r0 = r0 + 1
            int r7 = r10.length()
            r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r26 = r18
            r27 = r19
            r21 = -1
            r23 = 0
            r24 = 0
            r25 = 0
            r29 = 0
            r30 = 0
        L_0x00c9:
            r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r33 = -9223372036854775808
            if (r0 >= r7) goto L_0x01a5
            int r15 = jf.c.f(r10, r13, r0, r7)
            int r13 = jf.c.f(r10, r14, r0, r15)
            java.lang.String r0 = jf.c.z(r10, r0, r13)
            if (r13 >= r15) goto L_0x00e7
            int r13 = r13 + 1
            java.lang.String r13 = jf.c.z(r10, r13, r15)
            goto L_0x00e9
        L_0x00e7:
            java.lang.String r13 = ""
        L_0x00e9:
            java.lang.String r14 = "expires"
            boolean r14 = fe.k.Y0(r0, r14)
            if (r14 == 0) goto L_0x0102
            int r0 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00fe }
            long r13 = r3.b(r13, r0)     // Catch:{ IllegalArgumentException -> 0x00fe }
            r35 = r3
            r27 = r13
            goto L_0x0142
        L_0x00fe:
            r35 = r3
            goto L_0x019b
        L_0x0102:
            java.lang.String r14 = "max-age"
            boolean r14 = fe.k.Y0(r0, r14)
            if (r14 == 0) goto L_0x0146
            long r13 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x011c }
            r21 = 0
            int r0 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            r33 = r13
        L_0x0117:
            r35 = r3
            r21 = r33
            goto L_0x0142
        L_0x011c:
            r0 = move-exception
            r14 = r0
            java.lang.String r0 = "-?\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{  }
            r35 = r3
            java.lang.String r3 = "compile(pattern)"
            e6.e.C(r0, r3)     // Catch:{ NumberFormatException -> 0x019b }
            java.util.regex.Matcher r0 = r0.matcher(r13)     // Catch:{ NumberFormatException -> 0x019b }
            boolean r0 = r0.matches()     // Catch:{ NumberFormatException -> 0x019b }
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = "-"
            r3 = 0
            boolean r0 = fe.k.d1(r13, r0, r3)     // Catch:{ NumberFormatException -> 0x019b }
            if (r0 == 0) goto L_0x0140
            r31 = r33
        L_0x0140:
            r21 = r31
        L_0x0142:
            r25 = r18
            goto L_0x019b
        L_0x0145:
            throw r14     // Catch:{ NumberFormatException -> 0x019b }
        L_0x0146:
            r35 = r3
            java.lang.String r3 = "domain"
            boolean r3 = fe.k.Y0(r0, r3)
            if (r3 == 0) goto L_0x017b
            java.lang.String r0 = "."
            boolean r3 = r13.endsWith(r0)     // Catch:{  }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x016f
            java.lang.String r0 = fe.o.t1(r13, r0)     // Catch:{  }
            java.lang.String r0 = y.c.r0(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0169
            r29 = r0
            r26 = 0
            goto L_0x019b
        L_0x0169:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            r0.<init>()     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x016f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            java.lang.String r3 = "Failed requirement."
            java.lang.String r3 = r3.toString()     // Catch:{  }
            r0.<init>(r3)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x017b:
            java.lang.String r3 = "path"
            boolean r3 = fe.k.Y0(r0, r3)
            if (r3 == 0) goto L_0x0186
            r30 = r13
            goto L_0x019b
        L_0x0186:
            java.lang.String r3 = "secure"
            boolean r3 = fe.k.Y0(r0, r3)
            if (r3 == 0) goto L_0x0191
            r23 = r18
            goto L_0x019b
        L_0x0191:
            java.lang.String r3 = "httponly"
            boolean r0 = fe.k.Y0(r0, r3)
            if (r0 == 0) goto L_0x019b
            r24 = r18
        L_0x019b:
            int r0 = r15 + 1
            r3 = r35
            r13 = 59
            r14 = 61
            goto L_0x00c9
        L_0x01a5:
            r35 = r3
            int r0 = (r21 > r33 ? 1 : (r21 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x01ae
            r19 = r33
            goto L_0x01d2
        L_0x01ae:
            r13 = -1
            int r0 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01d0
            r13 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x01c2
            r0 = 1000(0x3e8, float:1.401E-42)
            long r13 = (long) r0
            long r31 = r21 * r13
        L_0x01c2:
            long r31 = r11 + r31
            int r0 = (r31 > r11 ? 1 : (r31 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x01d2
            int r0 = (r31 > r19 ? 1 : (r31 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cd
            goto L_0x01d2
        L_0x01cd:
            r19 = r31
            goto L_0x01d2
        L_0x01d0:
            r19 = r27
        L_0x01d2:
            java.lang.String r0 = r2.f6568e
            r3 = r29
            if (r3 != 0) goto L_0x01da
            r3 = r0
            goto L_0x020a
        L_0x01da:
            boolean r7 = e6.e.r(r0, r3)
            if (r7 == 0) goto L_0x01e1
            goto L_0x0207
        L_0x01e1:
            boolean r7 = fe.k.X0(r0, r3)
            if (r7 == 0) goto L_0x0205
            int r7 = r0.length()
            int r10 = r3.length()
            int r7 = r7 - r10
            int r7 = r7 + -1
            char r7 = r0.charAt(r7)
            r10 = 46
            if (r7 != r10) goto L_0x0205
            byte[] r7 = jf.c.f7250a
            fe.c r7 = jf.c.f7255f
            boolean r7 = r7.a(r0)
            if (r7 != 0) goto L_0x0205
            goto L_0x0207
        L_0x0205:
            r18 = 0
        L_0x0207:
            if (r18 != 0) goto L_0x020a
            goto L_0x021e
        L_0x020a:
            int r0 = r0.length()
            int r7 = r3.length()
            if (r0 == r7) goto L_0x0220
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f9461h
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.g
            java.lang.String r0 = r0.a(r3)
            if (r0 != 0) goto L_0x0220
        L_0x021e:
            r10 = 0
            goto L_0x0255
        L_0x0220:
            java.lang.String r0 = "/"
            r7 = r30
            r10 = 0
            if (r7 == 0) goto L_0x0231
            boolean r11 = fe.k.d1(r7, r0, r10)
            if (r11 != 0) goto L_0x022e
            goto L_0x0231
        L_0x022e:
            r22 = r7
            goto L_0x0249
        L_0x0231:
            java.lang.String r7 = r37.b()
            r11 = 47
            r12 = 6
            int r11 = fe.o.o1(r7, r11, r10, r12)
            if (r11 == 0) goto L_0x0247
            java.lang.String r0 = r7.substring(r10, r11)
            java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            e6.e.C(r0, r7)
        L_0x0247:
            r22 = r0
        L_0x0249:
            if.j r0 = new if.j
            r16 = r0
            r18 = r6
            r21 = r3
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26)
            goto L_0x0256
        L_0x0255:
            r0 = 0
        L_0x0256:
            if (r0 == 0) goto L_0x0263
            if (r9 != 0) goto L_0x0260
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r9 = r3
        L_0x0260:
            r9.add(r0)
        L_0x0263:
            int r8 = r8 + 1
            r7 = r10
            r3 = r35
            goto L_0x0058
        L_0x026a:
            if (r9 == 0) goto L_0x0276
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)
            java.lang.String r3 = "Collections.unmodifiableList(cookies)"
            e6.e.C(r0, r3)
            goto L_0x0278
        L_0x0276:
            nd.o r0 = nd.o.f8966a
        L_0x0278:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x027f
            return
        L_0x027f:
            r1.c(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.e.b(if.k, if.r, if.q):void");
    }
}
