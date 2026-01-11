package tg;

import java.security.MessageDigest;
import lg.b;

public class a extends MessageDigest {

    /* renamed from: a  reason: collision with root package name */
    public b f11607a;

    /* renamed from: b  reason: collision with root package name */
    public int f11608b;

    public a(b bVar) {
        super(bVar.c());
        this.f11607a = bVar;
        this.f11608b = bVar.d();
    }

    public final byte[] engineDigest() {
        byte[] bArr = new byte[this.f11608b];
        this.f11607a.b(bArr, 0);
        return bArr;
    }

    public final int engineGetDigestLength() {
        return this.f11608b;
    }

    public final void engineReset() {
        this.f11607a.reset();
    }

    public final void engineUpdate(byte b10) {
        this.f11607a.f(b10);
    }

    public final void engineUpdate(byte[] bArr, int i, int i10) {
        this.f11607a.update(bArr, i, i10);
    }
}
