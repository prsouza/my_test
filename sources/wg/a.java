package wg;

import ag.n;
import b9.m;
import fh.e;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import th.c;
import uh.f;
import vg.b;

public final class a extends Provider {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f12668a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f12669b = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f12670c = {"SipHash", "SipHash128", "Poly1305"};

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f12671s = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f12672t = {"X509", "IES"};

    /* renamed from: u  reason: collision with root package name */
    public static final String[] f12673u = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f12674v = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f12675w = {"BC", "BCFKS", "PKCS12"};

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f12676x = {"DRBG"};

    /* renamed from: wg.a$a  reason: collision with other inner class name */
    public class C0247a implements PrivilegedAction {
        public C0247a() {
        }

        public final Object run() {
            a aVar = a.this;
            aVar.c("org.bouncycastle.jcajce.provider.digest.", a.f12674v);
            aVar.c("org.bouncycastle.jcajce.provider.symmetric.", a.f12669b);
            aVar.c("org.bouncycastle.jcajce.provider.symmetric.", a.f12670c);
            aVar.c("org.bouncycastle.jcajce.provider.symmetric.", a.f12671s);
            aVar.c("org.bouncycastle.jcajce.provider.asymmetric.", a.f12672t);
            aVar.c("org.bouncycastle.jcajce.provider.asymmetric.", a.f12673u);
            aVar.c("org.bouncycastle.jcajce.provider.keystore.", a.f12675w);
            aVar.c("org.bouncycastle.jcajce.provider.drbg.", a.f12676x);
            aVar.a(e.f5153d, new c());
            aVar.a(e.f5154e, new qh.c());
            aVar.a(e.f5155f, new uh.e());
            aVar.a(eg.a.f4833a, new uh.e());
            aVar.a(e.g, new f());
            aVar.a(eg.a.f4834b, new f());
            aVar.a(e.f5151b, new ph.f());
            aVar.a(e.f5152c, new ph.e());
            aVar.a(e.f5150a, new sh.c());
            aVar.a(e.f5156h, new rh.c());
            aVar.a(e.i, new rh.c());
            aVar.a(hg.a.f5968a, new oh.c());
            aVar.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
            aVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
            aVar.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
            aVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
            aVar.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
            aVar.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
            aVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
            aVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
            aVar.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
            aVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
            aVar.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
            aVar.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
            aVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
            aVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
            aVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
            aVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            aVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            aVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            aVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            aVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            aVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            aVar.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
            aVar.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
            aVar.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
            aVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
            return null;
        }
    }

    static {
        new b();
    }

    public a() {
        super("BC", 1.65d, "BouncyCastle Security Provider v1.65");
        AccessController.doPrivileged(new C0247a());
    }

    public final void a(n nVar, b bVar) {
        HashMap hashMap = f12668a;
        synchronized (hashMap) {
            hashMap.put(nVar, bVar);
        }
    }

    public final void c(String str, String[] strArr) {
        Class<?> cls;
        for (int i = 0; i != strArr.length; i++) {
            Class<a> cls2 = a.class;
            StringBuilder d10 = a.a.d(str);
            d10.append(strArr[i]);
            d10.append("$Mappings");
            String sb2 = d10.toString();
            try {
                ClassLoader classLoader = cls2.getClassLoader();
                cls = classLoader != null ? classLoader.loadClass(sb2) : (Class) AccessController.doPrivileged(new ug.a(sb2));
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    ((vg.a) cls.newInstance()).a();
                } catch (Exception e10) {
                    StringBuilder c10 = m.c("cannot create instance of ", str);
                    c10.append(strArr[i]);
                    c10.append("$Mappings : ");
                    c10.append(e10);
                    throw new InternalError(c10.toString());
                }
            }
        }
    }
}
