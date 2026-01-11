package ag;

import a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import xh.h;
import yh.c;
import yh.d;

public abstract class o extends s implements p {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f430a;

    public o(byte[] bArr) {
        Objects.requireNonNull(bArr, "'string' cannot be null");
        this.f430a = bArr;
    }

    public static o r(y yVar) {
        if (yVar.f465b) {
            return s(yVar.s());
        }
        throw new IllegalArgumentException("object implicit - explicit expected.");
    }

    public static o s(Object obj) {
        if (obj == null || (obj instanceof o)) {
            return (o) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return s(s.n((byte[]) obj));
            } catch (IOException e10) {
                StringBuilder d10 = a.d("failed to construct OCTET STRING from byte[]: ");
                d10.append(e10.getMessage());
                throw new IllegalArgumentException(d10.toString());
            }
        } else {
            if (obj instanceof d) {
                s d11 = ((d) obj).d();
                if (d11 instanceof o) {
                    return (o) d11;
                }
            }
            StringBuilder d12 = a.d("illegal object in getInstance: ");
            d12.append(obj.getClass().getName());
            throw new IllegalArgumentException(d12.toString());
        }
    }

    public final InputStream b() {
        return new ByteArrayInputStream(this.f430a);
    }

    public final s e() {
        return this;
    }

    public final int hashCode() {
        return xh.a.e(this.f430a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof o)) {
            return false;
        }
        return Arrays.equals(this.f430a, ((o) sVar).f430a);
    }

    public s p() {
        return new w0(this.f430a);
    }

    public s q() {
        return new w0(this.f430a);
    }

    public final String toString() {
        StringBuilder d10 = a.d("#");
        byte[] bArr = this.f430a;
        d dVar = c.f13663a;
        d10.append(h.a(c.b(bArr, bArr.length)));
        return d10.toString();
    }
}
