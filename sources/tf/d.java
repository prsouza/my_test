package tf;

import a8.a;
import e6.e;
import io.sentry.cache.EnvelopeCache;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import nd.o;

public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final d f11606a = new d();

    public final String a(String str) {
        if (!c(str)) {
            return str;
        }
        Locale locale = Locale.US;
        e.C(locale, "Locale.US");
        String lowerCase = str.toLowerCase(locale);
        e.C(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List<String> b(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return o.f8966a;
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!e.r(next.get(0), Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return o.f8966a;
        }
    }

    public final boolean c(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j10 = 0;
                int i10 = 0;
                while (i10 < length2) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        j10++;
                    } else {
                        if (charAt < 2048) {
                            i = 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i = 3;
                        } else {
                            int i11 = i10 + 1;
                            char charAt2 = i11 < length2 ? str.charAt(i11) : 0;
                            if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                j10++;
                                i10 = i11;
                            } else {
                                j10 += (long) 4;
                                i10 += 2;
                            }
                        }
                        j10 += (long) i;
                    }
                    i10++;
                }
                if (length == ((int) j10)) {
                    return true;
                }
                return false;
            }
            StringBuilder d10 = a.d("endIndex > string.length: ", length2, " > ");
            d10.append(str.length());
            throw new IllegalArgumentException(d10.toString().toString());
        }
        throw new IllegalArgumentException(androidx.activity.result.d.b("endIndex < beginIndex: ", length2, " < ", 0).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0113 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.String r10, java.security.cert.X509Certificate r11) {
        /*
            r9 = this;
            java.lang.String r0 = "host"
            e6.e.D(r10, r0)
            byte[] r0 = jf.c.f7250a
            fe.c r0 = jf.c.f7255f
            boolean r0 = r0.a(r10)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.String r10 = y.c.r0(r10)
            r0 = 7
            java.util.List r11 = r9.b(r11, r0)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0022
            goto L_0x0112
        L_0x0022:
            java.util.Iterator r11 = r11.iterator()
        L_0x0026:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = y.c.r0(r0)
            boolean r0 = e6.e.r(r10, r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x0113
        L_0x003e:
            java.lang.String r10 = r9.a(r10)
            r0 = 2
            java.util.List r11 = r9.b(r11, r0)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x004f
            goto L_0x0112
        L_0x004f:
            java.util.Iterator r11 = r11.iterator()
        L_0x0053:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            tf.d r3 = f11606a
            int r4 = r10.length()
            if (r4 != 0) goto L_0x0069
            r4 = r1
            goto L_0x006a
        L_0x0069:
            r4 = r2
        L_0x006a:
            if (r4 != 0) goto L_0x010e
            java.lang.String r4 = "."
            boolean r5 = fe.k.d1(r10, r4, r2)
            if (r5 != 0) goto L_0x010e
            java.lang.String r5 = ".."
            boolean r6 = r10.endsWith(r5)
            if (r6 == 0) goto L_0x007e
            goto L_0x010e
        L_0x007e:
            if (r0 == 0) goto L_0x0089
            int r6 = r0.length()
            if (r6 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r6 = r2
            goto L_0x008a
        L_0x0089:
            r6 = r1
        L_0x008a:
            if (r6 != 0) goto L_0x010e
            boolean r6 = fe.k.d1(r0, r4, r2)
            if (r6 != 0) goto L_0x010e
            boolean r5 = r0.endsWith(r5)
            if (r5 == 0) goto L_0x009a
            goto L_0x010e
        L_0x009a:
            boolean r5 = r10.endsWith(r4)
            if (r5 != 0) goto L_0x00a5
            java.lang.String r5 = a8.a.c(r10, r4)
            goto L_0x00a6
        L_0x00a5:
            r5 = r10
        L_0x00a6:
            boolean r6 = r0.endsWith(r4)
            if (r6 != 0) goto L_0x00b0
            java.lang.String r0 = a8.a.c(r0, r4)
        L_0x00b0:
            java.lang.String r0 = r3.a(r0)
            java.lang.String r3 = "*"
            boolean r3 = fe.o.g1(r0, r3)
            if (r3 != 0) goto L_0x00c1
            boolean r0 = e6.e.r(r5, r0)
            goto L_0x010f
        L_0x00c1:
            java.lang.String r3 = "*."
            boolean r4 = fe.k.d1(r0, r3, r2)
            if (r4 == 0) goto L_0x010e
            r4 = 42
            r6 = 4
            int r4 = fe.o.l1(r0, r4, r1, r2, r6)
            r7 = -1
            if (r4 == r7) goto L_0x00d4
            goto L_0x010e
        L_0x00d4:
            int r4 = r5.length()
            int r8 = r0.length()
            if (r4 >= r8) goto L_0x00df
            goto L_0x010e
        L_0x00df:
            boolean r3 = e6.e.r(r3, r0)
            if (r3 == 0) goto L_0x00e6
            goto L_0x010e
        L_0x00e6:
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
            e6.e.C(r0, r3)
            boolean r3 = r5.endsWith(r0)
            if (r3 != 0) goto L_0x00f6
            goto L_0x010e
        L_0x00f6:
            int r3 = r5.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x010c
            r0 = 46
            int r3 = r3 + -1
            int r0 = fe.o.o1(r5, r0, r3, r6)
            if (r0 == r7) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r0 = r1
            goto L_0x010f
        L_0x010e:
            r0 = r2
        L_0x010f:
            if (r0 == 0) goto L_0x0053
            goto L_0x0113
        L_0x0112:
            r1 = r2
        L_0x0113:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.d.d(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        e.D(str, "host");
        e.D(sSLSession, EnvelopeCache.PREFIX_CURRENT_SESSION_FILE);
        if (!c(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return d(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
