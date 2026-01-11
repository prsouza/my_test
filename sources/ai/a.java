package ai;

import java.math.BigInteger;
import kg.b;
import kg.c;
import xg.f;
import xg.g;
import xh.h;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final qg.a f652a;

    /* renamed from: b  reason: collision with root package name */
    public static final BigInteger f653b;

    static {
        b bVar;
        b bVar2;
        c cVar = (c) ng.a.G.get(h.c("secp256k1"));
        if (cVar == null) {
            bVar = null;
        } else {
            synchronized (cVar) {
                if (cVar.f7541a == null) {
                    cVar.f7541a = cVar.a();
                }
                bVar2 = cVar.f7541a;
            }
            bVar = bVar2;
        }
        f652a = new qg.a(bVar.f7536b, bVar.f7537c.j(), bVar.f7538s);
        f653b = bVar.f7538s.shiftRight(1);
    }

    public static f a(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        qg.a aVar = f652a;
        if (bitLength > aVar.f10448h.bitLength()) {
            bigInteger = bigInteger.mod(aVar.f10448h);
        }
        return new g().w1(aVar.g, bigInteger);
    }
}
