package j7;

import com.google.android.gms.common.api.Api;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b implements a7.a {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f7071e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f7072f = new C0123b();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7073a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7074b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f7075c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7076d;

    public class a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return l.f7105e.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: j7.b$b  reason: collision with other inner class name */
    public class C0123b extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return l.f7105e.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr, int i) throws GeneralSecurityException {
        if (i == 12 || i == 16) {
            this.f7076d = i;
            s.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f7075c = secretKeySpec;
            Cipher cipher = f7071e.get();
            cipher.init(1, secretKeySpec);
            byte[] c10 = c(cipher.doFinal(new byte[16]));
            this.f7073a = c10;
            this.f7074b = c(c10);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        int i12 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i12 ^ i);
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i = this.f7076d;
        if (length <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - i) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i + 16)];
            byte[] a10 = r.a(i);
            System.arraycopy(a10, 0, bArr4, 0, this.f7076d);
            Cipher cipher = f7071e.get();
            cipher.init(1, this.f7075c);
            byte[] d10 = d(cipher, 0, a10, 0, a10.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] d11 = d(cipher, 1, bArr5, 0, bArr5.length);
            Cipher cipher2 = f7072f.get();
            cipher2.init(1, this.f7075c, new IvParameterSpec(d10));
            cipher2.doFinal(bArr, 0, bArr3.length, bArr4, this.f7076d);
            byte[] d12 = d(cipher, 2, bArr4, this.f7076d, bArr3.length);
            int length2 = bArr3.length + this.f7076d;
            for (int i10 = 0; i10 < 16; i10++) {
                bArr4[length2 + i10] = (byte) ((d11[i10] ^ d10[i10]) ^ d12[i10]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.f7076d) - 16;
        if (length >= 0) {
            Cipher cipher = f7071e.get();
            cipher.init(1, this.f7075c);
            byte[] d10 = d(cipher, 0, bArr, 0, this.f7076d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] d11 = d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d12 = d(cipher, 2, bArr, this.f7076d, length);
            int length2 = bArr.length - 16;
            byte b10 = 0;
            for (int i = 0; i < 16; i++) {
                b10 = (byte) (b10 | (((bArr[length2 + i] ^ d11[i]) ^ d10[i]) ^ d12[i]));
            }
            if (b10 == 0) {
                Cipher cipher2 = f7072f.get();
                cipher2.init(1, this.f7075c, new IvParameterSpec(d10));
                return cipher2.doFinal(bArr, this.f7076d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] d(Cipher cipher, int i, byte[] bArr, int i10, int i11) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i11 == 0) {
            return cipher.doFinal(e(bArr3, this.f7073a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i12 = 0;
        while (i11 - i12 > 16) {
            for (int i13 = 0; i13 < 16; i13++) {
                doFinal[i13] = (byte) (doFinal[i13] ^ bArr[(i10 + i12) + i13]);
            }
            doFinal = cipher.doFinal(doFinal);
            i12 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i12 + i10, i10 + i11);
        if (copyOfRange.length == 16) {
            bArr2 = e(copyOfRange, this.f7073a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f7074b, 16);
            for (int i14 = 0; i14 < copyOfRange.length; i14++) {
                copyOf[i14] = (byte) (copyOf[i14] ^ copyOfRange[i14]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(e(doFinal, bArr2));
    }
}
