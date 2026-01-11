package f7;

import a7.l;
import a7.m;
import a7.n;
import h7.i0;
import j7.f;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

public final class d implements n<l, l> {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f5009a = Logger.getLogger(d.class.getName());

    public static class b implements l {

        /* renamed from: a  reason: collision with root package name */
        public final m<l> f5010a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f5011b = {0};

        public b(m mVar, a aVar) {
            this.f5010a = mVar;
        }

        public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (m.a next : this.f5010a.a(copyOf)) {
                    try {
                        if (next.f158d.equals(i0.LEGACY)) {
                            ((l) next.f155a).a(copyOfRange, f.a(bArr2, this.f5011b));
                            return;
                        }
                        ((l) next.f155a).a(copyOfRange, bArr2);
                        return;
                    } catch (GeneralSecurityException e10) {
                        Logger logger = d.f5009a;
                        logger.info("tag prefix matches a key, but cannot verify: " + e10);
                    }
                }
                for (m.a aVar : this.f5010a.b()) {
                    try {
                        ((l) aVar.f155a).a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        public final byte[] b(byte[] bArr) throws GeneralSecurityException {
            if (this.f5010a.f153b.f158d.equals(i0.LEGACY)) {
                return f.a(this.f5010a.f153b.a(), ((l) this.f5010a.f153b.f155a).b(f.a(bArr, this.f5011b)));
            }
            return f.a(this.f5010a.f153b.a(), ((l) this.f5010a.f153b.f155a).b(bArr));
        }
    }

    public final Class<l> a() {
        return l.class;
    }

    public final Object b(m mVar) throws GeneralSecurityException {
        return new b(mVar, (a) null);
    }

    public final Class<l> c() {
        return l.class;
    }
}
