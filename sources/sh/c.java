package sh;

import ag.d;
import ag.s;
import ag.t;
import c3.k;
import fh.f;
import fh.g;
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
import vh.a;

public final class c extends KeyFactorySpi implements b {
    public final PrivateKey a(hg.b bVar) throws IOException {
        d k10 = bVar.k();
        f fVar = k10 instanceof f ? (f) k10 : k10 != null ? new f(t.r(k10)) : null;
        short[][] a02 = k.a0(fVar.f5159c);
        short[] Y = k.Y(fVar.f5160s);
        short[][] a03 = k.a0(fVar.f5161t);
        short[] Y2 = k.Y(fVar.f5162u);
        byte[] bArr = fVar.f5163v;
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return new a(a02, Y, a03, Y2, iArr, fVar.f5164w);
    }

    public final PublicKey b(jg.b bVar) throws IOException {
        s k10 = bVar.k();
        g gVar = k10 instanceof g ? (g) k10 : k10 != null ? new g(t.r(k10)) : null;
        return new b(gVar.f5167c.v(), k.a0(gVar.f5168s), k.a0(gVar.f5169t), k.Y(gVar.f5170u));
    }

    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof a) {
            return new a((a) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(hg.b.j(s.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e10) {
                throw new InvalidKeySpecException(e10.toString());
            }
        } else {
            StringBuilder d10 = a.a.d("Unsupported key specification: ");
            d10.append(keySpec.getClass());
            d10.append(".");
            throw new InvalidKeySpecException(d10.toString());
        }
    }

    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof vh.b) {
            return new b((vh.b) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(jg.b.j(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e10) {
                throw new InvalidKeySpecException(e10.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (a.class.isAssignableFrom(cls)) {
                a aVar = (a) key;
                return new a(aVar.f11138a, aVar.f11139b, aVar.f11140c, aVar.f11141s, aVar.f11143u, aVar.f11142t);
            }
        } else if (!(key instanceof b)) {
            StringBuilder d10 = a.a.d("Unsupported key type: ");
            d10.append(key.getClass());
            d10.append(".");
            throw new InvalidKeySpecException(d10.toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (vh.b.class.isAssignableFrom(cls)) {
                b bVar = (b) key;
                return new vh.b(bVar.f11147s, bVar.f11144a, bVar.a(), xh.a.b(bVar.f11146c));
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof a) || (key instanceof b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
