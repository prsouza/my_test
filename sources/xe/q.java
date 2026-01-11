package xe;

import c3.k;
import e6.e;
import java.net.URI;
import jc.b;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public int f13218a;

    /* renamed from: b  reason: collision with root package name */
    public long f13219b;

    /* renamed from: c  reason: collision with root package name */
    public i f13220c;

    /* renamed from: d  reason: collision with root package name */
    public URI f13221d;

    /* renamed from: e  reason: collision with root package name */
    public URI f13222e;

    /* renamed from: f  reason: collision with root package name */
    public URI f13223f;
    public long g;

    /* renamed from: h  reason: collision with root package name */
    public long f13224h;
    public long i;

    /* renamed from: j  reason: collision with root package name */
    public long f13225j;

    /* renamed from: k  reason: collision with root package name */
    public long f13226k;

    public q() {
        this(0, 0, (i) null, (URI) null, (URI) null, (URI) null, 0, 0, 0, 2047);
    }

    public q(int i10, long j10, i iVar, URI uri, URI uri2, URI uri3, long j11, long j12, long j13, int i11) {
        long j14;
        int i12 = i11;
        int i13 = (i12 & 1) != 0 ? 7 : i10;
        long j15 = (i12 & 2) != 0 ? 0 : j10;
        i iVar2 = (i12 & 4) != 0 ? i.CRC32 : iVar;
        URI h10 = (i12 & 8) != 0 ? b.h() : uri;
        URI h11 = (i12 & 16) != 0 ? b.h() : uri2;
        URI h12 = (i12 & 32) != 0 ? b.h() : uri3;
        long currentTimeMillis = (i12 & 64) != 0 ? System.currentTimeMillis() : j11;
        if ((i12 & 128) != 0) {
            j14 = k.A;
            k.A = 1 + j14;
        } else {
            j14 = j12;
        }
        long j16 = (i12 & 256) != 0 ? 3600000 : j13;
        e.D(iVar2, "crcType");
        e.D(h10, "destination");
        e.D(h11, "source");
        e.D(h12, "reportTo");
        this.f13218a = i13;
        this.f13219b = j15;
        this.f13220c = iVar2;
        this.f13221d = h10;
        this.f13222e = h11;
        this.f13223f = h12;
        this.g = currentTimeMillis;
        this.f13224h = j14;
        this.i = j16;
        this.f13225j = 0;
        this.f13226k = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f13218a == qVar.f13218a && this.f13219b == qVar.f13219b && e.r(this.f13220c, qVar.f13220c) && e.r(this.f13221d, qVar.f13221d) && e.r(this.f13222e, qVar.f13222e) && e.r(this.f13223f, qVar.f13223f) && this.g == qVar.g && this.f13224h == qVar.f13224h && this.i == qVar.i && this.f13225j == qVar.f13225j && this.f13226k == qVar.f13226k;
    }

    public final int hashCode() {
        long j10 = this.f13219b;
        int i10 = ((this.f13218a * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        i iVar = this.f13220c;
        int i11 = 0;
        int hashCode = (i10 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        URI uri = this.f13221d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        URI uri2 = this.f13222e;
        int hashCode3 = (hashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        URI uri3 = this.f13223f;
        if (uri3 != null) {
            i11 = uri3.hashCode();
        }
        long j11 = this.g;
        long j12 = this.f13224h;
        long j13 = this.i;
        long j14 = this.f13225j;
        long j15 = this.f13226k;
        return ((((((((((hashCode3 + i11) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }

    public final String toString() {
        StringBuilder q10 = a.b.q("PrimaryBlock(version=");
        q10.append(this.f13218a);
        q10.append(", procV7Flags=");
        q10.append(this.f13219b);
        q10.append(", crcType=");
        q10.append(this.f13220c);
        q10.append(", destination=");
        q10.append(this.f13221d);
        q10.append(", source=");
        q10.append(this.f13222e);
        q10.append(", reportTo=");
        q10.append(this.f13223f);
        q10.append(", creationTimestamp=");
        q10.append(this.g);
        q10.append(", sequenceNumber=");
        q10.append(this.f13224h);
        q10.append(", lifetime=");
        q10.append(this.i);
        q10.append(", fragmentOffset=");
        q10.append(this.f13225j);
        q10.append(", appDataLength=");
        q10.append(this.f13226k);
        q10.append(")");
        return q10.toString();
    }
}
