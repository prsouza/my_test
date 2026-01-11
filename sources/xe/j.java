package xe;

import a.b;
import e6.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f13208a;

    /* renamed from: b  reason: collision with root package name */
    public int f13209b;

    /* renamed from: c  reason: collision with root package name */
    public long f13210c;

    /* renamed from: d  reason: collision with root package name */
    public i f13211d;

    /* renamed from: e  reason: collision with root package name */
    public p f13212e;

    public j() {
        this(0, 0, 0, (i) null, (p) null, 31);
    }

    public j(int i, int i10, long j10, i iVar, p pVar, int i11) {
        i = (i11 & 1) != 0 ? 0 : i;
        i10 = (i11 & 2) != 0 ? 0 : i10;
        j10 = (i11 & 4) != 0 ? 0 : j10;
        iVar = (i11 & 8) != 0 ? i.NoCRC : iVar;
        pVar = (i11 & 16) != 0 ? new a(new byte[0]) : pVar;
        e.D(iVar, "crcType");
        e.D(pVar, "data");
        this.f13208a = i;
        this.f13209b = i10;
        this.f13210c = j10;
        this.f13211d = iVar;
        this.f13212e = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13208a == jVar.f13208a && this.f13209b == jVar.f13209b && this.f13210c == jVar.f13210c && e.r(this.f13211d, jVar.f13211d) && e.r(this.f13212e, jVar.f13212e);
    }

    public final int hashCode() {
        long j10 = this.f13210c;
        int i = ((((this.f13208a * 31) + this.f13209b) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        i iVar = this.f13211d;
        int i10 = 0;
        int hashCode = (i + (iVar != null ? iVar.hashCode() : 0)) * 31;
        p pVar = this.f13212e;
        if (pVar != null) {
            i10 = pVar.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder q10 = b.q("CanonicalBlock(blockType=");
        q10.append(this.f13208a);
        q10.append(", blockNumber=");
        q10.append(this.f13209b);
        q10.append(", procV7flags=");
        q10.append(this.f13210c);
        q10.append(", crcType=");
        q10.append(this.f13211d);
        q10.append(", data=");
        q10.append(this.f13212e);
        q10.append(")");
        return q10.toString();
    }
}
