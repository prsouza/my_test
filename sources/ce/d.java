package ce;

import java.util.Iterator;
import l6.b1;
import zd.a;

public class d implements Iterable<Long>, a {

    /* renamed from: a  reason: collision with root package name */
    public final long f3439a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3440b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3441c;

    public d(long j10, long j11) {
        this.f3439a = j10;
        this.f3440b = j10 < j11 ? j11 - b1.r(b1.r(j11, 1) - b1.r(j10, 1), 1) : j11;
        this.f3441c = 1;
    }

    public final Iterator iterator() {
        return new e(this.f3439a, this.f3440b, this.f3441c);
    }
}
