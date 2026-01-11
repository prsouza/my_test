package aj;

import a.b;
import e6.e;
import ze.i;

public final class n implements i {

    /* renamed from: a  reason: collision with root package name */
    public final String f697a;

    /* renamed from: b  reason: collision with root package name */
    public final long f698b;

    /* renamed from: c  reason: collision with root package name */
    public final long f699c;

    /* renamed from: d  reason: collision with root package name */
    public final long f700d;

    /* renamed from: e  reason: collision with root package name */
    public final String f701e;

    /* renamed from: f  reason: collision with root package name */
    public long f702f;

    public n(String str, long j10, long j11, long j12, String str2) {
        e.D(str, "txhash");
        e.D(str2, "tx");
        this.f697a = str;
        this.f698b = j10;
        this.f699c = j11;
        this.f700d = j12;
        this.f701e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return e.r(this.f697a, nVar.f697a) && this.f698b == nVar.f698b && this.f699c == nVar.f699c && this.f700d == nVar.f700d && e.r(this.f701e, nVar.f701e);
    }

    public final int hashCode() {
        long j10 = this.f698b;
        int i = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f699c;
        int i10 = (int) (j11 ^ (j11 >>> 32));
        long j12 = this.f700d;
        int i11 = (int) (j12 ^ (j12 >>> 32));
        return this.f701e.hashCode() + ((i11 + ((i10 + ((i + (this.f697a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = b.q("TxInDbImpl(txhash=");
        q10.append(this.f697a);
        q10.append(", txLastRun=");
        q10.append(this.f698b);
        q10.append(", txExpire=");
        q10.append(this.f699c);
        q10.append(", txGasLeft=");
        q10.append(this.f700d);
        q10.append(", tx=");
        q10.append(this.f701e);
        q10.append(')');
        return q10.toString();
    }
}
