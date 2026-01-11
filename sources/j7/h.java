package j7;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

public abstract class h implements n {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7095c = l(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a  reason: collision with root package name */
    public int[] f7096a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7097b;

    public h(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f7096a = l(bArr);
            this.f7097b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public static void i(int[] iArr, int i, int i10, int i11, int i12) {
        iArr[i] = iArr[i] + iArr[i10];
        int i13 = iArr[i12] ^ iArr[i];
        iArr[i12] = (i13 >>> -16) | (i13 << 16);
        iArr[i11] = iArr[i11] + iArr[i12];
        int i14 = iArr[i10] ^ iArr[i11];
        iArr[i10] = (i14 >>> -12) | (i14 << 12);
        iArr[i] = iArr[i] + iArr[i10];
        int i15 = iArr[i] ^ iArr[i12];
        iArr[i12] = (i15 >>> -8) | (i15 << 8);
        iArr[i11] = iArr[i11] + iArr[i12];
        int i16 = iArr[i10] ^ iArr[i11];
        iArr[i10] = (i16 >>> -7) | (i16 << 7);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArr3 = f7095c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void k(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            i(iArr2, 0, 4, 8, 12);
            i(iArr2, 1, 5, 9, 13);
            i(iArr2, 2, 6, 10, 14);
            i(iArr2, 3, 7, 11, 15);
            i(iArr2, 0, 5, 10, 15);
            i(iArr2, 1, 6, 11, 12);
            i(iArr2, 2, 7, 8, 13);
            i(iArr2, 3, 4, 9, 14);
        }
    }

    public static int[] l(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Api.BaseClientBuilder.API_PRIORITY_OTHER - g()) {
            ByteBuffer allocate = ByteBuffer.allocate(g() + bArr.length);
            f(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        return e(ByteBuffer.wrap(bArr));
    }

    public final ByteBuffer c(byte[] bArr, int i) {
        int[] d10 = d(l(bArr), i);
        int[] iArr = (int[]) d10.clone();
        k(iArr);
        for (int i10 = 0; i10 < d10.length; i10++) {
            d10[i10] = d10[i10] + iArr[i10];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d10, 0, 16);
        return order;
    }

    public abstract int[] d(int[] iArr, int i);

    public final byte[] e(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= g()) {
            byte[] bArr = new byte[g()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            h(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void f(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - g() >= bArr.length) {
            byte[] a10 = r.a(g());
            byteBuffer.put(a10);
            h(a10, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public abstract int g();

    public final void h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i10 = 0; i10 < i; i10++) {
            ByteBuffer c10 = c(bArr, this.f7097b + i10);
            if (i10 == i - 1) {
                f.c(byteBuffer, byteBuffer2, c10, remaining % 64);
            } else {
                f.c(byteBuffer, byteBuffer2, c10, 64);
            }
        }
    }
}
