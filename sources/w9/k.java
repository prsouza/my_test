package w9;

import a.b;
import e6.e;
import java.nio.ByteBuffer;
import java.util.Objects;
import md.m;
import wi.d;
import xd.p;
import yd.h;
import yi.a;

public final class k extends h implements p<a, byte[], m> {

    /* renamed from: b  reason: collision with root package name */
    public static final k f12622b = new k();

    public k() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        e.D(aVar, "vm");
        e.D((byte[]) obj2, "$noName_1");
        oi.a t10 = b.t(aVar);
        yi.b.a(aVar, d.OP_SDKID);
        ByteBuffer u10 = e.u(aVar, 32);
        b bVar = (b) t10.f9453d.a().f3215a;
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type org.bouncycastle.crypto.params.Ed25519PublicKeyParameters");
        u10.put(((qg.e) bVar).getEncoded());
        yi.b.b(aVar, ((long) 10) + yi.b.g);
        return m.f8555a;
    }
}
