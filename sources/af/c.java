package af;

import e6.e;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import jc.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f353a;

    /* renamed from: b  reason: collision with root package name */
    public long f354b;

    /* renamed from: c  reason: collision with root package name */
    public long f355c;

    /* renamed from: d  reason: collision with root package name */
    public long f356d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f357e;

    /* renamed from: f  reason: collision with root package name */
    public int f358f;
    public URI g;

    /* renamed from: h  reason: collision with root package name */
    public long f359h;
    public long i;

    /* renamed from: j  reason: collision with root package name */
    public long f360j;

    public c() {
        this(0, 0, 0, 0, (List) null, 0, (URI) null, 0, 0, 0, 1023);
    }

    public c(long j10, long j11, long j12, long j13, List list, int i10, URI uri, long j14, long j15, long j16, int i11) {
        ArrayList arrayList = new ArrayList();
        int d10 = d.NoInformation.d();
        URI h10 = b.h();
        this.f353a = 0;
        this.f354b = 0;
        this.f355c = 0;
        this.f356d = 0;
        this.f357e = arrayList;
        this.f358f = d10;
        this.g = h10;
        this.f359h = 0;
        this.i = -1;
        this.f360j = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f353a == cVar.f353a && this.f354b == cVar.f354b && this.f355c == cVar.f355c && this.f356d == cVar.f356d && e.r(this.f357e, cVar.f357e) && this.f358f == cVar.f358f && e.r(this.g, cVar.g) && this.f359h == cVar.f359h && this.i == cVar.i && this.f360j == cVar.f360j;
    }

    public final int hashCode() {
        long j10 = this.f353a;
        long j11 = this.f354b;
        long j12 = this.f355c;
        long j13 = this.f356d;
        int i10 = ((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        List<b> list = this.f357e;
        int i11 = 0;
        int hashCode = (((i10 + (list != null ? list.hashCode() : 0)) * 31) + this.f358f) * 31;
        URI uri = this.g;
        if (uri != null) {
            i11 = uri.hashCode();
        }
        long j14 = this.f359h;
        long j15 = this.i;
        long j16 = this.f360j;
        return ((((((hashCode + i11) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) ((j16 >>> 32) ^ j16));
    }

    public final String toString() {
        StringBuilder q10 = a.b.q("StatusReport(received=");
        q10.append(this.f353a);
        q10.append(", forwarded=");
        q10.append(this.f354b);
        q10.append(", delivered=");
        q10.append(this.f355c);
        q10.append(", deleted=");
        q10.append(this.f356d);
        q10.append(", otherAssertions=");
        q10.append(this.f357e);
        q10.append(", bundleStatusReportReason=");
        q10.append(this.f358f);
        q10.append(", sourceNodeId=");
        q10.append(this.g);
        q10.append(", creationTimestamp=");
        q10.append(this.f359h);
        q10.append(", fragmentOffset=");
        q10.append(this.i);
        q10.append(", appDataLength=");
        q10.append(this.f360j);
        q10.append(")");
        return q10.toString();
    }
}
