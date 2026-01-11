package s4;

import java.util.List;

public final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    public final long f10920a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10921b;

    /* renamed from: c  reason: collision with root package name */
    public final k f10922c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f10923d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10924e;

    /* renamed from: f  reason: collision with root package name */
    public final List<l> f10925f;
    public final p g;

    public g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar, a aVar) {
        this.f10920a = j10;
        this.f10921b = j11;
        this.f10922c = kVar;
        this.f10923d = num;
        this.f10924e = str;
        this.f10925f = list;
        this.g = pVar;
    }

    public final k a() {
        return this.f10922c;
    }

    public final List<l> b() {
        return this.f10925f;
    }

    public final Integer c() {
        return this.f10923d;
    }

    public final String d() {
        return this.f10924e;
    }

    public final p e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f10920a == mVar.f() && this.f10921b == mVar.g() && ((kVar = this.f10922c) != null ? kVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.f10923d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f10924e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((list = this.f10925f) != null ? list.equals(mVar.b()) : mVar.b() == null)) {
            p pVar = this.g;
            if (pVar == null) {
                if (mVar.e() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f10920a;
    }

    public final long g() {
        return this.f10921b;
    }

    public final int hashCode() {
        long j10 = this.f10920a;
        long j11 = this.f10921b;
        int i = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f10922c;
        int i10 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f10923d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f10924e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f10925f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.g;
        if (pVar != null) {
            i10 = pVar.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("LogRequest{requestTimeMs=");
        d10.append(this.f10920a);
        d10.append(", requestUptimeMs=");
        d10.append(this.f10921b);
        d10.append(", clientInfo=");
        d10.append(this.f10922c);
        d10.append(", logSource=");
        d10.append(this.f10923d);
        d10.append(", logSourceName=");
        d10.append(this.f10924e);
        d10.append(", logEvents=");
        d10.append(this.f10925f);
        d10.append(", qosTier=");
        d10.append(this.g);
        d10.append("}");
        return d10.toString();
    }
}
