package j7;

import aa.b;
import g7.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class o implements a {

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f7109a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f7110b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f7111c;

    public o(byte[] bArr) throws GeneralSecurityException {
        s.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f7109a = secretKeySpec;
        Cipher a10 = l.f7105e.a("AES/ECB/NoPadding");
        a10.init(1, secretKeySpec);
        byte[] C = b.C(a10.doFinal(new byte[16]));
        this.f7110b = C;
        this.f7111c = b.C(C);
    }

    public final byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher a10 = l.f7105e.a("AES/ECB/NoPadding");
            boolean z = true;
            a10.init(1, this.f7109a);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            if (max * 16 != bArr.length) {
                z = false;
            }
            if (z) {
                bArr2 = f.d(bArr, (max - 1) * 16, this.f7110b, 0, 16);
            } else {
                bArr2 = f.e(b.z(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f7111c);
            }
            byte[] bArr3 = new byte[16];
            for (int i10 = 0; i10 < max - 1; i10++) {
                bArr3 = a10.doFinal(f.d(bArr3, 0, bArr, i10 * 16, 16));
            }
            return Arrays.copyOf(a10.doFinal(f.e(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
