package d7;

import a7.m;
import a7.n;
import j7.f;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

public final class c implements n<a7.c, a7.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f4352a = Logger.getLogger(c.class.getName());

    public static class a implements a7.c {

        /* renamed from: a  reason: collision with root package name */
        public m<a7.c> f4353a;

        public a(m<a7.c> mVar) {
            this.f4353a = mVar;
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return f.a(this.f4353a.f153b.a(), ((a7.c) this.f4353a.f153b.f155a).a(bArr, bArr2));
        }

        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (m.a aVar : this.f4353a.a(copyOfRange)) {
                    try {
                        return ((a7.c) aVar.f155a).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e10) {
                        Logger logger = c.f4352a;
                        StringBuilder d10 = a.a.d("ciphertext prefix matches a key, but cannot decrypt: ");
                        d10.append(e10.toString());
                        logger.info(d10.toString());
                    }
                }
            }
            for (m.a aVar2 : this.f4353a.b()) {
                try {
                    return ((a7.c) aVar2.f155a).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public final Class<a7.c> a() {
        return a7.c.class;
    }

    public final Object b(m mVar) throws GeneralSecurityException {
        return new a(mVar);
    }

    public final Class<a7.c> c() {
        return a7.c.class;
    }
}
