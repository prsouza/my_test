package j7;

import a7.l;
import g7.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class q implements l {

    /* renamed from: a  reason: collision with root package name */
    public final a f7117a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7118b;

    public q(a aVar, int i) throws GeneralSecurityException {
        this.f7117a = aVar;
        this.f7118b = i;
        if (i >= 10) {
            aVar.a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        return this.f7117a.a(bArr, this.f7118b);
    }
}
