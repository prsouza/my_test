package qb;

import androidx.fragment.app.m;
import ce.f;
import e6.e;
import java.math.BigInteger;
import java.util.List;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final s f10388a;

    /* renamed from: b  reason: collision with root package name */
    public final f f10389b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10390c;

    /* renamed from: d  reason: collision with root package name */
    public final BigInteger f10391d;

    /* renamed from: e  reason: collision with root package name */
    public final List<q> f10392e;

    public r(s sVar, f fVar, String str, BigInteger bigInteger, List<q> list) {
        e.D(sVar, "periodType");
        this.f10388a = sVar;
        this.f10389b = fVar;
        this.f10390c = str;
        this.f10391d = bigInteger;
        this.f10392e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f10388a == rVar.f10388a && e.r(this.f10389b, rVar.f10389b) && e.r(this.f10390c, rVar.f10390c) && e.r(this.f10391d, rVar.f10391d) && e.r(this.f10392e, rVar.f10392e);
    }

    public final int hashCode() {
        int hashCode = this.f10389b.hashCode();
        int a10 = m.a(this.f10390c, (hashCode + (this.f10388a.hashCode() * 31)) * 31, 31);
        return this.f10392e.hashCode() + ((this.f10391d.hashCode() + a10) * 31);
    }

    public final String toString() {
        s sVar = this.f10388a;
        f fVar = this.f10389b;
        String str = this.f10390c;
        BigInteger bigInteger = this.f10391d;
        List<q> list = this.f10392e;
        return "StatsPeriod(periodType=" + sVar + ", dateRange=" + fVar + ", dateRangeLabel=" + str + ", totalAmount=" + bigInteger + ", intervals=" + list + ")";
    }
}
