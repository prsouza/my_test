package p002if;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import fe.o;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import jf.c;
import nd.g;

/* renamed from: if.r  reason: invalid package */
public final class r {

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f6562k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l  reason: collision with root package name */
    public static final b f6563l = new b();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6564a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6565b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6566c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6567d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6568e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6569f;
    public final List<String> g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f6570h;
    public final String i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6571j;

    /* renamed from: if.r$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6572a;

        /* renamed from: b  reason: collision with root package name */
        public String f6573b = BuildConfig.FLAVOR;

        /* renamed from: c  reason: collision with root package name */
        public String f6574c = BuildConfig.FLAVOR;

        /* renamed from: d  reason: collision with root package name */
        public String f6575d;

        /* renamed from: e  reason: collision with root package name */
        public int f6576e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f6577f;
        public List<String> g;

        /* renamed from: h  reason: collision with root package name */
        public String f6578h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f6577f = arrayList;
            arrayList.add(BuildConfig.FLAVOR);
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
        public final r a() {
            ArrayList arrayList;
            String str = this.f6572a;
            if (str != null) {
                String d10 = b.d(this.f6573b, 0, 0, false, 7);
                String d11 = b.d(this.f6574c, 0, 0, false, 7);
                String str2 = this.f6575d;
                if (str2 != null) {
                    int b10 = b();
                    ? r02 = this.f6577f;
                    ArrayList arrayList2 = new ArrayList(g.S0(r02));
                    Iterator it = r02.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(b.d((String) it.next(), 0, 0, false, 7));
                    }
                    List<String> list = this.g;
                    String str3 = null;
                    if (list != null) {
                        arrayList = new ArrayList(g.S0(list));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            String next = it2.next();
                            arrayList.add(next != null ? b.d(next, 0, 0, true, 3) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.f6578h;
                    if (str4 != null) {
                        str3 = b.d(str4, 0, 0, false, 7);
                    }
                    return new r(str, d10, d11, str2, b10, arrayList2, arrayList, str3, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int b() {
            int i = this.f6576e;
            if (i != -1) {
                return i;
            }
            String str = this.f6572a;
            e.B(str);
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final a c(String str) {
            this.g = (ArrayList) (str != null ? r.f6563l.e(b.a(str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211)) : null);
            return this;
        }

        /* JADX WARNING: type inference failed for: r3v13, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v18, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v19, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v20, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r4v13, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v24, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v25, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v28, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r5v35, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r5v36, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r5v38, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v46, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v47, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0262, code lost:
            if (65535 < r1) goto L_0x0268;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
            if (r9 == ':') goto L_0x0083;
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0234  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x029a  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x02d6  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x02d8  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x02db  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0339  */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x0481  */
        /* JADX WARNING: Removed duplicated region for block: B:225:0x022e A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:230:0x0431 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0210  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p002if.r.a d(p002if.r r29, java.lang.String r30) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                r11 = r30
                java.lang.String r2 = "input"
                e6.e.D(r11, r2)
                byte[] r2 = jf.c.f7250a
                int r2 = r30.length()
                r3 = 0
                int r2 = jf.c.n(r11, r3, r2)
                int r4 = r30.length()
                int r12 = jf.c.o(r11, r2, r4)
                int r4 = r12 - r2
                r5 = 58
                r6 = -1
                r13 = 1
                r7 = 2
                if (r4 >= r7) goto L_0x0029
                goto L_0x0082
            L_0x0029:
                char r4 = r11.charAt(r2)
                r8 = 97
                int r9 = e6.e.F(r4, r8)
                r10 = 122(0x7a, float:1.71E-43)
                r14 = 65
                r15 = 90
                if (r9 < 0) goto L_0x0041
                int r9 = e6.e.F(r4, r10)
                if (r9 <= 0) goto L_0x004e
            L_0x0041:
                int r9 = e6.e.F(r4, r14)
                if (r9 < 0) goto L_0x0082
                int r4 = e6.e.F(r4, r15)
                if (r4 <= 0) goto L_0x004e
                goto L_0x0082
            L_0x004e:
                r4 = r2
            L_0x004f:
                int r4 = r4 + r13
                if (r4 >= r12) goto L_0x0082
                char r9 = r11.charAt(r4)
                if (r8 <= r9) goto L_0x0059
                goto L_0x005c
            L_0x0059:
                if (r10 < r9) goto L_0x005c
                goto L_0x007a
            L_0x005c:
                if (r14 <= r9) goto L_0x005f
                goto L_0x0062
            L_0x005f:
                if (r15 < r9) goto L_0x0062
                goto L_0x007a
            L_0x0062:
                r8 = 57
                r10 = 48
                if (r10 <= r9) goto L_0x0069
                goto L_0x006c
            L_0x0069:
                if (r8 < r9) goto L_0x006c
                goto L_0x007a
            L_0x006c:
                r8 = 43
                if (r9 != r8) goto L_0x0071
                goto L_0x007a
            L_0x0071:
                r8 = 45
                if (r9 != r8) goto L_0x0076
                goto L_0x007a
            L_0x0076:
                r8 = 46
                if (r9 != r8) goto L_0x007f
            L_0x007a:
                r8 = 97
                r10 = 122(0x7a, float:1.71E-43)
                goto L_0x004f
            L_0x007f:
                if (r9 != r5) goto L_0x0082
                goto L_0x0083
            L_0x0082:
                r4 = r6
            L_0x0083:
                java.lang.String r14 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                java.lang.String r15 = "http"
                java.lang.String r10 = "https"
                if (r4 == r6) goto L_0x00c4
                java.lang.String r5 = "https:"
                boolean r5 = fe.k.c1(r11, r5, r2, r13)
                if (r5 == 0) goto L_0x0098
                r0.f6572a = r10
                int r2 = r2 + 6
                goto L_0x00ca
            L_0x0098:
                java.lang.String r5 = "http:"
                boolean r5 = fe.k.c1(r11, r5, r2, r13)
                if (r5 == 0) goto L_0x00a5
                r0.f6572a = r15
                int r2 = r2 + 5
                goto L_0x00ca
            L_0x00a5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = a.a.d(r2)
                java.lang.String r3 = r11.substring(r3, r4)
                e6.e.C(r3, r14)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00c4:
                if (r1 == 0) goto L_0x04a4
                java.lang.String r4 = r1.f6565b
                r0.f6572a = r4
            L_0x00ca:
                r4 = r2
            L_0x00cb:
                r5 = 92
                r8 = 47
                if (r4 >= r12) goto L_0x00de
                char r9 = r11.charAt(r4)
                if (r9 == r5) goto L_0x00d9
                if (r9 != r8) goto L_0x00de
            L_0x00d9:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto L_0x00cb
            L_0x00de:
                r9 = 35
                if (r3 >= r7) goto L_0x0126
                if (r1 == 0) goto L_0x0126
                java.lang.String r4 = r1.f6565b
                java.lang.String r7 = r0.f6572a
                boolean r4 = e6.e.r(r4, r7)
                r4 = r4 ^ r13
                if (r4 == 0) goto L_0x00f0
                goto L_0x0126
            L_0x00f0:
                java.lang.String r3 = r29.e()
                r0.f6573b = r3
                java.lang.String r3 = r29.a()
                r0.f6574c = r3
                java.lang.String r3 = r1.f6568e
                r0.f6575d = r3
                int r3 = r1.f6569f
                r0.f6576e = r3
                java.util.List<java.lang.String> r3 = r0.f6577f
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.f6577f
                java.util.List r4 = r29.c()
                r3.addAll(r4)
                if (r2 == r12) goto L_0x011a
                char r3 = r11.charAt(r2)
                if (r3 != r9) goto L_0x0121
            L_0x011a:
                java.lang.String r1 = r29.d()
                r0.c(r1)
            L_0x0121:
                r1 = 0
                r20 = r12
                goto L_0x02dc
            L_0x0126:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r16 = r1
                r17 = r3
                r1 = r8
                r8 = r2
            L_0x012f:
                java.lang.String r2 = "@/\\?#"
                int r7 = jf.c.g(r11, r2, r8, r12)
                if (r7 == r12) goto L_0x013c
                char r2 = r11.charAt(r7)
                goto L_0x013d
            L_0x013c:
                r2 = r6
            L_0x013d:
                if (r2 == r6) goto L_0x0207
                if (r2 == r9) goto L_0x0207
                if (r2 == r1) goto L_0x0207
                if (r2 == r5) goto L_0x0207
                r1 = 63
                if (r2 == r1) goto L_0x0207
                r1 = 64
                if (r2 == r1) goto L_0x0156
                r19 = r9
                r20 = r12
                r21 = r15
                r12 = r10
                goto L_0x01f8
            L_0x0156:
                java.lang.String r6 = "%40"
                if (r16 != 0) goto L_0x01be
                r1 = 58
                int r5 = jf.c.f(r11, r1, r8, r7)
                r18 = 1
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 240(0xf0, float:3.36E-43)
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r30
                r2 = r8
                r3 = r5
                r8 = r5
                r5 = r18
                r13 = r6
                r6 = r19
                r24 = r7
                r7 = r20
                r25 = r8
                r8 = r21
                r19 = r9
                r9 = r22
                r20 = r12
                r12 = r10
                r10 = r23
                java.lang.String r1 = p002if.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                if (r17 == 0) goto L_0x019a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f6573b
                java.lang.String r1 = androidx.appcompat.widget.d.b(r2, r3, r13, r1)
            L_0x019a:
                r0.f6573b = r1
                r13 = r24
                r1 = r25
                if (r1 == r13) goto L_0x01b8
                int r2 = r1 + 1
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 240(0xf0, float:3.36E-43)
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r30
                r3 = r13
                java.lang.String r1 = p002if.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.f6574c = r1
                r16 = 1
            L_0x01b8:
                r21 = r15
                r17 = 1
                r15 = r13
                goto L_0x01f6
            L_0x01be:
                r13 = r6
                r19 = r9
                r20 = r12
                r12 = r10
                r10 = r7
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = r0.f6574c
                r9.append(r1)
                r9.append(r13)
                r5 = 1
                r6 = 0
                r7 = 0
                r13 = 0
                r21 = 0
                r22 = 240(0xf0, float:3.36E-43)
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r30
                r2 = r8
                r3 = r10
                r8 = r13
                r13 = r9
                r9 = r21
                r21 = r15
                r15 = r10
                r10 = r22
                java.lang.String r1 = p002if.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r13.append(r1)
                java.lang.String r1 = r13.toString()
                r0.f6574c = r1
            L_0x01f6:
                int r8 = r15 + 1
            L_0x01f8:
                r5 = 92
                r1 = 47
                r6 = -1
                r10 = r12
                r9 = r19
                r12 = r20
                r15 = r21
                r13 = 1
                goto L_0x012f
            L_0x0207:
                r20 = r12
                r21 = r15
                r15 = r7
                r12 = r10
                r7 = r8
            L_0x020e:
                if (r7 >= r15) goto L_0x022e
                char r1 = r11.charAt(r7)
                r2 = 58
                if (r1 == r2) goto L_0x022c
                r2 = 91
                if (r1 == r2) goto L_0x021e
                r1 = 1
                goto L_0x022a
            L_0x021e:
                r1 = 1
            L_0x021f:
                int r7 = r7 + r1
                if (r7 >= r15) goto L_0x022a
                char r2 = r11.charAt(r7)
                r3 = 93
                if (r2 != r3) goto L_0x021f
            L_0x022a:
                int r7 = r7 + r1
                goto L_0x020e
            L_0x022c:
                r13 = r7
                goto L_0x022f
            L_0x022e:
                r13 = r15
            L_0x022f:
                int r10 = r13 + 1
                r1 = 4
                if (r10 >= r15) goto L_0x029a
                r2 = 0
                java.lang.String r1 = p002if.r.b.d(r11, r8, r13, r2, r1)
                java.lang.String r1 = y.c.r0(r1)
                r0.f6575d = r1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = 0
                r12 = 0
                r16 = 248(0xf8, float:3.48E-43)
                r1 = r30
                r2 = r10
                r3 = r15
                r26 = r8
                r8 = r9
                r9 = r12
                r12 = r10
                r10 = r16
                java.lang.String r1 = p002if.r.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ NumberFormatException -> 0x0268 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0268 }
                r2 = 65535(0xffff, float:9.1834E-41)
                r3 = 1
                if (r3 <= r1) goto L_0x0262
                goto L_0x0268
            L_0x0262:
                if (r2 < r1) goto L_0x0268
                goto L_0x0269
            L_0x0265:
                r26 = r8
                r12 = r10
            L_0x0268:
                r1 = -1
            L_0x0269:
                r0.f6576e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0270
                r1 = 1
                goto L_0x0271
            L_0x0270:
                r1 = 0
            L_0x0271:
                if (r1 == 0) goto L_0x0277
                r1 = 0
                r8 = r26
                goto L_0x02d2
            L_0x0277:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = a.a.d(r1)
                java.lang.String r2 = r11.substring(r12, r15)
                e6.e.C(r2, r14)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x029a:
                r26 = r8
                r2 = -1
                r3 = 0
                java.lang.String r1 = p002if.r.b.d(r11, r8, r13, r3, r1)
                java.lang.String r1 = y.c.r0(r1)
                r0.f6575d = r1
                java.lang.String r1 = r0.f6572a
                e6.e.B(r1)
                int r4 = r1.hashCode()
                r5 = 3213448(0x310888, float:4.503E-39)
                if (r4 == r5) goto L_0x02c5
                r5 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r4 == r5) goto L_0x02bc
                goto L_0x02cf
            L_0x02bc:
                boolean r1 = r1.equals(r12)
                if (r1 == 0) goto L_0x02cf
                r2 = 443(0x1bb, float:6.21E-43)
                goto L_0x02cf
            L_0x02c5:
                r4 = r21
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x02cf
                r2 = 80
            L_0x02cf:
                r0.f6576e = r2
                r1 = r3
            L_0x02d2:
                java.lang.String r2 = r0.f6575d
                if (r2 == 0) goto L_0x02d8
                r2 = 1
                goto L_0x02d9
            L_0x02d8:
                r2 = r1
            L_0x02d9:
                if (r2 == 0) goto L_0x0481
                r2 = r15
            L_0x02dc:
                java.lang.String r3 = "?#"
                r4 = r20
                int r3 = jf.c.g(r11, r3, r2, r4)
                if (r2 != r3) goto L_0x02ec
                r13 = r0
                r12 = r4
                r0 = r11
                r1 = r0
                goto L_0x0437
            L_0x02ec:
                char r5 = r11.charAt(r2)
                java.lang.String r6 = ""
                r7 = 47
                if (r5 == r7) goto L_0x0315
                r7 = 92
                if (r5 != r7) goto L_0x02fb
                goto L_0x0315
            L_0x02fb:
                java.util.List<java.lang.String> r5 = r0.f6577f
                int r7 = r5.size()
                r8 = 1
                int r7 = r7 - r8
                r5.set(r7, r6)
                r12 = r0
                r16 = r12
                r5 = r2
                r14 = r3
                r15 = r14
                r17 = r4
                r13 = r6
                r18 = r8
                r2 = r11
                r3 = r1
                r1 = r2
                goto L_0x0337
            L_0x0315:
                r8 = 1
                java.util.List<java.lang.String> r5 = r0.f6577f
                r5.clear()
                java.util.List<java.lang.String> r5 = r0.f6577f
                r5.add(r6)
                r9 = r0
                r5 = r3
                r12 = r4
                r7 = r6
                r13 = r8
                r8 = r9
                r4 = r2
                r6 = r5
                r2 = r11
                r3 = r1
                r1 = r2
            L_0x032b:
                int r4 = r4 + r13
                r14 = r5
                r15 = r6
                r16 = r8
                r17 = r12
                r18 = r13
                r5 = r4
                r13 = r7
                r12 = r9
            L_0x0337:
                if (r5 >= r15) goto L_0x0431
                java.lang.String r4 = "/\\"
                int r10 = jf.c.g(r11, r4, r5, r15)
                if (r10 >= r15) goto L_0x0344
                r19 = r18
                goto L_0x0346
            L_0x0344:
                r19 = r3
            L_0x0346:
                r8 = 1
                r9 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 240(0xf0, float:3.36E-43)
                java.lang.String r7 = " \"<>^`{}|/\\?#"
                r4 = r11
                r6 = r10
                r24 = r10
                r10 = r20
                r20 = r11
                r11 = r21
                r27 = r12
                r12 = r22
                r0 = r13
                r13 = r23
                java.lang.String r4 = p002if.r.b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.String r5 = "."
                boolean r5 = e6.e.r(r4, r5)
                if (r5 != 0) goto L_0x037a
                java.lang.String r5 = "%2e"
                boolean r5 = fe.k.Y0(r4, r5)
                if (r5 == 0) goto L_0x0378
                goto L_0x037a
            L_0x0378:
                r5 = r3
                goto L_0x037c
            L_0x037a:
                r5 = r18
            L_0x037c:
                if (r5 == 0) goto L_0x0382
                r9 = r27
                goto L_0x0413
            L_0x0382:
                java.lang.String r5 = ".."
                boolean r5 = e6.e.r(r4, r5)
                if (r5 != 0) goto L_0x03a5
                java.lang.String r5 = "%2e."
                boolean r5 = fe.k.Y0(r4, r5)
                if (r5 != 0) goto L_0x03a5
                java.lang.String r5 = ".%2e"
                boolean r5 = fe.k.Y0(r4, r5)
                if (r5 != 0) goto L_0x03a5
                java.lang.String r5 = "%2e%2e"
                boolean r5 = fe.k.Y0(r4, r5)
                if (r5 == 0) goto L_0x03a3
                goto L_0x03a5
            L_0x03a3:
                r5 = r3
                goto L_0x03a7
            L_0x03a5:
                r5 = r18
            L_0x03a7:
                if (r5 == 0) goto L_0x03df
                r9 = r27
                java.util.List<java.lang.String> r4 = r9.f6577f
                int r5 = r4.size()
                int r5 = r5 - r18
                java.lang.Object r4 = r4.remove(r5)
                java.lang.String r4 = (java.lang.String) r4
                int r4 = r4.length()
                if (r4 != 0) goto L_0x03c1
                r3 = r18
            L_0x03c1:
                if (r3 == 0) goto L_0x03d9
                java.util.List<java.lang.String> r3 = r9.f6577f
                boolean r3 = r3.isEmpty()
                r3 = r3 ^ r18
                if (r3 == 0) goto L_0x03d9
                java.util.List<java.lang.String> r3 = r9.f6577f
                int r4 = r3.size()
                int r4 = r4 - r18
                r3.set(r4, r0)
                goto L_0x0413
            L_0x03d9:
                java.util.List<java.lang.String> r3 = r9.f6577f
                r3.add(r0)
                goto L_0x0413
            L_0x03df:
                r9 = r27
                java.util.List<java.lang.String> r3 = r9.f6577f
                int r5 = r3.size()
                int r5 = r5 + -1
                java.lang.Object r3 = r3.get(r5)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x03f8
                r3 = r18
                goto L_0x03f9
            L_0x03f8:
                r3 = 0
            L_0x03f9:
                if (r3 == 0) goto L_0x0407
                java.util.List<java.lang.String> r3 = r9.f6577f
                int r5 = r3.size()
                int r5 = r5 - r18
                r3.set(r5, r4)
                goto L_0x040c
            L_0x0407:
                java.util.List<java.lang.String> r3 = r9.f6577f
                r3.add(r4)
            L_0x040c:
                if (r19 == 0) goto L_0x0413
                java.util.List<java.lang.String> r3 = r9.f6577f
                r3.add(r0)
            L_0x0413:
                r3 = 0
                if (r19 == 0) goto L_0x0427
                r7 = r0
                r5 = r14
                r6 = r15
                r8 = r16
                r12 = r17
                r13 = r18
                r11 = r20
                r4 = r24
                r0 = r28
                goto L_0x032b
            L_0x0427:
                r13 = r0
                r12 = r9
                r11 = r20
                r5 = r24
                r0 = r28
                goto L_0x0337
            L_0x0431:
                r0 = r2
                r3 = r14
                r13 = r16
                r12 = r17
            L_0x0437:
                if (r3 >= r12) goto L_0x0463
                char r2 = r1.charAt(r3)
                r4 = 63
                if (r2 != r4) goto L_0x0463
                r2 = 35
                int r14 = jf.c.f(r1, r2, r3, r12)
                if.r$b r15 = p002if.r.f6563l
                int r3 = r3 + 1
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 208(0xd0, float:2.91E-43)
                java.lang.String r5 = " \"'<>#"
                r2 = r0
                r4 = r14
                java.lang.String r2 = p002if.r.b.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List r2 = r15.e(r2)
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r13.g = r2
                r3 = r14
            L_0x0463:
                if (r3 >= r12) goto L_0x0480
                char r1 = r1.charAt(r3)
                r2 = 35
                if (r1 != r2) goto L_0x0480
                int r3 = r3 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 176(0xb0, float:2.47E-43)
                java.lang.String r5 = ""
                r2 = r0
                r4 = r12
                java.lang.String r0 = p002if.r.b.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.f6578h = r0
            L_0x0480:
                return r13
            L_0x0481:
                java.lang.String r0 = "Invalid URL host: \""
                java.lang.StringBuilder r0 = a.a.d(r0)
                java.lang.String r1 = r11.substring(r8, r13)
                e6.e.C(r1, r14)
                r0.append(r1)
                r1 = 34
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x04a4:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p002if.r.a.d(if.r, java.lang.String):if.r$a");
        }

        /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if ((r8.f6574c.length() > 0) != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
            if (r1 != r3) goto L_0x00af;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String toString() {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r8.f6572a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r8.f6573b
                int r1 = r1.length()
                r2 = 0
                r3 = 1
                if (r1 <= 0) goto L_0x0023
                r1 = r3
                goto L_0x0024
            L_0x0023:
                r1 = r2
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r8.f6574c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = r3
                goto L_0x0033
            L_0x0032:
                r1 = r2
            L_0x0033:
                if (r1 == 0) goto L_0x0054
            L_0x0035:
                java.lang.String r1 = r8.f6573b
                r0.append(r1)
                java.lang.String r1 = r8.f6574c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0044
                r1 = r3
                goto L_0x0045
            L_0x0044:
                r1 = r2
            L_0x0045:
                if (r1 == 0) goto L_0x004f
                r0.append(r4)
                java.lang.String r1 = r8.f6574c
                r0.append(r1)
            L_0x004f:
                r1 = 64
                r0.append(r1)
            L_0x0054:
                java.lang.String r1 = r8.f6575d
                if (r1 == 0) goto L_0x0078
                r5 = 2
                int r1 = fe.o.l1(r1, r4, r2, r2, r5)
                if (r1 < 0) goto L_0x0060
                goto L_0x0061
            L_0x0060:
                r3 = r2
            L_0x0061:
                if (r3 == 0) goto L_0x0073
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r8.f6575d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0078
            L_0x0073:
                java.lang.String r1 = r8.f6575d
                r0.append(r1)
            L_0x0078:
                int r1 = r8.f6576e
                r3 = -1
                if (r1 != r3) goto L_0x0081
                java.lang.String r1 = r8.f6572a
                if (r1 == 0) goto L_0x00b5
            L_0x0081:
                int r1 = r8.b()
                java.lang.String r5 = r8.f6572a
                if (r5 == 0) goto L_0x00af
                int r6 = r5.hashCode()
                r7 = 3213448(0x310888, float:4.503E-39)
                if (r6 == r7) goto L_0x00a3
                r7 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r6 == r7) goto L_0x0098
                goto L_0x00ad
            L_0x0098:
                java.lang.String r6 = "https"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x00ad
                r3 = 443(0x1bb, float:6.21E-43)
                goto L_0x00ad
            L_0x00a3:
                java.lang.String r6 = "http"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x00ad
                r3 = 80
            L_0x00ad:
                if (r1 == r3) goto L_0x00b5
            L_0x00af:
                r0.append(r4)
                r0.append(r1)
            L_0x00b5:
                java.util.List<java.lang.String> r1 = r8.f6577f
                java.lang.String r3 = "$this$toPathString"
                e6.e.D(r1, r3)
                int r3 = r1.size()
            L_0x00c0:
                if (r2 >= r3) goto L_0x00d3
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r1.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r2 = r2 + 1
                goto L_0x00c0
            L_0x00d3:
                java.util.List<java.lang.String> r1 = r8.g
                if (r1 == 0) goto L_0x00e6
                r1 = 63
                r0.append(r1)
                if.r$b r1 = p002if.r.f6563l
                java.util.List<java.lang.String> r2 = r8.g
                e6.e.B(r2)
                r1.f(r2, r0)
            L_0x00e6:
                java.lang.String r1 = r8.f6578h
                if (r1 == 0) goto L_0x00f4
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r8.f6578h
                r0.append(r1)
            L_0x00f4:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                e6.e.C(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p002if.r.a.toString():java.lang.String");
        }
    }

    /* renamed from: if.r$b */
    public static final class b {
        /* JADX WARNING: Removed duplicated region for block: B:128:0x01ba A[LOOP:2: B:126:0x01b2->B:128:0x01ba, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x01e2 A[EDGE_INSN: B:149:0x01e2->B:129:0x01e2 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String a(java.lang.String r18, int r19, int r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25, java.nio.charset.Charset r26, int r27) {
            /*
                r0 = r18
                r1 = r27
                if.r$b r2 = p002if.r.f6563l
                r3 = r1 & 1
                if (r3 == 0) goto L_0x000c
                r3 = 0
                goto L_0x000e
            L_0x000c:
                r3 = r19
            L_0x000e:
                r4 = r1 & 2
                if (r4 == 0) goto L_0x0017
                int r4 = r18.length()
                goto L_0x0019
            L_0x0017:
                r4 = r20
            L_0x0019:
                r5 = r1 & 8
                if (r5 == 0) goto L_0x001f
                r5 = 0
                goto L_0x0021
            L_0x001f:
                r5 = r22
            L_0x0021:
                r6 = r1 & 16
                if (r6 == 0) goto L_0x0027
                r6 = 0
                goto L_0x0029
            L_0x0027:
                r6 = r23
            L_0x0029:
                r7 = r1 & 32
                if (r7 == 0) goto L_0x002f
                r7 = 0
                goto L_0x0031
            L_0x002f:
                r7 = r24
            L_0x0031:
                r8 = r1 & 64
                if (r8 == 0) goto L_0x0037
                r8 = 0
                goto L_0x0039
            L_0x0037:
                r8 = r25
            L_0x0039:
                r1 = r1 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x003f
                r1 = 0
                goto L_0x0041
            L_0x003f:
                r1 = r26
            L_0x0041:
                java.lang.String r9 = "$this$canonicalize"
                e6.e.D(r0, r9)
                r9 = r3
            L_0x0047:
                java.lang.String r10 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r9 >= r4) goto L_0x01fd
                int r11 = r0.codePointAt(r9)
                r12 = 127(0x7f, float:1.78E-43)
                r13 = 32
                r14 = 2
                if (r11 < r13) goto L_0x0088
                if (r11 == r12) goto L_0x0088
                r12 = 128(0x80, float:1.794E-43)
                if (r11 < r12) goto L_0x005e
                if (r8 == 0) goto L_0x0088
            L_0x005e:
                char r12 = (char) r11
                r13 = 0
                r15 = r21
                int r12 = fe.o.l1(r15, r12, r13, r13, r14)
                if (r12 < 0) goto L_0x006a
                r12 = 1
                goto L_0x006b
            L_0x006a:
                r12 = 0
            L_0x006b:
                if (r12 != 0) goto L_0x008a
                r12 = 37
                if (r11 != r12) goto L_0x007b
                if (r5 == 0) goto L_0x008a
                if (r6 == 0) goto L_0x007b
                boolean r12 = r2.c(r0, r9, r4)
                if (r12 == 0) goto L_0x008a
            L_0x007b:
                r12 = 43
                if (r11 != r12) goto L_0x0082
                if (r7 == 0) goto L_0x0082
                goto L_0x008a
            L_0x0082:
                int r10 = java.lang.Character.charCount(r11)
                int r9 = r9 + r10
                goto L_0x0047
            L_0x0088:
                r15 = r21
            L_0x008a:
                uf.e r11 = new uf.e
                r11.<init>()
                r11.E0(r0, r3, r9)
                r3 = 0
                r12 = r11
                r13 = 1
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
            L_0x00a0:
                if (r10 >= r5) goto L_0x01f8
                r18 = r13
                int r13 = r0.codePointAt(r10)
                r19 = r11
                if (r6 == 0) goto L_0x00bc
                r11 = 9
                if (r13 == r11) goto L_0x00cc
                r11 = 10
                if (r13 == r11) goto L_0x00cc
                r11 = 12
                if (r13 == r11) goto L_0x00cc
                r11 = 13
                if (r13 == r11) goto L_0x00cc
            L_0x00bc:
                r11 = 43
                if (r13 != r11) goto L_0x00cf
                if (r8 == 0) goto L_0x00cf
                if (r6 == 0) goto L_0x00c7
                java.lang.String r11 = "+"
                goto L_0x00c9
            L_0x00c7:
                java.lang.String r11 = "%2B"
            L_0x00c9:
                r12.D0(r11)
            L_0x00cc:
                r20 = r8
                goto L_0x00ff
            L_0x00cf:
                r11 = 32
                if (r13 < r11) goto L_0x0107
                r11 = 127(0x7f, float:1.78E-43)
                if (r13 == r11) goto L_0x0107
                r11 = 128(0x80, float:1.794E-43)
                if (r13 < r11) goto L_0x00dd
                if (r9 == 0) goto L_0x0107
            L_0x00dd:
                char r11 = (char) r13
                r20 = r8
                r8 = 0
                int r8 = fe.o.l1(r15, r11, r8, r8, r14)
                if (r8 < 0) goto L_0x00ea
                r8 = r18
                goto L_0x00eb
            L_0x00ea:
                r8 = 0
            L_0x00eb:
                if (r8 != 0) goto L_0x0109
                r8 = 37
                if (r13 != r8) goto L_0x00fc
                if (r6 == 0) goto L_0x0109
                if (r7 == 0) goto L_0x00fc
                boolean r8 = r3.c(r0, r10, r5)
                if (r8 != 0) goto L_0x00fc
                goto L_0x0109
            L_0x00fc:
                r12.F0(r13)
            L_0x00ff:
                r14 = r18
                r11 = r19
                r8 = r20
                goto L_0x01eb
            L_0x0107:
                r20 = r8
            L_0x0109:
                if (r4 != 0) goto L_0x0110
                uf.e r4 = new uf.e
                r4.<init>()
            L_0x0110:
                if (r2 == 0) goto L_0x01a4
                java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
                boolean r8 = e6.e.r(r2, r8)
                if (r8 == 0) goto L_0x011c
                goto L_0x01a4
            L_0x011c:
                int r8 = java.lang.Character.charCount(r13)
                int r8 = r8 + r10
                if (r10 < 0) goto L_0x0126
                r11 = r18
                goto L_0x0127
            L_0x0126:
                r11 = 0
            L_0x0127:
                if (r11 == 0) goto L_0x0194
                if (r8 < r10) goto L_0x012e
                r11 = r18
                goto L_0x012f
            L_0x012e:
                r11 = 0
            L_0x012f:
                if (r11 == 0) goto L_0x0182
                int r11 = r1.length()
                if (r8 > r11) goto L_0x013a
                r11 = r18
                goto L_0x013b
            L_0x013a:
                r11 = 0
            L_0x013b:
                if (r11 == 0) goto L_0x0165
                java.nio.charset.Charset r11 = fe.a.f5086b
                boolean r11 = e6.e.r(r2, r11)
                if (r11 == 0) goto L_0x014b
                r4.E0(r0, r10, r8)
                r11 = r19
                goto L_0x01ad
            L_0x014b:
                java.lang.String r8 = r0.substring(r10, r8)
                r11 = r19
                e6.e.C(r8, r11)
                byte[] r8 = r8.getBytes(r2)
                java.lang.String r14 = "(this as java.lang.String).getBytes(charset)"
                e6.e.C(r8, r14)
                int r14 = r8.length
                r19 = r0
                r0 = 0
                r4.w0(r8, r0, r14)
                goto L_0x01ab
            L_0x0165:
                java.lang.String r0 = "endIndex > string.length: "
                java.lang.String r2 = " > "
                java.lang.StringBuilder r0 = a8.a.d(r0, r8, r2)
                int r1 = r1.length()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0182:
                java.lang.String r0 = "endIndex < beginIndex: "
                java.lang.String r1 = " < "
                java.lang.String r0 = androidx.activity.result.d.b(r0, r8, r1, r10)
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0194:
                java.lang.String r0 = "beginIndex < 0: "
                java.lang.String r0 = b9.m.b(r0, r10)
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x01a4:
                r11 = r19
                r19 = r0
                r4.F0(r13)
            L_0x01ab:
                r0 = r19
            L_0x01ad:
                r8 = r20
                r14 = r13
                r13 = r18
            L_0x01b2:
                boolean r16 = r4.J()
                r18 = r0
                if (r16 != 0) goto L_0x01e2
                byte r0 = r4.readByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                r19 = r1
                r1 = 37
                r12.y0(r1)
                char[] r1 = p002if.r.f6562k
                int r16 = r0 >> 4
                r16 = r16 & 15
                r20 = r2
                char r2 = r1[r16]
                r12.y0(r2)
                r0 = r0 & 15
                char r0 = r1[r0]
                r12.y0(r0)
                r0 = r18
                r1 = r19
                r2 = r20
                goto L_0x01b2
            L_0x01e2:
                r19 = r1
                r20 = r2
                r17 = r14
                r14 = r13
                r13 = r17
            L_0x01eb:
                int r13 = java.lang.Character.charCount(r13)
                int r10 = r10 + r13
                r13 = 2
                r17 = r14
                r14 = r13
                r13 = r17
                goto L_0x00a0
            L_0x01f8:
                java.lang.String r0 = r12.T()
                goto L_0x0204
            L_0x01fd:
                java.lang.String r0 = r0.substring(r3, r4)
                e6.e.C(r0, r10)
            L_0x0204:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p002if.r.b.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset, int):java.lang.String");
        }

        public static String d(String str, int i, int i10, boolean z, int i11) {
            int i12;
            int i13;
            if ((i11 & 1) != 0) {
                i = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z = false;
            }
            e.D(str, "$this$percentDecode");
            int i14 = i;
            while (i12 < i10) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z)) {
                    uf.e eVar = new uf.e();
                    eVar.E0(str, i, i12);
                    while (i12 < i10) {
                        int codePointAt = str.codePointAt(i12);
                        if (codePointAt == 37 && (i13 = i12 + 2) < i10) {
                            int r10 = c.r(str.charAt(i12 + 1));
                            int r11 = c.r(str.charAt(i13));
                            if (!(r10 == -1 || r11 == -1)) {
                                eVar.y0((r10 << 4) + r11);
                                i12 = Character.charCount(codePointAt) + i13;
                            }
                        } else if (codePointAt == 43 && z) {
                            eVar.y0(32);
                            i12++;
                        }
                        eVar.F0(codePointAt);
                        i12 += Character.charCount(codePointAt);
                    }
                    return eVar.T();
                }
                i14 = i12 + 1;
            }
            String substring = str.substring(i, i10);
            e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int b(String str) {
            e.D(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final boolean c(String str, int i, int i10) {
            int i11 = i + 2;
            if (i11 >= i10 || str.charAt(i) != '%' || c.r(str.charAt(i + 1)) == -1 || c.r(str.charAt(i11)) == -1) {
                return false;
            }
            return true;
        }

        public final List<String> e(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int l12 = o.l1(str, '&', i, false, 4);
                if (l12 == -1) {
                    l12 = str.length();
                }
                int l13 = o.l1(str, '=', i, false, 4);
                if (l13 == -1 || l13 > l12) {
                    String substring = str.substring(i, l12);
                    e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, l13);
                    e.C(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(l13 + 1, l12);
                    e.C(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = l12 + 1;
            }
            return arrayList;
        }

        public final void f(List<String> list, StringBuilder sb2) {
            e.D(list, "$this$toQueryString");
            ce.a y02 = ad.c.y0(ad.c.C0(0, list.size()), 2);
            int i = y02.f3430a;
            int i10 = y02.f3431b;
            int i11 = y02.f3432c;
            if (i11 >= 0) {
                if (i > i10) {
                    return;
                }
            } else if (i < i10) {
                return;
            }
            while (true) {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i != i10) {
                    i += i11;
                } else {
                    return;
                }
            }
        }
    }

    public r(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        this.f6565b = str;
        this.f6566c = str2;
        this.f6567d = str3;
        this.f6568e = str4;
        this.f6569f = i10;
        this.g = list;
        this.f6570h = list2;
        this.i = str5;
        this.f6571j = str6;
        this.f6564a = e.r(str, "https");
    }

    public final String a() {
        if (this.f6567d.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int l12 = o.l1(this.f6571j, '@', 0, false, 6);
        String str = this.f6571j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(o.l1(this.f6571j, ':', this.f6565b.length() + 3, false, 4) + 1, l12);
        e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int l12 = o.l1(this.f6571j, '/', this.f6565b.length() + 3, false, 4);
        String str = this.f6571j;
        int g8 = c.g(str, "?#", l12, str.length());
        String str2 = this.f6571j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(l12, g8);
        e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> c() {
        int l12 = o.l1(this.f6571j, '/', this.f6565b.length() + 3, false, 4);
        String str = this.f6571j;
        int g8 = c.g(str, "?#", l12, str.length());
        ArrayList arrayList = new ArrayList();
        while (l12 < g8) {
            int i10 = l12 + 1;
            int f10 = c.f(this.f6571j, '/', i10, g8);
            String str2 = this.f6571j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i10, f10);
            e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            l12 = f10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f6570h == null) {
            return null;
        }
        int l12 = o.l1(this.f6571j, '?', 0, false, 6) + 1;
        String str = this.f6571j;
        int f10 = c.f(str, '#', l12, str.length());
        String str2 = this.f6571j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(l12, f10);
        e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f6566c.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f6565b.length() + 3;
        String str = this.f6571j;
        int g8 = c.g(str, ":@", length, str.length());
        String str2 = this.f6571j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, g8);
        e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r) && e.r(((r) obj).f6571j, this.f6571j);
    }

    public final a f(String str) {
        e.D(str, "link");
        try {
            a aVar = new a();
            aVar.d(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        a f10 = f("/...");
        e.B(f10);
        f10.f6573b = b.a(BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        f10.f6574c = b.a(BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        return f10.a().f6571j;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v13, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final URI h() {
        String str;
        String str2;
        a aVar = new a();
        aVar.f6572a = this.f6565b;
        aVar.f6573b = e();
        aVar.f6574c = a();
        aVar.f6575d = this.f6568e;
        aVar.f6576e = this.f6569f != f6563l.b(this.f6565b) ? this.f6569f : -1;
        aVar.f6577f.clear();
        aVar.f6577f.addAll(c());
        aVar.c(d());
        String str3 = null;
        if (this.i == null) {
            str = null;
        } else {
            String str4 = this.f6571j;
            Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
            str = str4.substring(o.l1(this.f6571j, '#', 0, false, 6) + 1);
            e.C(str, "(this as java.lang.String).substring(startIndex)");
        }
        aVar.f6578h = str;
        String str5 = aVar.f6575d;
        if (str5 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            e.C(compile, "compile(pattern)");
            str2 = compile.matcher(str5).replaceAll(BuildConfig.FLAVOR);
            e.C(str2, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            str2 = null;
        }
        aVar.f6575d = str2;
        int size = aVar.f6577f.size();
        for (int i10 = 0; i10 < size; i10++) {
            ? r92 = aVar.f6577f;
            r92.set(i10, b.a((String) r92.get(i10), 0, 0, "[]", true, true, false, false, (Charset) null, 227));
        }
        List<String> list = aVar.g;
        if (list != null) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str6 = list.get(i11);
                list.set(i11, str6 != null ? b.a(str6, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195) : null);
            }
        }
        String str7 = aVar.f6578h;
        if (str7 != null) {
            str3 = b.a(str7, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163);
        }
        aVar.f6578h = str3;
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e10) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                e.C(compile2, "compile(pattern)");
                String replaceAll = compile2.matcher(aVar2).replaceAll(BuildConfig.FLAVOR);
                e.C(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                e.C(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f6571j.hashCode();
    }

    public final String toString() {
        return this.f6571j;
    }
}
