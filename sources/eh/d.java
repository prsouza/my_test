package eh;

import java.math.BigInteger;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final a f4838a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4839b;

    public d(a aVar, c cVar) {
        this.f4838a = aVar;
        this.f4839b = cVar;
    }

    public final c a() {
        return this.f4839b;
    }

    public final int b() {
        int b10 = this.f4838a.b();
        int[] iArr = this.f4839b.f4837a;
        return b10 * iArr[iArr.length - 1];
    }

    public final BigInteger c() {
        return this.f4838a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4838a.equals(dVar.f4838a) && this.f4839b.equals(dVar.f4839b);
    }

    public final int hashCode() {
        return this.f4838a.hashCode() ^ Integer.rotateLeft(this.f4839b.hashCode(), 16);
    }
}
