package rg;

import java.math.BigInteger;
import lg.b;
import pg.a;

public final class c implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final BigInteger f10793e = BigInteger.valueOf(0);

    /* renamed from: a  reason: collision with root package name */
    public final a f10794a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10795b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f10796c;

    /* renamed from: d  reason: collision with root package name */
    public BigInteger f10797d;

    public c(b bVar) {
        a aVar = new a(bVar);
        this.f10794a = aVar;
        int i = aVar.f10057b;
        this.f10796c = new byte[i];
        this.f10795b = new byte[i];
    }

    public final BigInteger a(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.f10797d.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.f10797d.bitLength()) : bigInteger;
    }
}
