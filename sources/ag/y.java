package ag;

import a.a;
import java.io.IOException;
import java.util.Objects;

public abstract class y extends s implements q1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f464a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f465b;

    /* renamed from: c  reason: collision with root package name */
    public final d f466c;

    public y(boolean z, int i, d dVar) {
        Objects.requireNonNull(dVar, "'obj' cannot be null");
        this.f464a = i;
        this.f465b = z;
        this.f466c = dVar;
    }

    public static y r(Object obj) {
        if (obj == null || (obj instanceof y)) {
            return (y) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return r(s.n((byte[]) obj));
            } catch (IOException e10) {
                StringBuilder d10 = a.d("failed to construct tagged object from byte[]: ");
                d10.append(e10.getMessage());
                throw new IllegalArgumentException(d10.toString());
            }
        } else {
            StringBuilder d11 = a.d("unknown object in getInstance: ");
            d11.append(obj.getClass().getName());
            throw new IllegalArgumentException(d11.toString());
        }
    }

    public final s e() {
        return this;
    }

    public final int hashCode() {
        return (this.f464a ^ (this.f465b ? 15 : 240)) ^ this.f466c.d().hashCode();
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof y)) {
            return false;
        }
        y yVar = (y) sVar;
        if (this.f464a != yVar.f464a || this.f465b != yVar.f465b) {
            return false;
        }
        s d10 = this.f466c.d();
        s d11 = yVar.f466c.d();
        return d10 == d11 || d10.j(d11);
    }

    public s p() {
        return new d1(this.f465b, this.f464a, this.f466c);
    }

    public s q() {
        return new o1(this.f465b, this.f464a, this.f466c);
    }

    public final s s() {
        return this.f466c.d();
    }

    public final String toString() {
        StringBuilder d10 = a.d("[");
        d10.append(this.f464a);
        d10.append("]");
        d10.append(this.f466c);
        return d10.toString();
    }
}
