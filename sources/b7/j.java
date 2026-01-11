package b7;

import a7.a;
import a7.d;
import a7.e;
import a7.q;
import h7.a0;
import i7.i;
import i7.q0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

public final class j implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f2896c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final a0 f2897a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2898b;

    public j(a0 a0Var, a aVar) {
        this.f2897a = a0Var;
        this.f2898b = aVar;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        q0 b10;
        a0 a0Var = this.f2897a;
        Logger logger = q.f161a;
        synchronized (q.class) {
            d<?> b11 = q.b(a0Var.C()).b();
            if (((Boolean) q.f164d.get(a0Var.C())).booleanValue()) {
                b10 = ((e) b11).b(a0Var.D());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.C());
            }
        }
        byte[] g = b10.g();
        byte[] a10 = this.f2898b.a(g, f2896c);
        i.f fVar = i.f6271b;
        byte[] a11 = ((a) q.d(this.f2897a.C(), i.e(g, 0, g.length), a.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a10.length + 4 + a11.length).putInt(a10.length).put(a10).put(a11).array();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((a) q.c(this.f2897a.C(), this.f2898b.b(bArr3, f2896c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }
}
