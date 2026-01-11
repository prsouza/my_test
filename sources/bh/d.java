package bh;

import java.math.BigInteger;
import x3.b;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final e f3028a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3029b;

    public d(xg.d dVar, e eVar) {
        this.f3028a = eVar;
        this.f3029b = new b(dVar.j(eVar.f3030a));
    }

    public final b a() {
        return this.f3029b;
    }

    public final void b() {
    }

    public final BigInteger[] c(BigInteger bigInteger) {
        f fVar = this.f3028a.f3031b;
        int i = fVar.g;
        BigInteger G = android.support.v4.media.b.G(bigInteger, fVar.f3036e, i);
        BigInteger G2 = android.support.v4.media.b.G(bigInteger, fVar.f3037f, i);
        return new BigInteger[]{bigInteger.subtract(G.multiply(fVar.f3032a).add(G2.multiply(fVar.f3034c))), G.multiply(fVar.f3033b).add(G2.multiply(fVar.f3035d)).negate()};
    }
}
