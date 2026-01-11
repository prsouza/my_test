package df;

import ef.a;
import ef.b;
import java.io.Serializable;
import java.util.Objects;

public final class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final a f4474a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4475b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4476c;

    /* renamed from: s  reason: collision with root package name */
    public final a f4477s;

    /* renamed from: t  reason: collision with root package name */
    public final a f4478t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4479u = 256;

    /* renamed from: v  reason: collision with root package name */
    public final a f4480v;

    /* renamed from: w  reason: collision with root package name */
    public final b f4481w;

    public c(byte[] bArr, b bVar) {
        this.f4481w = bVar;
        synchronized (bVar) {
            if (bVar.f4832a == null) {
                bVar.f4832a = this;
            } else {
                throw new IllegalStateException("already set");
            }
        }
        d a10 = a(bArr);
        this.f4480v = (a) a10;
        this.f4474a = (a) a(a.f4459a);
        this.f4475b = (a) a(a.f4460b);
        d a11 = a(a.f4461c);
        this.f4476c = (a) a11;
        a(a.f4462d);
        d a12 = a(a.f4463e);
        this.f4477s = (a) a12;
        d a13 = a(a.f4464f);
        this.f4478t = (a) a13;
        a10.g(a11);
        a10.g(a12).d(a13.c());
    }

    public final d a(byte[] bArr) {
        byte[] bArr2 = bArr;
        b bVar = this.f4481w;
        Objects.requireNonNull(bVar);
        long c10 = b.c(bArr2, 0);
        long b10 = (long) (b.b(bArr2, 4) << 6);
        long b11 = (long) (b.b(bArr2, 13) << 2);
        long c11 = b.c(bArr2, 16);
        long b12 = (long) (b.b(bArr2, 10) << 3);
        long b13 = (long) (b.b(bArr2, 20) << 7);
        long b14 = (long) (b.b(bArr2, 23) << 5);
        long b15 = (long) ((b.b(bArr2, 29) & 8388607) << 2);
        long j10 = (b15 + 16777216) >> 25;
        long j11 = (19 * j10) + c10;
        long j12 = (b10 + 16777216) >> 25;
        long b16 = ((long) (b.b(bArr2, 7) << 5)) + j12;
        long j13 = b10 - (j12 << 25);
        long j14 = (b12 + 16777216) >> 25;
        long j15 = b11 + j14;
        long j16 = b12 - (j14 << 25);
        long j17 = (c11 + 16777216) >> 25;
        long j18 = b13 + j17;
        long j19 = c11 - (j17 << 25);
        long j20 = (b14 + 16777216) >> 25;
        long b17 = ((long) (b.b(bArr2, 26) << 4)) + j20;
        long j21 = (j11 + 33554432) >> 26;
        long j22 = j13 + j21;
        long j23 = (b16 + 33554432) >> 26;
        long j24 = j16 + j23;
        long j25 = b16 - (j23 << 26);
        long j26 = (j15 + 33554432) >> 26;
        long j27 = j24;
        long j28 = j19 + j26;
        long j29 = j15 - (j26 << 26);
        long j30 = (j18 + 33554432) >> 26;
        long j31 = j28;
        long j32 = (b14 - (j20 << 25)) + j30;
        long j33 = j18 - (j30 << 26);
        long j34 = (b17 + 33554432) >> 26;
        return new a(bVar.f4832a, new int[]{(int) (j11 - (j21 << 26)), (int) j22, (int) j25, (int) j27, (int) j29, (int) j31, (int) j33, (int) j32, (int) (b17 - (j34 << 26)), (int) ((b15 - (j10 << 25)) + j34)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4479u != cVar.f4479u || !this.f4480v.equals(cVar.f4480v)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4480v.hashCode();
    }
}
