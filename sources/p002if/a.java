package p002if;

import b9.m;
import e6.e;
import fe.k;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p002if.r;
import y.c;

/* renamed from: if.a  reason: invalid package */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final r f6443a;

    /* renamed from: b  reason: collision with root package name */
    public final List<w> f6444b;

    /* renamed from: c  reason: collision with root package name */
    public final List<i> f6445c;

    /* renamed from: d  reason: collision with root package name */
    public final m f6446d;

    /* renamed from: e  reason: collision with root package name */
    public final SocketFactory f6447e;

    /* renamed from: f  reason: collision with root package name */
    public final SSLSocketFactory f6448f;
    public final HostnameVerifier g;

    /* renamed from: h  reason: collision with root package name */
    public final f f6449h;
    public final b i;

    /* renamed from: j  reason: collision with root package name */
    public final Proxy f6450j = null;

    /* renamed from: k  reason: collision with root package name */
    public final ProxySelector f6451k;

    public a(String str, int i10, m mVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, List list, List list2, ProxySelector proxySelector) {
        e.D(str, "uriHost");
        e.D(mVar, "dns");
        e.D(socketFactory, "socketFactory");
        e.D(bVar, "proxyAuthenticator");
        e.D(list, "protocols");
        e.D(list2, "connectionSpecs");
        e.D(proxySelector, "proxySelector");
        this.f6446d = mVar;
        this.f6447e = socketFactory;
        this.f6448f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.f6449h = fVar;
        this.i = bVar;
        this.f6451k = proxySelector;
        r.a aVar = new r.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        boolean z = true;
        if (k.Y0(str2, "http")) {
            aVar.f6572a = "http";
        } else if (k.Y0(str2, "https")) {
            aVar.f6572a = "https";
        } else {
            throw new IllegalArgumentException(a8.a.c("unexpected scheme: ", str2));
        }
        String r02 = c.r0(r.b.d(str, 0, 0, false, 7));
        if (r02 != null) {
            aVar.f6575d = r02;
            if ((1 > i10 || 65535 < i10) ? false : z) {
                aVar.f6576e = i10;
                this.f6443a = aVar.a();
                this.f6444b = jf.c.x(list);
                this.f6445c = jf.c.x(list2);
                return;
            }
            throw new IllegalArgumentException(m.b("unexpected port: ", i10).toString());
        }
        throw new IllegalArgumentException(a8.a.c("unexpected host: ", str));
    }

    public final boolean a(a aVar) {
        e.D(aVar, "that");
        return e.r(this.f6446d, aVar.f6446d) && e.r(this.i, aVar.i) && e.r(this.f6444b, aVar.f6444b) && e.r(this.f6445c, aVar.f6445c) && e.r(this.f6451k, aVar.f6451k) && e.r(this.f6450j, aVar.f6450j) && e.r(this.f6448f, aVar.f6448f) && e.r(this.g, aVar.g) && e.r(this.f6449h, aVar.f6449h) && this.f6443a.f6569f == aVar.f6443a.f6569f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return e.r(this.f6443a, aVar.f6443a) && a(aVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f6446d.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = this.f6444b.hashCode();
        int hashCode4 = this.f6445c.hashCode();
        int hashCode5 = this.f6451k.hashCode();
        int hashCode6 = Objects.hashCode(this.f6450j);
        int hashCode7 = Objects.hashCode(this.f6448f);
        int hashCode8 = Objects.hashCode(this.g);
        return Objects.hashCode(this.f6449h) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f6443a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2;
        StringBuilder d10 = a.a.d("Address{");
        d10.append(this.f6443a.f6568e);
        d10.append(':');
        d10.append(this.f6443a.f6569f);
        d10.append(", ");
        if (this.f6450j != null) {
            sb2 = a.a.d("proxy=");
            obj = this.f6450j;
        } else {
            sb2 = a.a.d("proxySelector=");
            obj = this.f6451k;
        }
        sb2.append(obj);
        d10.append(sb2.toString());
        d10.append("}");
        return d10.toString();
    }
}
