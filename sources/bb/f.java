package bb;

import androidx.fragment.app.m;
import e6.e;
import java.math.BigInteger;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f2945a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2946b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2947c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2948d;

    /* renamed from: e  reason: collision with root package name */
    public final BigInteger f2949e;

    /* renamed from: f  reason: collision with root package name */
    public final BigInteger f2950f;
    public final g g;

    public f(String str, long j10, String str2, String str3, BigInteger bigInteger, BigInteger bigInteger2, g gVar) {
        e.D(str, "hash");
        e.D(str2, "from");
        e.D(str3, "to");
        e.D(bigInteger, "amount");
        e.D(gVar, "transactionType");
        this.f2945a = str;
        this.f2946b = j10;
        this.f2947c = str2;
        this.f2948d = str3;
        this.f2949e = bigInteger;
        this.f2950f = bigInteger2;
        this.g = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e.r(this.f2945a, fVar.f2945a) && this.f2946b == fVar.f2946b && e.r(this.f2947c, fVar.f2947c) && e.r(this.f2948d, fVar.f2948d) && e.r(this.f2949e, fVar.f2949e) && e.r(this.f2950f, fVar.f2950f) && this.g == fVar.g;
    }

    public final int hashCode() {
        long j10 = this.f2946b;
        int a10 = m.a(this.f2948d, m.a(this.f2947c, ((this.f2945a.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31);
        int hashCode = this.f2950f.hashCode();
        return this.g.hashCode() + ((hashCode + ((this.f2949e.hashCode() + a10) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f2945a;
        long j10 = this.f2946b;
        String str2 = this.f2947c;
        String str3 = this.f2948d;
        BigInteger bigInteger = this.f2949e;
        BigInteger bigInteger2 = this.f2950f;
        g gVar = this.g;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transaction(hash=");
        sb2.append(str);
        sb2.append(", timeStamp=");
        sb2.append(j10);
        h1.e.b(sb2, ", from=", str2, ", to=", str3);
        sb2.append(", amount=");
        sb2.append(bigInteger);
        sb2.append(", fee=");
        sb2.append(bigInteger2);
        sb2.append(", transactionType=");
        sb2.append(gVar);
        sb2.append(")");
        return sb2.toString();
    }
}
