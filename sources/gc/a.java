package gc;

import java.math.BigInteger;
import jc.b;

public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5347b = new a();

    public a() {
        super("Secp256k1HDKD");
    }

    public final fc.a d(byte[] bArr) {
        return new c(bArr, bArr, ai.a.a(new BigInteger(b.B(bArr, false), 16)).f(true));
    }
}
