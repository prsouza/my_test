package j7;

import a7.a;
import c3.k;
import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

public abstract class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final h f7098a;

    /* renamed from: b  reason: collision with root package name */
    public final h f7099b;

    public j(byte[] bArr) throws InvalidKeyException {
        this.f7098a = d(bArr, 1);
        this.f7099b = d(bArr, 0);
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i10 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i10);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.f7098a.g()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f7098a.g() + bArr.length + 16);
            if (allocate.remaining() >= this.f7098a.g() + bArr.length + 16) {
                int position = allocate.position();
                this.f7098a.f(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f7098a.g()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f7099b.c(bArr3, 0).get(bArr4);
                byte[] V = k.V(bArr4, c(bArr2, allocate));
                allocate.limit(allocate.limit() + 16);
                allocate.put(V);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.remaining() >= this.f7098a.g() + 16) {
            int position = wrap.position();
            byte[] bArr3 = new byte[16];
            wrap.position(wrap.limit() - 16);
            wrap.get(bArr3);
            wrap.position(position);
            wrap.limit(wrap.limit() - 16);
            byte[] bArr4 = new byte[this.f7098a.g()];
            wrap.get(bArr4);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr5 = new byte[32];
                this.f7099b.c(bArr4, 0).get(bArr5);
                if (f.b(k.V(bArr5, c(bArr2, wrap)), bArr3)) {
                    wrap.position(position);
                    return this.f7098a.e(wrap);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public abstract h d(byte[] bArr, int i) throws InvalidKeyException;
}
