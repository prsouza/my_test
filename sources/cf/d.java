package cf;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;

public final class d extends Provider {

    public class a implements PrivilegedAction<Object> {
        public a() {
        }

        public final Object run() {
            d dVar = d.this;
            dVar.put("KeyFactory.EdDSA", "net.i2p.crypto.eddsa.KeyFactory");
            dVar.put("KeyPairGenerator.EdDSA", "net.i2p.crypto.eddsa.KeyPairGenerator");
            dVar.put("Signature.NONEwithEdDSA", "net.i2p.crypto.eddsa.EdDSAEngine");
            dVar.put("Alg.Alias.KeyFactory.1.3.101.112", "EdDSA");
            dVar.put("Alg.Alias.KeyFactory.OID.1.3.101.112", "EdDSA");
            dVar.put("Alg.Alias.KeyPairGenerator.1.3.101.112", "EdDSA");
            dVar.put("Alg.Alias.KeyPairGenerator.OID.1.3.101.112", "EdDSA");
            dVar.put("Alg.Alias.Signature.1.3.101.112", "NONEwithEdDSA");
            dVar.put("Alg.Alias.Signature.OID.1.3.101.112", "NONEwithEdDSA");
            return null;
        }
    }

    public d() {
        super("EdDSA", 0.3d, "str4d EdDSA security provider wrapper");
        AccessController.doPrivileged(new a());
    }
}
