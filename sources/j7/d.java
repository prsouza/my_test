package j7;

import a.a;
import a7.c;
import aa.b;
import ah.v;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class d implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final Collection<Integer> f7079c = Arrays.asList(new Integer[]{64});

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f7080d = new byte[16];

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f7081e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public final o f7082a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7083b;

    public d(byte[] bArr) throws GeneralSecurityException {
        if (f7079c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f7083b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f7082a = new o(copyOfRange);
            return;
        }
        throw new InvalidKeyException(androidx.activity.result.d.c(a.d("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483631) {
            Cipher a10 = l.f7105e.a("AES/CTR/NoPadding");
            byte[] c10 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c10.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(1, new SecretKeySpec(this.f7083b, "AES"), new IvParameterSpec(bArr3));
            return f.a(c10, a10.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 16) {
            Cipher a10 = l.f7105e.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(2, new SecretKeySpec(this.f7083b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a10.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && v.R()) {
                doFinal = new byte[0];
            }
            if (f.b(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArr2;
        byte[] bArr3;
        if (bArr.length == 0) {
            return this.f7082a.a(f7081e, 16);
        }
        byte[] a10 = this.f7082a.a(f7080d, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            if (bArr[i] == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr[i];
            }
            a10 = f.e(b.C(a10), this.f7082a.a(bArr3, 16));
        }
        byte[] bArr4 = bArr[bArr.length - 1];
        if (bArr4.length < 16) {
            bArr2 = f.e(b.z(bArr4), b.C(a10));
        } else if (bArr4.length >= a10.length) {
            int length = bArr4.length - a10.length;
            bArr2 = Arrays.copyOf(bArr4, bArr4.length);
            for (int i10 = 0; i10 < a10.length; i10++) {
                int i11 = length + i10;
                bArr2[i11] = (byte) (bArr2[i11] ^ a10[i10]);
            }
        } else {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        return this.f7082a.a(bArr2, 16);
    }
}
