package b7;

import a7.m;
import a7.n;
import j7.f;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

public final class b implements n<a7.a, a7.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f2887a = Logger.getLogger(b.class.getName());

    /* renamed from: b7.b$b  reason: collision with other inner class name */
    public static class C0030b implements a7.a {

        /* renamed from: a  reason: collision with root package name */
        public final m<a7.a> f2888a;

        public C0030b(m mVar, a aVar) {
            this.f2888a = mVar;
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return f.a(this.f2888a.f153b.a(), ((a7.a) this.f2888a.f153b.f155a).a(bArr, bArr2));
        }

        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (m.a aVar : this.f2888a.a(copyOfRange)) {
                    try {
                        return ((a7.a) aVar.f155a).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e10) {
                        Logger logger = b.f2887a;
                        StringBuilder d10 = a.a.d("ciphertext prefix matches a key, but cannot decrypt: ");
                        d10.append(e10.toString());
                        logger.info(d10.toString());
                    }
                }
            }
            for (m.a aVar2 : this.f2888a.b()) {
                try {
                    return ((a7.a) aVar2.f155a).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public final Class<a7.a> a() {
        return a7.a.class;
    }

    public final Object b(m mVar) throws GeneralSecurityException {
        return new C0030b(mVar, (a) null);
    }

    public final Class<a7.a> c() {
        return a7.a.class;
    }
}
