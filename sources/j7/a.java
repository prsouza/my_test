package j7;

import com.google.android.gms.common.api.Api;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a implements n {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f7067d = new C0122a();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f7068a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7069b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7070c;

    /* renamed from: j7.a$a  reason: collision with other inner class name */
    public class C0122a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return l.f7105e.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i) throws GeneralSecurityException {
        s.a(bArr.length);
        this.f7068a = new SecretKeySpec(bArr, "AES");
        int blockSize = f7067d.get().getBlockSize();
        this.f7070c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f7069b = i;
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f7069b;
        if (length <= Api.BaseClientBuilder.API_PRIORITY_OTHER - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] a10 = r.a(i);
            System.arraycopy(a10, 0, bArr2, 0, this.f7069b);
            c(bArr, 0, bArr.length, bArr2, this.f7069b, a10, true);
            return bArr2;
        }
        StringBuilder d10 = a.a.d("plaintext length can not exceed ");
        d10.append(Api.BaseClientBuilder.API_PRIORITY_OTHER - this.f7069b);
        throw new GeneralSecurityException(d10.toString());
    }

    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f7069b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int length2 = bArr.length;
            int i10 = this.f7069b;
            byte[] bArr3 = new byte[(length2 - i10)];
            c(bArr, i10, bArr.length - i10, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void c(byte[] bArr, int i, int i10, byte[] bArr2, int i11, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = f7067d.get();
        byte[] bArr4 = new byte[this.f7070c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f7069b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f7068a, ivParameterSpec);
        } else {
            cipher.init(2, this.f7068a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i10, bArr2, i11) != i10) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
