package j7;

import ah.v;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class c implements a7.a {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f7077b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f7078a;

    public class a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return l.f7105e.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public c(byte[] bArr) throws GeneralSecurityException {
        s.a(bArr.length);
        this.f7078a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i) throws GeneralSecurityException {
        int i10;
        if (v.R()) {
            try {
                i10 = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt((Object) null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                i10 = -1;
            }
            if (i10 <= 19) {
                return new IvParameterSpec(bArr, 0, i);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, i);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a10 = r.a(12);
            System.arraycopy(a10, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c10 = c(a10, a10.length);
            ThreadLocal<Cipher> threadLocal = f7077b;
            threadLocal.get().init(1, this.f7078a, c10);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec c10 = c(bArr, 12);
            ThreadLocal<Cipher> threadLocal = f7077b;
            threadLocal.get().init(2, this.f7078a, c10);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
