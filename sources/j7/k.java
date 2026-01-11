package j7;

import a7.a;
import a7.l;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final n f7100a;

    /* renamed from: b  reason: collision with root package name */
    public final l f7101b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7102c;

    public k(n nVar, l lVar, int i) {
        this.f7100a = nVar;
        this.f7101b = lVar;
        this.f7102c = i;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a10 = this.f7100a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return f.a(a10, this.f7101b.b(f.a(bArr2, a10, copyOf)));
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f7102c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f7102c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f7101b.a(copyOfRange2, f.a(bArr2, copyOfRange, copyOf));
            return this.f7100a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
