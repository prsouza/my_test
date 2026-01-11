package net.i2p.crypto.eddsa;

import a.a;
import cf.b;
import cf.c;
import ff.d;
import ff.e;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public final class KeyFactory extends KeyFactorySpi {
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        byte b10;
        int i;
        int i10;
        KeySpec keySpec2 = keySpec;
        if (keySpec2 instanceof d) {
            return new b((d) keySpec2);
        }
        if (keySpec2 instanceof PKCS8EncodedKeySpec) {
            byte[] encoded = ((PKCS8EncodedKeySpec) keySpec2).getEncoded();
            try {
                byte b11 = encoded[11];
                if (b11 == 100) {
                    i = 49;
                    b10 = 8;
                } else if (b11 != 112) {
                    throw new InvalidKeySpecException("unsupported key spec");
                } else if (encoded[6] == 7) {
                    i = 50;
                    b10 = 7;
                } else {
                    b10 = 5;
                    i = 48;
                }
                if (encoded.length != i) {
                    throw new InvalidKeySpecException("invalid key spec length");
                } else if (encoded[0] == 48 && encoded[1] == i - 2 && encoded[2] == 2 && encoded[3] == 1 && encoded[4] == 0 && encoded[5] == 48 && encoded[6] == b10 && encoded[7] == 6 && encoded[8] == 3 && encoded[9] == 43 && encoded[10] == 101) {
                    int i11 = 12;
                    if (b11 == 100) {
                        if (encoded[12] == 10 && encoded[13] == 1) {
                            i10 = 15;
                            if (encoded[14] == 1) {
                            }
                        }
                        throw new InvalidKeySpecException("unsupported key spec");
                    }
                    if (b10 == 7) {
                        if (encoded[12] == 5 && encoded[13] == 0) {
                            i11 = 14;
                        } else {
                            throw new InvalidKeySpecException("unsupported key spec");
                        }
                    }
                    int i12 = i11 + 1;
                    if (encoded[i11] == 4) {
                        int i13 = i12 + 1;
                        if (encoded[i12] == 34) {
                            i10 = i13;
                        }
                    }
                    throw new InvalidKeySpecException("unsupported key spec");
                    int i14 = i10 + 1;
                    if (encoded[i10] == 4) {
                        int i15 = i14 + 1;
                        if (encoded[i14] == 32) {
                            byte[] bArr = new byte[32];
                            System.arraycopy(encoded, i15, bArr, 0, 32);
                            return new b(new d(bArr, ff.b.f5110a));
                        }
                    }
                    throw new InvalidKeySpecException("unsupported key spec");
                } else {
                    throw new InvalidKeySpecException("unsupported key spec");
                }
            } catch (IndexOutOfBoundsException e10) {
                throw new InvalidKeySpecException(e10);
            }
        } else {
            StringBuilder d10 = a.d("key spec not recognised: ");
            d10.append(keySpec.getClass());
            throw new InvalidKeySpecException(d10.toString());
        }
    }

    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof e) {
            return new c((e) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            return new c((X509EncodedKeySpec) keySpec);
        }
        StringBuilder d10 = a.d("key spec not recognised: ");
        d10.append(keySpec.getClass());
        throw new InvalidKeySpecException(d10.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r0 = (cf.b) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends java.security.spec.KeySpec> T engineGetKeySpec(java.security.Key r8, java.lang.Class<T> r9) throws java.security.spec.InvalidKeySpecException {
        /*
            r7 = this;
            java.lang.Class<ff.e> r0 = ff.e.class
            boolean r0 = r9.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x001b
            boolean r0 = r8 instanceof cf.c
            if (r0 == 0) goto L_0x001b
            r0 = r8
            cf.c r0 = (cf.c) r0
            ff.c r1 = r0.f3455s
            if (r1 == 0) goto L_0x003d
            ff.e r8 = new ff.e
            df.e r9 = r0.f3452a
            r8.<init>((df.e) r9, (ff.c) r1)
            return r8
        L_0x001b:
            java.lang.Class<ff.d> r0 = ff.d.class
            boolean r0 = r9.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x003d
            boolean r0 = r8 instanceof cf.b
            if (r0 == 0) goto L_0x003d
            r0 = r8
            cf.b r0 = (cf.b) r0
            ff.c r6 = r0.f3451u
            if (r6 == 0) goto L_0x003d
            ff.d r8 = new ff.d
            byte[] r2 = r0.f3446a
            byte[] r3 = r0.f3447b
            byte[] r4 = r0.f3448c
            df.e r5 = r0.f3449s
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r8
        L_0x003d:
            java.security.spec.InvalidKeySpecException r0 = new java.security.spec.InvalidKeySpecException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not implemented yet "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = " "
            r1.append(r8)
            r1.append(r9)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.i2p.crypto.eddsa.KeyFactory.engineGetKeySpec(java.security.Key, java.lang.Class):java.security.spec.KeySpec");
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("No other EdDSA key providers known");
    }
}
