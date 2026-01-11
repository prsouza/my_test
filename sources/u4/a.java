package u4;

import java.util.Arrays;
import t4.m;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<m> f11689a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f11690b;

    public a(Iterable iterable, byte[] bArr, C0228a aVar) {
        this.f11689a = iterable;
        this.f11690b = bArr;
    }

    public final Iterable<m> a() {
        return this.f11689a;
    }

    public final byte[] b() {
        return this.f11690b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f11689a.equals(fVar.a())) {
            if (Arrays.equals(this.f11690b, fVar instanceof a ? ((a) fVar).f11690b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f11689a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11690b);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("BackendRequest{events=");
        d10.append(this.f11689a);
        d10.append(", extras=");
        d10.append(Arrays.toString(this.f11690b));
        d10.append("}");
        return d10.toString();
    }
}
