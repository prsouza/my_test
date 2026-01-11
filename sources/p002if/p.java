package p002if;

import b9.m;
import e6.e;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import jf.c;
import md.h;
import nd.g;
import nd.o;
import org.slf4j.helpers.MessageFormatter;

/* renamed from: if.p  reason: invalid package */
public final class p {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6552e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final h f6553a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f6554b;

    /* renamed from: c  reason: collision with root package name */
    public final g f6555c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f6556d;

    /* renamed from: if.p$a */
    public static final class a {

        /* renamed from: if.p$a$a  reason: collision with other inner class name */
        public static final class C0111a extends yd.h implements xd.a<List<? extends Certificate>> {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ List f6557b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0111a(List list) {
                super(0);
                this.f6557b = list;
            }

            public final Object c() {
                return this.f6557b;
            }
        }

        public final p a(SSLSession sSLSession) throws IOException {
            List list;
            List list2;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException(a8.a.c("cipherSuite == ", cipherSuite));
                }
                g b10 = g.f6516t.b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!e.r("NONE", protocol)) {
                    e0 a10 = e0.Companion.a(protocol);
                    try {
                        Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                        if (peerCertificates != null) {
                            list = c.l((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length));
                        } else {
                            list = o.f8966a;
                        }
                    } catch (SSLPeerUnverifiedException unused) {
                        list = o.f8966a;
                    }
                    Certificate[] localCertificates = sSLSession.getLocalCertificates();
                    if (localCertificates != null) {
                        list2 = c.l((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length));
                    } else {
                        list2 = o.f8966a;
                    }
                    return new p(a10, b10, list2, new C0111a(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }
    }

    /* renamed from: if.p$b */
    public static final class b extends yd.h implements xd.a<List<? extends Certificate>> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ xd.a f6558b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(xd.a aVar) {
            super(0);
            this.f6558b = aVar;
        }

        public final Object c() {
            try {
                return (List) this.f6558b.c();
            } catch (SSLPeerUnverifiedException unused) {
                return o.f8966a;
            }
        }
    }

    public p(e0 e0Var, g gVar, List<? extends Certificate> list, xd.a<? extends List<? extends Certificate>> aVar) {
        e.D(e0Var, "tlsVersion");
        e.D(gVar, "cipherSuite");
        e.D(list, "localCertificates");
        this.f6554b = e0Var;
        this.f6555c = gVar;
        this.f6556d = list;
        this.f6553a = new h(new b(aVar));
    }

    public final String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        e.C(type, "type");
        return type;
    }

    public final List<Certificate> b() {
        return (List) this.f6553a.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return pVar.f6554b == this.f6554b && e.r(pVar.f6555c, this.f6555c) && e.r(pVar.b(), b()) && e.r(pVar.f6556d, this.f6556d);
        }
    }

    public final int hashCode() {
        int hashCode = this.f6555c.hashCode();
        int hashCode2 = b().hashCode();
        return this.f6556d.hashCode() + ((hashCode2 + ((hashCode + ((this.f6554b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> b10 = b();
        ArrayList arrayList = new ArrayList(g.S0(b10));
        for (Certificate a10 : b10) {
            arrayList.add(a(a10));
        }
        String obj = arrayList.toString();
        StringBuilder c10 = m.c("Handshake{", "tlsVersion=");
        c10.append(this.f6554b);
        c10.append(' ');
        c10.append("cipherSuite=");
        c10.append(this.f6555c);
        c10.append(' ');
        c10.append("peerCertificates=");
        c10.append(obj);
        c10.append(' ');
        c10.append("localCertificates=");
        List<Certificate> list = this.f6556d;
        ArrayList arrayList2 = new ArrayList(g.S0(list));
        for (Certificate a11 : list) {
            arrayList2.add(a(a11));
        }
        c10.append(arrayList2);
        c10.append(MessageFormatter.DELIM_STOP);
        return c10.toString();
    }
}
