package gc;

import dc.d;
import e6.e;
import fc.a;
import ff.c;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Locale;

public final class b extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final b f5348b = new b();

    static {
        d dVar = d.f4432c;
        ((Number) d.f4430a.a()).intValue();
    }

    public b() {
        super("Ed25519HDKD");
    }

    public final a d(byte[] bArr) {
        KeyFactory instance = KeyFactory.getInstance("EdDSA", "EdDSA");
        ff.a aVar = ff.b.f5111b.get("Ed25519".toLowerCase(Locale.ENGLISH));
        ff.d dVar = new ff.d(bArr, aVar);
        PrivateKey generatePrivate = instance.generatePrivate(dVar);
        e.C(generatePrivate, "keyFac.generatePrivate(privKeySpec)");
        byte[] encoded = generatePrivate.getEncoded();
        PublicKey generatePublic = instance.generatePublic(new ff.e(dVar.f5119s, (c) aVar));
        e.C(generatePublic, "keyFac.generatePublic(publicKeySpec)");
        byte[] encoded2 = generatePublic.getEncoded();
        e.C(encoded, "private");
        byte[] H = nd.d.H(encoded, 16, encoded.length);
        e.C(encoded2, "public");
        return new c(bArr, H, nd.d.H(encoded2, 12, encoded2.length));
    }
}
