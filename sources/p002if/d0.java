package p002if;

import a.a;
import e6.e;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.slf4j.helpers.MessageFormatter;

/* renamed from: if.d0  reason: invalid package */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f6493a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f6494b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f6495c;

    public d0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        e.D(aVar, "address");
        e.D(inetSocketAddress, "socketAddress");
        this.f6493a = aVar;
        this.f6494b = proxy;
        this.f6495c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return e.r(d0Var.f6493a, this.f6493a) && e.r(d0Var.f6494b, this.f6494b) && e.r(d0Var.f6495c, this.f6495c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f6494b.hashCode();
        return this.f6495c.hashCode() + ((hashCode + ((this.f6493a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder d10 = a.d("Route{");
        d10.append(this.f6495c);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
