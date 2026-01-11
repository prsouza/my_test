package c7;

import ah.v;
import j7.l;
import j7.r;
import j7.s;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a implements a7.a {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f3255b = new C0035a();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f3256a;

    /* renamed from: c7.a$a  reason: collision with other inner class name */
    public class C0035a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return l.f7105e.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr) throws GeneralSecurityException {
        s.a(bArr.length);
        this.f3256a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if (v.R()) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a10 = r.a(12);
            System.arraycopy(a10, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c10 = c(a10, a10.length);
            ThreadLocal<Cipher> threadLocal = f3255b;
            threadLocal.get().init(1, this.f3256a, c10);
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
            ThreadLocal<Cipher> threadLocal = f3255b;
            threadLocal.get().init(2, this.f3256a, c10);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
