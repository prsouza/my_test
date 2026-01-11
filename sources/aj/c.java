package aj;

import androidx.fragment.app.m;
import e6.e;
import java.util.List;
import xe.f;
import ze.a;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f661a;

    /* renamed from: b  reason: collision with root package name */
    public final String f662b;

    /* renamed from: c  reason: collision with root package name */
    public final String f663c;

    /* renamed from: d  reason: collision with root package name */
    public final String f664d;

    /* renamed from: e  reason: collision with root package name */
    public final long f665e;

    /* renamed from: f  reason: collision with root package name */
    public final long f666f;
    public final List<String> g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f667h;
    public final long i;

    /* renamed from: j  reason: collision with root package name */
    public final long f668j;

    /* renamed from: k  reason: collision with root package name */
    public final f f669k;

    /* renamed from: l  reason: collision with root package name */
    public long f670l;

    public c(String str, String str2, String str3, String str4, long j10, long j11, List<String> list, List<String> list2, long j12, long j13, f fVar) {
        List<String> list3 = list;
        List<String> list4 = list2;
        f fVar2 = fVar;
        e.D(str, "bid");
        e.D(str2, "fid");
        e.D(str3, "destination");
        e.D(str4, "source");
        e.D(list3, "constraints");
        e.D(list4, "tags");
        e.D(fVar2, "bundle");
        this.f661a = str;
        this.f662b = str2;
        this.f663c = str3;
        this.f664d = str4;
        this.f665e = j10;
        this.f666f = j11;
        this.g = list3;
        this.f667h = list4;
        this.i = j12;
        this.f668j = j13;
        this.f669k = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e.r(this.f661a, cVar.f661a) && e.r(this.f662b, cVar.f662b) && e.r(this.f663c, cVar.f663c) && e.r(this.f664d, cVar.f664d) && this.f665e == cVar.f665e && this.f666f == cVar.f666f && e.r(this.g, cVar.g) && e.r(this.f667h, cVar.f667h) && this.i == cVar.i && this.f668j == cVar.f668j && e.r(this.f669k, cVar.f669k);
    }

    public final int hashCode() {
        int a10 = m.a(this.f664d, m.a(this.f663c, m.a(this.f662b, this.f661a.hashCode() * 31, 31), 31), 31);
        long j10 = this.f665e;
        long j11 = this.f666f;
        int i10 = (int) (j11 ^ (j11 >>> 32));
        int hashCode = this.g.hashCode();
        int hashCode2 = this.f667h.hashCode();
        long j12 = this.i;
        int i11 = (int) (j12 ^ (j12 >>> 32));
        long j13 = this.f668j;
        int i12 = (int) ((j13 >>> 32) ^ j13);
        return this.f669k.hashCode() + ((i12 + ((i11 + ((hashCode2 + ((hashCode + ((i10 + ((((int) (j10 ^ (j10 >>> 32))) + a10) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("BundleEntryImpl(bid=");
        d10.append(this.f661a);
        d10.append(", fid=");
        d10.append(this.f662b);
        d10.append(", destination=");
        d10.append(this.f663c);
        d10.append(", source=");
        d10.append(this.f664d);
        d10.append(", offset=");
        d10.append(this.f665e);
        d10.append(", appdata=");
        d10.append(this.f666f);
        d10.append(", constraints=");
        d10.append(this.g);
        d10.append(", tags=");
        d10.append(this.f667h);
        d10.append(", created=");
        d10.append(this.i);
        d10.append(", expire=");
        d10.append(this.f668j);
        d10.append(", bundle=");
        d10.append(this.f669k);
        d10.append(')');
        return d10.toString();
    }
}
