package aj;

import a.b;
import b.n;
import e6.e;
import ze.j;

public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    public final String f703a;

    /* renamed from: b  reason: collision with root package name */
    public final n f704b;

    /* renamed from: c  reason: collision with root package name */
    public long f705c;

    public o(String str, n nVar) {
        e.D(str, "txhash");
        this.f703a = str;
        this.f704b = nVar;
    }

    public final n a() {
        return this.f704b;
    }

    public final String b() {
        return this.f703a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return e.r(this.f703a, oVar.f703a) && e.r(this.f704b, oVar.f704b);
    }

    public final int hashCode() {
        return this.f704b.hashCode() + (this.f703a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q10 = b.q("TxTargetsImpl(txhash=");
        q10.append(this.f703a);
        q10.append(", targets=");
        q10.append(this.f704b);
        q10.append(')');
        return q10.toString();
    }
}
