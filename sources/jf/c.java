package jf;

import a.b;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fe.a;
import fe.k;
import fe.o;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import nd.m;
import p002if.a0;
import p002if.c0;
import p002if.q;
import p002if.t;
import p002if.v;
import uf.b0;
import uf.e;
import uf.h;
import uf.i;
import uf.r;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f7250a;

    /* renamed from: b  reason: collision with root package name */
    public static final q f7251b = q.f6559b.c(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final c0 f7252c;

    /* renamed from: d  reason: collision with root package name */
    public static final r f7253d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f7254e;

    /* renamed from: f  reason: collision with root package name */
    public static final fe.c f7255f = new fe.c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        f7250a = bArr;
        e eVar = new e();
        eVar.v0(bArr);
        long j10 = (long) 0;
        f7252c = new c0(eVar, (t) null, j10);
        c(j10, j10, j10);
        r.a aVar = r.f11975c;
        i.a aVar2 = i.f11956t;
        f7253d = aVar.b(aVar2.a("efbbbf"), aVar2.a("feff"), aVar2.a("fffe"), aVar2.a("0000ffff"), aVar2.a("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        e6.e.B(timeZone);
        f7254e = timeZone;
        Class<v> cls = v.class;
        String t12 = o.t1(v.class.getName(), "okhttp3.");
        if (o.h1(t12, "Client")) {
            t12 = t12.substring(0, t12.length() - "Client".length());
            e6.e.C(t12, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        g = t12;
    }

    public static final Throwable A(Exception exc, List<? extends Exception> list) {
        e6.e.D(exc, "$this$withSuppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception D : list) {
            b.D(exc, D);
        }
        return exc;
    }

    public static final boolean a(p002if.r rVar, p002if.r rVar2) {
        e6.e.D(rVar, "$this$canReuseConnectionFor");
        e6.e.D(rVar2, "other");
        return e6.e.r(rVar.f6568e, rVar2.f6568e) && rVar.f6569f == rVar2.f6569f && e6.e.r(rVar.f6565b, rVar2.f6565b);
    }

    public static final int b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        boolean z = true;
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(60);
            if (millis <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                if (millis == 0) {
                    z = false;
                }
                if (z) {
                    return (int) millis;
                }
                throw new IllegalArgumentException("timeout too small.".toString());
            }
            throw new IllegalArgumentException("timeout too large.".toString());
        }
        throw new IllegalStateException("unit == null".toString());
    }

    public static final void c(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        e6.e.D(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!e6.e.r(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c10, int i, int i10) {
        e6.e.D(str, "$this$delimiterOffset");
        while (i < i10) {
            if (str.charAt(i) == c10) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int g(String str, String str2, int i, int i10) {
        e6.e.D(str, "$this$delimiterOffset");
        while (i < i10) {
            boolean z = false;
            if (o.l1(str2, str.charAt(i), 0, false, 2) >= 0) {
                z = true;
            }
            if (z) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final boolean h(b0 b0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e6.e.D(b0Var, "$this$discard");
        e6.e.D(timeUnit, "timeUnit");
        try {
            return u(b0Var, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        e6.e.D(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        e6.e.C(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        e6.e.D(strArr, "$this$hasIntersection");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(a0 a0Var) {
        String d10 = a0Var.f6457u.d("Content-Length");
        if (d10 != null) {
            try {
                return Long.parseLong(d10);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @SafeVarargs
    public static final <T> List<T> l(T... tArr) {
        e6.e.D(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(b.o0(Arrays.copyOf(objArr, objArr.length)));
        e6.e.C(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (e6.e.F(charAt, 31) <= 0 || e6.e.F(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int n(String str, int i, int i10) {
        e6.e.D(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i10) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int o(String str, int i, int i10) {
        e6.e.D(str, "$this$indexOfLastNonAsciiWhitespace");
        int i11 = i10 - 1;
        if (i11 >= i) {
            while (true) {
                char charAt = str.charAt(i11);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i11 == i) {
                        break;
                    }
                    i11--;
                } else {
                    return i11 + 1;
                }
            }
        }
        return i;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        e6.e.D(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean q(String str) {
        e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return k.Y0(str, "Authorization") || k.Y0(str, "Cookie") || k.Y0(str, "Proxy-Authorization") || k.Y0(str, "Set-Cookie");
    }

    public static final int r(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset s(h hVar, Charset charset) throws IOException {
        Charset charset2;
        e6.e.D(hVar, "$this$readBomAsCharset");
        e6.e.D(charset, "default");
        int l10 = hVar.l(f7253d);
        if (l10 == -1) {
            return charset;
        }
        if (l10 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            e6.e.C(charset3, "UTF_8");
            return charset3;
        } else if (l10 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            e6.e.C(charset4, "UTF_16BE");
            return charset4;
        } else if (l10 != 2) {
            if (l10 == 3) {
                a aVar = a.f5085a;
                charset2 = a.f5089e;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32BE");
                    e6.e.C(charset2, "forName(\"UTF-32BE\")");
                    a.f5089e = charset2;
                }
            } else if (l10 == 4) {
                a aVar2 = a.f5085a;
                charset2 = a.f5088d;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32LE");
                    e6.e.C(charset2, "forName(\"UTF-32LE\")");
                    a.f5088d = charset2;
                }
            } else {
                throw new AssertionError();
            }
            return charset2;
        } else {
            Charset charset5 = StandardCharsets.UTF_16LE;
            e6.e.C(charset5, "UTF_16LE");
            return charset5;
        }
    }

    public static final int t(h hVar) throws IOException {
        e6.e.D(hVar, "$this$readMedium");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r6 == Long.MAX_VALUE) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r6 != Long.MAX_VALUE) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r12.d().a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        r12.d().d(r1 + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        return r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean u(uf.b0 r12, int r13) throws java.io.IOException {
        /*
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r1 = "$this$skipAll"
            e6.e.D(r12, r1)
            java.lang.String r1 = "timeUnit"
            e6.e.D(r0, r1)
            long r1 = java.lang.System.nanoTime()
            uf.c0 r3 = r12.d()
            boolean r3 = r3.e()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L_0x0029
            uf.c0 r3 = r12.d()
            long r6 = r3.c()
            long r6 = r6 - r1
            goto L_0x002a
        L_0x0029:
            r6 = r4
        L_0x002a:
            uf.c0 r3 = r12.d()
            long r8 = (long) r13
            long r8 = r0.toNanos(r8)
            long r8 = java.lang.Math.min(r6, r8)
            long r8 = r8 + r1
            r3.d(r8)
            uf.e r13 = new uf.e     // Catch:{ InterruptedIOException -> 0x006c, all -> 0x0056 }
            r13.<init>()     // Catch:{ InterruptedIOException -> 0x006c, all -> 0x0056 }
        L_0x0040:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = r12.I(r13, r8)     // Catch:{ InterruptedIOException -> 0x006c, all -> 0x0056 }
            r10 = -1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0050
            r13.a()     // Catch:{ InterruptedIOException -> 0x006c, all -> 0x0056 }
            goto L_0x0040
        L_0x0050:
            r13 = 1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0079
            goto L_0x0071
        L_0x0056:
            r13 = move-exception
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            uf.c0 r12 = r12.d()
            r12.a()
            goto L_0x006b
        L_0x0063:
            uf.c0 r12 = r12.d()
            long r1 = r1 + r6
            r12.d(r1)
        L_0x006b:
            throw r13
        L_0x006c:
            r13 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0079
        L_0x0071:
            uf.c0 r12 = r12.d()
            r12.a()
            goto L_0x0081
        L_0x0079:
            uf.c0 r12 = r12.d()
            long r1 = r1 + r6
            r12.d(r1)
        L_0x0081:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.c.u(uf.b0, int):boolean");
    }

    public static final q v(List<pf.c> list) {
        ArrayList arrayList = new ArrayList(20);
        for (pf.c next : list) {
            i iVar = next.f9927b;
            i iVar2 = next.f9928c;
            String r10 = iVar.r();
            String r11 = iVar2.r();
            arrayList.add(r10);
            arrayList.add(o.D1(r11).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new q((String[]) array);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String w(p002if.r r4, boolean r5) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            e6.e.D(r4, r0)
            java.lang.String r0 = r4.f6568e
            java.lang.String r1 = ":"
            boolean r0 = fe.o.g1(r0, r1)
            if (r0 == 0) goto L_0x0028
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r4.f6568e
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x002a
        L_0x0028:
            java.lang.String r0 = r4.f6568e
        L_0x002a:
            if (r5 != 0) goto L_0x005d
            int r5 = r4.f6569f
            java.lang.String r1 = r4.f6565b
            java.lang.String r2 = "scheme"
            e6.e.D(r1, r2)
            int r2 = r1.hashCode()
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r3) goto L_0x004f
            r3 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r3) goto L_0x0044
            goto L_0x005a
        L_0x0044:
            java.lang.String r2 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005a
            r1 = 443(0x1bb, float:6.21E-43)
            goto L_0x005b
        L_0x004f:
            java.lang.String r2 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005a
            r1 = 80
            goto L_0x005b
        L_0x005a:
            r1 = -1
        L_0x005b:
            if (r5 == r1) goto L_0x0073
        L_0x005d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            int r4 = r4.f6569f
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.c.w(if.r, boolean):java.lang.String");
    }

    public static final <T> List<T> x(List<? extends T> list) {
        e6.e.D(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(m.l1(list));
        e6.e.C(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int y(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String z(String str, int i, int i10) {
        int n10 = n(str, i, i10);
        String substring = str.substring(n10, o(str, n10, i10));
        e6.e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
