package ph;

import ag.d;
import ag.s;
import ag.t;
import fh.c;
import fh.e;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import vg.b;
import wh.a;

public final class f extends KeyFactorySpi implements b {
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                hg.b j10 = hg.b.j(s.n(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (e.f5151b.m(j10.f5970b.f7256a)) {
                        d k10 = j10.k();
                        c cVar = k10 instanceof c ? (c) k10 : k10 != null ? new c(t.r(k10)) : null;
                        return new c(new hh.e(cVar.f5140a, cVar.f5141b, new wh.b(cVar.f5142c), new wh.e(new wh.b(cVar.f5142c), cVar.f5143s), new wh.d(cVar.f5145u), new wh.d(cVar.f5146v), new a(cVar.f5144t)));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e10) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e10);
            }
        } else {
            StringBuilder d10 = a.a.d("Unsupported key specification: ");
            d10.append(keySpec.getClass());
            d10.append(".");
            throw new InvalidKeySpecException(d10.toString());
        }
    }

    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                jg.b j10 = jg.b.j(s.n(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (e.f5151b.m(j10.f7258a.f7256a)) {
                        s k10 = j10.k();
                        fh.d dVar = k10 instanceof fh.d ? (fh.d) k10 : k10 != null ? new fh.d(t.r(k10)) : null;
                        return new d(new hh.f(dVar.f5147a, dVar.f5148b, new a(dVar.f5149c)));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException e10) {
                    StringBuilder d10 = a.a.d("Unable to decode X509EncodedKeySpec: ");
                    d10.append(e10.getMessage());
                    throw new InvalidKeySpecException(d10.toString());
                }
            } catch (IOException e11) {
                throw new InvalidKeySpecException(e11.toString());
            }
        } else {
            StringBuilder d11 = a.a.d("Unsupported key specification: ");
            d11.append(keySpec.getClass());
            d11.append(".");
            throw new InvalidKeySpecException(d11.toString());
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }
}
