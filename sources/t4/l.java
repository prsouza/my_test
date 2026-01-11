package t4;

import a.a;
import java.util.Arrays;
import java.util.Objects;
import q4.b;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final b f11379a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f11380b;

    public l(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f11379a = bVar;
        this.f11380b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f11379a.equals(lVar.f11379a)) {
            return false;
        }
        return Arrays.equals(this.f11380b, lVar.f11380b);
    }

    public final int hashCode() {
        return ((this.f11379a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11380b);
    }

    public final String toString() {
        StringBuilder d10 = a.d("EncodedPayload{encoding=");
        d10.append(this.f11379a);
        d10.append(", bytes=[...]}");
        return d10.toString();
    }
}
